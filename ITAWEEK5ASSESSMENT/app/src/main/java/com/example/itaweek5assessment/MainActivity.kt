package com.example.itaweek5assessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2
    private lateinit var myViewPagerAdapter: MyViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout= findViewById(R.id.tab_layout)
        viewPager2= findViewById(R.id.view_pager)
        myViewPagerAdapter= MyViewPagerAdapter(this)
        viewPager2.adapter = myViewPagerAdapter

        TabLayoutMediator(tabLayout,viewPager2) { tab, position ->
            when (position) {
                0 -> tab.text = "Pictures"
                1 -> tab.text = "Videos"
            }
        }.attach()

        viewPager2.currentItem = 1
    }

}