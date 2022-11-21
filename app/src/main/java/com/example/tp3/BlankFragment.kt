package com.example.tp3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

private const val IS_DIGITAL = "digitalOK"

class BlankFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var digitalClock = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            digitalClock = it.getBoolean(IS_DIGITAL)
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return if (!digitalClock)
            inflater.inflate(R.layout.numeric_fragment, container, false)
        else
            inflater.inflate(R.layout.fragment_blank, container, false)
    }
}