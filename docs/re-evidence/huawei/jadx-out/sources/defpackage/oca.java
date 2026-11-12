package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class oca {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f44093b = "RequesteSIMProfileInfo";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44094a;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private obn f44095c = null;

    public JSONObject b() {
        try {
            String str = f44093b;
            ocq.e(str, "Build RequesteSIMProfileInfo JsonObj start");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Request", this.g);
            jSONObject.put("Mainid", this.f);
            jSONObject.put("Idtype", this.d);
            String str2 = this.e;
            if (str2 != null) {
                jSONObject.put("EID", str2);
            }
            String str3 = this.f44094a;
            if (str3 != null) {
                jSONObject.put("ICCID", str3);
            }
            String str4 = this.h;
            if (str4 != null) {
                jSONObject.put("IMSI", str4);
            }
            obn obnVar = this.f44095c;
            if (obnVar != null) {
                jSONObject.put("DeviceID", obnVar.c());
            }
            if (ocq.f44154c.booleanValue()) {
                ocq.e(str, "Build RequesteSIMProfileInfo JsonObj result:" + jSONObject.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            ocq.c(f44093b, "Build RequesteSIMProfileInfo JsonObj occured JSONException");
            return null;
        }
    }
}
