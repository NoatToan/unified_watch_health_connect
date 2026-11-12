package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mbg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f41330b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41331c = 0;

    public String d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("blockData", this.f41330b);
            jSONObject.put("errCode", this.f41331c);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }

    public String toString() {
        return "BlockData{blockData='" + this.f41330b + "', errCode='" + this.f41331c + '}';
    }

    public void a(String str) {
        if (str == null) {
            return;
        }
        if (!"".equals(this.f41330b)) {
            this.f41330b += "@";
        }
        this.f41330b += str;
    }

    public void d(int i) {
        this.f41331c = i;
    }
}
