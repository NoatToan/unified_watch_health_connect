package com.xiaomi.digitalkey.wearable.certificate;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes7.dex */
public class InstanceCertificate extends DkCertificate {
    final String LogTag;
    String mInstanceCAId;

    public InstanceCertificate(X509Certificate x509Certificate) {
        super(x509Certificate);
        this.LogTag = "SDK-DKF-InstanceCertificate:";
        this.mInstanceCAId = parseInstanceCAId();
    }

    public String getInstanceCAId() {
        return this.mInstanceCAId;
    }

    public String parseInstanceCAId() {
        String[] strArrSplit = getSubject().split("=");
        int length = strArrSplit.length;
        return strArrSplit[1];
    }

    public InstanceCertificate(byte[] bArr) throws CertificateException {
        super(bArr);
        this.LogTag = "SDK-DKF-InstanceCertificate:";
        this.mInstanceCAId = parseInstanceCAId();
    }
}
