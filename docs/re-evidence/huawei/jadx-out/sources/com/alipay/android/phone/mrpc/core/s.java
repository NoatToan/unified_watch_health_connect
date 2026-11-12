package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f2011a;

    public static final boolean a(Context context) {
        Boolean bool = f2011a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            boolean z = (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 2) != 0;
            Boolean boolValueOf = Boolean.valueOf(z);
            f2011a = boolValueOf;
            boolValueOf.getClass();
            return z;
        } catch (Exception e) {
            Log.e("MiscUtils", "", e);
            return false;
        }
    }
}
