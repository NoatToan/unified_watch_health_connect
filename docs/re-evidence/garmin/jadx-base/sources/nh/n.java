package nh;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.room.a0;
import com.google.common.base.Ascii;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes7.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f126132a = {"10.1.5.1013151", "10.1.5.1013148"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f126133b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '+', IOUtils.DIR_SEPARATOR_UNIX};

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f126134a;

        public a(Activity activity) {
            this.f126134a = activity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f126134a.finish();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PackageInfo f126135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f126136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f126137c;

        public b(PackageInfo packageInfo, int i14, String str) {
            this.f126135a = packageInfo;
            this.f126136b = i14;
            this.f126137c = str;
        }

        public final boolean a(lh.a aVar) {
            Signature[] signatureArr = this.f126135a.signatures;
            if (signatureArr != null && signatureArr.length != 0) {
                for (Signature signature : signatureArr) {
                    String strD = n.d(aVar, signature.toByteArray());
                    if (strD != null) {
                        String str = this.f126137c;
                        if (!TextUtils.equals(strD, str)) {
                            wg.a.g(aVar, "biz", "PublicKeyUnmatch", a0.j("Got ", strD, ", expected ", str));
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    public static String a(int i14) {
        Random random = new Random();
        StringBuilder sb3 = new StringBuilder();
        for (int i15 = 0; i15 < i14; i15++) {
            int iNextInt = random.nextInt(3);
            if (iNextInt == 0) {
                sb3.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 65.0d)));
            } else if (iNextInt == 1) {
                sb3.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 97.0d)));
            } else if (iNextInt == 2) {
                sb3.append(String.valueOf(new Random().nextInt(10)));
            }
        }
        return sb3.toString();
    }

    public static String b(Context context, lh.a aVar) {
        try {
            String strB = k.b("alipay_cashier_ap_fi", "", context, aVar);
            if (!TextUtils.isEmpty(strB)) {
                return strB;
            }
            try {
                byte[] bArr = sg.a.a("FU", System.currentTimeMillis(), new sg.d(), (short) 0, new sg.f()).f144652a;
                SecureRandom secureRandom = qg.b.f144653a;
                k.c("alipay_cashier_ap_fi", Base64.encodeToString(bArr, 3), context, aVar);
                String strB2 = k.b("alipay_cashier_ap_fi", "", context, aVar);
                if (!TextUtils.isEmpty(strB2)) {
                    return strB2;
                }
                wg.a.g(aVar, "biz", "e_regen_empty", "");
                return "";
            } catch (Exception e4) {
                wg.a.g(aVar, "biz", "e_gen", e4.getClass().getSimpleName());
                return "";
            }
        } catch (Exception e14) {
            wg.a.d(aVar, "biz", "e_gen_err", e14);
            return "";
        }
    }

    public static String c(String str, String str2, String str3) {
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

    public static String d(lh.a aVar, byte[] bArr) {
        BigInteger modulus;
        try {
            PublicKey publicKey = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).getPublicKey();
            if (!(publicKey instanceof RSAPublicKey) || (modulus = ((RSAPublicKey) publicKey).getModulus()) == null) {
                return null;
            }
            return modulus.toString(16);
        } catch (Exception e4) {
            wg.a.d(aVar, "auth", "GetPublicKeyFromSignEx", e4);
            return null;
        }
    }

    public static String e(byte[] bArr) {
        StringBuilder sb3 = new StringBuilder(bArr.length * 2);
        for (byte b14 : bArr) {
            sb3.append(Character.forDigit((b14 & 240) >> 4, 16));
            sb3.append(Character.forDigit(b14 & Ascii.SI, 16));
        }
        return sb3.toString();
    }

    public static b f(lh.a aVar, Context context, List<ah.a.b> list) {
        PackageInfo packageInfo;
        String str;
        if (list != null) {
            for (ah.a.b bVar : list) {
                if (bVar != null) {
                    String str2 = bVar.f3275a;
                    int i14 = bVar.f3276b;
                    String str3 = bVar.f3277c;
                    if (fg.b.a()) {
                        if ("com.eg.android.AlipayGphone".equals(str2)) {
                            str2 = "com.eg.android.AlipayGphoneRC";
                        } else if ("hk.alipay.wallet".equals(str2)) {
                            str2 = "hk.alipay.walletRC";
                        }
                    }
                    try {
                        packageInfo = context.getPackageManager().getPackageInfo(str2, 192);
                    } catch (Throwable th3) {
                        wg.a.g(aVar, "auth", "GetPackageInfoEx", th3.getMessage());
                        packageInfo = null;
                    }
                    boolean z14 = false;
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
                            z14 = true;
                        }
                    }
                    if (!z14) {
                        wg.a.g(aVar, "auth", "NotIncludeSignatures", str);
                    }
                    b bVar2 = (z14 && packageInfo != null) ? new b(packageInfo, i14, str3) : null;
                    if (bVar2 != null && !bVar2.a(aVar) && bVar2.f126135a.versionCode >= bVar2.f126136b) {
                        return bVar2;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    public static void g(Context context, String str, lh.a aVar) {
        boolean zContains;
        if (context == null || TextUtils.isEmpty("alipaySdk") || TextUtils.isEmpty(str)) {
            return;
        }
        if (aVar != null) {
            String str2 = aVar.f112381f;
            if (TextUtils.isEmpty(str2)) {
                zContains = false;
            } else {
                zContains = str2.toLowerCase().contains("auth");
            }
        } else {
            zContains = false;
        }
        if (!zContains && ah.a.g().f3265u) {
            try {
                Intent intent = new Intent("android.app.intent.action.APP_EXCEPTION_OCCUR");
                intent.putExtra("bizType", "alipaySdk");
                intent.putExtra("exName", str);
                intent.setPackage(context.getPackageName());
                context.sendBroadcast(intent);
                wg.a.c(aVar, "biz", "AppNotify", "alipaySdk|".concat(str));
            } catch (Exception unused) {
            }
        }
    }

    public static boolean h(Activity activity, lh.a aVar, String str) {
        String strSubstring;
        if (!TextUtils.isEmpty(str)) {
            if (activity != null) {
                if (str.toLowerCase().startsWith("alipays://platformapi/startApp?".toLowerCase()) || str.toLowerCase().startsWith("intent://platformapi/startapp?".toLowerCase())) {
                    try {
                        b bVarF = f(aVar, activity, ug.a.f170550d);
                        if (bVarF != null) {
                            if (!(bVarF.f126135a.versionCode < bVarF.f126136b) && !bVarF.a(aVar)) {
                                if (str.startsWith("intent://platformapi/startapp")) {
                                    str = str.replaceFirst("intent://platformapi/startapp\\?", "alipays://platformapi/startApp?");
                                }
                                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            }
                        }
                    } catch (Throwable unused) {
                    }
                } else {
                    if (TextUtils.equals(str, "sdklite://h5quit") || TextUtils.equals(str, "http://m.alipay.com/?action=h5quit")) {
                        ug.b.f170552b = ug.b.a();
                        activity.finish();
                        return true;
                    }
                    if (str.startsWith("sdklite://h5quit?result=")) {
                        try {
                            String strSubstring2 = str.substring(str.indexOf("sdklite://h5quit?result=") + 24);
                            int i14 = Integer.parseInt(strSubstring2.substring(strSubstring2.lastIndexOf("&end_code=") + 10));
                            if (i14 == ug.c.SUCCEEDED.f170562a || i14 == ug.c.PAY_WAITTING.f170562a) {
                                if (yg.a.f196900b) {
                                    StringBuilder sb3 = new StringBuilder();
                                    String strDecode = URLDecoder.decode(str);
                                    String strDecode2 = URLDecoder.decode(strDecode);
                                    String str2 = strDecode2.substring(strDecode2.indexOf("sdklite://h5quit?result=") + 24, strDecode2.lastIndexOf("&end_code=")).split("&return_url=")[0];
                                    int iIndexOf = strDecode.indexOf("&return_url=") + 12;
                                    sb3.append(str2);
                                    sb3.append("&return_url=");
                                    sb3.append(strDecode.substring(iIndexOf, strDecode.indexOf("&", iIndexOf)));
                                    sb3.append(strDecode.substring(strDecode.indexOf("&", iIndexOf)));
                                    strSubstring = sb3.toString();
                                } else {
                                    String strDecode3 = URLDecoder.decode(str);
                                    strSubstring = strDecode3.substring(strDecode3.indexOf("sdklite://h5quit?result=") + 24, strDecode3.lastIndexOf("&end_code="));
                                }
                                ug.c cVarA = ug.c.a(i14);
                                ug.b.f170552b = ug.b.b(cVarA.f170562a, cVarA.f170563b, strSubstring);
                            } else {
                                ug.c cVarA2 = ug.c.a(ug.c.FAILED.f170562a);
                                ug.b.f170552b = ug.b.b(cVarA2.f170562a, cVarA2.f170563b, "");
                            }
                        } catch (Exception unused2) {
                            ug.c cVarA3 = ug.c.a(ug.c.PARAMS_ERROR.f170562a);
                            ug.b.f170552b = ug.b.b(cVarA3.f170562a, cVarA3.f170563b, "");
                        }
                        activity.runOnUiThread(new a(activity));
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean i(String str, lh.a aVar) {
        try {
            String host = new URL(str).getHost();
            return host.endsWith("alipay.com") || host.endsWith("alipay.net");
        } catch (Throwable th3) {
            wg.a.d(aVar, "biz", "ckUrlErr", th3);
            return false;
        }
    }

    public static boolean j(lh.a aVar, Context context, List<ah.a.b> list, boolean z14) {
        try {
            for (ah.a.b bVar : list) {
                if (bVar != null) {
                    String str = bVar.f3275a;
                    if (fg.b.a()) {
                        if ("com.eg.android.AlipayGphone".equals(str)) {
                            str = "com.eg.android.AlipayGphoneRC";
                        } else if ("hk.alipay.wallet".equals(str)) {
                            str = "hk.alipay.walletRC";
                        }
                    }
                    try {
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 128);
                        if (packageInfo != null) {
                            if (!z14) {
                                return true;
                            }
                            wg.a.c(aVar, "biz", "PgWltVer", packageInfo.packageName + "|" + packageInfo.versionName);
                            return true;
                        }
                        continue;
                    } catch (PackageManager.NameNotFoundException unused) {
                        continue;
                    }
                }
            }
            return false;
        } catch (Throwable th3) {
            wg.a.d(aVar, "biz", "CheckLaunchAppExistEx", th3);
            return false;
        }
    }

    public static String k() {
        if (fg.b.a()) {
            return TextUtils.equals("hk.alipay.wallet", ug.a.f170550d.get(0).f3275a) ? "hk.alipay.walletRC" : "com.eg.android.AlipayGphoneRC";
        }
        try {
            return ug.a.f170550d.get(0).f3275a;
        } catch (Throwable unused) {
            return "com.eg.android.AlipayGphone";
        }
    }

    public static HashMap l(String str) {
        HashMap map = new HashMap();
        for (String str2 : str.split("&")) {
            int iIndexOf = str2.indexOf("=", 1);
            if (-1 != iIndexOf) {
                map.put(str2.substring(0, iIndexOf), URLDecoder.decode(str2.substring(iIndexOf + 1)));
            }
        }
        return map;
    }

    public static HashMap m(String str, lh.a aVar) {
        HashMap map = new HashMap(4);
        int iIndexOf = str.indexOf(63);
        if (iIndexOf != -1 && iIndexOf < str.length() - 1) {
            for (String str2 : str.substring(iIndexOf + 1).split("&")) {
                int iIndexOf2 = str2.indexOf(61, 1);
                if (iIndexOf2 != -1 && iIndexOf2 < str2.length() - 1) {
                    map.put(str2.substring(0, iIndexOf2), p(str2.substring(iIndexOf2 + 1), aVar));
                }
            }
        }
        return map;
    }

    public static int n(String str) {
        try {
            String str2 = ah.a.g().f3259o;
            if (TextUtils.isEmpty(str2)) {
                return 0;
            }
            String string = Settings.Secure.getString(((Application) lh.b.b().f112390a).getContentResolver(), str2);
            return ((string != null ? string : "").contains(str) ? 2 : 0) | 1;
        } catch (Throwable unused) {
            return 61440;
        }
    }

    public static String o() {
        String strSubstring = "Unavailable";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/version"), 256);
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                Matcher matcher = Pattern.compile("\\w+\\s+\\w+\\s+([^\\s]+)\\s+\\(([^\\s@]+(?:@[^\\s.]+)?)[^)]*\\)\\s+\\((?:[^(]*\\([^)]*\\))?[^)]*\\)\\s+([^\\s]+)\\s+(?:PREEMPT\\s+)?(.+)").matcher(line);
                if (matcher.matches() && matcher.groupCount() >= 4) {
                    strSubstring = matcher.group(1) + "\n" + matcher.group(2) + StringUtils.SPACE + matcher.group(3) + "\n" + matcher.group(4);
                }
            } catch (Throwable th3) {
                bufferedReader.close();
                throw th3;
            }
        } catch (IOException unused) {
        }
        int iIndexOf = strSubstring.indexOf("-");
        if (iIndexOf != -1) {
            strSubstring = strSubstring.substring(0, iIndexOf);
        }
        int iIndexOf2 = strSubstring.indexOf("\n");
        if (iIndexOf2 != -1) {
            strSubstring = strSubstring.substring(0, iIndexOf2);
        }
        return "Linux ".concat(strSubstring);
    }

    public static String p(String str, lh.a aVar) {
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e4) {
            wg.a.d(aVar, "biz", "H5PayDataAnalysisError", e4);
            return "";
        }
    }

    public static String q(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels + Marker.ANY_MARKER + displayMetrics.heightPixels;
    }

    public static String r(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            if (bArrDigest.length <= 16) {
                return e(bArrDigest);
            }
            byte[] bArr = new byte[16];
            System.arraycopy(bArrDigest, 0, bArr, 0, 16);
            return e(bArr);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static String s(String str) {
        try {
            Uri uri = Uri.parse(str);
            return uri.getAuthority() + uri.getPath();
        } catch (Throwable th3) {
            d.a(th3);
            return "-";
        }
    }
}
