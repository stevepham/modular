package com.ht117.authentication.signupmobile

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.ht117.authentication.R
import com.ht117.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_onboard.*

class SignupMobileFragment: BaseFragment() {
    override var viewId = R.layout.fragment_signup_mobile

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvText.setOnClickListener {
            findNavController().navigate(R.id.moveToOtp)
        }
    }

}