package com.example.navigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationexample.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {


    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding= FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnGoTo2.setOnClickListener {
            findNavController().navigate(R.id.navigateToSecondFragment)
        }
        binding.btnGoTo3.setOnClickListener {
            findNavController().navigate(R.id.navigateToThirdFragment)
        }
    }
}