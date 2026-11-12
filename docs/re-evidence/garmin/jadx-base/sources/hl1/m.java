package hl1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c.w;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import g2.m1;
import gl1.y;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class m {
    /* JADX WARN: Code duplicated, block: B:44:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:53:0x0101  */
    /* JADX WARN: Code duplicated, block: B:60:0x017c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0199  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(n nVar, kl1.a aVar, e23.a aVar2, e23.a aVar3, e23.s sVar, e23.a aVar4, m1 m1Var, p3.m mVar, int i14) {
        o0 o0Var;
        n nVar2 = nVar;
        nVar2.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        sVar.getClass();
        aVar4.getClass();
        o0 o0VarE = mVar.E(-1107200113);
        int i15 = i14 | (o0VarE.r(nVar2) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.r(aVar3) ? 2048 : 1024) | (o0VarE.r(sVar) ? 16384 : 8192) | (o0VarE.r(aVar4) ? 131072 : 65536) | (o0VarE.r(m1Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(nVar2.f84427m, o0VarE);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            g.h hVar = new g.h();
            int i16 = i15 & 57344;
            boolean zB = o0VarE.B(p1VarC) | (i16 == 16384) | o0VarE.r(nVar2);
            Object objQ = o0VarE.q();
            p3.m.a aVar5 = p3.m.f135153a;
            if (zB) {
                objQ = new gw1.d(p1VarC, 6, sVar, nVar2);
                o0VarE.K(objQ);
            } else {
                aVar5.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new gw1.d(p1VarC, 6, sVar, nVar2);
                    o0VarE.K(objQ);
                }
            }
            c.q qVarC = w.c(hVar, (e23.l) objQ, o0VarE, 0);
            zf2.d dVar = ((f) p1VarC.getF182175a()).f84390g;
            boolean zB2 = (i16 == 16384) | o0VarE.B(p1VarC) | o0VarE.r(nVar2);
            Object objQ2 = o0VarE.q();
            if (zB2) {
                objQ2 = new l(p1VarC, sVar, nVar2, null);
                o0VarE.K(objQ2);
            } else {
                aVar5.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new l(p1VarC, sVar, nVar2, null);
                    o0VarE.K(objQ2);
                }
            }
            l0.e((e23.p) objQ2, dVar, o0VarE);
            nVar2 = nVar;
            z02.d.a(((f) p1VarC.getF182175a()).f84384a, z3.f.c(-2022311958, new i(aVar4, 0), o0VarE), null, null, null, z3.f.c(1589297510, new j(aVar3, aVar2, p1VarC, m1Var, aVar, nVar, 0), o0VarE), o0VarE, 196656, 28);
            o0Var = o0VarE;
            if (((f) p1VarC.getF182175a()).f84391h) {
                o0Var.C(755556770);
                boolean zR = o0Var.r(nVar2) | o0Var.r(qVarC) | o0Var.r(context);
                Object objQ3 = o0Var.q();
                if (zR) {
                    objQ3 = new fk0.a(nVar2, 24, qVarC, context);
                    o0Var.K(objQ3);
                } else {
                    aVar5.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new fk0.a(nVar2, 24, qVarC, context);
                        o0Var.K(objQ3);
                    }
                }
                e23.a aVar6 = (e23.a) objQ3;
                boolean zR2 = o0Var.r(nVar2);
                Object objQ4 = o0Var.q();
                if (zR2) {
                    objQ4 = new h62.j(nVar2, 9);
                    o0Var.K(objQ4);
                } else {
                    aVar5.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new h62.j(nVar2, 9);
                        o0Var.K(objQ4);
                    }
                }
                y.e(aVar6, (e23.a) objQ4, o0Var, 0);
                o0Var.g0(false);
            } else {
                o0Var.C(755911379);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b21.l0(i14, 11, nVar2, aVar, aVar2, aVar3, sVar, aVar4, m1Var);
        }
    }
}
