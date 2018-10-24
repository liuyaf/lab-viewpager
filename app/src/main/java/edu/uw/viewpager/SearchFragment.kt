package edu.uw.viewpager


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * A simple [Fragment] subclass.
 */
class SearchFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val rootView = inflater!!.inflate(R.layout.movie_detail, container, false)

        val args = arguments
        if (args != null) {

            val titleView = rootView.findViewById<View>(R.id.txt_movie_title) as TextView

            val urlView = rootView.findViewById<View>(R.id.txt_movie_url) as TextView


            val descView = rootView.findViewById<View>(R.id.txt_movie_description) as TextView

        }

        return rootView
    }

    companion object {

        fun newInstance(movie: Movie): SearchFragment {

            val args = Bundle()

            val fragment = SearchFragment()
            fragment.arguments = args
            return fragment
        }
    }

}// Required empty public constructor
