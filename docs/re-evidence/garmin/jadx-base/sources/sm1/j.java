package sm1;

import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import java.text.NumberFormat;
import java.util.Iterator;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h82.r f160125b;

    public /* synthetic */ j(h82.r rVar, int i14) {
        this.f160124a = i14;
        this.f160125b = rVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f160124a;
        h82.r rVar = this.f160125b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i15 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h82.r rVar2 = this.f160125b;
                    rVar2.t(R.string.activities_respiration_title, mVar, 0);
                    rVar2.o(R.string.msg_sleep_timeline_metrics_respiration_description, 0, 2, null, mVar);
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
                    h82.r rVar3 = this.f160125b;
                    rVar3.t(R.string.ohrv_status, mVar2, 0);
                    rVar3.o(R.string.msg_sleep_timeline_metrics_hrv_status_description, 0, 2, null, mVar2);
                    rVar3.o(R.string.msg_sleep_timeline_metrics_hrv_status_calculation_description, 0, 2, null, mVar2);
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
                    h82.r rVar4 = this.f160125b;
                    rVar4.t(R.string.lbl_overnight_hrv, mVar3, 0);
                    rVar4.o(R.string.msg_sleep_timeline_metrics_overnight_hrv_description, 0, 2, null, mVar3);
                    rVar4.o(R.string.msg_sleep_timeline_metrics_overnight_hrv_readings_description, 0, 2, null, mVar3);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i18 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    h82.r rVar5 = this.f160125b;
                    rVar5.D(R.string.sleep_lbl_sleep, mVar4, 0);
                    rVar5.l(R.string.msg_sleep_help_intro_description_v2, 0, 2, null, mVar4);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i19 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    Iterator it = p13.x.k(Integer.valueOf(R.string.msg_sleep_score_factor_awake_restlessness_guidelines_restless_moments), Integer.valueOf(R.string.msg_sleep_score_factor_awake_restlessness_guidelines_awake_moments), Integer.valueOf(R.string.msg_sleep_score_factor_awake_restlessness_guidelines_total_awake_time)).iterator();
                    while (it.hasNext()) {
                        this.f160125b.d(((Number) it.next()).intValue(), 0, 2, null, mVar5);
                    }
                    x1 x1Var6 = p3.n.f135158a;
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
                    h82.r rVar6 = this.f160125b;
                    rVar6.D(R.string.lbl_sleep_timeline, mVar6, 0);
                    rVar6.l(R.string.msg_sleep_timeline_intro_description, 0, 2, null, mVar6);
                    rVar6.o(R.string.msg_sleep_timeline_additional_description, 0, 2, null, mVar6);
                } else {
                    mVar6.e();
                }
                break;
            case 6:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i25 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    h82.r rVar7 = this.f160125b;
                    rVar7.D(R.string.lbl_calorie_daily_averages, mVar7, 0);
                    rVar7.o(R.string.msg_calorie_daily_averages, 0, 2, null, mVar7);
                } else {
                    mVar7.e();
                }
                break;
            case 7:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int i26 = com.garmin.android.apps.connectmobile.calories.presentation.a.f31246g;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    h82.r rVar8 = this.f160125b;
                    rVar8.D(R.string.lbl_calorie_daily_averages, mVar8, 0);
                    rVar8.o(R.string.msg_calorie_daily_averages, 0, 2, null, mVar8);
                } else {
                    mVar8.e();
                }
                break;
            case 8:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                int i27 = sz1.p.f161567f;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    h82.r rVar9 = this.f160125b;
                    rVar9.t(R.string.tr_help_screen_subtitle, mVar9, 0);
                    rVar9.o(R.string.tr_help_first_section_v2, 0, 2, null, mVar9);
                } else {
                    mVar9.e();
                }
                break;
            case 9:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                int i28 = sz1.p.f161567f;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    h82.r rVar10 = this.f160125b;
                    rVar10.t(R.string.tr_help_third_section_title, mVar10, 0);
                    rVar10.o(R.string.tr_help_third_section2, 0, 2, null, mVar10);
                } else {
                    mVar10.e();
                }
                break;
            case 10:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                t11.c cVar = t11.c.f161716a;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    x0.f23314a.getClass();
                    String strW = gl1.d.W(x0.f23331ag);
                    h82.r rVar11 = this.f160125b;
                    rVar11.E(strW, mVar11, 0);
                    rVar11.m(0, 2, gl1.d.W(x0.Zf), null, mVar11);
                } else {
                    mVar11.e();
                }
                break;
            case 11:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                t11.c cVar2 = t11.c.f161716a;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar12, R.string.macronutrients);
                    h82.r rVar12 = this.f160125b;
                    rVar12.s(0, 2, strQ, null, mVar12);
                    rVar12.q(gl1.y.Q(mVar12, R.string.macronutrients_description), mVar12, 0);
                } else {
                    mVar12.e();
                }
                break;
            case 12:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                t11.c cVar3 = t11.c.f161716a;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    x0.f23314a.getClass();
                    String strW2 = gl1.d.W(x0.f23580pe);
                    h82.r rVar13 = this.f160125b;
                    rVar13.s(0, 2, strW2, null, mVar13);
                    rVar13.q(gl1.d.W(x0.Xe), mVar13, 0);
                } else {
                    mVar13.e();
                }
                break;
            case 13:
                p3.m mVar14 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                t11.e eVar = t11.e.f161725a;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    String strQ2 = gl1.y.Q(mVar14, R.string.nutrition_help_recommendations_header);
                    h82.r rVar14 = this.f160125b;
                    rVar14.E(strQ2, mVar14, 0);
                    rVar14.m(0, 2, gl1.y.Q(mVar14, R.string.nutrition_help_recommendations_header_description), null, mVar14);
                } else {
                    mVar14.e();
                }
                break;
            case 14:
                p3.m mVar15 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                t11.e eVar2 = t11.e.f161725a;
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var16 = p3.n.f135158a;
                    rVar.q(gl1.y.Q(mVar15, R.string.nutrition_help_recommendations_body1), mVar15, 0);
                    rVar.q(gl1.y.Q(mVar15, R.string.nutrition_help_recommendations_body2), mVar15, 0);
                    rVar.q(gl1.y.Q(mVar15, R.string.nutrition_help_recommendations_body3), mVar15, 0);
                } else {
                    mVar15.e();
                }
                break;
            case 15:
                p3.m mVar16 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var17 = p3.n.f135158a;
                    String strQ3 = gl1.y.Q(mVar16, R.string.nutrition_how_it_works_header_title);
                    h82.r rVar15 = this.f160125b;
                    rVar15.E(strQ3, mVar16, 0);
                    rVar15.m(0, 2, gl1.y.Q(mVar16, R.string.nutrition_how_it_works_header_description), null, mVar16);
                } else {
                    mVar16.e();
                }
                break;
            case 16:
                p3.m mVar17 = (p3.m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var18 = p3.n.f135158a;
                    String strQ4 = gl1.y.Q(mVar17, R.string.logging_food);
                    h82.r rVar16 = this.f160125b;
                    rVar16.s(0, 2, strQ4, null, mVar17);
                    rVar16.q(gl1.y.Q(mVar17, R.string.nutrition_how_it_works_logging_food_body), mVar17, 0);
                } else {
                    mVar17.e();
                }
                break;
            case 17:
                p3.m mVar18 = (p3.m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var19 = p3.n.f135158a;
                    String strQ5 = gl1.y.Q(mVar18, R.string.nutrition_how_it_works_meal_windows_and_timeline);
                    h82.r rVar17 = this.f160125b;
                    rVar17.s(0, 2, strQ5, null, mVar18);
                    rVar17.q(gl1.y.Q(mVar18, R.string.nutrition_how_it_works_meal_windows_and_timeline_body), mVar18, 0);
                } else {
                    mVar18.e();
                }
                break;
            case 18:
                p3.m mVar19 = (p3.m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (mVar19.n(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x1 x1Var20 = p3.n.f135158a;
                    String strQ6 = gl1.y.Q(mVar19, R.string.user_settings_goals_section_title);
                    h82.r rVar18 = this.f160125b;
                    rVar18.s(0, 2, strQ6, null, mVar19);
                    rVar18.q(gl1.y.Q(mVar19, R.string.nutrition_how_it_works_goals), mVar19, 0);
                } else {
                    mVar19.e();
                }
                break;
            case 19:
                p3.m mVar20 = (p3.m) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (mVar20.n(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    x1 x1Var21 = p3.n.f135158a;
                    String strQ7 = gl1.y.Q(mVar20, R.string.nutrition_101_carbohydrates_types);
                    h82.r rVar19 = this.f160125b;
                    rVar19.e(0, 2, strQ7, null, mVar20);
                    rVar19.e(0, 2, gl1.y.Q(mVar20, R.string.nutrition_101_carbohydrates_examples), null, mVar20);
                    String str = NumberFormat.getIntegerInstance().format(4L);
                    str.getClass();
                    rVar19.e(0, 2, gl1.y.P(R.string.calories_per_gram, new Object[]{str}, mVar20), null, mVar20);
                } else {
                    mVar20.e();
                }
                break;
            case 20:
                p3.m mVar21 = (p3.m) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (mVar21.n(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    x1 x1Var22 = p3.n.f135158a;
                    String strQ8 = gl1.y.Q(mVar21, R.string.nutrition_101_aligning_calories_and_macros_with_your_goals);
                    h82.r rVar20 = this.f160125b;
                    rVar20.s(0, 2, strQ8, null, mVar21);
                    rVar20.q(gl1.y.Q(mVar21, R.string.nutrition_101_aligning_calories_and_macros_with_your_goals_body1), mVar21, 0);
                    rVar20.g(z3.f.c(-1303597093, new j(rVar20, 24), mVar21), mVar21, 6);
                } else {
                    mVar21.e();
                }
                break;
            case 21:
                p3.m mVar22 = (p3.m) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (mVar22.n(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    x1 x1Var23 = p3.n.f135158a;
                    rVar.q(gl1.y.Q(mVar22, R.string.nutrition_101_aligning_calories_and_macros_with_your_goals_in_short), mVar22, 0);
                } else {
                    mVar22.e();
                }
                break;
            case 22:
                p3.m mVar23 = (p3.m) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                if (mVar23.n(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    x1 x1Var24 = p3.n.f135158a;
                    String strQ9 = gl1.y.Q(mVar23, R.string.nutrition_101_macronutrients_protein_examples);
                    h82.r rVar21 = this.f160125b;
                    rVar21.e(0, 2, strQ9, null, mVar23);
                    String str2 = NumberFormat.getIntegerInstance().format(4L);
                    str2.getClass();
                    rVar21.e(0, 2, gl1.y.P(R.string.calories_per_gram, new Object[]{str2}, mVar23), null, mVar23);
                } else {
                    mVar23.e();
                }
                break;
            case 23:
                p3.m mVar24 = (p3.m) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                if (mVar24.n(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    x1 x1Var25 = p3.n.f135158a;
                    String strQ10 = gl1.y.Q(mVar24, R.string.nutrition_101_macronutrients_fat_types);
                    h82.r rVar22 = this.f160125b;
                    rVar22.e(0, 2, strQ10, null, mVar24);
                    rVar22.e(0, 2, gl1.y.Q(mVar24, R.string.nutrition_101_macronutrients_fat_examples), null, mVar24);
                    String str3 = NumberFormat.getIntegerInstance().format(9L);
                    str3.getClass();
                    rVar22.e(0, 2, gl1.y.P(R.string.calories_per_gram, new Object[]{str3}, mVar24), null, mVar24);
                } else {
                    mVar24.e();
                }
                break;
            case 24:
                p3.m mVar25 = (p3.m) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                if (mVar25.n(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    x1 x1Var26 = p3.n.f135158a;
                    String strQ11 = gl1.y.Q(mVar25, R.string.nutrition_101_aligning_calories_and_macros_with_your_goals_weight_loss);
                    h82.r rVar23 = this.f160125b;
                    rVar23.e(0, 2, strQ11, null, mVar25);
                    rVar23.e(0, 2, gl1.y.Q(mVar25, R.string.nutrition_101_aligning_calories_and_macros_with_your_goals_gain_weight), null, mVar25);
                    rVar23.e(0, 2, gl1.y.Q(mVar25, R.string.nutrition_101_aligning_calories_and_macros_with_your_goals_maintain_weight), null, mVar25);
                } else {
                    mVar25.e();
                }
                break;
            case 25:
                p3.m mVar26 = (p3.m) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                if (mVar26.n(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    x1 x1Var27 = p3.n.f135158a;
                    String strQ12 = gl1.y.Q(mVar26, R.string.know_your_nutrition);
                    h82.r rVar24 = this.f160125b;
                    rVar24.E(strQ12, mVar26, 0);
                    rVar24.m(0, 2, gl1.y.Q(mVar26, R.string.nutrition_101_header_description), null, mVar26);
                    rVar24.q(gl1.y.Q(mVar26, R.string.nutrition_101_header_body), mVar26, 0);
                } else {
                    mVar26.e();
                }
                break;
            case 26:
                p3.m mVar27 = (p3.m) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                if (mVar27.n(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    x1 x1Var28 = p3.n.f135158a;
                    String strQ13 = gl1.y.Q(mVar27, R.string.lbl_calories);
                    h82.r rVar25 = this.f160125b;
                    rVar25.s(0, 2, strQ13, null, mVar27);
                    rVar25.q(gl1.y.Q(mVar27, R.string.nutrition_101_calories_section_body), mVar27, 0);
                } else {
                    mVar27.e();
                }
                break;
            case 27:
                p3.m mVar28 = (p3.m) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                if (mVar28.n(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    x1 x1Var29 = p3.n.f135158a;
                    String strQ14 = gl1.y.Q(mVar28, R.string.macronutrients);
                    h82.r rVar26 = this.f160125b;
                    rVar26.s(0, 2, strQ14, null, mVar28);
                    rVar26.q(gl1.y.Q(mVar28, R.string.nutrition_101_macronutrients_body_1), mVar28, 0);
                    rVar26.q(gl1.y.Q(mVar28, R.string.nutrition_101_macronutrients_body_2), mVar28, 0);
                    rVar26.g(z3.f.c(392426266, new j(rVar26, 19), mVar28), mVar28, 6);
                    rVar26.q(gl1.y.Q(mVar28, R.string.nutrition_101_macronutrients_protein_description), mVar28, 0);
                    rVar26.g(z3.f.c(-2025521647, new j(rVar26, 22), mVar28), mVar28, 6);
                    rVar26.q(gl1.y.Q(mVar28, R.string.nutrition_101_macronutrients_fat_description), mVar28, 0);
                    rVar26.g(z3.f.c(-1377294190, new j(rVar26, 23), mVar28), mVar28, 6);
                } else {
                    mVar28.e();
                }
                break;
            case 28:
                p3.m mVar29 = (p3.m) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                int i29 = t11.j.f161736f;
                if (mVar29.n(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    x1 x1Var30 = p3.n.f135158a;
                    String strQ15 = gl1.y.Q(mVar29, R.string.lbl_nutrition);
                    h82.r rVar27 = this.f160125b;
                    rVar27.E(strQ15, mVar29, 0);
                    rVar27.m(0, 2, gl1.y.Q(mVar29, R.string.nutrition_help_header_description), null, mVar29);
                } else {
                    mVar29.e();
                }
                break;
            default:
                p3.m mVar30 = (p3.m) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                t12.b bVar = t12.b.f161739a;
                if (mVar30.n(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    x1 x1Var31 = p3.n.f135158a;
                    h82.r rVar28 = this.f160125b;
                    rVar28.t(R.string.lbl_profile, mVar30, 0);
                    rVar28.o(R.string.help_profile_and_privacy_profile_description, 0, 2, null, mVar30);
                } else {
                    mVar30.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
