package defpackage;

import io.jsonwebtoken.Header;
import io.jsonwebtoken.JwsHeader;
import java.nio.charset.StandardCharsets;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class yrc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Certificate[] f53772b;

    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("alg", "PS256");
            jSONObject.put(Header.CONTENT_TYPE, "AndroidKS");
            Certificate[] certificateArr = this.f53772b;
            int length = 3;
            if (certificateArr.length <= 3) {
                length = certificateArr.length;
            }
            for (int i = 0; i < length; i++) {
                jSONArray.put(yqo.a(this.f53772b[i].getEncoded(), 2));
            }
            jSONObject.put(JwsHeader.X509_CERT_CHAIN, jSONArray);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("len", 32);
            jSONObject.put(JwsHeader.KEY_ID, yqo.a(jSONObject2.toString().getBytes(StandardCharsets.UTF_8), 10));
            return yqo.a(jSONObject.toString().getBytes(StandardCharsets.UTF_8), 10);
        } catch (CertificateEncodingException | JSONException | yqj e) {
            yqi.e("CredentialJws", "generate TAHeader exception: {0}", e.getMessage());
            return "";
        }
    }

    public yrc(String str, Certificate[] certificateArr, String str2) {
        this.f53772b = certificateArr;
    }
}
