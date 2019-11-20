package com.ht117.authentication.otp

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.ht117.authentication.R
import com.ht117.base.BaseFragment
import com.ht117.base.Constants
import kotlinx.android.synthetic.main.fragment_onboard.*

class OtpFragment: BaseFragment() {
    override var viewId = R.layout.fragment_otp

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvText.setOnClickListener {
            context!!.getSharedPreferences("Demo", Context.MODE_PRIVATE)
                .edit()
                .putBoolean(Constants.KEY_AUTHORIZE, true)
                .commit()
            findNavController().navigate(Uri.parse("chatq://home"))
        }
    }

}