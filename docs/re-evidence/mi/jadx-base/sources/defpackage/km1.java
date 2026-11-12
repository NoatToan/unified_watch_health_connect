package defpackage;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class km1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f23975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f23976b;
    public String c;
    public String d;
    public long e;

    public String a() {
        return this.d;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.f23975a;
    }

    public long d() {
        return this.e;
    }

    public String e() {
        return this.f23976b;
    }

    public void f(JSONObject jSONObject) {
        try {
            this.f23975a = jSONObject.getString("audioId");
            this.f23976b = jSONObject.getString("title");
            this.c = jSONObject.getString("artist");
            this.d = jSONObject.getString("album");
            this.e = jSONObject.getLong("duration");
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("initFromJson error:");
            sb.append(e.getMessage());
        }
    }
}
