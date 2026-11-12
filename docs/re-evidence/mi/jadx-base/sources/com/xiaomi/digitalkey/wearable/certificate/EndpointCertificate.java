package com.xiaomi.digitalkey.wearable.certificate;

import com.xiaomi.digitalkey.wearable.utils.ByteUtils;
import defpackage.hd;
import defpackage.he;
import defpackage.te;
import defpackage.ud;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* JADX INFO: loaded from: classes7.dex */
public class EndpointCertificate extends DkCertificate {
    protected final String LogTag;
    String mVehicleId;

    public EndpointCertificate(byte[] bArr) throws CertificateException {
        super(bArr);
        this.LogTag = "SDK-DKF-EndpointCertificate:";
        parseVehicleId();
    }

    private void parseVehicleId() {
        byte[] extensionValue = this.certificate.getExtensionValue(DkCertificate.ENDPOINT_OID);
        if (extensionValue == null || extensionValue.length == 0) {
            return;
        }
        ud udVar = new ud(extensionValue);
        try {
            ud udVar2 = new ud(((he) udVar.s()).r());
            te teVar = (te) udVar2.s();
            udVar2.close();
            udVar.close();
            hd hdVarT = teVar.t(1);
            if (hdVarT instanceof he) {
                this.mVehicleId = ByteUtils.toHexString(((he) hdVarT).r());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getFriendlyName() {
        String subject = getSubject();
        if (DkCertificate.DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("subCN: ");
            sb.append(subject);
        }
        return getSubject().substring(subject.indexOf("\\=") + 2);
    }

    public byte[] getKeyIdentifier() {
        try {
            return MessageDigest.getInstance("SHA-1").digest(getPublicKeyBytes());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getKeyType() {
        String subject = getSubject();
        if (DkCertificate.DEBUG) {
            StringBuilder sb = new StringBuilder();
            sb.append("subCN: ");
            sb.append(subject);
        }
        int iIndexOf = subject.indexOf(".");
        return subject.substring(iIndexOf + 1, iIndexOf + 5);
    }

    public String getVehicleId() {
        return this.mVehicleId;
    }
}
