package defpackage;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class obr {
    private static final String e = "RequestAuthInfo";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44064a;
    private String f;
    private int h;
    private String i = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44065b = null;
    private String d = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private obn f44066c = null;
    private String j = null;
    private String g = null;

    public void e(int i) {
        this.h = i;
    }

    public void a(String str) {
        this.f = str;
    }

    public void c(String str) {
        this.f44064a = str;
    }

    public void d(String str) {
        this.f44065b = str;
    }

    public void e(String str) {
        this.d = str;
    }

    public JSONArray c() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(e());
        if (ocq.f44154c.booleanValue()) {
            ocq.e(e, "Build RequestAuthInfo JsonObjArray result:" + jSONArray.toString());
        }
        return jSONArray;
    }

    public JSONObject e() {
        try {
            String str = e;
            ocq.e(str, "Build RequestAuthInfo JsonObj start");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ReqSN", this.h);
            jSONObject.put("ReqName", this.f);
            jSONObject.put("AuthType", this.f44064a);
            String str2 = this.f44065b;
            if (str2 != null) {
                jSONObject.put("Identity", str2);
            }
            String str3 = this.i;
            if (str3 != null) {
                jSONObject.put("MSISDN", str3);
            }
            String str4 = this.d;
            if (str4 != null) {
                jSONObject.put("AuthToken", str4);
            }
            obn obnVar = this.f44066c;
            if (obnVar != null) {
                jSONObject.put("DeviceID", obnVar.c());
            }
            String str5 = this.j;
            if (str5 != null) {
                jSONObject.put("TerminalType", str5);
            }
            String str6 = this.g;
            if (str6 != null) {
                jSONObject.put("TerminalVersion", str6);
            }
            if (ocq.f44154c.booleanValue()) {
                ocq.e(str, "Build RequestAuthInfo JsonObj result:" + jSONObject.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            ocq.c(e, "Build RequestAuthInfo JsonObj occured JSONException");
            return null;
        }
    }
}
