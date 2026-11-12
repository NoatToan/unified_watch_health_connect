package ad0;

import java.util.List;
import p005kotlin.Unit;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class m {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(zc0.c cVar, String str, e23.a<Unit> aVar, e23.l<? super Integer, Unit> lVar, p3.m mVar, int i14) {
        cVar.getClass();
        aVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1217861857);
        int i15 = i14 | (o0VarE.r(cVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            p1 p1VarC = s9.c.c(cVar.f203928c, o0VarE);
            boolean z14 = ((zc0.f) p1VarC.getF182175a()).f203946a;
            List<j> list = ((zc0.f) p1VarC.getF182175a()).f203948c;
            int i16 = i15 & 112;
            int i17 = i15 << 3;
            b(z14, str, list, aVar, lVar, o0VarE, i16 | (i17 & 7168) | (i17 & 57344));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a51.l(i14, 3, lVar, cVar, str, aVar, false);
        }
    }

    public static final void b(boolean z14, String str, List<j> list, e23.a<Unit> aVar, e23.l<? super Integer, Unit> lVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1269498027);
        int i15 = 2;
        int i16 = (o0VarE.h(z14) ? 4 : 2) | i14 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(list) ? 256 : 128);
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            z02.d.a(z14, z3.f.c(-564754342, new a51.g(aVar, i15), o0VarE), null, null, null, z3.f.c(280528478, new a3.e(str, 6, list, lVar), o0VarE), o0VarE, (i16 & 14) | 196656, 28);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(z14, str, list, aVar, lVar, i14, 0);
        }
    }
}
