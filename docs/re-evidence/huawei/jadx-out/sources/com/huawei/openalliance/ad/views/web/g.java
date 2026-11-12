package com.huawei.openalliance.ad.views.web;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import androidx.webkit.ProxyConfig;
import com.huawei.hms.network.embedded.g2;
import com.huawei.openalliance.ad.hw;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

/* JADX INFO: loaded from: classes12.dex */
public class g extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SSLSocketFactory f21432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HostnameVerifier f21433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.apache.http.conn.ssl.SSLSocketFactory f21434c;
    private X509HostnameVerifier d;
    private SslErrorHandler e;
    private String f;
    private a g;
    private Context h;

    public interface a {
        void a(Context context, String str);

        void b(Context context, String str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [javax.net.ssl.HostnameVerifier] */
    /* JADX WARN: Type inference failed for: r0v3, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r0v5 */
    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws Throwable {
        Exception e;
        HttpsURLConnection httpsURLConnection;
        IOException e2;
        InputStream inputStream;
        super.run();
        HttpsURLConnection httpsURLConnection2 = null;
        if (this.f21434c != null && this.d != null) {
            if (this.e != null) {
                try {
                    if (!TextUtils.isEmpty(this.f)) {
                        try {
                            this.f21434c.setHostnameVerifier(this.d);
                            BasicHttpParams basicHttpParams = new BasicHttpParams();
                            HttpConnectionParams.setConnectionTimeout(basicHttpParams, 10000);
                            HttpConnectionParams.setSoTimeout(basicHttpParams, 10000);
                            SchemeRegistry schemeRegistry = new SchemeRegistry();
                            schemeRegistry.register(new Scheme(ProxyConfig.MATCH_HTTPS, this.f21434c, g2.n));
                            schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
                            DefaultHttpClient defaultHttpClient = new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
                            HttpGet httpGet = new HttpGet();
                            httpGet.setURI(new URI(this.f));
                            hw.b("WebViewSSLCheckThread", "status code is : " + defaultHttpClient.execute(httpGet).getStatusLine().getStatusCode());
                            a((Reader) null);
                            b();
                            return;
                        } catch (IOException e3) {
                            hw.a("WebViewSSLCheckThread", "apache IOException  exception : %s", e3.getMessage());
                            hw.c("WebViewSSLCheckThread", "apache IOException  exception : " + e3.getClass().getSimpleName());
                            a();
                            a((Reader) null);
                            return;
                        } catch (Throwable th) {
                            hw.a("WebViewSSLCheckThread", "apache run: exception : %s", th.getMessage());
                            hw.c("WebViewSSLCheckThread", "apache run: exception : " + th.getClass().getSimpleName());
                            a();
                            a((Reader) null);
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    a((Reader) null);
                    throw th2;
                }
            }
            hw.d("WebViewSSLCheckThread", "sslErrorHandler or url is null");
            a();
            return;
        }
        if (this.f21432a != null) {
            ?? r0 = this.f21433b;
            try {
                if (r0 != 0) {
                    try {
                        URLConnection uRLConnectionOpenConnection = new URL(this.f).openConnection();
                        if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                            httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                            try {
                                httpsURLConnection.setSSLSocketFactory(this.f21432a);
                                httpsURLConnection.setHostnameVerifier(this.f21433b);
                                httpsURLConnection.setRequestMethod("GET");
                                httpsURLConnection.setConnectTimeout(10000);
                                httpsURLConnection.setReadTimeout(20000);
                                httpsURLConnection.getResponseCode();
                                httpsURLConnection2 = httpsURLConnection;
                                inputStream = httpsURLConnection.getInputStream();
                            } catch (IOException e4) {
                                e2 = e4;
                                hw.a("WebViewSSLCheckThread", "IOException : %s", e2.getMessage());
                                hw.c("WebViewSSLCheckThread", "IOException : " + e2.getClass().getSimpleName());
                                a();
                                if (httpsURLConnection != null) {
                                    httpsURLConnection.disconnect();
                                }
                                a((InputStream) null);
                                return;
                            } catch (Exception e5) {
                                e = e5;
                                hw.a("WebViewSSLCheckThread", "exception : %s", e.getMessage());
                                hw.c("WebViewSSLCheckThread", "exception : " + e.getClass().getSimpleName());
                                a();
                                if (httpsURLConnection != null) {
                                    httpsURLConnection.disconnect();
                                }
                                a((InputStream) null);
                                return;
                            }
                        } else {
                            inputStream = null;
                        }
                        if (httpsURLConnection2 != null) {
                            httpsURLConnection2.disconnect();
                        }
                        a(inputStream);
                        b();
                        return;
                    } catch (IOException e6) {
                        e2 = e6;
                        httpsURLConnection = null;
                    } catch (Exception e7) {
                        e = e7;
                        httpsURLConnection = null;
                    } catch (Throwable th3) {
                        th = th3;
                        r0 = 0;
                        if (r0 != 0) {
                            r0.disconnect();
                        }
                        a((InputStream) null);
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        a();
    }

    private void b() {
        hw.b("WebViewSSLCheckThread", "callbackProceed: ");
        SslErrorHandler sslErrorHandler = this.e;
        if (sslErrorHandler != null) {
            sslErrorHandler.proceed();
        }
        a aVar = this.g;
        if (aVar != null) {
            aVar.a(this.h, this.f);
        }
    }

    private void a(Reader reader) {
        a((Closeable) reader);
    }

    private void a(InputStream inputStream) {
        a((Closeable) inputStream);
    }

    private void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                hw.d("WebViewSSLCheckThread", "closeSecure IOException");
            }
        }
    }

    private void a() {
        hw.b("WebViewSSLCheckThread", "callbackCancel: ");
        if (this.e != null) {
            hw.b("WebViewSSLCheckThread", "callbackCancel 2: ");
            this.e.cancel();
        }
        a aVar = this.g;
        if (aVar != null) {
            aVar.b(this.h, this.f);
        }
    }
}
