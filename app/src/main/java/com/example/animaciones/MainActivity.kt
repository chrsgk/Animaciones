package com.example.animaciones

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.airbnb.lottie.LottieAnimationView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var like = false


        likeImageView.setOnClickListener {
            like = likeAnimation(likeImageView, R.raw.bandai_dokkan, like)
        }

       var like1 = false

       likeImageView1.setOnClickListener {
           like1 = likeAnimation(likeImageView1, R.raw.bandai_dokkan, like1)
       }

        var like2 = false

        likeImageView2.setOnClickListener {
            like2 = likeAnimation(likeImageView2, R.raw.bandai_dokkan, like2)
        }

        var like3 = false

        likeImageView3.setOnClickListener {
            like3 = likeAnimation(likeImageView3, R.raw.bandai_dokkan,like3)
        }
        var like4 = false

        likeImageView4.setOnClickListener {
            like4 = likeAnimation(likeImageView4, R.raw.bandai_dokkan, like4)
        }

        var like5 = false

        likeImageView5.setOnClickListener {
            like5 = likeAnimation(likeImageView5, R.raw.bandai_dokkan, like5)
        }

    }

    private fun likeAnimation(imageView: LottieAnimationView,
                              animation: Int,
                              like: Boolean): Boolean {

        if (!like){
            imageView.setAnimation(animation)
            imageView.repeatCount = 5
            imageView.playAnimation()
        } else{
            imageView.animate()
                     .alpha( 0f)
                     .setDuration(800)
                     .setListener(object: AnimatorListenerAdapter () {
                        override fun onAnimationEnd(animation: Animator) {
                       imageView.setImageResource(R.drawable.twitter_like)
                        imageView.alpha = 1f
                    }
                })
        }

        return !like
    }
    }
