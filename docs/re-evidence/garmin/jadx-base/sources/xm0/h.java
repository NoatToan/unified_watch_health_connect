package xm0;

import am.z0;
import android.content.Context;
import android.content.DialogInterface;
import c2.b0;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.BloodPressureRemindersActivity;
import com.garmin.android.apps.connectmobile.consent.ChildConsentsFlowActivity;
import com.garmin.android.apps.connectmobile.consent.PrivacyPolicyConsentActivity;
import com.garmin.android.apps.connectmobile.consent.PrivacyPolicyConsentActivity.b;
import com.garmin.android.apps.connectmobile.consent.PrivacyPolicyConsentActivity.c;
import com.garmin.android.apps.connectmobile.g3;
import h5.e0;
import i3.i7;
import i3.mh;
import i3.n3;
import java.util.List;
import java.util.Locale;
import l72.f0;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.o0;
import p008y1.o2;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import s5.w0;
import s5.x0;
import v62.e1;
import yg2.l0;
import z10.c0;
import z10.q2;
import z10.r1;
import z10.z1;
import z2.h2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f191393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f191394c;

    public /* synthetic */ h(x3 x3Var, c80.s sVar) {
        this.f191392a = 15;
        this.f191394c = x3Var;
        this.f191393b = sVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0341  */
    /* JADX WARN: Code duplicated, block: B:116:0x039f  */
    /* JADX WARN: Code duplicated, block: B:121:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:18:0x0089  */
    /* JADX WARN: Code duplicated, block: B:221:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:235:0x084d  */
    /* JADX WARN: Code duplicated, block: B:240:0x0875  */
    /* JADX WARN: Code duplicated, block: B:251:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:48:0x0193  */
    /* JADX WARN: Code duplicated, block: B:53:0x01be  */
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
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String strH;
        Object obj3;
        Object obj4;
        int i14 = this.f191392a;
        w0 w0VarA = null;
        p3.m.a aVar = p3.m.f135153a;
        int i15 = 2;
        boolean z14 = false;
        final int i16 = 1;
        Object obj5 = this.f191394c;
        Object obj6 = this.f191393b;
        switch (i14) {
            case 0:
                i iVar = (i) obj6;
                x3 x3Var = (x3) obj5;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                i.a aVar2 = i.f191395n;
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    if (((v) x3Var.getF182175a()) != v.ALL) {
                        mVar.C(1741382746);
                        h4.r.a aVar3 = h4.r.S;
                        h4.r rVarD = x2.d(aVar3, 1.0f);
                        h4.d.f81522a.getClass();
                        h4.g.a aVar4 = h4.d.a.f81537o;
                        c2.j.f22691a.getClass();
                        c2.z zVarA = c2.y.a(c2.j.f22694d, aVar4, mVar, 48);
                        int iHashCode = Long.hashCode(mVar.getU());
                        i2 i2VarX = mVar.x();
                        h4.r rVarC = h4.k.c(rVarD, mVar);
                        h5.g.V.getClass();
                        e0.a aVar5 = h5.g.a.f81805b;
                        if (mVar.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar5);
                        } else {
                            mVar.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA, mVar);
                        b4.c(h5.g.a.f81809f, i2VarX, mVar);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, mVar);
                        b0 b0Var = b0.f22601a;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarY = c2.l.y(aVar3, j92.b.f97899b.f97920e);
                        String strQ = gl1.y.Q(mVar, R.string.msg_segments_no_filter_results);
                        d92.b.f58624b.getClass();
                        mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 0, 131068);
                        mVar.y();
                        mVar.f();
                    } else {
                        mVar.C(1741912412);
                        s62.a.f157643a.getClass();
                        u4.d dVarA = v62.w0.a(t62.b.f162798a);
                        String string = iVar.getString(R.string.social_group_no_action_yet);
                        String string2 = iVar.getString(R.string.social_group_empty_leaderboard_message);
                        string2.getClass();
                        b82.n.c(dVarA, string, string2, null, null, mVar, 0, 24);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                v vVar = (v) obj6;
                p1 p1Var = (p1) obj5;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    if (((v) p1Var.getF182175a()) == vVar) {
                        mVar2.C(1287162079);
                        b3.b.f15502a.getClass();
                        i7.b(d3.f.a(), null, null, ds.e0.b(d92.b.f58623a, mVar2), mVar2, 48, 4);
                        mVar2.f();
                    } else {
                        mVar2.C(1287432120);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                h82.r rVar = (h82.r) obj6;
                xn.p pVar = (xn.p) obj5;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i17 = xn.p.f191619g;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    boolean zR = mVar3.r(pVar);
                    Object objQ = mVar3.q();
                    if (zR) {
                        objQ = new xn.o(pVar, i16);
                        mVar3.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new xn.o(pVar, i16);
                            mVar3.K(objQ);
                        }
                    }
                    rVar.B(R.string.lbl_calorie_tracking, null, false, (e23.a) objQ, mVar3, 0, 6);
                    boolean zR2 = mVar3.r(pVar);
                    Object objQ2 = mVar3.q();
                    if (zR2) {
                        objQ2 = new xn.o(pVar, i15);
                        mVar3.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new xn.o(pVar, i15);
                            mVar3.K(objQ2);
                        }
                    }
                    rVar.B(R.string.lbl_fluid_tracking, null, false, (e23.a) objQ2, mVar3, 0, 6);
                    z0 z0Var = z0.f4390a;
                    String str = pVar.f191620f;
                    z0Var.getClass();
                    if (xy2.b.B(z0Var, str) || xy2.b.C(z0Var, str)) {
                        mVar3.C(-366956690);
                        String strQ2 = gl1.y.Q(mVar3, R.string.lbl_pack_calories);
                        boolean zR3 = mVar3.r(pVar);
                        Object objQ3 = mVar3.q();
                        if (zR3) {
                            objQ3 = new xn.o(pVar, 3);
                            mVar3.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new xn.o(pVar, 3);
                                mVar3.K(objQ3);
                            }
                        }
                        rVar.C(strQ2, null, false, (e23.a) objQ3, mVar3, 0, 6);
                        mVar3.f();
                    } else {
                        mVar3.C(-366824072);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                h82.r rVar2 = (h82.r) obj6;
                xn.s sVar = (xn.s) obj5;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i18 = xn.s.f191625f;
                if (mVar4.n(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    boolean zR4 = mVar4.r(sVar);
                    Object objQ4 = mVar4.q();
                    if (zR4) {
                        objQ4 = new xn.r(sVar, z14 ? 1 : 0);
                        mVar4.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new xn.r(sVar, z14 ? 1 : 0);
                            mVar4.K(objQ4);
                        }
                    }
                    rVar2.B(R.string.lbl_calories_during_an_activity, null, false, (e23.a) objQ4, mVar4, 0, 6);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                xn0.g.a((in0.h.a.C1802a.EnumC1803a) obj6, (in0.k) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                xn0.g.b((String) obj6, (s5.c) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                jq1.d dVar = (jq1.d) obj6;
                o82.g gVar = (o82.g) obj5;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    xq1.b.a(dVar, gVar, mVar5, jq1.d.f99992c);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 7:
                BloodPressureRemindersActivity bloodPressureRemindersActivity = (BloodPressureRemindersActivity) obj6;
                ((Integer) obj2).getClass();
                BloodPressureRemindersActivity.a aVar6 = BloodPressureRemindersActivity.f30927d;
                ((DialogInterface) obj).getClass();
                ((jd1.h) bloodPressureRemindersActivity.f98394b.getValue()).y4((pd1.b) obj5);
                bloodPressureRemindersActivity.getSupportFragmentManager().Z();
                return Unit.INSTANCE;
            case 8:
                pd1.b bVar2 = (pd1.b) obj5;
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.a.C0494a c0494a = com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.a.f30928x;
                ((DialogInterface) obj).getClass();
                bVar2.getClass();
                ((com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.a) obj6).H6().y4(bVar2);
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.a.C0494a c0494a2 = com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.a.f30928x;
                ((DialogInterface) obj).getClass();
                ((com.garmin.android.apps.connectmobile.blood_pressure.presentation.reminders.a) obj6).f98424d.notifyItemChanged(((Integer) obj5).intValue());
                return Unit.INSTANCE;
            case 10:
                b11.l lVar = (b11.l) obj6;
                b11.l lVar2 = (b11.l) obj5;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    if (lVar.f14331a == lVar2.f14331a) {
                        mVar6.C(1870783580);
                        s62.a.f157643a.getClass();
                        u4.d dVarA2 = e1.a(t62.b.f162798a);
                        long jB = ds.e0.b(d92.b.f58623a, mVar6);
                        h4.r.a aVar7 = h4.r.S;
                        d92.b.f58625c.getClass();
                        i7.b(dVarA2, null, x2.q(aVar7, j92.b.f97901d.f97904c), jB, mVar6, 48, 0);
                        mVar6.f();
                    } else {
                        mVar6.C(1871160199);
                        h4.r.a aVar8 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        c2.l.f(x2.q(aVar8, j92.b.f97901d.f97904c), mVar6);
                        mVar6.f();
                    }
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 11:
                b11.l lVar3 = (b11.l) obj6;
                p1 p1Var2 = (p1) obj5;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(1 & iIntValue7, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    if (lVar3.equals((b11.l) p1Var2.getF182175a())) {
                        mVar7.C(1141397724);
                        s62.a.f157643a.getClass();
                        u4.d dVarA3 = e1.a(t62.b.f162798a);
                        long jB2 = ds.e0.b(d92.b.f58623a, mVar7);
                        h4.r.a aVar9 = h4.r.S;
                        d92.b.f58625c.getClass();
                        i7.b(dVarA3, null, x2.q(aVar9, j92.b.f97901d.f97904c), jB2, mVar7, 48, 0);
                        mVar7.f();
                    } else {
                        mVar7.C(1141771894);
                        h4.r.a aVar10 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        c2.l.f(x2.q(aVar10, j92.b.f97901d.f97904c), mVar7);
                        mVar7.f();
                    }
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 12:
                float fFloatValue = ((Float) obj).floatValue();
                ((p008y1.a) obj6).a(fFloatValue, ((Float) obj2).floatValue());
                ((o0) obj5).f105806a = fFloatValue;
                return Unit.INSTANCE;
            case 13:
                o0 o0Var = (o0) obj6;
                float fFloatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).floatValue();
                float f14 = o0Var.f105806a;
                o0Var.f105806a = ((o2) obj5).f(fFloatValue2 - f14) + f14;
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                y31.b.b((Integer) obj6, (z31.a) obj5, (p3.m) obj, p0.t(65));
                return Unit.INSTANCE;
            case 15:
                x3 x3Var2 = (x3) obj5;
                c80.s sVar2 = (c80.s) obj6;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    Boolean bool = (Boolean) ((g3) x3Var2.getF182175a()).f35301b;
                    h4.r.a aVar11 = h4.r.S;
                    h4.r rVarE = u1.n.e(x2.f(aVar11, 1.0f), p6.b.a(d92.b.f58623a, mVar8), m1.f128891a);
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f15 = eVar.f97920e;
                    float f16 = eVar.f97917b;
                    g6.f.a aVar12 = g6.f.f75994b;
                    h4.r rVarZ = c2.l.z(rVarE, f15, 12);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA2 = c2.y.a(kVar, h4.d.a.f81536n, mVar8, 0);
                    int iHashCode2 = Long.hashCode(mVar8.getU());
                    i2 i2VarX2 = mVar8.x();
                    h4.r rVarC2 = h4.k.c(rVarZ, mVar8);
                    h5.g.V.getClass();
                    e0.a aVar13 = h5.g.a.f81805b;
                    if (mVar8.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar13);
                    } else {
                        mVar8.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar8);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar8);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar8.getT() || !p005kotlin.jvm.internal.s.g(mVar8.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar8, iHashCode2, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar8);
                    b0 b0Var2 = b0.f22601a;
                    String strP = gl1.y.P(R.string.lbl_show_overall_subscription, new Object[]{String.valueOf(bool)}, mVar8);
                    h4.r rVarA = c2.l.A(aVar11, 0.0f, f16, 1);
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97932i;
                    mh.c(strP, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar8), mVar8, 0, 0, 131068);
                    if (sVar2 instanceof c80.s.a) {
                        mVar8.C(-199136201);
                        String string3 = ((c80.s.a) sVar2).f25558a.b().toString("MMMM d, yyyy");
                        string3.getClass();
                        strH = gl1.y.P(R.string.lbl_active_expires_on, new Object[]{string3}, mVar8);
                        mVar8.f();
                    } else if (sVar2 instanceof c80.s.b) {
                        mVar8.C(-198789559);
                        strH = gl1.y.P(R.string.lbl_eligible_number_purchasable_subscriptions, new Object[]{Integer.valueOf(((c80.s.b) sVar2).f25559a.size())}, mVar8);
                        mVar8.f();
                    } else if (sVar2 instanceof c80.s.c) {
                        mVar8.C(-198432253);
                        strH = gl1.y.P(R.string.lbl_ineligible_reason, new Object[]{((c80.s.c) sVar2).f25560a}, mVar8);
                        mVar8.f();
                    } else {
                        if (sVar2 != null) {
                            throw n23.j.m(mVar8, -560615220);
                        }
                        strH = sn.a.h(mVar8, -560584773, R.string.msg_error_loading_subscription_information, mVar8);
                    }
                    mh.c(gl1.y.P(R.string.lbl_gc_plus_subscription_status, new Object[]{strH}, mVar8), c2.l.A(aVar11, 0.0f, f16, 1), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar8), mVar8, 0, 0, 131068);
                    mVar8.y();
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 16:
                h82.r rVar3 = (h82.r) obj6;
                final yp0.k kVar2 = (yp0.k) obj5;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                int i19 = yp0.k.f198665f;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    boolean zR5 = mVar9.r(kVar2);
                    Object objQ5 = mVar9.q();
                    if (zR5) {
                        objQ5 = new e23.a() { // from class: yp0.i
                            @Override // e23.a
                            public final Object invoke() {
                                int i24 = i16;
                                k kVar3 = kVar2;
                                switch (i24) {
                                    case 0:
                                        int i25 = k.f198665f;
                                        kVar3.e("HOW_TO_ACTION");
                                        break;
                                    default:
                                        int i26 = k.f198665f;
                                        kVar3.e("BASIC_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar9.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new e23.a() { // from class: yp0.i
                                @Override // e23.a
                                public final Object invoke() {
                                    int i24 = i16;
                                    k kVar3 = kVar2;
                                    switch (i24) {
                                        case 0:
                                            int i25 = k.f198665f;
                                            kVar3.e("HOW_TO_ACTION");
                                            break;
                                        default:
                                            int i26 = k.f198665f;
                                            kVar3.e("BASIC_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar9.K(objQ5);
                        }
                    }
                    rVar3.B(R.string.lbl_hydration_basics, null, false, (e23.a) objQ5, mVar9, 0, 6);
                    boolean zR6 = mVar9.r(kVar2);
                    Object objQ6 = mVar9.q();
                    if (zR6) {
                        final int i24 = z14 ? 1 : 0;
                        objQ6 = new e23.a() { // from class: yp0.i
                            @Override // e23.a
                            public final Object invoke() {
                                int i25 = i24;
                                k kVar3 = kVar2;
                                switch (i25) {
                                    case 0:
                                        int i26 = k.f198665f;
                                        kVar3.e("HOW_TO_ACTION");
                                        break;
                                    default:
                                        int i27 = k.f198665f;
                                        kVar3.e("BASIC_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar9.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            final int i25 = z14 ? 1 : 0;
                            objQ6 = new e23.a() { // from class: yp0.i
                                @Override // e23.a
                                public final Object invoke() {
                                    int i26 = i25;
                                    k kVar3 = kVar2;
                                    switch (i26) {
                                        case 0:
                                            int i27 = k.f198665f;
                                            kVar3.e("HOW_TO_ACTION");
                                            break;
                                        default:
                                            int i28 = k.f198665f;
                                            kVar3.e("BASIC_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar9.K(objQ6);
                        }
                    }
                    rVar3.B(R.string.lbl_hydration_tracking_title, null, false, (e23.a) objQ6, mVar9, 0, 6);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 17:
                nr.g.d dVar2 = (nr.g.d) obj6;
                p1 p1Var3 = (p1) obj5;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(1 & iIntValue10, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    l72.s sVar3 = l72.s.f111232a;
                    String strQ3 = gl1.y.Q(mVar10, R.string.connect_iq_promo_banner_title);
                    l72.s.a aVar14 = l72.s.a.COLOR;
                    String lowerCase = dVar2.f127052a.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    String strP2 = gl1.y.P(R.string.connect_iq_promo_banner_activity_description, new Object[]{lowerCase}, mVar10);
                    e23.a<Unit> aVar15 = dVar2.f127053b;
                    String strQ4 = gl1.y.Q(mVar10, R.string.connect_iq_promo_banner_tap_lbl);
                    yr.f.f198858a.getClass();
                    z3.e eVar2 = yr.f.f198859b;
                    boolean zB = mVar10.B(dVar2) | mVar10.B(p1Var3);
                    Object objQ7 = mVar10.q();
                    if (zB) {
                        objQ7 = new xr.a(25, dVar2, p1Var3);
                        mVar10.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new xr.a(25, dVar2, p1Var3);
                            mVar10.K(objQ7);
                        }
                    }
                    sVar3.c(null, null, aVar14, eVar2, strQ3, strP2, strQ4, false, (e23.a) objQ7, aVar15, mVar10, 3456, 0, 387);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                ys1.e.b((pt1.i) obj6, (e23.l) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 19:
                h4.r rVar4 = (h4.r) obj6;
                p1 p1Var4 = (p1) obj5;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar11.n(1 & iIntValue11, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    f0.a aVar16 = f0.a.f111000a;
                    String strQ5 = gl1.y.Q(mVar11, R.string.lbl_share);
                    Object objQ8 = mVar11.q();
                    aVar.getClass();
                    if (objQ8 == p3.m.a.f135155b) {
                        objQ8 = new l0(p1Var4, 5);
                        mVar11.K(objQ8);
                    }
                    aVar16.f(strQ5, rVar4, false, (e23.a) objQ8, mVar11, 3072, 4);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                ChildConsentsFlowActivity.a aVar17 = ChildConsentsFlowActivity.f32139f;
                ((ChildConsentsFlowActivity) obj6).da((z10.i2) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 21:
                ChildConsentsFlowActivity childConsentsFlowActivity = (ChildConsentsFlowActivity) obj6;
                p1 p1Var5 = (p1) obj5;
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                ChildConsentsFlowActivity.a aVar18 = ChildConsentsFlowActivity.f32139f;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    z02.f.a(0, 59, null, null, null, ChildConsentsFlowActivity.b.f32145a[((c0) p1Var5.getF182175a()).ordinal()] == 1 ? childConsentsFlowActivity.getString(R.string.incident_detection_notice) : "", mVar12, null);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                r1.a((e23.a) obj6, (z1) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                PrivacyPolicyConsentActivity.a aVar19 = PrivacyPolicyConsentActivity.f32218d;
                ((PrivacyPolicyConsentActivity) obj6).da((q2) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 24:
                PrivacyPolicyConsentActivity privacyPolicyConsentActivity = (PrivacyPolicyConsentActivity) obj6;
                p1 p1Var6 = (p1) obj5;
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                PrivacyPolicyConsentActivity.a aVar20 = PrivacyPolicyConsentActivity.f32218d;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    if (((q2) p1Var6.getF182175a()).f201218a) {
                        mVar13.C(-425636169);
                        mVar13.f();
                    } else {
                        mVar13.C(-425709205);
                        privacyPolicyConsentActivity.da((q2) p1Var6.getF182175a(), mVar13, 0);
                        mVar13.f();
                    }
                    Boolean bool2 = ((q2) p1Var6.getF182175a()).f201222e;
                    boolean zB2 = mVar13.B(p1Var6) | mVar13.r(privacyPolicyConsentActivity);
                    Object objQ9 = mVar13.q();
                    if (zB2) {
                        obj3 = objQ9;
                        PrivacyPolicyConsentActivity.b bVar4 = privacyPolicyConsentActivity.new b(p1Var6, null);
                        mVar13.K(bVar4);
                        obj3 = bVar4;
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            obj3 = objQ9;
                            PrivacyPolicyConsentActivity.b bVar5 = privacyPolicyConsentActivity.new b(p1Var6, null);
                            mVar13.K(bVar5);
                            obj3 = bVar5;
                        }
                    }
                    obj3 = objQ9;
                    p3.l0.e((e23.p) obj3, bool2, mVar13);
                    Boolean bool3 = ((q2) p1Var6.getF182175a()).f201219b;
                    boolean zB3 = mVar13.B(p1Var6) | mVar13.r(privacyPolicyConsentActivity);
                    Object objQ10 = mVar13.q();
                    if (zB3) {
                        obj4 = objQ10;
                        PrivacyPolicyConsentActivity.c cVar = privacyPolicyConsentActivity.new c(p1Var6, null);
                        mVar13.K(cVar);
                        obj4 = cVar;
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            obj4 = objQ10;
                            PrivacyPolicyConsentActivity.c cVar2 = privacyPolicyConsentActivity.new c(p1Var6, null);
                            mVar13.K(cVar2);
                            obj4 = cVar2;
                        }
                    }
                    obj4 = objQ10;
                    p3.l0.e((e23.p) obj4, bool3, mVar13);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 25:
                h2 h2Var = (h2) obj6;
                o53.b0 b0Var3 = (o53.b0) obj5;
                n2.a aVar21 = (n2.a) obj;
                Context context = (Context) obj2;
                boolean zQ = h2Var.q();
                s5.c cVarT = h2Var.t();
                String str2 = cVarT != null ? cVarT.f157138b : null;
                w0 w0Var = h2Var.f201627x;
                if (w0Var != null) {
                    long j8 = w0Var.f157317a;
                    x5.c0 c0Var = h2Var.f201605b;
                    w0VarA = w0.a(og.a.l(c0Var.b((int) (j8 >> 32)), c0Var.b((int) (j8 & 4294967295L))));
                }
                z2.x.a(aVar21, context, zQ, str2, w0VarA, h2Var.f201613j, new wn2.f(h2Var, 26, b0Var3, context));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                z21.f.c((w01.d) obj6, (e23.a) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 27:
                o13.p pVar2 = (o13.p) obj6;
                String str3 = (String) obj5;
                p3.m mVar14 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97931h, mVar14);
                    h4.r.a aVar22 = h4.r.S;
                    boolean zB4 = mVar14.B(pVar2);
                    Object objQ11 = mVar14.q();
                    if (zB4) {
                        objQ11 = new n3(1, pVar2);
                        mVar14.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            objQ11 = new n3(1, pVar2);
                            mVar14.K(objQ11);
                        }
                    }
                    mh.c(str3, p5.v.c((e23.l) objQ11, aVar22, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar14, 0, 0, 131068);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                z32.e.b((List) obj6, (x0) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                z50.b.a((w20.b) obj6, (e23.l) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ h(Object obj, Object obj2, int i14, int i15) {
        this.f191392a = i15;
        this.f191393b = obj;
        this.f191394c = obj2;
    }

    public /* synthetic */ h(int i14, Object obj, Object obj2) {
        this.f191392a = i14;
        this.f191393b = obj;
        this.f191394c = obj2;
    }
}
