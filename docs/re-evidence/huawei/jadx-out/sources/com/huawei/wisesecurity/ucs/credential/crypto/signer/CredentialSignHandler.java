package com.huawei.wisesecurity.ucs.credential.crypto.signer;

import android.text.TextUtils;
import com.huawei.hidatamanager.util.Const;
import com.huawei.wisesecurity.kfs.crypto.codec.Decoder;
import com.huawei.wisesecurity.kfs.crypto.codec.Encoder;
import com.huawei.wisesecurity.kfs.crypto.signer.SignAlg;
import com.huawei.wisesecurity.kfs.crypto.signer.SignHandler;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.CredentialClient;
import com.huawei.wisesecurity.ucs.credential.entity.SkDkEntity;
import com.huawei.wisesecurity.ucs_credential.k;
import defpackage.ynu;
import defpackage.ynw;
import defpackage.ynz;
import defpackage.yoc;
import defpackage.yqe;
import defpackage.yqg;
import defpackage.yqj;
import defpackage.yql;
import defpackage.yrm;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes20.dex */
public class CredentialSignHandler implements SignHandler {
    private Credential credential;
    private CredentialClient credentialClient;
    private CredentialSignText signText;

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.SignHandler
    public String signHex() throws yqe {
        return sign(Encoder.HEX);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.SignHandler
    public String signBase64Url() throws yqe {
        return sign(Encoder.BASE64URL);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.SignHandler
    public String signBase64() throws yqe {
        return sign(Encoder.BASE64);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.SignHandler
    public byte[] sign() throws yqe {
        doSign();
        return this.signText.getSignature();
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.SignHandler
    public CredentialSignHandler fromHex(String str) throws yqe {
        return from(str, Decoder.HEX);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.SignHandler
    public CredentialSignHandler fromBase64Url(String str) throws yqe {
        return from(str, Decoder.BASE64URL);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.SignHandler
    public CredentialSignHandler fromBase64(String str) throws yqe {
        return from(str, Decoder.BASE64);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.SignHandler
    public CredentialSignHandler from(byte[] bArr) {
        this.signText.setDataBytes(yoc.a(bArr));
        return this;
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.SignHandler
    public CredentialSignHandler from(String str) throws yqe {
        if (TextUtils.isEmpty(str)) {
            throw new yqe(Const.RawDataType.HEALTH_EVENT_RECORD, "dataString cannot empty..");
        }
        return from(str.getBytes(StandardCharsets.UTF_8));
    }

    private String sign(Encoder encoder) throws yqe {
        try {
            doSign();
            return encoder.encode(this.signText.getSignature());
        } catch (ynw e) {
            StringBuilder sbB = yql.b("Fail to encode signature bytes: ");
            sbB.append(e.getMessage());
            throw new yqe(1003L, sbB.toString());
        }
    }

    private CredentialSignHandler from(String str, Decoder decoder) throws yqe {
        try {
            from(decoder.decode(str));
            return this;
        } catch (ynw e) {
            StringBuilder sbB = yql.b("Fail to decode plain text : ");
            sbB.append(e.getMessage());
            throw new yqe(1003L, sbB.toString());
        }
    }

    private void doSign() throws yqe {
        yrm yrmVar = (yrm) new yrm().e().setApiName("appAuth.sign").setCallTime();
        try {
            try {
                this.signText.checkParam(true);
                this.signText.setSignature(new ynu.e().e(SkDkEntity.from(this.credential.getSecretKeyBytes()).decryptSkDk(k.a(this.credential))).c(SignAlg.HMAC_SHA256).e().getSignHandler().from(this.signText.getDataBytes()).sign());
                yrmVar.setStatusCode(0);
                this.credentialClient.reportLogs(yrmVar);
            } catch (ynz e) {
                e = e;
                String str = "Fail to sign, errorMessage : " + e.getMessage();
                yrmVar.setStatusCode(1003).setErrorMsg(str);
                throw new yqe(1003L, str);
            } catch (yqg e2) {
                String str2 = "Fail to sign, errorMessage : " + e2.getMessage();
                yrmVar.setStatusCode(1001).setErrorMsg(str2);
                throw new yqe(Const.RawDataType.HEALTH_EVENT_RECORD, str2);
            } catch (yqj e3) {
                e = e3;
                String str3 = "Fail to sign, errorMessage : " + e.getMessage();
                yrmVar.setStatusCode(1003).setErrorMsg(str3);
                throw new yqe(1003L, str3);
            }
        } catch (Throwable th) {
            this.credentialClient.reportLogs(yrmVar);
            throw th;
        }
    }

    public CredentialSignHandler(Credential credential, CredentialSignText credentialSignText, CredentialClient credentialClient) {
        this.credential = credential;
        this.signText = credentialSignText;
        this.credentialClient = credentialClient;
    }
}
