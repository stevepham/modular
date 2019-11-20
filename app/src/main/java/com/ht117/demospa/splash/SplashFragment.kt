package com.ht117.demospa.splash

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.navigation.fragment.findNavController
import com.ht117.base.BaseFragment
import com.ht117.base.Constants
import com.ht117.demospa.R

class SplashFragment: BaseFragment() {

    override var viewId = R.layout.fragment_splash

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val isAuthorize = context!!.getSharedPreferences("Demo", Context.MODE_PRIVATE)
            .getBoolean(Constants.KEY_AUTHORIZE, false)

        val navController = findNavController()

        Handler().postDelayed({
            if (isAuthorize) {
                navController.navigate(R.id.chat_nav_graph)
            } else {
                navController.navigate(R.id.authen_nav_graph)
            }
        }, 2500L)
    }

}