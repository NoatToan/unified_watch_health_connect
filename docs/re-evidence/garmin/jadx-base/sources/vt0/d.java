package vt0;

import am.j;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.leaderboard.model.f0;
import d6.p;
import h4.g;
import h4.k;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import java.text.NumberFormat;
import java.util.Locale;
import lc.u0;
import o4.m1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import u1.w;
import ug2.b0;
import v.h;
import v62.z4;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:39:0x00ad  */
    public static final void a(b bVar, f0 f0Var, m mVar, int i14) {
        int i15;
        r.a aVar;
        String strT;
        j92.e eVar;
        boolean z14;
        bVar.getClass();
        boolean z15 = f0Var.f38157j;
        o0 o0VarE = mVar.E(1067607782);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.k(bVar.ordinal()) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(f0Var) : o0VarE.r(f0Var) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            kt0.a aVar2 = (kt0.a) KoinJavaComponent.get$default(kt0.a.class, null, null, 6, null);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            r.a aVar3 = r.S;
            r rVarE = u1.n.e(x2.x(x2.f(aVar3, 1.0f), null, 3), j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            boolean zR = ((i15 & 112) == 32 || ((i15 & 64) != 0 && o0VarE.r(f0Var))) | o0VarE.r(aVar2) | o0VarE.r(context);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new b0(aVar2, 8, context, f0Var);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new b0(aVar2, 8, context, f0Var);
                    o0VarE.K(objQ);
                }
            }
            r rVarD = w.d(rVarE, false, null, null, (e23.a) objQ, 15);
            h4.d.f81522a.getClass();
            g.b bVar2 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            j92.b bVar4 = d92.b.f58625c;
            bVar4.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            float f15 = eVar2.f97920e;
            r rVarC2 = l.C(aVar3, f14, 0.0f, 0.0f, 0.0f, 14);
            String strValueOf = String.valueOf(f0Var.getRank());
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97933j;
            x0 x0VarF = d92.c.f(x0Var, o0VarE);
            d6.h.f57752b.getClass();
            mh.c(strValueOf, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 130044);
            g6.f.a aVar5 = g6.f.f75994b;
            org.apache.commons.lang3.e.j(bVar4);
            r rVarB = l.B(aVar3, 10, f15, f15, f15);
            bVar4.getClass();
            j92.c cVar = j92.b.f97901d;
            b12.k.b(rVarB, null, cVar.f97906e, f0Var.f38154g, o0VarE, b12.b.f14385f << 9, 18);
            r rVarA = u2Var.a(aVar3, 1.0f, true);
            String str = f0Var.f38155h;
            if (str == null) {
                str = f0Var.f38156i;
            }
            String strValueOf2 = String.valueOf(str);
            fVar.getClass();
            x0 x0VarE = z15 ? d92.c.e(j92.f.f97931h) : j92.f.f97931h;
            int i16 = d6.h.f57757g;
            gl.c.f77766a.getClass();
            long j8 = z15 ? gl.c.f77767b.K : gl.c.f77767b.f77799p;
            p.f57793b.getClass();
            mh.c(strValueOf2, rVarA, j8, null, 0L, null, 0L, d6.h.a(i16), 0L, p.f57795d, false, 2, 0, null, x0VarE, o0VarE, 0, 24960, 109560);
            o0VarE = o0VarE;
            if (z15 || !f0Var.getAllPrivate()) {
                o0VarE.C(-1148286873);
                bVar4.getClass();
                r rVarC3 = l.C(aVar3, eVar2.f97917b, 0.0f, 0.0f, 0.0f, 14);
                aVar = aVar3;
                b.a aVar6 = b.f180050d;
                Double totalValue = f0Var.getTotalValue();
                double dDoubleValue = totalValue != null ? totalValue.doubleValue() : 0.0d;
                aVar6.getClass();
                context.getClass();
                switch (b.a.C3359a.f180062a[bVar.ordinal()]) {
                    case 1:
                    case 2:
                        strT = NumberFormat.getNumberInstance(Locale.getDefault()).format(dDoubleValue);
                        strT.getClass();
                        break;
                    case 3:
                    case 4:
                    case 5:
                        l3.a aVar7 = l3.f23124b;
                        f12.l.f68084a.getClass();
                        boolean zY = f12.l.a.a().y();
                        aVar7.getClass();
                        strT = l3.a.T(dDoubleValue, context, zY);
                        break;
                    case 6:
                        m3 m3Var = j.z(f12.l.f68084a) ? m3.METER : m3.YARD;
                        l3.f23124b.getClass();
                        strT = l3.a.P(context, dDoubleValue, m3Var, l3.f23131i, true, context.getString(R.string.no_value));
                        break;
                    default:
                        u0.r();
                        return;
                }
                fVar.getClass();
                eVar = eVar2;
                z14 = false;
                mh.c(strT, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1148014600);
                o0VarE.g0(false);
                aVar = aVar3;
                z14 = false;
                eVar = eVar2;
            }
            if (f0Var.getAllPrivate()) {
                o0VarE.C(-1147943486);
                s62.a.f157643a.getClass();
                u4.d dVarA = z4.a(t62.b.f162798a);
                long jD = d92.b.a(o0VarE).f().d();
                bVar4.getClass();
                r rVarC4 = l.C(aVar, eVar.f97917b, 0.0f, 0.0f, 0.0f, 14);
                bVar4.getClass();
                o0 o0Var = o0VarE;
                i7.b(dVarA, null, x2.q(rVarC4, cVar.f97903b), jD, o0Var, 48, 0);
                o0VarE = o0Var;
                o0VarE.g0(z14);
            } else {
                o0VarE.C(-1147635656);
                o0VarE.g0(z14);
            }
            bVar4.getClass();
            l.f(l.C(aVar, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11), o0VarE);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg0.m(bVar, f0Var, i14, 28);
        }
    }
}
