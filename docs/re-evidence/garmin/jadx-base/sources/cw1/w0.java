package cw1;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import g02.b2;
import i3.e5;
import i3.mh;
import i3.qg;
import java.util.ArrayList;
import java.util.List;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class w0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(jv1.l lVar, boolean z14, e23.a aVar, e23.l lVar2, boolean z15, int i14, int i15, p3.m mVar, int i16) {
        p3.p1 p1Var;
        p3.p1 p1Var2;
        p3.p1 p1Var3;
        p3.p1 p1Var4;
        e23.a aVar2 = aVar;
        lVar.getClass();
        aVar2.getClass();
        lVar2.getClass();
        p3.o0 o0VarE = mVar.E(-2019296424);
        int i17 = i16 | (o0VarE.B(lVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar2) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024) | (o0VarE.h(z15) ? 16384 : 8192) | (o0VarE.k(i14) ? 131072 : 65536) | (o0VarE.k(i15) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i17 & 1, (599187 & i17) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            Object obj = p3.m.a.f135155b;
            if (objQ == obj) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var5 = (p3.p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == obj) {
                objQ2 = p3.p0.n(lVar.f101074b);
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var6 = (p3.p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == obj) {
                objQ3 = e5.o(0, o0VarE);
            }
            p3.n1 n1Var = (p3.n1) objQ3;
            h4.r.a aVar3 = h4.r.S;
            h4.r rVarD = x2.d(aVar3, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
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
            d92.b.f58625c.getClass();
            int i18 = 0;
            b2.a(c2.l.C(aVar3, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), z15, i14, i15, gl1.y.Q(o0VarE, R.string.lbl_select_existing_course), null, null, null, null, o0VarE, (i17 >> 9) & 8176, 480);
            i53.f fVarA = i53.a.a(gl1.y.Q(o0VarE, R.string.courses_lbl_my_courses), gl1.y.Q(o0VarE, R.string.lbl_favorites));
            int intValue = n1Var.getIntValue();
            long jF = ds.e0.f(o0VarE);
            z3.e eVarC = z3.f.c(1272016486, new s0(n1Var, 0), o0VarE);
            h.f56044a.getClass();
            qg.e(intValue, null, jF, 0L, eVarC, h.f56045b, z3.f.c(-1081565082, new t0(fVarA, n1Var, i18), o0VarE), o0VarE, 1794048, 10);
            int intValue2 = n1Var.getIntValue();
            List list = lVar.f101073a;
            if (intValue2 != 0) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((z20.e) obj2).f201903g) {
                        arrayList.add(obj2);
                    }
                }
                list = arrayList;
            }
            h4.r.a aVar5 = h4.r.S;
            h4.r rVarA = b0Var.a(aVar5, 1.0f, true);
            boolean zR = o0VarE.r(list);
            Object objQ4 = o0VarE.q();
            if (zR || objQ4 == p3.m.a.f135155b) {
                p1Var = p1Var6;
                objQ4 = new u0(list, p1Var, i18);
                o0VarE.K(objQ4);
            } else {
                p1Var = p1Var6;
            }
            p3.p1 p1Var7 = p1Var;
            e2.c.b(rVarA, null, null, null, null, null, false, null, (e23.l) objQ4, o0VarE, 0, 510);
            if (z14) {
                p1Var2 = p1Var5;
                o0VarE.C(2095485460);
                o0VarE.g0(false);
            } else {
                o0VarE.C(2095005611);
                h4.r rVarF = x2.f(aVar5, 1.0f);
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar = j92.b.f97899b;
                h4.r rVarC2 = c2.l.C(rVarF, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                bVar2.getClass();
                h4.r rVarA2 = c2.l.A(rVarC2, eVar.f97920e, 0.0f, 2);
                long jF2 = d92.b.a(o0VarE).e().f();
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_skip_button);
                Object objQ5 = o0VarE.q();
                if (objQ5 == p3.m.a.f135155b) {
                    p1Var4 = p1Var5;
                    objQ5 = new k(p1Var4, 4);
                    o0VarE.K(objQ5);
                } else {
                    p1Var4 = p1Var5;
                }
                p1Var2 = p1Var4;
                o.a(strQ, rVarA2, true, null, jF2, 0L, null, (e23.a) objQ5, o0VarE, 12583296, 104);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
            h4.r rVarF2 = x2.f(aVar5, 1.0f);
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97918c;
            bVar3.getClass();
            h4.r rVarC3 = c2.l.C(rVarF2, 0.0f, f14, 0.0f, eVar2.f97921f, 5);
            bVar3.getClass();
            h4.r rVarA3 = c2.l.A(rVarC3, eVar2.f97920e, 0.0f, 2);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_next);
            boolean z16 = ((z20.e) p1Var7.getF182175a()) != null;
            boolean z17 = (i17 & 7168) == 2048;
            Object objQ6 = o0VarE.q();
            if (z17 || objQ6 == p3.m.a.f135155b) {
                objQ6 = new a51.k(p1Var7, lVar2, 9);
                o0VarE.K(objQ6);
            }
            p3.o0 o0Var = o0VarE;
            o.a(strQ2, rVarA3, z16, null, 0L, 0L, null, (e23.a) objQ6, o0Var, 0, 120);
            o0VarE = o0Var;
            o0VarE.g0(true);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(-1543971173);
                boolean z18 = (i17 & 896) == 256;
                Object objQ7 = o0VarE.q();
                if (z18 || objQ7 == p3.m.a.f135155b) {
                    aVar2 = aVar;
                    p1Var3 = p1Var2;
                    objQ7 = new a11.a0(aVar2, p1Var3, 6);
                    o0VarE.K(objQ7);
                } else {
                    aVar2 = aVar;
                    p1Var3 = p1Var2;
                }
                e23.a aVar6 = (e23.a) objQ7;
                Object objQ8 = o0VarE.q();
                if (objQ8 == p3.m.a.f135155b) {
                    objQ8 = new k(p1Var3, 5);
                    o0VarE.K(objQ8);
                }
                lg.d.h(aVar6, (e23.a) objQ8, o0VarE, 48);
                o0VarE.g0(false);
            } else {
                aVar2 = aVar;
                o0VarE.C(-1543710742);
                o0VarE.g0(false);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v0(lVar, z14, aVar2, lVar2, z15, i14, i15, i16);
        }
    }

    public static final void b(d6.h hVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-560688327);
        int i15 = i14 | (o0VarE.B(hVar) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_message_cant_find_course_add_later);
            d92.b.f58624b.getClass();
            o0Var = o0VarE;
            mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, hVar, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0Var, 0, i15 & 14, 130044);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c62.m1(hVar, i14, 22);
        }
    }
}
