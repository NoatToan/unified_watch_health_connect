package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class obt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f44070b = "RequestMultiSIMServiceInfo";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f44071a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f44072c;
    private String d;
    private String e;
    private String f;
    private String g = null;
    private String h = null;
    private String j = null;
    private obn i = null;

    public void e(String str) {
        this.f = str;
    }

    public void a(String str) {
        this.e = str;
    }

    public void b(String str) {
        this.d = str;
    }

    public void i(String str) {
        this.g = str;
    }

    public void d(String str) {
        this.h = str;
    }

    public void c(String str) {
        this.j = str;
    }

    public void e(obn obnVar) {
        this.i = obnVar;
    }

    public void d(boolean z) {
        this.f44072c = z;
    }

    public void e(boolean z) {
        this.f44071a = z;
    }

    public JSONObject a() {
        try {
            String str = f44070b;
            ocq.e(str, "Build RequestMultiSIMServiceInfo JsonObj start");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Request", this.f);
            jSONObject.put("PrimaryIDType", this.e);
            jSONObject.put("PrimaryID", this.d);
            jSONObject.put("EuiccPairing", this.f44071a);
            jSONObject.put("LiveIdSupported", this.f44072c);
            String str2 = this.g;
            if (str2 != null) {
                jSONObject.put("SecondaryIDType", str2);
            }
            String str3 = this.h;
            if (str3 != null) {
                jSONObject.put("SecondaryID", str3);
            }
            String str4 = this.j;
            if (str4 != null) {
                jSONObject.put("SecondaryDeviceName", str4);
            }
            obn obnVar = this.i;
            if (obnVar != null) {
                jSONObject.put("DeviceID", obnVar.c());
            }
            if (ocq.f44154c.booleanValue()) {
                ocq.e(str, "Build RequestMultiSIMServiceInfo JsonObj result:" + jSONObject.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            ocq.c(f44070b, "Build RequestMultiSIMServiceInfo JsonObj occured JSONException");
            return null;
        }
    }
}
