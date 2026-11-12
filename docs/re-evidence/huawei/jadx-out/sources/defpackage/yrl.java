package defpackage;

import android.content.Context;
import android.os.Build;
import com.huawei.hidatamanager.util.Const;
import com.huawei.hms.framework.common.EmuiUtil;
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
public class yrl extends c {
    @Override // com.huawei.wisesecurity.ucs_credential.c
    public void a() throws yqj {
        Context context = this.f30829b;
        if (!yqr.c() || yqk.c("ucs_ec_huks_sp_key_t", -1, context) == 0) {
            throw yra.e("HuksHandler", "keyStoreCertificateChain is off. not support huks EC.", new Object[0], 1026L, "keyStoreCertificateChain is off. not support huks EC.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004c  */
    @Override // com.huawei.wisesecurity.ucs_credential.c
    public String b() throws yqj {
        String str;
        yrj.b(UcsKeyStoreProvider.HUAWEI_KEYSTORE);
        n0 n0Var = yrj.f53779a;
        yrj yrjVar = (yrj) n0Var;
        yrjVar.d("ucs_ec_alias_rootKey");
        Certificate[] certificateArrB = yrjVar.b("ucs_ec_alias_rootKey");
        if (certificateArrB.length > 2) {
            certificateArrB = new Certificate[]{certificateArrB[0], certificateArrB[1]};
        }
        yro yroVar = new yro();
        yroVar.j = "ucs_ec_alias_rootKey";
        if (Build.MANUFACTURER.equals("HONOR")) {
            try {
                if (Class.forName(EmuiUtil.BUILDEX_VERSION).getField(EmuiUtil.EMUI_SDK_INT).getInt(null) >= 31) {
                    str = "ED256";
                } else {
                    str = "ED256HUKS";
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            }
        } else {
            str = "ED256HUKS";
        }
        yroVar.k = str;
        yroVar.i = n0Var;
        yroVar.n = certificateArrB;
        List<String> pkgNameCertFP = UcsLib.getPkgNameCertFP(this.f30829b);
        yroVar.l = "huks";
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
        if (networkResponse.isSuccessful()) {
            return networkResponse.getBody();
        }
        ErrorBody errorBodyFromString = ErrorBody.fromString(networkResponse.getBody());
        StringBuilder sbB = yql.b("tsms service error, ");
        sbB.append(errorBodyFromString.getErrorMessage());
        sbB.append("; error code : ");
        sbB.append(errorBodyFromString.getErrorCode());
        String string = sbB.toString();
        yqi.e("HuksHandler", string, new Object[0]);
        if (c.b(errorBodyFromString.getErrorCode())) {
            yqk.e("ucs_ec_huks_sp_key_t", 0, this.f30829b);
            yqi.a("HuksHandler", "turn off huks EC CertificateChain", new Object[0]);
        }
        throw new yqj(1024L, string);
    }

    @Override // com.huawei.wisesecurity.ucs_credential.c
    public Credential a(String str, String str2, String str3, String str4, yqv yqvVar) throws yqj {
        try {
            yqi.a("HuksHandler", "applyCredential use HuksHandler.", new Object[0]);
            return a(str, str2, str3, str4);
        } catch (Throwable th) {
            StringBuilder sbB = yql.b("applyCredential use HuksHandler get exception: ");
            sbB.append(th.getMessage());
            yqi.e("HuksHandler", sbB.toString(), new Object[0]);
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

    public yrl(CredentialClient credentialClient, Context context, NetworkCapability networkCapability) throws yqj {
        super(credentialClient, context, networkCapability);
    }
}
