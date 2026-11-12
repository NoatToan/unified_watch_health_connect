package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import com.amap.api.col.p0003sl.ik;
import com.mibi.sdk.common.CommonConstants;
import com.mipay.sdk.account.BuildConfig;
import com.xiaomi.smarthome.CpuConstant;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class p0t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f29883a = {CpuConstant.CPU_ARMEABI_V8A, "x86_64"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f29884b = {"arm", "x86"};
    public static String c;

    static {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 80; i++) {
            sb.append("=");
        }
        c = sb.toString();
    }

    public static boolean A(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return j0t.a(str).contains(Build.MODEL + Build.VERSION.SDK_INT);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String B(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            String[] strArrSplit = str.split(gv5.CONNECT_STR);
            Arrays.sort(strArrSplit);
            StringBuffer stringBuffer = new StringBuffer();
            for (String str2 : strArrSplit) {
                if (!TextUtils.isEmpty(str2)) {
                    stringBuffer.append(str2);
                    stringBuffer.append(gv5.CONNECT_STR);
                }
            }
            String string = stringBuffer.toString();
            if (string.length() > 1) {
                return (String) string.subSequence(0, string.length() - 1);
            }
        } catch (Throwable th) {
            j2t.e(th, "ut", "sPa");
        }
        return str;
    }

    public static String C(byte[] bArr) {
        try {
            return D(bArr);
        } catch (Throwable th) {
            j2t.e(th, "ut", "csb2h");
            return null;
        }
    }

    public static String D(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr == null) {
            return null;
        }
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                hexString = "0".concat(hexString);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static void E(String str) {
        int i;
        while (true) {
            if (str.length() < 78) {
                break;
            }
            String strSubstring = str.substring(0, 78);
            StringBuilder sb = new StringBuilder("|");
            sb.append(strSubstring);
            sb.append("|");
            str = str.substring(78);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("|");
        sb2.append(str);
        for (i = 0; i < 78 - str.length(); i++) {
            sb2.append(" ");
        }
        sb2.append("|");
    }

    public static byte[] F(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream = null;
        if (bArr == null) {
            return null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(bArr);
                    gZIPOutputStream2.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream2.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        if (gZIPOutputStream != null) {
                            gZIPOutputStream.close();
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
    }

    public static o0t a() throws ik {
        return new o0t.a("collection", "1.0", "AMap_collection_1.0").c(new String[]{"com.amap.api.collection"}).d();
    }

    public static String b(long j) {
        return c(j, "yyyyMMdd HH:mm:ss:SSS");
    }

    public static String c(long j, String str) {
        try {
            return new SimpleDateFormat(str, Locale.CHINA).format(new Date(j));
        } catch (Throwable th) {
            j2t.e(th, "ut", "ctt");
            return null;
        }
    }

    public static String d(Context context) {
        String str;
        String[] strArr;
        if (Build.VERSION.SDK_INT < 28) {
            try {
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                Field declaredField = Class.forName(ApplicationInfo.class.getName()).getDeclaredField("primaryCpuAbi");
                declaredField.setAccessible(true);
                str = (String) declaredField.get(applicationInfo);
            } catch (Throwable th) {
                j2t.e(th, "ut", "gct");
                str = "";
            }
        } else {
            str = "";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                String[] strArr2 = (String[]) Build.class.getDeclaredField("SUPPORTED_ABIS").get(null);
                if (strArr2 != null && strArr2.length > 0) {
                    str = strArr2[0];
                }
                if (!TextUtils.isEmpty(str) && Arrays.asList(f29883a).contains(str)) {
                    String str2 = context.getApplicationInfo().nativeLibraryDir;
                    if (!TextUtils.isEmpty(str2)) {
                        if (Arrays.asList(f29884b).contains(str2.substring(str2.lastIndexOf(File.separator) + 1)) && (strArr = (String[]) Build.class.getDeclaredField("SUPPORTED_32_BIT_ABIS").get(null)) != null && strArr.length > 0) {
                            str = strArr[0];
                        }
                    }
                }
            } catch (Throwable th2) {
                j2t.e(th2, "ut", "gct_p");
            }
        }
        return TextUtils.isEmpty(str) ? Build.CPU_ABI : str;
    }

    public static String e(Throwable th) {
        StringWriter stringWriter;
        PrintWriter printWriter;
        try {
            stringWriter = new StringWriter();
            try {
                printWriter = new PrintWriter(stringWriter);
                try {
                    th.printStackTrace(printWriter);
                    for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
                        cause.printStackTrace(printWriter);
                    }
                    String string = stringWriter.toString();
                    try {
                        stringWriter.close();
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                    try {
                        printWriter.close();
                    } catch (Throwable th3) {
                        th3.printStackTrace();
                    }
                    return string;
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        th.printStackTrace();
                        return null;
                    } finally {
                        if (stringWriter != null) {
                            try {
                                stringWriter.close();
                            } catch (Throwable th5) {
                                th5.printStackTrace();
                            }
                        }
                        if (printWriter != null) {
                            try {
                                printWriter.close();
                            } catch (Throwable th6) {
                                th6.printStackTrace();
                            }
                        }
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                printWriter = null;
            }
        } catch (Throwable th8) {
            th = th8;
            stringWriter = null;
            printWriter = null;
        }
    }

    public static String f(Map<String, String> map) {
        if (map.size() == 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            boolean z = true;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (z) {
                    stringBuffer.append(entry.getKey());
                    stringBuffer.append("=");
                    stringBuffer.append(entry.getValue());
                    z = false;
                } else {
                    stringBuffer.append(gv5.CONNECT_STR);
                    stringBuffer.append(entry.getKey());
                    stringBuffer.append("=");
                    stringBuffer.append(entry.getValue());
                }
            }
        } catch (Throwable th) {
            j2t.e(th, "ut", "abP");
        }
        return stringBuffer.toString();
    }

    public static String g(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr);
        }
    }

    public static Calendar h(String str, String str2) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.CHINA);
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(simpleDateFormat.parse(str));
            calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), calendar2.get(11), calendar2.get(12), calendar2.get(13));
            return calendar;
        } catch (ParseException e) {
            j2t.e(e, "ut", "ctt");
            return null;
        }
    }

    public static void i(Context context, String str, String str2, JSONObject jSONObject) {
        String string;
        String string2;
        String strJ = e0t.j(context);
        String strD = m0t.d(strJ);
        String strA = e0t.a(context);
        try {
            if (jSONObject.has("info")) {
                string = jSONObject.getString("info");
                StringBuilder sb = new StringBuilder("请在高德开放平台官网中搜索\"");
                sb.append(string);
                sb.append("\"相关内容进行解决");
            } else {
                string = "";
            }
            if ("INVALID_USER_SCODE".equals(string)) {
                String string3 = jSONObject.has("sec_code") ? jSONObject.getString("sec_code") : "";
                string2 = jSONObject.has("sec_code_debug") ? jSONObject.getString("sec_code_debug") : "";
                if (strD.equals(string3) || strD.equals(string2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(t("C6K+35Zyo6auY5b635byA5pS+5bmz5Y+w5a6Y572R5Lit5pCc57Si"));
                    sb2.append("\"请求内容过长导致业务调用失败\"相关内容进行解决");
                }
            } else if ("INVALID_USER_KEY".equals(string)) {
                string2 = jSONObject.has("key") ? jSONObject.getString("key") : "";
                if (string2.length() > 0 && !strA.equals(string2)) {
                    t("C6K+35Zyo6auY5b635byA5pS+5bmz5Y+w5a6Y572R5LiK5Y+R6LW35oqA5pyv5ZKo6K+i5bel5Y2V4oCUPui0puWPt+S4jktleemXrumimO+8jOWSqOivoklOVkFMSURfVVNFUl9LRVnlpoLkvZXop6PlhrM=");
                }
            }
        } catch (Throwable unused) {
        }
        E("SHA1Package:".concat(String.valueOf(strJ)));
        E("key:".concat(String.valueOf(strA)));
        E("csid:".concat(String.valueOf(str)));
        E("gsid:".concat(String.valueOf(str2)));
        E("json:" + jSONObject.toString());
    }

    public static void j(ByteArrayOutputStream byteArrayOutputStream, byte b2, byte[] bArr) {
        try {
            byteArrayOutputStream.write(new byte[]{b2});
            int i = b2 & 255;
            if (i < 255 && i > 0) {
                byteArrayOutputStream.write(bArr);
            } else if (i == 255) {
                byteArrayOutputStream.write(bArr, 0, 255);
            }
        } catch (IOException e) {
            j2t.e(e, "ut", "wFie");
        }
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, String str) {
        if (TextUtils.isEmpty(str)) {
            try {
                byteArrayOutputStream.write(new byte[]{0});
                return;
            } catch (IOException e) {
                j2t.e(e, "ut", "wsf");
                return;
            }
        }
        int length = str.length();
        if (length > 255) {
            length = 255;
        }
        j(byteArrayOutputStream, (byte) length, n(str));
    }

    public static boolean l(JSONObject jSONObject, String str) {
        return jSONObject != null && jSONObject.has(str);
    }

    public static byte[] m(int i) {
        return new byte[]{(byte) (i / 256), (byte) (i % 256)};
    }

    public static byte[] n(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    public static o0t o() throws ik {
        return new o0t.a(CommonConstants.KEY_COUNTRY, BuildConfig.VERSION_NAME, "AMap_co_1.0.0").c(new String[]{"com.amap.co", "com.amap.opensdk.co", "com.amap.location"}).d();
    }

    public static String p(String str) {
        if (str == null) {
            return null;
        }
        String strI = j0t.i(n(str));
        try {
            return ((char) ((strI.length() % 26) + 65)) + strI;
        } catch (Throwable th) {
            j2t.e(th, "ut", "tsfb64");
            return "";
        }
    }

    public static String q(Map<String, String> map) {
        String string;
        if (map != null) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (sb.length() > 0) {
                    sb.append(gv5.CONNECT_STR);
                }
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
            }
            string = sb.toString();
        } else {
            string = null;
        }
        return B(string);
    }

    public static boolean r(Context context) {
        return f2t.a(context);
    }

    public static byte[] s(byte[] bArr) {
        try {
            return F(bArr);
        } catch (Throwable th) {
            j2t.e(th, "ut", "gZp");
            return new byte[0];
        }
    }

    public static String t(String str) {
        return str.length() < 2 ? "" : j0t.a(str.substring(1));
    }

    public static byte[] u() {
        try {
            String[] strArrSplit = new StringBuffer("16,16,18,77,15,911,121,77,121,911,38,77,911,99,86,67,611,96,48,77,84,911,38,67,021,301,86,67,611,98,48,77,511,77,48,97,511,58,48,97,511,84,501,87,511,96,48,77,221,911,38,77,121,37,86,67,25,301,86,67,021,96,86,67,021,701,86,67,35,56,86,67,611,37,221,87").reverse().toString().split(",");
            byte[] bArr = new byte[strArrSplit.length];
            for (int i = 0; i < strArrSplit.length; i++) {
                bArr[i] = Byte.parseByte(strArrSplit[i]);
            }
            String[] strArrSplit2 = new StringBuffer(new String(j0t.g(new String(bArr)))).reverse().toString().split(",");
            byte[] bArr2 = new byte[strArrSplit2.length];
            for (int i2 = 0; i2 < strArrSplit2.length; i2++) {
                bArr2[i2] = Byte.parseByte(strArrSplit2[i2]);
            }
            return bArr2;
        } catch (Throwable th) {
            j2t.e(th, "ut", "gIV");
            return new byte[16];
        }
    }

    public static byte[] v(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream;
        ZipOutputStream zipOutputStream;
        byte[] byteArray = null;
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
                            try {
                                zipOutputStream.putNextEntry(new ZipEntry("log"));
                                zipOutputStream.write(bArr);
                                zipOutputStream.closeEntry();
                                zipOutputStream.finish();
                                byteArray = byteArrayOutputStream.toByteArray();
                                try {
                                    zipOutputStream.close();
                                } catch (Throwable th) {
                                    j2t.e(th, "ut", "zp1");
                                }
                                byteArrayOutputStream.close();
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    j2t.e(th, "ut", "zp");
                                    if (zipOutputStream != null) {
                                        try {
                                            zipOutputStream.close();
                                        } catch (Throwable th3) {
                                            j2t.e(th3, "ut", "zp1");
                                        }
                                    }
                                    if (byteArrayOutputStream != null) {
                                    }
                                    return byteArray;
                                } finally {
                                    if (zipOutputStream != null) {
                                        try {
                                            zipOutputStream.close();
                                        } catch (Throwable th4) {
                                            j2t.e(th4, "ut", "zp1");
                                        }
                                    }
                                    if (byteArrayOutputStream != null) {
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (Throwable th5) {
                                            j2t.e(th5, "ut", "zp2");
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            zipOutputStream = null;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        byteArrayOutputStream = null;
                        zipOutputStream = null;
                    }
                    return byteArray;
                }
            } catch (Throwable th8) {
            }
        }
        return null;
    }

    public static PublicKey w() throws InvalidKeySpecException, NoSuchAlgorithmException, IOException, CertificateException, NullPointerException {
        ByteArrayInputStream byteArrayInputStream;
        try {
            byteArrayInputStream = new ByteArrayInputStream(j0t.g("MIICnjCCAgegAwIBAgIJAJ0Pdzos7ZfYMA0GCSqGSIb3DQEBBQUAMGgxCzAJBgNVBAYTAkNOMRMwEQYDVQQIDApTb21lLVN0YXRlMRAwDgYDVQQHDAdCZWlqaW5nMREwDwYDVQQKDAhBdXRvbmF2aTEfMB0GA1UEAwwWY29tLmF1dG9uYXZpLmFwaXNlcnZlcjAeFw0xMzA4MTUwNzU2NTVaFw0yMzA4MTMwNzU2NTVaMGgxCzAJBgNVBAYTAkNOMRMwEQYDVQQIDApTb21lLVN0YXRlMRAwDgYDVQQHDAdCZWlqaW5nMREwDwYDVQQKDAhBdXRvbmF2aTEfMB0GA1UEAwwWY29tLmF1dG9uYXZpLmFwaXNlcnZlcjCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEA8eWAyHbFPoFPfdx5AD+D4nYFq4dbJ1p7SIKt19Oz1oivF/6H43v5Fo7s50pD1UF8+Qu4JoUQxlAgOt8OCyQ8DYdkaeB74XKb1wxkIYg/foUwN1CMHPZ9O9ehgna6K4EJXZxR7Y7XVZnbjHZIVn3VpPU/Rdr2v37LjTw+qrABJxMCAwEAAaNQME4wHQYDVR0OBBYEFOM/MLGP8xpVFuVd+3qZkw7uBvOTMB8GA1UdIwQYMBaAFOM/MLGP8xpVFuVd+3qZkw7uBvOTMAwGA1UdEwQFMAMBAf8wDQYJKoZIhvcNAQEFBQADgYEA4LY3g8aAD8JkxAOqUXDDyLuCCGOc2pTIhn0TwMNaVdH4hZlpTeC/wuRD5LJ0z3j+IQ0vLvuQA5uDjVyEOlBrvVIGwSem/1XGUo13DfzgAJ5k1161S5l+sFUo5TxpHOXr8Z5nqJMjieXmhnE/I99GFyHpQmw4cC6rhYUhdhtg+Zk="));
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance(t("IWC41MDk"));
                KeyFactory keyFactory = KeyFactory.getInstance(t("EUlNB"));
                Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(byteArrayInputStream);
                if (certificateGenerateCertificate != null && keyFactory != null) {
                    PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(new X509EncodedKeySpec(certificateGenerateCertificate.getPublicKey().getEncoded()));
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    return publicKeyGeneratePublic;
                }
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
                return null;
            } catch (Throwable unused) {
                if (byteArrayInputStream != null) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th3.printStackTrace();
                    }
                }
                return null;
            }
        } catch (Throwable unused2) {
            byteArrayInputStream = null;
        }
    }

    public static byte[] x(String str) {
        if (str.length() % 2 != 0) {
            str = "0".concat(str);
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
        }
        return bArr;
    }

    public static byte[] y(byte[] bArr) {
        try {
            return F(bArr);
        } catch (Throwable th) {
            th.printStackTrace();
            return new byte[0];
        }
    }

    public static String z(byte[] bArr) {
        try {
            return D(bArr);
        } catch (Throwable th) {
            j2t.e(th, "ut", "h2s");
            return null;
        }
    }
}
