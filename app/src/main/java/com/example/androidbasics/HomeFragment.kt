package com.example.androidbasics

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment(R.layout.fragment_home), View.OnClickListener {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.btnMain)
        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnMain -> onBtnMainClick()
        }
    }

    private fun onBtnMainClick() {
        Toast.makeText(requireContext(), getString(R.string.toast_msg), Toast.LENGTH_SHORT)
            .show()
        //findNavController().navigate(R.id.action_homeFragment_to_detailsFragment)
        findNavController()
            .navigate(HomeFragmentDirections.actionHomeFragmentToDetailsFragment(30))
    }
}