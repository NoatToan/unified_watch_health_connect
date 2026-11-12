package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class ndi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f42933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42935c;
    private int d;
    private String e;
    private long f;
    private int g;
    private String h;
    private String i;
    private int j;
    private int k;

    public ndi() {
        this.k = -1;
        this.f42934b = 0;
    }

    public ndi(String str, int i) {
        this.f42934b = 0;
        this.h = str;
        this.k = i;
    }

    public ndi(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, long j) {
        this.j = i;
        this.e = str;
        this.d = i2;
        this.g = i4;
        this.h = str2;
        this.k = i3;
        this.i = str3;
        this.f42934b = i5;
        this.f = j;
    }

    public String b() {
        return this.h;
    }

    public int j() {
        return this.k;
    }

    public int c() {
        return this.f42935c;
    }

    public void b(int i) {
        this.f42935c = i;
    }

    public int e() {
        return this.g;
    }

    public void d(int i) {
        this.g = i;
    }

    public String a() {
        return this.f42933a;
    }

    public void e(String str) {
        this.f42933a = str;
    }

    public String d() {
        return this.i;
    }

    public void b(String str) {
        this.i = str;
    }

    public long f() {
        return this.f;
    }

    public void b(long j) {
        this.f = j;
    }

    public String toString() {
        return "smsType(1-inbox 2-sent 3-draft56 4-outbox 5-failed 6-queued) is: " + this.g + ",sub_id is: " + this.k + ",isRead(0-unRead,1-read) is: " + this.f42934b + ",receivedTime is: " + this.f + ",creator is: " + this.e + ",error_code is: " + this.d + ",sender mobile last 3 number is: " + ncp.e(this.h);
    }
}
