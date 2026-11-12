package defpackage;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes46.dex */
public final class znj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f54347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f54348b;

    znj b(String str) {
        this.f54347a = str;
        return this;
    }

    znj a(JSONObject jSONObject) {
        this.f54348b = jSONObject;
        return this;
    }

    public String e() {
        return this.f54347a;
    }

    public JSONObject c() {
        return this.f54348b;
    }
}
