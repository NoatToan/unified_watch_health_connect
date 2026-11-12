package defpackage;

import android.content.Context;
import com.huawei.hms.support.api.entity.common.CommonPickerConstant;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes20.dex */
public class yqy {
    public static volatile X509Certificate e;

    public static void b(Context context, yrs yrsVar) throws yqj {
        int i;
        if (e == null) {
            synchronized (yqy.class) {
                if (e == null) {
                    e = e(context, "cbg_root.cer");
                }
            }
        }
        String[] strArr = yrsVar.f53784a.f53787b;
        if (strArr == null || strArr.length == 0) {
            throw new yqj(1012L, "verify cert chain failed , certs is empty..");
        }
        int length = strArr.length;
        X509Certificate[] x509CertificateArr = new X509Certificate[length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            x509CertificateArr[i2] = d(strArr[i2]);
        }
        StringBuilder sbB = yql.b("Start verify cert chain using root ca: ");
        sbB.append(e.getSubjectDN().getName());
        yqi.a("CertVerifier", sbB.toString(), new Object[0]);
        int i3 = 0;
        while (true) {
            i = length - 1;
            if (i3 >= i) {
                break;
            }
            try {
                yqi.a("CertVerifier", "verify cert " + x509CertificateArr[i3].getSubjectDN().getName(), new Object[0]);
                StringBuilder sb = new StringBuilder();
                sb.append("using ");
                int i4 = i3 + 1;
                sb.append(x509CertificateArr[i4].getSubjectDN().getName());
                yqi.a("CertVerifier", sb.toString(), new Object[0]);
                x509CertificateArr[i3].checkValidity();
                x509CertificateArr[i3].verify(x509CertificateArr[i4].getPublicKey());
                i3 = i4;
            } catch (RuntimeException | InvalidKeyException | NoSuchAlgorithmException | NoSuchProviderException | SignatureException | CertificateException e2) {
                StringBuilder sbB2 = yql.b("verify cert chain failed , exception ");
                sbB2.append(e2.getMessage());
                String string = sbB2.toString();
                throw yra.e("CertVerifier", string, new Object[0], 1012L, string);
            }
            StringBuilder sbB3 = yql.b("verify cert chain failed , exception ");
            sbB3.append(e2.getMessage());
            String string2 = sbB3.toString();
            throw yra.e("CertVerifier", string2, new Object[0], 1012L, string2);
        }
        x509CertificateArr[i].verify(e.getPublicKey());
        for (String str : x509CertificateArr[0].getSubjectDN().getName().split(",")) {
            if (str.startsWith("OU=") && "Huawei CBG Cloud Security Signer".equals(str.substring(3))) {
                X509Certificate x509Certificate = x509CertificateArr[0];
                try {
                    Signature signature = Signature.getInstance(CommonPickerConstant.IdTokenSupportAlg.RS_256.equals(yrsVar.f53784a.d) ? "SHA256WithRSA" : "SHA256WithRSA/PSS");
                    signature.initVerify(x509Certificate.getPublicKey());
                    signature.update(yrsVar.d.getBytes(StandardCharsets.UTF_8));
                    if (signature.verify(yrsVar.f53785b)) {
                        return;
                    } else {
                        throw new yqj(1012L, "signature not verify");
                    }
                } catch (RuntimeException | InvalidKeyException | NoSuchAlgorithmException | SignatureException e3) {
                    StringBuilder sbB4 = yql.b("verify signature of c1 failed, exception ");
                    sbB4.append(e3.getMessage());
                    String string3 = sbB4.toString();
                    throw yra.e("CertVerifier", string3, new Object[0], 1012L, string3);
                }
            }
        }
        throw new yqj(1012L, "Subject OU not verify");
    }

    public static X509Certificate d(String str) throws yqj {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(yqo.a(str, 0));
            try {
                X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(byteArrayInputStream);
                byteArrayInputStream.close();
                return x509Certificate;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | CertificateException e2) {
            throw new yqj(1012L, e2.getMessage());
        }
    }

    public static X509Certificate e(Context context, String str) throws yqj {
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            try {
                X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(inputStreamOpen);
                if (inputStreamOpen != null) {
                    inputStreamOpen.close();
                }
                return x509Certificate;
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException | CertificateException e2) {
            StringBuilder sbB = yql.b("Read root cert error ");
            sbB.append(e2.getMessage());
            String string = sbB.toString();
            throw yra.e("CertVerifier", string, new Object[0], 1012L, string);
        }
    }
}
