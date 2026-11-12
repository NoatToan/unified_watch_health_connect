package com.xiaomi.digitalkey.wearable.certificate;

import com.xiaomi.digitalkey.wearable.utils.Logger;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.util.Date;

/* JADX INFO: loaded from: classes7.dex */
public class DkCertificate {
    protected static final boolean DEBUG = Logger.LOG_CERTIFICATE;
    public static final String DEVICE_ENCRYPTION_OID = "1.3.6.1.4.1.41577.5.7";
    public static final String ENDPOINT_OID = "1.3.6.1.4.1.41577.5.4";
    private static final boolean ERR = true;
    public static final String EXTERNAL_CA_OID = "1.3.6.1.4.1.41577.5.2";
    public static final String INSTANCE_CA_OID = "1.3.6.1.4.1.41577.5.3";
    public static final String VEHICLE_INTERMEDIATE_OID = "1.3.6.1.4.1.41577.5.8";
    public static final String VEHICLE_OEM_CA_OID = "1.3.6.1.4.1.41577.5.9";
    public static final String VEHICLE_OEM_ENCRYPTION_OID = "1.3.6.1.4.1.41577.5.5";
    public static final String VEHICLE_OEM_SIGNATURE_OID = "1.3.6.1.4.1.41577.5.6";
    public static final String VEHICLE_PUBLIC_KEY_OID = "1.3.6.1.4.1.41577.5.1";
    protected final String LogTag = "SDK-DKF-DkCertificate:";
    protected X509Certificate certificate;

    public DkCertificate(X509Certificate x509Certificate) {
        this.certificate = x509Certificate;
    }

    public Date getNotAfter() {
        return this.certificate.getNotAfter();
    }

    public Date getNotBefore() {
        return this.certificate.getNotBefore();
    }

    public byte[] getPublicKeyBytes() {
        int length;
        int i;
        ECPublicKey eCPublicKey = (ECPublicKey) this.certificate.getPublicKey();
        byte[] byteArray = eCPublicKey.getW().getAffineX().toByteArray();
        byte[] byteArray2 = eCPublicKey.getW().getAffineY().toByteArray();
        byte[] bArr = new byte[65];
        int i2 = 1;
        int length2 = 32;
        if (byteArray.length > 32) {
            i = 1;
            length = 32;
        } else {
            length = byteArray.length;
            i = 0;
        }
        bArr[0] = 4;
        System.arraycopy(byteArray, i, bArr, 33 - length, length);
        if (byteArray2.length <= 32) {
            length2 = byteArray2.length;
            i2 = 0;
        }
        System.arraycopy(byteArray2, i2, bArr, 65 - length2, length2);
        return bArr;
    }

    public String getSubject() {
        return this.certificate.getSubjectX500Principal().getName("RFC2253");
    }

    public String toString() {
        return this.certificate.toString();
    }

    public DkCertificate(byte[] bArr) throws CertificateException {
        this.certificate = null;
        if (bArr == null) {
            return;
        }
        this.certificate = (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(bArr));
    }
}
