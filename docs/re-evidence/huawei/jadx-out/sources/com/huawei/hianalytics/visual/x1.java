package com.huawei.hianalytics.visual;

import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;

/* JADX INFO: loaded from: classes33.dex */
public final class x1 {
    public static x1 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LruCache f11713a = new LruCache(128);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LruCache f11714b = new LruCache(128);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LruCache f11715c = new LruCache(128);

    public static x1 a() {
        x1 x1Var;
        synchronized (x1.class) {
            if (d == null) {
                d = new x1();
            }
            x1Var = d;
        }
        return x1Var;
    }

    public final String b(Class cls) {
        String strValueOf = String.valueOf(cls.hashCode());
        String str = (String) this.f11715c.get(strValueOf);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String simpleName = cls.getSimpleName();
        if (TextUtils.isEmpty(simpleName)) {
            simpleName = "NA";
        }
        this.f11715c.put(strValueOf, simpleName);
        return simpleName;
    }

    public final String a(Class cls) {
        String strValueOf = String.valueOf(cls.hashCode());
        String str = (String) this.f11714b.get(strValueOf);
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String canonicalName = cls.getCanonicalName();
        if (TextUtils.isEmpty(canonicalName)) {
            canonicalName = "NA";
        }
        this.f11714b.put(strValueOf, canonicalName);
        return canonicalName;
    }

    public final void a(View view, String str) {
        if (view == null || TextUtils.isEmpty(str)) {
            return;
        }
        String strValueOf = String.valueOf(view.hashCode());
        w1 w1Var = (w1) this.f11713a.get(strValueOf);
        if (w1Var == null) {
            w1Var = new w1();
        }
        this.f11713a.put(strValueOf, w1Var);
    }
}
