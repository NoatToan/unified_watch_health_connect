package cw1;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import g02.b2;
import org.apache.commons.lang3.StringUtils;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class l {
    public static final void a(int i14, e23.a aVar, String str, p3.m mVar, boolean z14) {
        String str2;
        p3.o0 o0VarE = mVar.E(813631470);
        int i15 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (z14) {
                o0VarE.C(-1900159049);
                str2 = str + StringUtils.SPACE + gl1.y.Q(o0VarE, R.string.selected);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1900093825);
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
            p2VarI0.f135219d = new af1.g(str, z14, aVar, i14, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(hv1.a aVar, e23.a aVar2, e23.l lVar, boolean z14, int i14, int i15, p3.m mVar, int i16) {
        e23.a aVar3;
        p3.o0 o0Var;
        p3.p1 p1Var;
        p3.o0 o0VarO = androidx.room.a0.o(aVar2, lVar, mVar, -1539755679);
        int i17 = i16 | (o0VarO.k(aVar == null ? -1 : aVar.ordinal()) ? 4 : 2) | (o0VarO.r(aVar2) ? 32 : 16) | (o0VarO.r(lVar) ? 256 : 128) | (o0VarO.h(z14) ? 2048 : 1024) | (o0VarO.k(i14) ? 16384 : 8192) | (o0VarO.k(i15) ? 131072 : 65536);
        if (o0VarO.n(i17 & 1, (74899 & i17) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarO.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(aVar);
                o0VarO.K(objQ);
            }
            p3.p1 p1Var2 = (p3.p1) objQ;
            Object objQ2 = o0VarO.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarO.K(objQ2);
            }
            p3.p1 p1Var3 = (p3.p1) objQ2;
            h4.r.a aVar4 = h4.r.S;
            h4.r rVarD = x2.d(aVar4, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarO, 0);
            int iHashCode = Long.hashCode(o0VarO.U);
            i2 i2VarA0 = o0VarO.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarO);
            h5.g.V.getClass();
            h5.e0.a aVar5 = h5.g.a.f81805b;
            if (o0VarO.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarO.z();
            if (o0VarO.T) {
                o0VarO.M(aVar5);
            } else {
                o0VarO.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarO);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarO);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarO.T || !p005kotlin.jvm.internal.s.g(o0VarO.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarO, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarO);
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            int i18 = (i17 >> 6) & 8176;
            o0Var = o0VarO;
            p3.p1 p1Var4 = p1Var2;
            byte b14 = 0;
            b2.a(c2.l.C(aVar4, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), z14, i14, i15, gl1.y.Q(o0VarO, R.string.lbl_add_a_course_question), gl1.y.Q(o0VarO, R.string.lbl_add_course_message), null, null, null, o0Var, i18, 448);
            o0Var.C(-1341419929);
            w13.c cVar = hv1.a.f85829e;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                hv1.a aVar6 = (hv1.a) bVarN.next();
                String strQ = gl1.y.Q(o0Var, aVar6.f85830a);
                boolean z15 = ((hv1.a) p1Var4.getF182175a()) == aVar6;
                boolean zK = o0Var.k(aVar6.ordinal());
                Object objQ3 = o0Var.q();
                if (zK || objQ3 == p3.m.a.f135155b) {
                    p1Var = p1Var4;
                    objQ3 = new ca0.j1(14, aVar6, p1Var);
                    o0Var.K(objQ3);
                } else {
                    p1Var = p1Var4;
                }
                a(0, (e23.a) objQ3, strQ, o0Var, z15);
                p1Var4 = p1Var;
            }
            o0Var.g0(false);
            c2.l.f(b0Var.a(h4.r.S, 1.0f, true), o0Var);
            b82.c.b(null, null, z3.f.c(610210540, new am.l1(p1Var3, 4, b14), o0Var), z3.f.c(-1805230133, new bt1.k(lVar, p1Var4, 1), o0Var), 0L, o0Var, 3456, 19);
            o0Var.g0(true);
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                o0Var.C(-608905902);
                boolean z16 = (i17 & 112) == 32;
                Object objQ4 = o0Var.q();
                if (z16 || objQ4 == p3.m.a.f135155b) {
                    aVar3 = aVar2;
                    objQ4 = new a11.a0(aVar3, p1Var3, 4);
                    o0Var.K(objQ4);
                } else {
                    aVar3 = aVar2;
                }
                e23.a aVar7 = (e23.a) objQ4;
                Object objQ5 = o0Var.q();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new k(p1Var3, 0);
                    o0Var.K(objQ5);
                }
                lg.d.h(aVar7, (e23.a) objQ5, o0Var, 48);
                o0Var.g0(false);
            } else {
                aVar3 = aVar2;
                o0Var.C(-608645471);
                o0Var.g0(false);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            aVar3 = aVar2;
            o0Var = o0VarO;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.g(aVar, aVar3, lVar, z14, i14, i15, i16, 3);
        }
    }
}
