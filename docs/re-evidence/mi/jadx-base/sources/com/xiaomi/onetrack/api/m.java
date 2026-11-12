package com.xiaomi.onetrack.api;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import com.xiaomi.onetrack.util.DeviceUtil;

/* JADX INFO: loaded from: classes11.dex */
class m implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f13777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f13778b = 0;
    private int c;
    private long d;
    private boolean e;
    private boolean f;

    public m(h hVar) {
        this.f13777a = hVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f13777a.a(activity.getClass().getName(), this.c == System.identityHashCode(activity) ? SystemClock.elapsedRealtime() - this.d : 0L);
        if (com.xiaomi.onetrack.util.p.f13986a) {
            com.xiaomi.onetrack.util.p.a("OneTrackImp", "onActivityPaused:" + activity.getLocalClassName());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.f13777a.d(this.f);
        this.c = System.identityHashCode(activity);
        this.d = SystemClock.elapsedRealtime();
        this.f13777a.a(activity.getClass().getName(), this.e);
        if (com.xiaomi.onetrack.util.p.f13986a) {
            com.xiaomi.onetrack.util.p.a("OneTrackImp", "onActivityResumed:" + activity.getLocalClassName() + " isAppStart:" + this.e);
        }
        this.e = false;
        this.f13777a.d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (this.f13778b == 0) {
            this.f13777a.f13768b.a(1);
            this.e = true;
            this.f = false;
            DeviceUtil.a();
        } else {
            this.e = false;
        }
        this.f13778b++;
        com.xiaomi.onetrack.util.p.a("OneTrackImp", "onActivityStarted: " + activity.getLocalClassName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        int i = this.f13778b - 1;
        this.f13778b = i;
        if (i == 0) {
            this.f13777a.f13768b.a(2);
            this.f13777a.i();
            this.f = true;
            this.e = false;
        } else {
            this.f = false;
        }
        this.f13777a.d(this.f);
        com.xiaomi.onetrack.util.p.a("OneTrackImp", "onActivityStopped: " + activity.getLocalClassName());
    }
}
