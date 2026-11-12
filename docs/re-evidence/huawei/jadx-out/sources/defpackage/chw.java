package defpackage;

import android.content.Context;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Interceptor;
import com.huawei.secure.android.common.ssl.SecureSSLSocketFactoryNew;
import com.huawei.secure.android.common.ssl.SecureX509TrustManager;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes4.dex */
public final class chw {
    private static boolean d() {
        return false;
    }

    public static HttpClient b() {
        SecureSSLSocketFactoryNew secureSSLSocketFactoryNew;
        SecureX509TrustManager secureX509TrustManager = null;
        try {
            Context contextC = chm.c();
            secureSSLSocketFactoryNew = SecureSSLSocketFactoryNew.getInstance(contextC);
            try {
                secureX509TrustManager = new SecureX509TrustManager(contextC);
            } catch (IOException unused) {
                cib.d("HttpClientUtil", "sslSocketFactory IOException exception");
            } catch (IllegalAccessException unused2) {
                cib.d("HttpClientUtil", "sslSocketFactory IllegalAccessException exception");
            } catch (KeyManagementException unused3) {
                cib.d("HttpClientUtil", "sslSocketFactory KeyManagementException exception");
            } catch (KeyStoreException unused4) {
                cib.d("HttpClientUtil", "sslSocketFactory KeyStoreException exception");
            } catch (NoSuchAlgorithmException unused5) {
                cib.d("HttpClientUtil", "sslSocketFactory NoSuchAlgorithmException exception");
            } catch (CertificateException unused6) {
                cib.d("HttpClientUtil", "sslSocketFactory CertificateException exception");
            }
        } catch (IOException unused7) {
            secureSSLSocketFactoryNew = null;
        } catch (IllegalAccessException unused8) {
            secureSSLSocketFactoryNew = null;
        } catch (KeyManagementException unused9) {
            secureSSLSocketFactoryNew = null;
        } catch (KeyStoreException unused10) {
            secureSSLSocketFactoryNew = null;
        } catch (NoSuchAlgorithmException unused11) {
            secureSSLSocketFactoryNew = null;
        } catch (CertificateException unused12) {
            secureSSLSocketFactoryNew = null;
        }
        if (secureSSLSocketFactoryNew != null && secureX509TrustManager != null) {
            return a().sslSocketFactory((SSLSocketFactory) secureSSLSocketFactoryNew, (X509TrustManager) secureX509TrustManager).build();
        }
        return e();
    }

    private static HttpClient e() {
        return a().sslSocketFactory((SSLSocketFactory) new chx(), (X509TrustManager) new chu()).build();
    }

    private static HttpClient.Builder a() {
        HttpClient.Builder builderRetryTimeOnConnectionFailure = new HttpClient.Builder().connectTimeout(10000).readTimeout(10000).writeTimeout(10000).retryTimeOnConnectionFailure(0);
        return d() ? builderRetryTimeOnConnectionFailure.addInterceptor((Interceptor) new cht()) : builderRetryTimeOnConnectionFailure;
    }
}
