package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class nqe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f43446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f43447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f43448c;
    private long d;

    public nqe(String str, long j, long j2, long j3) {
        this.f43447b = str;
        this.f43448c = j2;
        this.f43446a = j;
        this.d = j3;
    }

    public nqe(String str) {
        this.f43448c = 0L;
        this.f43446a = 0L;
        this.d = 0L;
        this.f43447b = str;
    }

    public void d(long j) {
        this.f43446a += j;
        this.d += j;
    }

    public void a(long j) {
        this.f43448c += j;
        this.d += j;
    }

    public long c() {
        return this.f43448c;
    }

    public void b(long j) {
        this.f43448c = j;
    }

    public long e() {
        return this.f43446a;
    }

    public void e(long j) {
        this.f43446a = j;
    }

    public long b() {
        return this.d;
    }

    public void c(long j) {
        this.d = j;
    }

    public String a() {
        return this.f43447b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("date: ");
        stringBuffer.append(this.f43447b);
        stringBuffer.append(" received: ");
        stringBuffer.append(this.f43448c);
        stringBuffer.append(" requested: ");
        stringBuffer.append(this.f43446a);
        stringBuffer.append(" total: ");
        stringBuffer.append(this.d);
        return stringBuffer.toString();
    }
}
