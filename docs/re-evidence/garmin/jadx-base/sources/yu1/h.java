package yu1;

import android.content.Context;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import e23.l;
import e23.q;
import fg0.j;
import fg0.k;
import gl1.y;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jv1.n;
import l72.x0;
import o13.p;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import z2.c1;
import z2.d1;
import zo1.r0;
import zo1.z;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f199790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f199791c;

    public /* synthetic */ h(int i14, Object obj, Object obj2) {
        this.f199789a = i14;
        this.f199790b = obj;
        this.f199791c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0094  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        gg0.i unit;
        fg0.d customGoal;
        fg0.d customGoal2;
        Double value;
        j eventCustomization;
        m mVar;
        Object obj4;
        v60.a aVar;
        int i14 = this.f199789a;
        int i15 = 3;
        m.a aVar2 = m.f135153a;
        fg0.d customGoal3 = null;
        str = null;
        String str = null;
        customGoal3 = null;
        int i16 = 16;
        int i17 = 1;
        Object obj5 = this.f199791c;
        Object obj6 = this.f199790b;
        switch (i14) {
            case 0:
                n nVar = (n) obj6;
                Context context = (Context) obj5;
                t2 t2Var = (t2) obj;
                m mVar2 = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar2.B(t2Var) ? 4 : 2;
                }
                if (mVar2.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    k kVar = nVar.f101088j;
                    Double d14 = nVar.f101099u;
                    if (kVar != null && (eventCustomization = kVar.getEventCustomization()) != null) {
                        customGoal3 = eventCustomization.getCustomGoal();
                    }
                    if (customGoal3 == null) {
                        mVar2.C(-1964515791);
                        x0.f111346a.f((iIntValue & 14) | (x0.f111348c << 24), 124, null, t2Var, null, null, y.Q(mVar2, R.string.lbl_finish), y.Q(mVar2, R.string.lbl_goal), null, null, mVar2);
                        mVar2.f();
                    } else {
                        mVar2.C(-1964275262);
                        og0.a aVar3 = og0.a.f131967a;
                        j eventCustomization2 = kVar.getEventCustomization();
                        double dDoubleValue = (eventCustomization2 == null || (customGoal2 = eventCustomization2.getCustomGoal()) == null || (value = customGoal2.getValue()) == null) ? 0.0d : value.doubleValue();
                        j eventCustomization3 = kVar.getEventCustomization();
                        if (eventCustomization3 == null || (customGoal = eventCustomization3.getCustomGoal()) == null || (unit = customGoal.getUnit()) == null) {
                            unit = gg0.i.SECOND;
                        }
                        aVar3.getClass();
                        double dJ = og0.a.j(dDoubleValue, unit);
                        tu1.i.f166483a.getClass();
                        p pVarD = tu1.i.a.d(context, (long) dJ);
                        String str2 = (String) pVarD.f128594a;
                        String str3 = (String) pVarD.f128595b;
                        x0 x0Var = x0.f111346a;
                        String strQ = y.Q(mVar2, R.string.overall_goal_time);
                        b92.a aVarA = wz1.a.a(str3);
                        int i18 = b92.a.f16960b;
                        int i19 = (iIntValue & 14) | (x0.f111348c << 24);
                        x0Var.f(i19, 60, aVarA, t2Var, null, null, str2, strQ, null, null, mVar2);
                        if (!nVar.f101094p || d14 == null) {
                            mVar2.C(-1963035045);
                            mVar2.f();
                        } else {
                            mVar2.C(-1963453080);
                            p pVarD2 = tu1.i.a.d(context, MathKt.d(d14.doubleValue()));
                            x0Var.f(i19, 60, wz1.a.a((String) pVarD2.f128595b), t2Var, null, null, (String) pVarD2.f128594a, y.Q(mVar2, R.string.actual_overall_time), null, null, mVar2);
                            mVar2.f();
                        }
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 1:
                e23.a aVar4 = (e23.a) obj6;
                l lVar = (l) obj5;
                m mVar3 = (m) obj2;
                ((Integer) obj3).getClass();
                mVar3.C(759876635);
                x1 x1Var2 = p3.n.f135158a;
                Object objQ = mVar3.q();
                aVar2.getClass();
                Object obj7 = m.a.f135155b;
                Object obj8 = objQ;
                if (objQ == obj7) {
                    Object objF = p0.f(aVar4);
                    mVar3.K(objF);
                    obj8 = objF;
                }
                x3 x3Var = (x3) obj8;
                Object objQ2 = mVar3.q();
                if (objQ2 == obj7) {
                    Object bVar = new s1.b(n4.c.a(((n4.c) x3Var.getF182175a()).f123544a), d1.f201560b, n4.c.a(d1.f201561c), null, 8, null);
                    mVar3.K(bVar);
                    objQ2 = bVar;
                }
                s1.b bVar2 = (s1.b) objQ2;
                Unit unit2 = Unit.INSTANCE;
                boolean zR = mVar3.r(bVar2);
                Object objQ3 = mVar3.q();
                Object obj9 = objQ3;
                if (zR || objQ3 == obj7) {
                    Object c1Var = new c1(x3Var, bVar2, null);
                    mVar3.K(c1Var);
                    obj9 = c1Var;
                }
                l0.e((e23.p) obj9, unit2, mVar3);
                x3 x3Var2 = bVar2.f155489c;
                boolean zB = mVar3.B(x3Var2);
                Object objQ4 = mVar3.q();
                Object obj10 = objQ4;
                if (zB || objQ4 == obj7) {
                    Object hVar = new by1.h(x3Var2, i16);
                    mVar3.K(hVar);
                    obj10 = hVar;
                }
                r rVar = (r) lVar.invoke((e23.a) obj10);
                mVar3.f();
                return rVar;
            case 2:
                List<q71.e> list = (List) obj6;
                s5.x0 x0Var2 = (s5.x0) obj5;
                m mVar4 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c2.c1) obj).getClass();
                if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    for (q71.e eVar : list) {
                        r.a aVar5 = r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        r rVarA = c2.l.A(aVar5, eVar2.f97918c, 0.0f, 2);
                        h4.d.f81522a.getClass();
                        h4.g.b bVar3 = h4.d.a.f81534l;
                        c2.j.f22691a.getClass();
                        s2 s2VarA = q2.a(c2.j.f22692b, bVar3, mVar4, 48);
                        x1 x1Var4 = p3.n.f135158a;
                        int iHashCode = Long.hashCode(mVar4.getU());
                        i2 i2VarX = mVar4.x();
                        r rVarC = h4.k.c(rVarA, mVar4);
                        h5.g.V.getClass();
                        e0.a aVar6 = h5.g.a.f81805b;
                        if (mVar4.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar4.z();
                        if (mVar4.getT()) {
                            mVar4.M(aVar6);
                        } else {
                            mVar4.c();
                        }
                        b4.c(h5.g.a.f81810g, s2VarA, mVar4);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar4);
                        h5.g.a.b bVar4 = h5.g.a.f81813j;
                        if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar4, iHashCode, bVar4);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar4);
                        u2 u2Var = u2.f22900a;
                        c2.q.a(u1.n.e(l4.k.b(x2.q(aVar5, eVar2.f97920e), k2.i.f102406a), z32.e.c(eVar, mVar4), m1.f128891a), mVar4, 0);
                        int i24 = z32.e.a.f202159a[eVar.ordinal()];
                        mh.c(y.Q(mVar4, (i24 == 1 || i24 != 2) ? R.string.lbl_vo2_max : R.string.lbl_cycling_vo2_max), c2.l.C(aVar5, eVar2.f97918c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var2, mVar4, 0, 0, 131068);
                        mVar4.y();
                    }
                    x1 x1Var5 = p3.n.f135158a;
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 3:
                z53.b bVar5 = (z53.b) obj6;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z53.b.f202554h;
                Object obj11 = ((z53.b.a) obj5).f202556b;
                atomicReferenceFieldUpdater.set(bVar5, obj11);
                bVar5.e(obj11);
                return Unit.INSTANCE;
            case 4:
                z zVar = (z) obj6;
                p1 p1Var = (p1) obj5;
                h82.r rVar2 = (h82.r) obj;
                m mVar5 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                z.a aVar7 = z.f206495h;
                rVar2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar5.B(rVar2) ? 4 : 2;
                }
                if (mVar5.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var6 = p3.n.f135158a;
                    int i25 = (iIntValue3 << 3) & 112;
                    rVar2.D(R.string.lbl_groupride_privacy_data_sharing, mVar5, i25);
                    if (zVar.f206497g == null) {
                        mVar5.C(1231408550);
                        mVar5.f();
                        mVar = mVar5;
                    } else {
                        mVar5.C(1231408551);
                        m mVar6 = mVar5;
                        rVar2.l(R.string.lbl_groupride_privacy_subheading, (iIntValue3 << 6) & 896, 2, null, mVar6);
                        mVar6.f();
                        mVar = mVar6;
                    }
                    int i26 = (iIntValue3 << 6) & 896;
                    rVar2.o(R.string.lbl_groupride_privacy_description_1, i26, 2, null, mVar);
                    rVar2.o(R.string.lbl_groupride_privacy_description_2, i26, 2, null, mVar);
                    m mVar7 = mVar;
                    int i27 = i25 | 6;
                    rVar2.g(z3.f.c(1438108911, new wd0.a(rVar2, 28), mVar7), mVar7, i27);
                    rVar2.o(R.string.lbl_groupride_privacy_description_3, i26, 2, null, mVar);
                    rVar2.t(R.string.lbl_groupride_privacy_description_4, mVar7, i25);
                    rVar2.o(R.string.lbl_groupride_privacy_description_5, i26, 2, null, mVar);
                    rVar2.t(R.string.lbl_groupride_privacy_description_6, mVar7, i25);
                    rVar2.o(R.string.lbl_groupride_privacy_description_7, i26, 2, null, mVar);
                    rVar2.o(R.string.lbl_groupride_privacy_description_8, i26, 2, null, mVar);
                    rVar2.g(z3.f.c(-831527258, new wd0.a(rVar2, 29), mVar7), mVar7, i27);
                    if (zVar.f206497g == null) {
                        mVar7.C(1232772178);
                        mVar7.f();
                    } else {
                        mVar7.C(1232772179);
                        Object objQ5 = mVar7.q();
                        aVar2.getClass();
                        if (objQ5 == m.a.f135155b) {
                            obj4 = objQ5;
                            Object dVar = new zk1.d(p1Var, i15);
                            mVar7.K(dVar);
                            obj4 = dVar;
                        }
                        obj4 = objQ5;
                        rVar2.i((e23.a) obj4, R.string.lbl_groupride_privacy_bullet_text7, mVar7, i26 | 48);
                        mVar7.f();
                    }
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                ps.r rVar3 = (ps.r) obj6;
                ps.n nVar2 = (ps.n) obj5;
                m mVar8 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar8.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var7 = p3.n.f135158a;
                    r0.g(R.string.device_screen_activity, mVar8, 0);
                    r.a aVar8 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    c2.l.f(x2.h(aVar8, eVar3.f97918c), mVar8);
                    r0.a(rVar3, nVar2, mVar8, ps.r.f140175t | (ps.n.f139941b << 3));
                    c2.l.f(x2.h(aVar8, eVar3.f97920e), mVar8);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 6:
                x3 x3Var3 = (x3) obj6;
                zo1.q qVar = (zo1.q) obj5;
                m mVar9 = (m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar9.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var8 = p3.n.f135158a;
                    g3 g3Var = (g3) x3Var3.getF182175a();
                    if (g3Var != null && (aVar = (v60.a) g3Var.f35301b) != null) {
                        str = aVar.f175793b;
                    }
                    boolean zR2 = mVar9.r(qVar);
                    Object objQ6 = mVar9.q();
                    if (zR2) {
                        objQ6 = new zo1.j(qVar, i17);
                        mVar9.K(objQ6);
                    } else {
                        aVar2.getClass();
                        if (objQ6 == m.a.f135155b) {
                            objQ6 = new zo1.j(qVar, i17);
                            mVar9.K(objQ6);
                        }
                    }
                    ap1.a.a(0, (e23.a) objQ6, str, mVar9);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            default:
                zu1.k kVar2 = (zu1.k) obj6;
                p1<hv1.c> p1Var2 = (p1) obj5;
                m mVar10 = (m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                zu1.k.a aVar9 = zu1.k.f207122d;
                ((e2.d) obj).getClass();
                if (mVar10.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var9 = p3.n.f135158a;
                    kVar2.v6(p1Var2, mVar10, 6);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
        }
    }
}
