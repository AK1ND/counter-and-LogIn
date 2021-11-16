package com.example.project1.counter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.project1.R

class CounterFragment : Fragment() {

    private lateinit var buttonNextFragment: Button
    private lateinit var buttonPlus: Button
    private lateinit var buttonMinus: Button
    private lateinit var buttonReset: Button
    private var counter = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.counter_fragment, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


//        changeFragment(view)
        countFragment(view)

    }


    private fun countFragment(view: View) {
        //init
        buttonMinus = view.findViewById(R.id.buttonMinus)
        buttonPlus = view.findViewById(R.id.buttonPlus)
        buttonReset = view.findViewById(R.id.buttonReset)


        //textView
        val tvText = view.findViewById<TextView>(R.id.textView)
        val buttonTextMinus = view.findViewById<Button>(R.id.buttonMinus)
        val buttonTextPlus = view.findViewById<Button>(R.id.buttonPlus)


        buttonMinus.setOnClickListener {
            tvText.text = counter.toString()
            counter--
            tvText.text = counter.toString()

            if (counter == -10) {


                buttonReset.visibility = View.VISIBLE
                buttonReset.setOnClickListener {
                    counter = 0
                    tvText.text = counter.toString()


                    buttonPlus.visibility = View.VISIBLE
                    buttonTextMinus.visibility = View.VISIBLE
                    buttonReset.visibility = View.GONE
                }
                buttonTextMinus.visibility = View.GONE
                buttonTextPlus.visibility = View.GONE


            }


        }

        buttonPlus.setOnClickListener {

            tvText.text = counter.toString()
            counter++
            tvText.text = counter.toString()

            if (counter == 10) {

                buttonReset.visibility = View.VISIBLE
                buttonReset.setOnClickListener {
                    counter = 0
                    tvText.text = counter.toString()


                    buttonPlus.visibility = View.VISIBLE
                    buttonTextMinus.visibility = View.VISIBLE
                    buttonReset.visibility = View.GONE
                }

                buttonTextMinus.visibility = View.GONE
                buttonTextPlus.visibility = View.GONE

            }
        }
    }


//    private fun changeFragment(view: View) {
//
//        buttonNextFragment = view.findViewById(R.id.buttonNextFragment)
//        buttonNextFragment.setOnClickListener {
//
//
//            view.findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
//
//        }
//    }


}