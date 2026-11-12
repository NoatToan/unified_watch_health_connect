package com.huawei.wisesecurity.ucs.credential.crypto.cipher;

import defpackage.yoc;
import defpackage.yqg;

/* JADX INFO: loaded from: classes46.dex */
public class CredentialCipherText {
    private CredentialCipherAlg algId;
    private byte[] cipherBytes;
    private byte[] iv;
    private byte[] plainBytes;

    public void setPlainBytes(byte[] bArr) {
        this.plainBytes = yoc.a(bArr);
    }

    public void setIv(byte[] bArr) {
        this.iv = yoc.a(bArr);
    }

    public void setCipherBytes(byte[] bArr) {
        this.cipherBytes = yoc.a(bArr);
    }

    public void setAlgId(CredentialCipherAlg credentialCipherAlg) {
        this.algId = credentialCipherAlg;
    }

    public byte[] getPlainBytes() {
        return yoc.a(this.plainBytes);
    }

    public byte[] getIv() {
        return yoc.a(this.iv);
    }

    public byte[] getCipherBytes() {
        return yoc.a(this.cipherBytes);
    }

    public int getAlgId() {
        return this.algId.getId();
    }

    public void checkParam(boolean z) throws yqg {
        byte[] bArr = this.iv;
        if (bArr == null || (this.algId == CredentialCipherAlg.AES_GCM && bArr.length != 12)) {
            throw new yqg("illegal iv param..");
        }
        if (z) {
            byte[] bArr2 = this.plainBytes;
            if (bArr2 == null || bArr2.length == 0) {
                throw new yqg("plainBytes data can not be empty..");
            }
            return;
        }
        byte[] bArr3 = this.cipherBytes;
        if (bArr3 == null || bArr3.length == 0) {
            throw new yqg("cipherBytes data can not be empty..");
        }
    }
}
