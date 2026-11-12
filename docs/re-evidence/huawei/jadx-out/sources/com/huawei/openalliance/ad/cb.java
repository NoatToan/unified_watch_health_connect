package com.huawei.openalliance.ad;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public class cb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static cb f18335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f18336b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f18337c;

    public qz a(int i, int i2) {
        hw.a("AppDataCollectionManager", "get processor type : %s", Integer.valueOf(i));
        if (i != 1) {
            return null;
        }
        return new ov(this.f18337c, i2);
    }

    public static cb a(Context context) {
        cb cbVar;
        synchronized (f18336b) {
            if (f18335a == null) {
                f18335a = new cb(context);
            }
            cbVar = f18335a;
        }
        return cbVar;
    }

    private cb(Context context) {
        this.f18337c = context.getApplicationContext();
    }
}
