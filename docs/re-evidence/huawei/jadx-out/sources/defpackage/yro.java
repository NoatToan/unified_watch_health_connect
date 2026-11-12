package defpackage;

import com.huawei.hidatamanager.util.Const;
import com.huawei.wisesecurity.ucs_credential.n0;
import com.huawei.wisesecurity.ucs_credential.r;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.JwsHeader;
import java.nio.charset.StandardCharsets;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class yro extends r {
    public n0 i;
    public String j;
    public String k;
    public String l;
    public int m = 5;
    public Certificate[] n;
    public String o;

    public String a() throws yqj {
        try {
            this.f30833b.put("alg", this.m);
            this.f30833b.put("pbk", this.o);
            this.f30832a.put("alg", this.k);
            this.f30832a.put(Header.CONTENT_TYPE, this.l);
            int iMin = Math.min(this.n.length, 3);
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < iMin; i++) {
                jSONArray.put(yqo.a(this.n[i].getEncoded(), 2));
            }
            this.f30832a.put(JwsHeader.X509_CERT_CHAIN, jSONArray);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("len", 32);
            this.f30832a.put(JwsHeader.KEY_ID, yqo.a(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 10));
            try {
                this.f30833b.put("kekAlg", this.f30834c);
                this.f30833b.put("packageName", this.d);
                this.f30833b.put("appId", this.e);
                this.f30833b.put("akskVersion", this.f);
                this.f30833b.put("appPkgName", this.g);
                this.f30833b.put("appCertFP", this.h);
                String str = yqo.a(this.f30832a.toString().getBytes(StandardCharsets.UTF_8), 10) + "." + yqo.a(this.f30833b.toString().getBytes(StandardCharsets.UTF_8), 10);
                n0 n0Var = this.i;
                if (n0Var == null) {
                    throw new yqj(1022L, "UcsKeyStore must no null");
                }
                return str + "." + yqo.a(n0Var.a(this.j, str), 10);
            } catch (JSONException e) {
                yqi.e("JwsKeystoreCredentialReqGenerator", "generate payload exception: {0}", e.getMessage());
                StringBuilder sbB = yql.b("build payload json error: ");
                sbB.append(e.getMessage());
                throw new yqj(Const.RawDataType.HEALTH_SLEEP_RECORD, sbB.toString());
            }
        } catch (CertificateEncodingException | JSONException e2) {
            StringBuilder sbB2 = yql.b("put json error: ");
            sbB2.append(e2.getMessage());
            yqi.e("JwsKeystoreECCredentialReqGenerator", sbB2.toString(), new Object[0]);
            StringBuilder sbB3 = yql.b("put json error: ");
            sbB3.append(e2.getMessage());
            throw new yqj(Const.RawDataType.HEALTH_SLEEP_RECORD, sbB3.toString());
        }
    }
}
