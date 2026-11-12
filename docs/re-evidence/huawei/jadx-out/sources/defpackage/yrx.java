package defpackage;

import android.content.Context;
import com.huawei.hidatamanager.util.Const;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.CredentialClient;
import com.huawei.wisesecurity.ucs.credential.entity.EcKeyPair;
import com.huawei.wisesecurity.ucs.credential.entity.ErrorBody;
import com.huawei.wisesecurity.ucs.credential.entity.UcsKeyStoreProvider;
import com.huawei.wisesecurity.ucs.credential.nativelib.UcsLib;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkCapability;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkResponse;
import com.huawei.wisesecurity.ucs_credential.c;
import com.huawei.wisesecurity.ucs_credential.n0;
import java.security.cert.Certificate;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class yrx extends c {
    @Override // com.huawei.wisesecurity.ucs_credential.c
    public void a() throws yqj {
        Context context = this.f30829b;
        if (!yqr.c() || yqk.c("ucs_ec_keystore_sp_key_t", -1, context) == 0) {
            throw yra.e("UcsECKeyStoreHandler", "keyStoreCertificateChain is off. not support android keyStore EC.", new Object[0], 1022L, "keyStoreCertificateChain is off. not support android keyStore EC.");
        }
    }

    @Override // com.huawei.wisesecurity.ucs_credential.c
    public String b() throws yqj {
        yrj.b(UcsKeyStoreProvider.ANDROID_KEYSTORE);
        n0 n0Var = yrj.f53779a;
        yrj yrjVar = (yrj) n0Var;
        yrjVar.d("ucs_ec_alias_rootKey");
        Certificate[] certificateArrB = yrjVar.b("ucs_ec_alias_rootKey");
        if (yqs.d(certificateArrB)) {
            yqr.a(this.f30829b);
            throw new yqj(2001L, "android keystore EC no support software attestation root.");
        }
        yro yroVar = new yro();
        yroVar.j = "ucs_ec_alias_rootKey";
        yroVar.k = "ED256";
        yroVar.i = n0Var;
        yroVar.n = certificateArrB;
        yroVar.l = "AndroidKS";
        List<String> pkgNameCertFP = UcsLib.getPkgNameCertFP(this.f30829b);
        yroVar.f30834c = 1;
        yroVar.d = this.e;
        yroVar.e = this.d;
        yroVar.f = 1;
        yroVar.g = pkgNameCertFP.get(0);
        yroVar.h = pkgNameCertFP.get(1);
        EcKeyPair ecKeyPairE = yre.e(this.f30829b);
        yroVar.o = yqo.a(ecKeyPairE.getPublicKey(), 2);
        yre.e(ecKeyPairE);
        return yroVar.a();
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
        sbB.append("; error code : ");
        sbB.append(errorBodyFromString.getErrorCode());
        String string = sbB.toString();
        yqi.e("UcsECKeyStoreHandler", string, new Object[0]);
        if (c.b(errorBodyFromString.getErrorCode())) {
            yqr.a(this.f30829b);
            yqi.a("UcsECKeyStoreHandler", "turn off android keystore EC CertificateChain", new Object[0]);
        }
        throw new yqj(1024L, string);
    }

    @Override // com.huawei.wisesecurity.ucs_credential.c
    public Credential a(String str, String str2, String str3, String str4, yqv yqvVar) throws yqj {
        try {
            yqi.a("UcsECKeyStoreHandler", "applyCredential use KeyStoreEcHandler.", new Object[0]);
            return a(str, str2, str3, str4);
        } catch (Throwable th) {
            StringBuilder sbB = yql.b("applyCredential use KeyStoreEcHandler get exception: ");
            sbB.append(th.getMessage());
            yqi.e("UcsECKeyStoreHandler", sbB.toString(), new Object[0]);
            return yqvVar.d(3, str, str2, str3, str4, yqvVar);
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

    public yrx(CredentialClient credentialClient, Context context, NetworkCapability networkCapability) throws yqj {
        super(credentialClient, context, networkCapability);
    }
}
