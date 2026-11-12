package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.media3.extractor.ts.PsExtractor;
import com.alipay.sdk.app.EnvUtils;
import com.alipay.sdk.m.l.c;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.view.ConfigConstants;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ox {
    public static final String[] e = {"10.1.5.1013151", "10.1.5.1013148"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f44947c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '+', '/'};

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f44948a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ConditionVariable f44949c;

        public a(Runnable runnable, ConditionVariable conditionVariable) {
            this.f44948a = runnable;
            this.f44949c = conditionVariable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f44948a.run();
            } finally {
                this.f44949c.open();
            }
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ Activity d;

        public e(Activity activity) {
            this.d = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.d.finish();
        }
    }

    public static String a(String str) {
        return (EnvUtils.b() && TextUtils.equals(str, "com.eg.android.AlipayGphoneRC")) ? "com.eg.android.AlipayGphoneRC.IAlixPay" : "com.eg.android.AlipayGphone.IAlixPay";
    }

    public static String c() {
        if (EnvUtils.b()) {
            return TextUtils.equals("hk.alipay.wallet", mn.e.get(0).f42625c) ? "hk.alipay.walletRC" : "com.eg.android.AlipayGphoneRC";
        }
        try {
            return mn.e.get(0).f42625c;
        } catch (Throwable unused) {
            return "com.eg.android.AlipayGphone";
        }
    }

    public static String c(on onVar, String str) {
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e2) {
            mu.c(onVar, "biz", "H5PayDataAnalysisError", e2);
            return "";
        }
    }

    public static int d(String str) {
        for (int i = 0; i < 64; i++) {
            if (str.equals(String.valueOf(f44947c[i]))) {
                return i;
            }
        }
        return 0;
    }

    public static String d() {
        return "Android " + Build.VERSION.RELEASE;
    }

    public static String e(String str, String str2, String str3) {
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

    public static String f(Context context) {
        String strD = d();
        String strA = a();
        String strE = e(context);
        String strI = i(context);
        StringBuilder sb = new StringBuilder();
        if (mx.c().y()) {
            sb.append(" (");
            sb.append(strD);
            sb.append(";");
            sb.append(strA);
            sb.append(";");
            sb.append(strE);
            sb.append(";;");
            sb.append(strI);
            sb.append(")(sdk android)");
            return sb.toString();
        }
        sb.append(" (");
        sb.append(strD);
        sb.append(";");
        sb.append(strA);
        sb.append(";");
        sb.append(strE);
        sb.append(";;");
        sb.append(strI);
        sb.append(";15.8.35)(sdk android)");
        return sb.toString();
    }

    public static JSONObject j(String str) {
        try {
            return new JSONObject(str);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static String i(Context context) {
        DisplayMetrics displayMetricsC = c(context);
        return displayMetricsC.widthPixels + "*" + displayMetricsC.heightPixels;
    }

    public static String b() {
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

    public static String i(String str) {
        try {
            Uri uri = Uri.parse(str);
            return String.format("%s%s", uri.getAuthority(), uri.getPath());
        } catch (Throwable th) {
            oq.c(th);
            return Constants.LINK;
        }
    }

    public static boolean h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.alipay.android.app", 128) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static String a() {
        String strB = b();
        int iIndexOf = strB.indexOf(Constants.LINK);
        if (iIndexOf != -1) {
            strB = strB.substring(0, iIndexOf);
        }
        int iIndexOf2 = strB.indexOf("\n");
        if (iIndexOf2 != -1) {
            strB = strB.substring(0, iIndexOf2);
        }
        return "Linux " + strB;
    }

    public static boolean i() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static String e(Context context) {
        return context.getResources().getConfiguration().locale.toString();
    }

    public static boolean g(String str) {
        return Pattern.compile("^http(s)?://([a-z0-9_\\-]+\\.)*(alipaydev|alipay|taobao)\\.(com|net)(:\\d+)?(/.*)?$").matcher(str).matches();
    }

    public static final class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f44950c;
        public final int d;
        public final PackageInfo e;

        public d(PackageInfo packageInfo, int i, String str) {
            this.e = packageInfo;
            this.d = i;
            this.f44950c = str;
        }

        public boolean d(on onVar) {
            Signature[] signatureArr = this.e.signatures;
            if (signatureArr != null && signatureArr.length != 0) {
                for (Signature signature : signatureArr) {
                    String strC = ox.c(onVar, signature.toByteArray());
                    if (strC != null && !TextUtils.equals(strC, this.f44950c)) {
                        mu.e(onVar, "biz", "PublicKeyUnmatch", String.format("Got %s, expected %s", strC, this.f44950c));
                        return true;
                    }
                }
            }
            return false;
        }

        public boolean a() {
            return this.e.versionCode < this.d;
        }
    }

    public static String a(on onVar, String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e2) {
            mu.e(onVar, "biz", "rflex", e2.getClass().getSimpleName());
            return null;
        }
    }

    public static Map<String, String> e(String str) {
        HashMap map = new HashMap();
        for (String str2 : str.split("&")) {
            int iIndexOf = str2.indexOf("=", 1);
            if (-1 != iIndexOf) {
                map.put(str2.substring(0, iIndexOf), URLDecoder.decode(str2.substring(iIndexOf + 1)));
            }
        }
        return map;
    }

    public static String c(on onVar, byte[] bArr) {
        BigInteger modulus;
        try {
            PublicKey publicKey = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).getPublicKey();
            if (!(publicKey instanceof RSAPublicKey) || (modulus = ((RSAPublicKey) publicKey).getModulus()) == null) {
                return null;
            }
            return modulus.toString(16);
        } catch (Exception e2) {
            mu.c(onVar, "auth", "GetPublicKeyFromSignEx", e2);
            return null;
        }
    }

    public static String d(Context context) {
        String strE = oy.e(context);
        return strE.substring(0, strE.indexOf("://"));
    }

    public static int c(String str) {
        try {
            String strL = mx.c().l();
            if (TextUtils.isEmpty(strL)) {
                return 0;
            }
            return (e(strL, "").contains(str) ? 2 : 0) | 1;
        } catch (Throwable unused) {
            return 61440;
        }
    }

    public static Map<String, String> b(on onVar, String str) {
        HashMap map = new HashMap(4);
        int iIndexOf = str.indexOf(63);
        if (iIndexOf != -1 && iIndexOf < str.length() - 1) {
            for (String str2 : str.substring(iIndexOf + 1).split("&")) {
                int iIndexOf2 = str2.indexOf(61, 1);
                if (iIndexOf2 != -1 && iIndexOf2 < str2.length() - 1) {
                    map.put(str2.substring(0, iIndexOf2), c(onVar, str2.substring(iIndexOf2 + 1)));
                }
            }
        }
        return map;
    }

    public static d c(on onVar, Context context, List<mx.d> list) {
        d dVarE;
        if (list == null) {
            return null;
        }
        for (mx.d dVar : list) {
            if (dVar != null && (dVarE = e(onVar, context, dVar.f42625c, dVar.d, dVar.f42624a)) != null && !dVarE.d(onVar) && !dVarE.a()) {
                return dVarE;
            }
        }
        return null;
    }

    public static String h(String str) {
        return e(str, true);
    }

    public static int j() {
        try {
            return Process.myUid();
        } catch (Throwable th) {
            oq.c(th);
            return -200;
        }
    }

    public static d e(on onVar, Context context, String str, int i, String str2) {
        PackageInfo packageInfoA;
        if (EnvUtils.b()) {
            if ("com.eg.android.AlipayGphone".equals(str)) {
                str = "com.eg.android.AlipayGphoneRC";
            } else if ("hk.alipay.wallet".equals(str)) {
                str = "hk.alipay.walletRC";
            }
        }
        try {
            packageInfoA = a(context, str);
        } catch (Throwable th) {
            mu.e(onVar, "auth", "GetPackageInfoEx", th.getMessage());
            packageInfoA = null;
        }
        if (b(onVar, packageInfoA)) {
            return e(packageInfoA, i, str2);
        }
        return null;
    }

    public static String a(Context context) {
        return "-1;-1";
    }

    public static String e(String str, String str2) {
        String string = Settings.Secure.getString(((Application) ol.e().c()).getContentResolver(), str);
        return string != null ? string : str2;
    }

    public static boolean c(on onVar) {
        if (onVar == null || TextUtils.isEmpty(onVar.j)) {
            return false;
        }
        return onVar.j.toLowerCase().contains("auth");
    }

    public static boolean b(on onVar, PackageInfo packageInfo) {
        String str;
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
                str = "";
                z = true;
            }
        }
        if (!z) {
            mu.e(onVar, "auth", "NotIncludeSignatures", str);
        }
        return z;
    }

    public static DisplayMetrics c(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getApplicationContext().getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static boolean d(on onVar, String str) {
        try {
            int iC = c(str);
            mu.d(onVar, "biz", "bindExt", "" + iC);
            return mx.c().r() && (iC & 2) == 2;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static PackageInfo a(Context context, String str) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getPackageInfo(str, PsExtractor.AUDIO_STREAM);
    }

    public static d e(PackageInfo packageInfo, int i, String str) {
        if (packageInfo == null) {
            return null;
        }
        return new d(packageInfo, i, str);
    }

    public static long b(String str) {
        return a(str, 6);
    }

    public static long a(String str, int i) {
        int iPow = (int) Math.pow(2.0d, i);
        int length = str.length();
        long j = 0;
        int i2 = 0;
        int i3 = length;
        while (i2 < length) {
            int i4 = i2 + 1;
            j += ((long) Integer.parseInt(String.valueOf(d(str.substring(i2, i4))))) * ((long) Math.pow(iPow, i3 - 1));
            i3--;
            i2 = i4;
        }
        return j;
    }

    public static int e() {
        String strB = ol.e().b();
        if (TextUtils.isEmpty(strB)) {
            return -1;
        }
        String strReplaceAll = strB.replaceAll("=", "");
        if (strReplaceAll.length() >= 5) {
            strReplaceAll = strReplaceAll.substring(0, 5);
        }
        int iB = (int) (b(strReplaceAll) % 10000);
        return iB < 0 ? iB * (-1) : iB;
    }

    public static boolean d(on onVar, Context context, List<mx.d> list, boolean z) {
        try {
            for (mx.d dVar : list) {
                if (dVar != null) {
                    String str = dVar.f42625c;
                    if (EnvUtils.b()) {
                        if ("com.eg.android.AlipayGphone".equals(str)) {
                            str = "com.eg.android.AlipayGphoneRC";
                        } else if ("hk.alipay.wallet".equals(str)) {
                            str = "hk.alipay.walletRC";
                        }
                    }
                    try {
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 128);
                        if (packageInfo != null) {
                            if (!z) {
                                return true;
                            }
                            mu.d(onVar, "biz", "PgWltVer", packageInfo.packageName + "|" + packageInfo.versionName);
                            return true;
                        }
                        continue;
                    } catch (PackageManager.NameNotFoundException unused) {
                        continue;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            mu.c(onVar, "biz", "CheckLaunchAppExistEx", th);
            return false;
        }
    }

    public static boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        try {
            String str = packageInfo.versionName;
            String[] strArr = e;
            return TextUtils.equals(str, strArr[0]) || TextUtils.equals(str, strArr[1]);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String b(int i) {
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

    public static boolean a(on onVar, String str, Activity activity) {
        String strSubstring;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (activity == null) {
            return false;
        }
        if (!str.toLowerCase().startsWith("alipays://platformapi/startApp?".toLowerCase()) && !str.toLowerCase().startsWith("intent://platformapi/startapp?".toLowerCase())) {
            if (!TextUtils.equals(str, "sdklite://h5quit") && !TextUtils.equals(str, c("http", "://m.alipay.com/?action=h5quit"))) {
                if (!str.startsWith("sdklite://h5quit?result=")) {
                    return false;
                }
                try {
                    String strSubstring2 = str.substring(str.indexOf("sdklite://h5quit?result=") + 24);
                    int i = Integer.parseInt(strSubstring2.substring(strSubstring2.lastIndexOf("&end_code=") + 10));
                    if (i != c.SUCCEEDED.b() && i != c.PAY_WAITTING.b()) {
                        c cVarA = c.a(c.FAILED.b());
                        mp.e(mp.d(cVarA.b(), cVarA.a(), ""));
                    } else {
                        if (mz.e) {
                            StringBuilder sb = new StringBuilder();
                            String strDecode = URLDecoder.decode(str);
                            String strDecode2 = URLDecoder.decode(strDecode);
                            String str2 = strDecode2.substring(strDecode2.indexOf("sdklite://h5quit?result=") + 24, strDecode2.lastIndexOf("&end_code=")).split("&return_url=")[0];
                            int iIndexOf = strDecode.indexOf("&return_url=") + 12;
                            sb.append(str2);
                            sb.append("&return_url=");
                            sb.append(strDecode.substring(iIndexOf, strDecode.indexOf("&", iIndexOf)));
                            sb.append(strDecode.substring(strDecode.indexOf("&", iIndexOf)));
                            strSubstring = sb.toString();
                        } else {
                            String strDecode3 = URLDecoder.decode(str);
                            strSubstring = strDecode3.substring(strDecode3.indexOf("sdklite://h5quit?result=") + 24, strDecode3.lastIndexOf("&end_code="));
                        }
                        c cVarA2 = c.a(i);
                        mp.e(mp.d(cVarA2.b(), cVarA2.a(), strSubstring));
                    }
                } catch (Exception unused) {
                    mp.e(mp.e());
                }
                activity.runOnUiThread(new e(activity));
                return true;
            }
            mp.e(mp.d());
            activity.finish();
            return true;
        }
        try {
            d dVarC = c(onVar, activity, mn.e);
            if (dVarC != null && !dVarC.a() && !dVarC.d(onVar)) {
                if (str.startsWith("intent://platformapi/startapp")) {
                    str = str.replaceFirst("intent://platformapi/startapp\\?", "alipays://platformapi/startApp?");
                }
                activity.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str)));
            }
        } catch (Throwable unused2) {
        }
        return true;
    }

    public static String e(String str, boolean z) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            if (z && bArrDigest.length > 16) {
                byte[] bArr = new byte[16];
                System.arraycopy(bArrDigest, 0, bArr, 0, 16);
                return c(bArr);
            }
            return c(bArrDigest);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static String c(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(Character.forDigit((b2 & 240) >> 4, 16));
            sb.append(Character.forDigit(b2 & 15, 16));
        }
        return sb.toString();
    }

    public static ActivityInfo b(Context context) {
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
            oq.c(th);
            return null;
        }
    }

    public static String e(on onVar) {
        return a(onVar, "ro.build.fingerprint");
    }

    public static <T> T e(WeakReference<T> weakReference) {
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static boolean e(on onVar, String str) {
        try {
            String host = new URL(str).getHost();
            return host.endsWith(ConfigConstants.ALIPAY_URL) || host.endsWith("alipay.net");
        } catch (Throwable th) {
            mu.c(onVar, "biz", "ckUrlErr", th);
            return false;
        }
    }

    public static JSONObject b(Intent intent) {
        Bundle extras;
        JSONObject jSONObject = new JSONObject();
        if (intent != null && (extras = intent.getExtras()) != null) {
            for (String str : extras.keySet()) {
                try {
                    jSONObject.put(str, String.valueOf(extras.get(str)));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONObject;
    }

    public static Map<String, String> e(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    map.put(next, jSONObject.optString(next));
                } catch (Throwable th) {
                    oq.c(th);
                }
            }
        }
        return map;
    }

    public static boolean a(long j, Runnable runnable, String str) {
        if (runnable == null) {
            return false;
        }
        ConditionVariable conditionVariable = new ConditionVariable();
        Thread thread = new Thread(new a(runnable, conditionVariable));
        if (!TextUtils.isEmpty(str)) {
            thread.setName(str);
        }
        thread.start();
        try {
            if (j <= 0) {
                conditionVariable.block();
                return true;
            }
            return conditionVariable.block(j);
        } catch (Throwable unused) {
            return true;
        }
    }

    public static String c(String str, String str2) {
        return str + str2;
    }

    public static String a(on onVar, Context context) {
        try {
            String strD = or.d(onVar, context, "alipay_cashier_ap_fi", "");
            if (!TextUtils.isEmpty(strD)) {
                return strD;
            }
            try {
                or.c(onVar, context, "alipay_cashier_ap_fi", mi.a("FU", System.currentTimeMillis(), new mh(), (short) 0, new mj()).e());
                String strD2 = or.d(onVar, context, "alipay_cashier_ap_fi", "");
                if (!TextUtils.isEmpty(strD2)) {
                    return strD2;
                }
                mu.e(onVar, "biz", "e_regen_empty", "");
                return "";
            } catch (Exception e2) {
                mu.e(onVar, "biz", "e_gen", e2.getClass().getSimpleName());
                return "";
            }
        } catch (Exception e3) {
            mu.c(onVar, "biz", "e_gen_err", e3);
            return "";
        }
    }

    public static void b(String str, String str2, Context context, on onVar) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || c(onVar) || !mx.c().aa()) {
            return;
        }
        try {
            Intent intent = new Intent("android.app.intent.action.APP_EXCEPTION_OCCUR");
            intent.putExtra("bizType", str);
            intent.putExtra("exName", str2);
            intent.setPackage(context.getPackageName());
            context.sendBroadcast(intent);
            mu.d(onVar, "biz", "AppNotify", str + "|" + str2);
        } catch (Exception unused) {
        }
    }

    public static String c(File file) throws NoSuchAlgorithmException, IOException {
        int i;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i2 = fileInputStream.read(bArr);
                if (i2 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i2);
            }
            fileInputStream.close();
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
