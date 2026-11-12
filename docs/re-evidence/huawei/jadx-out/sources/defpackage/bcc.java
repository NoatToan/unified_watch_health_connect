package defpackage;

/* JADX INFO: loaded from: classes23.dex */
public class bcc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f964c;
    private long e;
    private int g;
    private int d = -1;
    private String i = "";

    public void c(String str) {
        this.f962a = str;
    }

    public void d(String str) {
        this.f964c = str;
    }

    public String toString() {
        return "{syncType:" + this.f964c + ",prepareTraceId:" + this.f962a + ",scene:" + this.d + ",startTime:" + this.f963b + ",endTime:" + this.e + ",errCode:" + this.i + ",times:" + this.g + "}";
    }

    public void b(long j) {
        this.e = j;
    }

    public void d(long j) {
        this.f963b = j;
    }

    public void e(String str) {
        this.i = str;
    }

    public void a(int i) {
        this.g = i;
    }

    public void e(int i) {
        this.d = i;
    }
}
