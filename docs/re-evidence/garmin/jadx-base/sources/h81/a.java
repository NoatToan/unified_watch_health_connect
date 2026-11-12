package h81;

import a03.k0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.a0;
import c2.l;
import c2.t2;
import c2.u;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.CoreProtobufRequestManager;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import e23.q;
import f5.b1;
import f5.v1;
import f5.z0;
import gl1.y;
import h4.k;
import h5.e0;
import h82.r;
import i3.dd;
import i3.kd;
import i3.mh;
import j20.x;
import k2.i;
import l72.u1;
import l72.w;
import o13.p;
import o4.f0;
import o4.m1;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.t0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import s5.x0;
import u1.y0;
import v62.s9;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82405a;

    public /* synthetic */ a(int i14) {
        this.f82405a = i14;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        t2 t2Var = (t2) obj;
        m mVar = (m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ib0.c cVar = ib0.c.f92455a;
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = n.f135158a;
            w.a.f111302a.c(t2Var, y.Q(mVar, R.string.startup_select_avatar), null, null, mVar, iIntValue & 14, 6);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:238:0x0814  */
    /* JADX WARN: Code duplicated, block: B:78:0x02d3  */
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
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        int i14 = 9;
        int i15 = 10;
        int i16 = 7;
        int i17 = 3;
        int i18 = 4;
        int i19 = 2;
        boolean z14 = true;
        boolean z15 = false;
        switch (this.f82405a) {
            case 0:
                r rVar = (r) obj;
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                b bVar = b.f82406a;
                rVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(rVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    int i24 = ((iIntValue << 3) & 112) | 6;
                    rVar.j(z3.f.c(1764514035, new fe1.a(rVar, i16), mVar), mVar, i24);
                    rVar.j(z3.f.c(-2009580118, new fe1.a(rVar, 8), mVar), mVar, i24);
                    rVar.j(z3.f.c(526027307, new fe1.a(rVar, i14), mVar), mVar, i24);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                r rVar2 = (r) obj;
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                b bVar2 = b.f82406a;
                rVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    int i25 = (iIntValue2 << 3) & 112;
                    rVar2.D(R.string.lbl_stamina, mVar2, i25);
                    rVar2.m((iIntValue2 << 6) & 896, 2, y.Q(mVar2, R.string.stamina_help_intro), null, mVar2);
                    rVar2.q(y.Q(mVar2, R.string.lbl_stamina_help_body1), mVar2, i25);
                    rVar2.q(y.Q(mVar2, R.string.lbl_stamina_help_body2), mVar2, i25);
                    int i26 = i25 | 6;
                    rVar2.j(z3.f.c(-338163520, new fe1.a(rVar2, i15), mVar2), mVar2, i26);
                    rVar2.j(z3.f.c(882888105, new fe1.a(rVar2, 11), mVar2), mVar2, i26);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                m mVar3 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ha0.c cVar = ha0.c.f82622a;
                ((e2.d) obj).getClass();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    l.f(x2.f(x2.h(aVar, j92.b.f97899b.f97919d), 1.0f), mVar3);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                m mVar4 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ha0.c cVar2 = ha0.c.f82622a;
                ((e2.d) obj).getClass();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    l.f(x2.f(x2.h(aVar2, j92.b.f97899b.f97919d), 1.0f), mVar4);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                m mVar5 = (m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ha0.c cVar3 = ha0.c.f82622a;
                ((e2.d) obj).getClass();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var5 = n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    l.f(x2.f(x2.h(aVar3, j92.b.f97899b.f97919d), 1.0f), mVar5);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                m mVar6 = (m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ha0.c cVar4 = ha0.c.f82622a;
                ((e2.d) obj).getClass();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var6 = n.f135158a;
                    h4.r.a aVar4 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    l.f(x2.f(x2.h(aVar4, j92.b.f97899b.f97920e), 1.0f), mVar6);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                t2 t2Var = (t2) obj;
                m mVar7 = (m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                hn1.h hVar = hn1.h.f84527a;
                t2Var.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= mVar7.B(t2Var) ? 4 : 2;
                }
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    x1 x1Var7 = n.f135158a;
                    h4.r.a aVar5 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarC = t2Var.c(aVar5, h4.d.a.f81534l);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC2 = l.C(rVarC, j92.b.f97899b.f97917b, 0.0f, 0.0f, 0.0f, 14);
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar7.getU());
                    i2 i2VarX = mVar7.x();
                    h4.r rVarC3 = k.c(rVarC2, mVar7);
                    h5.g.V.getClass();
                    e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar7.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar6);
                    } else {
                        mVar7.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar7);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar7);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar7.getT() || !s.g(mVar7.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar7, iHashCode, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar7);
                    u uVar = u.f22885a;
                    g6.f.a aVar7 = g6.f.f75994b;
                    c2.q.a(u1.n.e(l4.k.b(x2.q(aVar5, 20), i.f102406a), d92.b.a(mVar7).f().f63508c, m1.f128891a), mVar7, 0);
                    h4.r rVarC4 = uVar.c(aVar5, h4.d.a.f81528f);
                    d92.b.f58624b.getClass();
                    mh.c("x2", rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(d92.c.e(j92.f.f97935l), d92.b.a(mVar7).h().a(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), mVar7, 6, 0, 131068);
                    mVar7.y();
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                t2 t2Var2 = (t2) obj;
                m mVar8 = (m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ho.q qVar = ho.q.f84665a;
                t2Var2.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar8.B(t2Var2) ? 4 : 2;
                }
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x1 x1Var8 = n.f135158a;
                    w.a.f111302a.c(t2Var2, y.Q(mVar8, R.string.lbl_filters), null, null, mVar8, iIntValue8 & 14, 6);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj).intValue();
                ho.q qVar2 = ho.q.f84665a;
                ((jo.c) obj2).getClass();
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj).intValue();
                ho.q qVar3 = ho.q.f84665a;
                ((jo.c) obj2).getClass();
                return Unit.INSTANCE;
            case 10:
                r rVar3 = (r) obj;
                m mVar9 = (m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ho0.b bVar4 = ho0.b.f84701a;
                rVar3.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= mVar9.B(rVar3) ? 4 : 2;
                }
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    x1 x1Var9 = n.f135158a;
                    int i27 = (iIntValue9 << 3) & 112;
                    rVar3.D(R.string.lbl_using_heart_rate_data, mVar9, i27);
                    rVar3.o(R.string.msg_heart_rate_general_description, (iIntValue9 << 6) & 896, 2, null, mVar9);
                    Context context = (Context) mVar9.A(AndroidCompositionLocals_androidKt.f6042b);
                    String strP = y.P(R.string.msg_heart_rate_workout_description, new Object[]{y.Q(mVar9, R.string.lbl_heart_rate_zones_low_cap)}, mVar9);
                    boolean zR = mVar9.r(context);
                    Object objQ = mVar9.q();
                    if (zR) {
                        obj4 = objQ;
                        Object aVar8 = new ho0.a(context, 0);
                        mVar9.K(aVar8);
                        obj4 = aVar8;
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            obj4 = objQ;
                            Object aVar9 = new ho0.a(context, 0);
                            mVar9.K(aVar9);
                            obj4 = aVar9;
                        }
                    }
                    obj4 = objQ;
                    rVar3.w(strP, null, (e23.a) obj4, mVar9, (iIntValue9 << 9) & 7168, 2);
                    rVar3.j(z3.f.c(-1567808754, new fe1.a(rVar3, 19), mVar9), mVar9, i27 | 6);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 11:
                r rVar4 = (r) obj;
                m mVar10 = (m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                hp1.a aVar10 = hp1.a.f84937a;
                rVar4.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= mVar10.B(rVar4) ? 4 : 2;
                }
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    x1 x1Var10 = n.f135158a;
                    int i28 = (iIntValue10 << 3) & 112;
                    rVar4.D(R.string.battery_boost_edge_solar_charge_title, mVar10, i28);
                    int i29 = (iIntValue10 << 6) & 896;
                    rVar4.l(R.string.edge_solar_power_glass_desc, i29, 2, null, mVar10);
                    rVar4.t(R.string.edge_solar_power_charging_how_it_works_title, mVar10, i28);
                    rVar4.o(R.string.power_glass_how_it_works_desc, i29, 2, null, mVar10);
                    rVar4.t(R.string.edge_solar_charging_gcm_title, mVar10, i28);
                    rVar4.o(R.string.edge_solar_charging_gcm_desc, i29, 2, null, mVar10);
                    rVar4.o(R.string.edge_solar_charging_battery_status_desc, i29, 2, null, mVar10);
                    u1.b(R.string.lbl_battery_cold, R.string.edge_solar_charging_battery_cold_desc, 6, 2, f0.d(4279858898L), mVar10, false);
                    u1.b(R.string.lbl_battery_hot, R.string.edge_solar_charging_battery_hot_desc, 6, 2, f0.d(4292881452L), mVar10, false);
                    u1.b(R.string.lbl_battery_full, R.string.edge_solar_charging_battery_full_desc, 6, 2, f0.d(4279674180L), mVar10, false);
                    rVar4.t(R.string.edge_solar_charging_unmeasurable_input_title, mVar10, i28);
                    rVar4.o(R.string.edge_solar_charging_unmeasurable_input_desc, i29, 2, null, mVar10);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 12:
                r rVar5 = (r) obj;
                m mVar11 = (m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                hp1.a aVar11 = hp1.a.f84937a;
                rVar5.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= mVar11.B(rVar5) ? 4 : 2;
                }
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    x1 x1Var11 = n.f135158a;
                    int i30 = (iIntValue11 << 3) & 112;
                    rVar5.D(R.string.let_the_sunshine_in_title, mVar11, i30);
                    int i34 = (iIntValue11 << 6) & 896;
                    rVar5.l(R.string.sunlight_charging_desc, i34, 2, null, mVar11);
                    rVar5.t(R.string.soaking_the_sun_title, mVar11, i30);
                    rVar5.o(R.string.soaking_the_sun_desc, i34, 2, null, mVar11);
                    rVar5.t(R.string.edge_solar_charging_sleep_mode_title, mVar11, i30);
                    rVar5.o(R.string.edge_solar_charging_sleep_mode_desc, i34, 2, null, mVar11);
                    rVar5.t(R.string.don_t_rely_on_edge_solar_charging_alone_title, mVar11, i30);
                    rVar5.o(R.string.don_t_rely_on_edge_solar_charging_alone_desc, i34, 2, null, mVar11);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 13:
                r rVar6 = (r) obj;
                m mVar12 = (m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ht0.a aVar12 = ht0.a.f85509a;
                rVar6.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= mVar12.B(rVar6) ? 4 : 2;
                }
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    x1 x1Var12 = n.f135158a;
                    rVar6.D(R.string.lbl_your_training_limit, mVar12, (iIntValue12 << 3) & 112);
                    int i35 = (iIntValue12 << 6) & 896;
                    rVar6.o(R.string.msg_lactate_threshold_help1, i35, 2, null, mVar12);
                    t4.d dVarA = n5.c.a(2131232292, mVar12, 0);
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    y0.a(dVarA, "", l.C(rVarF, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), null, null, 0.0f, null, mVar12, 48, 120);
                    rVar6.o(R.string.msg_lactate_threshold_help2, i35, 2, null, mVar12);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 14:
                r rVar7 = (r) obj;
                m mVar13 = (m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ht0.a aVar13 = ht0.a.f85509a;
                rVar7.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= mVar13.B(rVar7) ? 4 : 2;
                }
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    x1 x1Var13 = n.f135158a;
                    int i36 = (iIntValue13 << 3) & 112;
                    rVar7.D(R.string.lbl_receiving_a_reading, mVar13, i36);
                    int i37 = (iIntValue13 << 6) & 896;
                    rVar7.o(R.string.lactate_threshold_test_description, i37, 2, null, mVar13);
                    rVar7.j(z3.f.c(-1862194884, new fe1.a(rVar7, 23), mVar13), mVar13, i36 | 6);
                    rVar7.o(R.string.msg_lactate_threshold_help5, i37, 2, null, mVar13);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 15:
                m mVar14 = (m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ht1.a aVar14 = ht1.a.f85531a;
                ((t2) obj).getClass();
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    x1 x1Var14 = n.f135158a;
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 16:
                m mVar15 = (m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ht1.b bVar5 = ht1.b.f85536a;
                ((e2.d) obj).getClass();
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    x1 x1Var15 = n.f135158a;
                    h4.r.a aVar15 = h4.r.S;
                    h4.r rVarF2 = x2.f(aVar15, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarE = u1.n.e(l.A(rVarF2, 0.0f, eVar.f97918c, 1), x.b(mVar15), m1.f128891a);
                    h4.d.f81522a.getClass();
                    z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode2 = Long.hashCode(mVar15.getU());
                    i2 i2VarX2 = mVar15.x();
                    h4.r rVarC5 = k.c(rVarE, mVar15);
                    h5.g.V.getClass();
                    e0.a aVar16 = h5.g.a.f81805b;
                    if (mVar15.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar15.z();
                    if (mVar15.getT()) {
                        mVar15.M(aVar16);
                    } else {
                        mVar15.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD2, mVar15);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar15);
                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                    if (mVar15.getT() || !s.g(mVar15.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar15, iHashCode2, bVar6);
                    }
                    b4.c(h5.g.a.f81807d, rVarC5, mVar15);
                    u uVar2 = u.f22885a;
                    String strQ = y.Q(mVar15, R.string.trails_report_issue_selection_title);
                    h4.r rVarC6 = uVar2.c(l.y(x2.f(aVar15, 1.0f), eVar.f97920e), h4.d.a.f81527e);
                    d92.b.f58624b.getClass();
                    mh.c(strQ, rVarC6, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), mVar15), mVar15, 0, 0, 131068);
                    mVar15.y();
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 17:
                m mVar16 = (m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ht1.c cVar5 = ht1.c.f85540a;
                ((a0) obj).getClass();
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    x1 x1Var16 = n.f135158a;
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 18:
                m mVar17 = (m) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                hv0.a aVar17 = hv0.a.f85792a;
                ((t2) obj).getClass();
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    x1 x1Var17 = n.f135158a;
                    String strQ2 = y.Q(mVar17, R.string.strava_shop_live_track_compatible_devices_title);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarA = x0.a(j92.f.f97932i, ds.e0.e(mVar17), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    d6.h.f57752b.getClass();
                    mh.c(strQ2, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarA, mVar17, 0, 0, 130046);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj3).getClass();
                i11.a aVar18 = i11.a.f87072a;
                ((r1.e0) obj).getClass();
                x1 x1Var18 = n.f135158a;
                h4.r.a aVar19 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarQ = x2.q(aVar19, j92.b.f97901d.f97905d);
                s62.a.f157643a.getClass();
                y0.b(s9.a(t62.b.f162798a), null, rVarQ, null, (m) obj2, 48, 120);
                return Unit.INSTANCE;
            case 20:
                t2 t2Var3 = (t2) obj;
                m mVar18 = (m) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                i11.b bVar7 = i11.b.f87074a;
                t2Var3.getClass();
                if ((iIntValue18 & 6) == 0) {
                    iIntValue18 |= mVar18.B(t2Var3) ? 4 : 2;
                }
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 19) != 18)) {
                    x1 x1Var19 = n.f135158a;
                    w.a.f111302a.c(t2Var3, y.Q(mVar18, R.string.full_nutrition), null, null, mVar18, iIntValue18 & 14, 6);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 21:
                i22.d dVar = (i22.d) obj;
                i22.d dVar2 = (i22.d) obj2;
                long jLongValue = ((Long) obj3).longValue();
                if (dVar == null || dVar2 == null) {
                    if (dVar == null) {
                        if (dVar2 != null) {
                            dVar = dVar2;
                        } else {
                            dVar = null;
                        }
                    }
                } else if (new DateTime(dVar2.getTimestamp()).isAfter(new DateTime(dVar.getTimestamp()))) {
                    dVar = dVar2;
                }
                if (dVar != null) {
                    com.garmin.android.apps.connectmobile.i2.a aVar20 = com.garmin.android.apps.connectmobile.i2.f36769a;
                    aVar20.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.b(a2.GENERAL, "SignifLocUpdJobService", "sendNotificationToDevice: Sent notification to: device=" + jLongValue + " | location=" + dVar + ".");
                    CoreProtobufRequestManager.sendLocationUpdatedNotification(jLongValue, dVar);
                    GCMSettingManager.U(jLongValue, null);
                }
                return Unit.INSTANCE;
            case 22:
                v1 v1VarQ = ((f5.y0) obj2).Q(((g6.a) obj3).f75988a);
                return b1.Z0((b1) obj, v1VarQ.f69144a, v1VarQ.f69145b, new i11.f(i19), new k0(v1VarQ, 10));
            case 23:
                dd ddVar = dd.f87874a;
                v1 v1VarQ2 = ((f5.y0) obj2).Q(((g6.a) obj3).f75988a);
                int i38 = v1VarQ2.f69145b;
                return ((b1) obj).H1(v1VarQ2.f69144a, i38, t0.b(new p(kd.f88709f, Integer.valueOf(i38 / 2))), new k0(v1VarQ2, 14));
            case 24:
                r rVar8 = (r) obj;
                m mVar19 = (m) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                i40.b bVar8 = i40.b.f90891a;
                rVar8.getClass();
                if ((iIntValue19 & 6) == 0) {
                    iIntValue19 |= mVar19.B(rVar8) ? 4 : 2;
                }
                if (mVar19.n(iIntValue19 & 1, (iIntValue19 & 19) != 18)) {
                    x1 x1Var20 = n.f135158a;
                    int i39 = (iIntValue19 << 3) & 112;
                    rVar8.D(R.string.lbl_customize_course, mVar19, i39);
                    rVar8.o(R.string.msg_customize_course_description, (iIntValue19 << 6) & 896, 2, null, mVar19);
                    int i44 = i39 | 6;
                    rVar8.j(z3.f.c(201629169, new fe1.a(rVar8, 27), mVar19), mVar19, i44);
                    rVar8.j(z3.f.c(-452062310, new fe1.a(rVar8, 28), mVar19), mVar19, i44);
                    rVar8.j(z3.f.c(-6524999, new fe1.a(rVar8, 29), mVar19), mVar19, i44);
                    rVar8.j(z3.f.c(439012312, new i40.a(rVar8, z15 ? 1 : 0), mVar19), mVar19, i44);
                    rVar8.j(z3.f.c(884549623, new i40.a(rVar8, z14 ? 1 : 0), mVar19), mVar19, i44);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 25:
                r rVar9 = (r) obj;
                m mVar20 = (m) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                i40.c cVar6 = i40.c.f90893a;
                rVar9.getClass();
                if ((iIntValue20 & 6) == 0) {
                    iIntValue20 |= mVar20.B(rVar9) ? 4 : 2;
                }
                if (mVar20.n(iIntValue20 & 1, (iIntValue20 & 19) != 18)) {
                    x1 x1Var21 = n.f135158a;
                    int i45 = (iIntValue20 << 3) & 112;
                    rVar9.D(R.string.lbl_customize_course, mVar20, i45);
                    rVar9.o(R.string.msg_customize_course_description, (iIntValue20 << 6) & 896, 2, null, mVar20);
                    int i46 = i45 | 6;
                    rVar9.j(z3.f.c(1679194301, new i40.a(rVar9, i19), mVar20), mVar20, i46);
                    rVar9.j(z3.f.c(1294156966, new i40.a(rVar9, i17), mVar20), mVar20, i46);
                    rVar9.j(z3.f.c(-309846907, new i40.a(rVar9, i18), mVar20), mVar20, i46);
                    rVar9.j(z3.f.c(-1913850780, new i40.a(rVar9, 5), mVar20), mVar20, i46);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 26:
                h4.r rVar10 = (h4.r) obj;
                m mVar21 = (m) obj2;
                v.h.y(425239919, rVar10, (Integer) obj3, mVar21);
                x1 x1Var22 = n.f135158a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f14 = eVar2.f97918c;
                float f15 = f14 + eVar2.f97917b;
                g6.f.a aVar21 = g6.f.f75994b;
                h4.r rVarC7 = l.C(rVar10, 0.0f, f15, eVar2.f97920e, f14, 1);
                mVar21.f();
                return rVarC7;
            case 27:
                j90.b bVar9 = (j90.b) obj;
                m mVar22 = (m) obj2;
                ((Integer) obj3).getClass();
                bVar9.getClass();
                mVar22.C(1687900673);
                x1 x1Var23 = n.f135158a;
                String strQ3 = y.Q(mVar22, bVar9.f97788a.f97786c);
                if (bVar9.f97789b) {
                    mVar22.C(-1227994092);
                    strQ3 = y.P(R.string.activity_options_bic_required, new Object[]{strQ3}, mVar22);
                    mVar22.f();
                } else {
                    mVar22.C(-1227881748);
                    mVar22.f();
                }
                mVar22.f();
                return strQ3;
            case 28:
                return a(obj, obj2, obj3);
            default:
                r rVar11 = (r) obj;
                m mVar23 = (m) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ih0.b bVar10 = ih0.b.f93443a;
                rVar11.getClass();
                if ((iIntValue21 & 6) == 0) {
                    iIntValue21 |= mVar23.B(rVar11) ? 4 : 2;
                }
                if (mVar23.n(iIntValue21 & 1, (iIntValue21 & 19) != 18)) {
                    x1 x1Var24 = n.f135158a;
                    int i47 = (iIntValue21 << 3) & 112;
                    rVar11.D(R.string.lbl_what_is_fitness_age, mVar23, i47);
                    int i48 = (iIntValue21 << 6) & 896;
                    rVar11.l(R.string.msg_fitness_age_description, i48, 2, null, mVar23);
                    int i49 = i47 | 6;
                    rVar11.j(z3.f.c(1046431957, new i40.a(rVar11, 13), mVar23), mVar23, i49);
                    rVar11.o(R.string.msg_fitness_age_rhr_availability_2, i48, 2, null, mVar23);
                    rVar11.j(z3.f.c(-1167889154, new i40.a(rVar11, i16), mVar23), mVar23, i49);
                } else {
                    mVar23.e();
                }
                return Unit.INSTANCE;
        }
    }
}
