package defpackage;

import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;

/* JADX INFO: loaded from: classes20.dex */
public class yqs {
    public static boolean d(Certificate[] certificateArr) throws yqj {
        String strSubstring;
        if (certificateArr == null || certificateArr.length <= 0) {
            throw new yqj(1022L, "isRootCertSupport params certificates is null!");
        }
        Certificate certificate = certificateArr[certificateArr.length - 1];
        if (certificate == null) {
            throw new yqj(1022L, "params certificate is null!");
        }
        try {
            for (String str : yqy.d(yqo.a(certificate.getEncoded(), 0)).getSubjectDN().getName().split(",")) {
                if (str.startsWith("CN=")) {
                    strSubstring = str.substring(3);
                    return "Android Keystore Software Attestation Root".equals(strSubstring);
                }
            }
            strSubstring = null;
            return "Android Keystore Software Attestation Root".equals(strSubstring);
        } catch (CertificateEncodingException e) {
            StringBuilder sbB = yql.b("get certificate param fail: ");
            sbB.append(e.getMessage());
            throw new yqj(1022L, sbB.toString());
        }
    }
}
