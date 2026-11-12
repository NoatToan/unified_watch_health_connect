package defpackage;

/* JADX INFO: loaded from: classes11.dex */
public class xcs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f39000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f39001b;
    public long c;
    public long d;
    public final long e = System.currentTimeMillis();

    public int a() {
        return s8s.p() ? 1 : 0;
    }

    public long b() {
        return this.f39000a;
    }

    public void c() {
        this.c++;
    }

    public void d(long j) {
        this.f39000a = j;
    }

    public long e() {
        return this.f39001b;
    }

    public void f(long j) {
        this.f39001b += j;
    }

    public long g() {
        return this.c;
    }

    public void h(long j) {
        this.d += j;
    }

    public long i() {
        return this.d;
    }
}
