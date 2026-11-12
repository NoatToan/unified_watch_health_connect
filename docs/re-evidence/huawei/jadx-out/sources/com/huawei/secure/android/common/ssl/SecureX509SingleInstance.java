package com.huawei.secure.android.common.ssl;

import android.content.Context;
import com.huawei.secure.android.common.ssl.util.BksUtil;
import com.huawei.secure.android.common.ssl.util.ContextUtil;
import com.huawei.secure.android.common.ssl.util.d;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;

/* JADX INFO: loaded from: classes3.dex */
public class SecureX509SingleInstance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22872a = "SecureX509SingleInstance";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile SecureX509TrustManager f22873b;

    private SecureX509SingleInstance() {
    }

    public static SecureX509TrustManager getInstance(Context context) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException {
        InputStream inputStreamOpen;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (context == null) {
            throw new NullPointerException("context is null");
        }
        ContextUtil.setContext(context);
        if (f22873b == null) {
            synchronized (SecureX509SingleInstance.class) {
                if (f22873b == null) {
                    try {
                        inputStreamOpen = BksUtil.getFilesBksIS(context);
                    } catch (RuntimeException unused) {
                        d.b(f22872a, "get files bks error");
                        inputStreamOpen = null;
                    }
                    if (inputStreamOpen == null) {
                        d.c(f22872a, "get assets bks");
                        inputStreamOpen = context.getAssets().open("hmsrootcas.bks");
                    } else {
                        d.c(f22872a, "get files bks");
                    }
                    f22873b = new SecureX509TrustManager(inputStreamOpen, "");
                }
            }
        }
        d.a(f22872a, "SecureX509TrustManager getInstance: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        return f22873b;
    }

    @Deprecated
    public static void updateBks(InputStream inputStream) {
        String str = f22872a;
        d.c(str, "update bks");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (inputStream != null && f22873b != null) {
            f22873b = new SecureX509TrustManager(inputStream, "");
            SecureSSLSocketFactory.a(f22873b);
            SecureApacheSSLSocketFactory.a(f22873b);
        }
        d.c(str, "SecureX509TrustManager update bks cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    public static void updateBks(InputStream inputStream, SecureRandom secureRandom) {
        String str = f22872a;
        d.c(str, "update bks");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (inputStream != null && f22873b != null) {
            f22873b = new SecureX509TrustManager(inputStream, "");
            SecureSSLSocketFactory.a(f22873b, secureRandom);
            SecureApacheSSLSocketFactory.a(f22873b, secureRandom);
        }
        d.c(str, "SecureX509TrustManager update bks cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }
}
