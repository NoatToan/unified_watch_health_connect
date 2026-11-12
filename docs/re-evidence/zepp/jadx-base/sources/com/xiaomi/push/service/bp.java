package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes22.dex */
public final class bp implements ak {
    private static volatile bp f;
    private SharedPreferences a;
    private long b;
    private volatile boolean c = false;
    private ConcurrentHashMap<String, a> d = new ConcurrentHashMap<>();
    public Context e;

    public static abstract class a implements Runnable {
        public String a;
        public long b;

        public a(String str, long j) {
            this.a = str;
            this.b = j;
        }

        public abstract void a(bp bpVar);

        @Override // java.lang.Runnable
        public void run() {
            if (bp.f != null) {
                Context context = bp.f.e;
                if (com.xiaomi.push.y.c(context)) {
                    if (System.currentTimeMillis() - bp.f.a.getLong(":ts-" + this.a, 0L) > this.b || com.xiaomi.push.m.a(context)) {
                        com.xiaomi.channel.commonutils.android.i.a(bp.f.a.edit().putLong(":ts-" + this.a, System.currentTimeMillis()));
                        a(bp.f);
                    }
                }
            }
        }
    }

    private bp(Context context) {
        this.e = context.getApplicationContext();
        this.a = context.getSharedPreferences("sync", 0);
    }

    public static bp a(Context context) {
        if (f == null) {
            synchronized (bp.class) {
                if (f == null) {
                    f = new bp(context);
                }
            }
        }
        return f;
    }

    public String a(String str, String str2) {
        return this.a.getString(str + ":" + str2, "");
    }

    @Override // com.xiaomi.push.service.ak
    public void a() {
        if (this.c) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.b < 3600000) {
            return;
        }
        this.b = jCurrentTimeMillis;
        this.c = true;
        com.xiaomi.push.o.a(this.e).a(new h0(this), (int) (Math.random() * 10.0d));
    }

    public void a(a aVar) {
        if (this.d.putIfAbsent(aVar.a, aVar) == null) {
            com.xiaomi.push.o.a(this.e).a(aVar, ((int) (Math.random() * 30.0d)) + 10);
        }
    }

    public void a(String str, String str2, String str3) {
        com.xiaomi.channel.commonutils.android.i.a(f.a.edit().putString(str + ":" + str2, str3));
    }
}
