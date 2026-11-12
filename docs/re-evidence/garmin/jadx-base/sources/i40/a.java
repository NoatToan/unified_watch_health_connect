package i40;

import com.garmin.android.apps.connectmobile.R;
import e23.p;
import h82.r;
import ix0.i;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f90889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f90890b;

    public /* synthetic */ a(r rVar, int i14) {
        this.f90889a = i14;
        this.f90890b = rVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = 6;
        switch (this.f90889a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                b bVar = b.f90891a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r rVar = this.f90890b;
                    rVar.t(R.string.lbl_map_layers, mVar, 0);
                    rVar.o(R.string.msg_map_layers_help, 0, 2, null, mVar);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                b bVar2 = b.f90891a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r rVar2 = this.f90890b;
                    rVar2.t(R.string.workout_lbl_duplicate, mVar2, 0);
                    rVar2.o(R.string.msg_duplicate_help, 0, 2, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                c cVar = c.f90893a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    r rVar3 = this.f90890b;
                    rVar3.t(R.string.lbl_course_points, mVar3, 0);
                    rVar3.o(R.string.msg_course_points_help, 0, 2, null, mVar3);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                c cVar2 = c.f90893a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    r rVar4 = this.f90890b;
                    rVar4.t(R.string.lbl_map_layers, mVar4, 0);
                    rVar4.o(R.string.msg_map_layers_help, 0, 2, null, mVar4);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                c cVar3 = c.f90893a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    r rVar5 = this.f90890b;
                    rVar5.t(R.string.workout_lbl_duplicate, mVar5, 0);
                    rVar5.o(R.string.msg_duplicate_help, 0, 2, null, mVar5);
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                c cVar4 = c.f90893a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    r rVar6 = this.f90890b;
                    rVar6.t(R.string.lbl_speed_pace_calculator, mVar6, 0);
                    rVar6.o(R.string.msg_speed_pace_calculator_help, 0, 2, null, mVar6);
                } else {
                    mVar6.e();
                }
                break;
            case 6:
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ih0.b bVar3 = ih0.b.f93443a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    r rVar7 = this.f90890b;
                    rVar7.d(R.string.lbl_vigorous_activity, 0, 2, null, mVar7);
                    rVar7.d(R.string.resting_heart_rate, 0, 2, null, mVar7);
                    rVar7.d(R.string.lbl_body_fat_bmi, 0, 2, null, mVar7);
                } else {
                    mVar7.e();
                }
                break;
            case 7:
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ih0.b bVar4 = ih0.b.f93443a;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    r rVar8 = this.f90890b;
                    rVar8.t(R.string.lbl_action_steps, mVar8, 0);
                    rVar8.o(R.string.msg_fitness_age_action_steps, 0, 2, null, mVar8);
                } else {
                    mVar8.e();
                }
                break;
            case 8:
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ih0.b bVar5 = ih0.b.f93443a;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    r rVar9 = this.f90890b;
                    rVar9.d(R.string.resting_heart_rate, 0, 2, null, mVar9);
                    rVar9.d(R.string.msg_body_fat_or_height_and_weight, 0, 2, null, mVar9);
                } else {
                    mVar9.e();
                }
                break;
            case 9:
                m mVar10 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                ih0.b bVar6 = ih0.b.f93443a;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    r rVar10 = this.f90890b;
                    rVar10.o(R.string.msg_data_required_fitness_age, 0, 2, null, mVar10);
                    rVar10.g(f.c(806931807, new a(rVar10, 8), mVar10), mVar10, 6);
                } else {
                    mVar10.e();
                }
                break;
            case 10:
                m mVar11 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                ih0.b bVar7 = ih0.b.f93443a;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    r rVar11 = this.f90890b;
                    rVar11.t(R.string.lbl_stale_weight_data, mVar11, 0);
                    rVar11.o(R.string.msg_fitness_age_new_weight_data, 0, 2, null, mVar11);
                } else {
                    mVar11.e();
                }
                break;
            case 11:
                m mVar12 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                ih0.b bVar8 = ih0.b.f93443a;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    r rVar12 = this.f90890b;
                    rVar12.t(R.string.lbl_age_related_restrictions, mVar12, 0);
                    rVar12.o(R.string.msg_fitness_age_age_related_restrictions, 0, 2, null, mVar12);
                } else {
                    mVar12.e();
                }
                break;
            case 12:
                m mVar13 = (m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                ih0.b bVar9 = ih0.b.f93443a;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    r rVar13 = this.f90890b;
                    rVar13.t(R.string.pregnancy_title, mVar13, 0);
                    rVar13.o(R.string.msg_fitness_age_pregnancy_pause, 0, 2, null, mVar13);
                    rVar13.o(R.string.msg_fitness_age_pregnancy_resume, 0, 2, null, mVar13);
                } else {
                    mVar13.e();
                }
                break;
            case 13:
                m mVar14 = (m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                ih0.b bVar10 = ih0.b.f93443a;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = n.f135158a;
                    r rVar14 = this.f90890b;
                    rVar14.o(R.string.msg_fitness_age_factors, 0, 2, null, mVar14);
                    rVar14.g(f.c(253557373, new a(rVar14, i14), mVar14), mVar14, 6);
                } else {
                    mVar14.e();
                }
                break;
            case 14:
                m mVar15 = (m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                int i15 = ih0.m.f93463f;
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = n.f135158a;
                    r rVar15 = this.f90890b;
                    rVar15.D(R.string.lbl_fitness_age, mVar15, 0);
                    rVar15.l(R.string.msg_fitness_age_definition, 0, 2, null, mVar15);
                } else {
                    mVar15.e();
                }
                break;
            case 15:
                m mVar16 = (m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                ij1.a aVar = ij1.a.f93817a;
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = n.f135158a;
                    r rVar16 = this.f90890b;
                    rVar16.t(R.string.setting_a_device_priority, mVar16, 0);
                    rVar16.o(R.string.primary_training_device_help_description, 0, 2, null, mVar16);
                    rVar16.o(R.string.primary_wearable_help_recommendation, 0, 2, null, mVar16);
                } else {
                    mVar16.e();
                }
                break;
            case 16:
                m mVar17 = (m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                ij1.a aVar2 = ij1.a.f93817a;
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var17 = n.f135158a;
                    r rVar17 = this.f90890b;
                    rVar17.t(R.string.incompatible_devices, mVar17, 0);
                    rVar17.o(R.string.primary_training_device_disclaimer, 0, 2, null, mVar17);
                } else {
                    mVar17.e();
                }
                break;
            case 17:
                m mVar18 = (m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                ix0.a aVar3 = ix0.a.f95672a;
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var18 = n.f135158a;
                    r rVar18 = this.f90890b;
                    rVar18.d(R.string.mct_phase_1, 0, 2, null, mVar18);
                    rVar18.d(R.string.mct_phase_2, 0, 2, null, mVar18);
                    rVar18.d(R.string.mct_phase_3, 0, 2, null, mVar18);
                    rVar18.d(R.string.mct_phase_4, 0, 2, null, mVar18);
                } else {
                    mVar18.e();
                }
                break;
            case 18:
                m mVar19 = (m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                ix0.a aVar4 = ix0.a.f95672a;
                if (mVar19.n(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x1 x1Var19 = n.f135158a;
                    r rVar19 = this.f90890b;
                    rVar19.t(R.string.pregnancy_help_talk_to_your_doctor_title, mVar19, 0);
                    rVar19.o(R.string.pregnancy_help_talk_to_your_doctor_body, 0, 2, null, mVar19);
                } else {
                    mVar19.e();
                }
                break;
            case 19:
                m mVar20 = (m) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                ix0.a aVar5 = ix0.a.f95672a;
                if (mVar20.n(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    x1 x1Var20 = n.f135158a;
                    r rVar20 = this.f90890b;
                    rVar20.o(R.string.mct_menstrual_cycle_body_1, 0, 2, null, mVar20);
                    rVar20.o(R.string.mct_menstrual_cycle_body_2, 0, 2, null, mVar20);
                } else {
                    mVar20.e();
                }
                break;
            case 20:
                m mVar21 = (m) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                ix0.a aVar6 = ix0.a.f95672a;
                if (mVar21.n(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    x1 x1Var21 = n.f135158a;
                    r rVar21 = this.f90890b;
                    rVar21.t(R.string.mct_cycle_phases, mVar21, 0);
                    rVar21.o(R.string.mct_a_typical_menstrual, 0, 2, null, mVar21);
                    rVar21.g(f.c(1140031614, new a(rVar21, 17), mVar21), mVar21, 6);
                } else {
                    mVar21.e();
                }
                break;
            case 21:
                m mVar22 = (m) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                ix0.a aVar7 = ix0.a.f95672a;
                if (mVar22.n(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    x1 x1Var22 = n.f135158a;
                    r rVar22 = this.f90890b;
                    rVar22.t(R.string.mct_phase_1, mVar22, 0);
                    rVar22.o(R.string.mct_menstruation_body_1, 0, 2, null, mVar22);
                    rVar22.o(R.string.mct_menstruation_body_2, 0, 2, null, mVar22);
                } else {
                    mVar22.e();
                }
                break;
            case 22:
                m mVar23 = (m) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                ix0.a aVar8 = ix0.a.f95672a;
                if (mVar23.n(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    x1 x1Var23 = n.f135158a;
                    r rVar23 = this.f90890b;
                    rVar23.t(R.string.mct_phase_2, mVar23, 0);
                    rVar23.o(R.string.mct_follicular_body_1, 0, 2, null, mVar23);
                    rVar23.o(R.string.mct_follicular_body_2, 0, 2, null, mVar23);
                } else {
                    mVar23.e();
                }
                break;
            case 23:
                m mVar24 = (m) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                ix0.a aVar9 = ix0.a.f95672a;
                if (mVar24.n(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    x1 x1Var24 = n.f135158a;
                    r rVar24 = this.f90890b;
                    rVar24.t(R.string.mct_phase_3, mVar24, 0);
                    rVar24.o(R.string.mct_ovulation_body_1, 0, 2, null, mVar24);
                    rVar24.o(R.string.mct_ovulation_body_2, 0, 2, null, mVar24);
                } else {
                    mVar24.e();
                }
                break;
            case 24:
                m mVar25 = (m) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                ix0.a aVar10 = ix0.a.f95672a;
                if (mVar25.n(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    x1 x1Var25 = n.f135158a;
                    r rVar25 = this.f90890b;
                    rVar25.t(R.string.mct_phase_4, mVar25, 0);
                    rVar25.o(R.string.mct_luteal_body_1, 0, 2, null, mVar25);
                    rVar25.o(R.string.mct_luteal_body_2, 0, 2, null, mVar25);
                } else {
                    mVar25.e();
                }
                break;
            case 25:
                m mVar26 = (m) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                ix0.a aVar11 = ix0.a.f95672a;
                if (mVar26.n(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    x1 x1Var26 = n.f135158a;
                    r rVar26 = this.f90890b;
                    rVar26.t(R.string.pregnancy_help_updated_weekly_title, mVar26, 0);
                    rVar26.o(R.string.pregnancy_help_updated_weekly_body, 0, 2, null, mVar26);
                } else {
                    mVar26.e();
                }
                break;
            case 26:
                m mVar27 = (m) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                int i16 = i.f95700f;
                if (mVar27.n(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    x1 x1Var27 = n.f135158a;
                    r rVar27 = this.f90890b;
                    rVar27.D(R.string.mct_menstrual_cycle_tracking, mVar27, 0);
                    rVar27.l(R.string.mct_log_your_cycle_details, 0, 2, null, mVar27);
                } else {
                    mVar27.e();
                }
                break;
            case 27:
                m mVar28 = (m) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                int i17 = i.f95700f;
                if (mVar28.n(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    x1 x1Var28 = n.f135158a;
                    r rVar28 = this.f90890b;
                    rVar28.t(R.string.mct_regular, mVar28, 0);
                    rVar28.o(R.string.mct_regular_body_1, 0, 2, null, mVar28);
                    rVar28.o(R.string.mct_regular_body_2, 0, 2, null, mVar28);
                } else {
                    mVar28.e();
                }
                break;
            case 28:
                m mVar29 = (m) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                int i18 = i.f95700f;
                if (mVar29.n(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    x1 x1Var29 = n.f135158a;
                    r rVar29 = this.f90890b;
                    rVar29.t(R.string.mct_irregular, mVar29, 0);
                    rVar29.o(R.string.mct_irregular_body_1, 0, 2, null, mVar29);
                    rVar29.o(R.string.mct_irregular_body_2, 0, 2, null, mVar29);
                    rVar29.o(R.string.mct_irregular_body_3, 0, 2, null, mVar29);
                    rVar29.o(R.string.mct_irregular_body_4, 0, 2, null, mVar29);
                } else {
                    mVar29.e();
                }
                break;
            default:
                m mVar30 = (m) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                int i19 = i.f95700f;
                if (mVar30.n(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    x1 x1Var30 = n.f135158a;
                    r rVar30 = this.f90890b;
                    rVar30.t(R.string.mct_cycle_predictions, mVar30, 0);
                    rVar30.o(R.string.mct_cycle_predictions_body_updated_1, 0, 2, null, mVar30);
                    rVar30.o(R.string.mct_cycle_predictions_body_updated_2, 0, 2, null, mVar30);
                } else {
                    mVar30.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
