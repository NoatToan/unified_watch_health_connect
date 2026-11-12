package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;

/* JADX INFO: loaded from: classes22.dex */
public class bf {
    private static bf c;
    private Context a;
    private int b = 0;

    private bf(Context context) {
        this.a = context.getApplicationContext();
    }

    public static bf a(Context context) {
        if (c == null) {
            c = new bf(context);
        }
        return c;
    }

    @SuppressLint({"NewApi"})
    public int a() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        try {
            this.b = Settings.Global.getInt(this.a.getContentResolver(), "device_provisioned", 0);
        } catch (Exception unused) {
        }
        return this.b;
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public Uri m3830a() {
        return Settings.Global.getUriFor("device_provisioned");
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3831a() {
        String str = com.xiaomi.push.j.a;
        return str.contains("xmsf") || str.contains("xiaomi") || str.contains("miui");
    }
}
