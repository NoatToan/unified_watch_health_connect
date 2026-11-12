package qx1;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import i3.p7;
import o4.m1;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.v;
import p3.x1;
import p3.y3;

/* JADX INFO: loaded from: classes10.dex */
public final class h {
    /* JADX WARN: Code duplicated, block: B:52:0x00ad  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    public static final void a(j02.j jVar, dy1.h hVar, e23.l lVar, e23.l lVar2, boolean z14, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        int i16;
        ?? r14;
        jVar.getClass();
        hVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(-2066295068);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(jVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(hVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.h(z14) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            View view2 = (View) o0VarE.A(AndroidCompositionLocals_androidKt.f6046f);
            r.a aVar = r.S;
            boolean zR = ((i15 & 14) == 4) | o0VarE.r(view2);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new d(jVar, view2, 1);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new d(jVar, view2, 1);
                    o0VarE.K(objQ);
                }
            }
            r rVarE = u1.n.e(wz1.i.a((e23.l) objQ, aVar, z14), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarY = c2.l.y(rVarE, eVar.f97920e);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j jVar2 = c2.j.f22691a;
            bVar.getClass();
            s2 s2VarF = hb.a.f(jVar2, eVar.f97918c, bVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarF, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            if (hVar.f61559d) {
                o0VarE.C(-466491572);
                y3 y3Var = p7.f89282d;
                g6.f.f75994b.getClass();
                i16 = 56;
                v.a(y3Var.c(g6.f.a(g6.f.f75996d)), z3.f.c(1995727075, new g(lVar, hVar, 0), o0VarE), o0VarE, 56);
                o0VarE.g0(false);
            } else {
                i16 = 56;
                o0VarE.C(-465986086);
                o0VarE.g0(false);
            }
            r rVarA = u2Var.a(aVar, 1.0f, true);
            Object objQ2 = o0VarE.q();
            aVar2.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new qv1.l(3);
                o0VarE.K(objQ2);
            }
            r rVarC2 = p5.v.c((e23.l) objQ2, rVarA, true);
            z zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC3 = h4.k.c(rVarC2, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC3, o0VarE);
            b0 b0Var = b0.f22601a;
            String str = hVar.f61563h;
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            int i17 = i16;
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131070);
            String str2 = hVar.f61564i;
            fVar2.getClass();
            mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
            o0 o0Var2 = o0VarE;
            o0Var2.g0(true);
            if (hVar.f61562g) {
                o0Var2.C(-465508531);
                y3 y3Var2 = p7.f89282d;
                g6.f.f75994b.getClass();
                v.a(y3Var2.c(g6.f.a(g6.f.f75996d)), z3.f.c(-1331186214, new g(lVar2, hVar, 1), o0Var2), o0Var2, i17);
                r14 = 0;
                o0Var2.g0(false);
            } else {
                r14 = 0;
                o0Var2.C(-464973254);
                o0Var2.g0(false);
            }
            if (z14) {
                o0Var2.C(-464923902);
                bVar.getClass();
                i7.a(n5.c.a(R.drawable.icon_drag_handle, o0Var2, r14), gl1.y.Q(o0Var2, R.string.lbl_reorder), x2.q(aVar, j92.b.f97901d.f97904c), sn.a.y(o0Var2), o0Var2, 0, 0);
                o0Var2.g0(r14);
            } else {
                o0Var2.C(-464644902);
                o0Var2.g0(r14);
            }
            o0Var2.g0(true);
            o0Var = o0Var2;
        } else {
            o0VarE.e();
            o0Var = o0VarE;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.l(jVar, hVar, lVar, lVar2, z14, i14);
        }
    }
}
