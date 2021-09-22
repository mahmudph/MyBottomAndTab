package com.example.mybottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.StringRes
import androidx.viewpager2.widget.ViewPager2
import com.example.mybottomnav.ui.layoutFregment.sessionAdapter.SectionsPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class TabLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)

        val sectionsPagerAdapter = SectionsPagerAdapter(this)
        val viewPage: ViewPager2 =  findViewById(R.id.view_pager)
        viewPage.adapter = sectionsPagerAdapter

        val tab: TabLayout = findViewById(R.id.tabs)

        TabLayoutMediator(tab, viewPage) { tab, position ->
            tab.text = resources.getString(TAB_ID[position])
        }.attach()

        supportActionBar?.elevation = 0f
    }
    companion object {
        @StringRes
        private val TAB_ID = intArrayOf(
            R.string.tab_text_1,
            R.string.tab_text_2,
            R.string.tab_text_3,
            R.string.click_me
        )
    }
}