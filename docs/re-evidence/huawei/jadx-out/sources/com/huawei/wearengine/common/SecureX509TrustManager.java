package com.huawei.wearengine.common;

import android.content.Context;
import com.huawei.secure.android.common.ssl.util.g;
import defpackage.yit;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes20.dex */
public class SecureX509TrustManager implements X509TrustManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected List<X509TrustManager> f30761b = new ArrayList();

    public SecureX509TrustManager(Context context) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, IllegalArgumentException {
        if (context == null) {
            throw new IllegalArgumentException("context is null");
        }
        KeyStore keyStore = KeyStore.getInstance(g.e);
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getAssets().open("hmsrootcas.bks");
            if (inputStreamOpen != null) {
                inputStreamOpen.reset();
                keyStore.load(inputStreamOpen, "".toCharArray());
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
                trustManagerFactory.init(keyStore);
                b(trustManagerFactory.getTrustManagers());
                if (this.f30761b.isEmpty()) {
                    throw new CertificateException("X509TrustManager is empty");
                }
            }
        } finally {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException unused) {
                    yit.b("SecureX509TrustManager", "inputStream close error ");
                }
            }
        }
    }

    private void b(TrustManager[] trustManagerArr) {
        if (trustManagerArr == null) {
            return;
        }
        for (TrustManager trustManager : trustManagerArr) {
            if (trustManager instanceof X509TrustManager) {
                this.f30761b.add((X509TrustManager) trustManager);
            }
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        if (!this.f30761b.isEmpty()) {
            this.f30761b.get(0).checkClientTrusted(x509CertificateArr, str);
            return;
        }
        throw new CertificateException("checkClientTrusted CertificateException");
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        if (!this.f30761b.isEmpty()) {
            this.f30761b.get(0).checkServerTrusted(x509CertificateArr, str);
            return;
        }
        throw new CertificateException("checkServerTrusted CertificateException");
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            for (X509TrustManager x509TrustManager : this.f30761b) {
                if (x509TrustManager instanceof X509TrustManager) {
                    arrayList.addAll(Arrays.asList(x509TrustManager.getAcceptedIssuers()));
                }
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception unused) {
            yit.b("SecureX509TrustManager", "getAcceptedIssuers exception ");
            return new X509Certificate[0];
        }
    }
}
