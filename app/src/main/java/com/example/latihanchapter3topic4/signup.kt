package com.example.latihanchapter3topic4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.latihanchapter3topic4.databinding.FragmentLoginBinding
import com.example.latihanchapter3topic4.databinding.FragmentSignupBinding


class signup : Fragment() {
    lateinit var binding: FragmentSignupBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentSignupBinding.inflate(layoutInflater)
        return inflater.inflate(R.layout.fragment_signup, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.lg.setOnClickListener {
            findNavController().navigate(R.id.action_signup_to_login3)
        }
    }


}