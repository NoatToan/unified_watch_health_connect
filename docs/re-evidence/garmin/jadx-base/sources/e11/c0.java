package e11;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.v1;
import b82.f1;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import c22.l3;
import ca0.u0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.garmin.android.apps.connectmobile.e3;
import com.google.android.exoplayer2.C;
import i3.ej;
import i3.fe;
import i3.gj;
import i3.ij;
import i3.l5;
import i3.mh;
import i3.vi;
import java.util.LinkedList;
import java.util.Map;
import l72.p1;
import l72.x0;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p008y1.b2;
import p3.b4;
import p3.i2;
import p3.n1;
import p3.p0;
import p3.x1;
import p3.y3;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c0 implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f61866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f61867c;

    public /* synthetic */ c0(e23.l lVar, z3.e eVar) {
        this.f61865a = 21;
        this.f61867c = lVar;
        this.f61866b = eVar;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        String str;
        LinkedList linkedList = (LinkedList) this.f61866b;
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.f fVar = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.f) this.f61867c;
        t2 t2Var = (t2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.f.b bVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.f.f40604w;
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        int i14 = iIntValue;
        if (mVar.n(i14 & 1, (i14 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.f.a aVar = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.f.a) linkedList.poll();
            p3.m.a aVar2 = p3.m.f135153a;
            if (aVar == null) {
                mVar.C(-1474372983);
                mVar.f();
                str = StringUtils.SPACE;
            } else {
                mVar.C(-1474372982);
                String str2 = aVar.f40627c;
                String str3 = aVar.f40626b;
                Context contextRequireContext = fVar.requireContext();
                contextRequireContext.getClass();
                Object objQ = mVar.q();
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new f21.g0(25);
                    mVar.K(objQ);
                }
                b92.a aVarA = wz1.a.a(str2 + StringUtils.SPACE + oi0.c.A(contextRequireContext, (e23.l) objQ, str3));
                x0 x0Var = x0.f111346a;
                String str4 = aVar.f40625a;
                String str5 = aVar.f40626b;
                int i15 = b92.a.f16960b;
                int i16 = (i14 & 14) | (x0.f111348c << 24);
                str = StringUtils.SPACE;
                x0Var.a(i16, 60, aVarA, t2Var, null, null, str4, str5, null, null, mVar);
                mVar.f();
            }
            com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.f.a aVar3 = (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.f.a) linkedList.poll();
            if (aVar3 != null) {
                mVar.C(-1473750564);
                String str6 = aVar3.f40627c;
                String str7 = aVar3.f40626b;
                Context contextRequireContext2 = fVar.requireContext();
                contextRequireContext2.getClass();
                Object objQ2 = mVar.q();
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new f21.g0(26);
                    mVar.K(objQ2);
                }
                b92.a aVarA2 = wz1.a.a(str6 + str + oi0.c.A(contextRequireContext2, (e23.l) objQ2, str7));
                x0 x0Var2 = x0.f111346a;
                String str8 = aVar3.f40625a;
                String str9 = aVar3.f40626b;
                int i17 = b92.a.f16960b;
                x0Var2.a((i14 & 14) | (x0.f111348c << 24), 60, aVarA2, t2Var, null, null, str8, str9, null, null, mVar);
                mVar.f();
            } else {
                mVar.C(-1473253944);
                x0.f111346a.h(t2Var, mVar, (i14 & 14) | (x0.f111348c << 3));
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        fo.q qVar = (fo.q) this.f61866b;
        m3.r rVar = (m3.r) this.f61867c;
        c2.t tVar = (c2.t) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        tVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(tVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            f1.a(tVar, qVar.f72404c, rVar, mVar, iIntValue & 14);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00de  */
    private final Object c(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f61866b;
        fv0.g gVar = (fv0.g) this.f61867c;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((fe) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarD = x2.d(aVar, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC = c2.l.C(rVarD, 0.0f, eVar.f97921f, 0.0f, 0.0f, 13);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC2 = h4.k.c(rVarC, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            String strQ = gl1.y.Q(mVar, R.string.lbl_enter_a_name);
            h4.r rVarF = x2.f(aVar, 1.0f);
            boolean zR = mVar.r(gVar);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new fv0.e(gVar, 1);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new fv0.e(gVar, 1);
                    mVar.K(objQ);
                }
            }
            p1.a(str, rVarF, strQ, 75, false, false, null, 0L, null, null, null, null, null, (e23.l) objQ, mVar, 3120, 0, 16368);
            String strQ2 = gl1.y.Q(mVar, R.string.msg_create_livetrack_session_name);
            d92.b.f58624b.getClass();
            mh.c(strQ2, c2.l.z(aVar, eVar.f97920e, eVar.f97918c), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 0, 131068);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object d(Object obj, Object obj2, Object obj3) {
        o13.p pVar = (o13.p) this.f61866b;
        com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e eVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e) this.f61867c;
        t2 t2Var = (t2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e.a aVar = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.e.f46024o;
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            x0 x0Var = x0.f111346a;
            String str = (String) pVar.f128594a;
            String string = eVar.getString(R.string.leg_distance);
            String str2 = (String) pVar.f128595b;
            int i14 = iIntValue & 14;
            int i15 = x0.f111348c;
            x0Var.a(i14 | (i15 << 24), 116, null, t2Var, null, null, str, string, str2, null, mVar);
            x0Var.h(t2Var, mVar, i14 | (i15 << 3));
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0067  */
    private final Object e(Object obj, Object obj2, Object obj3) {
        ij ijVar = (ij) this.f61866b;
        String str = (String) this.f61867c;
        gj gjVar = (gj) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        gjVar.getClass();
        x1 x1Var = p3.n.f135158a;
        vi viVar = vi.f90035a;
        d92.b.f58623a.getClass();
        d92.b.f58625c.getClass();
        j92.e eVar = j92.b.f97899b;
        long jE = dh.b.e(eVar.f97920e, eVar.f97918c);
        viVar.getClass();
        l5 l5Var = new l5(jE, null);
        k2.h hVarA = k2.i.a(j92.b.f97900c.f97910b);
        long jE2 = d92.b.a(mVar).e().e();
        h4.r.a aVar = h4.r.S;
        boolean zR = mVar.r(ijVar);
        Object objQ = mVar.q();
        if (zR) {
            objQ = new fe2.z(ijVar, 7);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new fe2.z(ijVar, 7);
                mVar.K(objQ);
            }
        }
        ej.a(gjVar, u1.w.d(aVar, false, null, null, (e23.a) objQ, 15), l5Var, 0.0f, hVarA, 0L, jE2, 0.0f, 0.0f, z3.f.c(1524423022, new fv1.b(str, 6), mVar), mVar, (iIntValue & 14) | C.ENCODING_PCM_32BIT, 212);
        return Unit.INSTANCE;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        String productDisplayName;
        fk0.a aVar = (fk0.a) this.f61866b;
        u0 u0Var = (u0) this.f61867c;
        lc.v vVar = (lc.v) obj;
        p3.m mVar = (p3.m) obj2;
        ((Integer) obj3).getClass();
        vVar.getClass();
        x1 x1Var = p3.n.f135158a;
        long j8 = ((gl1.f) lc.w.a(vVar, s0.f105811a.b(gl1.f.class))).f77837a;
        rd2.f.a().f152045a.getClass();
        sd2.f fVarI = rd2.j.i(j8, null);
        if (fVarI == null || (productDisplayName = fVarI.getProductDisplayName()) == null) {
            productDisplayName = "";
        }
        w52.u0.b(productDisplayName, aVar, u0Var, mVar, 0);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    private final Object g(Object obj, Object obj2, Object obj3) {
        pt1.p pVar = (pt1.p) this.f61866b;
        e23.l lVar = (e23.l) this.f61867c;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e2.d) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            s62.a.f157643a.getClass();
            t62.b bVar = t62.b.f162798a;
            v62.i0.a(bVar);
            boolean z14 = pVar.f140945q;
            String strQ = gl1.y.Q(mVar, z14 ? R.string.lbl_saved_trails : R.string.lbl_save);
            u4.d dVarA = z14 ? v62.j0.a(bVar) : v62.i0.a(bVar);
            boolean zB = mVar.B(lVar) | mVar.B(pVar);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new gt1.m(lVar, pVar, 0);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new gt1.m(lVar, pVar, 0);
                    mVar.K(objQ);
                }
            }
            gt1.h.b(null, strQ, dVarA, false, z14, false, (e23.a) objQ, mVar, 0, 41);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        gw0.u uVar = (gw0.u) this.f61866b;
        b63.o oVar = (b63.o) this.f61867c;
        pv0.h hVar = (pv0.h) obj;
        pv0.s sVar = (pv0.s) obj2;
        hVar.getClass();
        sVar.getClass();
        uVar.getClass();
        oVar.getClass();
        ge1.b.T(v1.a(uVar), null, null, new gw0.v(ge1.b.O(hVar, sVar, (pv0.o) obj3), uVar, oVar, null), 3);
        return Unit.INSTANCE;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        e23.l lVar = (e23.l) this.f61867c;
        z3.e eVar = (z3.e) this.f61866b;
        int iIntValue = ((Integer) obj).intValue();
        p3.m mVar = (p3.m) obj2;
        int iIntValue2 = ((Integer) obj3).intValue();
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= mVar.k(iIntValue) ? 4 : 2;
        }
        if (mVar.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            lVar.invoke(pv0.r.f141412f.get(iIntValue));
            eVar.invoke(mVar, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) this.f61866b;
        iw1.a aVar = (iw1.a) this.f61867c;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.t) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            ((e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null)).v(3078, activityListItemDTO, null, x2.f(h4.r.S, 1.0f), mVar, aVar.f95323k);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        h2.j0 j0Var = (h2.j0) this.f61866b;
        g6.o oVar = (g6.o) this.f61867c;
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        float fFloatValue3 = ((Float) obj3).floatValue();
        h2.o oVar2 = h2.o.f80982a;
        boolean zB = z1.i.b(j0Var, fFloatValue);
        if (j0Var.n().getF80848e() != b2.Vertical && oVar != g6.o.Ltr) {
            zB = !zB;
        }
        int f80845b = j0Var.n().getF80845b();
        float fA = f80845b == 0 ? 0.0f : z1.i.a(j0Var) / f80845b;
        float f14 = fA - ((int) fA);
        int iA = z1.g.a(fFloatValue, j0Var.f80941q);
        z1.d.f200826b.getClass();
        if (iA == 0) {
            fFloatValue2 = Math.abs(f14) > 0.5f ? fFloatValue3 : fFloatValue3;
        } else if (iA != z1.d.f200827c) {
            if (iA != z1.d.f200828d) {
                fFloatValue2 = 0.0f;
            }
        }
        return Float.valueOf(fFloatValue2);
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        String strA;
        Double d14;
        v21.e eVar = (v21.e) this.f61866b;
        k01.k kVar = ((k01.h) this.f61867c).f102061b;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((c2.t) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            c2.j.d dVar = c2.j.f22693c;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarC = c2.l.C(rVarF, 0.0f, 0.0f, eVar2.f97918c, 0.0f, 11);
            s2 s2VarA = q2.a(dVar, bVar, mVar, 54);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC2 = h4.k.c(rVarC, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, mVar);
            u2 u2Var = u2.f22900a;
            Integer num = kVar != null ? kVar.f102072a : null;
            l22.a aVar3 = eVar.f175325b;
            v21.f.f175333a.getClass();
            if (v21.f.s(num)) {
                String str = eVar.f175329f.format(num);
                str.getClass();
                strA = aVar3.a(R.string.string_space_string_pattern, str, aVar3.getString(R.string.lbl_total));
            } else {
                strA = eVar.f175327d;
            }
            String str2 = strA;
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar);
            d6.h.f57752b.getClass();
            mh.c(str2, u2Var.a(c2.l.C(aVar, 0.0f, 0.0f, eVar2.f97918c, 0.0f, 11), 1.0f, true), 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57758h), 0L, 0, false, 0, 0, null, x0VarB, mVar, 0, 0, 130044);
            h4.r rVarQ = x2.q(aVar, eVar2.f97922g);
            Float fValueOf = (kVar == null || (d14 = kVar.f102077f) == null) ? null : Float.valueOf((float) d14.doubleValue());
            mVar.C(-1188200278);
            q13.b bVarB = p13.w.b();
            if (fValueOf != null) {
                mVar.C(2133461676);
                if (fValueOf.floatValue() < 100.0f) {
                    mVar.C(2133507587);
                    mVar.f();
                    float fFloatValue = fValueOf.floatValue() / 100.0f;
                    gl.c.f77766a.getClass();
                    gl.e eVar3 = gl.c.f77767b;
                    bVarB.add(new z72.l(fFloatValue, eVar3.f77799p, null));
                    bVarB.add(new z72.l((100.0f - fValueOf.floatValue()) / 100.0f, eVar3.f77789k, null));
                } else if (p005kotlin.jvm.internal.s.e(fValueOf, 100.0f)) {
                    mVar.C(2133812379);
                    mVar.f();
                    gl.c.f77766a.getClass();
                    bVarB.add(new z72.l(1.0f, gl.c.f77767b.f77799p, null));
                } else {
                    float fFloatValue2 = fValueOf.floatValue();
                    if (100.0f <= fFloatValue2 && fFloatValue2 <= 200.0f) {
                        mVar.C(2133982445);
                        bVarB.add(new z72.l((fValueOf.floatValue() - 100.0f) / 100.0f, fb1.c.i(gl.c.f77766a, mVar), null));
                        bVarB.add(new z72.l((100.0f - (fValueOf.floatValue() - 100.0f)) / 100, gl.c.f77767b.f77799p, null));
                        mVar.f();
                    } else if (fValueOf.floatValue() >= 200.0f) {
                        mVar.C(2134308534);
                        bVarB.add(new z72.l(1.0f, fb1.c.i(gl.c.f77766a, mVar), null));
                        mVar.f();
                    } else {
                        mVar.C(2134431015);
                        mVar.f();
                    }
                }
                mVar.f();
            } else {
                mVar.C(2134449739);
                mVar.f();
                gl.c.f77766a.getClass();
                bVarB.add(new z72.l(1.0f, gl.c.f77767b.f77789k, null));
            }
            q13.b bVarA = p13.w.a(bVarB);
            mVar.f();
            g6.f.a aVar4 = g6.f.f75994b;
            z72.k.c(rVarQ, i53.a.j(bVarA), null, null, 2, 0.0f, null, mVar, 196608, 220);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        o51.d dVar = (o51.d) this.f61866b;
        m3.r rVar = (m3.r) this.f61867c;
        c2.t tVar = (c2.t) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        tVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(tVar) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            f1.a(tVar, dVar.f129224b, rVar, mVar, iIntValue & 14);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    private final Object o(Object obj, Object obj2, Object obj3) {
        Map map = (Map) this.f61866b;
        e23.l lVar = (e23.l) this.f61867c;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e2.d) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            boolean zB = mVar.B(lVar);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new fb0.d(lVar, 11);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new fb0.d(lVar, 11);
                    mVar.K(objQ);
                }
            }
            ha0.f.c(map, (e23.l) objQ, mVar, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object q(Object obj, Object obj2, Object obj3) {
        String strL0;
        ht0.e eVar = (ht0.e) this.f61866b;
        oi0.h hVar = (oi0.h) this.f61867c;
        h82.r rVar = (h82.r) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i14 = ht0.e.f85518g;
        rVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(rVar) ? 4 : 2;
        }
        int i15 = iIntValue;
        int i16 = 18;
        if (mVar.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            double d14 = eVar.f85519f.f179717b;
            if (Double.isNaN(d14)) {
                strL0 = sn.a.h(mVar, 926276980, R.string.no_value, mVar);
            } else {
                mVar.C(926279346);
                strL0 = l3.a.l0(l3.f23124b, w2.a0.s(mVar), d14, true);
                mVar.f();
            }
            String str = strL0;
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new hq.f0(i16);
                mVar.K(objQ);
            }
            String strB = oi0.c.B(str, (e23.l) objQ, mVar);
            boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
            ft0.a aVar = ft0.a.f73439a;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            Context context = (Context) mVar.A(y3Var);
            vs0.a aVar2 = eVar.f85519f;
            xs0.a aVar3 = aVar2.f179716a;
            double d15 = aVar2.f179718c;
            String strQ = gl1.y.Q(mVar, R.string.no_duration_value);
            aVar.getClass();
            String strA = ft0.a.a(context, aVar3, d15, zY, true, strQ);
            Context context2 = (Context) mVar.A(y3Var);
            vs0.a aVar4 = eVar.f85519f;
            String strB2 = ft0.a.b(context2, hVar, aVar4.f179716a, aVar4.f179718c, zY, true, gl1.y.Q(mVar, R.string.msg_no_data_available));
            String strP = gl1.y.P(R.string.lactate_threshold_dynamic_text, new Object[]{str, strA}, mVar);
            String strP2 = gl1.y.P(R.string.lactate_threshold_dynamic_text, new Object[]{strB, strB2}, mVar);
            rVar.D(R.string.lbl_your_lactate_threshold, mVar, (i15 << 3) & 112);
            int i17 = (i15 << 6) & 896;
            rVar.m(i17, 0, strP, strP2, mVar);
            rVar.l(R.string.lactate_threshold_reading_description, i17, 2, null, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    private final Object r(Object obj, Object obj2, Object obj3) {
        h4.r rVar = (h4.r) this.f61866b;
        n1 n1Var = (n1) this.f61867c;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e2.d) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            int intValue = n1Var.getIntValue();
            boolean zB = mVar.B(n1Var);
            Object objQ = mVar.q();
            if (zB) {
                objQ = new a11.h0(n1Var, 17);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a11.h0(n1Var, 17);
                    mVar.K(objQ);
                }
            }
            ht1.w.h(intValue, 0, (e23.l) objQ, rVar, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:209:0x0566  */
    /* JADX WARN: Code duplicated, block: B:210:0x0572  */
    /* JADX WARN: Code duplicated, block: B:212:0x0591  */
    /* JADX WARN: Code duplicated, block: B:216:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:219:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:220:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:221:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:222:0x05db  */
    /* JADX WARN: Code duplicated, block: B:223:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:224:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:225:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:228:0x0635  */
    /* JADX WARN: Code duplicated, block: B:22:0x00be  */
    /* JADX WARN: Code duplicated, block: B:231:0x063d  */
    /* JADX WARN: Code duplicated, block: B:234:0x0666  */
    /* JADX WARN: Code duplicated, block: B:236:0x066e  */
    /* JADX WARN: Code duplicated, block: B:237:0x069c  */
    /* JADX WARN: Code duplicated, block: B:238:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:239:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:240:0x0728  */
    /* JADX WARN: Code duplicated, block: B:241:0x0757  */
    /* JADX WARN: Code duplicated, block: B:244:0x0799  */
    /* JADX WARN: Code duplicated, block: B:246:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:249:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:293:0x0983  */
    /* JADX WARN: Code duplicated, block: B:302:0x09dd  */
    /* JADX WARN: Code duplicated, block: B:311:0x0a37  */
    /* JADX WARN: Code duplicated, block: B:320:0x0a91  */
    /* JADX WARN: Code duplicated, block: B:329:0x0aec  */
    /* JADX WARN: Code duplicated, block: B:338:0x0b37  */
    /* JADX WARN: Code duplicated, block: B:355:0x0bf8  */
    /* JADX WARN: Code duplicated, block: B:364:0x0c3a  */
    /* JADX WARN: Code duplicated, block: B:373:0x0c98  */
    /* JADX WARN: Code duplicated, block: B:378:0x0cb5  */
    /* JADX WARN: Code duplicated, block: B:385:0x0d1c  */
    /* JADX WARN: Code duplicated, block: B:390:0x0d3e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0238  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v11 java.lang.Object, still in use, count: 2, list:
          (r6v11 java.lang.Object) from 0x0562: PHI (r6 I:??) = (r6v6 java.lang.Object), (r6v11 java.lang.Object) binds: [B:206:0x0561, B:399:0x0562] A[DONT_GENERATE, DONT_INLINE]
          (r6v11 java.lang.Object) from 0x055a: CHECK_CAST (vt1.k) (r6v11 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // e23.q
    public final java.lang.Object invoke(java.lang.Object r48, java.lang.Object r49, java.lang.Object r50) {
        /*
            Method dump skipped, instruction units count: 3520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e11.c0.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ c0(int i14, Object obj, Object obj2) {
        this.f61865a = i14;
        this.f61866b = obj;
        this.f61867c = obj2;
    }
}
