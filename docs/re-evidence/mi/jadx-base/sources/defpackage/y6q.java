package defpackage;

import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class y6q extends q6q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f39869b;
    public final long c;
    public String d;
    public String e;
    public a f;
    public b g;
    public c h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object[] f39870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f39871b;

        public a(Object[] objArr, boolean z) {
            this.f39870a = objArr;
            this.f39871b = z;
        }

        public static a a(JSONObject jSONObject) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("args");
                Object[] objArr = new Object[jSONArray.length()];
                for (int i = 0; i < jSONArray.length(); i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof JSONArray) {
                        JSONArray jSONArray2 = (JSONArray) obj;
                        int length = jSONArray2.length();
                        Object[] objArr2 = new Object[length];
                        for (int i2 = 0; i2 < length; i2++) {
                            try {
                                objArr2[i2] = jSONArray2.get(i2);
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                        objArr[i] = objArr2;
                    } else {
                        objArr[i] = obj;
                    }
                }
                return new a(objArr, jSONObject.getBoolean("useDataChannelReturn"));
            } catch (JSONException e2) {
                e2.printStackTrace();
                return null;
            }
        }

        public Object[] b() {
            return this.f39870a;
        }

        public JSONObject c() {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (Object obj : this.f39870a) {
                if (obj instanceof Collection) {
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator it = ((Collection) obj).iterator();
                    while (it.hasNext()) {
                        jSONArray2.put(it.next());
                    }
                    jSONArray.put(jSONArray2);
                } else {
                    jSONArray.put(obj);
                }
            }
            try {
                jSONObject.put("args", jSONArray);
                jSONObject.put("useDataChannelReturn", this.f39871b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f39872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f39873b = "";
        public final JSONObject c;

        public b(JSONObject jSONObject, int i) {
            this.c = jSONObject;
            this.f39872a = i;
        }

        public static b a(JSONObject jSONObject) {
            b bVar = null;
            try {
                b bVar2 = new b(jSONObject.getJSONObject("result"), jSONObject.getInt("status"));
                try {
                    if (!jSONObject.has("error_msg")) {
                        return bVar2;
                    }
                    bVar2.b(jSONObject.getString("error_msg"));
                    return bVar2;
                } catch (JSONException e) {
                    e = e;
                    bVar = bVar2;
                    e.printStackTrace();
                    return bVar;
                }
            } catch (JSONException e2) {
                e = e2;
            }
        }

        public void b(String str) {
            this.f39873b = str;
        }

        public JSONObject c() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("status", this.f39872a);
                jSONObject.put("result", this.c);
                jSONObject.put("error_msg", this.f39873b);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f39874a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f39875b;
        public long c;
        public long d;
        public String e;

        public c(JSONObject jSONObject) {
            try {
                this.f39874a = jSONObject.getInt("page_no");
                this.f39875b = jSONObject.getInt(SportDataTypeKt.DIMEN_TOTAL);
                this.c = jSONObject.getLong("page_size");
                this.d = jSONObject.getLong("total_size");
                this.e = jSONObject.getString("md5");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public int a() {
            return this.f39874a;
        }

        public int b() {
            return this.f39875b;
        }

        public long c() {
            return this.d;
        }

        public JSONObject d() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("page_no", this.f39874a);
                jSONObject.put(SportDataTypeKt.DIMEN_TOTAL, this.f39875b);
                jSONObject.put("page_size", this.c);
                jSONObject.put("total_size", this.d);
                jSONObject.put("md5", this.e);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }
    }

    public y6q(String str, long j) {
        super(0);
        this.f39869b = str;
        this.c = j;
    }

    public static y6q b(JSONObject jSONObject) {
        y6q y6qVar = null;
        y6qVar = null;
        y6qVar = null;
        y6qVar = null;
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("method");
            String string = jSONObject2.getString("methodName");
            long j = jSONObject2.getLong("methodCallID");
            if (jSONObject2.has("methodCall")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("methodCall");
                jpe.h("UDTMethodController", "method call json: " + jSONObject3);
                if (jSONObject3 != null && !jSONObject3.toString().equals("")) {
                    y6q y6qVar2 = new y6q(string, j, a.a(jSONObject3));
                    try {
                        y6qVar2.i(jSONObject2.has("invokerID") ? jSONObject2.getString("invokerID") : null, jSONObject2.has("verifyCode") ? jSONObject2.getString("verifyCode") : null);
                        y6qVar = y6qVar2;
                    } catch (JSONException e) {
                        e = e;
                        y6qVar = y6qVar2;
                        e.printStackTrace();
                    }
                }
            }
            if (jSONObject2.has("methodReturn")) {
                JSONObject jSONObject4 = jSONObject2.getJSONObject("methodReturn");
                jpe.h("UDTMethodController", "method return json: " + jSONObject4);
                if (jSONObject4 != null && !jSONObject4.toString().equals("")) {
                    y6qVar = new y6q(string, j, b.a(jSONObject4));
                }
            }
            if (jSONObject2.has("dataChannel")) {
                JSONObject jSONObject5 = jSONObject2.getJSONObject("dataChannel");
                jpe.h("UDTMethodController", "method data channel json: " + jSONObject5);
                if (jSONObject5 != null && !jSONObject5.toString().equals("")) {
                    c cVar = new c(jSONObject5);
                    if (y6qVar != null) {
                        y6qVar.h(cVar);
                    }
                }
            }
        } catch (JSONException e2) {
            e = e2;
        }
        return y6qVar;
    }

    @Override // defpackage.q6q
    public JSONObject a() {
        JSONObject jSONObjectA = super.a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("methodName", this.f39869b);
            jSONObject.put("methodCallID", this.c);
            jSONObject.put("invokerID", this.d);
            jSONObject.put("verifyCode", this.e);
            a aVar = this.f;
            if (aVar != null) {
                jSONObject.put("methodCall", aVar.c());
            }
            b bVar = this.g;
            if (bVar != null) {
                jSONObject.put("methodReturn", bVar.c());
            }
            c cVar = this.h;
            if (cVar != null) {
                jSONObject.put("dataChannel", cVar.d());
            }
            jSONObjectA.put("method", jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObjectA;
    }

    public long c() {
        return this.c;
    }

    public a d() {
        return this.f;
    }

    public String e() {
        return this.f39869b;
    }

    public b f() {
        return this.g;
    }

    public c g() {
        return this.h;
    }

    public void h(c cVar) {
        this.h = cVar;
    }

    public void i(String str, String str2) {
        this.d = str;
        this.e = str2;
    }

    public y6q(String str, long j, a aVar) {
        this(str, j);
        this.f = aVar;
    }

    public y6q(String str, long j, b bVar) {
        this(str, j);
        this.g = bVar;
    }
}
