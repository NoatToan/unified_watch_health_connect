package ng2;

import c2.l;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import l72.n2;
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
import r1.c0;
import r1.u0;
import s5.x0;
import v62.a0;
import v62.u6;
import v62.w;
import v62.x;
import v62.z;

/* JADX INFO: loaded from: classes11.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:16:0x005f  */
    public static final void a(int i14, m mVar, int i15) {
        u4.d dVarA;
        o0 o0VarE = mVar.E(-140679800);
        int i16 = i15 | (o0VarE.k(i14) ? 4 : 2);
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            String strP = y.P(R.string.msg_your_device_battery_status_is_at_x_percentage, new Object[]{Integer.valueOf(i14)}, o0VarE);
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            r rVarA = l.A(aVar, eVar.f97920e, 0.0f, 2);
            boolean zB = o0VarE.B(strP);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new n2(strP, 29);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new n2(strP, 29);
                    o0VarE.K(objQ);
                }
            }
            r rVarC = v.c((e23.l) objQ, rVarA, true);
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u2 u2Var = u2.f22900a;
            String strF = androidx.core.view.j.f(i14, "%");
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97933j, o0VarE);
            bVar.getClass();
            mh.c(strF, l.C(aVar, 0.0f, 0.0f, eVar.f97918c, 0.0f, 11), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 131068);
            if (i14 >= 0 && i14 < 11) {
                s62.a.f157643a.getClass();
                dVarA = w.a(t62.b.f162798a);
            } else if (11 <= i14 && i14 < 40) {
                s62.a.f157643a.getClass();
                dVarA = v62.y.a(t62.b.f162798a);
            } else if (40 <= i14 && i14 < 75) {
                s62.a.f157643a.getClass();
                dVarA = z.a(t62.b.f162798a);
            } else if (75 <= i14 && i14 < 100) {
                s62.a.f157643a.getClass();
                dVarA = a0.a(t62.b.f162798a);
            } else if (i14 == 100) {
                s62.a.f157643a.getClass();
                dVarA = x.a(t62.b.f162798a);
            } else {
                s62.a.f157643a.getClass();
                t62.b.f162798a.getClass();
                dVarA = b72.d.a(u6.f176049a);
            }
            long jD = d92.b.a(o0VarE).f().d();
            bVar.getClass();
            o0VarE = o0VarE;
            i7.b(dVarA, null, x2.q(aVar, j92.b.f97901d.f97905d), jD, o0VarE, 48, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ba2.e(i14, i15, 8);
        }
    }

    public static final void b(String str, String str2, boolean z14, Integer num, m mVar, int i14) {
        o0 o0VarE = mVar.E(-1842091862);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.B(num) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            c0.e(str2 != null, null, u0.d(null, 3), u0.e(null, 3), null, z3.f.c(-853992238, new h21.m(str2, z14, str, num, 10), o0VarE), o0VarE, 200064, 18);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new li0.y(str, str2, z14, num, i14);
        }
    }
}
