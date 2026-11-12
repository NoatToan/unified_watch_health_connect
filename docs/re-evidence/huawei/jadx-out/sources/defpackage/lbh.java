package defpackage;

/* JADX INFO: loaded from: classes10.dex */
public class lbh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f39819a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f39820c;
    private boolean d;
    private String e;

    public lbh(boolean z, String str) {
        this(z, str, null, null);
    }

    public lbh(boolean z, String str, String str2) {
        this(z, str, null, str2);
    }

    public lbh(boolean z, String str, String str2, String str3) {
        this.d = z;
        this.f39819a = str;
        this.f39820c = str2;
        this.e = str3;
    }

    public boolean b() {
        return this.d;
    }

    public boolean a() {
        return "getCount".equals(this.f39819a);
    }

    public String d() {
        return this.f39820c;
    }

    public String c() {
        return this.f39819a;
    }

    public String e() {
        return this.e;
    }
}
