package com.xiaomi.smarthome.miui10;

import android.app.Activity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityControl {
    private static final String TAG = "ActivityControl";
    private final Activity mActivity;
    private boolean mFinish;
    private boolean mShow;

    public ActivityControl(Activity activity) {
        this.mActivity = activity;
    }

    private void doFinish() {
        Activity activity;
        if (this.mShow || !this.mFinish || (activity = this.mActivity) == null || activity.isFinishing()) {
            return;
        }
        final Activity activity2 = this.mActivity;
        Objects.requireNonNull(activity2);
        activity2.runOnUiThread(new Runnable() { // from class: ki0
            @Override // java.lang.Runnable
            public final void run() {
                activity2.finish();
            }
        });
    }

    public void finish() {
        this.mFinish = true;
        MiJiaLog.onlyLogcat(TAG, "finish");
        doFinish();
    }

    public void onPause() {
        this.mShow = false;
        MiJiaLog.onlyLogcat(TAG, LifecycleConstantKt.ON_STOP);
        doFinish();
    }

    public void onResume() {
        this.mShow = true;
    }
}
