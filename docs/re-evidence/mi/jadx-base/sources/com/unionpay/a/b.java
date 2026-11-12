package com.unionpay.a;

import android.net.http.X509TrustManagerExtensions;
import android.text.TextUtils;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements X509TrustManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private X509TrustManager f10739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private X509TrustManagerExtensions f10740b;
    private String c;

    public b(String str) throws NoSuchAlgorithmException, KeyStoreException {
        this.f10740b = null;
        this.c = str;
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 0) {
            throw new NoSuchAlgorithmException("no trust manager found");
        }
        this.f10739a = (X509TrustManager) trustManagers[0];
        this.f10740b = new X509TrustManagerExtensions(this.f10739a);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        X509TrustManager x509TrustManager = this.f10739a;
        if (x509TrustManager != null) {
            x509TrustManager.checkClientTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        X509TrustManagerExtensions x509TrustManagerExtensions = this.f10740b;
        if (x509TrustManagerExtensions != null) {
            x509TrustManagerExtensions.checkServerTrusted(x509CertificateArr, str, "");
        } else {
            X509TrustManager x509TrustManager = this.f10739a;
            if (x509TrustManager != null) {
                x509TrustManager.checkServerTrusted(x509CertificateArr, str);
            }
        }
        try {
            X500Principal issuerX500Principal = x509CertificateArr[0].getIssuerX500Principal();
            ArrayList arrayList = new ArrayList(0);
            arrayList.add(".*(GeoTrust|VeriSign|Symantec|GlobalSign|CFCA|Entrust|Thawte|DigiCert).*");
            if (!TextUtils.isEmpty(this.c)) {
                arrayList.add(this.c);
            }
            for (int i = 0; i < arrayList.size(); i++) {
                if (Pattern.compile((String) arrayList.get(i), 2).matcher(issuerX500Principal.getName()).matches()) {
                    X500Principal subjectX500Principal = x509CertificateArr[0].getSubjectX500Principal();
                    ArrayList arrayList2 = new ArrayList(0);
                    arrayList2.add(".*CN=.*(\\.cup\\.com\\.cn|\\.95516\\.com|\\.chinaunionpay\\.com|\\.unionpay\\.com|\\.unionpaysecure\\.com|\\.95516\\.net)(,.*|$)");
                    for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                        if (Pattern.compile((String) arrayList2.get(i2), 2).matcher(subjectX500Principal.getName()).matches()) {
                            return;
                        }
                    }
                    throw new CertificateException();
                }
            }
            throw new CertificateException();
        } catch (Exception unused) {
            throw new CertificateException();
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return this.f10739a.getAcceptedIssuers();
    }
}
