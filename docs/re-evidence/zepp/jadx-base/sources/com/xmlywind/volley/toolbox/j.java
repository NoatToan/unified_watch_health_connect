package com.xmlywind.volley.toolbox;

import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes22.dex */
public class j extends com.xmlywind.volley.toolbox.a {
    private final b a;
    private final SSLSocketFactory b;

    public static class a extends FilterInputStream {
        private final HttpURLConnection a;

        public a(HttpURLConnection httpURLConnection) {
            super(j.b(httpURLConnection));
            this.a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.a.disconnect();
        }
    }

    public interface b {
        String a(String str);
    }

    public j(b bVar, SSLSocketFactory sSLSocketFactory) {
        this.a = bVar;
        this.b = sSLSocketFactory;
    }

    private HttpURLConnection a(URL url, com.xmlywind.volley.l<?> lVar) {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection httpURLConnectionA = a(url);
        int iP = lVar.p();
        httpURLConnectionA.setConnectTimeout(lVar.q());
        httpURLConnectionA.setReadTimeout(iP);
        httpURLConnectionA.setUseCaches(false);
        httpURLConnectionA.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.b) != null) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnectionA;
            httpsURLConnection.setSSLSocketFactory(sSLSocketFactory);
            httpsURLConnection.setHostnameVerifier(new HostnameVerifier() { // from class: com.xmlywind.volley.toolbox.j.1
                @Override // javax.net.ssl.HostnameVerifier
                public boolean verify(String str, SSLSession sSLSession) {
                    return true;
                }
            });
        }
        return httpURLConnectionA;
    }

    public static List<com.xmlywind.volley.e> a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it2 = entry.getValue().iterator();
                while (it2.hasNext()) {
                    arrayList.add(new com.xmlywind.volley.e(entry.getKey(), it2.next()));
                }
            }
        }
        return arrayList;
    }

    public static void a(HttpURLConnection httpURLConnection, com.xmlywind.volley.l<?> lVar) throws ProtocolException {
        String str;
        String str2;
        switch (lVar.f()) {
            case -1:
                byte[] bArrB = lVar.b();
                if (bArrB != null) {
                    httpURLConnection.setRequestMethod("POST");
                    a(httpURLConnection, lVar, bArrB);
                    return;
                }
                return;
            case 0:
                str = "GET";
                httpURLConnection.setRequestMethod(str);
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                b(httpURLConnection, lVar);
                return;
            case 2:
                str2 = FirebasePerformance.HttpMethod.PUT;
                httpURLConnection.setRequestMethod(str2);
                b(httpURLConnection, lVar);
                return;
            case 3:
                str = FirebasePerformance.HttpMethod.DELETE;
                httpURLConnection.setRequestMethod(str);
                return;
            case 4:
                str = "HEAD";
                httpURLConnection.setRequestMethod(str);
                return;
            case 5:
                str = FirebasePerformance.HttpMethod.OPTIONS;
                httpURLConnection.setRequestMethod(str);
                return;
            case 6:
                str = FirebasePerformance.HttpMethod.TRACE;
                httpURLConnection.setRequestMethod(str);
                return;
            case 7:
                str2 = "PATCH";
                httpURLConnection.setRequestMethod(str2);
                b(httpURLConnection, lVar);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    private static void a(HttpURLConnection httpURLConnection, com.xmlywind.volley.l<?> lVar, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Type", lVar.a());
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    private static boolean a(int i, int i2) {
        return (i == 4 || (100 <= i2 && i2 < 200) || i2 == 204 || i2 == 304) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private static void b(HttpURLConnection httpURLConnection, com.xmlywind.volley.l<?> lVar) {
        byte[] bArrB = lVar.b();
        if (bArrB != null) {
            a(httpURLConnection, lVar, bArrB);
        }
    }

    @Override // com.xmlywind.volley.toolbox.a
    public i a(com.xmlywind.volley.l<?> lVar, Map<String, String> map) throws Throwable {
        Throwable th;
        boolean z;
        String strH = lVar.h();
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(lVar.c());
        b bVar = this.a;
        if (bVar != null) {
            String strA = bVar.a(strH);
            if (strA == null) {
                throw new IOException("URL blocked by rewriter: " + strH);
            }
            strH = strA;
        }
        HttpURLConnection httpURLConnectionA = a(new URL(strH), lVar);
        try {
            for (String str : map2.keySet()) {
                httpURLConnectionA.setRequestProperty(str, (String) map2.get(str));
            }
            a(httpURLConnectionA, lVar);
            int responseCode = httpURLConnectionA.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if (!a(lVar.f(), responseCode)) {
                i iVar = new i(responseCode, a(httpURLConnectionA.getHeaderFields()));
                httpURLConnectionA.disconnect();
                return iVar;
            }
            z = true;
            try {
                return new i(responseCode, a(httpURLConnectionA.getHeaderFields()), httpURLConnectionA.getContentLength(), new a(httpURLConnectionA));
            } catch (Throwable th2) {
                th = th2;
                if (!z) {
                    httpURLConnectionA.disconnect();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }

    public HttpURLConnection a(URL url) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpURLConnection;
    }
}
