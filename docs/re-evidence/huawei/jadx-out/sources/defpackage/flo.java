package defpackage;

/* JADX INFO: loaded from: classes29.dex */
public class flo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f34187b;
    private String d;
    private String e = String.valueOf(System.currentTimeMillis());

    public String e() {
        return this.f34186a;
    }

    public void b(String str) {
        this.f34186a = str;
    }

    public String c() {
        return this.d;
    }

    public void d(String str) {
        this.d = str;
    }

    public String d() {
        return this.f34187b;
    }

    public void c(String str) {
        this.f34187b = str;
    }

    public String a() {
        return this.e;
    }

    public void e(String str) {
        this.e = str;
    }

    public String toString() {
        return "UserLabelInfo{mHuid='" + this.f34186a + "', mUriKey='" + this.d + "', mUriValue=" + this.f34187b + ", mTimeStamp='" + this.e + "'}";
    }
}
