# pinyin
pinyin kotlin android


### 用法

`val url = "https://sports.163.com/19/0412/21/ECJH8KOQ00058780.html" `  
`val r = Http(url).arg("name","yang").get() `  
`if (r.OK) {`  
`    r.needDecode = false`  
`    println(r.str(Charset.forName("GBK")))`  
`} else {`  
`    println("FAILED")`  
`}`   

