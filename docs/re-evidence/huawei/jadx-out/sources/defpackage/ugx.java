package defpackage;

/* JADX INFO: loaded from: classes43.dex */
public class ugx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f50076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f50077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f50078c;
    private String d;
    private String e;

    public long e() {
        return this.f50078c;
    }

    public void e(long j) {
        this.f50078c = j;
    }

    public String c() {
        return this.f50077b;
    }

    public void a(String str) {
        this.f50077b = str;
    }

    public void b(String str) {
        this.f50076a = str;
    }

    public void c(String str) {
        this.e = str;
    }

    public String a() {
        return this.d;
    }

    public void e(String str) {
        this.d = str;
    }

    public String toString() {
        return "Data{mContent='" + this.f50076a + "', mId='" + this.e + "', mUrl='" + this.d + "', mSize='" + this.f50078c + "', mFileName='" + this.f50077b + "'}";
    }
}
