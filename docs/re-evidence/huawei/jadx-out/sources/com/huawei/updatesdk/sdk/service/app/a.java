package com.huawei.updatesdk.sdk.service.app;

import android.content.Context;

/* JADX INFO: loaded from: classes20.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f29915b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile a f29916c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f29917a;

    public String b() {
        Context context = this.f29917a;
        return (context == null || context.getFilesDir() == null) ? "" : this.f29917a.getFilesDir().getAbsolutePath();
    }

    public Context a() {
        return this.f29917a;
    }

    public static a c() {
        return f29916c;
    }

    public static void a(Context context) {
        if (f29916c == null) {
            synchronized (f29915b) {
                if (f29916c == null) {
                    f29916c = new a(context);
                }
            }
        }
    }

    private a(Context context) {
        this.f29917a = context.getApplicationContext();
    }
}
