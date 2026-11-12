package com.huawei.hiar;

import android.content.Context;
import android.content.pm.Signature;
import android.util.Log;
import defpackage.krk;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes33.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f11747a = "e";

    public static boolean a(Context context, String str) {
        Signature signatureE = krk.e(context, str);
        if (krk.e(signatureE, krk.b(context, "arengine_conf_new"))) {
            return true;
        }
        return krk.e(signatureE, krk.b(context, "arengine_conf_old"));
    }

    public static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
            Log.e(f11747a, "closeSilently close steam failed!");
        }
    }
}
