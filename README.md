# PrefUtils
SharedPreferences 存储简单封装实现 
使用地址：https://jitpack.io/#qiangzhouliang/PrefUtil/1.0.2
# 1 如何引入自己的项目
## 1.1 将JitPack存储库添加到您的构建文件中
将其添加到存储库末尾的root（项目） build.gradle中：
~~~
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
~~~
## 1.2 添加依赖项
~~~
dependencies {
	  implementation 'com.github.qiangzhouliang:PrefUtil:1.0.2'
}
~~~
# 2 如何使用
## 2.1 在application中注册
~~~
PrefUtils.init(this)
~~~
## 2.2 在要使用的地方写上如下代码
~~~
PrefUtils.setString("111","123")
println(PrefUtils.getString("111","222"))
~~~
# 3 版本更新说明
## 3.1 1.0.1 版本
封装了string，int，Boolean值的存储
## 3.2 1.0.2 版本
封装了string，int，Boolean值的存储，修改方法，可以使得在java代码中也可以调运


