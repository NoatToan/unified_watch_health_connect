package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hidatamanager.util.Const;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.CredentialClient;
import com.huawei.wisesecurity.ucs.credential.entity.ErrorBody;
import com.huawei.wisesecurity.ucs.credential.entity.UcsKeyStoreProvider;
import com.huawei.wisesecurity.ucs.credential.nativelib.UcsLib;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkCapability;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkResponse;
import com.huawei.wisesecurity.ucs_credential.c;
import java.nio.charset.StandardCharsets;
import java.security.cert.Certificate;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class yrw extends c {
    @Override // com.huawei.wisesecurity.ucs_credential.c
    public void a() throws yqj {
        Context context = this.f30829b;
        if (!yqr.c() || yqk.c("ucs_keystore_sp_key_t", -1, context) == 0) {
            throw yra.e("KeyStoreHandler", "keyStoreCertificateChain is off. not support keyStore RSA.", new Object[0], 1022L, "keyStoreCertificateChain is off. not support keyStore RSA.");
        }
    }

    @Override // com.huawei.wisesecurity.ucs_credential.c
    public String b() throws yqj {
        String strA;
        if (yrk.f53781a == null) {
            yrk.e.c((UcsKeyStoreProvider) null);
        }
        yrk yrkVar = yrk.e;
        yrkVar.c("ucs_alias_rootKey");
        Certificate[] certificateArrE = yrkVar.e("ucs_alias_rootKey");
        if (yqs.d(certificateArrE)) {
            yqr.b(this.f30829b);
            throw new yqj(2001L, "android keystore RSA no support software attestation root.");
        }
        String string = new yrc("PS256", certificateArrE, "AndroidKS").toString();
        List<String> pkgNameCertFP = UcsLib.getPkgNameCertFP(this.f30829b);
        String str = this.e;
        String str2 = this.d;
        String str3 = pkgNameCertFP.get(0);
        String str4 = pkgNameCertFP.get(1);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("alg", 2);
            jSONObject.put("kekAlg", 1);
            jSONObject.put("packageName", str);
            jSONObject.put("appId", str2);
            jSONObject.put("akskVersion", 1);
            jSONObject.put("appPkgName", str3);
            jSONObject.put("appCertFP", str4);
            strA = yqo.a(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 10);
        } catch (JSONException | yqj e) {
            yqi.e("CredentialJws", "generate payload exception: {0}", e.getMessage());
            strA = "";
        }
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(strA)) {
            throw new yqj(1006L, "Get signStr error");
        }
        String strA2 = yqo.a(yrkVar.a("ucs_alias_rootKey", string + "." + strA), 10);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(strA) || TextUtils.isEmpty(strA2)) {
            throw new yqj(1006L, "get credential JWS is empty...");
        }
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(strA)) {
            throw new yqj(1006L, "Get signStr error");
        }
        sb.append(string + "." + strA);
        sb.append(".");
        sb.append(strA2);
        return sb.toString();
    }

    @Override // com.huawei.wisesecurity.ucs_credential.c
    public String a(NetworkResponse networkResponse) throws yqj {
        boolean zIsSuccessful = networkResponse.isSuccessful();
        String body = networkResponse.getBody();
        if (zIsSuccessful) {
            return body;
        }
        ErrorBody errorBodyFromString = ErrorBody.fromString(body);
        StringBuilder sbB = yql.b("tsms service error, ");
        sbB.append(errorBodyFromString.getErrorMessage());
        String string = sbB.toString();
        yqi.e("KeyStoreHandler", string, new Object[0]);
        if (c.b(errorBodyFromString.getErrorCode())) {
            yqr.b(this.f30829b);
            yqi.a("KeyStoreHandler", "turn off android keystore CertificateChain", new Object[0]);
        }
        throw new yqj(1024L, string);
    }

    @Override // com.huawei.wisesecurity.ucs_credential.c
    public Credential a(String str, String str2, String str3, String str4, yqv yqvVar) throws yqj {
        try {
            yqi.a("KeyStoreHandler", "applyCredential use KeyStoreHandler.", new Object[0]);
            return a(str, str2, str3, str4);
        } catch (Throwable th) {
            StringBuilder sbB = yql.b("applyCredential use KeyStoreHandler get exception: ");
            sbB.append(th.getMessage());
            yqi.e("KeyStoreHandler", sbB.toString(), new Object[0]);
            return yqvVar.d(0, str, str2, str3, str4, yqvVar);
        }
    }

    @Override // com.huawei.wisesecurity.ucs_credential.c
    public Credential a(String str) throws yqj {
        try {
            if (Integer.parseInt(new JSONObject(str).getString("expire")) == 0) {
                return this.g.genCredentialFromString(str);
            }
            throw new yqj(1017L, "unenable expire.");
        } catch (NumberFormatException e) {
            StringBuilder sbB = yql.b("parse TSMS resp expire error : ");
            sbB.append(e.getMessage());
            throw new yqj(2001L, sbB.toString());
        } catch (JSONException e2) {
            StringBuilder sbB2 = yql.b("parse TSMS resp get json error : ");
            sbB2.append(e2.getMessage());
            throw new yqj(Const.RawDataType.HEALTH_SLEEP_RECORD, sbB2.toString());
        }
    }

    public yrw(CredentialClient credentialClient, Context context, NetworkCapability networkCapability) throws yqj {
        super(credentialClient, context, networkCapability);
    }
}
