package com.huawei.hianalytics.visual;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.visual.autocollect.EventType;
import com.huawei.openalliance.ad.constant.Constants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class b implements Application.ActivityLifecycleCallbacks {
    public static final HashMap e = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f11626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f11627c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f11625a = new AtomicLong(0);
    public String d = "";

    public static void a(long j, long j2, Activity activity) {
        Intent intent;
        if (j + j2 > 1) {
            return;
        }
        long j3 = 0;
        if (j == 0 && j2 == 1) {
            i iVar = h.f11647a;
            iVar.getClass();
            try {
                if (!i0.f11652a.a(activity)) {
                    HiLog.w("AppEnterExitManager", "update jump params failed");
                }
            } catch (Exception unused) {
                HiLog.w("AppEnterExitManager", "failed to put jump params");
            }
            if (activity == null || (intent = activity.getIntent()) == null || !intent.hasExtra("$sessionid") || !intent.hasExtra("$sessiontime")) {
                f1 f1Var = f1.f11642b;
                f1Var.getClass();
                if (!w.a().f()) {
                    f1Var.f11643a = new e1(UUID.randomUUID().toString().replaceAll(Constants.LINK, ""));
                }
            }
            iVar.f11651c = o0.b(activity);
            iVar.d = SystemClock.elapsedRealtime();
            try {
                iVar.f11651c.put("$resume_from_background", iVar.f11649a.get());
                if (!w.a().f()) {
                    if (!w.a().a(EventType.APP_START)) {
                        i1.b(activity, iVar.f11651c);
                        w.a().a("$AppStart", iVar.f11651c);
                    }
                }
            } catch (Exception e2) {
                d0.a(e2, new StringBuilder("fail to report app enter event, ex: "), "AppEnterExitManager");
            }
            iVar.f11649a.set(true);
            return;
        }
        if (j == 1 && j2 == 0) {
            i iVar2 = h.f11647a;
            iVar2.getClass();
            if (w.a().f()) {
                return;
            }
            i1.a(o0.b(activity), iVar2.f11650b);
            i1.b(activity, iVar2.f11650b);
            if (!w.a().a(EventType.APP_END)) {
                try {
                    long jElapsedRealtime = SystemClock.elapsedRealtime() - iVar2.d;
                    if (jElapsedRealtime >= 0 && jElapsedRealtime <= 86400000) {
                        j3 = jElapsedRealtime;
                    }
                    iVar2.f11650b.put("$event_duration", j3);
                    w.a().a("$AppExit", iVar2.f11650b);
                } catch (JSONException e3) {
                    HiLog.w("AppEnterExitManager", "handlerEndAppMessage JSONException e :" + e3.getMessage());
                } catch (Exception e4) {
                    d0.a(e4, new StringBuilder("handlerEndAppMessage Exception, ex: "), "AppEnterExitManager");
                }
            }
            w.a().c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f11627c = new WeakReference(activity);
        if (w.a().f()) {
            return;
        }
        for (g0 g0Var : u.f11699c.a()) {
            g0Var.a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (w.a().f()) {
            return;
        }
        for (g0 g0Var : u.f11699c.a()) {
            g0Var.onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        WeakReference weakReference = this.f11626b;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.d = activity.getClass().getCanonicalName();
        if (w.a().f()) {
            e.remove(Integer.valueOf(activity.hashCode()));
            return;
        }
        for (g0 g0Var : u.f11699c.a()) {
            g0Var.onActivityPaused(activity);
        }
        e.remove(Integer.valueOf(activity.hashCode()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        if (w.a().f()) {
            return;
        }
        for (g0 g0Var : u.f11699c.a()) {
            g0Var.b(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f11626b = new WeakReference(activity);
        this.f11627c = new WeakReference(activity);
        try {
            JSONObject jSONObjectB = o0.b(activity);
            String canonicalName = activity.getClass().getCanonicalName();
            jSONObjectB.put("$current_page", canonicalName);
            jSONObjectB.put("$last_page", o0.f11672a);
            o0.f11672a = canonicalName;
            jSONObjectB.put("activity_onResume_timestamp", SystemClock.elapsedRealtime());
            e.put(Integer.valueOf(activity.hashCode()), jSONObjectB);
        } catch (Exception unused) {
            HiLog.w("ActivityLifecycleListener", "fail to save property when activity oResume");
        }
        if (w.a().f()) {
            return;
        }
        for (g0 g0Var : u.f11699c.a()) {
            g0Var.onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        long j = this.f11625a.get();
        if (j < 0) {
            this.f11625a.set(0L);
            j = 0;
        }
        a(j, this.f11625a.incrementAndGet(), activity);
        if (w.a().f()) {
            return;
        }
        for (g0 g0Var : u.f11699c.a()) {
            g0Var.onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        long j = this.f11625a.get();
        if (j == 0) {
            this.f11625a.set(1L);
            j = 1;
        }
        long jDecrementAndGet = this.f11625a.decrementAndGet();
        if (!w.a().f()) {
            for (g0 g0Var : u.f11699c.a()) {
                g0Var.getClass();
            }
        }
        a(j, jDecrementAndGet, activity);
    }
}
