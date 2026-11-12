package defpackage;

import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class td {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f48986a;
    private final int d;
    private final ta e;

    static td a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        return new td(jSONObject.getInt("status"), ta.c(jSONObject.getString("browserSwitchRequest")), Uri.parse(jSONObject.getString("deepLinkUrl")));
    }

    td(int i, ta taVar) {
        this(i, taVar, null);
    }

    td(int i, ta taVar, Uri uri) {
        this.d = i;
        this.e = taVar;
        this.f48986a = uri;
    }

    public int a() {
        return this.d;
    }

    public JSONObject c() {
        return this.e.e();
    }

    public int e() {
        return this.e.a();
    }

    public Uri d() {
        return this.f48986a;
    }

    public String b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", this.d);
        jSONObject.put("deepLinkUrl", this.f48986a.toString());
        jSONObject.put("browserSwitchRequest", this.e.d());
        return jSONObject.toString();
    }
}
