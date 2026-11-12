package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class jei extends fj2 {

    public static final class b implements fj2.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final rfp f22706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final okh f22707b;

        public static void d(okh okhVar) {
            int iK;
            int iF = okhVar.f();
            if (okhVar.a() < 10) {
                okhVar.P(iF);
                return;
            }
            okhVar.Q(9);
            int iD = okhVar.D() & 7;
            if (okhVar.a() < iD) {
                okhVar.P(iF);
                return;
            }
            okhVar.Q(iD);
            if (okhVar.a() < 4) {
                okhVar.P(iF);
                return;
            }
            if (jei.k(okhVar.d(), okhVar.e()) == 443) {
                okhVar.Q(4);
                int iJ = okhVar.J();
                if (okhVar.a() < iJ) {
                    okhVar.P(iF);
                    return;
                }
                okhVar.Q(iJ);
            }
            while (okhVar.a() >= 4 && (iK = jei.k(okhVar.d(), okhVar.e())) != 442 && iK != 441 && (iK >>> 8) == 1) {
                okhVar.Q(4);
                if (okhVar.a() < 2) {
                    okhVar.P(iF);
                    return;
                }
                okhVar.P(Math.min(okhVar.f(), okhVar.e() + okhVar.J()));
            }
        }

        @Override // fj2.f
        public fj2.e a(jl8 jl8Var, long j) throws IOException {
            long position = jl8Var.getPosition();
            int iMin = (int) Math.min(20000L, jl8Var.getLength() - position);
            this.f22707b.L(iMin);
            jl8Var.i(this.f22707b.d(), 0, iMin);
            return c(this.f22707b, j, position);
        }

        @Override // fj2.f
        public void b() {
            this.f22707b.M(wlq.f);
        }

        public final fj2.e c(okh okhVar, long j, long j2) {
            int iE = -1;
            int iE2 = -1;
            long j3 = -9223372036854775807L;
            while (okhVar.a() >= 4) {
                if (jei.k(okhVar.d(), okhVar.e()) != 442) {
                    okhVar.Q(1);
                } else {
                    okhVar.Q(4);
                    long jL = kei.l(okhVar);
                    if (jL != -9223372036854775807L) {
                        long jB = this.f22706a.b(jL);
                        if (jB > j) {
                            return j3 == -9223372036854775807L ? fj2.e.d(jB, j2) : fj2.e.e(j2 + ((long) iE2));
                        }
                        if (100000 + jB > j) {
                            return fj2.e.e(j2 + ((long) okhVar.e()));
                        }
                        iE2 = okhVar.e();
                        j3 = jB;
                    }
                    d(okhVar);
                    iE = okhVar.e();
                }
            }
            return j3 != -9223372036854775807L ? fj2.e.f(j3, j2 + ((long) iE)) : fj2.e.d;
        }

        public b(rfp rfpVar) {
            this.f22706a = rfpVar;
            this.f22707b = new okh();
        }
    }

    public jei(rfp rfpVar, long j, long j2) {
        super(new fj2.b(), new b(rfpVar), j, 0L, j + 1, 0L, j2, 188L, 1000);
    }

    public static int k(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
