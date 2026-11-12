package defpackage;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class obw {
    private static final String e = "RequestAuthSecondInfo";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44080b;
    private String d;
    private int f;
    private int h;
    private String j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private obn f44081c = null;
    private String g = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44079a = null;

    public void b(int i) {
        this.h = i;
    }

    public void a(String str) {
        this.j = str;
    }

    public void b(String str) {
        this.f44080b = str;
    }

    public void e(String str) {
        this.d = str;
    }

    public JSONArray c() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(a());
        return jSONArray;
    }

    public JSONObject a() {
        try {
            String str = e;
            ocq.e(str, "Build RequestAuthSecondInfo JsonObj start");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ReqSN", this.h);
            jSONObject.put("AuthType", this.f44080b);
            jSONObject.put("ReqName", this.j);
            jSONObject.put("Payload", this.d);
            obn obnVar = this.f44081c;
            if (obnVar != null) {
                jSONObject.put("DeviceID", obnVar.c());
            }
            String str2 = this.g;
            if (str2 != null) {
                jSONObject.put("Sessionid", str2);
            }
            String str3 = this.f44079a;
            if (str3 != null) {
                jSONObject.put("MSISDN", str3);
            }
            jSONObject.put("Timer", this.f);
            if (ocq.f44154c.booleanValue()) {
                ocq.e(str, "Build RequestAuthSecondInfo JsonObj result:" + jSONObject.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            ocq.c(e, "Build RequestAuthSecondInfo JsonObj occured JSONException");
            return null;
        }
    }
}
