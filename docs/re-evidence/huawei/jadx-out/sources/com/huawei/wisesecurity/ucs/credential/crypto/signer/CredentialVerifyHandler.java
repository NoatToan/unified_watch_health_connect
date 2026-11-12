package com.huawei.wisesecurity.ucs.credential.crypto.signer;

import android.text.TextUtils;
import com.huawei.hidatamanager.util.Const;
import com.huawei.wisesecurity.kfs.crypto.codec.Decoder;
import com.huawei.wisesecurity.kfs.crypto.signer.SignAlg;
import com.huawei.wisesecurity.kfs.crypto.signer.VerifyHandler;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.CredentialClient;
import com.huawei.wisesecurity.ucs.credential.entity.SkDkEntity;
import com.huawei.wisesecurity.ucs_credential.k;
import defpackage.ynu;
import defpackage.ynw;
import defpackage.ynz;
import defpackage.yqe;
import defpackage.yqg;
import defpackage.yqj;
import defpackage.yql;
import defpackage.yrm;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes20.dex */
public class CredentialVerifyHandler implements VerifyHandler {
    private Credential credential;
    private CredentialClient credentialClient;
    private CredentialSignText signText;

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.VerifyHandler
    public boolean verifyHex(String str) throws yqe {
        return verify(str, Decoder.HEX);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.VerifyHandler
    public boolean verifyBase64Url(String str) throws yqe {
        return verify(str, Decoder.BASE64URL);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.VerifyHandler
    public boolean verifyBase64(String str) throws yqe {
        return verify(str, Decoder.BASE64);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.VerifyHandler
    public boolean verify(byte[] bArr) throws yqe {
        this.signText.setSignature(bArr);
        return doVerify();
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.VerifyHandler
    public boolean verify(String str) throws yqe {
        if (TextUtils.isEmpty(str)) {
            throw new yqe(Const.RawDataType.HEALTH_EVENT_RECORD, "signature cannot empty..");
        }
        return verify(str.getBytes(StandardCharsets.UTF_8));
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.VerifyHandler
    public CredentialVerifyHandler fromHexData(String str) throws yqe {
        return fromData(str, Decoder.HEX);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.VerifyHandler
    public CredentialVerifyHandler fromData(byte[] bArr) {
        this.signText.setDataBytes(bArr);
        return this;
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.VerifyHandler
    public CredentialVerifyHandler fromData(String str) throws yqe {
        if (TextUtils.isEmpty(str)) {
            throw new yqe(Const.RawDataType.HEALTH_EVENT_RECORD, "dataString cannot empty..");
        }
        return fromData(str.getBytes(StandardCharsets.UTF_8));
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.VerifyHandler
    public CredentialVerifyHandler fromBase64UrlData(String str) throws yqe {
        return fromData(str, Decoder.BASE64URL);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.VerifyHandler
    public CredentialVerifyHandler fromBase64Data(String str) throws yqe {
        return fromData(str, Decoder.BASE64);
    }

    private boolean verify(String str, Decoder decoder) throws yqe {
        try {
            return verify(decoder.decode(str));
        } catch (ynw e) {
            StringBuilder sbB = yql.b("Fail to decode signature : ");
            sbB.append(e.getMessage());
            throw new yqe(1003L, sbB.toString());
        }
    }

    private CredentialVerifyHandler fromData(String str, Decoder decoder) throws yqe {
        try {
            fromData(decoder.decode(str));
            return this;
        } catch (ynw e) {
            StringBuilder sbB = yql.b("Fail to decode sign data: ");
            sbB.append(e.getMessage());
            throw new yqe(1003L, sbB.toString());
        }
    }

    private boolean doVerify() throws yqe {
        yrm yrmVar = (yrm) new yrm().e().setApiName("appAuth.verify").setCallTime();
        try {
            try {
                this.signText.checkParam(false);
                boolean zCheckSignature = checkSignature(new ynu.e().e(SkDkEntity.from(this.credential.getSecretKeyBytes()).decryptSkDk(k.a(this.credential))).c(SignAlg.HMAC_SHA256).e().getSignHandler().from(this.signText.getDataBytes()).sign(), this.signText.getSignature());
                yrmVar.setStatusCode(0);
                this.credentialClient.reportLogs(yrmVar);
                return zCheckSignature;
            } catch (ynz e) {
                e = e;
                String str = "Fail to verify, errorMessage : " + e.getMessage();
                yrmVar.setStatusCode(1003).setErrorMsg(str);
                throw new yqe(1003L, str);
            } catch (yqg e2) {
                String str2 = "Fail to verify, errorMessage : " + e2.getMessage();
                yrmVar.setStatusCode(1001).setErrorMsg(str2);
                throw new yqe(Const.RawDataType.HEALTH_EVENT_RECORD, str2);
            } catch (yqj e3) {
                e = e3;
                String str3 = "Fail to verify, errorMessage : " + e.getMessage();
                yrmVar.setStatusCode(1003).setErrorMsg(str3);
                throw new yqe(1003L, str3);
            }
        } catch (Throwable th) {
            this.credentialClient.reportLogs(yrmVar);
            throw th;
        }
    }

    private boolean checkSignature(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public CredentialVerifyHandler(Credential credential, CredentialSignText credentialSignText, CredentialClient credentialClient) {
        this.credential = credential;
        this.signText = credentialSignText;
        this.credentialClient = credentialClient;
    }
}
