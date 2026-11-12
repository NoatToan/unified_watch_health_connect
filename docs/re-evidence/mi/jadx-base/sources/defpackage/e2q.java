package defpackage;

import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class e2q extends fj2 {

    public static final class a implements fj2.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final rfp f16200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final okh f16201b = new okh();
        public final int c;
        public final int d;

        public a(int i, rfp rfpVar, int i2) {
            this.c = i;
            this.f16200a = rfpVar;
            this.d = i2;
        }

        @Override // fj2.f
        public fj2.e a(jl8 jl8Var, long j) throws IOException {
            long position = jl8Var.getPosition();
            int iMin = (int) Math.min(this.d, jl8Var.getLength() - position);
            this.f16201b.L(iMin);
            jl8Var.i(this.f16201b.d(), 0, iMin);
            return c(this.f16201b, j, position);
        }

        @Override // fj2.f
        public void b() {
            this.f16201b.M(wlq.f);
        }

        public final fj2.e c(okh okhVar, long j, long j2) {
            int iA;
            int iA2;
            int iF = okhVar.f();
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (okhVar.a() >= 188 && (iA2 = (iA = j2q.a(okhVar.d(), okhVar.e(), iF)) + SportReportBaseParser.ReportType.avgDescentRate) <= iF) {
                long jB = j2q.b(okhVar, iA, this.c);
                if (jB != -9223372036854775807L) {
                    long jB2 = this.f16200a.b(jB);
                    if (jB2 > j) {
                        return j5 == -9223372036854775807L ? fj2.e.d(jB2, j2) : fj2.e.e(j2 + j4);
                    }
                    if (100000 + jB2 > j) {
                        return fj2.e.e(j2 + ((long) iA));
                    }
                    j4 = iA;
                    j5 = jB2;
                }
                okhVar.P(iA2);
                j3 = iA2;
            }
            return j5 != -9223372036854775807L ? fj2.e.f(j5, j2 + j3) : fj2.e.d;
        }
    }

    public e2q(rfp rfpVar, long j, long j2, int i, int i2) {
        super(new fj2.b(), new a(i, rfpVar, i2), j, 0L, j + 1, 0L, j2, 188L, 940);
    }
}
