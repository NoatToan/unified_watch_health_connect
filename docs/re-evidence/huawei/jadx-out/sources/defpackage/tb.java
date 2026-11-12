package defpackage;

import android.net.Uri;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class tb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f48909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Uri f48910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f48911c;
    private int d;
    private JSONObject e;
    private Uri j;

    public tb c(JSONObject jSONObject) {
        this.e = jSONObject;
        return this;
    }

    public tb c(int i) {
        this.d = i;
        return this;
    }

    public tb c(Uri uri) {
        this.j = uri;
        return this;
    }

    public tb a(String str) {
        this.f48909a = str;
        return this;
    }

    public tb b(Uri uri) {
        this.f48910b = uri;
        return this;
    }

    public JSONObject e() {
        return this.e;
    }

    public int a() {
        return this.d;
    }

    public Uri b() {
        return this.j;
    }

    public String c() {
        return this.f48909a;
    }

    public Uri d() {
        return this.f48910b;
    }

    public boolean i() {
        return this.f48911c;
    }

    public tb d(boolean z) {
        this.f48911c = z;
        return this;
    }
}
