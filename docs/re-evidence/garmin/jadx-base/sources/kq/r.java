package kq;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f5.v1;
import f72.a3;
import i3.fe;
import i3.mh;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;
import z2.t2;
import z2.u2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class r implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106123a;

    public /* synthetic */ r(int i14) {
        this.f106123a = i14;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02f3  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = 14;
        switch (this.f106123a) {
            case 0:
                h82.r rVar = (h82.r) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                s sVar = s.f106125a;
                rVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(rVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    int i15 = (iIntValue << 3) & 112;
                    rVar.t(R.string.strength_training_total_reps_label, mVar, i15);
                    int i16 = (iIntValue << 6) & 896;
                    rVar.o(R.string.strength_training_total_reps_description, i16, 2, null, mVar);
                    rVar.t(R.string.strength_training_total_sets_label, mVar, i15);
                    rVar.o(R.string.strength_training_total_sets_description, i16, 2, null, mVar);
                    rVar.t(R.string.strength_training_avg_reps_per_set_label, mVar, i15);
                    rVar.o(R.string.strength_training_avg_reps_per_set_description, i16, 2, null, mVar);
                    rVar.t(R.string.strength_training_total_volume_label, mVar, i15);
                    rVar.o(R.string.strength_training_total_volume_description, i16, 2, null, mVar);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                h82.r rVar2 = (h82.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t tVar = t.f106129a;
                rVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    rVar2.k(z3.f.c(659061174, new ix0.f(rVar2, 10), mVar2), mVar2, ((iIntValue2 << 3) & 112) | 6);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                h82.r rVar3 = (h82.r) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                u uVar = u.f106132a;
                rVar3.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.B(rVar3) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    rVar3.D(R.string.lbl_mobility_activities, mVar3, (iIntValue3 << 3) & 112);
                    int i17 = (iIntValue3 << 6) & 896;
                    rVar3.l(R.string.msg_mobility_activities_help_intro, i17, 2, null, mVar3);
                    rVar3.o(R.string.msg_mobility_activities_help_tracking, i17, 2, null, mVar3);
                    rVar3.o(R.string.msg_mobility_activities_help_view_data_no_muscle_map, i17, 2, null, mVar3);
                    rVar3.o(R.string.msg_mobility_activities_help_exercises, i17, 2, null, mVar3);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                h82.r rVar4 = (h82.r) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                v vVar = v.f106136a;
                rVar4.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(rVar4) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    int i18 = (iIntValue4 << 3) & 112;
                    rVar4.k(z3.f.c(-419195836, new ix0.f(rVar4, 11), mVar4), mVar4, i18 | 6);
                    int i19 = (iIntValue4 << 6) & 896;
                    rVar4.o(R.string.lbl_pack_weight_help_body1, i19, 2, null, mVar4);
                    rVar4.t(R.string.lbl_pack_weight, mVar4, i18);
                    rVar4.q(gl1.y.Q(mVar4, R.string.lbl_pack_weight_definition), mVar4, i18);
                    rVar4.s(i19, 2, gl1.y.Q(mVar4, R.string.lbl_editing_pack_weight), null, mVar4);
                    rVar4.q(gl1.y.Q(mVar4, R.string.lbl_pack_weight_help_body3), mVar4, i18);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                h82.r rVar5 = (h82.r) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                w wVar = w.f106139a;
                rVar5.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar5.B(rVar5) ? 4 : 2;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    int i24 = (iIntValue5 << 3) & 112;
                    rVar5.D(R.string.activity_type_pilates, mVar5, i24);
                    int i25 = (iIntValue5 << 6) & 896;
                    rVar5.l(R.string.msg_pilates_help_description, i25, 2, null, mVar5);
                    rVar5.o(R.string.msg_pilates_help_device_info, i25, 2, null, mVar5);
                    rVar5.t(R.string.strength_training_sets, mVar5, i24);
                    rVar5.o(R.string.msg_sets_help_description, i25, 2, null, mVar5);
                    rVar5.t(R.string.strength_training_reps, mVar5, i24);
                    rVar5.o(R.string.msg_reps_help_description, i25, 2, null, mVar5);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                h82.r rVar6 = (h82.r) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                x xVar = x.f106142a;
                rVar6.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar6.B(rVar6) ? 4 : 2;
                }
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var6 = p3.n.f135158a;
                    int i26 = (iIntValue6 << 3) & 112;
                    rVar6.D(R.string.lbl_race_predictor, mVar6, i26);
                    int i27 = (iIntValue6 << 6) & 896;
                    rVar6.l(R.string.race_predictor_trends_help_intro, i27, 2, null, mVar6);
                    rVar6.o(R.string.race_predictor_trends_help_description, i27, 2, null, mVar6);
                    rVar6.j(z3.f.c(695770691, new ix0.f(rVar6, 12), mVar6), mVar6, i26 | 6);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                h82.r rVar7 = (h82.r) obj;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                y yVar = y.f106145a;
                rVar7.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= mVar7.B(rVar7) ? 4 : 2;
                }
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    x1 x1Var7 = p3.n.f135158a;
                    int i28 = (iIntValue7 << 3) & 112;
                    rVar7.D(R.string.activities_power_help_title, mVar7, i28);
                    int i29 = (iIntValue7 << 6) & 896;
                    rVar7.l(R.string.activities_power_help_short_description, i29, 2, null, mVar7);
                    rVar7.o(R.string.activities_power_help_long_description, i29, 2, null, mVar7);
                    rVar7.t(R.string.activities_power_help_average_power, mVar7, i28);
                    rVar7.o(R.string.activities_power_help_average_power_description, i29, 2, null, mVar7);
                    rVar7.t(R.string.activity_details_max_power, mVar7, i28);
                    rVar7.o(R.string.activities_power_help_max_power_description, i29, 2, null, mVar7);
                    rVar7.t(R.string.wind_data_label, mVar7, i28);
                    rVar7.o(R.string.activities_power_help_wind_power_description, i29, 2, null, mVar7);
                    rVar7.t(R.string.lbl_receiving_wind_data, mVar7, i28);
                    rVar7.o(R.string.msg_receiving_wind_data, i29, 2, null, mVar7);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                h82.r rVar8 = (h82.r) obj;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                z zVar = z.f106149a;
                rVar8.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar8.B(rVar8) ? 4 : 2;
                }
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x1 x1Var8 = p3.n.f135158a;
                    int i30 = (iIntValue8 << 3) & 112;
                    rVar8.D(R.string.lbl_stamina, mVar8, i30);
                    int i34 = (iIntValue8 << 6) & 896;
                    rVar8.l(R.string.lbl_stamina_help_subtitle_v2, i34, 2, null, mVar8);
                    rVar8.o(R.string.lbl_stamina_help_description_v2, i34, 2, null, mVar8);
                    int i35 = i30 | 6;
                    rVar8.j(z3.f.c(1987850883, new ix0.f(rVar8, 13), mVar8), mVar8, i35);
                    rVar8.j(z3.f.c(-147171142, new ix0.f(rVar8, i14), mVar8), mVar8, i35);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                h82.r rVar9 = (h82.r) obj;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                a0 a0Var = a0.f106043a;
                rVar9.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= mVar9.B(rVar9) ? 4 : 2;
                }
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    x1 x1Var9 = p3.n.f135158a;
                    int i36 = (iIntValue9 << 3) & 112;
                    rVar9.D(R.string.workout_estimation_help_header, mVar9, i36);
                    int i37 = (iIntValue9 << 6) & 896;
                    rVar9.l(R.string.workout_estimate_help_main_subheader, i37, 2, null, mVar9);
                    rVar9.t(R.string.common_how_it_works, mVar9, i36);
                    rVar9.o(R.string.workout_estimate_help_how_it_works_subheader, i37, 2, null, mVar9);
                    rVar9.t(R.string.workout_estimate_help_no_estimate_provided, mVar9, i36);
                    rVar9.o(R.string.workout_estimate_help_no_estimate_provided_subheader, i37, 2, null, mVar9);
                    rVar9.t(R.string.workout_estimate_help_how_we_determine_estimates, mVar9, i36);
                    rVar9.o(R.string.workout_estimation_help_body, i37, 2, null, mVar9);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                h82.r rVar10 = (h82.r) obj;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                b0 b0Var = b0.f106047a;
                rVar10.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= mVar10.B(rVar10) ? 4 : 2;
                }
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    x1 x1Var10 = p3.n.f135158a;
                    int i38 = (iIntValue10 << 3) & 112;
                    rVar10.t(R.string.strength_training_total_reps_label, mVar10, i38);
                    int i39 = (iIntValue10 << 6) & 896;
                    rVar10.o(R.string.strength_training_total_reps_description, i39, 2, null, mVar10);
                    rVar10.t(R.string.strength_training_total_sets_label, mVar10, i38);
                    rVar10.o(R.string.strength_training_total_sets_description, i39, 2, null, mVar10);
                    rVar10.t(R.string.strength_training_avg_time_per_set_label, mVar10, i38);
                    rVar10.o(R.string.strength_training_avg_time_per_set_description, i39, 2, null, mVar10);
                    rVar10.t(R.string.strength_training_total_volume_label, mVar10, i38);
                    rVar10.o(R.string.strength_training_total_volume_description, i39, 2, null, mVar10);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                kv0.a aVar = kv0.a.f106604a;
                ((fe) obj).getClass();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    x1 x1Var11 = p3.n.f135158a;
                    f12.l.f68084a.getClass();
                    com.garmin.android.apps.connectmobile.userprofile.model.g gVarW0 = f12.l.a.a().W0();
                    h4.r.a aVar2 = h4.r.S;
                    h4.d.f81522a.getClass();
                    h4.r rVarX = x2.x(aVar2, h4.d.a.f81533k, 2);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY = c2.l.y(rVarX, j92.b.f97899b.f97920e);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = a3.a(t62.c.f162799a);
                    String strQ = gl1.y.Q(mVar11, R.string.lbl_admin_setup_feature_required);
                    String str = gVarW0 != null ? gVarW0.f46858b : null;
                    if (str == null) {
                        str = "";
                    }
                    b82.n.c(dVarA, strQ, gl1.y.P(R.string.msg_live_track_administrator_required, new Object[]{str}, mVar11), rVarY, null, mVar11, 0, 16);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 11:
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                kv0.b bVar = kv0.b.f106606a;
                ((fe) obj).getClass();
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    x1 x1Var12 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    h4.r rVarE = u1.n.e(x2.d(aVar3, 1.0f), tn.k.a(d92.b.f58623a, mVar12), m1.f128891a);
                    h4.d.f81522a.getClass();
                    f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar12.getU());
                    i2 i2VarX = mVar12.x();
                    h4.r rVarC = h4.k.c(rVarE, mVar12);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar12.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar12.z();
                    if (mVar12.getT()) {
                        mVar12.M(aVar4);
                    } else {
                        mVar12.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar12);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar12);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar12.getT() || !p005kotlin.jvm.internal.s.g(mVar12.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar12, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar12);
                    c2.u uVar2 = c2.u.f22885a;
                    String strQ2 = gl1.y.Q(mVar12, R.string.msg_common_no_data_available);
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarF = d92.c.f(j92.f.f97933j, mVar12);
                    d6.h.f57752b.getClass();
                    int i44 = d6.h.f57755e;
                    g6.f.a aVar5 = g6.f.f75994b;
                    mh.c(strQ2, x2.y(c2.l.C(x2.d(aVar3, 1.0f), 0.0f, 80, 0.0f, 0.0f, 13), h4.d.a.f81525c, 2), 0L, null, 0L, null, 0L, d6.h.a(i44), 0L, 0, false, 0, 0, null, x0VarF, mVar12, 48, 0, 130044);
                    mVar12.y();
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 12:
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ky0.b bVar3 = ky0.b.f107189a;
                ((e2.d) obj).getClass();
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    x1 x1Var13 = p3.n.f135158a;
                    h4.r.a aVar6 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar6, j92.b.f97899b.f97918c), mVar13);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 13:
                h4.r rVar11 = (h4.r) obj;
                p3.m mVar14 = (p3.m) obj2;
                v.h.y(-1460079943, rVar11, (Integer) obj3, mVar14);
                x1 x1Var14 = p3.n.f135158a;
                h4.r rVarA = l4.k.a(rVar11, 0.5f);
                mVar14.f();
                return rVarA;
            case 14:
                h4.r rVar12 = (h4.r) obj;
                p3.m mVar15 = (p3.m) obj2;
                v.h.y(1827332995, rVar12, (Integer) obj3, mVar15);
                x1 x1Var15 = p3.n.f135158a;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarC2 = c2.l.C(rVar12, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97919d, 7);
                mVar15.f();
                return rVarC2;
            case 15:
                h4.r rVar13 = (h4.r) obj;
                p3.m mVar16 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                mVar16.C(-2126899193);
                x1 x1Var16 = p3.n.f135158a;
                long j8 = ((t2) mVar16.A(u2.f201804a)).f201802a;
                h4.r.a aVar7 = h4.r.S;
                boolean zL = mVar16.l(j8);
                Object objQ = mVar16.q();
                if (zL) {
                    objQ = new j82.d(j8, 7);
                    mVar16.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new j82.d(j8, 7);
                        mVar16.K(objQ);
                    }
                }
                h4.r rVarThen = rVar13.then(l4.k.e(aVar7, (e23.l) objQ));
                mVar16.f();
                return rVarThen;
            case 16:
                e23.p pVar = (e23.p) obj;
                p3.m mVar17 = (p3.m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                p006l2.s0 s0Var = p006l2.s0.f108756a;
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= mVar17.r(pVar) ? 4 : 2;
                }
                if (mVar17.n(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    x1 x1Var17 = p3.n.f135158a;
                    pVar.invoke(mVar17, Integer.valueOf(iIntValue14 & 14));
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 17:
                e23.p pVar2 = (e23.p) obj;
                p3.m mVar18 = (p3.m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                p006l2.s0 s0Var2 = p006l2.s0.f108756a;
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= mVar18.r(pVar2) ? 4 : 2;
                }
                if (mVar18.n(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    x1 x1Var18 = p3.n.f135158a;
                    pVar2.invoke(mVar18, Integer.valueOf(iIntValue15 & 14));
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 18:
                e23.p pVar3 = (e23.p) obj;
                p3.m mVar19 = (p3.m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                p006l2.s0 s0Var3 = p006l2.s0.f108756a;
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= mVar19.r(pVar3) ? 4 : 2;
                }
                if (mVar19.n(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    x1 x1Var19 = p3.n.f135158a;
                    pVar3.invoke(mVar19, Integer.valueOf(iIntValue16 & 14));
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 19:
                e23.p pVar4 = (e23.p) obj;
                p3.m mVar20 = (p3.m) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                p006l2.s0 s0Var4 = p006l2.s0.f108756a;
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= mVar20.r(pVar4) ? 4 : 2;
                }
                if (mVar20.n(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                    x1 x1Var20 = p3.n.f135158a;
                    pVar4.invoke(mVar20, Integer.valueOf(iIntValue17 & 14));
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 20:
                f5.b1 b1Var = (f5.b1) obj;
                int iF0 = b1Var.f0(l3.c.f109189a);
                int i45 = iF0 * 2;
                v1 v1VarQ = ((f5.y0) obj2).Q(g6.b.i(i45, 0, ((g6.a) obj3).f75988a));
                return f5.b1.h0(b1Var, v1VarQ.f69144a - i45, v1VarQ.f69145b, new a3.t0(v1VarQ, iF0, 2));
            case 21:
                f5.b1 b1Var2 = (f5.b1) obj;
                int iF1 = b1Var2.f0(l3.c.f109190b);
                int i46 = iF1 * 2;
                v1 v1VarQ2 = ((f5.y0) obj2).Q(g6.b.i(0, i46, ((g6.a) obj3).f75988a));
                return f5.b1.h0(b1Var2, v1VarQ2.f69144a, v1VarQ2.f69145b - i46, new a3.t0(v1VarQ2, iF1, 1));
            case 22:
                p3.m mVar21 = (p3.m) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                l71.a aVar8 = l71.a.f110840a;
                ((c2.t2) obj).getClass();
                if (mVar21.n(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    x1 x1Var21 = p3.n.f135158a;
                    String strQ3 = gl1.y.Q(mVar21, R.string.common_learn_more);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, s5.x0.a(d92.c.e(j92.f.f97933j), ds.e0.e(mVar21), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), mVar21, 0, 0, 131070);
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            case 23:
                h4.r rVar14 = (h4.r) obj;
                p3.m mVar22 = (p3.m) obj2;
                v.h.y(1618068840, rVar14, (Integer) obj3, mVar22);
                x1 x1Var22 = p3.n.f135158a;
                h4.r rVarA2 = l4.k.a(rVar14, 0.5f);
                mVar22.f();
                return rVarA2;
            case 24:
                h4.r rVar15 = (h4.r) obj;
                p3.m mVar23 = (p3.m) obj2;
                v.h.y(-916935071, rVar15, (Integer) obj3, mVar23);
                x1 x1Var23 = p3.n.f135158a;
                h4.r rVarA3 = l4.k.a(rVar15, 0.5f);
                mVar23.f();
                return rVarA3;
            case 25:
                h4.r rVar16 = (h4.r) obj;
                p3.m mVar24 = (p3.m) obj2;
                v.h.y(1344090933, rVar16, (Integer) obj3, mVar24);
                x1 x1Var24 = p3.n.f135158a;
                h4.r rVarA4 = l4.k.a(rVar16, 0.5f);
                mVar24.f();
                return rVarA4;
            case 26:
                h4.r rVar17 = (h4.r) obj;
                p3.m mVar25 = (p3.m) obj2;
                v.h.y(-526519716, rVar17, (Integer) obj3, mVar25);
                x1 x1Var25 = p3.n.f135158a;
                h4.r rVarA5 = l4.k.a(rVar17, 0.5f);
                mVar25.f();
                return rVarA5;
            case 27:
                h4.r rVar18 = (h4.r) obj;
                p3.m mVar26 = (p3.m) obj2;
                v.h.y(-1303964864, rVar18, (Integer) obj3, mVar26);
                x1 x1Var26 = p3.n.f135158a;
                h4.r rVarA6 = l4.k.a(rVar18, 0.5f);
                mVar26.f();
                return rVarA6;
            case 28:
                h4.r rVar19 = (h4.r) obj;
                p3.m mVar27 = (p3.m) obj2;
                v.h.y(-948169112, rVar19, (Integer) obj3, mVar27);
                x1 x1Var27 = p3.n.f135158a;
                h4.r rVarA7 = l4.k.a(rVar19, 0.5f);
                mVar27.f();
                return rVarA7;
            default:
                h4.r rVar20 = (h4.r) obj;
                p3.m mVar28 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                l72.s sVar2 = l72.s.f111232a;
                rVar20.getClass();
                mVar28.C(1508774614);
                x1 x1Var28 = p3.n.f135158a;
                h4.r rVarA8 = l4.k.a(rVar20, 0.5f);
                mVar28.f();
                return rVarA8;
        }
    }
}
