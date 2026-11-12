package xk1;

import android.content.Context;
import b5.a0;
import c2.b0;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.timinggates.TimingGatesActivity;
import com.garmin.android.apps.connectmobile.consent.ChildConsentsFlowActivity;
import com.garmin.android.apps.connectmobile.settings.usersettings.stride.StrideLengthSettingsActivity;
import com.garmin.proto.generated.GDIInReachMessaging;
import f5.d0;
import gl1.y;
import h5.e0;
import i3.fe;
import i3.mc;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l72.f0;
import l72.i3;
import l72.j0;
import l72.p2;
import l72.u0;
import lc.m0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.o0;
import p005kotlin.jvm.internal.q0;
import p008y1.h3;
import p008y1.y1;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.m1;
import p3.n1;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import r53.d2;
import s5.x0;
import u1.a2;
import v62.o1;
import z10.c0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f191220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f191221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f191222d;

    public /* synthetic */ e(Object obj, int i14, Object obj2, Object obj3) {
        this.f191219a = i14;
        this.f191220b = obj;
        this.f191221c = obj2;
        this.f191222d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x0472  */
    /* JADX WARN: Code duplicated, block: B:13:0x005e  */
    /* JADX WARN: Code duplicated, block: B:140:0x0495  */
    /* JADX WARN: Code duplicated, block: B:209:0x073d  */
    /* JADX WARN: Code duplicated, block: B:235:0x0829  */
    /* JADX WARN: Code duplicated, block: B:255:0x08e4  */
    /* JADX WARN: Code duplicated, block: B:91:0x0314  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m mVar;
        int i14 = this.f191219a;
        p3.m.a aVar = p3.m.f135153a;
        boolean z14 = false;
        Object obj3 = this.f191222d;
        Object obj4 = this.f191221c;
        Object obj5 = this.f191220b;
        switch (i14) {
            case 0:
                h82.r rVar = (h82.r) obj5;
                f fVar = (f) obj4;
                Object obj6 = (Context) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i15 = f.f191223j;
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    rVar.t(R.string.hr_zones_help_adjust_hr_zones, mVar2, 0);
                    rVar.o(R.string.hr_zones_help_adjusting_hr_zones_descr, 0, 2, null, mVar2);
                    if (fVar.f191225g) {
                        mVar2.C(-1466827683);
                        Long l14 = fVar.f191226h;
                        if (l14 == null) {
                            mVar2.C(1772982084);
                            mVar2.f();
                            mVar = mVar2;
                        } else {
                            mVar2.C(1772982085);
                            long jLongValue = l14.longValue();
                            h4.r.a aVar2 = h4.r.S;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            c2.l.f(x2.h(aVar2, j92.b.f97899b.f97920e), mVar2);
                            p2 p2Var = p2.f111205a;
                            String strQ = y.Q(mVar2, R.string.update_hr_zones);
                            boolean zR = mVar2.r(fVar) | mVar2.r(obj6) | mVar2.l(jLongValue);
                            Object objQ = mVar2.q();
                            if (zR) {
                                Object sVar = new d62.s(fVar, obj6, jLongValue, 9);
                                mVar2.K(sVar);
                                objQ = sVar;
                            } else {
                                aVar.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    Object sVar2 = new d62.s(fVar, obj6, jLongValue, 9);
                                    mVar2.K(sVar2);
                                    objQ = sVar2;
                                }
                            }
                            p2Var.g(strQ, null, null, null, null, false, false, (e23.a) objQ, mVar2, 0, 254);
                            mVar = mVar2;
                            rVar.o(R.string.update_hr_zones_on_device_or_connect, 0, 2, null, mVar);
                            mVar.f();
                        }
                        mVar.f();
                    } else {
                        mVar2.C(1773403561);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 1:
                dy1.g gVar = (dy1.g) obj5;
                e23.a aVar3 = (e23.a) obj4;
                e23.a aVar4 = (e23.a) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String str = gVar.f61554a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = o1.a(t62.b.f162798a);
                    i53.f fVarA = i53.a.a(new i3("save", y.Q(mVar3, R.string.lbl_save), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zB = mVar3.B(aVar4);
                    Object objQ2 = mVar3.q();
                    if (zB) {
                        objQ2 = new xx1.d(aVar4, 0);
                        mVar3.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new xx1.d(aVar4, 0);
                            mVar3.K(objQ2);
                        }
                    }
                    z02.f.d(str, null, dVarA, aVar3, fVarA, null, (e23.l) objQ2, mVar3, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 82);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 2:
                Integer num = (Integer) obj5;
                e23.a aVar5 = (e23.a) obj4;
                e23.l lVar = (e23.l) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar6 = h4.r.S;
                    h4.r rVarD = x2.d(aVar6, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar4, 0);
                    int iHashCode = Long.hashCode(mVar4.getU());
                    i2 i2VarX = mVar4.x();
                    h4.r rVarC = h4.k.c(rVarD, mVar4);
                    h5.g.V.getClass();
                    e0.a aVar7 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar7);
                    } else {
                        mVar4.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA, mVar4);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar4);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar4, iHashCode, bVar);
                    }
                    h5.g.a.f fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC, mVar4);
                    h4.r rVarB = a2.b(b0.f22601a.a(aVar6, 1.0f, true), a2.a(mVar4), true);
                    z zVarA2 = c2.y.a(kVar, h4.d.a.f81537o, mVar4, 48);
                    int iHashCode2 = Long.hashCode(mVar4.getU());
                    i2 i2VarX2 = mVar4.x();
                    h4.r rVarC2 = h4.k.c(rVarB, mVar4);
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar7);
                    } else {
                        mVar4.c();
                    }
                    b4.c(eVar, zVarA2, mVar4);
                    b4.c(c1623g, i2VarX2, mVar4);
                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar4, iHashCode2, bVar);
                    }
                    b4.c(fVar2, rVarC2, mVar4);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY = c2.l.y(aVar6, j92.b.f97899b.f97921f);
                    String strQ2 = y.Q(mVar4, R.string.lbl_stp_set_number_of_workouts_message);
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97931h, mVar4);
                    d6.h.f57752b.getClass();
                    mh.c(strQ2, rVarY, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar4, 0, 0, 130044);
                    mVar4.C(-308246458);
                    int i16 = 0;
                    while (i16 < 5) {
                        i16++;
                        String strValueOf = String.valueOf(i16);
                        boolean z15 = num != null && num.intValue() == i16;
                        boolean zB2 = mVar4.B(lVar) | mVar4.k(i16);
                        Object objQ3 = mVar4.q();
                        if (zB2) {
                            objQ3 = new e51.g(lVar, i16, 2);
                            mVar4.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new e51.g(lVar, i16, 2);
                                mVar4.K(objQ3);
                            }
                        }
                        qx1.m.a(strValueOf, z15, null, false, null, false, false, (e23.l) objQ3, mVar4, 0, 124);
                    }
                    mVar4.f();
                    mVar4.y();
                    f0 f0Var = f0.f110999a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    f0Var.d(0, 1, aVar5, c2.l.C(c2.l.A(rVarF, eVar2.f97920e, 0.0f, 2), 0.0f, eVar2.f97920e, 0.0f, eVar2.f97921f, 5), y.Q(mVar4, R.string.lbl_next), mVar4, null, num != null && num.intValue() > 0);
                    mVar4.y();
                    x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                xy0.b.a((xy0.c) obj5, (e23.l) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                y02.a.a((e23.a) obj5, (h4.r) obj4, (e23.p) obj3, (p3.m) obj, p0.t(385));
                return Unit.INSTANCE;
            case 5:
                p008y1.p0 p0Var = (p008y1.p0) obj5;
                q0 q0Var = (q0) obj4;
                c5.e eVar3 = (c5.e) obj3;
                a0 a0Var = (a0) obj;
                n4.c cVar = (n4.c) obj2;
                long jF = d0.f(h5.k.f(p0Var));
                if (!n4.c.d(jF, q0Var.f105808a)) {
                    p0Var.f193533v = n4.c.j(p0Var.f193533v, n4.c.i(jF, q0Var.f105808a));
                }
                q0Var.f105808a = jF;
                c5.f.a(eVar3, a0Var, p0Var.f193533v);
                q53.b bVar2 = p0Var.f193520g;
                if (bVar2 != null) {
                    q53.m.a(bVar2.i(new y1.e0.b(cVar.f123544a, false, null)));
                }
                return Unit.INSTANCE;
            case 6:
                o0 o0Var = (o0) obj5;
                h3 h3Var = (h3) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).floatValue();
                long j8 = h3Var.j(h3Var.f(fFloatValue - o0Var.f105806a));
                a5.j.f1233b.getClass();
                o0Var.f105806a += h3Var.f(h3Var.i(((y1) obj3).b(a5.j.f1234c, j8)));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                y12.f.a((ArrayList) obj5, (e23.l) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                y40.l.a((a50.g) obj5, (d2) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                y40.o.a((h4.r) obj5, (a50.f) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 10:
                n80.a aVar8 = (n80.a) obj5;
                ya0.g gVar2 = (ya0.g) obj4;
                Context context = (Context) obj3;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    h4.r.a aVar9 = h4.r.S;
                    h4.r rVarF2 = x2.f(aVar9, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA3 = c2.y.a(kVar2, h4.d.a.f81536n, mVar5, 0);
                    int iHashCode3 = Long.hashCode(mVar5.getU());
                    i2 i2VarX3 = mVar5.x();
                    h4.r rVarC3 = h4.k.c(rVarF2, mVar5);
                    h5.g.V.getClass();
                    e0.a aVar10 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar10);
                    } else {
                        mVar5.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar5);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar5);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar5.getT() || !p005kotlin.jvm.internal.s.g(mVar5.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar5, iHashCode3, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar5);
                    b0 b0Var = b0.f22601a;
                    String strQ3 = y.Q(mVar5, R.string.lbl_link_your_device);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    da0.a0.a(0, 12, c2.l.A(aVar9, j92.b.f97899b.f97920e, 0.0f, 2), strQ3, null, mVar5, null);
                    boolean zR2 = mVar5.r(gVar2) | mVar5.r(context);
                    Object objQ4 = mVar5.q();
                    if (zR2) {
                        objQ4 = new x9.b(18, gVar2, context);
                        mVar5.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new x9.b(18, gVar2, context);
                            mVar5.K(objQ4);
                        }
                    }
                    e23.l lVar2 = (e23.l) objQ4;
                    boolean zR3 = mVar5.r(gVar2) | mVar5.r(context);
                    Object objQ5 = mVar5.q();
                    if (zR3) {
                        objQ5 = new xr.a(13, gVar2, context);
                        mVar5.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new xr.a(13, gVar2, context);
                            mVar5.K(objQ5);
                        }
                    }
                    p80.c.a(aVar8, lVar2, (e23.a) objQ5, true, mVar5, n80.a.f124926e | 3072, 0);
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                ya0.p.b((l90.b) obj5, (e23.a) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 12:
                List list = (List) obj4;
                yg2.h hVar = (yg2.h) obj3;
                List list2 = (List) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                list2.getClass();
                ((p1) obj5).setValue(list2);
                if (!list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((j0) it.next()).f111076e) {
                            vf2.e eVar4 = (vf2.e) h0.e0(iIntValue5, list);
                            if (eVar4 != null) {
                                hVar.f196996d.k(null, eVar4);
                            }
                            hVar.A4();
                        }
                    }
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                yj0.e.a((e23.a) obj5, (yj0.f) obj4, (e23.p) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 14:
                StrideLengthSettingsActivity strideLengthSettingsActivity = (StrideLengthSettingsActivity) obj5;
                yk1.i iVar = (yk1.i) obj4;
                m0 m0Var = (m0) obj3;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                StrideLengthSettingsActivity.a aVar11 = StrideLengthSettingsActivity.f44198b;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    boolean zR4 = mVar6.r(m0Var);
                    Object objQ6 = mVar6.q();
                    if (zR4) {
                        objQ6 = new yk1.f(m0Var, z14 ? 1 : 0);
                        mVar6.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new yk1.f(m0Var, z14 ? 1 : 0);
                            mVar6.K(objQ6);
                        }
                    }
                    strideLengthSettingsActivity.da(iVar, (e23.l) objQ6, mVar6, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                StrideLengthSettingsActivity.a aVar12 = StrideLengthSettingsActivity.f44198b;
                ((StrideLengthSettingsActivity) obj5).ca((yk1.i) obj4, (String) obj3, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                StrideLengthSettingsActivity.a aVar13 = StrideLengthSettingsActivity.f44198b;
                ((StrideLengthSettingsActivity) obj5).da((yk1.i) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 17:
                in0.j jVar = (in0.j) obj5;
                un0.a aVar14 = (un0.a) obj4;
                nk0.l lVar3 = (nk0.l) obj3;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    yn0.k.c(jVar, aVar14, lVar3, mVar7, (un0.a.f172042b << 3) | 8);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                ((yp0.f) obj5).d((jp0.a) obj4, (h4.r) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                ((yp0.o) obj5).d((String) obj4, (String) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                TimingGatesActivity.a aVar15 = TimingGatesActivity.f29952c;
                ((TimingGatesActivity) obj5).ca((Double) obj4, (Double) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                yq0.a.a((h4.r) obj5, (tq0.c) obj4, (tq0.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                yq0.l.c((Map) obj5, (yq0.b) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 23:
                yt.h hVar2 = (yt.h) obj5;
                m1 m1Var = (m1) obj4;
                n1 n1Var = (n1) obj3;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int i17 = yt.h.f199301x;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    float floatValue = m1Var.getFloatValue();
                    int intValue = n1Var.getIntValue();
                    d92.b.f58623a.getClass();
                    zt.c.a(floatValue, intValue, x2.f(h4.r.S, 1.0f), d92.b.a(mVar8).f().f63508c, o4.d0.c(0.2f, d92.b.a(mVar8).f().f63508c, 14), 0.0f, hVar2.w6().f199344e.size(), 0.0f, mVar8, 384);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                w2.a0.c((Long) obj5, (m0) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 25:
                ChildConsentsFlowActivity childConsentsFlowActivity = (ChildConsentsFlowActivity) obj5;
                p1 p1Var = (p1) obj4;
                x3 x3Var = (x3) obj3;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ChildConsentsFlowActivity.a aVar16 = ChildConsentsFlowActivity.f32139f;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    if (ChildConsentsFlowActivity.b.f32145a[((c0) p1Var.getF182175a()).ordinal()] == 1) {
                        mVar9.C(1075846144);
                        childConsentsFlowActivity.da((z10.i2) x3Var.getF182175a(), mVar9, 0);
                        mVar9.f();
                    } else {
                        mVar9.C(-1008427488);
                        mVar9.f();
                    }
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                z41.h.a((o51.f) obj5, (fe) obj4, (e23.l) obj3, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 27:
                w20.b bVar4 = (w20.b) obj5;
                e23.l lVar4 = (e23.l) obj4;
                p1 p1Var2 = (p1) obj3;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
                    Object objQ7 = mVar10.q();
                    aVar.getClass();
                    if (objQ7 == p3.m.a.f135155b) {
                        objQ7 = new xq1.c(p1Var2, 17);
                        mVar10.K(objQ7);
                    }
                    z50.b.b(zBooleanValue, (e23.l) objQ7, bVar4, lVar4, mVar10, 48);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                zk1.c.a((StrideLengthSettingsActivity) obj5, (al1.a) obj4, (e23.l) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                o53.b0 b0Var2 = (o53.b0) obj5;
                mc mcVar = (mc) obj4;
                e23.a aVar17 = (e23.a) obj3;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    g6.f.a aVar18 = g6.f.f75994b;
                    h4.r rVarY2 = c2.l.y(h4.r.S, 8);
                    boolean zR5 = mVar11.r(b0Var2) | mVar11.B(mcVar) | mVar11.B(aVar17);
                    Object objQ8 = mVar11.q();
                    if (zR5) {
                        objQ8 = new eu.b(b0Var2, mcVar, aVar17, 16);
                        mVar11.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new eu.b(b0Var2, mcVar, aVar17, 16);
                            mVar11.K(objQ8);
                        }
                    }
                    u0.a(rVarY2, null, null, null, (e23.a) objQ8, mVar11, 6, 14);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i14, int i15) {
        this.f191219a = i15;
        this.f191220b = obj;
        this.f191221c = obj2;
        this.f191222d = obj3;
    }
}
