package com.huawei.hianalytics;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Application.ActivityLifecycleCallbacks {
    public static b d;
    public static ConcurrentHashMap e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f11456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f11457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f11458c;

    public b() {
        HandlerThread handlerThread = new HandlerThread("HA_BACKGROUND_REPORT");
        handlerThread.start();
        this.f11458c = new a(this, handlerThread.getLooper());
        this.f11457b = new HashSet();
        this.f11456a = new AtomicLong(0L);
        e = new ConcurrentHashMap();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        ConcurrentHashMap concurrentHashMap = e;
        if (concurrentHashMap == null || concurrentHashMap.size() <= 0 || activity == null || this.f11457b.contains(Integer.valueOf(activity.hashCode()))) {
            return;
        }
        this.f11457b.add(Integer.valueOf(activity.hashCode()));
        this.f11456a.incrementAndGet();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ConcurrentHashMap concurrentHashMap = e;
        if (concurrentHashMap == null || concurrentHashMap.size() <= 0 || activity == null || !this.f11457b.contains(Integer.valueOf(activity.hashCode())) || this.f11456a.decrementAndGet() > 0) {
            return;
        }
        this.f11458c.sendEmptyMessage(1);
    }
}
