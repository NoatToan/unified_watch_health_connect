package defpackage;

import android.util.ArraySet;
import java.util.Collection;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class epq {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f16945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Set<String> f16946b;

        public b() {
        }
    }

    public static String a(Set<String> set) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", (Object) null);
            jSONObject.put("features", new JSONArray((Collection) set));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    public static boolean b(String str, String str2) {
        Set<String> set = c(str).f16946b;
        return set != null && set.contains(str2);
    }

    public static b c(String str) {
        b bVar = new b();
        if (str != null && !str.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("version")) {
                    bVar.f16945a = jSONObject.getString("version");
                }
                if (jSONObject.has("features")) {
                    bVar.f16946b = new ArraySet();
                    JSONArray jSONArray = jSONObject.getJSONArray("features");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        bVar.f16946b.add(jSONArray.getString(i));
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return bVar;
    }
}
