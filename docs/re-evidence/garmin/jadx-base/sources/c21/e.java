package c21;

import b63.v;
import c2.b0;
import c2.j;
import c2.y;
import c2.z;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.e5;
import java.time.LocalTime;
import l72.p2;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import v.h;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final class e {
    public static final void a(String str, boolean z14, v vVar, l<? super Boolean, Unit> lVar, l<? super v, Unit> lVar2, m mVar, int i14) {
        str.getClass();
        LocalTime localTime = vVar.f16219a;
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(1962792229);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(vVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(lVar2) ? 16384 : 8192);
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
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
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            p2 p2Var = p2.f111205a;
            p2Var.g(str, null, null, null, f.c(-23401050, new a(z14, lVar, i16), o0VarE), false, false, null, o0VarE, (i15 & 14) | 24576, 494);
            if (z14) {
                o0VarE.C(-996099914);
                Object objQ = o0VarE.q();
                m.f135153a.getClass();
                m.a.C2565a c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ);
                }
                p1 p1Var = (p1) objQ;
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_alarm_time);
                j0 j0Var = j0.f23099a;
                int hour = localTime.getHour();
                int minute = localTime.getMinute();
                j0Var.getClass();
                String strC = j0.C(hour, minute);
                z3.e eVarC = f.c(1360661027, new b(vVar, strQ, lVar2, p1Var, 0), o0VarE);
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new ak0.z(p1Var, 20);
                    o0VarE.K(objQ2);
                }
                p2Var.h(strQ, strC, null, null, null, false, false, null, eVarC, null, (e23.a) objQ2, o0VarE, 100663296, 6, 764);
                o0VarE = o0VarE;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                e5.t(aVar, j92.b.f97899b.f97920e, o0VarE, false);
            } else {
                o0VarE.C(-994422969);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bt1.m(str, z14, vVar, lVar, lVar2, i14);
        }
    }
}
