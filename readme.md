springboot-12

ApplicationContextInitializer 是在容器在refush执行的一个回调

步骤

 1.实现ApplicationContextInitializer
 
 2.注册ApplicationContextInitializer
 
 
注册方法

1.app.addInitializers(new MyApplicationContextInitializer());
2.使用application.properties 中context.initializer.classes可配置多个
3.通过spring.factories配置org.springframework.context.ApplicationContextInitializer=com.springboot.spring.MyApplicationContextInitializer 

CommandLineRunable  在容器启动成功后的回调

步骤

  1.实现CommandLineRunner
  
  2.把类注入容器
  
  3.可以使用@order配置执行顺序
  
  
ApplicationRunner和CommandLineRunable区别

    CommandLineRunable是方法的参数不一样使用原生参数 。applicationRunable 进行封装（ApplicationArguments）
 
ApplicationArguments  

    可以对主函数参数进行进一步处理
 
   
  