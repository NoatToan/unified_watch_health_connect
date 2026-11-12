package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes46.dex */
@Deprecated
public class yqq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f53765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f53766b;
    public String e;

    public String c() throws yqj {
        if (TextUtils.isEmpty(this.f53766b) || TextUtils.isEmpty(this.f53765a)) {
            throw new yqj(2001L, "Get AppAuthtication signStr error");
        }
        return this.f53766b + "." + this.f53765a;
    }

    public String e() throws yqj {
        if (TextUtils.isEmpty(this.f53766b) || TextUtils.isEmpty(this.f53765a) || TextUtils.isEmpty(this.e)) {
            throw new yqj(2001L, "get  AppAuthtication JWS is empty...");
        }
        return c() + "." + this.e;
    }
}
