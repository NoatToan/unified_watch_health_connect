package com.huawei.wisesecurity.ucs.credential.crypto.signer;

import defpackage.yoc;
import defpackage.yqg;
import defpackage.yqj;

/* JADX INFO: loaded from: classes20.dex */
public class CredentialSignText {
    private CredentialSignAlg algId;
    private byte[] dataBytes;
    private byte[] signature;

    public void setSignature(byte[] bArr) {
        this.signature = yoc.a(bArr);
    }

    public void setDataBytes(byte[] bArr) {
        this.dataBytes = yoc.a(bArr);
    }

    public void setAlgId(CredentialSignAlg credentialSignAlg) {
        this.algId = credentialSignAlg;
    }

    public byte[] getSignature() {
        return yoc.a(this.signature);
    }

    public byte[] getDataBytes() {
        return yoc.a(this.dataBytes);
    }

    public int getAlgId() {
        return this.algId.getId();
    }

    public void checkParam(boolean z) throws yqj {
        byte[] bArr = this.dataBytes;
        if (bArr == null || bArr.length == 0) {
            throw new yqg("dataBytes data can not be empty..");
        }
        if (z) {
            return;
        }
        byte[] bArr2 = this.signature;
        if (bArr2 == null || bArr2.length == 0) {
            throw new yqg("signature data can not be empty..");
        }
    }
}
