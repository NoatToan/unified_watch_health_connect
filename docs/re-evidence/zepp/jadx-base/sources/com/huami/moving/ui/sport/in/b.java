package com.huami.moving.ui.sport.in;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b {
    public static boolean a(GPSMainNormalFragment.n _this, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            _this.onStart();
        } else if (action == 1) {
            view.performClick();
            _this.onCancel();
        }
        return true;
    }
}
