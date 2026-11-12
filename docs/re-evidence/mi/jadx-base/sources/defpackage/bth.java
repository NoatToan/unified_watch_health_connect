package defpackage;

import com.google.android.exoplayer2.ParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class bth implements i2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u68 f4592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nkh f4593b = new nkh(new byte[10]);
    public int c = 0;
    public int d;
    public rfp e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4594k;
    public long l;

    public bth(u68 u68Var) {
        this.f4592a = u68Var;
    }

    @Override // defpackage.i2q
    public final void a(okh okhVar, int i) throws ParserException {
        rk1.i(this.e);
        if ((i & 1) != 0) {
            int i2 = this.c;
            if (i2 != 0 && i2 != 1) {
                if (i2 == 2) {
                    toe.h("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException();
                    }
                    int i3 = this.j;
                    if (i3 != -1) {
                        StringBuilder sb = new StringBuilder(59);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i3);
                        sb.append(" more bytes");
                        toe.h("PesReader", sb.toString());
                    }
                    this.f4592a.d();
                }
            }
            g(1);
        }
        while (okhVar.a() > 0) {
            int i4 = this.c;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        if (d(okhVar, this.f4593b.f28014a, Math.min(10, this.i)) && d(okhVar, null, this.i)) {
                            f();
                            i |= this.f4594k ? 4 : 0;
                            this.f4592a.e(this.l, i);
                            g(3);
                        }
                    } else {
                        if (i4 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = okhVar.a();
                        int i5 = this.j;
                        int i6 = i5 != -1 ? iA - i5 : 0;
                        if (i6 > 0) {
                            iA -= i6;
                            okhVar.O(okhVar.e() + iA);
                        }
                        this.f4592a.a(okhVar);
                        int i7 = this.j;
                        if (i7 != -1) {
                            int i8 = i7 - iA;
                            this.j = i8;
                            if (i8 == 0) {
                                this.f4592a.d();
                                g(1);
                            }
                        }
                    }
                } else if (d(okhVar, this.f4593b.f28014a, 9)) {
                    g(e() ? 2 : 0);
                }
            } else {
                okhVar.Q(okhVar.a());
            }
        }
    }

    @Override // defpackage.i2q
    public void b(rfp rfpVar, kl8 kl8Var, i2q.d dVar) {
        this.e = rfpVar;
        this.f4592a.f(kl8Var, dVar);
    }

    @Override // defpackage.i2q
    public final void c() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.f4592a.c();
    }

    public final boolean d(okh okhVar, byte[] bArr, int i) {
        int iMin = Math.min(okhVar.a(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            okhVar.Q(iMin);
        } else {
            okhVar.j(bArr, this.d, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }

    public final boolean e() {
        this.f4593b.p(0);
        int iH = this.f4593b.h(24);
        if (iH != 1) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Unexpected start code prefix: ");
            sb.append(iH);
            toe.h("PesReader", sb.toString());
            this.j = -1;
            return false;
        }
        this.f4593b.r(8);
        int iH2 = this.f4593b.h(16);
        this.f4593b.r(5);
        this.f4594k = this.f4593b.g();
        this.f4593b.r(2);
        this.f = this.f4593b.g();
        this.g = this.f4593b.g();
        this.f4593b.r(6);
        int iH3 = this.f4593b.h(8);
        this.i = iH3;
        if (iH2 == 0) {
            this.j = -1;
        } else {
            int i = (iH2 - 3) - iH3;
            this.j = i;
            if (i < 0) {
                StringBuilder sb2 = new StringBuilder(47);
                sb2.append("Found negative packet payload size: ");
                sb2.append(i);
                toe.h("PesReader", sb2.toString());
                this.j = -1;
            }
        }
        return true;
    }

    public final void f() {
        this.f4593b.p(0);
        this.l = -9223372036854775807L;
        if (this.f) {
            this.f4593b.r(4);
            long jH = ((long) this.f4593b.h(3)) << 30;
            this.f4593b.r(1);
            long jH2 = jH | ((long) (this.f4593b.h(15) << 15));
            this.f4593b.r(1);
            long jH3 = jH2 | ((long) this.f4593b.h(15));
            this.f4593b.r(1);
            if (!this.h && this.g) {
                this.f4593b.r(4);
                long jH4 = ((long) this.f4593b.h(3)) << 30;
                this.f4593b.r(1);
                long jH5 = jH4 | ((long) (this.f4593b.h(15) << 15));
                this.f4593b.r(1);
                long jH6 = jH5 | ((long) this.f4593b.h(15));
                this.f4593b.r(1);
                this.e.b(jH6);
                this.h = true;
            }
            this.l = this.e.b(jH3);
        }
    }

    public final void g(int i) {
        this.c = i;
        this.d = 0;
    }
}
