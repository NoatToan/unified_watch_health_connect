package a42;

import aq.o3;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h82.r f1041b;

    public /* synthetic */ l(h82.r rVar, int i14) {
        this.f1040a = i14;
        this.f1041b = rVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1040a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s.a aVar = s.f1073g;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h82.r rVar = this.f1041b;
                    rVar.D(R.string.activities_training_effect_vo2_max, mVar, 0);
                    rVar.l(R.string.msg_vo2max_intro_help, 0, 2, null, mVar);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i14 = aq.h.f11972f;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h82.r rVar2 = this.f1041b;
                    rVar2.D(R.string.activity_summary_self_evaluation, mVar2, 0);
                    rVar2.l(R.string.workout_self_evaluation_help_intro, 0, 2, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                aq.k kVar = aq.k.f12027a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h82.r rVar3 = this.f1041b;
                    rVar3.t(R.string.lbl_crosscountry_skiing_cadence_glide_length_value, mVar3, 0);
                    rVar3.o(R.string.lbl_crosscountry_skiing_cadence_glide_length_value_body, 0, 2, null, mVar3);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i15 = o3.f12139h;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    h82.r rVar4 = this.f1041b;
                    rVar4.D(R.string.activity_details_training_effect, mVar4, 0);
                    rVar4.l(R.string.activities_training_effect_help_description, 0, 2, null, mVar4);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                bd0.o oVar = bd0.o.f17594a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    h82.r rVar5 = this.f1041b;
                    rVar5.t(R.string.smart_scale_device_setup_help_before_you_begin_title, mVar5, 0);
                    rVar5.o(R.string.smart_scale_device_setup_help_before_you_begin_message_a, 0, 2, null, mVar5);
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                bd0.o oVar2 = bd0.o.f17594a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    h82.r rVar6 = this.f1041b;
                    rVar6.t(R.string.smart_scale_device_setup_help_on_mobile_title, mVar6, 0);
                    rVar6.o(R.string.smart_scale_device_setup_help_on_mobile_message, 0, 2, null, mVar6);
                } else {
                    mVar6.e();
                }
                break;
            case 6:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                bd0.o oVar3 = bd0.o.f17594a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    h82.r rVar7 = this.f1041b;
                    rVar7.t(R.string.smart_scale_device_setup_help_on_a_computer_title, mVar7, 0);
                    rVar7.o(R.string.smart_scale_device_setup_help_on_a_computer_message, 0, 2, null, mVar7);
                } else {
                    mVar7.e();
                }
                break;
            case 7:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                bd0.o oVar4 = bd0.o.f17594a;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    h82.r rVar8 = this.f1041b;
                    rVar8.t(R.string.smart_scale_device_setup_help_on_a_router_title, mVar8, 0);
                    rVar8.o(R.string.smart_scale_device_setup_help_on_a_router_message, 0, 2, null, mVar8);
                } else {
                    mVar8.e();
                }
                break;
            case 8:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                int i16 = c70.c.f25219f;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    h82.r rVar9 = this.f1041b;
                    rVar9.t(R.string.lbl_cycling_ability_help_header_2, mVar9, 0);
                    rVar9.o(R.string.lbl_cycling_ability_help_paragraph_2_1, 0, 2, null, mVar9);
                    rVar9.g(z3.f.c(1576759172, new l(rVar9, 10), mVar9), mVar9, 6);
                    rVar9.o(R.string.lbl_cycling_ability_help_paragraph_2_3, 0, 2, null, mVar9);
                } else {
                    mVar9.e();
                }
                break;
            case 9:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                int i17 = c70.c.f25219f;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    h82.r rVar10 = this.f1041b;
                    rVar10.t(R.string.lbl_cycling_ability_help_header_4, mVar10, 0);
                    rVar10.o(R.string.lbl_cycling_ability_help_paragraph_4_1, 0, 2, null, mVar10);
                    rVar10.o(R.string.lbl_cycling_ability_help_paragraph_4_2, 0, 2, null, mVar10);
                } else {
                    mVar10.e();
                }
                break;
            case 10:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                int i18 = c70.c.f25219f;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    h82.r rVar11 = this.f1041b;
                    rVar11.d(R.string.lbl_cycling_ability_challenger, 0, 2, null, mVar11);
                    rVar11.d(R.string.lbl_cycling_ability_all_rounder, 0, 2, null, mVar11);
                    rVar11.d(R.string.lbl_cycling_ability_endurance_specialist, 0, 2, null, mVar11);
                    rVar11.d(R.string.lbl_cycling_ability_road_sprinter, 0, 2, null, mVar11);
                    rVar11.d(R.string.lbl_cycling_ability_flat_specialist, 0, 2, null, mVar11);
                    rVar11.d(R.string.lbl_cycling_ability_climber, 0, 2, null, mVar11);
                    rVar11.d(R.string.lbl_cycling_ability_puncheur, 0, 2, null, mVar11);
                    rVar11.d(R.string.lbl_cycling_ability_sprinter, 0, 2, null, mVar11);
                } else {
                    mVar11.e();
                }
                break;
            case 11:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                int i19 = cf1.b.f27017g;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    h82.r rVar12 = this.f1041b;
                    rVar12.d(R.string.running_economy_help_section2_body2_item1, 0, 2, null, mVar12);
                    rVar12.d(R.string.running_economy_help_section2_body2_item2, 0, 2, null, mVar12);
                    rVar12.d(R.string.running_economy_help_section2_body2_item3, 0, 2, null, mVar12);
                    rVar12.d(R.string.running_economy_help_section2_body2_item4, 0, 2, null, mVar12);
                    rVar12.d(R.string.running_economy_help_section2_body2_item5, 0, 2, null, mVar12);
                } else {
                    mVar12.e();
                }
                break;
            case 12:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                d52.a aVar2 = d52.a.f57559a;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    h82.r rVar13 = this.f1041b;
                    rVar13.t(R.string.lbl_pushes_in_garmin_connect, mVar13, 0);
                    rVar13.o(R.string.msg_help_pushes_in_garmin_connect, 0, 2, null, mVar13);
                } else {
                    mVar13.e();
                }
                break;
            case 13:
                p3.m mVar14 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                d52.a aVar3 = d52.a.f57559a;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    h82.r rVar14 = this.f1041b;
                    rVar14.t(R.string.lbl_push_daily_averages, mVar14, 0);
                    rVar14.o(R.string.msg_help_push_daily_averages, 0, 2, null, mVar14);
                } else {
                    mVar14.e();
                }
                break;
            case 14:
                p3.m mVar15 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                d52.a aVar4 = d52.a.f57559a;
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    h82.r rVar15 = this.f1041b;
                    rVar15.t(R.string.concept_personal_records, mVar15, 0);
                    rVar15.o(R.string.msg_help_pushes_personal_records, 0, 2, null, mVar15);
                } else {
                    mVar15.e();
                }
                break;
            case 15:
                p3.m mVar16 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                int i24 = dj0.h.f59916g;
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = p3.n.f135158a;
                    h82.r rVar16 = this.f1041b;
                    rVar16.D(R.string.device_settings_functional_threshold_power, mVar16, 0);
                    rVar16.m(0, 2, gl1.y.Q(mVar16, R.string.ftp_generic_feature_description), null, mVar16);
                } else {
                    mVar16.e();
                }
                break;
            case 16:
                p3.m mVar17 = (p3.m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                int i25 = dj0.h.f59916g;
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var17 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar17, R.string.ftp_generic_help_message_1);
                    h82.r rVar17 = this.f1041b;
                    rVar17.q(strQ, mVar17, 0);
                    rVar17.o(R.string.ftp_help_message_2, 0, 0, gl1.y.Q(mVar17, R.string.lbl_ftp_help_formula_vo), mVar17);
                    rVar17.o(R.string.ftp_help_message_7, 0, 2, null, mVar17);
                    rVar17.g(z3.f.c(1373264580, new l(rVar17, 17), mVar17), mVar17, 6);
                } else {
                    mVar17.e();
                }
                break;
            case 17:
                p3.m mVar18 = (p3.m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                int i26 = dj0.h.f59916g;
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var18 = p3.n.f135158a;
                    String strQ2 = gl1.y.Q(mVar18, R.string.ftp_help_bullet1);
                    h82.r rVar18 = this.f1041b;
                    rVar18.e(0, 2, strQ2, null, mVar18);
                    rVar18.d(R.string.ftp_help_message_5, 0, 2, null, mVar18);
                    rVar18.d(R.string.ftp_help_message_6, 0, 2, null, mVar18);
                } else {
                    mVar18.e();
                }
                break;
            case 18:
                p3.m mVar19 = (p3.m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                ds0.a aVar5 = ds0.a.f61065a;
                if (mVar19.n(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x1 x1Var19 = p3.n.f135158a;
                    h82.r rVar19 = this.f1041b;
                    rVar19.t(R.string.lbl_how_the_feature_works, mVar19, 0);
                    rVar19.o(R.string.msg_how_the_feature_works_paragraph_1_update_1, 0, 2, null, mVar19);
                    rVar19.o(R.string.msg_how_the_feature_works_paragraph_3, 0, 2, null, mVar19);
                } else {
                    mVar19.e();
                }
                break;
            case 19:
                p3.m mVar20 = (p3.m) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                ds0.a aVar6 = ds0.a.f61065a;
                if (mVar20.n(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    x1 x1Var20 = p3.n.f135158a;
                    h82.r rVar20 = this.f1041b;
                    rVar20.t(R.string.lbl_managing_your_trip_details, mVar20, 0);
                    rVar20.o(R.string.msg_managing_your_trip_details_paragraph, 0, 2, null, mVar20);
                } else {
                    mVar20.e();
                }
                break;
            case 20:
                p3.m mVar21 = (p3.m) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                int i27 = ds0.l.f61085f;
                if (mVar21.n(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    x1 x1Var21 = p3.n.f135158a;
                    h82.r rVar21 = this.f1041b;
                    rVar21.t(R.string.sleep_lbl_sleep, mVar21, 0);
                    rVar21.o(R.string.msg_jet_lag_sleep_paragraph_1, 0, 2, null, mVar21);
                    rVar21.o(R.string.msg_jet_lag_sleep_paragraph_2, 0, 2, null, mVar21);
                } else {
                    mVar21.e();
                }
                break;
            case 21:
                p3.m mVar22 = (p3.m) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                int i28 = ds0.l.f61085f;
                if (mVar22.n(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    x1 x1Var22 = p3.n.f135158a;
                    h82.r rVar22 = this.f1041b;
                    rVar22.t(R.string.lbl_activity_and_exercise, mVar22, 0);
                    rVar22.o(R.string.msg_jet_lag_activity_paragraph, 0, 2, null, mVar22);
                } else {
                    mVar22.e();
                }
                break;
            case 22:
                p3.m mVar23 = (p3.m) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                int i29 = ds0.l.f61085f;
                if (mVar23.n(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    x1 x1Var23 = p3.n.f135158a;
                    h82.r rVar23 = this.f1041b;
                    rVar23.t(R.string.lbl_naps, mVar23, 0);
                    rVar23.o(R.string.msg_naps_paragraph, 0, 2, null, mVar23);
                } else {
                    mVar23.e();
                }
                break;
            case 23:
                p3.m mVar24 = (p3.m) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                int i30 = ds0.l.f61085f;
                if (mVar24.n(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    x1 x1Var24 = p3.n.f135158a;
                    h82.r rVar24 = this.f1041b;
                    rVar24.t(R.string.title_caffeine, mVar24, 0);
                    rVar24.o(R.string.msg_caffeine_paragraph, 0, 2, null, mVar24);
                } else {
                    mVar24.e();
                }
                break;
            case 24:
                p3.m mVar25 = (p3.m) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                int i34 = ds0.l.f61085f;
                if (mVar25.n(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    x1 x1Var25 = p3.n.f135158a;
                    h82.r rVar25 = this.f1041b;
                    rVar25.t(R.string.lbl_nutrition, mVar25, 0);
                    rVar25.o(R.string.msg_nutrition_paragraph, 0, 2, null, mVar25);
                } else {
                    mVar25.e();
                }
                break;
            case 25:
                p3.m mVar26 = (p3.m) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                int i35 = ds0.l.f61085f;
                if (mVar26.n(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    x1 x1Var26 = p3.n.f135158a;
                    h82.r rVar26 = this.f1041b;
                    rVar26.D(R.string.lbl_jet_lag_advisor, mVar26, 0);
                    rVar26.l(R.string.jet_lag_main_help_intro, 0, 2, null, mVar26);
                } else {
                    mVar26.e();
                }
                break;
            case 26:
                p3.m mVar27 = (p3.m) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                int i36 = ds0.l.f61085f;
                if (mVar27.n(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    x1 x1Var27 = p3.n.f135158a;
                    h82.r rVar27 = this.f1041b;
                    rVar27.t(R.string.lbl_light_exposure, mVar27, 0);
                    rVar27.o(R.string.msg_light_exposure_paragraph, 0, 2, null, mVar27);
                } else {
                    mVar27.e();
                }
                break;
            case 27:
                p3.m mVar28 = (p3.m) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                int i37 = ds0.l.f61085f;
                if (mVar28.n(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    x1 x1Var28 = p3.n.f135158a;
                    h82.r rVar28 = this.f1041b;
                    rVar28.t(R.string.lbl_light_avoidance, mVar28, 0);
                    rVar28.o(R.string.msg_light_avoidance_paragraph, 0, 2, null, mVar28);
                } else {
                    mVar28.e();
                }
                break;
            case 28:
                p3.m mVar29 = (p3.m) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                fe1.b bVar = fe1.b.f70529a;
                if (mVar29.n(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    x1 x1Var29 = p3.n.f135158a;
                    h82.r rVar29 = this.f1041b;
                    rVar29.D(R.string.lbl_reading_your_daily_charts, mVar29, 0);
                    rVar29.l(R.string.msg_reading_your_daily_charts, 0, 2, null, mVar29);
                } else {
                    mVar29.e();
                }
                break;
            default:
                p3.m mVar30 = (p3.m) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                fe1.b bVar2 = fe1.b.f70529a;
                if (mVar30.n(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    x1 x1Var30 = p3.n.f135158a;
                    h82.r rVar30 = this.f1041b;
                    rVar30.D(R.string.lbl_tracking_your_breathing, mVar30, 0);
                    rVar30.l(R.string.lbl_receiving_respiration_data_help_intro, 0, 2, null, mVar30);
                } else {
                    mVar30.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
