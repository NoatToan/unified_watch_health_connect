package pk1;

import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h82.r f138290b;

    public /* synthetic */ g(h82.r rVar, int i14) {
        this.f138289a = i14;
        this.f138290b = rVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f138289a;
        h82.r rVar = this.f138290b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                k.a aVar = k.f138297g;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h82.r rVar2 = this.f138290b;
                    rVar2.D(R.string.lbl_understanding_user_settings, mVar, 0);
                    rVar2.l(R.string.msg_understanding_user_settings, 0, 2, null, mVar);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                pq1.a aVar2 = pq1.a.f139563a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h82.r rVar3 = this.f138290b;
                    rVar3.t(R.string.lbl_steps_in_garmin_connect, mVar2, 0);
                    rVar3.o(R.string.msg_help_steps_in_garmin_connect, 0, 2, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                pq1.a aVar3 = pq1.a.f139563a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h82.r rVar4 = this.f138290b;
                    rVar4.t(R.string.lbl_step_daily_averages, mVar3, 0);
                    rVar4.o(R.string.msg_help_step_daily_averages, 0, 2, null, mVar3);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                pq1.a aVar4 = pq1.a.f139563a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    h82.r rVar5 = this.f138290b;
                    rVar5.t(R.string.concept_personal_records, mVar4, 0);
                    rVar5.o(R.string.msg_help_steps_personal_records, 0, 2, null, mVar4);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i15 = q42.p.f142668f;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    h82.r rVar6 = this.f138290b;
                    rVar6.D(R.string.title_weight_metrics, mVar5, 0);
                    rVar6.l(R.string.smart_scale_provided_metrics_message, 0, 2, null, mVar5);
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                qk1.b bVar = qk1.b.f145170a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    h82.r rVar7 = this.f138290b;
                    rVar7.t(R.string.wheelchair_mode_help_title2, mVar6, 0);
                    rVar7.o(R.string.wheelchair_mode_help_desc2_para1, 0, 2, null, mVar6);
                    rVar7.o(R.string.wheelchair_mode_help_desc2_para2, 0, 2, null, mVar6);
                } else {
                    mVar6.e();
                }
                break;
            case 6:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                qk1.b bVar2 = qk1.b.f145170a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    h82.r rVar8 = this.f138290b;
                    rVar8.t(R.string.wheelchair_mode_help_title3, mVar7, 0);
                    rVar8.o(R.string.wheelchair_mode_help_desc3, 0, 2, null, mVar7);
                } else {
                    mVar7.e();
                }
                break;
            case 7:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                qn0.a aVar5 = qn0.a.f145781a;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar8, R.string.lbl_illness);
                    h82.r rVar9 = this.f138290b;
                    rVar9.e(0, 2, strQ, null, mVar8);
                    rVar9.e(0, 2, gl1.y.Q(mVar8, R.string.lbl_late_or_heavy_physical_exertion), null, mVar8);
                    rVar9.e(0, 2, gl1.y.Q(mVar8, R.string.lbl_lack_of_physical_exertion), null, mVar8);
                    rVar9.e(0, 2, gl1.y.Q(mVar8, R.string.lbl_poor_or_hot_sleep_environment), null, mVar8);
                    rVar9.e(0, 2, gl1.y.Q(mVar8, R.string.lbl_change_in_menstrual_cycle_phase), null, mVar8);
                } else {
                    mVar8.e();
                }
                break;
            case 8:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                qn0.a aVar6 = qn0.a.f145781a;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    String strQ2 = gl1.y.Q(mVar9, R.string.lbl_temperature_changes);
                    h82.r rVar10 = this.f138290b;
                    rVar10.E(strQ2, mVar9, 0);
                    rVar10.l(R.string.msg_sleep_timeline_metrics_skin_temp_description, 0, 2, null, mVar9);
                } else {
                    mVar9.e();
                }
                break;
            case 9:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                qn0.a aVar7 = qn0.a.f145781a;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    String strQ3 = gl1.y.Q(mVar10, R.string.lbl_understanding_outliers);
                    h82.r rVar11 = this.f138290b;
                    rVar11.s(0, 2, strQ3, null, mVar10);
                    rVar11.q(gl1.y.Q(mVar10, R.string.msg_understanding_skin_temp_outliers_1), mVar10, 0);
                    rVar11.g(z3.f.c(-1512602155, new g(rVar11, 7), mVar10), mVar10, 6);
                    rVar11.q(gl1.y.Q(mVar10, R.string.msg_understanding_metric_outliers), mVar10, 0);
                } else {
                    mVar10.e();
                }
                break;
            case 10:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                qn0.a aVar8 = qn0.a.f145781a;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    String strQ4 = gl1.y.Q(mVar11, R.string.lbl_your_breathing_rate);
                    h82.r rVar12 = this.f138290b;
                    rVar12.E(strQ4, mVar11, 0);
                    rVar12.m(0, 2, gl1.y.Q(mVar11, R.string.msg_your_breathing_rate_intro), null, mVar11);
                } else {
                    mVar11.e();
                }
                break;
            case 11:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                qn0.a aVar9 = qn0.a.f145781a;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    String strQ5 = gl1.y.Q(mVar12, R.string.lbl_understanding_outliers);
                    h82.r rVar13 = this.f138290b;
                    rVar13.s(0, 2, strQ5, null, mVar12);
                    rVar13.q(gl1.y.Q(mVar12, R.string.msg_understanding_respiration_outliers_1), mVar12, 0);
                    rVar13.g(z3.f.c(-1219105748, new g(rVar13, 14), mVar12), mVar12, 6);
                    rVar13.q(gl1.y.Q(mVar12, R.string.msg_understanding_metric_outliers), mVar12, 0);
                } else {
                    mVar12.e();
                }
                break;
            case 12:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                qn0.a aVar10 = qn0.a.f145781a;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    String strQ6 = gl1.y.Q(mVar13, R.string.lbl_your_rate_while_sleeping);
                    h82.r rVar14 = this.f138290b;
                    rVar14.E(strQ6, mVar13, 0);
                    rVar14.m(0, 2, gl1.y.Q(mVar13, R.string.msg_your_rate_while_sleeping), null, mVar13);
                } else {
                    mVar13.e();
                }
                break;
            case 13:
                p3.m mVar14 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                qn0.a aVar11 = qn0.a.f145781a;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    String strQ7 = gl1.y.Q(mVar14, R.string.lbl_understanding_outliers);
                    h82.r rVar15 = this.f138290b;
                    rVar15.s(0, 2, strQ7, null, mVar14);
                    rVar15.q(gl1.y.Q(mVar14, R.string.msg_understanding_heart_rate_outliers_1), mVar14, 0);
                    rVar15.g(z3.f.c(-464091306, new g(rVar15, 16), mVar14), mVar14, 6);
                    rVar15.q(gl1.y.Q(mVar14, R.string.msg_understanding_metric_outliers), mVar14, 0);
                } else {
                    mVar14.e();
                }
                break;
            case 14:
                p3.m mVar15 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                qn0.a aVar12 = qn0.a.f145781a;
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    String strQ8 = gl1.y.Q(mVar15, R.string.lbl_illness);
                    h82.r rVar16 = this.f138290b;
                    rVar16.e(0, 2, strQ8, null, mVar15);
                    rVar16.e(0, 2, gl1.y.Q(mVar15, R.string.lbl_lack_of_recovery), null, mVar15);
                    rVar16.e(0, 2, gl1.y.Q(mVar15, R.string.lbl_heavy_exertion), null, mVar15);
                    rVar16.e(0, 2, gl1.y.Q(mVar15, R.string.lbl_deeper_sleep), null, mVar15);
                    rVar16.e(0, 2, gl1.y.Q(mVar15, R.string.lbl_breathing_problems_during_sleep), null, mVar15);
                } else {
                    mVar15.e();
                }
                break;
            case 15:
                p3.m mVar16 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                qn0.a aVar13 = qn0.a.f145781a;
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = p3.n.f135158a;
                    String strQ9 = gl1.y.Q(mVar16, R.string.lbl_illness);
                    h82.r rVar17 = this.f138290b;
                    rVar17.e(0, 2, strQ9, null, mVar16);
                    rVar17.e(0, 2, gl1.y.Q(mVar16, R.string.lbl_high_stress), null, mVar16);
                    rVar17.e(0, 2, gl1.y.Q(mVar16, R.string.lbl_lack_of_recovery), null, mVar16);
                    rVar17.e(0, 2, gl1.y.Q(mVar16, R.string.lbl_alcohol_or_caffeine_usage), null, mVar16);
                    rVar17.e(0, 2, gl1.y.Q(mVar16, R.string.lbl_a_late_heavy_meal), null, mVar16);
                    rVar17.e(0, 2, gl1.y.Q(mVar16, R.string.lbl_dehydration), null, mVar16);
                    rVar17.e(0, 2, gl1.y.Q(mVar16, R.string.lbl_change_in_menstrual_cycle_phase), null, mVar16);
                    rVar17.d(R.string.lbl_jet_lag, 0, 2, null, mVar16);
                    rVar17.e(0, 2, gl1.y.Q(mVar16, R.string.lbl_change_in_sleep_quality), null, mVar16);
                } else {
                    mVar16.e();
                }
                break;
            case 16:
                p3.m mVar17 = (p3.m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                qn0.a aVar14 = qn0.a.f145781a;
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var17 = p3.n.f135158a;
                    String strQ10 = gl1.y.Q(mVar17, R.string.lbl_illness);
                    h82.r rVar18 = this.f138290b;
                    rVar18.e(0, 2, strQ10, null, mVar17);
                    rVar18.e(0, 2, gl1.y.Q(mVar17, R.string.lbl_high_stress), null, mVar17);
                    rVar18.e(0, 2, gl1.y.Q(mVar17, R.string.lbl_lack_of_recovery), null, mVar17);
                    rVar18.e(0, 2, gl1.y.Q(mVar17, R.string.lbl_alcohol_or_caffeine_usage), null, mVar17);
                    rVar18.e(0, 2, gl1.y.Q(mVar17, R.string.lbl_a_late_heavy_meal), null, mVar17);
                    rVar18.e(0, 2, gl1.y.Q(mVar17, R.string.lbl_change_in_menstrual_cycle_phase), null, mVar17);
                    rVar18.d(R.string.lbl_jet_lag, 0, 2, null, mVar17);
                    rVar18.e(0, 2, gl1.y.Q(mVar17, R.string.lbl_change_in_sleep_quality), null, mVar17);
                } else {
                    mVar17.e();
                }
                break;
            case 17:
                p3.m mVar18 = (p3.m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                qn0.a aVar15 = qn0.a.f145781a;
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var18 = p3.n.f135158a;
                    String strQ11 = gl1.y.Q(mVar18, R.string.lbl_overnight_variability);
                    h82.r rVar19 = this.f138290b;
                    rVar19.E(strQ11, mVar18, 0);
                    rVar19.m(0, 2, gl1.y.Q(mVar18, R.string.msg_overnight_variability_intro), null, mVar18);
                } else {
                    mVar18.e();
                }
                break;
            case 18:
                p3.m mVar19 = (p3.m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                qn0.a aVar16 = qn0.a.f145781a;
                if (mVar19.n(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x1 x1Var19 = p3.n.f135158a;
                    String strQ12 = gl1.y.Q(mVar19, R.string.lbl_understanding_outliers);
                    h82.r rVar20 = this.f138290b;
                    rVar20.s(0, 2, strQ12, null, mVar19);
                    rVar20.q(gl1.y.Q(mVar19, R.string.msg_understanding_hrv_outliers_1), mVar19, 0);
                    rVar20.g(z3.f.c(-988806852, new g(rVar20, 15), mVar19), mVar19, 6);
                    rVar20.q(gl1.y.Q(mVar19, R.string.msg_understanding_metric_outliers), mVar19, 0);
                } else {
                    mVar19.e();
                }
                break;
            case 19:
                p3.m mVar20 = (p3.m) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                int i16 = qn0.i.f145805f;
                if (mVar20.n(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    x1 x1Var20 = p3.n.f135158a;
                    String strQ13 = gl1.y.Q(mVar20, R.string.lbl_understanding_your_health_status);
                    h82.r rVar21 = this.f138290b;
                    rVar21.E(strQ13, mVar20, 0);
                    rVar21.m(0, 2, gl1.y.Q(mVar20, R.string.msg_understanding_your_health_status), null, mVar20);
                } else {
                    mVar20.e();
                }
                break;
            case 20:
                p3.m mVar21 = (p3.m) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                int i17 = qn0.i.f145805f;
                if (mVar21.n(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    x1 x1Var21 = p3.n.f135158a;
                    String strQ14 = gl1.y.Q(mVar21, R.string.lbl_establishing_ranges);
                    h82.r rVar22 = this.f138290b;
                    rVar22.s(0, 2, strQ14, null, mVar21);
                    rVar22.q(gl1.y.Q(mVar21, R.string.msg_establishing_ranges), mVar21, 0);
                } else {
                    mVar21.e();
                }
                break;
            case 21:
                p3.m mVar22 = (p3.m) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                int i18 = qn0.i.f145805f;
                if (mVar22.n(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    x1 x1Var22 = p3.n.f135158a;
                    String strQ15 = gl1.y.Q(mVar22, R.string.lbl_reading_your_reports);
                    h82.r rVar23 = this.f138290b;
                    rVar23.s(0, 2, strQ15, null, mVar22);
                    rVar23.q(gl1.y.Q(mVar22, R.string.msg_health_status_reading_your_reports_1), mVar22, 0);
                    rVar23.q(gl1.y.Q(mVar22, R.string.msg_health_status_reading_your_reports_2), mVar22, 0);
                } else {
                    mVar22.e();
                }
                break;
            case 22:
                p3.m mVar23 = (p3.m) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                int i19 = qn0.i.f145805f;
                if (mVar23.n(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    x1 x1Var23 = p3.n.f135158a;
                    String strQ16 = gl1.y.Q(mVar23, R.string.lbl_health_status);
                    h82.r rVar24 = this.f138290b;
                    rVar24.E(strQ16, mVar23, 0);
                    rVar24.m(0, 2, gl1.y.Q(mVar23, R.string.msg_health_status_help_intro), null, mVar23);
                } else {
                    mVar23.e();
                }
                break;
            case 23:
                p3.m mVar24 = (p3.m) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                int i24 = qn0.i.f145805f;
                if (mVar24.n(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    x1 x1Var24 = p3.n.f135158a;
                    String strQ17 = gl1.y.Q(mVar24, R.string.lbl_illness_or_infection);
                    h82.r rVar25 = this.f138290b;
                    rVar25.e(0, 2, strQ17, null, mVar24);
                    rVar25.e(0, 2, gl1.y.Q(mVar24, R.string.lbl_high_altitude), null, mVar24);
                    rVar25.e(0, 2, gl1.y.Q(mVar24, R.string.lbl_poor_air_quality), null, mVar24);
                    rVar25.e(0, 2, gl1.y.Q(mVar24, R.string.lbl_alcohol_use), null, mVar24);
                    rVar25.e(0, 2, gl1.y.Q(mVar24, R.string.lbl_breathing_problems_during_sleep), null, mVar24);
                } else {
                    mVar24.e();
                }
                break;
            case 24:
                p3.m mVar25 = (p3.m) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                int i25 = rg0.d.f152524f;
                if (mVar25.n(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    x1 x1Var25 = p3.n.f135158a;
                    h82.r rVar26 = this.f138290b;
                    rVar26.D(R.string.account_access, mVar25, 0);
                    rVar26.l(R.string.if_invite_user_to_view, 0, 2, null, mVar25);
                } else {
                    mVar25.e();
                }
                break;
            case 25:
                p3.m mVar26 = (p3.m) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                int i26 = s52.g.f157408g;
                if (mVar26.n(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    x1 x1Var26 = p3.n.f135158a;
                    rVar.t(R.string.lbl_value_of_benchmarks, mVar26, 0);
                    if (((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y()) {
                        mVar26.C(-168323352);
                        rVar.q(gl1.y.P(R.string.msg_using_benchmarks_formula_example, new Object[]{gl1.y.P(R.string.lbl_kilograms_param, new Object[]{"100"}, mVar26), gl1.y.P(R.string.lbl_kilograms_param, new Object[]{"50"}, mVar26), gl1.y.P(R.string.lbl_kilograms_param, new Object[]{"60"}, mVar26), gl1.y.P(R.string.lbl_kilograms_param, new Object[]{"70"}, mVar26)}, mVar26), mVar26, 0);
                        mVar26.f();
                    } else {
                        mVar26.C(-167719162);
                        rVar.q(gl1.y.P(R.string.msg_using_benchmarks_formula_example, new Object[]{gl1.y.P(R.string.lbl_pounds_param, new Object[]{"200"}, mVar26), gl1.y.P(R.string.lbl_kilograms_param, new Object[]{"100"}, mVar26), gl1.y.P(R.string.lbl_kilograms_param, new Object[]{"120"}, mVar26), gl1.y.P(R.string.lbl_kilograms_param, new Object[]{"140"}, mVar26)}, mVar26), mVar26, 0);
                        mVar26.f();
                    }
                } else {
                    mVar26.e();
                }
                break;
            case 26:
                p3.m mVar27 = (p3.m) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                int i27 = s52.g.f157408g;
                if (mVar27.n(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    x1 x1Var27 = p3.n.f135158a;
                    h82.r rVar27 = this.f138290b;
                    rVar27.t(R.string.lbl_linked_exercises, mVar27, 0);
                    rVar27.o(R.string.msg_using_benchmarks_linked_exercises, 0, 2, null, mVar27);
                } else {
                    mVar27.e();
                }
                break;
            case 27:
                p3.m mVar28 = (p3.m) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                int i28 = s52.g.f157408g;
                if (mVar28.n(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    x1 x1Var28 = p3.n.f135158a;
                    h82.r rVar28 = this.f138290b;
                    rVar28.t(R.string.lbl_safety_caution, mVar28, 0);
                    rVar28.o(R.string.msg_using_benchmarks_disclaimer, 0, 2, null, mVar28);
                } else {
                    mVar28.e();
                }
                break;
            case 28:
                p3.m mVar29 = (p3.m) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                sg0.w wVar = sg0.w.f159176a;
                if (mVar29.n(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    x1 x1Var29 = p3.n.f135158a;
                    rVar.E(gl1.y.Q(mVar29, R.string.lbl_child_accounts), mVar29, 0);
                } else {
                    mVar29.e();
                }
                break;
            default:
                p3.m mVar30 = (p3.m) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                sm1.b bVar3 = sm1.b.f160103a;
                if (mVar30.n(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    x1 x1Var30 = p3.n.f135158a;
                    String strQ18 = gl1.y.Q(mVar30, R.string.lbl_understanding_internal_rhythm);
                    h82.r rVar29 = this.f138290b;
                    rVar29.s(0, 2, strQ18, null, mVar30);
                    rVar29.q(gl1.y.Q(mVar30, R.string.msg_understanding_internal_rhythm_paragraph_1), mVar30, 0);
                    rVar29.q(gl1.y.Q(mVar30, R.string.msg_understanding_internal_rhythm_paragraph_2), mVar30, 0);
                } else {
                    mVar30.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
