# oauth2，搭建一个微服务认证授权服务器



使用内存方式存储oauth2中客户端id和客户端秘钥

![image-1](https://raw.githubusercontent.com/okhurley/oauth2/master/img/1.png)



（授权码模式）

访问（参数要和代码中的一样）

http://localhost:9006/oauth/authorize?client_id=c1&response_type=code&scope=all&redirect_uri=http://www.baidu.com

到登录页面，登录成功后，选择授权

![image-20200507133559701](https://raw.githubusercontent.com/okhurley/oauth2/master/img/2.png)

跳转到百度，code是拿到的授权码

![image-20200507133111075](https://raw.githubusercontent.com/okhurley/oauth2/master/img/3.png)

使用postman，通过code获取token

![image-20200507133834883](https://raw.githubusercontent.com/okhurley/oauth2/master/img/4.png)



（密码模式）

使用postman访问（参数要和代码中的一样）

![image-20200507132718919](https://raw.githubusercontent.com/okhurley/oauth2/master/img/5.png)



