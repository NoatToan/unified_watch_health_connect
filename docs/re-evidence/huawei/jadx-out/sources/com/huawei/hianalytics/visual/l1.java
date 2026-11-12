package com.huawei.hianalytics.visual;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes33.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f11659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f11660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap f11661c;
    public final WeakHashMap d;

    public l1(Activity activity, Handler handler) {
        new WeakReference(activity);
        this.f11659a = new o1(handler);
        this.f11660b = new HashMap();
        this.f11661c = new WeakHashMap();
        this.d = new WeakHashMap();
    }

    public final m1 a(View view) {
        WeakHashMap weakHashMap;
        o1 o1Var = (o1) this.f11661c.get(view);
        if (o1Var == null || (weakHashMap = o1Var.f11674b) == null) {
            return null;
        }
        return (m1) weakHashMap.get(view);
    }
}
