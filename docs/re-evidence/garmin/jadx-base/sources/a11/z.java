package a11;

import java.util.Arrays;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class z {
    public static final void a(h4.r rVar, r82.p<Object> pVar, r82.p<Object> pVar2, r82.p<Object> pVar3, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        r82.p<Object> pVar4;
        i53.c<Object> cVar;
        o0 o0VarE = mVar.E(-466507283);
        int i17 = i14 | 6 | (o0VarE.B(pVar) ? 32 : 16);
        int i18 = i15 & 4;
        if (i18 != 0) {
            i16 = i17 | 384;
        } else {
            i16 = i17 | (o0VarE.B(pVar2) ? 256 : 128);
        }
        int i19 = i16 | (o0VarE.B(pVar3) ? 2048 : 1024);
        if (o0VarE.n(i19 & 1, (i19 & 1171) != 1170)) {
            rVar2 = h4.r.S;
            pVar4 = i18 != 0 ? null : pVar2;
            x1 x1Var = p3.n.f135158a;
            boolean z14 = pVar4 != null;
            boolean z15 = (pVar3 == null || (cVar = pVar3.f151304a) == null || !(cVar.isEmpty() ^ true)) ? false : true;
            c.f258a.getClass();
            z3.e eVar = c.f259b;
            z3.e eVar2 = c.f260c;
            q13.b bVarB = p13.w.b();
            if (z14 && z15) {
                bVarB.add(r82.p.a(pVar, eVar));
                bVarB.add(r82.p.a(pVar4, eVar2));
                bVarB.add(pVar3);
            } else if (z14) {
                bVarB.add(r82.p.a(pVar, eVar));
                bVarB.add(pVar4);
            } else if (z15) {
                bVarB.add(r82.p.a(pVar, eVar2));
                bVarB.add(pVar3);
            } else {
                bVarB.add(pVar);
            }
            r82.p[] pVarArr = (r82.p[]) p13.w.a(bVarB).toArray(new r82.p[0]);
            r82.k.c(rVar2, i53.a.a(Arrays.copyOf(pVarArr, pVarArr.length)), o0VarE, 6, 0);
        } else {
            o0VarE.e();
            rVar2 = rVar;
            pVar4 = pVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.g(rVar2, (r82.p) pVar, (r82.p) pVar4, (r82.p) pVar3, i14, i15);
        }
    }
}
