package khan.uz.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.tabs.TabLayoutMediator
import khan.uz.fragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        init()


    }

    private fun init() {
        binding.viewPager.adapter = MyAdapter(this)
        TabLayoutMediator(binding.tab, binding.viewPager,
            TabLayoutMediator.TabConfigurationStrategy { tab, position ->
                Toast.makeText(this, "title $position", Toast.LENGTH_SHORT).show()
            }
        ).attach()


    }

}