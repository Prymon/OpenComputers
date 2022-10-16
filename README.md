# open computers
> 打包方式：打tag

## 1. 环境调整记录
> gt5的依赖改成了我自己的仓库com.github.Prymon:GT5-Unofficial:v1.0.0-alpha

> 如果要在本地调试，且加入GT联动，需要添加如下jar到 run/mods/目录下
```shell
# 是的我知道很多，放就完了 ：P
chisel-1.7.10-2.10.16-GTNH.jar
gregtech-1.7.10-dev-test-1.0-4-ga9b8f93.dirty-dev.jar
gtnhlib-1.7.10-0.0.5.jar
industrialcraft-2-2.2.828a-experimental.jar
structurelib-1.7.10-1.2.0-beta.2.jar
Waila-1.7.10-1.5.22.jar
1.7.10/
  CodeChickenLib-1.7.10-1.1.5.5.jar
  MrTJPCore-1.1.0.33-universal.jar
ic2/
  EJML-core-0.26.jar
  
# build.gradle 我加了 set DEFAULT_JVM_OPTS="-Xmx8G" "-Xms128m" "-Dfile.encoding=utf-8" 不知道有没有用，可能没用吧
```


## 2. 修改记录

## v1.0.0-alpha 2022年10月16日18:25:41 增加GT小机器支持