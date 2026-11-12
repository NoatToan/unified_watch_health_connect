package com.huawei.secure.android.common.ssl;

import android.content.Context;
import com.huawei.secure.android.common.ssl.util.ContextUtil;
import com.huawei.secure.android.common.ssl.util.d;
import com.huawei.secure.android.common.ssl.util.g;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes42.dex */
public class c implements X509TrustManager {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f22888c = "WebViewX509TrustManger";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private X509Certificate f22889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<X509TrustManager> f22890b = new ArrayList();

    public c(Context context) {
        if (context == null) {
            throw new NullPointerException("WebViewX509TrustManger context is null");
        }
        ContextUtil.setContext(context);
        X509Certificate x509CertificateB = new g(context).b();
        this.f22889a = x509CertificateB;
        if (x509CertificateB == null) {
            throw new NullPointerException("WebViewX509TrustManger cannot get cbg root ca");
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        d.c(f22888c, "checkClientTrusted");
        if (this.f22890b.isEmpty()) {
            throw new CertificateException("checkClientTrusted CertificateException");
        }
        this.f22890b.get(0).checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        d.c(f22888c, "checkServerTrusted");
        boolean zA = false;
        for (int i = 0; i < x509CertificateArr.length; i++) {
            d.a(f22888c, "checkServerTrusted " + i + " : " + x509CertificateArr[i].getIssuerDN().getName());
        }
        X509Certificate[] x509CertificateArr2 = new X509Certificate[x509CertificateArr.length];
        for (int i2 = 0; i2 < x509CertificateArr.length; i2++) {
            x509CertificateArr2[i2] = x509CertificateArr[(x509CertificateArr.length - 1) - i2];
        }
        CertificateException e = new CertificateException("CBG root CA CertificateException");
        try {
            zA = com.huawei.secure.android.common.ssl.util.b.a(this.f22889a, x509CertificateArr2);
        } catch (InvalidKeyException e2) {
            d.b(f22888c, "checkServerTrusted InvalidKeyException: " + e2.getMessage());
        } catch (NoSuchAlgorithmException e3) {
            d.b(f22888c, "checkServerTrusted NoSuchAlgorithmException: " + e3.getMessage());
        } catch (NoSuchProviderException e4) {
            d.b(f22888c, "checkServerTrusted NoSuchProviderException: " + e4.getMessage());
        } catch (SignatureException e5) {
            d.b(f22888c, "checkServerTrusted SignatureException: " + e5.getMessage());
        } catch (CertificateException e6) {
            e = e6;
            d.b(f22888c, "checkServerTrusted CertificateException: " + e.getMessage());
        }
        if (!zA) {
            throw e;
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<X509TrustManager> it = this.f22890b.iterator();
            while (it.hasNext()) {
                arrayList.addAll(Arrays.asList(it.next().getAcceptedIssuers()));
            }
            return (X509Certificate[]) arrayList.toArray(new X509Certificate[arrayList.size()]);
        } catch (Exception e) {
            d.b(f22888c, "getAcceptedIssuers exception : " + e.getMessage());
            return new X509Certificate[0];
        }
    }
}
