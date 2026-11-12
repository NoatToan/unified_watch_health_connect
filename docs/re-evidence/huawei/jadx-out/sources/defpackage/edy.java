package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class edy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32824a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f32825c;
    private String e;

    public String b() {
        return this.f32824a;
    }

    public void a(String str) {
        this.f32824a = str;
    }

    public String e() {
        return this.e;
    }

    public void e(String str) {
        this.e = str;
    }

    public List<String> d() {
        return this.f32825c;
    }

    public void d(List<String> list) {
        this.f32825c = list;
    }

    public String toString() {
        return "UserLicenseInfo{url='" + this.f32824a + "', userLicenseName='" + this.e + "'}";
    }
}
