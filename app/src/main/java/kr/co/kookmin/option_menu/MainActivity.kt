package kr.co.kookmin.option_menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)


//        menu?.add(Menu.NONE, Menu.FIRST, Menu.NONE, "코드메뉴1")
//        menu?.add(Menu.NONE, Menu.FIRST + 1, Menu.NONE, "코드메뉴2")
//        menu?.add(Menu.NONE, Menu.FIRST + 2, Menu.NONE, "코드메뉴3")
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setContentView(R.layout.activity_main)
        val textView : TextView = findViewById(R.id.textView)
//        when(item.itemId){
//            R.id.item1 -> {
//                textView.text = "111"
//            }
//            R.id.item2 -> {
//                textView.text = "222"
//            }
//            R.id.item3 -> {
//                textView.text = "333"
//            }
//        }

        when(item.itemId){
            Menu.FIRST -> {
            textView.text = "코드메뉴1"
            }
            Menu.FIRST+1 -> {
                textView.text = "코드메뉴2"
            }
            Menu.FIRST+2 -> {
                textView.text = "코드메뉴3"
            }
        }

        return super.onOptionsItemSelected(item)
    }
}