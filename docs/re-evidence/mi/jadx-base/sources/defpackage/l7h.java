package defpackage;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.Callback;
import okhttp3.ConnectionPool;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: loaded from: classes5.dex */
public class l7h {
    public static l7h d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OkHttpClient f24742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OkHttpClient f24743b = null;
    public InputStream c = null;

    public class a implements X509TrustManager {
        public a() {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    public l7h() {
        this.f24742a = null;
        this.f24742a = c();
    }

    public static l7h d() {
        if (d == null) {
            synchronized (l7h.class) {
                try {
                    if (d == null) {
                        d = new l7h();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public final SSLSocketFactory a() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, new TrustManager[]{new a()}, new SecureRandom());
            return sSLContext.getSocketFactory();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final Headers b() {
        Headers.Builder builder = new Headers.Builder();
        builder.add("connection", HTTP.CONN_KEEP_ALIVE);
        builder.add("proxy-connection", HTTP.CONN_KEEP_ALIVE);
        return builder.build();
    }

    public final OkHttpClient c() {
        if (this.f24743b == null) {
            OkHttpClient.Builder builderAddNetworkInterceptor = new OkHttpClient.Builder().sslSocketFactory(a(), new a()).addNetworkInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY));
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.f24743b = builderAddNetworkInterceptor.connectTimeout(20L, timeUnit).writeTimeout(20L, timeUnit).connectionPool(new ConnectionPool(8, 15L, timeUnit)).build();
        }
        return this.f24743b;
    }

    public final OkHttpClient e(String str) {
        try {
            InputStream inputStream = this.c;
            if (inputStream != null) {
                inputStream.close();
            }
            this.c = ApplicationExtKt.getApplication().getAssets().open(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
        jhc.b bVarB = jhc.b(this.c);
        OkHttpClient.Builder builderSslSocketFactory = new OkHttpClient.Builder().addNetworkInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)).sslSocketFactory(bVarB.f22805a, bVarB.f22806b);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return builderSslSocketFactory.connectTimeout(20L, timeUnit).writeTimeout(20L, timeUnit).connectionPool(new ConnectionPool(8, 15L, timeUnit)).build();
    }

    public void f(String str, String str2, Callback callback) {
        if (str.contains("esim.wo.cn")) {
            this.f24742a = e("SecP256r1ROOT.cer");
        } else if (str.contains("ggckoem.prod.ondemandconnectivity.com")) {
            this.f24742a = e("GSMA_CE_LIVE_CI.crt");
        } else if (str.contains("gckoem.stg.ondemandconnectivity.com")) {
            this.f24742a = e("gsmatest.cer");
        } else {
            this.f24742a = c();
        }
        Request requestBuild = new Request.Builder().url(str).post(RequestBody.create(MediaType.parse("application/json"), str2)).headers(b()).build();
        Logger.i("OkhttpMgr", "send request: " + str2);
        this.f24742a.newCall(requestBuild).enqueue(callback);
    }
}
