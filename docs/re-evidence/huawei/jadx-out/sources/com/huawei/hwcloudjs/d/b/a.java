package com.huawei.hwcloudjs.d.b;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.network.embedded.w9;
import com.huawei.hwcloudjs.f.d;
import com.huawei.hwcloudjs.f.h;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes37.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f17080a = "POST";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f17081b = "BaseRequest";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f17082c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 10;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.huawei.hwcloudjs.d.b.a] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.StringBuilder] */
    public <T extends com.huawei.hwcloudjs.d.b.a.c> T a(com.huawei.hwcloudjs.d.b.a.b<T> bVar, Context context) throws Throwable {
        DataOutputStream dataOutputStream;
        String str;
        ?? D = bVar.d();
        d.c(f17081b, "doRequest begin", true);
        d.c(f17081b, "doRequest urlStr:" + D, false);
        T t = (T) bVar.c();
        InputStream inputStream = null;
        try {
            try {
                HttpURLConnection httpURLConnectionA = a(D, bVar.f(), bVar.b(), context);
                if (httpURLConnectionA == null) {
                    t.b(10);
                    h.a(null);
                    h.a(null);
                    return t;
                }
                httpURLConnectionA.connect();
                String strA = bVar.a();
                d.c(f17081b, "genBody:" + strA, false);
                if (TextUtils.isEmpty(strA)) {
                    dataOutputStream = null;
                } else {
                    dataOutputStream = new DataOutputStream(httpURLConnectionA.getOutputStream());
                    try {
                        dataOutputStream.write(strA.getBytes("UTF-8"));
                        dataOutputStream.flush();
                    } catch (IOException unused) {
                        t.b(3);
                        str = "geturl failed IOException";
                        d.b(f17081b, str, true);
                        h.a(null);
                        h.a(dataOutputStream);
                        return t;
                    } catch (RuntimeException e2) {
                        e = e2;
                        t.b(10);
                        str = "doRequest RuntimeException:" + e.getClass().getSimpleName();
                        d.b(f17081b, str, true);
                        h.a(null);
                        h.a(dataOutputStream);
                        return t;
                    }
                }
                int responseCode = httpURLConnectionA.getResponseCode();
                if (responseCode == 200) {
                    d.c(f17081b, "urlConnection getResponseCode:" + responseCode, false);
                    inputStream = httpURLConnectionA.getInputStream();
                    String strA2 = a(inputStream);
                    t.b(1);
                    t.a(responseCode);
                    HashMap map = new HashMap();
                    String[] strArrA = t.a();
                    if (strArrA.length > 0) {
                        for (String str2 : strArrA) {
                            map.put(str2, httpURLConnectionA.getHeaderField(str2));
                        }
                    }
                    d.c(f17081b, "readStream res:" + strA2, false);
                    t.a(strA2, map);
                } else {
                    d.b(f17081b, "geturl failed" + responseCode, true);
                    t.b(2);
                    t.a(responseCode);
                }
                h.a(inputStream);
                h.a(dataOutputStream);
                return t;
            } catch (Throwable th) {
                th = th;
                h.a(null);
                h.a(D);
                throw th;
            }
        } catch (IOException unused2) {
            dataOutputStream = null;
        } catch (RuntimeException e3) {
            e = e3;
            dataOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            D = 0;
            h.a(null);
            h.a(D);
            throw th;
        }
    }

    private HttpURLConnection a(String str, String str2, String str3, Context context) {
        HttpURLConnection httpURLConnectionA;
        try {
            httpURLConnectionA = a(str, context);
            try {
                if (httpURLConnectionA == null) {
                    d.c(f17081b, "urlConnection is null", true);
                    return httpURLConnectionA;
                }
                httpURLConnectionA.setRequestMethod(str2);
                httpURLConnectionA.setDoInput(true);
                if (str2.equalsIgnoreCase("POST")) {
                    httpURLConnectionA.setDoOutput(true);
                }
                httpURLConnectionA.setUseCaches(false);
                httpURLConnectionA.setConnectTimeout(60000);
                httpURLConnectionA.setReadTimeout(60000);
                httpURLConnectionA.setRequestProperty("Connection", w9.j);
                httpURLConnectionA.setRequestProperty("Charset", "UTF-8");
                if (str3 != null) {
                    httpURLConnectionA.setRequestProperty("Content-Type", str3);
                }
                return httpURLConnectionA;
            } catch (IOException unused) {
                d.b(f17081b, "getURLConnection IOException", true);
                return httpURLConnectionA;
            }
        } catch (IOException unused2) {
            httpURLConnectionA = null;
        }
    }

    private HttpURLConnection a(String str, Context context) {
        String str2;
        HttpsURLConnection httpsURLConnection = null;
        try {
            d.c(f17081b, "getUrlConnection urlString:" + str, false);
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            if (str.startsWith("http://")) {
                if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                    return (HttpURLConnection) uRLConnectionOpenConnection;
                }
            } else if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) uRLConnectionOpenConnection;
                try {
                    c.a(httpsURLConnection2, context);
                    return httpsURLConnection2;
                } catch (MalformedURLException unused) {
                    httpsURLConnection = httpsURLConnection2;
                    str2 = "getUrlConnection MalformedURLException";
                    d.b(f17081b, str2, true);
                    return httpsURLConnection;
                } catch (IOException unused2) {
                    httpsURLConnection = httpsURLConnection2;
                    str2 = "getUrlConnection IOException";
                    d.b(f17081b, str2, true);
                    return httpsURLConnection;
                }
            }
            d.b(f17081b, "getURLConnection url.openConnection() is error", true);
            return null;
        } catch (MalformedURLException unused3) {
        } catch (IOException unused4) {
        }
    }

    private String a(InputStream inputStream) {
        StringBuilder sb;
        d.c(f17081b, "readStream begin", true);
        d.c(f17081b, "readStream inStream:" + inputStream, false);
        String string = "";
        if (inputStream == null) {
            d.b(f17081b, "readStream inStream is null", true);
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                try {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (IOException e2) {
                    d.b(f17081b, "readStream IOException:" + e2.getClass().getSimpleName(), true);
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e3) {
                        e = e3;
                        sb = new StringBuilder("outStream IOException:");
                        sb.append(e.getClass().getSimpleName());
                        d.b(f17081b, sb.toString(), true);
                    }
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e4) {
                    d.b(f17081b, "outStream IOException:" + e4.getClass().getSimpleName(), true);
                }
                throw th;
            }
        }
        string = byteArrayOutputStream.toString("UTF-8");
        try {
            byteArrayOutputStream.close();
        } catch (IOException e5) {
            e = e5;
            sb = new StringBuilder("outStream IOException:");
            sb.append(e.getClass().getSimpleName());
            d.b(f17081b, sb.toString(), true);
        }
        d.c(f17081b, "readStream response:" + string, false);
        return string;
    }
}
