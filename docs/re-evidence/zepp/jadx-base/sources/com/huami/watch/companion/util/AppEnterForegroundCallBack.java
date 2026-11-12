package com.huami.watch.companion.util;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.huami.watch.companion.event.AppEnterBackgroundEvent;
import com.huami.watch.companion.event.AppEnterForegroundEvent;
import com.huami.watch.util.Log;
import com.huami.watch.util.RxBus;

/* JADX INFO: loaded from: classes16.dex */
public class AppEnterForegroundCallBack implements Application.ActivityLifecycleCallbacks {
    private static final String e = "ActivityLifecycle";
    private int a = 0;
    private int b = 0;
    private boolean c = false;
    private boolean d = false;

    private void a(Activity activity) {
        if (this.d) {
            return;
        }
        this.d = true;
        this.c = false;
        Log.d(e, "OnEnterBackground : " + activity, new Object[0]);
        RxBus.get().post(new AppEnterBackgroundEvent());
    }

    private void b(Activity activity) {
        if (this.c) {
            return;
        }
        this.c = true;
        this.d = false;
        Log.d(e, "OnEnterForeground : " + activity, new Object[0]);
        RxBus.get().post(new AppEnterForegroundEvent());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.b++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        int i = this.a + 1;
        this.a = i;
        if (i - this.b == 2) {
            this.a = 2;
            this.b = 0;
            b(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.a++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            this.a = 0;
            this.b = 0;
            a(activity);
        }
    }
}
