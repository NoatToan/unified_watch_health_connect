package com.alipay.sdk.util;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.alipay.sdk.app.EnvUtils;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.smarthome.library.bluetooth.OTAErrorCode;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.gv5;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f5889a = {"10.1.5.1013151", "10.1.5.1013148"};

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PackageInfo f5891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5892b;
        public final String c;

        public a(PackageInfo packageInfo, int i, String str) {
            this.f5891a = packageInfo;
            this.f5892b = i;
            this.c = str;
        }

        public boolean a() {
            return this.f5891a.versionCode < this.f5892b;
        }

        public boolean b(com.alipay.sdk.sys.a aVar) {
            Signature[] signatureArr = this.f5891a.signatures;
            if (signatureArr == null || signatureArr.length == 0) {
                return false;
            }
            for (Signature signature : signatureArr) {
                String strG = k.g(aVar, signature.toByteArray());
                if (strG != null && !TextUtils.equals(strG, this.c)) {
                    com.alipay.sdk.app.statistic.a.c(aVar, "biz", "PublicKeyUnmatch", String.format("Got %s, expected %s", strG, this.c));
                    return true;
                }
            }
            return false;
        }
    }

    public static String A(Context context) {
        return context.getResources().getConfiguration().locale.toString();
    }

    public static boolean B(String str) {
        return Pattern.compile("^http(s)?://([a-z0-9_\\-]+\\.)*(alipaydev|alipay|taobao)\\.(com|net)(:\\d+)?(/.*)?$").matcher(str).matches();
    }

    public static String C(Context context) {
        DisplayMetrics displayMetricsK = K(context);
        return displayMetricsK.widthPixels + Marker.ANY_MARKER + displayMetricsK.heightPixels;
    }

    public static String D(String str) {
        try {
            Uri uri = Uri.parse(str);
            return String.format("%s%s", uri.getAuthority(), uri.getPath());
        } catch (Throwable th) {
            c.d(th);
            return "-";
        }
    }

    public static boolean E() {
        try {
            String[] strArrSplit = com.alipay.sdk.data.a.w().q().split("\\|");
            String str = Build.MODEL;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            for (String str2 : strArrSplit) {
                if (TextUtils.equals(str, str2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            c.d(th);
            return false;
        }
    }

    public static String F() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/version"), 256);
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                Matcher matcher = Pattern.compile("\\w+\\s+\\w+\\s+([^\\s]+)\\s+\\(([^\\s@]+(?:@[^\\s.]+)?)[^)]*\\)\\s+\\((?:[^(]*\\([^)]*\\))?[^)]*\\)\\s+([^\\s]+)\\s+(?:PREEMPT\\s+)?(.+)").matcher(line);
                if (!matcher.matches() || matcher.groupCount() < 4) {
                    return "Unavailable";
                }
                return matcher.group(1) + "\n" + matcher.group(2) + " " + matcher.group(3) + "\n" + matcher.group(4);
            } catch (Throwable th) {
                bufferedReader.close();
                throw th;
            }
        } catch (IOException unused) {
            return "Unavailable";
        }
    }

    public static String G(Context context) {
        String strA = j.a(context);
        return strA.substring(0, strA.indexOf("://"));
    }

    public static String H(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
            messageDigest.update(str.getBytes());
            return j(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static String I(Context context) {
        return "-1;-1";
    }

    public static ActivityInfo J(Context context) {
        try {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                for (ActivityInfo activityInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities) {
                    if (TextUtils.equals(activityInfo.name, activity.getClass().getName())) {
                        return activityInfo;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            c.d(th);
            return null;
        }
    }

    public static DisplayMetrics K(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static a a(PackageInfo packageInfo, int i, String str) {
        if (packageInfo == null) {
            return null;
        }
        return new a(packageInfo, i, str);
    }

    public static a b(com.alipay.sdk.sys.a aVar, Context context, String str, int i, String str2) {
        PackageInfo packageInfoQ;
        if (EnvUtils.a() && CommonConstants.ALIPAY_PACKAGE_NAME.equals(str)) {
            str = "com.eg.android.AlipayGphoneRC";
        }
        try {
            packageInfoQ = q(context, str);
        } catch (Throwable th) {
            com.alipay.sdk.app.statistic.a.c(aVar, "auth", "GetPackageInfoEx", th.getMessage());
            packageInfoQ = null;
        }
        if (n(aVar, packageInfoQ)) {
            return a(packageInfoQ, i, str2);
        }
        return null;
    }

    public static a c(com.alipay.sdk.sys.a aVar, Context context, List<com.alipay.sdk.data.a.C0118a> list) {
        a aVarB;
        if (list == null) {
            return null;
        }
        for (com.alipay.sdk.data.a.C0118a c0118a : list) {
            if (c0118a != null && (aVarB = b(aVar, context, c0118a.f5837a, c0118a.f5838b, c0118a.c)) != null && !aVarB.b(aVar) && !aVarB.a()) {
                return aVarB;
            }
        }
        return null;
    }

    public static String d() {
        if (EnvUtils.a()) {
            return "com.eg.android.AlipayGphoneRC";
        }
        try {
            return com.alipay.sdk.app.a.d.get(0).f5837a;
        } catch (Throwable unused) {
            return CommonConstants.ALIPAY_PACKAGE_NAME;
        }
    }

    public static String e(int i) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            int iNextInt = random.nextInt(3);
            if (iNextInt == 0) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 65.0d)));
            } else if (iNextInt == 1) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 97.0d)));
            } else if (iNextInt == 2) {
                sb.append(String.valueOf(new Random().nextInt(10)));
            }
        }
        return sb.toString();
    }

    public static String f(Context context, String str) {
        String strSubstring = "";
        try {
            String string = "";
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getApplicationContext().getSystemService(LifecycleConstantKt.TYPE_ACTIVITY)).getRunningAppProcesses()) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    string = string + "#M";
                } else {
                    if (runningAppProcessInfo.processName.startsWith(str + ":")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(string);
                        sb.append(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX);
                        sb.append(runningAppProcessInfo.processName.replace(str + ":", ""));
                        string = sb.toString();
                    }
                }
            }
            strSubstring = string;
        } catch (Throwable unused) {
        }
        if (strSubstring.length() > 0) {
            strSubstring = strSubstring.substring(1);
        }
        return strSubstring.length() == 0 ? "N" : strSubstring;
    }

    public static String g(com.alipay.sdk.sys.a aVar, byte[] bArr) {
        BigInteger modulus;
        try {
            PublicKey publicKey = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).getPublicKey();
            if (!(publicKey instanceof RSAPublicKey) || (modulus = ((RSAPublicKey) publicKey).getModulus()) == null) {
                return null;
            }
            return modulus.toString(16);
        } catch (Exception e) {
            com.alipay.sdk.app.statistic.a.d(aVar, "auth", "GetPublicKeyFromSignEx", e);
            return null;
        }
    }

    public static String h(String str) {
        return (EnvUtils.a() && TextUtils.equals(str, "com.eg.android.AlipayGphoneRC")) ? "com.eg.android.AlipayGphoneRC.IAlixPay" : "com.eg.android.AlipayGphone.IAlixPay";
    }

    public static String i(String str, String str2, String str3) {
        try {
            int iIndexOf = str3.indexOf(str) + str.length();
            if (iIndexOf <= str.length()) {
                return "";
            }
            int iIndexOf2 = !TextUtils.isEmpty(str2) ? str3.indexOf(str2, iIndexOf) : 0;
            return iIndexOf2 < 1 ? str3.substring(iIndexOf) : str3.substring(iIndexOf, iIndexOf2);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String j(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(Character.forDigit((b2 & 240) >> 4, 16));
            sb.append(Character.forDigit(b2 & 15, 16));
        }
        return sb.toString();
    }

    public static Map<String, String> k(com.alipay.sdk.sys.a aVar, String str) {
        HashMap map = new HashMap(4);
        int iIndexOf = str.indexOf(63);
        if (iIndexOf != -1 && iIndexOf < str.length() - 1) {
            for (String str2 : str.substring(iIndexOf + 1).split(gv5.CONNECT_STR)) {
                int iIndexOf2 = str2.indexOf(61, 1);
                if (iIndexOf2 != -1 && iIndexOf2 < str2.length() - 1) {
                    map.put(str2.substring(0, iIndexOf2), s(aVar, str2.substring(iIndexOf2 + 1)));
                }
            }
        }
        return map;
    }

    public static boolean l(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.alipay.android.app", 128) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean m(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        try {
            String str = packageInfo.versionName;
            String[] strArr = f5889a;
            return TextUtils.equals(str, strArr[0]) || TextUtils.equals(str, strArr[1]);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean n(com.alipay.sdk.sys.a aVar, PackageInfo packageInfo) {
        String str = "";
        boolean z = false;
        if (packageInfo == null) {
            str = "info == null";
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                str = "info.signatures == null";
            } else if (signatureArr.length <= 0) {
                str = "info.signatures.length <= 0";
            } else {
                z = true;
            }
        }
        if (!z) {
            com.alipay.sdk.app.statistic.a.c(aVar, "auth", "NotIncludeSignatures", str);
        }
        return z;
    }

    public static boolean o(com.alipay.sdk.sys.a aVar, String str, final Activity activity) {
        String strSubstring;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (activity == null) {
            return false;
        }
        if (str.toLowerCase().startsWith("alipays://platformapi/startApp?".toLowerCase()) || str.toLowerCase().startsWith("intent://platformapi/startapp?".toLowerCase())) {
            try {
                a aVarC = c(aVar, activity, com.alipay.sdk.app.a.d);
                if (aVarC != null && !aVarC.a() && !aVarC.b(aVar)) {
                    if (str.startsWith("intent://platformapi/startapp")) {
                        str = str.replaceFirst("intent://platformapi/startapp\\?", "alipays://platformapi/startApp?");
                    }
                    activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                }
            } catch (Throwable unused) {
            }
            return true;
        }
        if (TextUtils.equals(str, "sdklite://h5quit") || TextUtils.equals(str, "http://m.alipay.com/?action=h5quit")) {
            com.alipay.sdk.app.b.c(com.alipay.sdk.app.b.f());
            activity.finish();
            return true;
        }
        if (!str.startsWith("sdklite://h5quit?result=")) {
            return false;
        }
        try {
            String strSubstring2 = str.substring(str.indexOf("sdklite://h5quit?result=") + 24);
            int i = Integer.parseInt(strSubstring2.substring(strSubstring2.lastIndexOf("&end_code=") + 10));
            if (i == com.alipay.sdk.app.c.SUCCEEDED.a() || i == com.alipay.sdk.app.c.PAY_WAITTING.a()) {
                if (com.alipay.sdk.cons.a.c) {
                    StringBuilder sb = new StringBuilder();
                    String strDecode = URLDecoder.decode(str);
                    String strDecode2 = URLDecoder.decode(strDecode);
                    String str2 = strDecode2.substring(strDecode2.indexOf("sdklite://h5quit?result=") + 24, strDecode2.lastIndexOf("&end_code=")).split("&return_url=")[0];
                    int iIndexOf = strDecode.indexOf("&return_url=") + 12;
                    sb.append(str2);
                    sb.append("&return_url=");
                    sb.append(strDecode.substring(iIndexOf, strDecode.indexOf(gv5.CONNECT_STR, iIndexOf)));
                    sb.append(strDecode.substring(strDecode.indexOf(gv5.CONNECT_STR, iIndexOf)));
                    strSubstring = sb.toString();
                } else {
                    String strDecode3 = URLDecoder.decode(str);
                    strSubstring = strDecode3.substring(strDecode3.indexOf("sdklite://h5quit?result=") + 24, strDecode3.lastIndexOf("&end_code="));
                }
                com.alipay.sdk.app.c cVarB = com.alipay.sdk.app.c.b(i);
                com.alipay.sdk.app.b.c(com.alipay.sdk.app.b.b(cVarB.a(), cVarB.b(), strSubstring));
            } else {
                com.alipay.sdk.app.c cVarB2 = com.alipay.sdk.app.c.b(com.alipay.sdk.app.c.FAILED.a());
                com.alipay.sdk.app.b.c(com.alipay.sdk.app.b.b(cVarB2.a(), cVarB2.b(), ""));
            }
        } catch (Exception unused2) {
            com.alipay.sdk.app.b.c(com.alipay.sdk.app.b.h());
        }
        activity.runOnUiThread(new Runnable() { // from class: com.alipay.sdk.util.k.1
            @Override // java.lang.Runnable
            public void run() {
                activity.finish();
            }
        });
        return true;
    }

    public static int p(int i) {
        return i / 100000;
    }

    public static PackageInfo q(Context context, String str) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getPackageInfo(str, 192);
    }

    public static String r() {
        return "Android " + Build.VERSION.RELEASE;
    }

    public static String s(com.alipay.sdk.sys.a aVar, String str) {
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            com.alipay.sdk.app.statistic.a.d(aVar, "biz", "H5PayDataAnalysisError", e);
            return "";
        }
    }

    public static Map<String, String> t(String str) {
        HashMap map = new HashMap();
        for (String str2 : str.split(gv5.CONNECT_STR)) {
            int iIndexOf = str2.indexOf("=", 1);
            if (-1 != iIndexOf) {
                map.put(str2.substring(0, iIndexOf), URLDecoder.decode(str2.substring(iIndexOf + 1)));
            }
        }
        return map;
    }

    public static boolean u(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(d(), 128);
            return packageInfo != null && packageInfo.versionCode < 99;
        } catch (Throwable th) {
            c.d(th);
            return false;
        }
    }

    public static boolean v(com.alipay.sdk.sys.a aVar, Context context, List<com.alipay.sdk.data.a.C0118a> list) {
        try {
            for (com.alipay.sdk.data.a.C0118a c0118a : list) {
                if (c0118a != null) {
                    String str = c0118a.f5837a;
                    if (EnvUtils.a() && CommonConstants.ALIPAY_PACKAGE_NAME.equals(str)) {
                        str = "com.eg.android.AlipayGphoneRC";
                    }
                    try {
                        if (context.getPackageManager().getPackageInfo(str, 128) != null) {
                            return true;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        continue;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            com.alipay.sdk.app.statistic.a.d(aVar, "biz", "CheckLaunchAppExistEx", th);
            return false;
        }
    }

    public static String w() {
        String strF = F();
        int iIndexOf = strF.indexOf("-");
        if (iIndexOf != -1) {
            strF = strF.substring(0, iIndexOf);
        }
        int iIndexOf2 = strF.indexOf("\n");
        if (iIndexOf2 != -1) {
            strF = strF.substring(0, iIndexOf2);
        }
        return "Linux " + strF;
    }

    public static String x(Context context) {
        return " (" + r() + ";" + w() + ";" + A(context) + ";;" + C(context) + ")(sdk android)";
    }

    public static JSONObject y(String str) {
        try {
            return new JSONObject(str);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static int z() {
        try {
            return Process.myUid();
        } catch (Throwable th) {
            c.d(th);
            return OTAErrorCode.READ_FRIMWARE_VERSION_FAIL;
        }
    }
}
