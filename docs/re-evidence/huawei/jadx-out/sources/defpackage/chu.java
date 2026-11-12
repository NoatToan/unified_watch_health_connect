package defpackage;

import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes4.dex */
public class chu implements X509TrustManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private X509TrustManager f1615a;

    public chu() {
        this.f1615a = null;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
            keyStore.load(null, null);
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    cib.b("HuaweiTrustManagerImpl", "X509TrustManager");
                    this.f1615a = (X509TrustManager) trustManager;
                    return;
                }
            }
        } catch (IOException unused) {
            cib.d("HuaweiTrustManagerImpl", "HuaweiTrustManagerImpl IOException");
        } catch (KeyStoreException e) {
            e = e;
            cib.d("HuaweiTrustManagerImpl", "HuaweiTrustManagerImpl detail exception " + e.getMessage());
        } catch (NoSuchAlgorithmException e2) {
            e = e2;
            cib.d("HuaweiTrustManagerImpl", "HuaweiTrustManagerImpl detail exception " + e.getMessage());
        } catch (CertificateException e3) {
            e = e3;
            cib.d("HuaweiTrustManagerImpl", "HuaweiTrustManagerImpl detail exception " + e.getMessage());
        } catch (Exception e4) {
            cib.d("HuaweiTrustManagerImpl", "HuaweiTrustManagerImpl exception " + e4.getMessage());
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.f1615a.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        try {
            this.f1615a.checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException e) {
            for (Throwable cause = e; cause != null; cause = cause.getCause()) {
                if ((cause instanceof CertificateExpiredException) || (cause instanceof CertificateNotYetValidException)) {
                    cib.d("HuaweiTrustManagerImpl", "CertificateExpiredException or CertificateNotYetValidException");
                }
            }
            cib.d("HuaweiTrustManagerImpl", "checkServerTrusted exception throw");
            throw e;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return this.f1615a.getAcceptedIssuers();
    }
}
