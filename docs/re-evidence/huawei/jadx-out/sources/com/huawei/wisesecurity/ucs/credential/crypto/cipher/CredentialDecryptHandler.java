package com.huawei.wisesecurity.ucs.credential.crypto.cipher;

import com.huawei.hidatamanager.util.Const;
import com.huawei.wisesecurity.kfs.crypto.cipher.CipherAlg;
import com.huawei.wisesecurity.kfs.crypto.cipher.DecryptHandler;
import com.huawei.wisesecurity.kfs.crypto.codec.Decoder;
import com.huawei.wisesecurity.kfs.crypto.codec.Encoder;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.CredentialClient;
import com.huawei.wisesecurity.ucs.credential.entity.SkDkEntity;
import com.huawei.wisesecurity.ucs_credential.k;
import defpackage.ynk;
import defpackage.ynw;
import defpackage.ynz;
import defpackage.yqe;
import defpackage.yqg;
import defpackage.yqj;
import defpackage.yql;
import defpackage.yrm;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes46.dex */
public class CredentialDecryptHandler implements DecryptHandler {
    private CredentialCipherText cipherText;
    private Credential credential;
    private CredentialClient credentialClient;

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.DecryptHandler
    public String toRawString() throws yqe {
        return to(Encoder.RAW);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.DecryptHandler
    public String toHex() throws yqe {
        return to(Encoder.HEX);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.DecryptHandler
    public String toBase64() throws yqe {
        return to(Encoder.BASE64);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.DecryptHandler
    public byte[] to() throws yqe {
        doDecrypt();
        return this.cipherText.getPlainBytes();
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.DecryptHandler
    public CredentialDecryptHandler fromHex(String str) throws yqe {
        return from(str, Decoder.HEX);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.DecryptHandler
    public CredentialDecryptHandler fromBase64Url(String str) throws yqe {
        return from(str, Decoder.BASE64URL);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.DecryptHandler
    public CredentialDecryptHandler fromBase64(String str) throws yqe {
        return from(str, Decoder.BASE64);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.DecryptHandler
    public CredentialDecryptHandler from(byte[] bArr) throws yqe {
        if (bArr == null) {
            throw new yqe(Const.RawDataType.HEALTH_EVENT_RECORD, "cipherBytes cannot null..");
        }
        this.cipherText.setCipherBytes(bArr);
        return this;
    }

    private String to(Encoder encoder) throws yqe {
        try {
            return encoder.encode(to());
        } catch (ynw e) {
            StringBuilder sbB = yql.b("Fail to encode plain text: ");
            sbB.append(e.getMessage());
            throw new yqe(1003L, sbB.toString());
        }
    }

    private CredentialDecryptHandler from(String str, Decoder decoder) throws yqe {
        try {
            from(decoder.decode(str));
            return this;
        } catch (ynw e) {
            StringBuilder sbB = yql.b("Fail to decode cipher text: ");
            sbB.append(e.getMessage());
            throw new yqe(1003L, sbB.toString());
        }
    }

    private void doDecrypt() throws yqe {
        yrm yrmVar = (yrm) new yrm().e().setApiName("appAuth.decrypt").setCallTime();
        try {
            try {
                this.cipherText.checkParam(false);
                this.cipherText.setPlainBytes(new ynk.e().c(new SecretKeySpec(SkDkEntity.from(this.credential.getDataKeyBytes()).decryptSkDk(k.a(this.credential)), "AES")).a(CipherAlg.AES_GCM).c(this.cipherText.getIv()).b().getDecryptHandler().from(this.cipherText.getCipherBytes()).to());
                yrmVar.setStatusCode(0);
                this.credentialClient.reportLogs(yrmVar);
            } catch (ynz e) {
                e = e;
                String str = "Fail to decrypt, errorMessage : " + e.getMessage();
                yrmVar.setStatusCode(1003).setErrorMsg(str);
                throw new yqe(1003L, str);
            } catch (yqg e2) {
                String str2 = "Fail to decrypt, errorMessage : " + e2.getMessage();
                yrmVar.setStatusCode(1001).setErrorMsg(str2);
                throw new yqe(Const.RawDataType.HEALTH_EVENT_RECORD, str2);
            } catch (yqj e3) {
                e = e3;
                String str3 = "Fail to decrypt, errorMessage : " + e.getMessage();
                yrmVar.setStatusCode(1003).setErrorMsg(str3);
                throw new yqe(1003L, str3);
            }
        } catch (Throwable th) {
            this.credentialClient.reportLogs(yrmVar);
            throw th;
        }
    }

    public CredentialDecryptHandler(Credential credential, CredentialCipherText credentialCipherText, CredentialClient credentialClient) {
        this.credential = credential;
        this.cipherText = credentialCipherText;
        this.credentialClient = credentialClient;
    }
}
