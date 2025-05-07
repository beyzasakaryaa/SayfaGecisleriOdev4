package com.example.navigationcomponentsayfagecisleriodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponentsayfagecisleriodev4.databinding.FragmentSayfaXBinding

class sayfaXFragment : Fragment() {

    private lateinit var binding: FragmentSayfaXBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSayfaXBinding.inflate(inflater, container, false)

        binding.buttonGitY2.setOnClickListener {
            val action = sayfaXFragmentDirections.sayfaXsayfaYGecis()
            Navigation.findNavController(it).navigate(action)
        }

        return binding.root
    }
}