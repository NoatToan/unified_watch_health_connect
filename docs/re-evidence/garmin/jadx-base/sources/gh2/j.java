package gh2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f77465b = m.a("RemoteConfigParser");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<String> f77466a;

    public j(List<String> list) {
        ArrayList<String> arrayList = new ArrayList<>();
        this.f77466a = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    public final HashMap a(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("parameters");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, b(jSONObject.getJSONObject(next)));
            }
            return map;
        } catch (JSONException e4) {
            f77465b.error("parse", (Throwable) e4);
            return null;
        }
    }

    public final String b(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("defaultValue");
        ArrayList<String> arrayList = this.f77466a;
        JSONObject jSONObjectOptJSONObject3 = null;
        if (arrayList.size() > 0 && (jSONObjectOptJSONObject = jSONObject.optJSONObject("conditionalValues")) != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            int i14 = -1;
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                int iLastIndexOf = arrayList.lastIndexOf(next);
                if (iLastIndexOf > i14) {
                    jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject(next);
                    i14 = iLastIndexOf;
                }
            }
        }
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject2 = jSONObjectOptJSONObject3;
        }
        return jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("value") : "";
    }

    public j() {
        this(null);
    }
}
