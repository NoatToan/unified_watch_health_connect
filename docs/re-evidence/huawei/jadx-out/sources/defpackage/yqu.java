package defpackage;

import android.content.Context;
import com.huawei.hidatamanager.util.Const;
import com.huawei.wisesecurity.ucs.credential.Credential;
import com.huawei.wisesecurity.ucs.credential.CredentialClient;
import com.huawei.wisesecurity.ucs.credential.entity.ErrorBody;
import com.huawei.wisesecurity.ucs.credential.nativelib.UcsLib;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkCapability;
import com.huawei.wisesecurity.ucs.credential.outer.NetworkResponse;
import com.huawei.wisesecurity.ucs_credential.c;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class yqu extends c {
    public boolean i;
    public yru j;

    @Override // com.huawei.wisesecurity.ucs_credential.c
    public void a() throws yqj {
        yru yruVar = this.j;
        yqw yqwVar = new yqw();
        if (yqwVar.b(yruVar.f53790a)) {
            yruVar.e(false, yqwVar);
            return;
        }
        try {
            yrr.d(yruVar.f53790a, yqwVar);
        } catch (yqj e) {
            long jE = e.e();
            yqi.b("KeyComponentManger", "Init using local file failed, code = {0}, msg = {1}", Long.valueOf(jE), e.getMessage());
            yqi.a("KeyComponentManger", "Try update data = componnet from server", new Object[0]);
            yruVar.e(true, yqwVar);
        }
    }

    @Override // com.huawei.wisesecurity.ucs_credential.c
    public String b() throws yqj {
        int iC = yqk.c("Local-C1-Version", -1, this.f30829b);
        yqi.c("KidHandler", "c1 version is " + iC + ", so version is " + ((int) UcsLib.ucsGetSoVersion()), new Object[0]);
        return new String(UcsLib.genReqJws(this.f30829b, this.d, this.e, 0, iC), StandardCharsets.UTF_8);
    }

    @Override // com.huawei.wisesecurity.ucs_credential.c
    public Credential a(String str) throws yqj {
        try {
            int i = Integer.parseInt(new JSONObject(str).getString("expire"));
            if (i == 0) {
                return this.g.genCredentialFromString(str);
            }
            if (i != 1) {
                if (i != 2) {
                    throw new yqj(1017L, "unenable expire.");
                }
                throw new yqj(1016L, "so version is unenable.");
            }
            if (!this.i) {
                throw new yqj(1021L, "c1 vision is unenable.");
            }
            yqi.c("KidHandler", "c1 version expired, start to force update c1!", new Object[0]);
            this.j.e(true, new yqw());
            this.i = false;
            return a(this.f30830c, this.d, this.e, this.f);
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
        throw yra.e("KidHandler", string, new Object[0], 1024L, string);
    }

    @Override // com.huawei.wisesecurity.ucs_credential.c
    public Credential a(String str, String str2, String str3, String str4, yqv yqvVar) throws yqj {
        yqi.a("KidHandler", "applyCredential use KidHandler.", new Object[0]);
        return a(str, str2, str3, str4);
    }

    public yqu(CredentialClient credentialClient, Context context, NetworkCapability networkCapability, yru yruVar) throws yqj {
        super(credentialClient, context, networkCapability);
        this.i = true;
        this.j = yruVar;
    }
}
