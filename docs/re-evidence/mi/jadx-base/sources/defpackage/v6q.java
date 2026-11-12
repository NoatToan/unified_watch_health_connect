package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class v6q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f36570b;
    public String c;
    public final q6q d;

    public v6q(int i, boolean z, q6q q6qVar) {
        this.f36569a = i;
        this.f36570b = z;
        this.d = q6qVar;
    }

    public static v6q a(JSONObject jSONObject) {
        q6q q6qVarB;
        v6q v6qVar = null;
        try {
            int i = jSONObject.getInt("action");
            boolean z = jSONObject.getBoolean("request");
            String string = jSONObject.getString("requestId");
            JSONObject jSONObject2 = jSONObject.getJSONObject("control");
            int i2 = jSONObject2.getInt("type");
            if (i2 == 0) {
                q6qVarB = y6q.b(jSONObject2);
            } else if (i2 == 1) {
                q6qVarB = s6q.b(jSONObject2);
            } else if (i2 == 2) {
                q6qVarB = d7q.b(jSONObject2);
            } else {
                q6qVarB = i2 == 3 ? b7q.b(jSONObject2) : null;
            }
            v6q v6qVar2 = new v6q(i, z, q6qVarB);
            try {
                v6qVar2.e(string);
                return v6qVar2;
            } catch (JSONException e) {
                e = e;
                v6qVar = v6qVar2;
                e.printStackTrace();
                return v6qVar;
            }
        } catch (JSONException e2) {
            e = e2;
        }
    }

    public String b() {
        return this.c;
    }

    public q6q c() {
        return this.d;
    }

    public boolean d() {
        return this.f36570b;
    }

    public void e(String str) {
        this.c = str;
    }

    public JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", this.f36569a);
            jSONObject.put("request", this.f36570b);
            jSONObject.put("requestId", this.c);
            jSONObject.put("control", this.d.a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
