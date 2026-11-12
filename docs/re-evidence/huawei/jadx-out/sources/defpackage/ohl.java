package defpackage;

/* JADX INFO: loaded from: classes41.dex */
public class ohl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f44329c;
    private long d = -1;
    private long e = -1;
    private String f;

    public String i() {
        return this.f;
    }

    public String a() {
        return this.f44327a;
    }

    public void c(String str) {
        this.f = str;
    }

    public long c() {
        return this.e;
    }

    public void b(String str) {
        this.f44327a = str;
    }

    public long b() {
        return this.d;
    }

    public void e(String str) {
        this.f44328b = str;
    }

    public void d(long j) {
        this.e = j;
    }

    public String d() {
        return this.f44328b;
    }

    public void a(String str) {
        this.f44329c = str;
    }

    public void d(ohl ohlVar) {
        if (ohlVar == null) {
            return;
        }
        if (ohlVar.b() != -1) {
            e(ohlVar.b());
        }
        if (ohlVar.c() != -1) {
            d(ohlVar.c());
        }
        a(ohlVar.e());
        e(ohlVar.d());
        b(ohlVar.a());
        c(ohlVar.i());
    }

    public void e(long j) {
        this.d = j;
    }

    public String e() {
        return this.f44329c;
    }
}
