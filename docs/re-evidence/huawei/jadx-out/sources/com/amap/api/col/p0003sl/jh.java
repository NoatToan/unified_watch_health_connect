package com.amap.api.col.p0003sl;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class jh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static jh f2880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f2881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f2882c = jo.a(iy.c("RYW1hcF9kZXZpY2VfYWRpdQ"));

    private jh(Context context) {
        this.f2881b = context.getApplicationContext();
    }

    public static jh a(Context context) {
        if (f2880a == null) {
            synchronized (jh.class) {
                if (f2880a == null) {
                    f2880a = new jh(context);
                }
            }
        }
        return f2880a;
    }

    public final void a() {
        synchronized (this) {
            try {
                if (ip.c() == null) {
                    ip.a(jl.a());
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(String str) {
        ji.a(this.f2881b).a(this.f2882c);
        ji.a(this.f2881b).b(str);
    }
}
