package com.example.latihanchapter3topic4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.latihanchapter3topic4.databinding.FragmentLoginBinding

class login : Fragment() {
  lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentLoginBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btn1.setOnClickListener{
            val name = binding.username.text.toString()
            val bund = Bundle()
            val pass = binding.password.text.toString()
            bund.putString("NAMA", name)
            bund.putString("PASS", pass)
            findNavController().navigate(R.id.action_login_to_home23, bund)

        }

        binding.su.setOnClickListener {
            findNavController().navigate(R.id.action_login_to_signup)
        }
    }

}