package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q6q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31183a;

    public q6q(int i) {
        this.f31183a = i;
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.f31183a);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
