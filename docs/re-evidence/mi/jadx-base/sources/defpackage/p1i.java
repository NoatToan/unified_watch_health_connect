package defpackage;

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class p1i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f29909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f29910b;
    public HashMap<String, wb6> c;

    public static p1i a(JSONObject jSONObject) throws JSONException {
        p1i p1iVar = new p1i();
        p1iVar.f29909a = jSONObject.optString("type");
        p1iVar.f29910b = jSONObject.optLong("last_modify");
        p1iVar.c = b(jSONObject.optJSONArray("list"));
        return p1iVar;
    }

    public static HashMap<String, wb6> b(JSONArray jSONArray) throws JSONException {
        HashMap<String, wb6> map = new HashMap<>();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                if (jSONObject != null) {
                    wb6 wb6VarB = wb6.b(jSONObject);
                    map.put(wb6VarB.f37796a, wb6VarB);
                }
            }
        }
        return map;
    }
}
