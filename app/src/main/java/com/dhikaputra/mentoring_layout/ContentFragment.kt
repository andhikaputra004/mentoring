package com.dhikaputra.mentoring_layout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.dhikaputra.mentoring_layout.databinding.ContentFragmentBinding

class ContentFragment : Fragment() {

    private var _binding: ContentFragmentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = ContentFragmentBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            textLabel.setOnClickListener {
                findNavController().navigate(R.id.action_contentFragment_to_textViewFragment)
            }

            editText.setOnClickListener {
                findNavController().navigate(R.id.action_contentFragment_to_editTextFragment)
            }
            buttonText.setOnClickListener {
                findNavController().navigate(R.id.action_contentFragment_to_buttonFragment)
            }
            imageView.setOnClickListener {
                findNavController().navigate(R.id.action_contentFragment_to_imageViewFragment)
            }
            linearLayout.setOnClickListener {
                findNavController().navigate(R.id.action_contentFragment_to_linearLayoutFragment)
            }

            relativeLayout.setOnClickListener {
                findNavController().navigate(R.id.action_contentFragment_to_relativeLayoutFragment)
            }

            constraintLayout.setOnClickListener {
                findNavController().navigate(R.id.action_contentFragment_to_constraintLayoutFragment)
            }

            frameLayout.setOnClickListener {
                findNavController().navigate(R.id.action_contentFragment_to_frameLayoutFragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}