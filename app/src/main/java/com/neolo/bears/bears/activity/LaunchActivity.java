package com.neolo.bears.bears.activity;

import android.os.Handler;

import com.neolo.bears.bears.base.BaseActivity;
import com.neolo.bears.bears.utils.SPUtil;
import com.neolo.bears.bears.utils.StartActivityUtil;

/**
 * Created by Neolo on 2017/5/5.
 */

public class LaunchActivity extends BaseActivity {
    private static final String TAG = "LaunchActivity";
    @Override
    protected int getLayoutId() {
        return 0;
    }

    @Override
    protected void setSubView() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //判断是不是第一次启动此应用，第一次启动进入GuideActivity，否则直接进入MainActivity
                if (!SPUtil.getBoolean(SPUtil.SP_IS_FIRST_LOGIN,false)) {
                    StartActivityUtil.startActivity(LaunchActivity.this, GuideActivity.class);
                }else {
                    StartActivityUtil.startActivity(LaunchActivity.this, MainActivity.class);
                }
                finish();
            }
        }, 2 * 1000);
    }

    @Override
    protected void initEvent() {

    }
}
