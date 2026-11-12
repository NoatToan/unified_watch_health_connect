package qx1;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import dy1.u;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import java.util.Iterator;
import java.util.Locale;
import o4.m1;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.w;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:59:0x00be  */
    /* JADX WARN: Code duplicated, block: B:98:0x0255  */
    public static final void a(j02.j jVar, String str, u uVar, r rVar, boolean z14, e23.l lVar, p3.m mVar, int i14) {
        int i15;
        jVar.getClass();
        uVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1845765539);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(jVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(uVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(rVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.h(z14) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            View view2 = (View) o0VarE.A(AndroidCompositionLocals_androidKt.f6046f);
            boolean zR = ((i15 & 14) == 4) | o0VarE.r(view2);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new d(jVar, view2, 0);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new d(jVar, view2, 0);
                    o0VarE.K(objQ);
                }
            }
            r rVarA = wz1.i.a((e23.l) objQ, rVar, z14);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            r.a aVar3 = r.S;
            r rVarE = u1.n.e(aVar3, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
            int i16 = i15;
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarE, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            r rVarA2 = u2.f22900a.a(aVar3, 1.0f, true);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            float f15 = eVar2.f97918c;
            bVar2.getClass();
            r rVarZ = c2.l.z(rVarA2, f14, f15);
            Locale locale = Locale.ROOT;
            String upperCase = str.toUpperCase(locale);
            upperCase.getClass();
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var = j92.f.f97933j;
            mh.c(upperCase, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, 0, 0, 131068);
            o0 o0Var = o0VarE;
            if (z14) {
                o0Var.C(464704927);
                bVar2.getClass();
                i7.a(n5.c.a(R.drawable.icon_drag_handle, o0Var, 0), gl1.y.Q(o0Var, R.string.lbl_reorder), x2.q(aVar3, j92.b.f97901d.f97904c), sn.a.y(o0Var), o0Var, 0, 0);
                o0Var = o0Var;
                o0Var.g0(false);
            } else {
                o0Var.C(465007115);
                o0Var.g0(false);
            }
            boolean z15 = ((i16 & 896) == 256) | ((458752 & i16) == 131072);
            Object objQ2 = o0Var.q();
            if (z15) {
                objQ2 = new qn0.f(13, lVar, uVar);
                o0Var.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new qn0.f(13, lVar, uVar);
                    o0Var.K(objQ2);
                }
            }
            r rVarD = w.d(aVar3, false, null, null, (e23.a) objQ2, 15);
            bVar2.getClass();
            r rVarA3 = c2.l.A(rVarD, f15, 0.0f, 2);
            String upperCase2 = gl1.y.Q(o0Var, R.string.lbl_edit).toUpperCase(locale);
            upperCase2.getClass();
            fVar2.getClass();
            o0 o0Var2 = o0Var;
            mh.c(upperCase2, rVarA3, hb.a.e(o0Var2), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0Var2, 0, 0, 131064);
            o0VarE = o0Var2;
            o0VarE.g0(true);
            o0VarE.C(-405090346);
            Iterator<dy1.h> it = uVar.f61639a.iterator();
            while (it.hasNext()) {
                q.a(it.next(), null, null, o0VarE, 0, 6);
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a82.b(jVar, str, uVar, rVar, z14, lVar, i14);
        }
    }
}
