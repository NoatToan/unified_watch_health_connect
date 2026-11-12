package com.xmlywind.windad;

import android.app.Activity;

/* JADX INFO: loaded from: classes22.dex */
public interface LifecycleListener {
    void onCreate(Activity activity);

    void onDestroy(Activity activity);

    void onPause(Activity activity);

    void onResume(Activity activity);

    void onStart(Activity activity);

    void onStop(Activity activity);
}
