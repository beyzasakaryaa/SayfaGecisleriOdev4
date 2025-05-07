package com.example.navigationcomponentsayfagecisleriodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentsayfagecisleriodev4.databinding.FragmentSayfaABinding

class sayfaAFragment : Fragment() {

    private lateinit var binding : FragmentSayfaABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaABinding.inflate(inflater, container, false)

        binding.buttonGitB.setOnClickListener {
            val action = sayfaAFragmentDirections.sayfaAsayfaBGecis()
            Navigation.findNavController(it).navigate(action)
        }

        return binding.root
    }
}