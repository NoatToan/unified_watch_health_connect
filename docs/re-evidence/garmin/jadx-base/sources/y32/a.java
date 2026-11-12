package y32;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bv.b;
import c2.b0;
import c2.j;
import c2.l;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import d92.c;
import h4.d;
import h4.g;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import j92.f;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p5.v;
import s5.x0;
import u1.w;
import v.h;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:71:0x015a  */
    public static final void a(r rVar, String str, String str2, e23.a<Unit> aVar, m mVar, int i14, int i15) {
        r rVar2;
        int i16;
        o0 o0Var;
        r rVar3;
        float f14;
        int i17;
        boolean z14;
        aVar.getClass();
        o0 o0VarE = mVar.E(1206388694);
        int i18 = i15 & 1;
        if (i18 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(str2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            r rVar4 = i18 != 0 ? r.S : rVar2;
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            b.f21239a.getClass();
            b.a();
            boolean zT0 = k1.f37122a.T0();
            d.f81522a.getClass();
            g.a aVar2 = d.a.f81537o;
            j.f22691a.getClass();
            z zVarA = y.a(j.f22694d, aVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVar4, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            if (str2 == null) {
                o0VarE.C(211286898);
                o0VarE.g0(false);
                o0Var = o0VarE;
                rVar3 = rVar4;
                i17 = i16;
                z14 = false;
            } else {
                o0VarE.C(211286899);
                r.a aVar4 = r.S;
                if (str == null) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f14 = j92.b.f97899b.f97918c;
                } else {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f14 = j92.b.f97899b.f97921f;
                }
                r rVarC2 = l.C(aVar4, 0.0f, 0.0f, 0.0f, f14, 7);
                boolean zR = ((i16 & 896) == 256) | o0VarE.r(context);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new a42.b(str2, context, 18);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new a42.b(str2, context, 18);
                        o0VarE.K(objQ);
                    }
                }
                r rVarC3 = v.c((e23.l) objQ, rVarC2, false);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarF = c.f(f.f97932i, o0VarE);
                d6.h.f57752b.getClass();
                i17 = i16;
                z14 = false;
                rVar3 = rVar4;
                mh.c(str2, rVarC3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 130044);
                o0Var = o0VarE;
                o0Var.g0(false);
            }
            if (str != null) {
                o0Var.C(211906341);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarF2 = c.f(f.f97932i, o0Var);
                d6.h.f57752b.getClass();
                o0 o0Var2 = o0Var;
                mh.c(str, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF2, o0Var2, (i17 >> 3) & 14, 0, 130046);
                o0Var = o0Var2;
                o0Var.g0(false);
            } else {
                o0Var.C(212088931);
                if (zT0) {
                    o0Var.C(212145847);
                    r rVarD = w.d(r.S, false, null, null, aVar, 15);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarY = l.y(rVarD, j92.b.f97899b.f97920e);
                    String strQ = gl1.y.Q(o0Var, R.string.lbl_view_your_fitness_age);
                    d92.b.f58624b.getClass();
                    x0 x0VarE = c.e(f.f97932i);
                    d6.h.f57752b.getClass();
                    mh.c(strQ, rVarY, hb.a.e(o0Var), null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarE, o0Var, 0, 0, 130040);
                    o0Var.g0(z14);
                } else {
                    o0Var.C(212570082);
                    o0Var.g0(z14);
                }
                o0Var.g0(z14);
            }
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar3 = rVar2;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new nv.c(rVar3, str, str2, aVar, i14, i15);
        }
    }
}
