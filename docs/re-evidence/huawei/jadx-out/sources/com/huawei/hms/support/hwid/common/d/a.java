package com.huawei.hms.support.hwid.common.d;

import android.content.Context;

/* JADX INFO: loaded from: classes34.dex */
public class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f16617a;

    public a(Context context, String str) {
        super(context, str);
    }

    public static a a(Context context) {
        if (f16617a == null) {
            synchronized (a.class) {
                if (f16617a == null) {
                    f16617a = new a(context, "SiteDomain");
                }
            }
        }
        return f16617a;
    }
}
