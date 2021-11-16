package com.example.project1.accountTest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.project1.R

class AccountTestFragment : Fragment() {
    private lateinit var button: Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.account_test_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        click(view)
    }

    private fun click(view: View) {
        button = view.findViewById(R.id.buttonResult)
        val tvText = view.findViewById<TextView>(R.id.textView3)
        val edtext = view.findViewById<EditText>(R.id.edText)
        val edtextPassword = view.findViewById<EditText>(R.id.edTextPassword)
        val image = view.findViewById<ImageView>(R.id.imageView)
        button.setOnClickListener {
            val resultValue = edtext.text.toString()
//            val resultValue = edtext.text.toString().toInt()
            when (resultValue) {

                Const.FIRST_NAME -> {
                    tvText.visibility = View.VISIBLE
                    if (edtextPassword.text.toString() == Const.FIRST_PARAM_PASSWORD) {
                        tvText.text = Const.FIRST_NAME_SIGN_UP

                        image.visibility = View.VISIBLE
                        image.setImageResource(R.drawable.face_first)
                    } else {
                        tvText.text = Const.WRONG_PASSWORD
                        image.visibility = View.INVISIBLE
                    }
                }


                Const.SECOND_NAME -> {
                    tvText.visibility = View.VISIBLE
                    if (edtextPassword.text.toString() == Const.SECOND_PARAM_PASSWORD) {
                        tvText.text = Const.SECOND_NAME_SIGN_UP
                        image.visibility = View.VISIBLE
                        image.setImageResource(R.drawable.face_second)
                    } else {
                        tvText.text = Const.WRONG_PASSWORD
                        image.visibility = View.INVISIBLE
                    }
                }


                else -> {
                    tvText.visibility = View.VISIBLE
//                    tvText.text = Const.THIRD_PARAM
                    val name = edtext.text.toString()
                    tvText.text = "$name ${Const.ACCOUNT_NOT_FOUND}"
                    image.visibility = View.INVISIBLE
                }


//                in 0..1000 -> {
//                    tvText.visibility = View.VISIBLE
//                    tvText.text = Const.FIRST_PARAM
//
//                }
//                in 1001..100000 -> {
//                    tvText.visibility = View.VISIBLE
//                    tvText.text = Const.SECOND_PARAM
//                }
//                    else -> {
//                        tvText.visibility = View.VISIBLE
//                        tvText.text = Const.THIRD_PARAM
//                    }

            }
        }
    }
}

