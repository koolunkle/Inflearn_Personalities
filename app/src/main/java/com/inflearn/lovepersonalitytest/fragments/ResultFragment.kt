package com.inflearn.lovepersonalitytest.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.inflearn.lovepersonalitytest.R
import kotlinx.android.synthetic.main.fragment_result.*

class ResultFragment : Fragment() {

    lateinit var navController: NavController

    var option = -1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        option = arguments?.getInt("index") ?: -1
        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        imgHome.setOnClickListener {
            navController.navigate(R.id.action_resultFragment_to_mainFragment)
        }

        setResult(option)

    }

    fun setResult(option: Int) {

        when (option) {
            1 -> {
                txtMain.text = "You are a Quitter"
                txtSub.text = "You can let the person easily"
            }
            2 -> {
                txtMain.text = "You should focus on yourself"
                txtSub.text = "You become really clingy to your ex"
            }
            3 -> {
                txtMain.text = "You should take it easy"
                txtSub.text = "You can do crazy things\nno matter what it takes"
            }
            4 -> {
                txtMain.text = "You are pretty mature"
                txtSub.text = "You can easily accept the break-up"
            }
        }

    }

}