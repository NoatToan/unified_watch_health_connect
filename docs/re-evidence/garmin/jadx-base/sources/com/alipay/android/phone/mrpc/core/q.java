package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.google.common.net.HttpHeaders;
import ds.e0;
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
import org.apache.commons.lang3.BooleanUtils;
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
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements Callable<u> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HttpRequestRetryHandler f28322e = new ad();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f28323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f28324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f28325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f28326d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HttpUriRequest f28327f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CookieManager f28330i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AbstractHttpEntity f28331j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HttpHost f28332k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public URL f28333l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f28338q;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HttpContext f28328g = new BasicHttpContext();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CookieStore f28329h = new BasicCookieStore();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f28334m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f28335n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f28336o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f28337p = null;

    public q(l lVar, o oVar) {
        this.f28323a = lVar;
        this.f28324b = lVar.f28300a;
        this.f28325c = oVar;
    }

    private u a(HttpResponse httpResponse, int i14, String str) throws Throwable {
        String str2;
        Thread.currentThread().getId();
        HttpEntity entity = httpResponse.getEntity();
        ByteArrayOutputStream byteArrayOutputStream = null;
        String str3 = null;
        if (entity == null || httpResponse.getStatusLine().getStatusCode() != 200) {
            if (entity == null) {
                httpResponse.getStatusLine().getStatusCode();
            }
            return null;
        }
        Thread.currentThread().getId();
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    a(entity, byteArrayOutputStream2);
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    this.f28336o = false;
                    this.f28323a.c(System.currentTimeMillis() - jCurrentTimeMillis);
                    this.f28323a.a(byteArray.length);
                    p pVar = new p(a(httpResponse), i14, str, byteArray);
                    long jB = b(httpResponse);
                    Header contentType = httpResponse.getEntity().getContentType();
                    if (contentType != null) {
                        HashMap<String, String> mapA = a(contentType.getValue());
                        str3 = mapA.get("charset");
                        str2 = mapA.get(HttpHeaders.CONTENT_TYPE);
                    } else {
                        str2 = null;
                    }
                    pVar.b(str2);
                    pVar.a(str3);
                    pVar.a(System.currentTimeMillis());
                    pVar.b(jB);
                    byteArrayOutputStream2.close();
                    return pVar;
                } catch (Throwable th3) {
                    th = th3;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e4) {
                q2.v("ArrayOutputStream close error!", e4.getCause());
                return null;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static long b(HttpResponse httpResponse) {
        Header firstHeader = httpResponse.getFirstHeader(HttpHeaders.CACHE_CONTROL);
        if (firstHeader != null) {
            String[] strArrSplit = firstHeader.getValue().split("=");
            if (strArrSplit.length >= 2) {
                try {
                    return a(strArrSplit);
                } catch (NumberFormatException unused) {
                }
            }
        }
        Header firstHeader2 = httpResponse.getFirstHeader(HttpHeaders.EXPIRES);
        if (firstHeader2 != null) {
            return b.b(firstHeader2.getValue()) - System.currentTimeMillis();
        }
        return 0L;
    }

    private HttpUriRequest c() {
        HttpUriRequest httpUriRequest = this.f28327f;
        if (httpUriRequest != null) {
            return httpUriRequest;
        }
        if (this.f28331j == null) {
            byte[] bArrB = this.f28325c.b();
            String strB = this.f28325c.b("gzip");
            if (bArrB != null) {
                if (TextUtils.equals(strB, BooleanUtils.TRUE)) {
                    this.f28331j = b.a(bArrB);
                } else {
                    this.f28331j = new ByteArrayEntity(bArrB);
                }
                this.f28331j.setContentType(this.f28325c.c());
            }
        }
        AbstractHttpEntity abstractHttpEntity = this.f28331j;
        if (abstractHttpEntity != null) {
            HttpPost httpPost = new HttpPost(b());
            httpPost.setEntity(abstractHttpEntity);
            this.f28327f = httpPost;
        } else {
            this.f28327f = new HttpGet(b());
        }
        return this.f28327f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:133:0x02a1 A[PHI: r0
      0x02a1: PHI (r0v14 'e' java.lang.Object) = (r0v4 'e' java.lang.Object), (r0v17 'e' java.lang.Object) binds: [B:132:0x029f, B:163:0x034f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:157:0x0332 A[PHI: r0
      0x0332: PHI (r0v8 'e' java.lang.Object) = (r0v7 'e' java.lang.Object), (r0v11 'e' java.lang.Object) binds: [B:156:0x0330, B:160:0x0343] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:167:0x035e A[PHI: r1
      0x035e: PHI (r1v16 'e' java.lang.Object) = (r1v15 'e' java.lang.Object), (r1v18 'e' java.lang.Object) binds: [B:166:0x035c, B:170:0x036f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0102  */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public u call() throws Throwable {
        HttpHost httpHost;
        while (true) {
            try {
                NetworkInfo[] allNetworkInfo = ((ConnectivityManager) this.f28324b.getSystemService("connectivity")).getAllNetworkInfo();
                if (allNetworkInfo != null) {
                    for (NetworkInfo networkInfo : allNetworkInfo) {
                        if (networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnectedOrConnecting()) {
                            ArrayList<Header> arrayListD = this.f28325c.d();
                            if (arrayListD != null && !arrayListD.isEmpty()) {
                                Iterator<Header> it = arrayListD.iterator();
                                while (it.hasNext()) {
                                    c().addHeader(it.next());
                                }
                            }
                            b.a((HttpRequest) c());
                            b.b((HttpRequest) c());
                            c().addHeader("cookie", i().getCookie(this.f28325c.a()));
                            this.f28328g.setAttribute("http.cookie-store", this.f28329h);
                            this.f28323a.a().a(f28322e);
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            f();
                            this.f28327f.getURI().toString();
                            HttpParams params = this.f28323a.a().getParams();
                            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f28324b.getSystemService("connectivity")).getActiveNetworkInfo();
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
                            HttpHost httpHost3 = this.f28332k;
                            if (httpHost3 == null) {
                                URL urlH = h();
                                HttpHost httpHost4 = new HttpHost(urlH.getHost(), g(), urlH.getProtocol());
                                this.f28332k = httpHost4;
                                httpHost3 = httpHost4;
                            }
                            if (g() == 80) {
                                httpHost3 = new HttpHost(h().getHost());
                            }
                            HttpResponse httpResponseExecute = this.f28323a.a().execute(httpHost3, this.f28327f, this.f28328g);
                            this.f28323a.b(System.currentTimeMillis() - jCurrentTimeMillis);
                            List<Cookie> cookies = this.f28329h.getCookies();
                            if (this.f28325c.e()) {
                                i().removeAllCookie();
                            }
                            if (!cookies.isEmpty()) {
                                for (Cookie cookie : cookies) {
                                    if (cookie.getDomain() != null) {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(cookie.getName());
                                        sb3.append("=");
                                        sb3.append(cookie.getValue());
                                        sb3.append("; domain=");
                                        sb3.append(cookie.getDomain());
                                        sb3.append(cookie.isSecure() ? "; Secure" : "");
                                        i().setCookie(this.f28325c.a(), sb3.toString());
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
                                    Long.parseLong(((p) uVarA).a().getHead(HttpHeaders.CONTENT_LENGTH));
                                } catch (Exception unused) {
                                }
                            }
                            if (this.f28325c.a() != null && !TextUtils.isEmpty(f())) {
                                f();
                            }
                            return uVarA;
                        }
                    }
                }
                throw new HttpException(1, "The network is not available");
            } catch (HttpException e4) {
                e();
                if (this.f28325c.f() != null) {
                    e4.getCode();
                    e4.getMsg();
                }
                e4.toString();
                throw e4;
            } catch (NullPointerException e14) {
                e();
                int i14 = this.f28334m;
                if (i14 > 0) {
                    e0.s(0, e14);
                    return null;
                }
                this.f28334m = i14 + 1;
            } catch (SocketTimeoutException e15) {
                e();
                if (this.f28325c.f() != null) {
                    e15.toString();
                }
                e15.toString();
                throw new HttpException(4, String.valueOf(e15));
            } catch (URISyntaxException e16) {
                q2.v("Url parser error!", e16.getCause());
                return null;
            } catch (UnknownHostException e17) {
                e();
                if (this.f28325c.f() != null) {
                    e17.toString();
                }
                e17.toString();
                throw new HttpException(9, String.valueOf(e17));
            } catch (SSLHandshakeException e18) {
                e = e18;
                e();
                if (this.f28325c.f() != null) {
                    e.toString();
                }
                e0.s(2, e);
                return null;
            } catch (SSLPeerUnverifiedException e19) {
                e = e19;
                e();
                if (this.f28325c.f() != null) {
                    e.toString();
                }
                e0.s(2, e);
                return null;
            } catch (SSLException e24) {
                e = e24;
                e();
                if (this.f28325c.f() != null) {
                    e.toString();
                }
                e0.s(6, e);
                return null;
            } catch (NoHttpResponseException e25) {
                e();
                if (this.f28325c.f() != null) {
                    e25.toString();
                }
                e25.toString();
                throw new HttpException(5, String.valueOf(e25));
            } catch (ConnectionPoolTimeoutException e26) {
                e = e26;
                e();
                if (this.f28325c.f() != null) {
                    e.toString();
                }
                e0.s(3, e);
                return null;
            } catch (ConnectTimeoutException e27) {
                e = e27;
                e();
                if (this.f28325c.f() != null) {
                    e.toString();
                }
                e0.s(3, e);
                return null;
            } catch (HttpHostConnectException e28) {
                e();
                if (this.f28325c.f() != null) {
                    e28.toString();
                }
                throw new HttpException(8, String.valueOf(e28));
            } catch (IOException e29) {
                e = e29;
                e();
                if (this.f28325c.f() != null) {
                    e.toString();
                }
                e0.s(6, e);
                return null;
            } catch (Exception e34) {
                e();
                if (this.f28325c.f() != null) {
                    e34.toString();
                }
                throw new HttpException(0, String.valueOf(e34));
            }
        }
    }

    private void e() {
        HttpUriRequest httpUriRequest = this.f28327f;
        if (httpUriRequest != null) {
            httpUriRequest.abort();
        }
    }

    private String f() {
        if (!TextUtils.isEmpty(this.f28338q)) {
            return this.f28338q;
        }
        String strB = this.f28325c.b("operationType");
        this.f28338q = strB;
        return strB;
    }

    private int g() {
        URL urlH = h();
        return urlH.getPort() == -1 ? urlH.getDefaultPort() : urlH.getPort();
    }

    private URL h() {
        URL url = this.f28333l;
        if (url != null) {
            return url;
        }
        URL url2 = new URL(this.f28325c.a());
        this.f28333l = url2;
        return url2;
    }

    private CookieManager i() {
        CookieManager cookieManager = this.f28330i;
        if (cookieManager != null) {
            return cookieManager;
        }
        CookieManager cookieManager2 = CookieManager.getInstance();
        this.f28330i = cookieManager2;
        return cookieManager2;
    }

    private URI b() {
        String strA = this.f28325c.a();
        String str = this.f28326d;
        if (str != null) {
            strA = str;
        }
        if (strA != null) {
            return new URI(strA);
        }
        kg.f.n("url should not be null");
        return null;
    }

    public static HttpUrlHeader a(HttpResponse httpResponse) {
        HttpUrlHeader httpUrlHeader = new HttpUrlHeader();
        for (Header header : httpResponse.getAllHeaders()) {
            httpUrlHeader.setHead(header.getName(), header.getValue());
        }
        return httpUrlHeader;
    }

    public final o a() {
        return this.f28325c;
    }

    public static long a(String[] strArr) {
        String str;
        for (int i14 = 0; i14 < strArr.length; i14++) {
            if ("max-age".equalsIgnoreCase(strArr[i14]) && (str = strArr[i14 + 1]) != null) {
                try {
                    return Long.parseLong(str);
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return 0L;
    }

    public static HashMap<String, String> a(String str) {
        HashMap<String, String> map = new HashMap<>();
        for (String str2 : str.split(";")) {
            String[] strArrSplit = str2.indexOf(61) == -1 ? new String[]{HttpHeaders.CONTENT_TYPE, str2} : str2.split("=");
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
                    int i14 = inputStreamA.read(bArr);
                    if (i14 == -1 || this.f28325c.h()) {
                        break;
                    }
                    outputStream.write(bArr, 0, i14);
                    this.f28325c.f();
                }
                outputStream.flush();
                r.a(inputStreamA);
            } catch (Exception e4) {
                e4.getCause();
                throw new IOException("HttpWorker Request Error!" + e4.getLocalizedMessage());
            }
        } catch (Throwable th3) {
            r.a(inputStreamA);
            throw th3;
        }
    }
}
