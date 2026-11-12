package com.garmin.android.apps.connectmobile;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class d1 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static d1 f33126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f33127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static WeakReference<Activity> f33128j = new WeakReference<>(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public cd0.h0 f33133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c1 f33134f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f33129a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f33130b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f33131c = new Handler();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f33132d = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f33135g = false;

    public interface a {
        void a();

        void b();
    }

    public final void a() {
        i2.j("com.garmin.android.apps.connectmobile.d1", "went foreground");
        this.f33129a = true;
        Iterator it = this.f33132d.iterator();
        while (it.hasNext()) {
            try {
                ((a) it.next()).a();
            } catch (Exception e4) {
                i2.i("com.garmin.android.apps.connectmobile.d1", "Listener threw exception: " + e4.getMessage());
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (f33128j.get() == activity) {
            f33128j = new WeakReference<>(null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f33130b = true;
        cd0.h0 h0Var = this.f33133e;
        Handler handler = this.f33131c;
        if (h0Var != null) {
            handler.removeCallbacks(h0Var);
        }
        cd0.h0 h0Var2 = new cd0.h0(this, 4);
        this.f33133e = h0Var2;
        handler.postDelayed(h0Var2, 500L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        f33127i = activity.getLocalClassName();
        f33128j = new WeakReference<>(activity);
        this.f33130b = false;
        boolean z14 = this.f33129a;
        cd0.h0 h0Var = this.f33133e;
        if (h0Var != null) {
            this.f33131c.removeCallbacks(h0Var);
        }
        if (z14) {
            i2.j("com.garmin.android.apps.connectmobile.d1", "still foreground");
            return;
        }
        PowerManager powerManager = (PowerManager) activity.getSystemService("power");
        boolean zIsScreenOn = powerManager != null ? powerManager.isScreenOn() : false;
        KeyguardManager keyguardManager = (KeyguardManager) activity.getSystemService("keyguard");
        boolean zIsKeyguardLocked = keyguardManager != null ? keyguardManager.isKeyguardLocked() : false;
        if (!zIsScreenOn || zIsKeyguardLocked) {
            this.f33135g = true;
        } else {
            a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
