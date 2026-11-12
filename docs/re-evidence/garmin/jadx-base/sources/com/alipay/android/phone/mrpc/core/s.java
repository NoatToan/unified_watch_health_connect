package com.alipay.android.phone.mrpc.core;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f28339a;

    public static final boolean a(Context context) {
        Boolean bool = f28339a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            boolean z14 = (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 2) != 0;
            f28339a = Boolean.valueOf(z14);
            return z14;
        } catch (Exception unused) {
            return false;
        }
    }
}
