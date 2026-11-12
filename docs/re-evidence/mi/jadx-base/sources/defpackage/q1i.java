package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class q1i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p1i f30990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o1i f30991b;

    public static q1i c(JSONObject jSONObject, boolean z, boolean z2) throws JSONException {
        q1i q1iVar = new q1i();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("devices");
        if (jSONObjectOptJSONObject != null && z) {
            q1iVar.f30990a = p1i.a(jSONObjectOptJSONObject);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("developers");
        if (jSONObjectOptJSONObject2 != null && z2) {
            q1iVar.f30991b = o1i.a(jSONObjectOptJSONObject2);
        }
        return q1iVar;
    }

    public boolean a() {
        o1i o1iVar = this.f30991b;
        if (o1iVar == null) {
            return true;
        }
        return "full".equalsIgnoreCase(o1iVar.f28642a);
    }

    public boolean b() {
        p1i p1iVar = this.f30990a;
        if (p1iVar == null) {
            return true;
        }
        return "full".equalsIgnoreCase(p1iVar.f29909a);
    }
}
