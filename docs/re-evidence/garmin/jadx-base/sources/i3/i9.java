package i3;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class i9 {
    public static final void a(e23.a aVar, long j8, f9 f9Var, s1.b bVar, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        f9 f9Var2;
        p3.m.a.C2565a c2565a;
        boolean z14;
        boolean z15;
        g6.o oVar;
        Object obj;
        p3.o0 o0VarE = mVar.E(766784632);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.l(j8) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            f9Var2 = f9Var;
            i15 |= o0VarE.B(f9Var2) ? 256 : 128;
        } else {
            f9Var2 = f9Var;
        }
        if ((i14 & 3072) == 0) {
            i15 |= (i14 & 4096) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(eVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
            View view2 = (View) o0VarE.A(AndroidCompositionLocals_androidKt.f6046f);
            g6.c cVar = (g6.c) o0VarE.A(kotlin.t1.f91490h);
            g6.o oVar2 = (g6.o) o0VarE.A(kotlin.t1.f91496n);
            p3.o0.b bVarG = o0VarE.g();
            p3.p1 p1VarQ = p3.p0.q(eVar, o0VarE);
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ == c2565a2) {
                objQ = new i01.j(21);
                o0VarE.K(objQ);
            }
            UUID uuid = (UUID) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a2) {
                objQ2 = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            o53.b0 b0Var = (o53.b0) objQ2;
            boolean zB = o0VarE.B(view2) | o0VarE.B(cVar);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a2) {
                c2565a = c2565a2;
                z14 = true;
                z15 = false;
                oVar = oVar2;
                h8 h8Var = new h8(aVar, f9Var2, j8, view2, oVar, cVar, uuid, bVar, b0Var, null);
                z3.e eVar2 = new z3.e(-1051373467, true, new g9(p1VarQ));
                g8 g8Var = h8Var.f88300e;
                g8Var.setParentCompositionContext(bVarG);
                g8Var.f88204b.setValue(eVar2);
                g8Var.f88205c = true;
                g8Var.createComposition();
                o0VarE.K(h8Var);
                obj = h8Var;
            } else {
                oVar = oVar2;
                c2565a = c2565a2;
                z14 = true;
                z15 = false;
                obj = objQ3;
            }
            h8 h8Var2 = (h8) obj;
            boolean zR = o0VarE.r(h8Var2);
            Object objQ4 = o0VarE.q();
            p3.m.a.C2565a c2565a3 = c2565a;
            if (zR || objQ4 == c2565a3) {
                objQ4 = new ho0.g(h8Var2, 15);
                o0VarE.K(objQ4);
            }
            p3.l0.a(h8Var2, (e23.l) objQ4, o0VarE);
            int i16 = i15;
            boolean zR2 = o0VarE.r(h8Var2) | ((i15 & 14) == 4 ? z14 : z15) | ((i16 & 896) == 256 ? z14 : z15) | ((i16 & 112) == 32 ? z14 : z15) | o0VarE.k(oVar.ordinal());
            Object objQ5 = o0VarE.q();
            if (zR2 || objQ5 == c2565a3) {
                objQ5 = new c42.c(h8Var2, aVar, f9Var, j8, oVar);
                o0VarE.K(objQ5);
            }
            p3.l0.i((e23.a) objQ5, o0VarE);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c3(aVar, j8, f9Var, bVar, eVar, i14);
        }
    }
}
