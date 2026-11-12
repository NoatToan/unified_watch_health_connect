package com.alipay.sdk.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.ConditionVariable;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.TextView;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.alipay.sdk.util.c;
import com.alipay.sdk.util.k;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static volatile b d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5840b = "sdk-and-lite";
    public String c;

    private b() {
        String strA = com.alipay.sdk.app.a.a();
        if (com.alipay.sdk.app.a.c()) {
            return;
        }
        this.f5840b += '_' + strA;
    }

    public static String a(Context context) {
        if (context == null) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            String packageName = context.getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            sb.append("(");
            sb.append(packageName);
            sb.append(";");
            sb.append(packageInfo.versionCode);
            sb.append(")");
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static synchronized void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        PreferenceManager.getDefaultSharedPreferences(com.alipay.sdk.sys.b.a().c()).edit().putString("trideskey", str).apply();
        com.alipay.sdk.cons.a.f5831b = str;
    }

    public static synchronized b e() {
        try {
            if (d == null) {
                d = new b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return d;
    }

    public static String f(Context context) {
        return Float.toString(new TextView(context).getTextSize());
    }

    public static String g(com.alipay.sdk.sys.a aVar, Context context, HashMap<String, String> map) {
        final String[] strArr = {""};
        try {
            APSecuritySdk aPSecuritySdk = APSecuritySdk.getInstance(context);
            final ConditionVariable conditionVariable = new ConditionVariable();
            aPSecuritySdk.initToken(0, map, new APSecuritySdk.InitResultListener() { // from class: com.alipay.sdk.data.b.1
                @Override // com.alipay.apmobilesecuritysdk.face.APSecuritySdk.InitResultListener
                public void onResult(APSecuritySdk.TokenResult tokenResult) {
                    if (tokenResult != null) {
                        strArr[0] = tokenResult.apdidToken;
                    }
                    conditionVariable.open();
                }
            });
            conditionVariable.block(3000L);
        } catch (Throwable th) {
            c.d(th);
            com.alipay.sdk.app.statistic.a.d(aVar, "third", "GetApdidEx", th);
        }
        if (TextUtils.isEmpty(strArr[0])) {
            com.alipay.sdk.app.statistic.a.c(aVar, "third", "GetApdidNull", "missing token");
        }
        c.b("mspl", "ap:" + strArr[0]);
        return strArr[0];
    }

    public static String h() {
        Context contextC = com.alipay.sdk.sys.b.a().c();
        SharedPreferences sharedPreferences = contextC.getSharedPreferences("virtualImeiAndImsi", 0);
        String string = sharedPreferences.getString("virtual_imei", null);
        if (TextUtils.isEmpty(string)) {
            string = TextUtils.isEmpty(com.alipay.sdk.tid.a.a(contextC).b()) ? o() : com.alipay.sdk.util.a.a(contextC).d();
            sharedPreferences.edit().putString("virtual_imei", string).apply();
        }
        return string;
    }

    public static String i(Context context) {
        WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
        return connectionInfo != null ? connectionInfo.getSSID() : "-1";
    }

    public static String j(final com.alipay.sdk.sys.a aVar, final Context context, final HashMap<String, String> map) {
        try {
            return (String) Executors.newFixedThreadPool(2).submit(new Callable<String>() { // from class: com.alipay.sdk.data.b.2
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public String call() throws Exception {
                    return b.g(aVar, context, map);
                }
            }).get(3000L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            com.alipay.sdk.app.statistic.a.d(aVar, "third", "GetApdidTimeout", th);
            return "";
        }
    }

    public static String k() {
        String strB;
        Context contextC = com.alipay.sdk.sys.b.a().c();
        SharedPreferences sharedPreferences = contextC.getSharedPreferences("virtualImeiAndImsi", 0);
        String string = sharedPreferences.getString("virtual_imsi", null);
        if (TextUtils.isEmpty(string)) {
            if (TextUtils.isEmpty(com.alipay.sdk.tid.a.a(contextC).b())) {
                String strF = com.alipay.sdk.sys.b.a().f();
                strB = (TextUtils.isEmpty(strF) || strF.length() < 18) ? o() : strF.substring(3, 18);
            } else {
                strB = com.alipay.sdk.util.a.a(contextC).b();
            }
            string = strB;
            sharedPreferences.edit().putString("virtual_imsi", string).apply();
        }
        return string;
    }

    public static String l(Context context) {
        WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
        return connectionInfo != null ? connectionInfo.getBSSID() : "00";
    }

    public static String m() {
        return "1";
    }

    public static String n() {
        return "-1;-1";
    }

    public static String o() {
        return Long.toHexString(System.currentTimeMillis()) + (new Random().nextInt(9000) + 1000);
    }

    public String c(com.alipay.sdk.sys.a aVar, com.alipay.sdk.tid.a aVar2) {
        Context contextC = com.alipay.sdk.sys.b.a().c();
        com.alipay.sdk.util.a aVarA = com.alipay.sdk.util.a.a(contextC);
        if (TextUtils.isEmpty(this.f5839a)) {
            this.f5839a = "Msp/15.7.5 (" + k.r() + ";" + k.w() + ";" + k.A(contextC) + ";" + k.G(contextC) + ";" + k.C(contextC) + ";" + f(contextC);
        }
        String strB = com.alipay.sdk.util.a.c(contextC).b();
        String strI = k.I(contextC);
        String strM = m();
        String strB2 = aVarA.b();
        String strD = aVarA.d();
        String strK = k();
        String strH = h();
        if (aVar2 != null) {
            this.c = aVar2.e();
        }
        String strReplace = Build.MANUFACTURER.replace(";", " ");
        String strReplace2 = Build.MODEL.replace(";", " ");
        boolean zE = com.alipay.sdk.sys.b.e();
        String strE = aVarA.e();
        String strI2 = i(contextC);
        String strL = l(contextC);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5839a);
        sb.append(";");
        sb.append(strB);
        sb.append(";");
        sb.append(strI);
        sb.append(";");
        sb.append(strM);
        sb.append(";");
        sb.append(strB2);
        sb.append(";");
        sb.append(strD);
        sb.append(";");
        sb.append(this.c);
        sb.append(";");
        sb.append(strReplace);
        sb.append(";");
        sb.append(strReplace2);
        sb.append(";");
        sb.append(zE);
        sb.append(";");
        sb.append(strE);
        sb.append(";");
        sb.append(n());
        sb.append(";");
        sb.append(this.f5840b);
        sb.append(";");
        sb.append(strK);
        sb.append(";");
        sb.append(strH);
        sb.append(";");
        sb.append(strI2);
        sb.append(";");
        sb.append(strL);
        if (aVar2 != null) {
            HashMap map = new HashMap();
            map.put("tid", com.alipay.sdk.tid.a.a(contextC).b());
            map.put("utdid", com.alipay.sdk.sys.b.a().f());
            String strJ = j(aVar, contextC, map);
            if (!TextUtils.isEmpty(strJ)) {
                sb.append(";;;");
                sb.append(strJ);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
