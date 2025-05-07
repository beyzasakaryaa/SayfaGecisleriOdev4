package com.example.navigationcomponentsayfagecisleriodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentsayfagecisleriodev4.databinding.FragmentAnasayfaBinding

class anasayfaFragment : Fragment() {

    private lateinit var binding :  FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.buttonGitA.setOnClickListener {
            val action = anasayfaFragmentDirections.anasayfaSayfaAGecis()
            Navigation.findNavController(it).navigate(action)
        }

        binding.buttonGitX.setOnClickListener {
            val gecis = anasayfaFragmentDirections.anasayfaSayfaXGecis()
            Navigation.findNavController(it).navigate(gecis)
        }


        return binding.root
    }
}