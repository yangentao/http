package dev.entao.utilapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dev.entao.kan.http.Http
import java.nio.charset.Charset

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val t = Thread {
            val h = Http("https://sports.163.com/19/0412/21/ECJH8KOQ00058780.html")
            val r = h.get()
            if (r.OK) {
                r.needDecode = false
                println(r.str(Charset.forName("GBK")))
            } else {
                println("FAILED")
            }
        }
        t.start()
    }


}
