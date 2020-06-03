package com.example.usermanagement

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_user.*


class UserFragment : Fragment() {

    companion object {
        fun newInstance() = UserFragment()
    }

  //  private lateinit var viewModel: UserViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_user, container, false)
    }

    override fun onStart() {
        super.onStart()
        other_user.setOnClickListener(

            Navigation.createNavigateOnClickListener(R.id.action_UserFragment_to_loginFragment)
        )
    }


//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        viewModel = ViewModelProviders.of(this).get(UserViewModel::class.java)
//        // TODO: Use the ViewModel
//    }


}
