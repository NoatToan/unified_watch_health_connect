package com.huawei.openalliance.ad;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes12.dex */
public class eq implements fw {
    private static fw d;
    private static final byte[] e = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f18712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f18713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedPreferences f18714c;
    private final byte[] f = new byte[0];

    @Override // com.huawei.openalliance.ad.fw
    public void b() {
        synchronized (this.f) {
            SharedPreferences sharedPreferences = this.f18713b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putLong("lastSyncTime", com.huawei.openalliance.ad.utils.as.c()).commit();
            }
        }
    }

    @Override // com.huawei.openalliance.ad.fw
    public long a() {
        synchronized (this.f) {
            SharedPreferences sharedPreferences = this.f18713b;
            if (sharedPreferences == null) {
                return 0L;
            }
            return sharedPreferences.getLong("lastSyncTime", 0L);
        }
    }

    private static fw b(Context context) {
        fw fwVar;
        synchronized (e) {
            if (d == null) {
                d = new eq(context);
            }
            fwVar = d;
        }
        return fwVar;
    }

    public static fw a(Context context) {
        return b(context);
    }

    private eq(Context context) {
        SharedPreferences sharedPreferences;
        this.f18712a = context.getApplicationContext();
        try {
            sharedPreferences = context.getSharedPreferences("AppDataSharedPreferences", 0);
            try {
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("AppDataSharedPreferences_sec", 0);
                this.f18713b = sharedPreferences;
                this.f18714c = sharedPreferences2;
            } catch (Throwable th) {
                th = th;
                try {
                    hw.c("AppDataSpHandler", "get SharedPreference exception: %s", th.getClass().getSimpleName());
                } finally {
                    this.f18713b = sharedPreferences;
                    this.f18714c = null;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            sharedPreferences = null;
        }
    }
}
