package defpackage;

import com.google.android.gms.actions.SearchIntents;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class kug {
    public static final qpe c = aqe.f(kug.class);
    public static kug d = new kug();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, String> f24302a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f24303b = false;

    public class a implements h08.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f24304a;

        public a(Map map) {
            this.f24304a = map;
        }

        @Override // h08.a
        public void a(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f24304a.put(jSONObject.getString(SearchIntents.EXTRA_QUERY), jSONObject.getString("expected_domain").intern());
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public static kug b() {
        return d;
    }

    public boolean a(String str, JSONObject jSONObject) {
        if (!q08.a(str) && jSONObject != null) {
            c();
            String str2 = this.f24302a.get(str);
            if (q08.a(str2)) {
                return true;
            }
            String strOptString = jSONObject.optString("domain", null);
            if (!q08.a(strOptString) && !bbc.a().getDomain().equalsIgnoreCase(strOptString)) {
                return str2.equalsIgnoreCase(strOptString);
            }
        }
        return true;
    }

    public synchronized void c() {
        if (!this.f24303b) {
            d();
            this.f24303b = true;
        }
    }

    public final void d() {
        try {
            HashMap map = new HashMap();
            h08.b(t08.a("query_domain_intervene.gz"), true, new a(map));
            this.f24302a = map;
        } catch (IOException | ConcurrentModificationException e) {
            e.printStackTrace();
            c.error("Fail to load resource of asr_similar_intervene.gz: " + e.getMessage());
        }
    }
}
