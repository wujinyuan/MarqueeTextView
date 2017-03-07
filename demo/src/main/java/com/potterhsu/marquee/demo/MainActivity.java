package com.potterhsu.marquee.demo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.potterhsu.marqueetextview.MarqueeTextFragment;

public class MainActivity extends Activity {

    private MarqueeTextFragment marqueeTextFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        marqueeTextFragment = new MarqueeTextFragment();
        marqueeTextFragment.setMarqueeInfo(
                new MarqueeTextFragment.MarqueeInfo("This is a good day, 歡迎光臨！", Color.BLUE, 0.5f)
        );
        getFragmentManager().beginTransaction()
                .replace(R.id.layoutMarquee, marqueeTextFragment)
                .commit();
    }

    public void OnBtnStartClick(View view) {
        marqueeTextFragment.startMarquee();
    }

    public void OnBtnStopClick(View view) {
        marqueeTextFragment.stopMarquee();
    }
}
