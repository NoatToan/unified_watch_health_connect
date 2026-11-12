package com.xiaomi.ai.android.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.accountsdk.utils.PackageUtils;
import defpackage.wpe;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    public static byte[] a(Context context, String str) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr.length == 0) {
                return null;
            }
            return signatureArr[0].toByteArray();
        } catch (PackageManager.NameNotFoundException e) {
            wpe.e(PackageUtils.TAG, Log.getStackTraceString(e));
            return null;
        }
    }

    public static int b(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    public static boolean c(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }
}
