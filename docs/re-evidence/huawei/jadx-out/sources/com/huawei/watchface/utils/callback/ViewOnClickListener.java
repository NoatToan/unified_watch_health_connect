package com.huawei.watchface.utils.callback;

import android.view.View;

/* JADX INFO: loaded from: classes45.dex */
public abstract class ViewOnClickListener implements View.OnClickListener {
    private static final int MIN_CLICK_DELAY_TIME = 500;
    private static final String TAG = "ViewOnClickListener";
    private static long lastClickTime;

    public static boolean isSeriesClick() {
        return isSeriesClick(500);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (isSeriesClick()) {
            return;
        }
        onMultiClick(view);
    }

    public abstract void onMultiClick(View view);

    public static boolean isSeriesClick(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - lastClickTime) < i) {
            return true;
        }
        lastClickTime = jCurrentTimeMillis;
        return false;
    }
}
