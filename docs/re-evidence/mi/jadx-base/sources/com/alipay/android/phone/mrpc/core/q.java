package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.example.statistics.export.OneTrackConstant;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Callable<u> {
    private static final HttpRequestRetryHandler e = new ad();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected l f5754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f5755b;
    protected o c;
    String d;
    private HttpUriRequest f;
    private CookieManager i;
    private AbstractHttpEntity j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private HttpHost f5756k;
    private URL l;
    private String q;
    private HttpContext g = new BasicHttpContext();
    private CookieStore h = new BasicCookieStore();
    private int m = 0;
    private boolean n = false;
    private boolean o = false;
    private String p = null;

    public q(l lVar, o oVar) {
        this.f5754a = lVar;
        this.f5755b = lVar.f5749a;
        this.c = oVar;
    }

    private static long a(String[] strArr) {
        String str;
        for (int i = 0; i < strArr.length; i++) {
            if ("max-age".equalsIgnoreCase(strArr[i]) && (str = strArr[i + 1]) != null) {
                try {
                    return Long.parseLong(str);
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return 0L;
    }

    private static long b(HttpResponse httpResponse) {
        Header firstHeader = httpResponse.getFirstHeader("Cache-Control");
        if (firstHeader != null) {
            String[] strArrSplit = firstHeader.getValue().split("=");
            if (strArrSplit.length >= 2) {
                try {
                    return a(strArrSplit);
                } catch (NumberFormatException unused) {
                }
            }
        }
        Header firstHeader2 = httpResponse.getFirstHeader("Expires");
        if (firstHeader2 != null) {
            return b.b(firstHeader2.getValue()) - System.currentTimeMillis();
        }
        return 0L;
    }

    private HttpUriRequest c() {
        HttpUriRequest httpUriRequest = this.f;
        if (httpUriRequest != null) {
            return httpUriRequest;
        }
        if (this.j == null) {
            byte[] bArrB = this.c.b();
            String strB = this.c.b("gzip");
            if (bArrB != null) {
                if (TextUtils.equals(strB, "true")) {
                    this.j = b.a(bArrB);
                } else {
                    this.j = new ByteArrayEntity(bArrB);
                }
                this.j.setContentType(this.c.c());
            }
        }
        AbstractHttpEntity abstractHttpEntity = this.j;
        if (abstractHttpEntity != null) {
            HttpPost httpPost = new HttpPost(b());
            httpPost.setEntity(abstractHttpEntity);
            this.f = httpPost;
        } else {
            this.f = new HttpGet(b());
        }
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:57:0x00f2  */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public u call() throws Throwable {
        HttpHost httpHost;
        while (true) {
            try {
                NetworkInfo[] allNetworkInfo = ((ConnectivityManager) this.f5755b.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY)).getAllNetworkInfo();
                if (allNetworkInfo != null) {
                    for (NetworkInfo networkInfo : allNetworkInfo) {
                        if (networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnectedOrConnecting()) {
                            ArrayList<Header> arrayListD = this.c.d();
                            if (arrayListD != null && !arrayListD.isEmpty()) {
                                Iterator<Header> it = arrayListD.iterator();
                                while (it.hasNext()) {
                                    c().addHeader(it.next());
                                }
                            }
                            b.a((HttpRequest) c());
                            b.b((HttpRequest) c());
                            c().addHeader("cookie", i().getCookie(this.c.a()));
                            this.g.setAttribute("http.cookie-store", this.h);
                            this.f5754a.a().a(e);
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            f();
                            this.f.getURI().toString();
                            HttpParams params = this.f5754a.a().getParams();
                            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f5755b.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY)).getActiveNetworkInfo();
                            HttpHost httpHost2 = null;
                            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                                httpHost = null;
                            } else {
                                String defaultHost = Proxy.getDefaultHost();
                                int defaultPort = Proxy.getDefaultPort();
                                if (defaultHost != null) {
                                    httpHost = new HttpHost(defaultHost, defaultPort);
                                } else {
                                    httpHost = null;
                                }
                            }
                            if (httpHost == null || !TextUtils.equals(httpHost.getHostName(), "127.0.0.1") || httpHost.getPort() != 8087) {
                                httpHost2 = httpHost;
                            }
                            params.setParameter("http.route.default-proxy", httpHost2);
                            HttpHost httpHost3 = this.f5756k;
                            if (httpHost3 == null) {
                                URL urlH = h();
                                HttpHost httpHost4 = new HttpHost(urlH.getHost(), g(), urlH.getProtocol());
                                this.f5756k = httpHost4;
                                httpHost3 = httpHost4;
                            }
                            if (g() == 80) {
                                httpHost3 = new HttpHost(h().getHost());
                            }
                            HttpResponse httpResponseExecute = this.f5754a.a().execute(httpHost3, this.f, this.g);
                            this.f5754a.b(System.currentTimeMillis() - jCurrentTimeMillis);
                            List<Cookie> cookies = this.h.getCookies();
                            if (this.c.e()) {
                                i().removeAllCookie();
                            }
                            if (!cookies.isEmpty()) {
                                for (Cookie cookie : cookies) {
                                    if (cookie.getDomain() != null) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(cookie.getName());
                                        sb.append("=");
                                        sb.append(cookie.getValue());
                                        sb.append("; domain=");
                                        sb.append(cookie.getDomain());
                                        sb.append(cookie.isSecure() ? "; Secure" : "");
                                        i().setCookie(this.c.a(), sb.toString());
                                        CookieSyncManager.getInstance().sync();
                                    }
                                }
                            }
                            int statusCode = httpResponseExecute.getStatusLine().getStatusCode();
                            String reasonPhrase = httpResponseExecute.getStatusLine().getReasonPhrase();
                            if (statusCode != 200 && statusCode != 304) {
                                throw new HttpException(Integer.valueOf(httpResponseExecute.getStatusLine().getStatusCode()), httpResponseExecute.getStatusLine().getReasonPhrase());
                            }
                            u uVarA = a(httpResponseExecute, statusCode, reasonPhrase);
                            if (((uVarA == null || uVarA.b() == null) ? -1L : uVarA.b().length) == -1 && (uVarA instanceof p)) {
                                try {
                                    Long.parseLong(((p) uVarA).a().getHead(HTTP.CONTENT_LEN));
                                } catch (Exception unused) {
                                }
                            }
                            if (this.c.a() != null && !TextUtils.isEmpty(f())) {
                                f();
                            }
                            return uVarA;
                        }
                    }
                }
                throw new HttpException(1, "The network is not available");
            } catch (HttpException e2) {
                e();
                if (this.c.f() != null) {
                    e2.getCode();
                    e2.getMsg();
                }
                e2.toString();
                throw e2;
            } catch (NullPointerException e3) {
                e();
                int i = this.m;
                if (i > 0) {
                    e3.toString();
                    throw new HttpException(0, String.valueOf(e3));
                }
                this.m = i + 1;
            } catch (SocketTimeoutException e4) {
                e();
                if (this.c.f() != null) {
                    e4.toString();
                }
                e4.toString();
                throw new HttpException(4, String.valueOf(e4));
            } catch (URISyntaxException e5) {
                throw new RuntimeException("Url parser error!", e5.getCause());
            } catch (UnknownHostException e6) {
                e();
                if (this.c.f() != null) {
                    e6.toString();
                }
                e6.toString();
                throw new HttpException(9, String.valueOf(e6));
            } catch (SSLHandshakeException e7) {
                e();
                if (this.c.f() != null) {
                    e7.toString();
                }
                e7.toString();
                throw new HttpException(2, String.valueOf(e7));
            } catch (SSLPeerUnverifiedException e8) {
                e();
                if (this.c.f() != null) {
                    e8.toString();
                }
                e8.toString();
                throw new HttpException(2, String.valueOf(e8));
            } catch (SSLException e9) {
                e();
                if (this.c.f() != null) {
                    e9.toString();
                }
                e9.toString();
                throw new HttpException(6, String.valueOf(e9));
            } catch (NoHttpResponseException e10) {
                e();
                if (this.c.f() != null) {
                    e10.toString();
                }
                e10.toString();
                throw new HttpException(5, String.valueOf(e10));
            } catch (ConnectionPoolTimeoutException e11) {
                e();
                if (this.c.f() != null) {
                    e11.toString();
                }
                e11.toString();
                throw new HttpException(3, String.valueOf(e11));
            } catch (ConnectTimeoutException e12) {
                e();
                if (this.c.f() != null) {
                    e12.toString();
                }
                e12.toString();
                throw new HttpException(3, String.valueOf(e12));
            } catch (HttpHostConnectException e13) {
                e();
                if (this.c.f() != null) {
                    e13.toString();
                }
                throw new HttpException(8, String.valueOf(e13));
            } catch (IOException e14) {
                e();
                if (this.c.f() != null) {
                    e14.toString();
                }
                e14.toString();
                throw new HttpException(6, String.valueOf(e14));
            } catch (Exception e15) {
                e();
                if (this.c.f() != null) {
                    e15.toString();
                }
                throw new HttpException(0, String.valueOf(e15));
            }
        }
    }

    private void e() {
        HttpUriRequest httpUriRequest = this.f;
        if (httpUriRequest != null) {
            httpUriRequest.abort();
        }
    }

    private String f() {
        if (!TextUtils.isEmpty(this.q)) {
            return this.q;
        }
        String strB = this.c.b("operationType");
        this.q = strB;
        return strB;
    }

    private int g() {
        URL urlH = h();
        return urlH.getPort() == -1 ? urlH.getDefaultPort() : urlH.getPort();
    }

    private URL h() {
        URL url = this.l;
        if (url != null) {
            return url;
        }
        URL url2 = new URL(this.c.a());
        this.l = url2;
        return url2;
    }

    private CookieManager i() {
        CookieManager cookieManager = this.i;
        if (cookieManager != null) {
            return cookieManager;
        }
        CookieManager cookieManager2 = CookieManager.getInstance();
        this.i = cookieManager2;
        return cookieManager2;
    }

    private static HttpUrlHeader a(HttpResponse httpResponse) {
        HttpUrlHeader httpUrlHeader = new HttpUrlHeader();
        for (Header header : httpResponse.getAllHeaders()) {
            httpUrlHeader.setHead(header.getName(), header.getValue());
        }
        return httpUrlHeader;
    }

    private URI b() {
        String strA = this.c.a();
        String str = this.d;
        if (str != null) {
            strA = str;
        }
        if (strA != null) {
            return new URI(strA);
        }
        throw new RuntimeException("url should not be null");
    }

    public final o a() {
        return this.c;
    }

    private u a(HttpResponse httpResponse, int i, String str) throws Throwable {
        String str2;
        Thread.currentThread().getId();
        HttpEntity entity = httpResponse.getEntity();
        ByteArrayOutputStream byteArrayOutputStream = null;
        String str3 = null;
        if (entity == null || httpResponse.getStatusLine().getStatusCode() != 200) {
            if (entity != null) {
                return null;
            }
            httpResponse.getStatusLine().getStatusCode();
            return null;
        }
        Thread.currentThread().getId();
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                a(entity, byteArrayOutputStream2);
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                this.o = false;
                this.f5754a.c(System.currentTimeMillis() - jCurrentTimeMillis);
                this.f5754a.a(byteArray.length);
                p pVar = new p(a(httpResponse), i, str, byteArray);
                long jB = b(httpResponse);
                Header contentType = httpResponse.getEntity().getContentType();
                if (contentType != null) {
                    HashMap<String, String> mapA = a(contentType.getValue());
                    String str4 = mapA.get("charset");
                    str3 = mapA.get("Content-Type");
                    str2 = str4;
                } else {
                    str2 = null;
                }
                pVar.b(str3);
                pVar.a(str2);
                pVar.a(System.currentTimeMillis());
                pVar.b(jB);
                try {
                    byteArrayOutputStream2.close();
                    return pVar;
                } catch (IOException e2) {
                    throw new RuntimeException("ArrayOutputStream close error!", e2.getCause());
                }
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e3) {
                        throw new RuntimeException("ArrayOutputStream close error!", e3.getCause());
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static HashMap<String, String> a(String str) {
        HashMap<String, String> map = new HashMap<>();
        for (String str2 : str.split(";")) {
            String[] strArrSplit = str2.indexOf(61) == -1 ? new String[]{"Content-Type", str2} : str2.split("=");
            map.put(strArrSplit[0], strArrSplit[1]);
        }
        return map;
    }

    private void a(HttpEntity httpEntity, OutputStream outputStream) throws IOException {
        InputStream inputStreamA = b.a(httpEntity);
        httpEntity.getContentLength();
        try {
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int i = inputStreamA.read(bArr);
                    if (i == -1 || this.c.h()) {
                        break;
                    }
                    outputStream.write(bArr, 0, i);
                    this.c.f();
                }
                outputStream.flush();
                r.a(inputStreamA);
            } catch (Exception e2) {
                e2.getCause();
                throw new IOException("HttpWorker Request Error!" + e2.getLocalizedMessage());
            }
        } catch (Throwable th) {
            r.a(inputStreamA);
            throw th;
        }
    }
}
