package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class vmp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public uw5 f37036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f37037b;
    public long c;
    public long d;
    public int e;
    public int f;
    public boolean m;
    public smp o;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f37039r;
    public boolean s;
    public long[] g = new long[0];
    public int[] h = new int[0];
    public int[] i = new int[0];
    public int[] j = new int[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f37038k = new long[0];
    public boolean[] l = new boolean[0];
    public boolean[] n = new boolean[0];
    public final okh p = new okh();

    public void a(jl8 jl8Var) throws IOException {
        jl8Var.readFully(this.p.d(), 0, this.p.f());
        this.p.P(0);
        this.q = false;
    }

    public void b(okh okhVar) {
        okhVar.j(this.p.d(), 0, this.p.f());
        this.p.P(0);
        this.q = false;
    }

    public long c(int i) {
        return this.f37038k[i] + ((long) this.j[i]);
    }

    public void d(int i) {
        this.p.L(i);
        this.m = true;
        this.q = true;
    }

    public void e(int i, int i2) {
        this.e = i;
        this.f = i2;
        if (this.h.length < i) {
            this.g = new long[i];
            this.h = new int[i];
        }
        if (this.i.length < i2) {
            int i3 = (i2 * 125) / 100;
            this.i = new int[i3];
            this.j = new int[i3];
            this.f37038k = new long[i3];
            this.l = new boolean[i3];
            this.n = new boolean[i3];
        }
    }

    public void f() {
        this.e = 0;
        this.f37039r = 0L;
        this.s = false;
        this.m = false;
        this.q = false;
        this.o = null;
    }

    public boolean g(int i) {
        return this.m && this.n[i];
    }
}
