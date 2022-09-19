package com.example.itaweek5assessment

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyViewPagerAdapter(fragment: MainActivity) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> PictureFragment()
            1 -> VideoFragment()
            else -> PictureFragment()
        }
    }
}