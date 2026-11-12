package com.alipay.android.phone.mrpc.core;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f5757a;

    public static final boolean a(Context context) {
        Boolean bool = f5757a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            boolean z = (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 2) != 0;
            f5757a = Boolean.valueOf(z);
            return z;
        } catch (Exception unused) {
            return false;
        }
    }
}
