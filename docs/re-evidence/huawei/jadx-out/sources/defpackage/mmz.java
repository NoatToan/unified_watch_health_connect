package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes10.dex */
public class mmz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f41961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f41962c;
    private String e;

    public String c() {
        return this.f41962c;
    }

    public void d(String str) {
        this.f41962c = str;
    }

    public String b() {
        return this.e;
    }

    public void b(String str) {
        this.e = str;
    }

    public String e() {
        return this.f41961b;
    }

    public void a(String str) {
        this.f41961b = str;
    }

    public String d() {
        return this.f41960a;
    }

    public void c(String str) {
        this.f41960a = str;
    }

    public boolean a() {
        return TextUtils.isEmpty(this.f41962c) || TextUtils.isEmpty(this.e) || TextUtils.isEmpty(this.f41961b) || TextUtils.isEmpty(this.f41960a);
    }

    public String toString() {
        return "EphemerisUrlSonyEntity{ver='" + this.f41962c + "', downloadUrl='" + this.e + "', signature='" + this.f41961b + "', fileId='" + this.f41960a + "'}";
    }
}
