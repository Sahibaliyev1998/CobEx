package com.example.cobex

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       /* Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(requireContext()  , PassengerActivity::class.java))
        },5000)*/

        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

}