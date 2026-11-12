package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class obn {
    private static final String d = "DeviceID";
    private String e = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f44054c = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44053b = null;

    public void b(String str) {
        this.e = str;
    }

    public JSONObject c() {
        try {
            String str = d;
            ocq.e(str, "Build DeviceID json Object start");
            JSONObject jSONObject = new JSONObject();
            String str2 = this.e;
            if (str2 != null) {
                jSONObject.put("IMEI", str2);
            }
            String str3 = this.f44054c;
            if (str3 != null) {
                jSONObject.put("MEID", str3);
            }
            String str4 = this.f44053b;
            if (str4 != null) {
                jSONObject.put("SN", str4);
            }
            if (ocq.f44154c.booleanValue()) {
                ocq.e(str, "Build DeviceID json Object end, json-string:" + jSONObject.toString());
            }
            return jSONObject;
        } catch (JSONException unused) {
            ocq.c(d, "Build DeviceID json occured JSONException.");
            return null;
        }
    }

    void c(String str) {
        JSONObject jSONObject;
        try {
            if (str == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str);
            }
            this.e = jSONObject.optString("IMEI");
            this.f44054c = jSONObject.optString("MEID");
            this.f44053b = jSONObject.optString("SN");
            if (ocq.f44154c.booleanValue()) {
                ocq.e(d, "Parse response json info, jsonObj.toString() = " + jSONObject.toString());
            }
        } catch (JSONException unused) {
            ocq.e(d, "Parse response json info occured JSONException");
        }
    }
}
