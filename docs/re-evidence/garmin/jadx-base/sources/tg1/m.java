package tg1;

import a3.l0;
import o72.h3;
import p004k6.u;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;
import s70.a0;
import t70.a1;

/* JADX INFO: loaded from: classes10.dex */
public final class m {
    /* JADX WARN: Code duplicated, block: B:45:0x0098  */
    public static final void a(String str, long j8, e23.a<Unit> aVar, e23.l<? super Long, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        Object obj;
        e23.a<Unit> aVar2;
        o0 o0Var;
        str.getClass();
        aVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(2072930049);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.l(j8) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            obj = lVar;
            i15 |= o0VarE.r(obj) ? 2048 : 1024;
        } else {
            obj = lVar;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            u uVar = new u(false, false, false, 4, (p005kotlin.jvm.internal.j) null);
            boolean z14 = (i15 & 896) == 256;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new a1(aVar, 16);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a1(aVar, 16);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            aVar2 = aVar;
            z3.e eVarC = z3.f.c(2126195529, new l0(aVar, obj, j8, 11), o0VarE);
            z3.e eVarC2 = z3.f.c(-1265851189, new a0(aVar2, 12), o0VarE);
            i.f164519a.getClass();
            o0Var = o0VarE;
            i3.r.a(aVar3, eVarC, null, eVarC2, i.f164521c, z3.f.c(-2058953970, new h3(str, 24), o0VarE), null, 0L, 0L, 0L, 0L, 0.0f, uVar, o0Var, 1772592, 3072, 8084);
        } else {
            aVar2 = aVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new at1.h(str, j8, aVar2, lVar, i14);
        }
    }
}
