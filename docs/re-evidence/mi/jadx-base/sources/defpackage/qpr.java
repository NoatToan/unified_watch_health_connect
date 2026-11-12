package defpackage;

import com.nimbusds.jose.util.Base64;
import java.io.ByteArrayInputStream;
import java.security.Provider;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes6.dex */
public class qpr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Provider f31732a;

    public static X509Certificate a(String str) {
        int iIndexOf;
        String strSubstring;
        int iIndexOf2;
        if (str == null || str.isEmpty() || (iIndexOf = str.indexOf("-----BEGIN CERTIFICATE-----")) < 0 || (iIndexOf2 = (strSubstring = str.substring(iIndexOf + 27)).indexOf("-----END CERTIFICATE-----")) < 0) {
            return null;
        }
        return b(new Base64(strSubstring.substring(0, iIndexOf2).replaceAll("\\s", "")).decode());
    }

    public static X509Certificate b(byte[] bArr) {
        try {
            return c(bArr);
        } catch (CertificateException unused) {
            return null;
        }
    }

    public static X509Certificate c(byte[] bArr) throws CertificateException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        Provider provider = f31732a;
        Certificate certificateGenerateCertificate = (provider != null ? CertificateFactory.getInstance("X.509", provider) : CertificateFactory.getInstance("X.509")).generateCertificate(new ByteArrayInputStream(bArr));
        if (certificateGenerateCertificate instanceof X509Certificate) {
            return (X509Certificate) certificateGenerateCertificate;
        }
        throw new CertificateException("Not a X.509 certificate: " + certificateGenerateCertificate.getType());
    }
}
