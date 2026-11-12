package s70;

import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:42:0x008e  */
    public static final void a(c2.a0 a0Var, h4.r rVar, n70.a aVar, r70.q qVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        a0Var.getClass();
        rVar.getClass();
        p3.o0 o0VarE = mVar.E(-2013421481);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(a0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(qVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            int size = aVar.f123996a.size();
            int i16 = aVar.f123997b;
            boolean zK = o0VarE.k(size);
            Object objQ = o0VarE.q();
            if (zK) {
                objQ = new a51.c(size, 12);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a51.c(size, 12);
                    o0VarE.K(objQ);
                }
            }
            h2.b bVarB = h2.o0.b(i16, (e23.a) objQ, o0VarE, 0, 2);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97918c;
            float f15 = eVar.f97920e;
            bVar.getClass();
            h2.u.a(bVarB, rVar, c2.l.c(0.0f, f15, 1), null, 0, f14, null, null, false, null, null, null, null, z3.f.c(-1044521866, new o72.m1(4, aVar, qVar), o0VarE), o0VarE, i15 & 112, 24576, 16344);
            o0Var = o0VarE;
            if (size > 1) {
                o0Var.C(1674588167);
                h4.r.a aVar2 = h4.r.S;
                h4.d.f81522a.getClass();
                h4.r rVarB = a0Var.b(aVar2, h4.d.a.f81537o);
                bVar.getClass();
                h4.r rVarA = c2.l.A(rVarB, f15, 0.0f, 2);
                bVar.getClass();
                l02.f.a(bVarB, rVarA, size, i16, 0L, 0L, j92.b.f97901d.f97902a, 0.0f, null, o0Var, 0, 944);
                o0Var = o0Var;
                o0Var.g0(false);
            } else {
                o0Var.C(1674936235);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ot1.i(a0Var, rVar, aVar, qVar, i14, 14);
        }
    }
}
