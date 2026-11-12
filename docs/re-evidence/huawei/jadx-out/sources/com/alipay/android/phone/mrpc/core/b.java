package com.alipay.android.phone.mrpc.core;

import android.content.ContentResolver;
import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.util.Base64;
import android.util.Log;
import androidx.webkit.ProxyConfig;
import com.huawei.hms.network.embedded.g2;
import com.huawei.hms.network.embedded.j2;
import com.huawei.openalliance.ad.constant.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.security.Security;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements HttpClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f1981a = 160;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String[] f1982b = {"text/", "application/xml", "application/json"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HttpRequestInterceptor f1983c = new c();
    private final HttpClient d;
    private RuntimeException e = new IllegalStateException("AndroidHttpClient created and never closed");
    private volatile C0014b f;

    @Override // org.apache.http.client.HttpClient
    public HttpParams getParams() {
        return this.d.getParams();
    }

    @Override // org.apache.http.client.HttpClient
    public ClientConnectionManager getConnectionManager() {
        return this.d.getConnectionManager();
    }

    @Override // org.apache.http.client.HttpClient
    public HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return this.d.execute(httpUriRequest, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public HttpResponse execute(HttpUriRequest httpUriRequest) {
        return this.d.execute(httpUriRequest);
    }

    @Override // org.apache.http.client.HttpClient
    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return this.d.execute(httpHost, httpRequest, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        return this.d.execute(httpHost, httpRequest);
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return (T) this.d.execute(httpUriRequest, responseHandler, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) this.d.execute(httpUriRequest, responseHandler);
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return (T) this.d.execute(httpHost, httpRequest, responseHandler, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) this.d.execute(httpHost, httpRequest, responseHandler);
    }

    public void a(HttpRequestRetryHandler httpRequestRetryHandler) {
        ((DefaultHttpClient) this.d).setHttpRequestRetryHandler(httpRequestRetryHandler);
    }

    public static void b(HttpRequest httpRequest) {
        httpRequest.addHeader("Connection", "Keep-Alive");
    }

    private static void b() {
        HttpsURLConnection.setDefaultHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(HttpUriRequest httpUriRequest, boolean z) throws IOException {
        HttpEntity entity;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("curl ");
        for (Header header : httpUriRequest.getAllHeaders()) {
            if (z || (!header.getName().equals("Authorization") && !header.getName().equals("Cookie"))) {
                sb.append("--header \"");
                sb.append(header.toString().trim());
                sb.append("\" ");
            }
        }
        URI uri = httpUriRequest.getURI();
        if (httpUriRequest instanceof RequestWrapper) {
            HttpRequest original = ((RequestWrapper) httpUriRequest).getOriginal();
            if (original instanceof HttpUriRequest) {
                uri = ((HttpUriRequest) original).getURI();
            }
        }
        sb.append("\"");
        sb.append(uri);
        sb.append("\"");
        if ((httpUriRequest instanceof HttpEntityEnclosingRequest) && (entity = ((HttpEntityEnclosingRequest) httpUriRequest).getEntity()) != null && entity.isRepeatable()) {
            if (entity.getContentLength() < 1024) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                entity.writeTo(byteArrayOutputStream);
                if (a(httpUriRequest)) {
                    sb.insert(0, "echo '" + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2) + "' | base64 -d > /tmp/$$.bin; ");
                    str = " --data-binary @/tmp/$$.bin";
                } else {
                    String string = byteArrayOutputStream.toString();
                    sb.append(" --data-ascii \"");
                    sb.append(string);
                    sb.append("\"");
                }
            } else {
                str = " [TOO MUCH DATA TO INCLUDE]";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static long b(String str) {
        return k.a(str);
    }

    private static boolean a(HttpUriRequest httpUriRequest) {
        Header[] headers = httpUriRequest.getHeaders("content-encoding");
        if (headers != null) {
            for (Header header : headers) {
                if (Constants.GZIP.equalsIgnoreCase(header.getValue())) {
                    return true;
                }
            }
        }
        Header[] headers2 = httpUriRequest.getHeaders(com.alipay.sdk.m.s.e.f);
        if (headers2 != null) {
            for (Header header2 : headers2) {
                for (String str : f1982b) {
                    if (header2.getValue().startsWith(str)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void a(HttpRequest httpRequest) {
        httpRequest.addHeader(j2.v, Constants.GZIP);
    }

    public static AbstractHttpEntity a(byte[] bArr, ContentResolver contentResolver) throws IOException {
        Log.i("RPC_PERF", "gzip...");
        if (bArr.length < a(contentResolver)) {
            return new ByteArrayEntity(bArr);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        ByteArrayEntity byteArrayEntity = new ByteArrayEntity(byteArrayOutputStream.toByteArray());
        byteArrayEntity.setContentEncoding(Constants.GZIP);
        Log.i("RPC_PERF", "gzip size:" + bArr.length + "->" + byteArrayEntity.getContentLength());
        return byteArrayEntity;
    }

    public static InputStream a(HttpEntity httpEntity) throws IOException {
        Header contentEncoding;
        String value;
        InputStream content = httpEntity.getContent();
        return (content == null || (contentEncoding = httpEntity.getContentEncoding()) == null || (value = contentEncoding.getValue()) == null || !value.contains(Constants.GZIP)) ? content : new GZIPInputStream(content);
    }

    public static b a(String str, Context context) {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setUseExpectContinue(basicHttpParams, false);
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, true);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 20000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        HttpClientParams.setRedirecting(basicHttpParams, true);
        HttpClientParams.setAuthenticating(basicHttpParams, false);
        HttpProtocolParams.setUserAgent(basicHttpParams, str);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme(ProxyConfig.MATCH_HTTPS, SSLCertificateSocketFactory.getHttpSocketFactory(30000, context == null ? null : new SSLSessionCache(context)), g2.n));
        ThreadSafeClientConnManager threadSafeClientConnManager = new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry);
        ConnManagerParams.setTimeout(basicHttpParams, 60000L);
        ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new ConnPerRouteBean(10));
        ConnManagerParams.setMaxTotalConnections(basicHttpParams, 50);
        Security.setProperty("networkaddress.cache.ttl", String.valueOf(-1));
        b();
        return new b(threadSafeClientConnManager, basicHttpParams);
    }

    /* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.b$b, reason: collision with other inner class name */
    public static class C0014b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f1985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f1986b;

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a() {
            return Log.isLoggable(this.f1985a, this.f1986b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str) {
            Log.println(this.f1986b, this.f1985a, str);
        }
    }

    public static b a(String str) {
        return a(str, (Context) null);
    }

    public class a implements HttpRequestInterceptor {
        @Override // org.apache.http.HttpRequestInterceptor
        public void process(HttpRequest httpRequest, HttpContext httpContext) {
            C0014b c0014b = b.this.f;
            if (c0014b != null && c0014b.a() && (httpRequest instanceof HttpUriRequest)) {
                c0014b.a(b.b((HttpUriRequest) httpRequest, false));
            }
        }

        public /* synthetic */ a(b bVar, c cVar) {
            this();
        }

        private a() {
        }
    }

    public static long a(ContentResolver contentResolver) {
        return f1981a;
    }

    private b(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.d = new d(this, clientConnectionManager, httpParams);
    }
}
