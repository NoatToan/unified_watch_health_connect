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
import o4.q1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class y0 {
    /* JADX WARN: Code duplicated, block: B:44:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x0289  */
    /* JADX WARN: Code duplicated, block: B:68:0x02ad  */
    public static final void a(nr.g.w wVar, p3.m mVar, int i14) {
        boolean z14;
        boolean z15;
        p3.o0 o0VarE = mVar.E(513554);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(wVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
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
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarA = c2.l.A(rVarF, eVar2.f97920e, 0.0f, 2);
            s2 s2VarA = q2.a(c2.j.f22698h, h4.d.a.f81534l, o0VarE, 54);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarA, o0VarE);
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
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_trails_plural);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            s5.x0 x0Var = j92.f.f97930g;
            long jB = d92.b.a(o0VarE).k().b();
            bVar2.getClass();
            float f14 = eVar2.f97920e;
            bVar2.getClass();
            mh.c(strQ, c2.l.C(aVar, 0.0f, f14, 0.0f, eVar2.f97918c, 5), jB, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, 0, 0, 131064);
            o0VarE = o0VarE;
            boolean z16 = wVar.f127169e;
            p3.m.a aVar3 = p3.m.f135153a;
            if (z16) {
                o0VarE.C(-2028160302);
                o0VarE.C(2012787041);
                s5.c.b bVar3 = new s5.c.b(0, 1, null);
                s5.r0 r0Var = new s5.r0(new s5.i0(hb.a.e(o0VarE), 0L, (w5.f0) null, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null), null, null, null, 14, null);
                boolean z17 = (i15 & 14) == 4;
                Object objQ = o0VarE.q();
                if (z17) {
                    objQ = new t30.h(wVar, 2);
                    o0VarE.K(objQ);
                } else {
                    aVar3.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new t30.h(wVar, 2);
                        o0VarE.K(objQ);
                    }
                }
                s5.m.a aVar4 = new s5.m.a("", r0Var, (s5.n) objQ);
                o0VarE.C(2012797962);
                int iG = bVar3.g(aVar4);
                try {
                    bVar3.b(gl1.y.Q(o0VarE, R.string.lbl_remove));
                    Unit unit = Unit.INSTANCE;
                    bVar3.f(iG);
                    o0VarE.g0(false);
                    s5.c cVarK = bVar3.k();
                    o0VarE.g0(false);
                    fVar2.getClass();
                    s5.x0 x0Var2 = j92.f.f97932i;
                    long jA = d92.b.a(o0VarE).k().a();
                    bVar2.getClass();
                    z14 = false;
                    mh.d(cVarK, c2.l.C(aVar, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13), jA, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, x0Var2, o0VarE, 0, 0, 262136);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } catch (Throwable th3) {
                    bVar3.f(iG);
                    throw th3;
                }
            } else {
                z14 = false;
                o0VarE.C(-2027368438);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            h4.r rVarX = x2.x(x2.f(aVar, 1.0f), null, 3);
            boolean zR = o0VarE.r(context);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new ot.c(context, 26);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ot.c(context, 26);
                    o0VarE.K(objQ2);
                }
            }
            e23.l lVar = (e23.l) objQ2;
            boolean z18 = (i15 & 14) == 4 ? true : z14;
            Object objQ3 = o0VarE.q();
            if (z18) {
                z15 = true;
                objQ3 = new xr.o(wVar, 1);
                o0VarE.K(objQ3);
            } else {
                aVar3.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    z15 = true;
                    objQ3 = new xr.o(wVar, 1);
                    o0VarE.K(objQ3);
                } else {
                    z15 = true;
                }
            }
            p002j6.c.b(lVar, rVarX, (e23.l) objQ3, o0VarE, 48, 0);
            o0VarE.g0(z15);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(wVar, i14, 18);
        }
    }
}
