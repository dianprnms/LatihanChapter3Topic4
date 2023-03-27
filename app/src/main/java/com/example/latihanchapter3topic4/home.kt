package com.example.latihanchapter3topic4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.latihanchapter3topic4.databinding.FragmentHomeBinding
import com.example.latihanchapter3topic4.databinding.FragmentLoginBinding

class home : Fragment() {
   lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val getNama = arguments?.getString("NAMA")
        val getPass = arguments?.getString("PASS")
        binding.texthome.setText(getNama)
        binding.textpass.setText(getPass)

        binding.texthome.setOnClickListener {
            findNavController().navigate(R.id.action_home2_to_profile3)
        }
    }
}