package c50;

import a03.n0;
import android.content.Context;
import android.content.DialogInterface;
import b63.o;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import c62.g1;
import ca0.b1;
import ca0.b2;
import ca0.t1;
import ca0.z1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.ui.ElectronicShiftingDataActivity;
import com.garmin.android.apps.connectmobile.workouts.data.model.j0;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.fragment.FitPayAddressManagementFragment;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import cw1.v1;
import e23.l;
import e23.p;
import gl1.y;
import h5.e0;
import i3.mc;
import i3.mh;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l72.i3;
import l90.k;
import lc.m0;
import lc.u0;
import o4.d0;
import o4.m1;
import o53.s0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import r53.p2;
import s5.x0;
import ta0.x;
import u1.a2;
import w5.f0;
import w52.r;
import ww1.a0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24501d;

    public /* synthetic */ f(Object obj, int i14, Object obj2, Object obj3) {
        this.f24498a = i14;
        this.f24499b = obj;
        this.f24500c = obj2;
        this.f24501d = obj3;
    }

    private final Object a(Object obj, Object obj2) {
        int i14;
        f11.a aVar = (f11.a) this.f24499b;
        Context context = (Context) this.f24500c;
        p1 p1Var = (p1) this.f24501d;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            f11.a.b bVar = aVar.f67881a;
            if (bVar instanceof f11.a.b.C1410a) {
                i14 = R.string.create_food;
            } else {
                if (!(bVar instanceof f11.a.b.C1411b)) {
                    u0.r();
                    return null;
                }
                i14 = R.string.edit_food;
            }
            String strQ = y.Q(mVar, i14);
            Object objQ = mVar.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new dv0.f(p1Var, 6);
                mVar.K(objQ);
            }
            e23.a aVar2 = (e23.a) objQ;
            i53.f fVarA = i53.a.a(new i3("SAVE_FOOD", y.Q(mVar, R.string.lbl_save), false, (u4.d) null, (String) null, 28, (j) null));
            boolean zR = mVar.r(aVar) | mVar.r(context);
            Object objQ2 = mVar.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new cn1.d(26, aVar, context);
                mVar.K(objQ2);
            }
            z02.f.e(strQ, null, aVar2, fVarA, (l) objQ2, mVar, 265216);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:149:0x0529  */
    /* JADX WARN: Code duplicated, block: B:157:0x0569  */
    /* JADX WARN: Code duplicated, block: B:91:0x02d2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        ArrayList arrayList;
        int i14;
        int i15;
        String strH;
        d11.c cVar;
        int i16 = this.f24498a;
        int i17 = 18;
        m.a aVar = m.f135153a;
        int i18 = 2;
        boolean z14 = false;
        final int i19 = 1;
        Object obj4 = this.f24501d;
        Object obj5 = this.f24500c;
        Object obj6 = this.f24499b;
        switch (i16) {
            case 0:
                ((Integer) obj2).getClass();
                g.a((e50.c) obj6, (l) obj5, (l) obj4, (m) obj, p0.t(385));
                return Unit.INSTANCE;
            case 1:
                g1 g1Var = (g1) obj6;
                com.garmin.android.apps.connectmobile.workouts.presentation.details.e eVar = (com.garmin.android.apps.connectmobile.workouts.presentation.details.e) obj5;
                j0 j0Var = (j0) obj4;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r.b(g1Var, eVar.getF24782e(), j0Var, mVar, j0.R0 << 6);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                h82.r rVar = (h82.r) obj6;
                Context context = (Context) obj5;
                c70.c cVar2 = (c70.c) obj4;
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i24 = c70.c.f25219f;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    rVar.t(R.string.lbl_understanding_cycling_ability, mVar2, 0);
                    String strQ = y.Q(mVar2, R.string.lbl_cycling_ability_help_paragraph_1);
                    Object objQ = mVar2.q();
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new c63.n(i17);
                        mVar2.K(objQ);
                    }
                    rVar.p(strQ, oi0.c.A(context, (l) objQ, strQ), mVar2, 0);
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    h4.r rVarC = c2.l.C(aVar2, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
                    j23.l lVar = new j23.l(90, 100);
                    String strQ2 = y.Q(mVar2, R.string.hrv_stress_level_very_high);
                    int i25 = h82.c.f82429e << 9;
                    cVar2.g(rVarC, lVar, strQ2, mVar2, i25);
                    cVar2.g(c2.l.C(aVar2, 0.0f, eVar2.f97918c, 0.0f, 0.0f, 13), new j23.l(60, 89), y.Q(mVar2, R.string.hrv_stress_level_high), mVar2, i25);
                    cVar2.g(c2.l.C(aVar2, 0.0f, eVar2.f97918c, 0.0f, 0.0f, 13), new j23.l(30, 69), y.Q(mVar2, R.string.hrv_stress_level_moderate), mVar2, i25);
                    cVar2.g(c2.l.C(aVar2, 0.0f, eVar2.f97918c, 0.0f, 0.0f, 13), new j23.l(0, 29), y.Q(mVar2, R.string.hrv_stress_level_low), mVar2, i25);
                    rVar.o(R.string.lbl_cycling_ability_help_paragraph_1_3, 0, 2, null, mVar2);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                c70.g.a((c70.i) obj6, (e23.a) obj5, (e23.a) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                p pVar = (p) obj6;
                m0 m0Var = (m0) obj5;
                t1 t1Var = (t1) obj4;
                x xVar = (x) obj;
                k kVar = (k) obj2;
                xVar.getClass();
                kVar.getClass();
                String str = kVar.f111578b;
                String str2 = kVar.f111581e;
                l90.b bVar = kVar.f111582f;
                l90.i iVar = bVar.f111529n;
                if (iVar != null) {
                    pVar.invoke(iVar, bVar);
                } else if (str2 != null) {
                    lc.y.l(m0Var, new b1.j(kVar, str2));
                } else if (kVar.f111580d) {
                    lc.y.l(m0Var, new b1.e(bVar, str));
                } else {
                    str.getClass();
                    bm2.a aVar3 = xVar.A.get(str);
                    if (aVar3 != null) {
                        t1Var.invoke(new q90.d.a(aVar3, kVar.f111582f, null, 4, null));
                    }
                }
                return Unit.INSTANCE;
            case 5:
                m0 m0Var2 = (m0) obj6;
                x80.e eVar3 = (x80.e) obj5;
                q90.d.a aVar4 = (q90.d.a) obj4;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                if (zBooleanValue) {
                    if (aVar4 != null) {
                        eVar3.getClass();
                        eVar3.f189519w = aVar4;
                        obj3 = z1.l.INSTANCE;
                    } else {
                        obj3 = z1.f.INSTANCE;
                    }
                    m0Var2.h(zf.b.g(m0Var2), obj3);
                } else if (zBooleanValue2) {
                    m0Var2.h(zf.b.G(m0Var2), eVar3.A4(b2.CONSENT));
                } else {
                    lc.y.l(m0Var2, eVar3.A4(b2.CONSENT));
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                cb0.b.a((o) obj6, (l) obj5, (e23.a) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                cd1.d.a((ad1.b) obj6, (String) obj5, (String) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                cg2.b.a((h4.r) obj6, (List) obj5, (List) obj4, (m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                cn1.k.a((h4.r) obj6, (qm1.k) obj5, (String) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                cp1.e.d((i53.c) obj6, (mc) obj5, (e23.a) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 11:
                FitPayAddressManagementFragment fitPayAddressManagementFragment = (FitPayAddressManagementFragment) obj6;
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                FitPayAddressManagementFragment.b bVar2 = FitPayAddressManagementFragment.f51413t;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                yq2.a aVar5 = fitPayAddressManagementFragment.f51423i;
                if (aVar5 == null) {
                    s.m(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                    throw null;
                }
                aVar5.x(true);
                fitPayAddressManagementFragment.z6().A4(str3, str4);
                fitPayAddressManagementFragment.z6().f126259k.f(fitPayAddressManagementFragment.getViewLifecycleOwner(), new FitPayAddressManagementFragment.e(new cp2.b(fitPayAddressManagementFragment, i18)));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                cq0.r.b((String) obj6, (String) obj5, (List) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                ElectronicShiftingDataActivity.a aVar6 = ElectronicShiftingDataActivity.f29955b;
                ((ElectronicShiftingDataActivity) obj6).da((ArrayList) obj5, (e23.a) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 14:
                ArrayList arrayList2 = (ArrayList) obj6;
                ElectronicShiftingDataActivity electronicShiftingDataActivity = (ElectronicShiftingDataActivity) obj5;
                p1 p1Var = (p1) obj4;
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ElectronicShiftingDataActivity.a aVar7 = ElectronicShiftingDataActivity.f29955b;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    h4.r.a aVar8 = h4.r.S;
                    h4.r rVarD = c2.l.D(a2.b(aVar8, a2.a(mVar3), true));
                    long jE = vb.h.e(d92.b.f58623a, mVar3);
                    m1.a aVar9 = m1.f128891a;
                    h4.r rVarE = u1.n.e(rVarD, jE, aVar9);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = c2.y.a(kVar2, h4.d.a.f81536n, mVar3, 0);
                    int iHashCode = Long.hashCode(mVar3.getU());
                    i2 i2VarX = mVar3.x();
                    h4.r rVarC2 = h4.k.c(rVarE, mVar3);
                    h5.g.V.getClass();
                    e0.a aVar10 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar10);
                    } else {
                        mVar3.c();
                    }
                    h5.g.a.e eVar4 = h5.g.a.f81810g;
                    b4.c(eVar4, zVarA, mVar3);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar3);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar3);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC2, mVar3);
                    b0 b0Var = b0.f22601a;
                    h4.r rVarF = x2.f(u1.n.e(aVar8, d92.b.a(mVar3).c().b(), aVar9), 1.0f);
                    s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, mVar3, 0);
                    int iHashCode2 = Long.hashCode(mVar3.getU());
                    i2 i2VarX2 = mVar3.x();
                    h4.r rVarC3 = h4.k.c(rVarF, mVar3);
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar10);
                    } else {
                        mVar3.c();
                    }
                    b4.c(eVar4, s2VarA, mVar3);
                    b4.c(c1623g, i2VarX2, mVar3);
                    if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar3, iHashCode2, bVar3);
                    }
                    b4.c(fVar, rVarC3, mVar3);
                    u2 u2Var = u2.f22900a;
                    String strQ3 = y.Q(mVar3, R.string.lbl_time_in_gear);
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97930g;
                    f0.f182097b.getClass();
                    f0 f0Var = f0.f182104i;
                    d92.b.f58625c.getClass();
                    mh.c(strQ3, c2.l.y(aVar8, j92.b.f97899b.f97920e), 0L, null, 0L, f0Var, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar3, 1572864, 0, 131004);
                    mVar3.y();
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj7 : arrayList2) {
                        if (hashSet.add(Integer.valueOf(((to.m) obj7).f165817a))) {
                            arrayList3.add(obj7);
                        }
                    }
                    if (arrayList3.size() > 1) {
                        mVar3.C(965176213);
                        String strQ4 = y.Q(mVar3, R.string.lbl_front_rings);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0Var2 = j92.f.f97931h;
                        f0.f182097b.getClass();
                        f0 f0Var2 = f0.f182104i;
                        h4.r.a aVar11 = h4.r.S;
                        d92.b.f58625c.getClass();
                        j92.e eVar5 = j92.b.f97899b;
                        mh.c(strQ4, c2.l.C(aVar11, eVar5.f97920e, eVar5.f97918c, 0.0f, eVar5.f97921f, 4), 0L, null, 0L, f0Var2, 0L, null, 0L, 0, false, 0, 0, null, x0Var2, mVar3, 1572864, 0, 131004);
                        List<to.m> listN0 = h0.N0(arrayList3, new cr.i());
                        mVar3.C(585341697);
                        for (to.m mVar4 : listN0) {
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj8 : arrayList2) {
                                if (mVar4.f165817a == ((to.m) obj8).f165817a) {
                                    arrayList4.add(obj8);
                                }
                            }
                            Iterator it = arrayList4.iterator();
                            double d14 = 0.0d;
                            while (it.hasNext()) {
                                d14 += (double) ((to.m) it.next()).f165819c;
                            }
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj9 : arrayList2) {
                                if (mVar4.f165817a == ((to.m) obj9).f165817a) {
                                    arrayList5.add(obj9);
                                }
                            }
                            Iterator it3 = arrayList5.iterator();
                            double d15 = 0.0d;
                            while (it3.hasNext()) {
                                d15 += ((to.m) it3.next()).f165821e;
                            }
                            electronicShiftingDataActivity.ea(new to.m(mVar4.f165817a, -1, (float) d14, -1.0f, d15), mVar3, 0);
                        }
                        mVar3.f();
                        h4.r.a aVar12 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        c2.l.f(u1.n.e(x2.f(x2.h(aVar12, j92.b.f97899b.f97920e), 1.0f), d92.b.a(mVar3).c().b(), m1.f128891a), mVar3);
                        mVar3.f();
                    } else {
                        mVar3.C(966501432);
                        mVar3.f();
                    }
                    String strQ5 = y.Q(mVar3, R.string.lbl_gear_pairings);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var3 = j92.f.f97931h;
                    f0.f182097b.getClass();
                    f0 f0Var3 = f0.f182104i;
                    h4.r.a aVar13 = h4.r.S;
                    d92.b.f58625c.getClass();
                    j92.e eVar6 = j92.b.f97899b;
                    float f14 = eVar6.f97918c;
                    mh.c(strQ5, c2.l.C(aVar13, eVar6.f97920e, f14, 0.0f, f14, 4), 0L, null, 0L, f0Var3, 0L, null, 0L, 0, false, 0, 0, null, x0Var3, mVar3, 1572864, 0, 131004);
                    Object objQ2 = mVar3.q();
                    aVar.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ2 == c2565a) {
                        objQ2 = p0.n(p13.x.k(electronicShiftingDataActivity.getString(R.string.lbl_chaing_ring), electronicShiftingDataActivity.getString(R.string.lbl_ratio), electronicShiftingDataActivity.getString(R.string.lbl_time_high_low), electronicShiftingDataActivity.getString(R.string.lbl_time_low_high)));
                        mVar3.K(objQ2);
                    }
                    p1 p1Var2 = (p1) objQ2;
                    Object objQ3 = mVar3.q();
                    if (objQ3 == c2565a) {
                        objQ3 = p0.n(h0.b0((List) p1Var2.getF182175a()));
                        mVar3.K(objQ3);
                    }
                    p1 p1Var3 = (p1) objQ3;
                    String strQ6 = y.Q(mVar3, R.string.lbl_sort);
                    List list = (List) p1Var2.getF182175a();
                    String str5 = (String) p1Var3.getF182175a();
                    boolean zR = mVar3.r(arrayList2);
                    Object objQ4 = mVar3.q();
                    if (zR || objQ4 == c2565a) {
                        arrayList = arrayList2;
                        n0 n0Var = new n0(arrayList, p1Var3, p1Var2, p1Var, 18);
                        mVar3.K(n0Var);
                        objQ4 = n0Var;
                    } else {
                        arrayList = arrayList2;
                    }
                    cr.g.a(null, strQ6, list, str5, (l) objQ4, mVar3, 0);
                    boolean zR2 = mVar3.r(arrayList);
                    Object objQ5 = mVar3.q();
                    if (zR2 || objQ5 == c2565a) {
                        objQ5 = new cr.h(arrayList, p1Var, null);
                        mVar3.K(objQ5);
                    }
                    l0.e((p) objQ5, arrayList, mVar3);
                    mVar3.C(585446449);
                    Iterator it4 = ((List) p1Var.getF182175a()).iterator();
                    while (it4.hasNext()) {
                        electronicShiftingDataActivity.ea((to.m) it4.next(), mVar3, 0);
                    }
                    mVar3.f();
                    mVar3.y();
                    x1 x1Var4 = n.f135158a;
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                v1.f((hv1.i) obj6, (l) obj5, (e23.a) obj4, (m) obj, p0.t(385));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                v1.d((hv1.f) obj6, (l) obj5, (e23.a) obj4, (m) obj, p0.t(385));
                return Unit.INSTANCE;
            case 17:
                final e21.a aVar14 = (e21.a) obj6;
                p1 p1Var4 = (p1) obj5;
                l22.a aVar15 = (l22.a) obj4;
                m mVar5 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    h4.r.a aVar16 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC4 = c2.l.C(aVar16, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar3 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA2 = c2.y.a(kVar3, h4.d.a.f81536n, mVar5, 0);
                    int iHashCode3 = Long.hashCode(mVar5.getU());
                    i2 i2VarX3 = mVar5.x();
                    h4.r rVarC5 = h4.k.c(rVarC4, mVar5);
                    h5.g.V.getClass();
                    e0.a aVar17 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar17);
                    } else {
                        mVar5.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar5);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar5);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar5.getT() || !s.g(mVar5.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar5, iHashCode3, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC5, mVar5);
                    b0 b0Var2 = b0.f22601a;
                    if (((e21.a.d) p1Var4.getF182175a()).f62621a.f35300a == fw.p.ERROR) {
                        mVar5.C(-1752225758);
                        boolean zR3 = mVar5.r(aVar14);
                        Object objQ6 = mVar5.q();
                        if (zR3) {
                            final int i26 = z14 ? 1 : 0;
                            objQ6 = new e23.a() { // from class: d21.b
                                @Override // e23.a
                                public final Object invoke() {
                                    int i27 = i26;
                                    e21.a aVar18 = aVar14;
                                    switch (i27) {
                                        case 0:
                                            w9.a aVarA = androidx.lifecycle.v1.a(aVar18);
                                            x53.c cVar3 = s0.f129406a;
                                            ge1.b.T(aVarA, x53.b.f189152a, null, new e21.b(aVar18, null), 2);
                                            break;
                                        default:
                                            w9.a aVarA2 = androidx.lifecycle.v1.a(aVar18);
                                            x53.c cVar4 = s0.f129406a;
                                            ge1.b.T(aVarA2, x53.b.f189152a, null, new e21.c(aVar18, null), 2);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar5.K(objQ6);
                        } else {
                            aVar.getClass();
                            if (objQ6 == m.a.f135155b) {
                                final int i27 = z14 ? 1 : 0;
                                objQ6 = new e23.a() { // from class: d21.b
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i28 = i27;
                                        e21.a aVar18 = aVar14;
                                        switch (i28) {
                                            case 0:
                                                w9.a aVarA = androidx.lifecycle.v1.a(aVar18);
                                                x53.c cVar3 = s0.f129406a;
                                                ge1.b.T(aVarA, x53.b.f189152a, null, new e21.b(aVar18, null), 2);
                                                break;
                                            default:
                                                w9.a aVarA2 = androidx.lifecycle.v1.a(aVar18);
                                                x53.c cVar4 = s0.f129406a;
                                                ge1.b.T(aVarA2, x53.b.f189152a, null, new e21.c(aVar18, null), 2);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar5.K(objQ6);
                            }
                        }
                        y01.s.a(null, (e23.a) objQ6, mVar5, 0, 1);
                        mVar5.f();
                    } else if (((e21.a.d) p1Var4.getF182175a()).f62622b instanceof e21.d.a) {
                        mVar5.C(-1752074788);
                        String strQ7 = y.Q(mVar5, R.string.common_save_error_title);
                        boolean zR4 = mVar5.r(aVar14);
                        Object objQ7 = mVar5.q();
                        if (zR4) {
                            objQ7 = new e23.a() { // from class: d21.b
                                @Override // e23.a
                                public final Object invoke() {
                                    int i28 = i19;
                                    e21.a aVar18 = aVar14;
                                    switch (i28) {
                                        case 0:
                                            w9.a aVarA = androidx.lifecycle.v1.a(aVar18);
                                            x53.c cVar3 = s0.f129406a;
                                            ge1.b.T(aVarA, x53.b.f189152a, null, new e21.b(aVar18, null), 2);
                                            break;
                                        default:
                                            w9.a aVarA2 = androidx.lifecycle.v1.a(aVar18);
                                            x53.c cVar4 = s0.f129406a;
                                            ge1.b.T(aVarA2, x53.b.f189152a, null, new e21.c(aVar18, null), 2);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar5.K(objQ7);
                        } else {
                            aVar.getClass();
                            if (objQ7 == m.a.f135155b) {
                                objQ7 = new e23.a() { // from class: d21.b
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i28 = i19;
                                        e21.a aVar18 = aVar14;
                                        switch (i28) {
                                            case 0:
                                                w9.a aVarA = androidx.lifecycle.v1.a(aVar18);
                                                x53.c cVar3 = s0.f129406a;
                                                ge1.b.T(aVarA, x53.b.f189152a, null, new e21.b(aVar18, null), 2);
                                                break;
                                            default:
                                                w9.a aVarA2 = androidx.lifecycle.v1.a(aVar18);
                                                x53.c cVar4 = s0.f129406a;
                                                ge1.b.T(aVarA2, x53.b.f189152a, null, new e21.c(aVar18, null), 2);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar5.K(objQ7);
                            }
                        }
                        y01.s.a(strQ7, (e23.a) objQ7, mVar5, 0, 0);
                        mVar5.f();
                    } else if (((e21.a.d) p1Var4.getF182175a()).f62621a.f35300a == fw.p.SUCCESS) {
                        mVar5.C(-1751794021);
                        boolean zB = mVar5.B(p1Var4) | mVar5.r(aVar15) | mVar5.r(aVar14);
                        Object objQ8 = mVar5.q();
                        if (zB) {
                            objQ8 = new ci0.b(p1Var4, 4, aVar15, aVar14);
                            mVar5.K(objQ8);
                        } else {
                            aVar.getClass();
                            if (objQ8 == m.a.f135155b) {
                                objQ8 = new ci0.b(p1Var4, 4, aVar15, aVar14);
                                mVar5.K(objQ8);
                            }
                        }
                        e2.c.b(null, null, null, null, null, null, false, null, (l) objQ8, mVar5, 0, 511);
                        mVar5.f();
                    } else {
                        mVar5.C(-1750794147);
                        mVar5.f();
                    }
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 18:
                hz.d dVar = (hz.d) obj6;
                hz.d dVar2 = (hz.d) obj5;
                hz.d dVar3 = (hz.d) obj4;
                m mVar6 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    if (dVar == null) {
                        mVar6.C(-970063709);
                        mVar6.f();
                    } else {
                        float f15 = dVar.f86389b;
                        mVar6.C(-970063708);
                        int i28 = (int) f15;
                        String strQ8 = y.Q(mVar6, i61.a.b(i28));
                        gl.c.f77766a.getClass();
                        m92.y.b(d0.a(gl.c.a(mVar6).k()), String.valueOf(i28), null, null, strQ8, null, mVar6, 384, 40);
                        mVar6.f();
                    }
                    if (dVar2 == null) {
                        mVar6.C(-969684765);
                        mVar6.f();
                    } else {
                        float f16 = dVar2.f86389b;
                        mVar6.C(-969684764);
                        int i29 = (int) f16;
                        String strQ9 = y.Q(mVar6, i61.a.b(i29));
                        gl.c.f77766a.getClass();
                        m92.y.b(d0.a(gl.c.a(mVar6).i()), String.valueOf(i29), null, null, strQ9, null, mVar6, 384, 40);
                        mVar6.f();
                    }
                    if (dVar3 == null) {
                        mVar6.C(-969304891);
                        mVar6.f();
                    } else {
                        float f17 = dVar3.f86389b;
                        mVar6.C(-969304890);
                        int i30 = (int) f17;
                        String strQ10 = y.Q(mVar6, i61.a.b(i30));
                        gl.c.f77766a.getClass();
                        m92.y.b(d0.a(gl.c.a(mVar6).o()), String.valueOf(i30), null, null, strQ10, null, mVar6, 384, 40);
                        mVar6.f();
                    }
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                d70.o.c((h4.r) obj6, (d70.k) obj5, (a0) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                d81.g.a((o) obj6, (i81.a) obj5, (e23.a) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 21:
                i81.a aVar18 = (i81.a) obj6;
                e23.a aVar19 = (e23.a) obj5;
                Context context2 = (Context) obj4;
                m mVar7 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    if (aVar18.f92257g) {
                        i14 = -2045543287;
                        i15 = R.string.lbl_endurance_stamina_title;
                    } else {
                        i14 = -2045540703;
                        i15 = R.string.lbl_endurance_score;
                    }
                    String strH2 = sn.a.h(mVar7, i14, i15, mVar7);
                    i53.f fVarA = i53.a.a(new i3("Help", y.Q(mVar7, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (j) null));
                    boolean zR5 = mVar7.r(aVar18) | mVar7.r(context2);
                    Object objQ9 = mVar7.q();
                    if (zR5) {
                        objQ9 = new cn1.d(i17, aVar18, context2);
                        mVar7.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == m.a.f135155b) {
                            objQ9 = new cn1.d(i17, aVar18, context2);
                            mVar7.K(objQ9);
                        }
                    }
                    z02.f.d(strH2, null, null, aVar19, fVarA, null, (l) objQ9, mVar7, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                d81.h0.c((g81.n0) obj6, (m92.p0) obj5, (e23.a) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                da0.z.d((i53.f) obj6, (mc) obj5, (e23.a) obj4, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 24:
                String str6 = (String) obj6;
                fd1.e eVar7 = (fd1.e) obj5;
                i53.c cVar3 = (i53.c) obj4;
                m mVar8 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    h4.r.a aVar20 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar8 = j92.b.f97899b;
                    h4.r rVarA = c2.l.A(aVar20, eVar8.f97919d, 0.0f, 2);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar4 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA3 = c2.y.a(kVar4, h4.d.a.f81536n, mVar8, 0);
                    int iHashCode4 = Long.hashCode(mVar8.getU());
                    i2 i2VarX4 = mVar8.x();
                    h4.r rVarC6 = h4.k.c(rVarA, mVar8);
                    h5.g.V.getClass();
                    e0.a aVar21 = h5.g.a.f81805b;
                    if (mVar8.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar21);
                    } else {
                        mVar8.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar8);
                    b4.c(h5.g.a.f81809f, i2VarX4, mVar8);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar8.getT() || !s.g(mVar8.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar8, iHashCode4, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC6, mVar8);
                    b0 b0Var3 = b0.f22601a;
                    g6.f.a aVar22 = g6.f.f75994b;
                    h4.r rVarH = x2.h(x2.f(aVar20, 1.0f), 280);
                    if (str6 == null) {
                        strH = sn.a.h(mVar8, -86332562, R.string.lbl_pace, mVar8);
                    } else {
                        mVar8.C(1618695601);
                        mVar8.f();
                        strH = "";
                    }
                    cd1.d.b(eVar7, cVar3, rVarH, strH, mVar8, 384);
                    if (eVar7 == null || !eVar7.f70496g) {
                        mVar8.C(1619344309);
                        mVar8.f();
                    } else {
                        mVar8.C(1618797500);
                        cd1.e.a(c2.l.C(x2.f(aVar20, 1.0f), 0.0f, eVar7.f70490a == o82.g.f130859l ? eVar8.f97922g : eVar8.f97920e, 0.0f, 0.0f, 13), mVar8, 0);
                        mVar8.f();
                    }
                    mVar8.y();
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 25:
                h82.r rVar2 = (h82.r) obj6;
                ej0.b bVar6 = (ej0.b) obj5;
                Double d16 = (Double) obj4;
                m mVar9 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int i34 = dj0.h.f59916g;
                if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    l22.b bVar7 = bVar6.f64399a;
                    String strA = bVar6.a(d16, yi0.b.W_PER_KG);
                    strA.getClass();
                    rVar2.s(0, 2, bVar7.a(R.string.message_ccs_ftp_description, strA), null, mVar9);
                    rVar2.q(y.Q(mVar9, R.string.message_css_value_info_2), mVar9, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                dl0.h.a((zc.d) obj6, (e23.a) obj4, (l) obj5, (m) obj, p0.t(9));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                dt.e.a((zs.c) obj6, (e23.a) obj4, (l) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 28:
                return a(obj, obj2);
            default:
                f11.a aVar23 = (f11.a) obj5;
                p1 p1Var5 = (p1) obj4;
                a11.r rVar3 = (a11.r) obj;
                Double d17 = (Double) obj2;
                double dDoubleValue = d17.doubleValue();
                rVar3.getClass();
                ((e01.a) obj6).A(rVar3);
                p2 p2Var = aVar23.f67884d;
                d11.a aVar24 = (d11.a) p2Var.getValue();
                if (aVar24 != null && (cVar = aVar24.f57040a) != null) {
                    d11.c cVarA = d11.c.a(cVar, null, null, null, d17, null, null, null, 503);
                    d11.a aVar25 = (d11.a) p2Var.getValue();
                    p2Var.setValue(aVar25 != null ? d11.a.a(aVar25, cVarA, null, 14) : null);
                    aVar23.x4(v01.c.MISSING_SERVING_SIZE);
                    if (0.001d <= dDoubleValue && dDoubleValue <= 99999.999d) {
                        aVar23.x4(v01.c.INVALID_SERVING_SIZE);
                    }
                }
                p1Var5.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f(Object obj, e23.a aVar, l lVar, int i14, int i15) {
        this.f24498a = i15;
        this.f24499b = obj;
        this.f24501d = aVar;
        this.f24500c = lVar;
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i14, int i15) {
        this.f24498a = i15;
        this.f24499b = obj;
        this.f24500c = obj2;
        this.f24501d = obj3;
    }
}
