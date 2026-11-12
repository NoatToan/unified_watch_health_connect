package com.datatheorem.android.trustkit.pinning;

import androidx.annotation.NonNull;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public class SystemTrustManager {
    private static final X509TrustManager a = a();

    private static X509TrustManager a() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            X509TrustManager x509TrustManager = null;
            try {
                trustManagerFactory.init((KeyStore) null);
                for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                    if (trustManager instanceof X509TrustManager) {
                        x509TrustManager = (X509TrustManager) trustManager;
                    }
                }
                if (x509TrustManager != null) {
                    return x509TrustManager;
                }
                throw new IllegalStateException("Should never happen");
            } catch (KeyStoreException unused) {
                throw new IllegalStateException("Should never happen");
            }
        } catch (NoSuchAlgorithmException unused2) {
            throw new IllegalStateException("Should never happen");
        }
    }

    @NonNull
    public static X509TrustManager getInstance() {
        return a;
    }
}
