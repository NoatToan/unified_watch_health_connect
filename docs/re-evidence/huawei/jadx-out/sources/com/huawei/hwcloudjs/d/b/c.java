package com.huawei.hwcloudjs.d.b;

import android.content.Context;
import com.huawei.hwcloudjs.f.d;
import com.huawei.secure.android.common.ssl.SecureSSLSocketFactory;
import com.huawei.secure.android.common.ssl.hostname.StrictHostnameVerifier;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes37.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f17086a = "HttpsSetting";

    public static void a(HttpsURLConnection httpsURLConnection, Context context) {
        String string;
        StringBuilder sb;
        String str;
        if (httpsURLConnection != null && context != null) {
            try {
                httpsURLConnection.setSSLSocketFactory(SecureSSLSocketFactory.getInstance(context.getApplicationContext()));
                httpsURLConnection.setHostnameVerifier(new StrictHostnameVerifier());
                return;
            } catch (IOException e) {
                e = e;
                sb = new StringBuilder();
                str = "init https ssl socket failed.IOException:";
                sb.append(str);
                sb.append(e.getClass().getSimpleName());
                string = sb.toString();
                d.b(f17086a, string, true);
            } catch (IllegalAccessException e2) {
                e = e2;
                sb = new StringBuilder();
                str = "init https ssl socket failed.IllegalAccessException:";
                sb.append(str);
                sb.append(e.getClass().getSimpleName());
                string = sb.toString();
                d.b(f17086a, string, true);
            } catch (IllegalArgumentException e3) {
                e = e3;
                sb = new StringBuilder();
                str = "init https ssl socket failed.IllegalArgumentException:";
                sb.append(str);
                sb.append(e.getClass().getSimpleName());
                string = sb.toString();
                d.b(f17086a, string, true);
            } catch (KeyManagementException e4) {
                e = e4;
                sb = new StringBuilder();
                str = "init https ssl socket failed.KeyManagementException:";
                sb.append(str);
                sb.append(e.getClass().getSimpleName());
                string = sb.toString();
                d.b(f17086a, string, true);
            } catch (KeyStoreException e5) {
                e = e5;
                sb = new StringBuilder();
                str = "init https ssl socket failed.KeyStoreException:";
                sb.append(str);
                sb.append(e.getClass().getSimpleName());
                string = sb.toString();
                d.b(f17086a, string, true);
            } catch (NoSuchAlgorithmException e6) {
                e = e6;
                sb = new StringBuilder();
                str = "init https ssl socket failed.NoSuchAlgorithmException:";
                sb.append(str);
                sb.append(e.getClass().getSimpleName());
                string = sb.toString();
                d.b(f17086a, string, true);
            } catch (CertificateException e7) {
                e = e7;
                sb = new StringBuilder();
                str = "init https ssl socket failed.CertificateException:";
                sb.append(str);
                sb.append(e.getClass().getSimpleName());
                string = sb.toString();
                d.b(f17086a, string, true);
            }
        }
        string = "init https ssl socket null.";
        d.b(f17086a, string, true);
    }
}
