package com.huawei.openalliance.ad;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public class ce {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ct f18344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f18345b = new byte[0];

    public static ct a(Context context) {
        if (f18344a == null) {
            synchronized (f18345b) {
                if (f18344a == null) {
                    f18344a = cc.e(context) ? ck.b(context) : co.b(context);
                }
            }
        }
        return f18344a;
    }
}
