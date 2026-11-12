package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class cx9 extends xio {
    public ex9 n;
    public a o;

    public static final class a implements c7h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ex9 f14823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ex9.a f14824b;
        public long c = -1;
        public long d = -1;

        public a(ex9 ex9Var, ex9.a aVar) {
            this.f14823a = ex9Var;
            this.f14824b = aVar;
        }

        @Override // defpackage.c7h
        public long a(jl8 jl8Var) {
            long j = this.d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.d = -1L;
            return j2;
        }

        @Override // defpackage.c7h
        public arl b() {
            rk1.g(this.c != -1);
            return new dx9(this.f14823a, this.c);
        }

        @Override // defpackage.c7h
        public void c(long j) {
            long[] jArr = this.f14824b.f17152a;
            this.d = jArr[wlq.i(jArr, j, true, true)];
        }

        public void d(long j) {
            this.c = j;
        }
    }

    public static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(okh okhVar) {
        return okhVar.a() >= 5 && okhVar.D() == 127 && okhVar.F() == 1179402563;
    }

    @Override // defpackage.xio
    public long f(okh okhVar) {
        if (o(okhVar.d())) {
            return n(okhVar);
        }
        return -1L;
    }

    @Override // defpackage.xio
    public boolean i(okh okhVar, long j, xio.b bVar) {
        byte[] bArrD = okhVar.d();
        ex9 ex9Var = this.n;
        if (ex9Var == null) {
            ex9 ex9Var2 = new ex9(bArrD, 17);
            this.n = ex9Var2;
            bVar.f39170a = ex9Var2.h(Arrays.copyOfRange(bArrD, 9, okhVar.f()), null);
            return true;
        }
        if ((bArrD[0] & 127) == 3) {
            ex9.a aVarH = bx9.h(okhVar);
            ex9 ex9VarC = ex9Var.c(aVarH);
            this.n = ex9VarC;
            this.o = new a(ex9VarC, aVarH);
            return true;
        }
        if (!o(bArrD)) {
            return true;
        }
        a aVar = this.o;
        if (aVar != null) {
            aVar.d(j);
            bVar.f39171b = this.o;
        }
        rk1.e(bVar.f39170a);
        return false;
    }

    @Override // defpackage.xio
    public void l(boolean z) {
        super.l(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }

    public final int n(okh okhVar) {
        int i = (okhVar.d()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            okhVar.Q(4);
            okhVar.K();
        }
        int iJ = ax9.j(okhVar, i);
        okhVar.P(0);
        return iJ;
    }
}
