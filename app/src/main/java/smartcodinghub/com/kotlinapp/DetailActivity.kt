package smartcodinghub.com.kotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object {
        val EXTRA_ID = "DetailActivity.Id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val id = intent.getLongExtra(EXTRA_ID, -1)
        val item = getItems().firstOrNull { it.id == id }

        if (item != null) {
            item_title.text = item.title
            item_image.loadUrl(item.url)
        }

    }
}
