package cw1;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import g02.b2;
import i3.mh;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;
import u1.a2;

/* JADX INFO: loaded from: classes10.dex */
public final class o0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final hv1.e eVar, final boolean z14, final e23.l<? super hv1.e, Unit> lVar, boolean z15, int i14, int i15, p3.m mVar, final int i16, final int i17) {
        boolean z16;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        final boolean z17;
        final int i27;
        final int i28;
        p3.p1 p1Var;
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(-2067625149);
        int i29 = i16 | (o0VarE.k(eVar == null ? -1 : eVar.ordinal()) ? 4 : 2);
        if ((i16 & 48) == 0) {
            i29 |= o0VarE.h(z14) ? 32 : 16;
        }
        int i30 = i29 | (o0VarE.r(lVar) ? 256 : 128);
        int i34 = i17 & 8;
        if (i34 != 0) {
            i18 = i30 | 3072;
            z16 = z15;
        } else {
            z16 = z15;
            i18 = i30 | (o0VarE.h(z16) ? 2048 : 1024);
        }
        int i35 = i17 & 16;
        if (i35 != 0) {
            i24 = i18 | 24576;
            i19 = i14;
        } else {
            i19 = i14;
            i24 = i18 | (o0VarE.k(i19) ? 16384 : 8192);
        }
        int i36 = i17 & 32;
        if (i36 != 0) {
            i26 = i24 | 196608;
            i25 = i15;
        } else {
            i25 = i15;
            i26 = i24 | (o0VarE.k(i25) ? 131072 : 65536);
        }
        if (o0VarE.n(i26 & 1, (74899 & i26) != 74898)) {
            boolean z18 = i34 != 0 ? false : z16;
            int i37 = i35 != 0 ? 0 : i19;
            int i38 = i36 != 0 ? 0 : i25;
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = p3.p0.n(eVar);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var2 = (p3.p1) objQ;
            h4.r.a aVar = h4.r.S;
            h4.r rVarB = a2.b(x2.d(aVar, 1.0f), a2.a(o0VarE), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            p3.p1 p1Var3 = p1Var2;
            b2.a(c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar2.f97921f, 7), z18, i37, i38, gl1.y.Q(o0VarE, R.string.lbl_course_profile_hill_type_title), gl1.y.Q(o0VarE, R.string.lbl_course_profile_hill_type_select_the_most_common_hill_type), null, null, null, o0VarE, (i26 >> 6) & 8176, 448);
            boolean z19 = z18;
            int i39 = i37;
            int i44 = i38;
            bVar2.getClass();
            c2.l.f(x2.h(aVar, eVar2.f97918c), o0VarE);
            o0VarE.C(-641442008);
            w13.c cVar = hv1.e.f85847f;
            ArrayList<hv1.e> arrayListK = n23.j.k(cVar);
            p13.c.b bVar3 = new p13.c.b();
            while (bVar3.hasNext()) {
                Object next = bVar3.next();
                if (((hv1.e) next) != hv1.e.FLAT) {
                    arrayListK.add(next);
                }
            }
            for (hv1.e eVar3 : arrayListK) {
                String strQ = gl1.y.Q(o0VarE, eVar3.f85849b);
                boolean z24 = ((hv1.e) p1Var3.getF182175a()) == eVar3;
                boolean zK = o0VarE.k(eVar3.ordinal());
                Object objQ2 = o0VarE.q();
                if (zK || objQ2 == p3.m.a.f135155b) {
                    p1Var = p1Var3;
                    objQ2 = new ca0.j1(16, eVar3, p1Var);
                    o0VarE.K(objQ2);
                } else {
                    p1Var = p1Var3;
                }
                c(0, (e23.a) objQ2, strQ, o0VarE, z24);
                p1Var3 = p1Var;
            }
            p3.p1 p1Var4 = p1Var3;
            o0VarE.g0(false);
            if (z14) {
                o0VarE.C(1590401609);
                b(o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1590432361);
                o0VarE.g0(false);
            }
            c2.l.f(b0Var.a(h4.r.S, 1.0f, true), o0VarE);
            z3.e eVarC = z3.f.c(958146510, new bt1.k(lVar, p1Var4, 2), o0VarE);
            o0VarE = o0VarE;
            b82.c.b(null, null, eVarC, null, 0L, o0VarE, 384, 27);
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
            z17 = z19;
            i27 = i39;
            i28 = i44;
        } else {
            o0VarE.e();
            z17 = z16;
            i27 = i19;
            i28 = i25;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: cw1.n0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    o0.a(eVar, z14, lVar, z17, i27, i28, (p3.m) obj, p3.p0.t(i16 | 1), i17);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void b(p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(1522393403);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(rVarF, f14, eVar.f97918c);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_course_demands_set_course_footer_message);
            d92.b.f58624b.getClass();
            o0Var = o0VarE;
            mh.c(strQ, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0Var, 0, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.garmin.android.apps.connectmobile.workouts.data.model.e0(i14, 24);
        }
    }

    public static final void c(int i14, e23.a aVar, String str, p3.m mVar, boolean z14) {
        String str2;
        p3.o0 o0VarE = mVar.E(1646597068);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (z14) {
                o0VarE.C(951900985);
                str2 = str + StringUtils.SPACE + gl1.y.Q(o0VarE, R.string.selected);
                o0VarE.g0(false);
            } else {
                o0VarE.C(951966209);
                o0VarE.g0(false);
                str2 = str;
            }
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put(Constants.ScionAnalytics.PARAM_LABEL, str2);
            b92.a aVarB = c0235a.b();
            int i16 = b92.a.f16960b;
            r.a(null, str, aVarB, z14, false, aVar, o0VarE, ((i15 << 3) & 112) | ((i15 << 6) & 7168) | ((i15 << 9) & 458752), 17);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new af1.g(str, z14, aVar, i14, 7);
        }
    }
}
