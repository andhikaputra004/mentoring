package com.dhikaputra.mentoring_layout.module_4.viewgroup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.dhikaputra.mentoring_layout.databinding.FragmentLinearLayoutBinding
import com.dhikaputra.mentoring_layout.databinding.FragmentRelativeLayoutBinding

class RelativeLayoutFragment : Fragment() {

    private var _binding: FragmentRelativeLayoutBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentRelativeLayoutBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}