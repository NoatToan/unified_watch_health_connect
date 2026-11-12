package com.huawei.openalliance.ad;

import android.content.Context;
import java.io.Closeable;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes12.dex */
public class lm implements X509TrustManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected List<X509TrustManager> f19497a = new ArrayList();

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<X509TrustManager> it = this.f19497a.iterator();
            while (it.hasNext()) {
                arrayList.addAll(Arrays.asList(it.next().getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e) {
            hw.d("SecureX509TrustManager", "getAcceptedIssuers exception : " + e.getClass().getSimpleName());
            return new X509Certificate[0];
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        if (this.f19497a.isEmpty()) {
            throw new CertificateException("checkServerTrusted CertificateException");
        }
        this.f19497a.get(0).checkServerTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        if (this.f19497a.isEmpty()) {
            throw new CertificateException("checkClientTrusted CertificateException");
        }
        this.f19497a.get(0).checkClientTrusted(x509CertificateArr, str);
    }

    public lm(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context is null");
        }
        InputStream inputStreamOpen = null;
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("X509");
            KeyStore keyStore = KeyStore.getInstance(com.huawei.secure.android.common.ssl.util.g.e);
            inputStreamOpen = context.getAssets().open("hiadrootcas.bks");
            inputStreamOpen.reset();
            keyStore.load(inputStreamOpen, "".toCharArray());
            trustManagerFactory.init(keyStore);
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    this.f19497a.add((X509TrustManager) trustManager);
                }
            }
            if (this.f19497a.isEmpty()) {
                throw new CertificateException("X509TrustManager is empty");
            }
            com.huawei.openalliance.ad.utils.df.a((Closeable) inputStreamOpen);
        } catch (Throwable th) {
            com.huawei.openalliance.ad.utils.df.a((Closeable) inputStreamOpen);
            throw th;
        }
    }
}
