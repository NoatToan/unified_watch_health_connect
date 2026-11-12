package com.xiaomi.accountsdk.diagnosis.b;

import android.os.Process;
import android.text.TextUtils;
import com.xiaomi.accountsdk.diagnosis.e.d;
import com.xiaomi.hm.health.traininglib.util.TrainingDateUtils;
import com.xiaomi.mipush.sdk.Constants;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class b {
    private static String a;
    private static final ThreadLocal<SimpleDateFormat> b = new a();

    public static class a extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat(TrainingDateUtils.PATTERN_YMD_HMSS, Locale.US);
        }
    }

    private static String a() {
        return b.get().format(new Date());
    }

    public static String a(c cVar, String str) throws Throwable {
        String strB = b();
        return a() + " " + Process.myPid() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + Process.myTid() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + strB + " " + cVar.toString() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str + ": ";
    }

    private static String b() throws Throwable {
        if (a == null) {
            String strA = d.a(Process.myPid());
            if (TextUtils.isEmpty(strA)) {
                strA = "UnknownProcess";
            }
            a = strA;
        }
        return a;
    }
}
