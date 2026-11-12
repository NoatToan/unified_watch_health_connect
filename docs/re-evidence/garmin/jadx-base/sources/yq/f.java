package yq;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.j;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import d53.w;
import e23.p;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
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
import w02.b0;

/* JADX INFO: loaded from: classes7.dex */
public final class f {
    public static final void a(float f14, long j8, m mVar, int i14, int i15) {
        long j14;
        long jD;
        o0 o0VarE = mVar.E(-319654119);
        int i16 = i14 | (((i15 & 1) == 0 && o0VarE.i(f14)) ? 4 : 2) | (((i15 & 2) == 0 && o0VarE.l(j8)) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                if ((i15 & 1) != 0) {
                    Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f14 = b0.w(c22.b.c(context, b0.g(j92.b.f97901d.f97903b, o0VarE), 1.3f), o0VarE);
                    i16 &= -15;
                }
                if ((i15 & 2) != 0) {
                    i16 &= -113;
                    jD = hb.a.d(d92.b.f58623a, o0VarE);
                }
                o0VarE.h0();
                x1 x1Var = n.f135158a;
                t4.d dVarA = n5.c.a(R.drawable.stopwatch_outline, o0VarE, 0);
                g6.f.a aVar = g6.f.f75994b;
                i7.a(dVarA, null, x2.q(l.C(r.S, 0.0f, 0.0f, 4, 0.0f, 11), f14), jD, o0VarE, ((i16 << 6) & 7168) | 48, 0);
                j14 = jD;
            } else {
                o0VarE.e();
                if ((i15 & 1) != 0) {
                    i16 &= -15;
                }
                if ((i15 & 2) != 0) {
                    i16 &= -113;
                }
            }
            jD = j8;
            o0VarE.h0();
            x1 x1Var2 = n.f135158a;
            t4.d dVarA2 = n5.c.a(R.drawable.stopwatch_outline, o0VarE, 0);
            g6.f.a aVar2 = g6.f.f75994b;
            i7.a(dVarA2, null, x2.q(l.C(r.S, 0.0f, 0.0f, 4, 0.0f, 11), f14), jD, o0VarE, ((i16 << 6) & 7168) | 48, 0);
            j14 = jD;
        } else {
            o0VarE.e();
            j14 = j8;
        }
        float f15 = f14;
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j82.a(f15, j14, i14, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v22 */
    public static final void b(final boolean z14, final boolean z15, m mVar, final int i14) {
        int i15;
        o0 o0Var;
        ?? r14;
        float f14;
        o0 o0Var2;
        o0 o0Var3;
        o0 o0Var4;
        o0 o0VarE = mVar.E(-760958584);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.h(z15) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarF = x2.f(aVar, 1.0f);
            float f15 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarZ = l.z(rVarF, f15, 8);
            j.f22691a.getClass();
            j.c cVar = j.f22696f;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(cVar, h4.d.a.f81534l, o0VarE, 54);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarZ, o0VarE);
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
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            if (z15) {
                o0VarE.C(788173595);
                a(0.0f, 0L, o0VarE, 0, 3);
                String strQ = y.Q(o0VarE, R.string.lbl_fastest);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                f14 = f15;
                r14 = 0;
                mh.c(strQ, l.C(aVar, 4, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97935l, o0VarE), o0VarE, 48, 0, 131068);
                o0Var4.g0(false);
            } else {
                r14 = 0;
                f14 = f15;
                o0VarE.C(788414806);
                o0VarE.g0(false);
            }
            if (z14) {
                o0Var2 = o0VarE;
                o0Var2.C(788465832);
                String strQ2 = y.Q(o0Var2, R.string.no_value);
                d92.b.f58623a.getClass();
                j92.f fVar = d92.b.f58624b;
                fVar.getClass();
                x0 x0Var = j92.f.f97935l;
                x0 x0VarB = d92.c.b(x0Var, o0Var2);
                r rVarC2 = l.C(aVar, f14, 0.0f, 0.0f, 0.0f, 14);
                Object objQ = o0Var2.q();
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    o0Var4 = o0VarE;
                    o0Var2 = o0Var4;
                    objQ = new d(r14);
                    o0Var2.K(objQ);
                }
                o0Var4 = o0VarE;
                o0Var2 = o0Var4;
                o0 o0Var5 = o0Var2;
                mh.c(strQ2, v.b(rVarC2, (e23.l) objQ), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0Var5, 0, 0, 131068);
                String string = w.i0(u.v(y.Q(o0Var5, R.string.lbl_missed_gate), "--", "", r14)).toString();
                fVar.getClass();
                mh.c(string, l.C(aVar, 4, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0Var5), o0Var5, 48, 0, 131068);
                o0 o0Var6 = o0Var5;
                o0Var6.g0(r14);
                o0Var3 = o0Var6;
            } else {
                o0Var2 = o0VarE;
                o0Var4 = o0VarE;
                o0Var2 = o0Var4;
                o0Var2.C(789002070);
                o0Var2.g0(r14);
                o0Var3 = o0Var2;
            }
            o0Var3.g0(true);
            o0Var = o0Var3;
        } else {
            o0VarE.e();
            o0Var = o0VarE;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p() { // from class: yq.e
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(i14 | 1);
                    f.b(z14, z15, (m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
