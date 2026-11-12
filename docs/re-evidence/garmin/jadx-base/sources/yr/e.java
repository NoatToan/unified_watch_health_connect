package yr;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.audio.WavUtil;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import o4.m1;
import o4.q1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:41:0x01df  */
    public static final void a(nr.g.b bVar, p3.m mVar, int i14) {
        nr.g.b bVar2;
        p3.o0 o0Var;
        int i15;
        p3.o0 o0VarE = mVar.E(957157314);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.r(bVar) ? 4 : 2);
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.r.a aVar = h4.r.S;
            h4.r rVarY = x2.y(u1.n.e(aVar, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a), null, 3);
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC = c2.l.C(rVarY, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar4 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar4);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            bVar3.getClass();
            h4.r rVarF = x2.f(c2.l.A(aVar, eVar.f97920e, 0.0f, 2), 1.0f);
            s2 s2VarA = q2.a(c2.j.f22698h, h4.d.a.f81534l, o0VarE, 54);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarF, o0VarE);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
            }
            b4.c(fVar, rVarC3, o0VarE);
            u2 u2Var = u2.f22900a;
            String str = bVar.f127044a;
            if (str == null) {
                str = "";
            }
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            s5.x0 x0Var = j92.f.f97930g;
            long jB = d92.b.a(o0VarE).k().b();
            bVar3.getClass();
            float f14 = eVar.f97920e;
            bVar3.getClass();
            i15 = 0;
            mh.c(str, c2.l.C(aVar, 0.0f, f14, 0.0f, eVar.f97918c, 5), jB, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, 0, 0, 131064);
            s5.c.b bVarH = l2.h(o0VarE, 810915947, 0, 1, null);
            s5.r0 r0Var = new s5.r0(new s5.i0(hb.a.e(o0VarE), 0L, (w5.f0) null, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null), null, null, null, 14, null);
            boolean zR = o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new ox.e(context, 2);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ox.e(context, 2);
                    o0VarE.K(objQ);
                }
            }
            s5.m.a aVar3 = new s5.m.a("", r0Var, (s5.n) objQ);
            o0VarE.C(810927182);
            int iG = bVarH.g(aVar3);
            try {
                bVarH.b(gl1.y.Q(o0VarE, R.string.see_all_camel_case));
                Unit unit = Unit.INSTANCE;
                bVarH.f(iG);
                o0VarE.g0(false);
                s5.c cVarK = bVarH.k();
                o0VarE.g0(false);
                fVar2.getClass();
                s5.x0 x0Var2 = j92.f.f97932i;
                bVar3.getClass();
                mh.d(cVarK, c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0Var2, o0VarE, 0, 0, 262140);
                o0Var = o0VarE;
                o0Var.g0(true);
                bVar2 = bVar;
                List<nr.i0> list = bVar2.f127045b;
                if (list == null) {
                    o0Var.C(-766683375);
                    o0Var.g0(false);
                } else {
                    o0Var.C(-766683374);
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        b((nr.i0) it.next(), o0Var, 0);
                    }
                    o0Var.g0(false);
                    Unit unit2 = Unit.INSTANCE;
                }
                o0Var.g0(true);
                x1 x1Var2 = p3.n.f135158a;
            } catch (Throwable th3) {
                bVarH.f(iG);
                throw th3;
            }
        } else {
            bVar2 = bVar;
            o0Var = o0VarE;
            i15 = 0;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(bVar2, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    public static final void b(nr.i0 i0Var, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(879085783);
        int i16 = (o0VarE.B(i0Var) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            l72.p2 p2Var = l72.p2.f111205a;
            String str = i0Var.f127195a;
            String str2 = i0Var.f127196b;
            if (str2 == null) {
                str2 = "";
            }
            z3.e eVarC = z3.f.c(-1016179191, new b(i0Var), o0VarE);
            boolean z14 = (i16 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new a(i0Var, 1);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(i0Var, 1);
                    o0VarE.K(objQ);
                }
            }
            e23.a<Unit> aVar = (e23.a) objQ;
            i15 = 2;
            p2Var.h(str, str2, null, null, null, false, false, eVarC, null, null, aVar, o0VarE, 12582912, 0, 892);
        } else {
            i15 = 2;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(i0Var, i14, i15);
        }
    }
}
