package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class obu {
    private static final String d = "RequestServiceProvisionInfo";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f44075c;
    private int g;
    private String i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44073a = "ServiceProvisionRequest";
    private obt e = null;
    private oca h = null;

    public void e(int i) {
        this.g = i;
    }

    public void e(String str) {
        this.f44075c = str;
    }

    public void a(String str) {
        this.f44074b = str;
    }

    public void b(String str) {
        this.i = str;
    }

    public void c(obt obtVar) {
        this.e = obtVar;
    }

    public JSONObject b() {
        try {
            String str = d;
            ocq.e(str, "Build RequestServiceProvisionInfo JsonObj start");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ReqSN", this.g);
            jSONObject.put("ReqName", this.f44073a);
            jSONObject.put("PrimaryIDType", this.f44075c);
            jSONObject.put("PrimaryID", this.f44074b);
            jSONObject.put("Services", this.i);
            obt obtVar = this.e;
            if (obtVar != null) {
                jSONObject.put("MultiSIMServiceRequest", obtVar.a());
            }
            oca ocaVar = this.h;
            if (ocaVar != null) {
                jSONObject.put("eSIMProfileRequest", ocaVar.b());
            }
            if (ocq.f44154c.booleanValue()) {
                ocq.e(str, "Build RequestServiceProvisionInfo JsonObj result:" + jSONObject.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            ocq.c(d, "Build RequestServiceProvisionInfo JsonObj occured JSONException");
            return null;
        }
    }
}
