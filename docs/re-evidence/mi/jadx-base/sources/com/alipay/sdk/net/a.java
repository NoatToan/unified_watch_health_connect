package com.alipay.sdk.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.alipay.sdk.util.c;
import com.example.statistics.export.OneTrackConstant;
import com.miui.tsmclient.common.net.NetConstants;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CookieManager f5848a = new CookieManager();

    /* JADX INFO: renamed from: com.alipay.sdk.net.a$a, reason: collision with other inner class name */
    public static final class C0119a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f5850b;
        public final Map<String, String> c;

        public C0119a(String str, Map<String, String> map, byte[] bArr) {
            this.f5849a = str;
            this.f5850b = bArr;
            this.c = map;
        }

        public String toString() {
            return String.format("<UrlConnectionConfigure url=%s headers=%s>", this.f5849a, this.c);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, List<String>> f5851a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f5852b;
        public final byte[] c;

        public b(Map<String, List<String>> map, String str, byte[] bArr) {
            this.f5851a = map;
            this.f5852b = str;
            this.c = bArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01aa A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x01af A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x01b4 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    public static b a(Context context, C0119a c0119a) {
        HttpURLConnection httpURLConnection;
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        if (context == null) {
            return null;
        }
        try {
            c.f("mspl", "conn config: " + c0119a);
            URL url = new URL(c0119a.f5849a);
            Proxy proxyB = b(context);
            c.f("mspl", "conn proxy: " + proxyB);
            HttpURLConnection httpURLConnection2 = proxyB != null ? (HttpURLConnection) url.openConnection(proxyB) : (HttpURLConnection) url.openConnection();
            try {
                System.setProperty("http.keepAlive", "false");
                if (httpURLConnection2 instanceof HttpsURLConnection) {
                }
                CookieManager cookieManager = f5848a;
                if (cookieManager.getCookieStore().getCookies().size() > 0) {
                    httpURLConnection2.setRequestProperty(NetConstants.COOKIE, TextUtils.join(";", cookieManager.getCookieStore().getCookies()));
                }
                httpURLConnection2.setConnectTimeout(ErrorCode.ERROR_CODE_INVALID_PARAM);
                httpURLConnection2.setReadTimeout(30000);
                httpURLConnection2.setInstanceFollowRedirects(true);
                httpURLConnection2.setRequestProperty("User-Agent", "msp");
                byte[] bArr = c0119a.f5850b;
                if (bArr == null || bArr.length <= 0) {
                    httpURLConnection2.setRequestMethod("GET");
                } else {
                    httpURLConnection2.setRequestMethod("POST");
                    httpURLConnection2.setRequestProperty("Content-Type", "application/octet-stream;binary/octet-stream");
                    httpURLConnection2.setRequestProperty("Accept-Charset", "UTF-8");
                    httpURLConnection2.setRequestProperty(HTTP.CONN_DIRECTIVE, HTTP.CONN_KEEP_ALIVE);
                    httpURLConnection2.setRequestProperty(HTTP.CONN_KEEP_ALIVE, "timeout=180, max=100");
                }
                Map<String, String> map = c0119a.c;
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (entry.getKey() != null) {
                            httpURLConnection2.setRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                }
                httpURLConnection2.setDoInput(true);
                if ("POST".equals(httpURLConnection2.getRequestMethod())) {
                    httpURLConnection2.setDoOutput(true);
                }
                if ("POST".equals(httpURLConnection2.getRequestMethod())) {
                    bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                    try {
                        bufferedOutputStream2.write(c0119a.f5850b);
                        bufferedOutputStream2.flush();
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        bufferedInputStream = null;
                        Throwable th2 = th;
                        httpURLConnection = httpURLConnection2;
                        th = th2;
                        try {
                            c.d(th);
                            return null;
                        } finally {
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Throwable unused) {
                                }
                            }
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (Throwable unused2) {
                                }
                            }
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (Throwable unused3) {
                                }
                            }
                        }
                    }
                } else {
                    bufferedOutputStream2 = null;
                }
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(httpURLConnection2.getInputStream());
                try {
                    byte[] bArrC = c(bufferedInputStream2);
                    Map<String, List<String>> headerFields = httpURLConnection2.getHeaderFields();
                    String strJoin = (headerFields == null || headerFields.get(null) == null) ? null : TextUtils.join(",", headerFields.get(null));
                    List<String> list = headerFields.get("Set-Cookie");
                    if (list != null) {
                        Iterator<String> it = list.iterator();
                        while (it.hasNext()) {
                            List<HttpCookie> list2 = HttpCookie.parse(it.next());
                            if (list2 != null && !list2.isEmpty()) {
                                f5848a.getCookieStore().add(url.toURI(), list2.get(0));
                            }
                        }
                    }
                    b bVar = new b(headerFields, strJoin, bArrC);
                    try {
                        httpURLConnection2.disconnect();
                    } catch (Throwable unused4) {
                    }
                    try {
                        bufferedInputStream2.close();
                    } catch (Throwable unused5) {
                    }
                    if (bufferedOutputStream2 != null) {
                        try {
                            bufferedOutputStream2.close();
                        } catch (Throwable unused6) {
                        }
                    }
                    return bVar;
                } catch (Throwable th3) {
                    httpURLConnection = httpURLConnection2;
                    th = th3;
                    bufferedOutputStream = bufferedOutputStream2;
                    bufferedInputStream = bufferedInputStream2;
                    c.d(th);
                    return null;
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedInputStream = null;
                bufferedOutputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
            bufferedInputStream = null;
            bufferedOutputStream = null;
        }
    }

    public static Proxy b(Context context) {
        String strE = e(context);
        if (strE != null && !strE.contains("wap")) {
            return null;
        }
        try {
            String property = System.getProperty("https.proxyHost");
            String property2 = System.getProperty("https.proxyPort");
            if (TextUtils.isEmpty(property)) {
                return null;
            }
            return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, Integer.parseInt(property2)));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static byte[] c(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr, 0, 1024);
            if (i == -1) {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static NetworkInfo d(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return ((ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY)).getActiveNetworkInfo();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String e(Context context) {
        try {
            NetworkInfo networkInfoD = d(context);
            if (networkInfoD != null && networkInfoD.isAvailable()) {
                return networkInfoD.getType() == 1 ? "wifi" : networkInfoD.getExtraInfo().toLowerCase();
            }
        } catch (Exception unused) {
        }
        return "none";
    }
}
