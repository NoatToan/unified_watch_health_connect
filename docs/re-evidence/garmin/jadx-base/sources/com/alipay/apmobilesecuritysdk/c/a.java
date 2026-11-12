package com.alipay.apmobilesecuritysdk.c;

import android.content.Context;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import lg.d;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static synchronized void a(Context context, String str, String str2, String str3) {
        lg.a aVarB = b(context, str, str2, str3);
        String str4 = context.getFilesDir().getAbsolutePath() + "/log/ap";
        String str5 = new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()) + ".log";
        String string = aVarB.toString();
        synchronized (d.class) {
            d.f112152a = str4;
            d.f112153b = str5;
            d.f112154c = string;
        }
    }

    public static lg.a b(Context context, String str, String str2, String str3) {
        String packageName;
        try {
            packageName = context.getPackageName();
        } catch (Throwable unused) {
            packageName = "";
        }
        return new lg.a(Build.MODEL, packageName, "APPSecuritySDK-ALIPAYSDK", "3.4.0.202311031119", str, str2, str3);
    }

    public static synchronized void a(String str) {
        synchronized (d.class) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            d.j(arrayList);
        }
    }

    public static synchronized void a(Throwable th3) {
        d.i(th3);
    }
}
