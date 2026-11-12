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
public class SSFSecureX509SingleInstance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f22858a = "SSFSecureX509SingleInstance";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile SecureX509TrustManager f22859b;

    private SSFSecureX509SingleInstance() {
    }

    public static SecureX509TrustManager getInstance(Context context) throws NoSuchAlgorithmException, IOException, CertificateException, KeyStoreException {
        if (context == null) {
            throw new NullPointerException("context is null");
        }
        ContextUtil.setContext(context);
        if (f22859b == null) {
            synchronized (SSFSecureX509SingleInstance.class) {
                if (f22859b == null) {
                    InputStream filesBksIS = BksUtil.getFilesBksIS(context);
                    if (filesBksIS == null) {
                        d.c(f22858a, "get assets bks");
                        filesBksIS = context.getAssets().open("hmsrootcas.bks");
                    } else {
                        d.c(f22858a, "get files bks");
                    }
                    f22859b = new SecureX509TrustManager(filesBksIS, "", true);
                }
            }
        }
        return f22859b;
    }

    @Deprecated
    public static void updateBks(InputStream inputStream) {
        String str = f22858a;
        d.c(str, "update bks");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (inputStream != null && f22859b != null) {
            f22859b = new SecureX509TrustManager(inputStream, "", true);
            d.a(str, "updateBks: new SecureX509TrustManager cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
            SSFCompatiableSystemCA.a(f22859b);
            SASFCompatiableSystemCA.a(f22859b);
        }
        d.a(str, "update bks cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }

    public static void updateBks(InputStream inputStream, SecureRandom secureRandom) {
        String str = f22858a;
        d.c(str, "update bks");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (inputStream != null && f22859b != null) {
            f22859b = new SecureX509TrustManager(inputStream, "", true);
            d.a(str, "updateBks: new SecureX509TrustManager cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
            SSFCompatiableSystemCA.a(f22859b, secureRandom);
            SASFCompatiableSystemCA.a(f22859b, secureRandom);
        }
        d.a(str, "update bks cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
    }
}
