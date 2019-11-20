package com.ht117.authentication.onboard

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.ht117.authentication.R
import com.ht117.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_onboard.*

class OnboardFragment: BaseFragment() {
    override var viewId = R.layout.fragment_onboard

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvText.setOnClickListener {
            findNavController().navigate(R.id.moveToSignName)
        }

    }

}