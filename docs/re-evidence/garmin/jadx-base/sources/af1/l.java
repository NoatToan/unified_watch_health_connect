package af1;

import android.content.Context;
import b82.d2;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.t;
import c2.t2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import java.util.List;
import l72.p2;
import lc.u0;
import nr.c0;
import nr.d0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import s5.x0;
import u1.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3103c;

    public /* synthetic */ l(int i14, Object obj, int i15) {
        this.f3101a = i15;
        this.f3102b = i14;
        this.f3103c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x037d  */
    /* JADX WARN: Code duplicated, block: B:85:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:8:0x0049  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        p3.m mVar;
        int i14 = this.f3101a;
        int i15 = 3;
        int i16 = 22;
        int i17 = 16;
        p3.m.a aVar = p3.m.f135153a;
        int i18 = this.f3102b;
        Object obj4 = this.f3103c;
        switch (i14) {
            case 0:
                x0 x0Var = (x0) obj4;
                t tVar = (t) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar2.B(tVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    r.a aVar2 = r.S;
                    h4.d.f81522a.getClass();
                    r rVarC = tVar.c(aVar2, h4.d.a.f81528f);
                    c2.j.f22691a.getClass();
                    z zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC2 = h4.k.c(rVarC, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    mh.c(String.valueOf(i18), b0.f22601a.b(aVar2, h4.d.a.f81537o), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar2, 0, 0, 131068);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 1:
                c0 c0Var = (c0) obj4;
                t2 t2Var = (t2) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar3.B(t2Var) ? 4 : 2;
                }
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    d2 d2Var = d2.f16532a;
                    String strValueOf = String.valueOf(i18 + 1);
                    r.a aVar4 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    float f15 = eVar.f97918c;
                    int i19 = iIntValue2 & 14;
                    d2Var.f(t2Var, strValueOf, t2Var.a(c2.l.B(aVar4, f14, f14, f15, f14), 1.0f, true), null, 0, 0, mVar3, i19, 28);
                    d2Var.f(t2Var, c0Var.f127001a, t2Var.a(as.k.e(aVar4), 3.0f, true), null, 0, 0, mVar3, i19, 28);
                    d2Var.f(t2Var, c0Var.f127002b, t2Var.a(as.k.e(aVar4), 1.5f, true), null, 0, 0, mVar3, i19, 28);
                    d2Var.f(t2Var, c0Var.f127003c, t2Var.a(c2.l.B(aVar4, f15, f14, f14, f14), 1.5f, true), null, 0, 0, mVar3, i19, 28);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 2:
                d0 d0Var = (d0) obj4;
                t2 t2Var2 = (t2) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar4.B(t2Var2) ? 4 : 2;
                }
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    d2 d2Var2 = d2.f16532a;
                    String strValueOf2 = String.valueOf(i18 + 1);
                    r.a aVar5 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    float f16 = eVar2.f97920e;
                    float f17 = eVar2.f97918c;
                    int i24 = iIntValue3 & 14;
                    d2Var2.f(t2Var2, strValueOf2, t2Var2.a(c2.l.B(aVar5, f16, f16, f17, f16), 0.2f, true), null, 0, 0, mVar4, i24, 28);
                    d2Var2.f(t2Var2, d0Var.f127005a, t2Var2.a(as.k.e(aVar5), 0.6f, true), null, 0, 0, mVar4, i24, 28);
                    d2Var2.f(t2Var2, d0Var.f127006b, t2Var2.a(c2.l.B(aVar5, f17, f16, f16, f16), 0.2f, true), null, 0, 0, mVar4, i24, 28);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 3:
                z3.e eVar3 = (z3.e) obj4;
                e2.d dVar = (e2.d) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar5.B(dVar) ? 4 : 2;
                }
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    eVar3.invoke(dVar, Integer.valueOf(i18), mVar5, Integer.valueOf(iIntValue4 & 14));
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 4:
                Context context = (Context) obj4;
                p3.m mVar6 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var5 = p3.n.f135158a;
                r.a aVar6 = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarY = c2.l.y(aVar6, j92.b.f97899b.f97920e);
                z3.e eVarC = z3.f.c(-617908602, new ba2.e(i18, i15), mVar6);
                boolean zR = mVar6.r(context);
                Object objQ = mVar6.q();
                if (zR) {
                    objQ = new cy1.a(context, 29);
                    mVar6.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new cy1.a(context, 29);
                        mVar6.K(objQ);
                    }
                }
                l72.l.f(eVarC, rVarY, false, (e23.a) objQ, mVar6, 6, 12);
                return Unit.INSTANCE;
            case 5:
                e23.a aVar7 = (e23.a) obj4;
                p3.m mVar7 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var6 = p3.n.f135158a;
                p2 p2Var = p2.f111205a;
                String strQ = gl1.y.Q(mVar7, R.string.concept_my_friends);
                String strA = lv0.b.a(mVar7, i18);
                r.a aVar8 = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarC3 = c2.l.C(aVar8, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                boolean zB = mVar7.B(aVar7);
                Object objQ2 = mVar7.q();
                if (zB) {
                    objQ2 = new gt1.s(aVar7, i17);
                    mVar7.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new gt1.s(aVar7, i17);
                        mVar7.K(objQ2);
                    }
                }
                p2Var.h(strQ, strA, null, rVarC3, null, false, false, null, null, null, (e23.a) objQ2, mVar7, 0, 0, 1012);
                return Unit.INSTANCE;
            case 6:
                w20.a aVar9 = (w20.a) obj4;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((t) obj).getClass();
                if (mVar8.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var7 = p3.n.f135158a;
                    h4.d.f81522a.getClass();
                    h4.g.b bVar2 = h4.d.a.f81534l;
                    r.a aVar10 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    float f18 = eVar4.f97920e;
                    r rVarC4 = c2.l.C(aVar10, f18, f18, 0.0f, f18, 4);
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22692b, bVar2, mVar8, 48);
                    int iHashCode2 = Long.hashCode(mVar8.getU());
                    i2 i2VarX2 = mVar8.x();
                    r rVarC5 = h4.k.c(rVarC4, mVar8);
                    h5.g.V.getClass();
                    e0.a aVar11 = h5.g.a.f81805b;
                    if (mVar8.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar11);
                    } else {
                        mVar8.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar8);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar8);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar8.getT() || !s.g(mVar8.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar8, iHashCode2, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC5, mVar8);
                    u2 u2Var = u2.f22900a;
                    i7.a(n5.c.a(aVar9.f181476a.m().f32981c, mVar8, 0), null, x2.q(aVar10, j92.b.f97901d.f97905d), u0.f(mVar8), mVar8, 48, 0);
                    String strH = vb.h.h(i18 + 1, gl1.y.Q(mVar8, R.string.lbl_route), StringUtils.SPACE);
                    d92.b.f58624b.getClass();
                    mh.c(strH, c2.l.C(aVar10, eVar4.f97920e, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(d92.c.b(j92.f.f97932i, mVar8)), mVar8, 0, 0, 131068);
                    mVar8.y();
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 7:
                qn0.i iVar = (qn0.i) obj4;
                h82.r rVar = (h82.r) obj;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i25 = qn0.i.f145805f;
                rVar.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar9.B(rVar) ? 4 : 2;
                }
                if (mVar9.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var8 = p3.n.f135158a;
                    int i26 = ((iIntValue6 << 3) & 112) | 6;
                    rVar.k(z3.f.c(-251708472, new pk1.g(rVar, i16), mVar9), mVar9, i26);
                    rVar.a(z3.f.c(-1544562703, new mg2.o(rVar, iVar, i18, 19), mVar9), mVar9, i26);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 8:
                List list = (List) obj4;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar10.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var9 = p3.n.f135158a;
                    if (i18 > 0) {
                        mVar10.C(-736602204);
                        if (list == null || list.isEmpty()) {
                            mVar10.C(-736523681);
                            String strQ2 = gl1.y.Q(mVar10, R.string.msg_search_no_match);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            x0 x0Var2 = j92.f.f97933j;
                            k92.a.f103644a.getClass();
                            long j8 = k92.a.f103652i;
                            long jX = com.nimbusds.jose.shaded.gson.internal.a.x(mVar10);
                            d6.h.f57752b.getClass();
                            int i27 = d6.h.f57755e;
                            r rVarF = x2.f(r.S, 1.0f);
                            d92.b.f58625c.getClass();
                            mh.c(strQ2, c2.l.y(rVarF, j92.b.f97899b.f97920e), jX, null, j8, null, 0L, d6.h.a(i27), 0L, 0, false, 0, 0, null, x0Var2, mVar10, 0, 0, 130024);
                            mVar = mVar10;
                            mVar.f();
                        } else {
                            mVar10.C(-736015591);
                            mVar10.f();
                            mVar = mVar10;
                        }
                        mVar.f();
                    } else {
                        mVar10.C(-735957187);
                        String strQ3 = gl1.y.Q(mVar10, R.string.adding_authorized_viewer_description);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0Var3 = j92.f.f97933j;
                        k92.a.f103644a.getClass();
                        long j14 = k92.a.f103652i;
                        long jA = zl.a.a(mVar10);
                        d6.h.f57752b.getClass();
                        int i28 = d6.h.f57755e;
                        r.a aVar12 = r.S;
                        d92.b.f58625c.getClass();
                        mh.c(strQ3, c2.l.y(aVar12, j92.b.f97899b.f97920e), jA, null, j14, null, 0L, d6.h.a(i28), 0L, 0, false, 0, 0, null, x0Var3, mVar10, 0, 0, 130024);
                        mVar10.f();
                    }
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 9:
                p1 p1Var = (p1) obj4;
                p3.m mVar11 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var10 = p3.n.f135158a;
                Object objQ3 = mVar11.q();
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new x91.d(p1Var, i17);
                    mVar11.K(objQ3);
                }
                y22.e.a((e23.a) objQ3, i18, mVar11, 48);
                return Unit.INSTANCE;
            default:
                e23.l lVar = (e23.l) obj4;
                r rVar2 = (r) obj;
                p3.m mVar12 = (p3.m) obj2;
                v.h.y(701033663, rVar2, (Integer) obj3, mVar12);
                x1 x1Var11 = p3.n.f135158a;
                boolean zB2 = mVar12.B(lVar) | mVar12.k(i18);
                Object objQ4 = mVar12.q();
                if (zB2) {
                    objQ4 = new au0.m(lVar, i18, i16);
                    mVar12.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new au0.m(lVar, i18, i16);
                        mVar12.K(objQ4);
                    }
                }
                r rVarD = w.d(rVar2, false, null, null, (e23.a) objQ4, 15);
                mVar12.f();
                return rVarD;
        }
    }

    public /* synthetic */ l(Object obj, int i14, int i15) {
        this.f3101a = i15;
        this.f3103c = obj;
        this.f3102b = i14;
    }
}
