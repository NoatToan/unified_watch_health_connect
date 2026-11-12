package defpackage;

import android.text.TextUtils;
import io.jsonwebtoken.JwsHeader;
import java.nio.charset.StandardCharsets;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class yrs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f53784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f53785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f53786c;
    public String d;

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String[] f53787b;
        public String d;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f53788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f53789b;
    }

    public void a(String[] strArr) throws yqj {
        try {
            JSONObject jSONObject = new JSONObject(new String(yqo.a(strArr[1], 8), StandardCharsets.UTF_8));
            b bVar = new b();
            this.f53786c = bVar;
            bVar.f53788a = jSONObject.getString("component");
            this.f53786c.f53789b = jSONObject.getInt("version");
        } catch (RuntimeException | JSONException e) {
            StringBuilder sbB = yql.b("Fail to convert jws string to payload, ");
            sbB.append(e.getMessage());
            throw new yqj(1012L, sbB.toString());
        }
    }

    public void c(String[] strArr) throws yqj {
        try {
            JSONObject jSONObject = new JSONObject(new String(yqo.a(strArr[0], 8), StandardCharsets.UTF_8));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(JwsHeader.X509_CERT_CHAIN);
            String[] strArr2 = {jSONArrayOptJSONArray.optString(0), jSONArrayOptJSONArray.optString(1)};
            a aVar = new a();
            this.f53784a = aVar;
            aVar.d = jSONObject.getString("alg");
            this.f53784a.f53787b = strArr2;
        } catch (RuntimeException | JSONException e) {
            StringBuilder sbB = yql.b("Fail to convert jws string to header, ");
            sbB.append(e.getMessage());
            throw new yqj(1012L, sbB.toString());
        }
    }

    public void a(String str, String[] strArr) throws yqj {
        try {
            this.f53785b = yqo.a(strArr[2], 8);
            this.d = str.substring(0, str.lastIndexOf("."));
        } catch (yqj e) {
            StringBuilder sbB = yql.b("Fail to convert jws string to Content, ");
            sbB.append(e.getMessage());
            throw new yqj(1012L, sbB.toString());
        }
    }

    public final void e(String str) throws yqj {
        if (TextUtils.isEmpty(str)) {
            throw new yqj(1012L, "ComponentJws is empty.");
        }
    }

    public yrs(String str) throws yqj {
        e(str);
        String[] strArrSplit = str.split("\\.");
        c(strArrSplit);
        a(strArrSplit);
        a(str, strArrSplit);
    }
}
