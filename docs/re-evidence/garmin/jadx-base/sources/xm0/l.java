package xm0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.i7;
import i3.mh;
import lc.u0;
import o4.m1;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import v62.z4;

/* JADX INFO: loaded from: classes8.dex */
public final class l {
    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    public static final void a(k kVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        long jE;
        Context context;
        String string;
        String strT;
        boolean z14;
        j92.e eVar;
        h4.r.a aVar2;
        boolean z15 = kVar.f191425i;
        aVar.getClass();
        o0 o0VarE = mVar.E(359802617);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(kVar) : o0VarE.r(kVar) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarX = x2.x(x2.f(aVar3, 1.0f), null, 3);
            if (z15) {
                o0VarE.C(-2122025951);
                d92.b.f58623a.getClass();
                jE = d92.b.a(o0VarE).c().g();
            } else {
                o0VarE.C(-2122024767);
                d92.b.f58623a.getClass();
                jE = d92.b.a(o0VarE).c().e();
            }
            o0VarE.g0(false);
            h4.r rVarE = u1.n.e(rVarX, jE, m1.f128891a);
            boolean z16 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z16) {
                objQ = new wv0.v(aVar, 17);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new wv0.v(aVar, 17);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarD = u1.w.d(rVarE, false, null, null, (e23.a) objQ, 15);
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f14 = eVar3.f97920e;
            float f15 = eVar3.f97920e;
            h4.r rVarC2 = c2.l.C(aVar3, f14, 0.0f, 0.0f, 0.0f, 14);
            String strValueOf = String.valueOf(kVar.f191417a);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var = j92.f.f97933j;
            x0 x0VarB = d92.c.b(x0Var, o0VarE);
            d6.h.f57752b.getClass();
            mh.c(strValueOf, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130044);
            g6.f.a aVar5 = g6.f.f75994b;
            org.apache.commons.lang3.e.j(bVar3);
            h4.r rVarB = c2.l.B(aVar3, 10, f15, f15, f15);
            bVar3.getClass();
            j92.c cVar2 = j92.b.f97901d;
            b12.k.b(rVarB, null, cVar2.f97906e, kVar.f191428l, o0VarE, b12.b.f14385f << 9, 18);
            h4.r rVarA = u2Var.a(aVar3, 1.0f, true);
            bVar3.getClass();
            h4.r rVarA2 = c2.l.A(rVarA, 0.0f, f15, 1);
            c2.z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarA2, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC3, o0VarE);
            b0 b0Var = b0.f22601a;
            String str = kVar.f191418b;
            fVar2.getClass();
            x0 x0VarB2 = d92.c.b(j92.f.f97931h, o0VarE);
            int i16 = d6.h.f57757g;
            d6.p.f57793b.getClass();
            int i17 = d6.p.f57795d;
            mh.c(str, null, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, i17, false, 1, 0, null, x0VarB2, o0VarE, 0, 24960, 109566);
            Long l14 = kVar.f191422f;
            if (l14 != null) {
                context = context2;
                string = xy2.b.o(context, new DateTime(l14.longValue()));
            } else {
                context = context2;
                string = context.getString(R.string.no_value);
                string.getClass();
            }
            fVar2.getClass();
            Context context3 = context;
            mh.c(string, null, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, i17, false, 1, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, 0, 24960, 109566);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            if (z15 || !kVar.f191423g) {
                o0VarE.C(1858444161);
                bVar3.getClass();
                h4.r rVarC4 = c2.l.C(aVar3, eVar3.f97917b, 0.0f, 0.0f, 0.0f, 14);
                j10.d.a aVar6 = j10.d.f96350d;
                j10.d dVar = kVar.f191421e;
                double d14 = kVar.f191419c;
                aVar6.getClass();
                dVar.getClass();
                context3.getClass();
                switch (j10.d.a.C1842a.f96365a[dVar.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
                        l3.f23124b.getClass();
                        strT = l3.a.T(d14, context3, zY);
                        break;
                    case 6:
                    case 7:
                        l3.f23124b.getClass();
                        strT = l3.a.Z0((int) d14);
                        break;
                    case 8:
                        m3 m3Var = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? m3.METER : m3.YARD;
                        l3.f23124b.getClass();
                        strT = l3.a.P(context3, d14, m3Var, l3.f23131i, true, context3.getString(R.string.no_value));
                        break;
                    case 9:
                        strT = l3.a.H(l3.f23124b, new l22.a(context3), d14, true);
                        break;
                    default:
                        u0.r();
                        return;
                }
                fVar2.getClass();
                z14 = false;
                String str2 = strT;
                eVar = eVar3;
                mh.c(str2, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, o0VarE), o0VarE, 0, 0, 131068);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(1858703941);
                o0VarE.g0(false);
                z14 = false;
                eVar = eVar3;
            }
            if (kVar.f191427k) {
                o0VarE.C(1858772079);
                s62.a.f157643a.getClass();
                u4.d dVarA = z4.a(t62.b.f162798a);
                long jD = d92.b.a(o0VarE).f().d();
                bVar3.getClass();
                aVar2 = aVar3;
                h4.r rVarC5 = c2.l.C(aVar2, eVar.f97917b, 0.0f, 0.0f, 0.0f, 14);
                bVar3.getClass();
                o0 o0Var = o0VarE;
                i7.b(dVarA, null, x2.q(rVarC5, cVar2.f97903b), jD, o0Var, 48, 0);
                o0VarE = o0Var;
                o0VarE.g0(z14);
            } else {
                aVar2 = aVar3;
                o0VarE.C(1859079909);
                o0VarE.g0(z14);
            }
            bVar3.getClass();
            c2.l.f(c2.l.C(aVar2, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11), o0VarE);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.a(kVar, aVar, i14, 17);
        }
    }
}
