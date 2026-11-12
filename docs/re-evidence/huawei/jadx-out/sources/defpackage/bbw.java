package defpackage;

import android.content.Context;
import com.huawei.secure.android.common.ssl.SecureSSLSocketFactory;
import java.io.IOException;
import java.security.GeneralSecurityException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes23.dex */
public class bbw {
    public static void d(Context context, HttpsURLConnection httpsURLConnection) {
        try {
            httpsURLConnection.setSSLSocketFactory(d(context));
            httpsURLConnection.setHostnameVerifier(SecureSSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        } catch (IOException | IllegalAccessException | GeneralSecurityException e) {
            bcw.d("SecureNetSSLSocketFactory", "SSLSocketFactory error:" + e.getMessage());
        }
    }

    public static SSLSocketFactory d(Context context) throws IllegalAccessException, GeneralSecurityException, IOException {
        return SecureSSLSocketFactory.getInstance(context);
    }
}
