package com.express.flowers.flowersexpress;

import android.app.Activity;
import android.app.Application;

import com.express.flowers.flowersexpress.entity.User;
import com.express.flowers.flowersexpress.widget.SlideFinishLayout;

/**
 * Created by Administrator on 2016/4/28.
 */
public class MyApp extends Application {
    public static User user;
    public static void FinishListener(final Activity activity){
        ((SlideFinishLayout)activity.findViewById(R.id.root_layout)).setFinishListener(new SlideFinishLayout.onSlideFinishListener() {
            @Override
            public void onSlideFinish() {
                activity.finish();
                System.out.println("自行了毁灭acitivity函数");
                //消除Finish的动画
                activity.overridePendingTransition(0, 0);

            }
        });
    }
}
