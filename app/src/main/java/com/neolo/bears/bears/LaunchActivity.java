package com.neolo.bears.bears;

import android.content.Intent;
import android.os.Handler;

import com.neolo.bears.bears.base.BaseActivity;

/**
 * Created by Neolo on 2017/5/5.
 */

public class LaunchActivity extends BaseActivity {
    @Override
    protected int getLayoutId() {
        return 0;
    }

    @Override
    protected void setSubView() {
        //添加一个两秒的计时器
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(LaunchActivity.this,GuideActivity.class);
                startActivity(intent);
            }
        },2 * 2000);
    }

    @Override
    protected void initEvent() {

    }
}
