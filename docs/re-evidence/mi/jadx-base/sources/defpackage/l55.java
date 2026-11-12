package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class l55 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24675a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f24676b = a.NUMERIC;

    public enum a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    public int a() {
        return this.f24675a;
    }

    public void b(int i) {
        this.f24675a += i;
    }

    public boolean c() {
        return this.f24676b == a.ALPHA;
    }

    public boolean d() {
        return this.f24676b == a.ISO_IEC_646;
    }

    public void e() {
        this.f24676b = a.ALPHA;
    }

    public void f() {
        this.f24676b = a.ISO_IEC_646;
    }

    public void g() {
        this.f24676b = a.NUMERIC;
    }

    public void h(int i) {
        this.f24675a = i;
    }
}
