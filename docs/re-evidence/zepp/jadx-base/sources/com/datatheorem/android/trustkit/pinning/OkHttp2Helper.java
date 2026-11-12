package com.datatheorem.android.trustkit.pinning;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.squareup.okhttp.Interceptor;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public class OkHttp2Helper {
    private static X509TrustManager a;

    static {
        if (Build.VERSION.SDK_INT < 17) {
            a = SystemTrustManager.getInstance();
        } else {
            a = new d();
        }
    }

    @NonNull
    @RequiresApi(api = 17)
    public static Interceptor getPinningInterceptor() {
        return new OkHttp2PinningInterceptor((d) a);
    }

    @NonNull
    public static SSLSocketFactory getSSLSocketFactory() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new X509TrustManager[]{a}, null);
            return sSLContext.getSocketFactory();
        } catch (KeyManagementException | NoSuchAlgorithmException e) {
            e.printStackTrace();
            throw new IllegalStateException("SSLSocketFactory creation failed");
        }
    }
}
