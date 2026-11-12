package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class x6q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f38764a;

    public x6q(String str) {
        this.f38764a = str;
    }

    public static x6q a(JSONObject jSONObject) {
        try {
            return new x6q(jSONObject.getString("requestId"));
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("requestId", this.f38764a);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
