package com.huawei.openalliance.ad.net.http;

import com.huawei.hms.network.httpclient.HttpClient;
import java.net.HttpURLConnection;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes12.dex */
public abstract class HttpsConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SSLSocketFactory f19676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static X509TrustManager f19677b;

    private static X509TrustManager b() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(KeyStore.getInstance(KeyStore.getDefaultType()));
        for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
            if (trustManager instanceof X509TrustManager) {
                return (X509TrustManager) trustManager;
            }
        }
        return null;
    }

    public static TrustManager[] a() {
        return new TrustManager[0];
    }

    public static void a(OkHttpClient.Builder builder, boolean z, boolean z2) throws NoSuchAlgorithmException, KeyStoreException, com.huawei.openalliance.ad.exception.d {
        SSLSocketFactory sSLSocketFactoryA;
        X509TrustManager x509TrustManagerB;
        if (!z) {
            sSLSocketFactoryA = f19676a;
            x509TrustManagerB = f19677b;
            if (sSLSocketFactoryA == null) {
                sSLSocketFactoryA = m.a(z2);
            }
            if (x509TrustManagerB == null) {
            }
            if (sSLSocketFactoryA != null || x509TrustManagerB == null) {
                throw new com.huawei.openalliance.ad.exception.d("No ssl socket factory or trust manager set");
            }
            builder.sslSocketFactory(sSLSocketFactoryA, x509TrustManagerB);
            return;
        }
        sSLSocketFactoryA = m.a(z2);
        x509TrustManagerB = b();
        if (sSLSocketFactoryA != null) {
        }
        throw new com.huawei.openalliance.ad.exception.d("No ssl socket factory or trust manager set");
    }

    public static void a(X509TrustManager x509TrustManager) {
        f19677b = x509TrustManager;
    }

    public static void a(SSLSocketFactory sSLSocketFactory) {
        f19676a = sSLSocketFactory;
    }

    public static void a(HttpURLConnection httpURLConnection, boolean z, boolean z2) throws com.huawei.openalliance.ad.exception.d {
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            SSLSocketFactory sSLSocketFactoryA = f19676a;
            if (z || sSLSocketFactoryA == null) {
                sSLSocketFactoryA = m.a(z2);
            }
            if (sSLSocketFactoryA == null) {
                throw new com.huawei.openalliance.ad.exception.d("No ssl socket factory set");
            }
            httpsURLConnection.setSSLSocketFactory(sSLSocketFactoryA);
        }
    }

    public static HttpClient.Builder a(HttpClient.Builder builder, boolean z, boolean z2) throws NoSuchAlgorithmException, KeyStoreException, com.huawei.openalliance.ad.exception.d {
        SSLSocketFactory sSLSocketFactoryA;
        X509TrustManager x509TrustManagerB;
        if (!z) {
            sSLSocketFactoryA = f19676a;
            x509TrustManagerB = f19677b;
            if (sSLSocketFactoryA == null) {
                sSLSocketFactoryA = m.a(z2);
            }
            if (x509TrustManagerB == null) {
            }
            if (sSLSocketFactoryA != null || x509TrustManagerB == null) {
                throw new com.huawei.openalliance.ad.exception.d("No ssl socket factory or trust manager set");
            }
            builder.sslSocketFactory(sSLSocketFactoryA, x509TrustManagerB);
            return builder;
        }
        sSLSocketFactoryA = m.a(z2);
        x509TrustManagerB = b();
        if (sSLSocketFactoryA != null) {
        }
        throw new com.huawei.openalliance.ad.exception.d("No ssl socket factory or trust manager set");
    }
}
