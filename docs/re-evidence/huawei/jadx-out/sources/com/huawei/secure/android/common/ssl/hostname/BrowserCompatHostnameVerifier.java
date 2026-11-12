package com.huawei.secure.android.common.ssl.hostname;

import com.huawei.secure.android.common.ssl.util.d;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes42.dex */
public class BrowserCompatHostnameVerifier implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22891a = "BrowserCompatHV";

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        if (str == null || str.isEmpty()) {
            d.b(f22891a, "verify: hostname is null or empty");
            return false;
        }
        if (sSLSession == null) {
            d.b(f22891a, "verify: session is null");
            return false;
        }
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            d.c(f22891a, "verify: certificate is : " + x509Certificate.getSubjectDN().getName());
            b.a(str, x509Certificate, false);
            return true;
        } catch (SSLException e) {
            d.b(f22891a, "SSLException : " + e.getMessage());
            return false;
        }
    }
}
