package com.joaquimverges.demoapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import com.joaquimverges.helium.ui.viewdelegate.PagerViewDelegate

class ViewPagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        PagerViewDelegate(this, MyPageProvider(), viewPagerConfig = {
            it.pageMargin = resources.getDimensionPixelSize(R.dimen.menu_padding)
        }).apply { setContentView(view) }
    }

    class MyPageProvider : PagerViewDelegate.FragmentPageProvider {
        override fun getFragmentAt(position: Int): Fragment {
            return DetailFragment()
        }

        override fun getCount(): Int {
            return 10
        }
    }
}

