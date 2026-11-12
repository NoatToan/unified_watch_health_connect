package com.miui.privacypolicy;

import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.passport.utils.HttpHeaders;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import defpackage.mm9;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import kotlin.text.Typography;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class NetUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f10320a = f("ro.miui.ui.version.name", "unknown");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f10321b = f("ro.product.mod_device", "").contains("_global");

    public enum HttpMethod {
        GET,
        POST,
        PUT,
        DELETE
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10322a;

        static {
            int[] iArr = new int[HttpMethod.values().length];
            f10322a = iArr;
            try {
                iArr[HttpMethod.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10322a[HttpMethod.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10322a[HttpMethod.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10322a[HttpMethod.PUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f10323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10324b;

        public b(String str, String str2) {
            this.f10323a = str;
            this.f10324b = str2;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return this.f10323a.compareTo(bVar.f10323a);
        }
    }

    public static void a(HttpURLConnection httpURLConnection, JSONObject jSONObject) throws IOException {
        String string = jSONObject.toString();
        if (TextUtils.isEmpty(string)) {
            return;
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.addRequestProperty("Content-Type", HttpHeaders.CONTENT_TYPE_JSON);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.writeBytes(string);
        dataOutputStream.flush();
        dataOutputStream.close();
    }

    public static String b(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        try {
            boolean z = true;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!z) {
                    sb.append(Typography.amp);
                }
                sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb.append('=');
                sb.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                z = false;
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding not supported: " + ((Object) sb), e);
        }
    }

    public static byte[] c(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    public static String d(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
            messageDigest.update(c(str));
            return String.format("%1$032X", new BigInteger(1, messageDigest.digest()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static String e(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new b(entry.getKey(), entry.getValue()));
        }
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b bVar = (b) arrayList.get(i);
            sb.append(bVar.f10323a);
            sb.append("=");
            sb.append(bVar.f10324b);
        }
        sb.append(str);
        return d(new String(Base64.encodeToString(c(sb.toString()), 2))).toUpperCase();
    }

    public static String f(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    public static HttpURLConnection g(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }

    public static String h(Map<String, String> map, String str, HttpMethod httpMethod, JSONObject jSONObject) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream = null;
        try {
            if (httpMethod == HttpMethod.GET && map != null) {
                String strB = b(map);
                str = str.contains("?") ? str.concat(strB) : str.concat("?").concat(strB);
            }
            HttpURLConnection httpURLConnectionG = g(new URL(str));
            i(httpURLConnectionG, httpMethod, map, jSONObject);
            if (httpURLConnectionG.getResponseCode() != 200) {
                mm9.a(null);
                mm9.b(null);
                return "";
            }
            InputStream inputStream2 = httpURLConnectionG.getInputStream();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = inputStream2.read(bArr);
                        if (i == -1) {
                            String string = byteArrayOutputStream.toString();
                            mm9.a(inputStream2);
                            mm9.b(byteArrayOutputStream);
                            return string;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                } catch (Exception e) {
                    inputStream = inputStream2;
                    e = e;
                } catch (Throwable th) {
                    inputStream = inputStream2;
                    th = th;
                    mm9.a(inputStream);
                    mm9.b(byteArrayOutputStream);
                    throw th;
                }
            } catch (Exception e2) {
                inputStream = inputStream2;
                e = e2;
                byteArrayOutputStream = null;
            } catch (Throwable th2) {
                inputStream = inputStream2;
                th = th2;
                byteArrayOutputStream = null;
            }
        } catch (Exception e3) {
            e = e3;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        try {
            e.printStackTrace();
            mm9.a(inputStream);
            mm9.b(byteArrayOutputStream);
            return "";
        } catch (Throwable th4) {
            th = th4;
            mm9.a(inputStream);
            mm9.b(byteArrayOutputStream);
            throw th;
        }
    }

    public static void i(HttpURLConnection httpURLConnection, HttpMethod httpMethod, Map<String, String> map, JSONObject jSONObject) throws IOException {
        httpURLConnection.addRequestProperty("sign", e(map, "2dcd9s0c-ad3f-2fas-0l3a-abzo301jd0s9"));
        httpURLConnection.addRequestProperty("timestamp", map.get("timestamp"));
        httpURLConnection.addRequestProperty("source", "sdk");
        int i = a.f10322a[httpMethod.ordinal()];
        if (i == 1) {
            httpURLConnection.setRequestMethod("GET");
            return;
        }
        if (i == 2) {
            httpURLConnection.setRequestMethod("DELETE");
            return;
        }
        if (i == 3) {
            httpURLConnection.setRequestMethod("POST");
            a(httpURLConnection, jSONObject);
        } else {
            if (i != 4) {
                throw new IllegalStateException("Unknown method type.");
            }
            httpURLConnection.setRequestMethod("PUT");
        }
    }
}
