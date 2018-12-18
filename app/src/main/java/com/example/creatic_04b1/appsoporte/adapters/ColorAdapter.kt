package com.example.creatic_04b1.appsoporte.adapters

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.creatic_04b1.appsoporte.ColorFragment
import com.example.creatic_04b1.appsoporte.R

class ColorAdapter(context: Context, fm:FragmentManager): FragmentPagerAdapter(fm){

    var names:Array<String> = emptyArray()

    init{
        names= context.resources.getStringArray(R.array.color_names)
    }

    override fun getItem(position: Int): Fragment = ColorFragment.instance(position)

    override fun getCount(): Int= names.size

    override fun getPageTitle(position: Int): CharSequence? = names[position]

}