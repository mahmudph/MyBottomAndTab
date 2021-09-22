package com.example.mybottomnav.ui.layoutFregment.sessionAdapter


import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.mybottomnav.ui.layoutFregment.HomeTabFragment
import com.example.mybottomnav.ui.layoutFregment.ProfileTabFragment

class SectionsPagerAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
//        var fragment: Fragment? = null
//        when(position) {
//            0 -> fragment = HomeTabFragment()
//            1 -> fragment = ProfileTabFragment()
//        }
//        return fragment as Fragment
        return HomeTabFragment.newInstance(position + 1)
    }
}