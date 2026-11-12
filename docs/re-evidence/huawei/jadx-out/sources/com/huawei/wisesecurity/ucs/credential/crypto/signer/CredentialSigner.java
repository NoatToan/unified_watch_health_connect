package com.huawei.wisesecurity.ucs.credential.crypto.signer;

import com.huawei.wisesecurity.kfs.crypto.signer.KfsSigner;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsNotNull;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.CredentialClient;
import defpackage.yny;
import defpackage.yoj;
import defpackage.yqg;
import defpackage.yqj;
import defpackage.yql;

/* JADX INFO: loaded from: classes20.dex */
public class CredentialSigner implements KfsSigner {
    private Credential credential;
    private CredentialClient credentialClient;
    private CredentialSignText signText;

    public static class Builder {

        @KfsNotNull
        private Credential credential;

        @KfsNotNull
        private CredentialClient credentialClient;

        @KfsNotNull
        private CredentialSignAlg signAlg = CredentialSignAlg.HMAC_SHA256;

        public Builder withCredentialClient(CredentialClient credentialClient) {
            this.credentialClient = credentialClient;
            return this;
        }

        public Builder withCredential(Credential credential) {
            this.credential = credential;
            return this;
        }

        public Builder withAlg(CredentialSignAlg credentialSignAlg) {
            this.signAlg = credentialSignAlg;
            return this;
        }

        public CredentialSigner build() throws yqj {
            try {
                yoj.d(this);
                return new CredentialSigner(this.signAlg, this.credential, this.credentialClient);
            } catch (yny e) {
                StringBuilder sbB = yql.b("CredentialCipher check param error : ");
                sbB.append(e.getMessage());
                throw new yqg(sbB.toString());
            }
        }
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.KfsSigner
    public CredentialVerifyHandler getVerifyHandler() {
        return new CredentialVerifyHandler(this.credential, this.signText, this.credentialClient);
    }

    @Override // com.huawei.wisesecurity.kfs.crypto.signer.KfsSigner
    public CredentialSignHandler getSignHandler() {
        return new CredentialSignHandler(this.credential, this.signText, this.credentialClient);
    }

    private CredentialSigner(CredentialSignAlg credentialSignAlg, Credential credential, CredentialClient credentialClient) {
        this.credential = credential;
        CredentialSignText credentialSignText = new CredentialSignText();
        this.signText = credentialSignText;
        credentialSignText.setAlgId(credentialSignAlg);
        this.credentialClient = credentialClient;
    }
}
