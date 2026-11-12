package defpackage;

/* JADX INFO: loaded from: classes13.dex */
public class osj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f44651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f44652c;
    private String d;
    private int e;

    public osj() {
        this("", 0, 0);
    }

    public osj(String str, int i, int i2) {
        this.f44652c = str;
        this.e = i;
        this.f44651b = i2;
    }

    public String a() {
        return this.f44652c;
    }

    public void d(String str) {
        this.f44652c = str;
    }

    public int b() {
        return this.e;
    }

    public void c(int i) {
        this.e = i;
    }

    public String d() {
        return this.d;
    }

    public int c() {
        return this.f44651b;
    }

    public void d(int i) {
        this.f44651b = i;
    }

    public String e() {
        return this.f44650a;
    }

    public void b(String str) {
        this.f44650a = str;
    }

    public String toString() {
        return "{taskId:" + this.f44652c + ", status:" + this.e + ", productId:" + this.d + ", valueType:" + this.f44651b + ", timeZone:" + this.f44650a + '}';
    }
}
