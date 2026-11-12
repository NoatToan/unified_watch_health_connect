package ohos.ace.adapter.capability.web;

import android.net.http.SslCertificate;
import android.net.http.SslError;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes46.dex */
public class AceWebSslErrorHelperObject {
    private static final int EXTERNAL_ERROR_DATE_INVALID = 2;
    private static final int EXTERNAL_ERROR_HOST_MISMATCH = 1;
    private static final int EXTERNAL_ERROR_INVALID = 0;
    private static final int EXTERNAL_ERROR_UNTRUSTED = 3;
    private static final String LOG_TAG = "AceWebSslErrorHelperObject";

    public static int convertErrorCode(SslError sslError) {
        if (sslError == null) {
            return 3;
        }
        int primaryError = sslError.getPrimaryError();
        if (primaryError != 0 && primaryError != 1) {
            if (primaryError == 2) {
                return 1;
            }
            if (primaryError == 3) {
                return 3;
            }
            if (primaryError != 4) {
                return primaryError != 5 ? 3 : 0;
            }
        }
        return 2;
    }

    public static List<String> getCertChainData(SslError sslError) {
        ArrayList arrayList = new ArrayList();
        SslCertificate certificate = sslError.getCertificate();
        if (certificate != null) {
            try {
                X509Certificate x509Certificate = (X509Certificate) certificate.getClass().getMethod("getX509Certificate", new Class[0]).invoke(certificate, new Object[0]);
                if (x509Certificate != null) {
                    byte[] encoded = x509Certificate.getEncoded();
                    StringBuilder sb = new StringBuilder();
                    for (byte b2 : encoded) {
                        sb.append(String.format("%02X", Integer.valueOf(b2 & 255)));
                    }
                    arrayList.add(sb.toString());
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException | CertificateEncodingException unused) {
            }
        }
        return arrayList;
    }
}
