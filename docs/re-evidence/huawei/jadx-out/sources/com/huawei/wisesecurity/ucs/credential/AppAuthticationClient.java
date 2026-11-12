package com.huawei.wisesecurity.ucs.credential;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.openalliance.ad.db.bean.SdkCfgSha256Record;
import com.huawei.wisesecurity.kfs.crypto.signer.SignAlg;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsNotNull;
import com.huawei.wisesecurity.ucs.credential.crypto.signer.CredentialSignAlg;
import com.huawei.wisesecurity.ucs.credential.entity.SkDkEntity;
import com.huawei.wisesecurity.ucs.credential.nativelib.UcsLib;
import com.huawei.wisesecurity.ucs_credential.k;
import defpackage.ynu;
import defpackage.yny;
import defpackage.yoj;
import defpackage.yqe;
import defpackage.yqg;
import defpackage.yqi;
import defpackage.yqj;
import defpackage.yql;
import defpackage.yqo;
import defpackage.yqq;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
@Deprecated
public class AppAuthticationClient {
    private CredentialSignAlg alg;
    private Context context;
    private Credential credential;
    private String extra;

    @Deprecated
    public String getAppAuthtication() throws yqj {
        String strA;
        String str;
        String str2;
        String strA2 = "";
        try {
            yqq yqqVar = new yqq();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("alg", "HS256");
                strA = yqo.a(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 10);
            } catch (JSONException | yqj e) {
                yqi.e("AppAuthticationJws", "generate Header exception: {0}", e.getMessage());
                strA = "";
            }
            yqqVar.f53766b = strA;
            if (this.credential.getAkskVersion() < 1) {
                List<String> pkgNameCertFP = UcsLib.getPkgNameCertFP(this.context);
                str2 = pkgNameCertFP.get(0);
                str = pkgNameCertFP.get(1);
            } else {
                str = "";
                str2 = str;
            }
            String str3 = this.extra;
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(SdkCfgSha256Record.PKGNAME, str2);
                jSONObject2.put("certSig", str);
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject2.put(KnitFragment.KEY_EXTRA, str3);
                }
                strA2 = yqo.a(jSONObject2.toString().getBytes(StandardCharsets.UTF_8), 10);
            } catch (JSONException | yqj e2) {
                yqi.e("AppAuthticationJws", "generate PayLoad exception: {0}", e2.getMessage());
            }
            yqqVar.f53765a = strA2;
            yqqVar.e = yqo.a(new ynu.e().e(SkDkEntity.from(this.credential.getSecretKeyBytes()).decryptSkDk(k.a(this.credential))).c(SignAlg.HMAC_SHA256).e().getSignHandler().from(yqqVar.c()).sign(), 10);
            return yqqVar.e();
        } catch (UnsupportedOperationException unused) {
            throw new yqj(2001L, "new String UnsupportedOperationException..");
        } catch (yqe e3) {
            throw new yqj(1022L, e3.getMessage());
        } catch (Exception e4) {
            StringBuilder sbB = yql.b("app info auth Exception : ");
            sbB.append(e4.getMessage());
            throw new yqj(2001L, sbB.toString());
        }
    }

    @Deprecated
    public static class Builder {

        @KfsNotNull
        private CredentialSignAlg alg = CredentialSignAlg.HMAC_SHA256;

        @KfsNotNull
        private Context context;

        @KfsNotNull
        private Credential credential;
        private String extra;

        public Builder extra(String str) {
            this.extra = str;
            return this;
        }

        public Builder credential(Credential credential) {
            this.credential = credential;
            return this;
        }

        public Builder context(Context context) {
            this.context = context;
            return this;
        }

        public AppAuthticationClient build() throws yqj {
            try {
                yoj.d(this);
                return new AppAuthticationClient(this.context, this.credential, this.extra, this.alg);
            } catch (yny e) {
                StringBuilder sbB = yql.b("AppAuthticationClient check param error : ");
                sbB.append(e.getMessage());
                throw new yqg(sbB.toString());
            }
        }

        public Builder alg(CredentialSignAlg credentialSignAlg) {
            this.alg = credentialSignAlg;
            return this;
        }
    }

    private AppAuthticationClient(Context context, Credential credential, String str, CredentialSignAlg credentialSignAlg) {
        this.context = context;
        this.credential = credential;
        this.extra = str;
        this.alg = credentialSignAlg;
    }
}
