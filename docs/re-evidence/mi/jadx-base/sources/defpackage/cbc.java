package defpackage;

import com.google.android.gms.actions.SearchIntents;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class cbc implements yz7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qpe f5155b = aqe.f(cbc.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<String, byte[]> f5156a = new HashMap<>();

    public class a implements h08.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HashMap f5157a;

        public a(HashMap map) {
            this.f5157a = map;
        }

        @Override // h08.a
        public void a(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f5157a.put(jSONObject.getString(SearchIntents.EXTRA_QUERY), wa4.a(jSONObject.getString("resp")));
            } catch (Exception e) {
                cbc.f5155b.error("invalid json format of kv item: " + str);
                e.printStackTrace();
            }
        }
    }

    public List<String> b(n08 n08Var) {
        return new ArrayList(this.f5156a.keySet());
    }

    public boolean c(Object obj) {
        InputStream inputStream = obj instanceof InputStream ? (InputStream) obj : null;
        if (inputStream == null) {
            return false;
        }
        try {
            HashMap<String, byte[]> map = new HashMap<>();
            h08.b(inputStream, true, new a(map));
            this.f5156a = map;
            return true;
        } catch (Exception e) {
            f5155b.error("init occur exception: {}", (Throwable) e);
            return false;
        }
    }

    public HashMap<String, byte[]> d() {
        return this.f5156a;
    }

    public final a08 e(JSONObject jSONObject, n08 n08Var) {
        JSONObject jSONObject2;
        try {
            JSONObject jSONObject3 = jSONObject.getJSONObject("hq_answer");
            jSONObject2 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("code", 200);
            jSONObject4.put("error_type", "success");
            jSONObject2.put("status", jSONObject4);
            jSONObject2.put("answer", jSONObject3.get("answer"));
            Object objOpt = jSONObject3.opt("instructions");
            if (objOpt != null) {
                jSONObject2.put("instructions", objOpt);
            }
            if (n08Var != null) {
                jSONObject2.put("request_id", n08Var.getRequestId());
                if (n08Var.getTimestamp() > 0) {
                    jSONObject2.put("latency", System.currentTimeMillis() - n08Var.getTimestamp());
                }
            }
        } catch (Exception e) {
            f5155b.info("solve FAIL: {}", (Throwable) e);
            jSONObject2 = null;
        }
        if (jSONObject2 != null) {
            return new a08(jSONObject2, null);
        }
        return null;
    }

    public boolean f(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            this.f5156a = (HashMap) obj;
            return true;
        } catch (Exception e) {
            f5155b.error("restore from persist data FAIL: exception {}", (Throwable) e);
            return false;
        }
    }

    @Override // defpackage.yz7
    public String getDomain() {
        return "LOCAL_HOT_QUERY";
    }

    @Override // defpackage.yz7
    public JSONObject parse(String str, n08 n08Var) {
        JSONObject jSONObject;
        int i;
        try {
            boolean zContainsKey = this.f5156a.containsKey(str);
            if (zContainsKey) {
                jSONObject = new JSONObject(wa4.b(this.f5156a.get(str)));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("nlp_edge_require_runtime_condition");
                if (jSONArrayOptJSONArray != null) {
                    for (0; i < jSONArrayOptJSONArray.length(); i + 1) {
                        pdb pdbVarA = qdb.a(jSONArrayOptJSONArray.getJSONObject(i));
                        i = (pdbVarA != null && pdbVarA.b(n08Var)) ? i + 1 : 0;
                        zContainsKey = false;
                    }
                }
            } else {
                jSONObject = null;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(SearchIntents.EXTRA_QUERY, str);
            jSONObject2.put("domain", "LOCAL_HOT_QUERY");
            double d = 1.0d;
            jSONObject2.put("prob", 1.0d);
            if (!zContainsKey) {
                d = 0.0d;
            }
            jSONObject2.put("score", d);
            if (!zContainsKey) {
                jSONObject = null;
            }
            jSONObject2.put("hq_answer", jSONObject);
            return jSONObject2;
        } catch (IOException e) {
            f5155b.error("parse occur io exception: {}", (Throwable) e);
            return null;
        } catch (JSONException e2) {
            f5155b.error("parse occur json exception: {}", (Throwable) e2);
            return null;
        }
    }

    @Override // defpackage.yz7
    public a08 provide(JSONObject jSONObject, JSONObject jSONObject2, n08 n08Var) {
        return e(jSONObject, n08Var);
    }
}
