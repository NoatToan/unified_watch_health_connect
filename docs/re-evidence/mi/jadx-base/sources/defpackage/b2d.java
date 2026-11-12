package defpackage;

import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes4.dex */
public final class b2d implements u68 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final okh f3710a = new okh(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public snp f3711b;
    public boolean c;
    public long d;
    public int e;
    public int f;

    @Override // defpackage.u68
    public void a(okh okhVar) {
        rk1.i(this.f3711b);
        if (this.c) {
            int iA = okhVar.a();
            int i = this.f;
            if (i < 10) {
                int iMin = Math.min(iA, 10 - i);
                System.arraycopy(okhVar.d(), okhVar.e(), this.f3710a.d(), this.f, iMin);
                if (this.f + iMin == 10) {
                    this.f3710a.P(0);
                    if (73 != this.f3710a.D() || 68 != this.f3710a.D() || 51 != this.f3710a.D()) {
                        toe.h("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    } else {
                        this.f3710a.Q(3);
                        this.e = this.f3710a.C() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.e - this.f);
            this.f3711b.d(okhVar, iMin2);
            this.f += iMin2;
        }
    }

    @Override // defpackage.u68
    public void c() {
        this.c = false;
    }

    @Override // defpackage.u68
    public void d() {
        int i;
        rk1.i(this.f3711b);
        if (this.c && (i = this.e) != 0 && this.f == i) {
            this.f3711b.e(this.d, 1, i, 0, null);
            this.c = false;
        }
    }

    @Override // defpackage.u68
    public void e(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        this.d = j;
        this.e = 0;
        this.f = 0;
    }

    @Override // defpackage.u68
    public void f(kl8 kl8Var, i2q.d dVar) {
        dVar.a();
        snp snpVarD = kl8Var.d(dVar.c(), 5);
        this.f3711b = snpVarD;
        snpVarD.b(new Format.b().S(dVar.b()).e0("application/id3").E());
    }
}
