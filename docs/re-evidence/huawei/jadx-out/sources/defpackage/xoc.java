package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class xoc extends xoa {
    private static final String d = "GetPassTypeIdInfoRequest";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f53223b;

    public String a() {
        return this.f53223b;
    }

    public void a(String str) {
        this.f53223b = str;
    }

    public JSONObject c(JSONObject jSONObject) {
        if (jSONObject == null) {
            xnd.d(d, "GetPassTypeIdInfoRequest createRequestData params error.", false);
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("header", jSONObject);
            if (!xpi.d(a(), true)) {
                jSONObject2.put("passTypeId", a());
            }
            return jSONObject2;
        } catch (JSONException unused) {
            xnd.a(d, "GetPassTypeIdInfoRequest createRequestData, JSONException");
            return null;
        }
    }
}
