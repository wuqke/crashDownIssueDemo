
#
### To reproduce this issue you need to：
# 
### install and run zookeeper 3.4.6
#
### change the logback log dir to your own dir  change file dir: src/main/resources/logback.xml
#
### mvn -Dmaven.test.skip=true clean package
# 
### java -jar -Ddubbo.application.logger=slf4j crashdown_service.jar &
# 
### wait and see logs:(maybe 1min ,maybe 1 or 2 hour,and it always happens)
#
```
2018-08-09 14:44:08.381 [main] INFO  com.alibaba.dubbo.container.Main -  [DUBBO] Dubbo SpringContainer started!, dubbo version: 2.6.2, current host: 172.20.10.5

2018-08-09 14:45:09.573 [DubboShutdownHook] INFO  com.alibaba.dubbo.config.AbstractConfig -  [DUBBO] Run shutdown hook now., dubbo version: 2.6.2, current host: 172.20.10.5
2018-08-09 14:45:09.574 [DubboShutdownHook] INFO  c.a.dubbo.registry.support.AbstractRegistryFactory -  [DUBBO] Close all registries [zookeeper://127.0.0.1:2181/com.alibaba.dubbo.registry.RegistryService?application=crashdown_provider&dubbo=2.6.2&interface=com.alibaba.dubbo.registry.RegistryService&logger=slf4j&pid=3404&timestamp=1533797047515], dubbo version: 2.6.2, current host: 172.20.10.5
2018-08-09 14:45:09.574 [DubboShutdownHook] INFO  c.a.dubbo.registry.zookeeper.ZookeeperRegistry -  [DUBBO] Destroy registry:zookeeper://127.0.0.1:2181/com.alibaba.dubbo.registry.RegistryService?application=crashdown_provider&dubbo=2.6.2&interface=com.alibaba.dubbo.registry.RegistryService&logger=slf4j&pid=3404&timestamp=1533797047515, dubbo version: 2.6.2, current host: 172.20.10.5

```
#
#
#
#