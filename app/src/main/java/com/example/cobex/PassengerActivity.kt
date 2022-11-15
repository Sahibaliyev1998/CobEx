package com.example.cobex

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class PassengerActivity : Fragment() {
    lateinit var btnCall : Button
    lateinit var btnSorgu : Button
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.activity_passenger, container , false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        btnCall = view.findViewById(R.id.btnCall)
        btnSorgu =view.findViewById(R.id.btnSorgu)
        btnCall.setOnClickListener {


            val i = Intent(Intent.ACTION_DIAL , Uri.parse("tel: +" + "+994555555555"))
            startActivity(i)
        }

        btnSorgu.setOnClickListener {

            Toast.makeText(requireContext(),"Sorgu gonderildi!!" , Toast.LENGTH_LONG).show()
        }
        super.onViewCreated(view, savedInstanceState)
    }




}