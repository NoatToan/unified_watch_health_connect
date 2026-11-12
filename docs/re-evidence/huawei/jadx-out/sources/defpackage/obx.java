package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class obx {
    private static final String e = "RequestGetDevServInfo";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44083b;
    private String d;
    private String g;
    private int h;
    private String j = null;
    private String f = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f44084c = null;

    public void b(int i) {
        this.h = i;
    }

    public void c(String str) {
        this.d = str;
    }

    public void d(String str) {
        this.f44083b = str;
    }

    public void b(String str) {
        this.f44082a = str;
    }

    public void j(String str) {
        this.g = str;
    }

    public void g(String str) {
        this.j = str;
    }

    public void e(String str) {
        this.f = str;
    }

    public void a(String str) {
        this.f44084c = str;
    }

    public JSONObject d() {
        try {
            String str = e;
            ocq.e(str, "Build RequestGetDevServInfo JsonObj start");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ReqSN", this.h);
            jSONObject.put("ReqName", this.d);
            jSONObject.put("PrimaryIDType", this.f44083b);
            jSONObject.put("PrimaryID", this.f44082a);
            jSONObject.put("Services", this.g);
            String str2 = this.j;
            if (str2 != null) {
                jSONObject.put("SecondaryIDType", str2);
            }
            String str3 = this.f;
            if (str3 != null) {
                jSONObject.put("SecondaryID", str3);
            }
            String str4 = this.f44084c;
            if (str4 != null) {
                jSONObject.put("OldTimeStamp", str4);
            }
            if (ocq.f44154c.booleanValue()) {
                ocq.e(str, "Build RequestGetDevServInfo JsonObj result:" + jSONObject.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            ocq.c(e, "Build RequestGetDevServInfo JsonObj occured JSONException");
            return null;
        }
    }
}
