package defpackage;

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class o1i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f28642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f28643b;
    public HashMap<Long, String> c = new HashMap<>();

    public static o1i a(JSONObject jSONObject) throws JSONException {
        o1i o1iVar = new o1i();
        o1iVar.f28642a = jSONObject.optString("type");
        o1iVar.f28643b = jSONObject.optLong("last_modify");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("list");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObject2 = (JSONObject) jSONArrayOptJSONArray.get(i);
                if (jSONObject2 != null) {
                    o1iVar.c.put(Long.valueOf(jSONObject2.optLong("developer_id")), jSONObject2.optString("key"));
                }
            }
        }
        return o1iVar;
    }
}
