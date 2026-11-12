package defpackage;

import com.xiaomi.ai.api.common.Instruction;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class l08 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f24473a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24474b = false;
    public JSONArray c = null;
    public JSONObject d = null;
    public JSONArray e = new JSONArray();
    public JSONObject f = null;
    public JSONObject g = null;

    public JSONObject a() {
        return this.g;
    }

    public JSONArray b() {
        return this.c;
    }

    public boolean c() {
        return this.f24473a;
    }

    public boolean d() {
        return this.f24474b;
    }

    public void e(JSONObject jSONObject) {
        this.f = jSONObject;
    }

    public void f(JSONObject jSONObject) {
        this.d = jSONObject;
    }

    public void g(Instruction instruction) {
        if (instruction != null) {
            try {
                this.e.put(this.e.length(), new JSONObject(instruction.toString()));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public void h(boolean z) {
        this.f24473a = z;
    }

    public void i(boolean z) {
        this.f24474b = z;
    }

    public JSONObject j() {
        try {
            JSONObject jSONObject = new JSONObject(g08.a(this));
            JSONObject jSONObject2 = this.d;
            if (jSONObject2 != null) {
                jSONObject.put("last_answer", jSONObject2);
            }
            JSONObject jSONObject3 = this.f;
            if (jSONObject3 != null) {
                jSONObject.put("device_status", jSONObject3);
            }
            JSONObject jSONObject4 = this.g;
            if (jSONObject4 != null) {
                jSONObject.put("forceground_app", jSONObject4);
            }
            JSONArray jSONArray = this.c;
            if (jSONArray != null) {
                jSONObject.put("installed_apps", jSONArray);
            }
            if (this.e.length() > 0) {
                jSONObject.put("items", this.e);
            }
            return jSONObject;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
