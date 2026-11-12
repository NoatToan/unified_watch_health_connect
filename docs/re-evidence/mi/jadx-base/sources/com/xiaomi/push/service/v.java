package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.react.bridge.BaseJavaModule;
import defpackage.dct;
import defpackage.k5s;
import defpackage.obs;
import defpackage.q7s;
import defpackage.s4s;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class v implements q7s {
    public static volatile v f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f14263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f14264b;
    public volatile boolean c = false;
    public ConcurrentHashMap<String, a> d = new ConcurrentHashMap<>();
    public Context e;

    public static abstract class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f14265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f14266b;

        public a(String str, long j) {
            this.f14265a = str;
            this.f14266b = j;
        }

        public abstract void a(v vVar);

        @Override // java.lang.Runnable
        public void run() {
            if (v.f != null) {
                Context context = v.f.e;
                if (obs.x(context)) {
                    if (System.currentTimeMillis() - v.f.f14263a.getLong(":ts-" + this.f14265a, 0L) > this.f14266b || s4s.b(context)) {
                        dct.a(v.f.f14263a.edit().putLong(":ts-" + this.f14265a, System.currentTimeMillis()));
                        a(v.f);
                    }
                }
            }
        }
    }

    public v(Context context) {
        this.e = context.getApplicationContext();
        this.f14263a = context.getSharedPreferences(BaseJavaModule.METHOD_TYPE_SYNC, 0);
    }

    public static v c(Context context) {
        if (f == null) {
            synchronized (v.class) {
                try {
                    if (f == null) {
                        f = new v(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public String d(String str, String str2) {
        return this.f14263a.getString(str + ":" + str2, "");
    }

    public void f(a aVar) {
        if (this.d.putIfAbsent(aVar.f14265a, aVar) == null) {
            k5s.a(this.e).h(aVar, ((int) (Math.random() * 30.0d)) + 10);
        }
    }

    public void g(String str, String str2, String str3) {
        dct.a(f.f14263a.edit().putString(str + ":" + str2, str3));
    }

    @Override // defpackage.q7s
    public void a() {
        if (this.c) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f14264b < 3600000) {
            return;
        }
        this.f14264b = jCurrentTimeMillis;
        this.c = true;
        k5s.a(this.e).h(new w(this), (int) (Math.random() * 10.0d));
    }
}
