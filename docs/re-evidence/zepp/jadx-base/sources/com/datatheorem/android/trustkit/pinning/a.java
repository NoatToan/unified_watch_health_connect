package com.datatheorem.android.trustkit.pinning;

import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
class a {
    public static X509TrustManager a(Set<Certificate> set) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance("AndroidCAStore");
        X509TrustManager x509TrustManager = null;
        keyStore.load(null, null);
        KeyStore keyStore2 = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore2.load(null, null);
        Enumeration<String> enumerationAliases = keyStore.aliases();
        while (enumerationAliases.hasMoreElements()) {
            String strNextElement = enumerationAliases.nextElement();
            keyStore2.setCertificateEntry(strNextElement, (X509Certificate) keyStore.getCertificate(strNextElement));
        }
        for (Certificate certificate : set) {
            keyStore2.setCertificateEntry("debug: " + ((X509Certificate) certificate).getSubjectDN().getName(), certificate);
        }
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore2);
        trustManagerFactory.getTrustManagers();
        for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
            if (trustManager instanceof X509TrustManager) {
                x509TrustManager = (X509TrustManager) trustManager;
            }
        }
        if (x509TrustManager != null) {
            return x509TrustManager;
        }
        throw new IllegalStateException("Should never happen");
    }
}
