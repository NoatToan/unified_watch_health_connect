package defpackage;

import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class jk1 {
    public static final qpe c = aqe.f(jk1.class);
    public static jk1 d = new jk1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, Set<String>> f22878a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22879b = false;

    public class a implements h08.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f22880a;

        public a(Map map) {
            this.f22880a = map;
        }

        @Override // h08.a
        public void a(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("offline_asr");
                JSONArray jSONArray = jSONObject.getJSONArray("online_asr_list");
                HashSet hashSet = new HashSet();
                for (int i = 0; i < jSONArray.length(); i++) {
                    hashSet.add(jSONArray.getString(i));
                }
                this.f22880a.put(string, hashSet);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public static jk1 b() {
        return d;
    }

    public boolean a(String str, String str2) {
        if (q08.a(str)) {
            return false;
        }
        if (str.equalsIgnoreCase(str2)) {
            return true;
        }
        c();
        Set<String> set = this.f22878a.get(str);
        if (set != null) {
            return set.contains(str2);
        }
        return false;
    }

    public synchronized void c() {
        if (!this.f22879b) {
            d();
            this.f22879b = true;
        }
    }

    public final void d() {
        try {
            HashMap map = new HashMap();
            h08.b(t08.a("asr_similar_intervene.gz"), true, new a(map));
            this.f22878a = map;
        } catch (IOException | ConcurrentModificationException e) {
            e.printStackTrace();
            c.error("Fail to load resource of asr_similar_intervene.gz: " + e.getMessage());
        }
    }
}
