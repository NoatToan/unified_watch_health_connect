package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class obs {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f44067b = "PrimaryDevice";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private obn f44068a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f44069c;
    private String d;
    private String e;

    public String e() {
        return this.d;
    }

    public void a(String str) {
        JSONObject jSONObject;
        try {
            if (str == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str);
            }
            this.d = jSONObject.optString("MSISDN");
            this.e = jSONObject.optString("IMSI");
            obn obnVar = new obn();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("DeviceID");
            if (jSONObjectOptJSONObject != null) {
                obnVar.c(jSONObjectOptJSONObject.toString());
            }
            this.f44068a = obnVar;
            this.f44069c = jSONObject.optString("ServStatus");
            if (ocq.f44154c.booleanValue()) {
                ocq.e(f44067b, "PrimaryDevice to json string = " + jSONObject.toString());
            }
        } catch (JSONException unused) {
            ocq.e(f44067b, "Parse response information occured JSONException");
        }
    }
}
