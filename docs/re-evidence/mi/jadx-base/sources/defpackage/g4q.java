package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class g4q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18594b;
    public int c;
    public String d;

    public static g4q a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            g4q g4qVar = new g4q();
            g4qVar.e(jSONObject.optString("tv_id"));
            g4qVar.f(jSONObject.optString("public_key"));
            g4qVar.d(jSONObject.optInt("serial_num"));
            g4qVar.c(jSONObject.optString("secrypt_key"));
            return g4qVar;
        } catch (JSONException e) {
            ycm.a("Error: " + e.getMessage());
            return null;
        }
    }

    public String b() {
        return this.f18593a;
    }

    public void c(String str) {
        this.d = str;
    }

    public void d(int i) {
        this.c = i;
    }

    public void e(String str) {
        this.f18593a = str;
    }

    public void f(String str) {
        this.f18594b = str;
    }

    public String g() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tv_id", this.f18593a);
            jSONObject.put("public_key", this.f18594b);
            jSONObject.put("serial_num", this.c);
            jSONObject.put("secrypt_key", this.d);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }
}
