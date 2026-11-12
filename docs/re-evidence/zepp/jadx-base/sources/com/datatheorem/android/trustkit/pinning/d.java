package com.datatheorem.android.trustkit.pinning;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import androidx.annotation.NonNull;
import com.datatheorem.android.trustkit.TrustKit;
import com.datatheorem.android.trustkit.config.DomainPinningPolicy;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
class d implements X509TrustManager {
    private final ThreadLocal<String> a = new ThreadLocal<>();

    public void a(@NonNull String str) {
        this.a.set(str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        TrustKit.getInstance().getTrustManager(this.a.get()).checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        String str2 = this.a.get();
        DomainPinningPolicy policyForHostname = TrustKit.getInstance().getConfiguration().getPolicyForHostname(str2);
        X509TrustManager trustManager = TrustKit.getInstance().getTrustManager(str2);
        if (policyForHostname != null || Build.VERSION.SDK_INT < 17) {
            trustManager.checkServerTrusted(x509CertificateArr, str);
        } else {
            new X509TrustManagerExtensions(trustManager).checkServerTrusted(x509CertificateArr, str, str2);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
