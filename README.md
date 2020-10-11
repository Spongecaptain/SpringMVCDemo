# README

这是一个简单的 Spring MVC 项目，基于 Maven Archtype Webapp 创建。

注意目录结构：架包下的代码、webapp、resources 目录之间的关系如下：

```
├─src
│  └─main
│      ├─java
│      │  └─cool
│      │      └─spongecaptain
│      │          └─controller
│      ├─resources
│      └─webapp
│          └─WEB-INF
```
- src/main/java 目录存放项目源代码，其中以 groupId + artifactId 来给类规定 package 包
- src/main/resources 目录存放 Spring 相关的 XML 配置文件
- src/main/webapp 目录存放 Servlet 容器（例如 Tomcat）的 XML 配置文件以及 web 资源（例如 *.jsp 文件）


