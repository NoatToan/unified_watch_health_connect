package com.xiaomi.accountsdk.diagnosis.b;

import android.os.Process;
import android.text.TextUtils;
import com.xiaomi.accountsdk.diagnosis.e.d;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f10837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f10838b = new ThreadLocal<SimpleDateFormat>() { // from class: com.xiaomi.accountsdk.diagnosis.b.b.1
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        }
    };

    private static String a() {
        return f10838b.get().format(new Date());
    }

    private static String b() throws Throwable {
        if (f10837a == null) {
            String strA = d.a(Process.myPid());
            if (TextUtils.isEmpty(strA)) {
                strA = "UnknownProcess";
            }
            f10837a = strA;
        }
        return f10837a;
    }

    public static String a(c cVar, String str) throws Throwable {
        String strB = b();
        return a() + " " + Process.myPid() + "-" + Process.myTid() + "/" + strB + " " + cVar.toString() + "/" + str + ": ";
    }
}
