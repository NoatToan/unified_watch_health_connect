package sm1;

import com.garmin.android.apps.connectmobile.R;
import i3.e5;
import java.util.Iterator;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h82.r f160084b;

    public /* synthetic */ a(h82.r rVar, int i14) {
        this.f160083a = i14;
        this.f160084b = rVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = 2;
        int i15 = 1;
        switch (this.f160083a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                b bVar = b.f160103a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar, R.string.lbl_how_to_use_sleep_alignment);
                    h82.r rVar = this.f160084b;
                    rVar.s(0, 2, strQ, null, mVar);
                    rVar.q(gl1.y.Q(mVar, R.string.msg_how_to_use_sleep_alignment_paragraph_1), mVar, 0);
                    rVar.q(gl1.y.Q(mVar, R.string.msg_how_to_use_sleep_alignment_paragraph_2), mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i16 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h82.r rVar2 = this.f160084b;
                    rVar2.d(R.string.lbl_minimal_variations, 0, 2, null, mVar2);
                    rVar2.d(R.string.lbl_only_a_few_variations, 0, 2, null, mVar2);
                    rVar2.d(R.string.lbl_occasional_variations, 0, 2, null, mVar2);
                    rVar2.d(R.string.lbl_frequent_variations, 0, 2, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i17 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    Iterator it = p13.x.k(Integer.valueOf(R.string.gcm_body_battery_lbl_body_battery), Integer.valueOf(R.string.lbl_training_readiness_sentence_case), Integer.valueOf(R.string.ohrv_status), Integer.valueOf(R.string.lbl_heart_rate_cap), Integer.valueOf(R.string.lbl_daily_suggested_workouts)).iterator();
                    while (it.hasNext()) {
                        this.f160084b.d(((Number) it.next()).intValue(), 0, 2, null, mVar3);
                    }
                    x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i18 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    h82.r rVar3 = this.f160084b;
                    rVar3.D(R.string.lbl_sleep_timeline, mVar4, 0);
                    rVar3.l(R.string.msg_sleep_timeline_no_rem_intro_description, 0, 2, null, mVar4);
                    rVar3.o(R.string.msg_sleep_timeline_no_rem_additional_description, 0, 2, null, mVar4);
                    rVar3.o(R.string.msg_sleep_timeline_no_rem_recorded, 0, 2, null, mVar4);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i19 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    this.f160084b.o(R.string.msg_receive_feedback_on_factors, 0, 2, null, mVar5);
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i24 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    h82.r rVar4 = this.f160084b;
                    rVar4.t(R.string.txt_duration, mVar6, 0);
                    rVar4.o(R.string.msg_sleep_score_factor_duration_description, 0, 2, null, mVar6);
                } else {
                    mVar6.e();
                }
                break;
            case 6:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i25 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    h82.r rVar5 = this.f160084b;
                    rVar5.t(R.string.title_stress, mVar7, 0);
                    rVar5.o(R.string.msg_sleep_score_factor_stress_description, 0, 2, null, mVar7);
                } else {
                    mVar7.e();
                }
                break;
            case 7:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int i26 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    h82.r rVar6 = this.f160084b;
                    rVar6.t(R.string.sleep_lbl_deep, mVar8, 0);
                    rVar6.o(R.string.msg_sleep_score_factor_deep_description, 0, 2, null, mVar8);
                } else {
                    mVar8.e();
                }
                break;
            case 8:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                int i27 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    h82.r rVar7 = this.f160084b;
                    rVar7.t(R.string.sleep_lbl_light, mVar9, 0);
                    rVar7.o(R.string.msg_sleep_score_factor_light_description, 0, 2, null, mVar9);
                } else {
                    mVar9.e();
                }
                break;
            case 9:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                int i28 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    h82.r rVar8 = this.f160084b;
                    rVar8.t(R.string.sleep_lbl_rem, mVar10, 0);
                    rVar8.o(R.string.msg_sleep_score_factor_rem_description, 0, 2, null, mVar10);
                } else {
                    mVar10.e();
                }
                break;
            case 10:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                int i29 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    h82.r rVar9 = this.f160084b;
                    rVar9.t(R.string.lbl_awake_restlessness, mVar11, 0);
                    rVar9.q(e5.g(gl1.y.Q(mVar11, R.string.msg_sleep_score_factor_awake_restlessness_description), StringUtils.SPACE, gl1.y.Q(mVar11, R.string.msg_sleep_score_factor_awake_restlessness_guidelines_intro_description)), mVar11, 0);
                    rVar9.g(z3.f.c(-750686392, new j(rVar9, 4), mVar11), mVar11, 6);
                } else {
                    mVar11.e();
                }
                break;
            case 11:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                int i30 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    h82.r rVar10 = this.f160084b;
                    rVar10.t(R.string.sleep_lbl_deep, mVar12, 0);
                    rVar10.o(R.string.msg_sleep_timeline_stages_deep_description, 0, 2, null, mVar12);
                } else {
                    mVar12.e();
                }
                break;
            case 12:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                int i34 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    h82.r rVar11 = this.f160084b;
                    rVar11.t(R.string.sleep_lbl_light, mVar13, 0);
                    rVar11.o(R.string.msg_sleep_timeline_stages_light_description, 0, 2, null, mVar13);
                } else {
                    mVar13.e();
                }
                break;
            case 13:
                p3.m mVar14 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                int i35 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    h82.r rVar12 = this.f160084b;
                    rVar12.t(R.string.sleep_lbl_awake, mVar14, 0);
                    rVar12.o(R.string.msg_sleep_timeline_stages_awake_description, 0, 2, null, mVar14);
                } else {
                    mVar14.e();
                }
                break;
            case 14:
                p3.m mVar15 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                int i36 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var16 = p3.n.f135158a;
                    h82.r rVar13 = this.f160084b;
                    rVar13.t(R.string.sleep_help_manual_sleep_label, mVar15, 0);
                    rVar13.o(R.string.msg_sleep_timeline_stages_manual_description, 0, 2, null, mVar15);
                } else {
                    mVar15.e();
                }
                break;
            case 15:
                p3.m mVar16 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                int i37 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var17 = p3.n.f135158a;
                    h82.r rVar14 = this.f160084b;
                    rVar14.t(R.string.lbl_sleep_connecting_dots, mVar16, 0);
                    rVar14.o(R.string.msg_tracking_sleep_connecting_dots_desc_1, 0, 2, null, mVar16);
                    rVar14.o(R.string.msg_tracking_sleep_connecting_dots_desc_2, 0, 2, null, mVar16);
                    rVar14.g(z3.f.c(-738857780, new a(rVar14, i14), mVar16), mVar16, 6);
                } else {
                    mVar16.e();
                }
                break;
            case 16:
                p3.m mVar17 = (p3.m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                int i38 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var18 = p3.n.f135158a;
                    h82.r rVar15 = this.f160084b;
                    rVar15.t(R.string.lbl_sleep_knowledge_power, mVar17, 0);
                    rVar15.o(R.string.msg_tracking_sleep_knowledge_power_desc, 0, 2, null, mVar17);
                } else {
                    mVar17.e();
                }
                break;
            case 17:
                p3.m mVar18 = (p3.m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                int i39 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var19 = p3.n.f135158a;
                    h82.r rVar16 = this.f160084b;
                    rVar16.t(R.string.lbl_start_tracking_sleep, mVar18, 0);
                    rVar16.o(R.string.msg_start_tracking_sleep_desc_1, 0, 2, null, mVar18);
                } else {
                    mVar18.e();
                }
                break;
            case 18:
                p3.m mVar19 = (p3.m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                int i44 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar19.n(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x1 x1Var20 = p3.n.f135158a;
                    h82.r rVar17 = this.f160084b;
                    rVar17.t(R.string.lbl_training_load, mVar19, 0);
                    rVar17.o(R.string.msg_sleep_coach_training_load_description, 0, 2, null, mVar19);
                } else {
                    mVar19.e();
                }
                break;
            case 19:
                p3.m mVar20 = (p3.m) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                int i45 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar20.n(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    x1 x1Var21 = p3.n.f135158a;
                    h82.r rVar18 = this.f160084b;
                    rVar18.t(R.string.lbl_activity_history, mVar20, 0);
                    rVar18.o(R.string.msg_sleep_coach_activity_history_description, 0, 2, null, mVar20);
                } else {
                    mVar20.e();
                }
                break;
            case 20:
                p3.m mVar21 = (p3.m) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                int i46 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar21.n(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    x1 x1Var22 = p3.n.f135158a;
                    h82.r rVar19 = this.f160084b;
                    rVar19.t(R.string.ohrv_status, mVar21, 0);
                    rVar19.o(R.string.msg_sleep_coach_hrv_status_description_2, 0, 2, null, mVar21);
                    rVar19.o(R.string.msg_sleep_coach_hrv_status_calculation_description, 0, 2, null, mVar21);
                } else {
                    mVar21.e();
                }
                break;
            case 21:
                p3.m mVar22 = (p3.m) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                int i47 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar22.n(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    x1 x1Var23 = p3.n.f135158a;
                    h82.r rVar20 = this.f160084b;
                    rVar20.t(R.string.lbl_sleep_history, mVar22, 0);
                    rVar20.o(R.string.msg_sleep_coach_sleep_history_description, 0, 2, null, mVar22);
                } else {
                    mVar22.e();
                }
                break;
            case 22:
                p3.m mVar23 = (p3.m) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                int i48 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar23.n(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    x1 x1Var24 = p3.n.f135158a;
                    h82.r rVar21 = this.f160084b;
                    rVar21.t(R.string.lbl_naps, mVar23, 0);
                    rVar21.o(R.string.msg_sleep_coach_naps_description, 0, 2, null, mVar23);
                    rVar21.o(R.string.msg_sleep_coach_detecting_naps_description, 0, 2, null, mVar23);
                } else {
                    mVar23.e();
                }
                break;
            case 23:
                p3.m mVar24 = (p3.m) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                int i49 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar24.n(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    x1 x1Var25 = p3.n.f135158a;
                    h82.r rVar22 = this.f160084b;
                    rVar22.t(R.string.lbl_breathing_variations, mVar24, 0);
                    rVar22.o(R.string.msg_breathing_variations_paragraph_1, 0, 2, null, mVar24);
                    rVar22.g(z3.f.c(-965424840, new a(rVar22, i15), mVar24), mVar24, 6);
                    rVar22.o(R.string.msg_breathing_variations_paragraph_2, 0, 2, null, mVar24);
                } else {
                    mVar24.e();
                }
                break;
            case 24:
                p3.m mVar25 = (p3.m) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                int i54 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar25.n(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    x1 x1Var26 = p3.n.f135158a;
                    h82.r rVar23 = this.f160084b;
                    rVar23.t(R.string.lbl_skin_temp, mVar25, 0);
                    rVar23.o(R.string.msg_sleep_timeline_metrics_skin_temp_description, 0, 2, null, mVar25);
                } else {
                    mVar25.e();
                }
                break;
            case 25:
                p3.m mVar26 = (p3.m) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                int i55 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar26.n(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    x1 x1Var27 = p3.n.f135158a;
                    h82.r rVar24 = this.f160084b;
                    rVar24.t(R.string.lbl_awake_restlessness, mVar26, 0);
                    rVar24.o(R.string.msg_sleep_timeline_metrics_awake_restlessness_description, 0, 2, null, mVar26);
                } else {
                    mVar26.e();
                }
                break;
            case 26:
                p3.m mVar27 = (p3.m) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                int i56 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar27.n(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    x1 x1Var28 = p3.n.f135158a;
                    h82.r rVar25 = this.f160084b;
                    rVar25.t(R.string.lbl_movement, mVar27, 0);
                    rVar25.o(R.string.msg_sleep_timeline_metrics_movement_description, 0, 2, null, mVar27);
                } else {
                    mVar27.e();
                }
                break;
            case 27:
                p3.m mVar28 = (p3.m) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                int i57 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar28.n(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    x1 x1Var29 = p3.n.f135158a;
                    h82.r rVar26 = this.f160084b;
                    rVar26.t(R.string.lbl_heart_rate_cap, mVar28, 0);
                    rVar26.o(R.string.msg_sleep_timeline_metrics_heart_rate_description, 0, 2, null, mVar28);
                } else {
                    mVar28.e();
                }
                break;
            case 28:
                p3.m mVar29 = (p3.m) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                int i58 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar29.n(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    x1 x1Var30 = p3.n.f135158a;
                    h82.r rVar27 = this.f160084b;
                    rVar27.t(R.string.gcm_body_battery_lbl_body_battery, mVar29, 0);
                    rVar27.o(R.string.msg_sleep_timeline_metrics_body_battery_description, 0, 2, null, mVar29);
                    rVar27.o(R.string.msg_sleep_timeline_metrics_body_battery_description2, 0, 2, null, mVar29);
                } else {
                    mVar29.e();
                }
                break;
            default:
                p3.m mVar30 = (p3.m) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                int i59 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar30.n(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    x1 x1Var31 = p3.n.f135158a;
                    h82.r rVar28 = this.f160084b;
                    rVar28.t(R.string.device_settings_blood_ox, mVar30, 0);
                    rVar28.o(R.string.msg_sleep_timeline_metrics_pulse_ox_description_jp, 0, 2, null, mVar30);
                    rVar28.o(R.string.msg_sleep_timeline_metrics_pulse_ox_activation_description_jp, 0, 2, null, mVar30);
                } else {
                    mVar30.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
