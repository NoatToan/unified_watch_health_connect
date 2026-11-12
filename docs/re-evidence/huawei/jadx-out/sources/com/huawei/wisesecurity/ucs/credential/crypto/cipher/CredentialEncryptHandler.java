package com.huawei.wisesecurity.ucs.credential.crypto.cipher;

import android.text.TextUtils;
import com.huawei.hidatamanager.util.Const;
import com.huawei.wisesecurity.kfs.crypto.cipher.CipherAlg;
import com.huawei.wisesecurity.kfs.crypto.cipher.EncryptHandler;
import com.huawei.wisesecurity.kfs.crypto.codec.Decoder;
import com.huawei.wisesecurity.kfs.crypto.codec.Encoder;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.CredentialClient;
import com.huawei.wisesecurity.ucs.credential.entity.SkDkEntity;
import com.huawei.wisesecurity.ucs_credential.k;
import defpackage.ynk;
import defpackage.ynw;
import defpackage.ynz;
import defpackage.yoc;
import defpackage.yqe;
import defpackage.yqg;
import defpackage.yqj;
import defpackage.yql;
import defpackage.yrm;
import java.nio.charset.StandardCharsets;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes46.dex */
public class CredentialEncryptHandler implements EncryptHandler {
    private CredentialCipherText cipherText;
    private Credential credential;
    private CredentialClient credentialClient;

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.EncryptHandler
    public String toHex() throws yqe {
        return to(Encoder.HEX);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.EncryptHandler
    public String toBase64Url() throws yqe {
        return to(Encoder.BASE64URL);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.EncryptHandler
    public String toBase64() throws yqe {
        return to(Encoder.BASE64);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.EncryptHandler
    public byte[] to() throws yqe {
        doEncrypt();
        return this.cipherText.getCipherBytes();
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.EncryptHandler
    public CredentialEncryptHandler fromHex(String str) throws yqe {
        return from(str, Decoder.HEX);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.EncryptHandler
    public CredentialEncryptHandler fromBase64Url(String str) throws yqe {
        return from(str, Decoder.BASE64URL);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.EncryptHandler
    public CredentialEncryptHandler fromBase64(String str) throws yqe {
        return from(str, Decoder.BASE64);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.EncryptHandler
    public CredentialEncryptHandler from(byte[] bArr) throws yqe {
        if (bArr == null) {
            throw new yqe(Const.RawDataType.HEALTH_EVENT_RECORD, "plainBytes cannot null..");
        }
        this.cipherText.setPlainBytes(yoc.a(bArr));
        return this;
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.cipher.EncryptHandler
    public CredentialEncryptHandler from(String str) throws yqe {
        if (TextUtils.isEmpty(str)) {
            throw new yqe(Const.RawDataType.HEALTH_EVENT_RECORD, "plainText cannot empty..");
        }
        return from(str.getBytes(StandardCharsets.UTF_8));
    }

    private String to(Encoder encoder) throws yqe {
        try {
            doEncrypt();
            return encoder.encode(this.cipherText.getCipherBytes());
        } catch (ynw e) {
            StringBuilder sbB = yql.b("Fail to encode cipher bytes: ");
            sbB.append(e.getMessage());
            throw new yqe(1003L, sbB.toString());
        }
    }

    private CredentialEncryptHandler from(String str, Decoder decoder) throws yqe {
        try {
            from(decoder.decode(str));
            return this;
        } catch (ynw e) {
            StringBuilder sbB = yql.b("Fail to decode plain text : ");
            sbB.append(e.getMessage());
            throw new yqe(1003L, sbB.toString());
        }
    }

    private void doEncrypt() throws yqe {
        yrm yrmVar = (yrm) new yrm().e().setApiName("appAuth.encrypt").setCallTime();
        try {
            try {
                this.cipherText.checkParam(true);
                this.cipherText.setCipherBytes(new ynk.e().c(new SecretKeySpec(SkDkEntity.from(this.credential.getDataKeyBytes()).decryptSkDk(k.a(this.credential)), "AES")).a(CipherAlg.AES_GCM).c(this.cipherText.getIv()).b().getEncryptHandler().from(this.cipherText.getPlainBytes()).to());
                yrmVar.setStatusCode(0);
                this.credentialClient.reportLogs(yrmVar);
            } catch (ynz e) {
                e = e;
                String str = "Fail to encrypt, errorMessage : " + e.getMessage();
                yrmVar.setStatusCode(1003).setErrorMsg(str);
                throw new yqe(1003L, str);
            } catch (yqg e2) {
                String str2 = "Fail to encrypt, errorMessage : " + e2.getMessage();
                yrmVar.setStatusCode(1001).setErrorMsg(str2);
                throw new yqe(Const.RawDataType.HEALTH_EVENT_RECORD, str2);
            } catch (yqj e3) {
                e = e3;
                String str3 = "Fail to encrypt, errorMessage : " + e.getMessage();
                yrmVar.setStatusCode(1003).setErrorMsg(str3);
                throw new yqe(1003L, str3);
            }
        } catch (Throwable th) {
            this.credentialClient.reportLogs(yrmVar);
            throw th;
        }
    }

    public CredentialEncryptHandler(Credential credential, CredentialCipherText credentialCipherText, CredentialClient credentialClient) {
        this.credential = credential;
        this.cipherText = credentialCipherText;
        this.credentialClient = credentialClient;
    }
}
