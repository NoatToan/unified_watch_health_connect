package eh;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Pair;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import nh.d;
import oh.c;
import org.apache.commons.lang3.BooleanUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CookieManager f64019a = new CookieManager();

    /* JADX INFO: renamed from: eh.a$a, reason: collision with other inner class name */
    public static final class C1357a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f64021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<String, String> f64022c;

        public C1357a(String str, Map<String, String> map, byte[] bArr) {
            this.f64020a = str;
            this.f64021b = bArr;
            this.f64022c = map;
        }

        public final String toString() {
            return String.format("<UrlConnectionConfigure url=%s headers=%s>", this.f64020a, this.f64022c);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, List<String>> f64023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f64024b;

        public b(Map<String, List<String>> map, String str, byte[] bArr) {
            this.f64023a = map;
            this.f64024b = bArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x018c A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0191 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0196 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    public static b a(Context context, C1357a c1357a) {
        Throwable th3;
        HttpURLConnection httpURLConnection;
        Throwable th4;
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        CookieManager cookieManager = f64019a;
        if (context != null) {
            try {
                c1357a.toString();
                String str = c1357a.f64020a;
                byte[] bArr = c1357a.f64021b;
                URL url = new URL(str);
                Proxy proxyB = b(context);
                Objects.toString(proxyB);
                httpURLConnection = proxyB != null ? (HttpURLConnection) url.openConnection(proxyB) : (HttpURLConnection) url.openConnection();
                try {
                    System.setProperty("http.keepAlive", BooleanUtils.FALSE);
                    if (cookieManager.getCookieStore().getCookies().size() > 0) {
                        httpURLConnection.setRequestProperty(HttpHeaders.COOKIE, TextUtils.join(";", cookieManager.getCookieStore().getCookies()));
                    }
                    httpURLConnection.setConnectTimeout(20000);
                    httpURLConnection.setReadTimeout(30000);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, "msp");
                    if (bArr == null || bArr.length <= 0) {
                        httpURLConnection.setRequestMethod(FirebasePerformance.HttpMethod.GET);
                    } else {
                        httpURLConnection.setRequestMethod(FirebasePerformance.HttpMethod.POST);
                        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/octet-stream;binary/octet-stream");
                        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_CHARSET, "UTF-8");
                        httpURLConnection.setRequestProperty(HttpHeaders.CONNECTION, HttpHeaders.KEEP_ALIVE);
                        httpURLConnection.setRequestProperty(HttpHeaders.KEEP_ALIVE, "timeout=180, max=100");
                    }
                    Map<String, String> map = c1357a.f64022c;
                    if (map != null) {
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            if (entry.getKey() != null) {
                                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    httpURLConnection.setDoInput(true);
                    if (FirebasePerformance.HttpMethod.POST.equals(httpURLConnection.getRequestMethod())) {
                        httpURLConnection.setDoOutput(true);
                    }
                    if (FirebasePerformance.HttpMethod.POST.equals(httpURLConnection.getRequestMethod())) {
                        bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                        try {
                            bufferedOutputStream.write(bArr);
                            bufferedOutputStream.flush();
                        } catch (Throwable th5) {
                            th4 = th5;
                            bufferedInputStream = null;
                            try {
                                d.a(th4);
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
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr2 = new byte[1024];
                        while (true) {
                            int i14 = bufferedInputStream.read(bArr2, 0, 1024);
                            if (i14 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr2, 0, i14);
                        }
                        byteArrayOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        String strJoin = (headerFields == null || headerFields.get(null) == null) ? null : TextUtils.join(",", headerFields.get(null));
                        List<String> list = headerFields.get(HttpHeaders.SET_COOKIE);
                        if (list != null) {
                            Iterator<String> it = list.iterator();
                            while (it.hasNext()) {
                                List<HttpCookie> list2 = HttpCookie.parse(it.next());
                                if (list2 != null && !list2.isEmpty()) {
                                    cookieManager.getCookieStore().add(url.toURI(), list2.get(0));
                                }
                            }
                        }
                        b bVar = new b(headerFields, strJoin, byteArray);
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
                    } catch (Throwable th6) {
                        th4 = th6;
                        d.a(th4);
                        return null;
                    }
                } catch (Throwable th7) {
                    th3 = th7;
                    th4 = th3;
                    bufferedOutputStream = null;
                    bufferedInputStream = null;
                    d.a(th4);
                    return null;
                }
            } catch (Throwable th8) {
                th3 = th8;
                httpURLConnection = null;
            }
        }
        return null;
    }

    public static Proxy b(Context context) {
        String lowerCase = "none";
        try {
            ConcurrentHashMap<Integer, Pair<Long, ?>> concurrentHashMap = oh.a.f132147a;
            Context applicationContext = context == null ? null : context.getApplicationContext();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            NetworkInfo networkInfo = (NetworkInfo) oh.a.b(2, 10L, timeUnit, new c(), new oh.d(applicationContext), false, 10L, timeUnit, null, false);
            if (networkInfo != null && networkInfo.isAvailable()) {
                lowerCase = networkInfo.getType() == 1 ? "wifi" : networkInfo.getExtraInfo().toLowerCase();
            }
        } catch (Exception unused) {
        }
        if (lowerCase != null && !lowerCase.contains("wap")) {
            return null;
        }
        try {
            String property = System.getProperty("https.proxyHost");
            String property2 = System.getProperty("https.proxyPort");
            if (TextUtils.isEmpty(property)) {
                return null;
            }
            return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, Integer.parseInt(property2)));
        } catch (Throwable unused2) {
            return null;
        }
    }
}
