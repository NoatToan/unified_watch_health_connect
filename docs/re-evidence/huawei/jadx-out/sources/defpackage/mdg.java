package defpackage;

import com.huawei.hiai.awareness.client.AwarenessRequest;
import com.huawei.hwlogsmodel.LogUtil;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mdg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f41462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f41463c;
    private String d;
    private String e;

    public String a() {
        return this.f41463c;
    }

    public void b(String str) {
        this.f41463c = str;
    }

    public String c() {
        return this.d;
    }

    public void d(String str) {
        this.d = str;
    }

    public String b() {
        return this.f41461a;
    }

    public void a(String str) {
        this.f41461a = str;
    }

    public String e() {
        return this.e;
    }

    public void c(String str) {
        this.e = str;
    }

    public String d() {
        return this.f41462b;
    }

    public void e(String str) {
        this.f41462b = str;
    }

    public static mdg b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        mdg mdgVar = new mdg();
        try {
            mdgVar.f41463c = mea.b(jSONObject, "apduNo");
            mdgVar.d = mea.b(jSONObject, "apduContent");
            mdgVar.f41461a = mea.b(jSONObject, "apduStatus");
            mdgVar.e = mea.b(jSONObject, AwarenessRequest.Field.COMMAND);
            mdgVar.f41462b = mea.b(jSONObject, "checker");
            return mdgVar;
        } catch (JSONException e) {
            LogUtil.a("ServerAccessApdu", "buildFromJson,JSONException exception:", e.getMessage());
            return null;
        }
    }

    public String toString() {
        return "ServerAccessApdu{apduId='" + this.f41463c + "', apduContent='" + this.d + "', apduStatus='" + this.f41461a + "', command='" + this.e + "', checker='" + this.f41462b + "'}";
    }
}
