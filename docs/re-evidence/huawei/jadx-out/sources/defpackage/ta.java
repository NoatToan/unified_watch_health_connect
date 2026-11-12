package defpackage;

import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
class ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f48851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f48852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f48853c;
    private boolean d;
    private final int e;
    private final Uri f;

    static ta c(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        int i = jSONObject.getInt("requestCode");
        String string = jSONObject.getString("url");
        return new ta(i, Uri.parse(string), jSONObject.optJSONObject("metadata"), jSONObject.has("returnUrlScheme") ? jSONObject.getString("returnUrlScheme") : null, jSONObject.has("appLinkUri") ? Uri.parse(jSONObject.getString("appLinkUri")) : null, jSONObject.optBoolean("shouldNotify", true));
    }

    ta(int i, Uri uri, JSONObject jSONObject, String str, Uri uri2, boolean z) {
        this.f = uri;
        this.e = i;
        this.f48852b = jSONObject;
        this.f48851a = str;
        this.f48853c = uri2;
        this.d = z;
    }

    int a() {
        return this.e;
    }

    JSONObject e() {
        return this.f48852b;
    }

    boolean b() {
        return this.d;
    }

    void a(boolean z) {
        this.d = z;
    }

    String d() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("requestCode", this.e);
        jSONObject.put("url", this.f.toString());
        jSONObject.put("returnUrlScheme", this.f48851a);
        jSONObject.put("shouldNotify", this.d);
        JSONObject jSONObject2 = this.f48852b;
        if (jSONObject2 != null) {
            jSONObject.put("metadata", jSONObject2);
        }
        Uri uri = this.f48853c;
        if (uri != null) {
            jSONObject.put("appLinkUri", uri.toString());
        }
        return jSONObject.toString();
    }

    boolean c(Uri uri) {
        return uri.getScheme() != null && uri.getScheme().equalsIgnoreCase(this.f48851a);
    }

    boolean d(Uri uri) {
        return this.f48853c != null && uri.getScheme().equals(this.f48853c.getScheme()) && uri.getHost().equals(this.f48853c.getHost());
    }
}
