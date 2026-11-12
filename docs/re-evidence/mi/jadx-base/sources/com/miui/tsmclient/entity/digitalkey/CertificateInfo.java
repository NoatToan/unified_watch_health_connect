package com.miui.tsmclient.entity.digitalkey;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class CertificateInfo {

    @SerializedName("cert")
    private String mCertificate;

    @SerializedName("certType")
    private String mCertificateType;

    public String getCertificate() {
        return this.mCertificate;
    }

    public String getCertificateType() {
        return this.mCertificateType;
    }
}
