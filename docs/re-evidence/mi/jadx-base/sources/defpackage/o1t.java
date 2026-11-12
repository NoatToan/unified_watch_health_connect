package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class o1t extends v6t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28658b;
    public long c;
    public boolean d;
    public boolean e;
    public int f;
    public long g;

    public o1t(boolean z, v6t v6tVar, long j, int i) {
        super(v6tVar);
        this.e = false;
        this.d = z;
        this.f28658b = 600000;
        this.g = j;
        this.f = i;
    }

    @Override // defpackage.v6t
    public final int a() {
        return 320000;
    }

    @Override // defpackage.v6t
    public final boolean d() {
        if (this.e && this.g <= this.f) {
            return true;
        }
        if (!this.d || this.g >= this.f) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.c < this.f28658b) {
            return false;
        }
        this.c = jCurrentTimeMillis;
        return true;
    }

    public final void f(int i) {
        if (i <= 0) {
            return;
        }
        this.g += (long) i;
    }

    public final void g(boolean z) {
        this.e = z;
    }

    public final long h() {
        return this.g;
    }
}
