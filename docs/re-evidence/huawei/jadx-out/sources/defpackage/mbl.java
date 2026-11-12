package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mbl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41337a = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41338c = 0;

    public String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("response", this.f41337a);
            jSONObject.put("errCode", this.f41338c);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }

    public String toString() {
        return "NfcCommandResponse{response='" + this.f41337a + "', errCode='" + this.f41338c + '}';
    }

    public void c(String str) {
        this.f41337a = str;
    }

    public void a(int i) {
        this.f41338c = i;
    }
}
