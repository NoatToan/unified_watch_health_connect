package com.huawei.hianalytics.visual;

import android.app.Activity;
import android.app.Application;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes33.dex */
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f11699c = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11700a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile b f11701b = null;

    public final void a(Application application) {
        synchronized (this) {
            if (this.f11701b == null) {
                this.f11701b = new b();
                application.registerActivityLifecycleCallbacks(this.f11701b);
            }
        }
    }

    public final Activity b() {
        WeakReference weakReference;
        if (this.f11701b == null || (weakReference = this.f11701b.f11627c) == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public final Activity c() {
        WeakReference weakReference;
        if (this.f11701b == null || (weakReference = this.f11701b.f11626b) == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public final g0[] a() {
        g0[] g0VarArr;
        synchronized (this.f11700a) {
            g0VarArr = (g0[]) this.f11700a.toArray(new g0[0]);
        }
        return g0VarArr;
    }

    public final void a(g0 g0Var) {
        if (g0Var == null) {
            return;
        }
        synchronized (this.f11700a) {
            this.f11700a.add(g0Var);
        }
    }
}
