package defpackage;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
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

/* JADX INFO: loaded from: classes4.dex */
public final class nu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CookieManager f43722a = new CookieManager();

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f43723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f43724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<String, List<String>> f43725c;

        public b(Map<String, List<String>> map, String str, byte[] bArr) {
            this.f43725c = map;
            this.f43723a = str;
            this.f43724b = bArr;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f43726b;
        public final byte[] d;
        public final Map<String, String> e;

        public c(String str, Map<String, String> map, byte[] bArr) {
            this.f43726b = str;
            this.d = bArr;
            this.e = map;
        }

        public String toString() {
            return String.format("<UrlConnectionConfigure url=%s headers=%s>", this.f43726b, this.e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a4 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x019a A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x019f A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    public static b d(Context context, c cVar) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        if (context == null) {
            return null;
        }
        try {
            oq.c("mspl", "conn config: " + cVar);
            URL url = new URL(cVar.f43726b);
            Proxy proxyE = e(context);
            oq.c("mspl", "conn proxy: " + proxyE);
            httpURLConnection = proxyE != null ? (HttpURLConnection) url.openConnection(proxyE) : (HttpURLConnection) url.openConnection();
            try {
                System.setProperty("http.keepAlive", "false");
                if (httpURLConnection instanceof HttpsURLConnection) {
                }
                CookieManager cookieManager = f43722a;
                if (cookieManager.getCookieStore().getCookies().size() > 0) {
                    httpURLConnection.setRequestProperty("Cookie", TextUtils.join(";", cookieManager.getCookieStore().getCookies()));
                }
                httpURLConnection.setConnectTimeout(20000);
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setRequestProperty("User-Agent", "msp");
                byte[] bArr = cVar.d;
                if (bArr == null || bArr.length <= 0) {
                    httpURLConnection.setRequestMethod("GET");
                } else {
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", "application/octet-stream;binary/octet-stream");
                    httpURLConnection.setRequestProperty("Accept-Charset", "UTF-8");
                    httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
                    httpURLConnection.setRequestProperty("Keep-Alive", "timeout=180, max=100");
                }
                Map<String, String> map = cVar.e;
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (entry.getKey() != null) {
                            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                }
                httpURLConnection.setDoInput(true);
                if ("POST".equals(httpURLConnection.getRequestMethod())) {
                    httpURLConnection.setDoOutput(true);
                }
                if ("POST".equals(httpURLConnection.getRequestMethod())) {
                    bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                    try {
                        bufferedOutputStream.write(cVar.d);
                        bufferedOutputStream.flush();
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedInputStream = null;
                        try {
                            oq.c(th);
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
                    bufferedOutputStream = null;
                }
                bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                try {
                    byte[] bArrA = a(bufferedInputStream);
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    String strJoin = (headerFields == null || headerFields.get(null) == null) ? null : TextUtils.join(",", headerFields.get(null));
                    List<String> list = headerFields.get("Set-Cookie");
                    if (list != null) {
                        Iterator<String> it = list.iterator();
                        while (it.hasNext()) {
                            List<HttpCookie> list2 = HttpCookie.parse(it.next());
                            if (list2 != null && !list2.isEmpty()) {
                                f43722a.getCookieStore().add(url.toURI(), list2.get(0));
                            }
                        }
                    }
                    b bVar = new b(headerFields, strJoin, bArrA);
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable unused4) {
                    }
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable unused5) {
                    }
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (Throwable unused6) {
                        }
                    }
                    return bVar;
                } catch (Throwable th3) {
                    th = th3;
                    oq.c(th);
                    return null;
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedInputStream = null;
                bufferedOutputStream = null;
                oq.c(th);
                return null;
            }
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
        }
    }

    public static Proxy e(Context context) {
        String strC = c(context);
        if (strC != null && !strC.contains("wap")) {
            return null;
        }
        try {
            String property = System.getProperty("https.proxyHost");
            String property2 = System.getProperty("https.proxyPort");
            if (!TextUtils.isEmpty(property)) {
                return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, Integer.parseInt(property2)));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String c(Context context) {
        try {
            NetworkInfo networkInfoB = pd.b(null, context);
            if (networkInfoB == null || !networkInfoB.isAvailable()) {
                return "none";
            }
            if (networkInfoB.getType() == 1) {
                return "wifi";
            }
            return networkInfoB.getExtraInfo().toLowerCase();
        } catch (Exception unused) {
            return "none";
        }
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr, 0, 1024);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
