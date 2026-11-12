package defpackage;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class a08 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONObject f465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONObject f466b;

    public a08() {
    }

    public JSONObject a() {
        return this.f466b;
    }

    public JSONObject b() {
        return this.f465a;
    }

    public void c(JSONObject jSONObject) {
        this.f466b = jSONObject;
    }

    public void d(JSONObject jSONObject) {
        this.f465a = jSONObject;
    }

    public a08(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f465a = jSONObject;
        this.f466b = jSONObject2;
    }
}
