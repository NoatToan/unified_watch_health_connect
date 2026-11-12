package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Trace;
import defpackage.u07;

/* JADX INFO: loaded from: classes4.dex */
@TargetApi(18)
@u07
class Api18TraceUtils {
    public static void a(String str, String str2, String str3) {
        String str4 = str + str2 + str3;
        if (str4.length() > 127 && str2 != null) {
            str4 = str + str2.substring(0, (127 - str.length()) - str3.length()) + str3;
        }
        Trace.beginSection(str4);
    }

    public static void b() {
        Trace.endSection();
    }
}
