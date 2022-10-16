package li.cil.oc.integration.gregtech;

import gregtech.api.interfaces.tileentity.IBasicMachineOcAdaptor;
import li.cil.oc.api.machine.Arguments;
import li.cil.oc.api.machine.Callback;
import li.cil.oc.api.machine.Context;
import li.cil.oc.api.network.ManagedEnvironment;
import li.cil.oc.api.prefab.DriverSidedTileEntity;
import li.cil.oc.integration.ManagedTileEntityEnvironment;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

/**
 * @author prymon
 */
public final class DriverBasicMachine extends DriverSidedTileEntity {
    @Override
    public Class<?> getTileEntityClass() {
        return IBasicMachineOcAdaptor.class;
    }

    @Override
    public ManagedEnvironment createEnvironment(
            final World world, final int x, final int y, final int z, final ForgeDirection side) {
        return new Environment((IBasicMachineOcAdaptor) world.getTileEntity(x, y, z));
    }

    public static final class Environment extends ManagedTileEntityEnvironment<IBasicMachineOcAdaptor> {
        public Environment(final IBasicMachineOcAdaptor tileEntity) {
            super(tileEntity, "gt_basicMachine");
        }

        @Callback(doc = "function():number --  try to pop up all the items in input slot")
        public Object[] popUpAllInputSlot(final Context context, final Arguments args) {
            tileEntity.popUpAllInputSlot();
            return new Object[]{0};
        }

        @Callback(doc = "function(slot:number, popSide:number):number --  pop items in slot, slot(5,6,7..), sides:(D,T,N,S,W,E=[0-5])")
        public Object[] popUpSlot(final Context context, final Arguments args) {
            int slot = args.checkInteger(0);
            byte outputSide = (byte) args.checkInteger(1);
            tileEntity.popUpSlot(slot, outputSide);
            return new Object[]{0};
        }
    }
}
