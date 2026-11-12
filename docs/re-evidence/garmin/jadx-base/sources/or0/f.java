package or0;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h82.r;
import o4.q1;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.x1;
import s5.i0;
import w5.b0;
import w5.c0;
import w5.f0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f133337b;

    public /* synthetic */ f(r rVar, int i14) {
        this.f133336a = i14;
        this.f133337b = rVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f133336a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                j.a aVar = j.f133348g;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    r rVar = this.f133337b;
                    rVar.t(R.string.reaching_your_goal, mVar, 0);
                    rVar.o(R.string.lbl_help_complete_intensity_minutes, 0, 2, null, mVar);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                p40.a aVar2 = p40.a.f135627a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    r rVar2 = this.f133337b;
                    rVar2.t(R.string.course_planner_rest_breaks, mVar2, 0);
                    rVar2.o(R.string.course_planner_rest_breaks_help, 0, 2, null, mVar2);
                    rVar2.t(R.string.course_planner_cutoff_times, mVar2, 0);
                    rVar2.o(R.string.course_planner_cutoff_times_help, 0, 2, null, mVar2);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                pb1.a aVar3 = pb1.a.f136830a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    r rVar3 = this.f133337b;
                    rVar3.t(R.string.pregnancy_help_updated_weekly_title, mVar3, 0);
                    rVar3.o(R.string.pregnancy_help_updated_weekly_body, 0, 2, null, mVar3);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                pb1.a aVar4 = pb1.a.f136830a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    r rVar4 = this.f133337b;
                    rVar4.t(R.string.pregnancy_help_talk_to_your_doctor_title, mVar4, 0);
                    rVar4.o(R.string.pregnancy_help_talk_to_your_doctor_body, 0, 2, null, mVar4);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i14 = pb1.h.f136849f;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    r rVar5 = this.f133337b;
                    rVar5.t(R.string.pregnancy_help_talk_to_your_doctor_title, mVar5, 0);
                    rVar5.o(R.string.pregnancy_help_doctor_exercise, 0, 2, null, mVar5);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i15 = pb1.h.f136849f;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    r rVar6 = this.f133337b;
                    rVar6.t(R.string.pregnancy_help_using_garmin_connect_title, mVar6, 0);
                    rVar6.o(R.string.pregnancy_help_using_garmin_connect_body, 0, 2, null, mVar6);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i16 = pb1.h.f136849f;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    r rVar7 = this.f133337b;
                    rVar7.t(R.string.vo2_max_and_training_status_title, mVar7, 0);
                    rVar7.o(R.string.pregnancy_help_training_status_body, 0, 2, null, mVar7);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int i17 = pb1.h.f136849f;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    r rVar8 = this.f133337b;
                    rVar8.t(R.string.pregnancy_help_talk_to_your_doctor_title, mVar8, 0);
                    rVar8.o(R.string.pregnancy_help_talk_to_your_doctor_body, 0, 2, null, mVar8);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                int i18 = pb1.h.f136849f;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    r rVar9 = this.f133337b;
                    rVar9.D(R.string.pregnancy_tracking, mVar9, 0);
                    rVar9.l(R.string.pregnancy_help_main_body, 0, 2, null, mVar9);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                int i19 = pb1.h.f136849f;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    r rVar10 = this.f133337b;
                    rVar10.t(R.string.pregnancy_help_wellness_tracking_stress_title, mVar10, 0);
                    rVar10.o(R.string.pregnancy_help_wellness_tracking_stress_body, 0, 2, null, mVar10);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                int i24 = pb1.h.f136849f;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    r rVar11 = this.f133337b;
                    rVar11.t(R.string.sleep_lbl_sleep, mVar11, 0);
                    rVar11.o(R.string.pregnancy_help_wellness_tracking_sleep_body, 0, 2, null, mVar11);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 11:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                int i25 = pb1.h.f136849f;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    r rVar12 = this.f133337b;
                    rVar12.t(R.string.pregnancy_help_talk_to_your_doctor_title, mVar12, 0);
                    rVar12.o(R.string.pregnancy_help_talk_to_your_doctor_body, 0, 2, null, mVar12);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 12:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                pf0.b bVar = pf0.b.f137466a;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    r rVar13 = this.f133337b;
                    rVar13.d(R.string.msg_inconclusive_reason_other_1, 0, 2, null, mVar13);
                    rVar13.d(R.string.msg_inconclusive_reason_other_2, 0, 2, null, mVar13);
                    rVar13.d(R.string.msg_inconclusive_reason_other_3, 0, 2, null, mVar13);
                    rVar13.d(R.string.msg_inconclusive_reason_other_4, 0, 2, null, mVar13);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 13:
                p3.m mVar14 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                pf0.b bVar2 = pf0.b.f137466a;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    r rVar14 = this.f133337b;
                    rVar14.t(R.string.lbl_is_afib_serious, mVar14, 0);
                    rVar14.o(R.string.msg_afib_serious_1, 0, 2, null, mVar14);
                    rVar14.o(R.string.msg_afib_serious_2, 0, 2, null, mVar14);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 14:
                p3.m mVar15 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                pf0.b bVar3 = pf0.b.f137466a;
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    r rVar15 = this.f133337b;
                    rVar15.t(R.string.lbl_afib_symptoms, mVar15, 0);
                    rVar15.o(R.string.msg_afib_symptoms, 0, 2, null, mVar15);
                    rVar15.g(z3.f.c(-1169118087, new f(rVar15, 19), mVar15), mVar15, 6);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 15:
                p3.m mVar16 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                pf0.b bVar4 = pf0.b.f137466a;
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = p3.n.f135158a;
                    r rVar16 = this.f133337b;
                    rVar16.o(R.string.msg_inconclusive_2, 0, 2, null, mVar16);
                    rVar16.g(z3.f.c(1170118641, new f(rVar16, 20), mVar16), mVar16, 6);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 16:
                p3.m mVar17 = (p3.m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                pf0.b bVar5 = pf0.b.f137466a;
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var17 = p3.n.f135158a;
                    r rVar17 = this.f133337b;
                    rVar17.o(R.string.lbl_ecg_inconclusive_other_factors, 0, 2, null, mVar17);
                    rVar17.g(z3.f.c(-1515557222, new f(rVar17, 12), mVar17), mVar17, 6);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 17:
                p3.m mVar18 = (p3.m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                pf0.b bVar6 = pf0.b.f137466a;
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var18 = p3.n.f135158a;
                    r rVar18 = this.f133337b;
                    rVar18.o(R.string.msg_ecg_heart_rate_low_general, 0, 2, null, mVar18);
                    rVar18.o(R.string.msg_ecg_heart_rate_low, 0, 2, null, mVar18);
                    rVar18.o(R.string.msg_heart_rate_high, 0, 2, null, mVar18);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 18:
                p3.m mVar19 = (p3.m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                pf0.b bVar7 = pf0.b.f137466a;
                if (mVar19.n(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x1 x1Var19 = p3.n.f135158a;
                    mVar19.C(1586825539);
                    s5.c.b bVar8 = new s5.c.b(0, 1, null);
                    mVar19.C(1586826968);
                    f0.f182097b.getClass();
                    f0 f0Var = f0.f182105j;
                    int iJ = bVar8.j(new i0(0L, 0L, f0Var, (b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65531, (p005kotlin.jvm.internal.j) null));
                    try {
                        bVar8.b(y.Q(mVar19, R.string.msg_remember_ecg_app_1_a));
                        Unit unit = Unit.INSTANCE;
                        bVar8.f(iJ);
                        mVar19.f();
                        bVar8.b(StringUtils.SPACE);
                        bVar8.b(y.Q(mVar19, R.string.msg_remember_ecg_app_1_b));
                        s5.c cVarK = bVar8.k();
                        mVar19.f();
                        r rVar19 = this.f133337b;
                        rVar19.f(cVarK, null, mVar19, 0, 2);
                        mVar19.C(1586841003);
                        s5.c.b bVar9 = new s5.c.b(0, 1, null);
                        mVar19.C(1586842558);
                        int iJ2 = bVar9.j(new i0(0L, 0L, f0Var, (b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65531, (p005kotlin.jvm.internal.j) null));
                        try {
                            bVar9.b(y.Q(mVar19, R.string.msg_remember_ecg_app_2));
                            bVar9.f(iJ2);
                            mVar19.f();
                            s5.c cVarK2 = bVar9.k();
                            mVar19.f();
                            rVar19.f(cVarK2, null, mVar19, 0, 2);
                            mVar19.C(1586852827);
                            s5.c.b bVar10 = new s5.c.b(0, 1, null);
                            mVar19.C(1586854296);
                            int iJ3 = bVar10.j(new i0(0L, 0L, f0Var, (b0) null, (c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65531, (p005kotlin.jvm.internal.j) null));
                            try {
                                bVar10.b(y.Q(mVar19, R.string.msg_remember_ecg_app_3_a));
                                bVar10.f(iJ3);
                                mVar19.f();
                                bVar10.b(y.Q(mVar19, R.string.msg_remember_ecg_app_3_b));
                                s5.c cVarK3 = bVar10.k();
                                mVar19.f();
                                rVar19.f(cVarK3, null, mVar19, 0, 2);
                            } catch (Throwable th3) {
                                bVar10.f(iJ3);
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            bVar9.f(iJ2);
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        bVar8.f(iJ);
                        throw th5;
                    }
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 19:
                p3.m mVar20 = (p3.m) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                pf0.b bVar11 = pf0.b.f137466a;
                if (mVar20.n(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    x1 x1Var20 = p3.n.f135158a;
                    r rVar20 = this.f133337b;
                    rVar20.d(R.string.lbl_rapid_heartbeat_pounding_fluttering, 0, 2, null, mVar20);
                    rVar20.d(R.string.lbl_skipped_heartbeat, 0, 2, null, mVar20);
                    rVar20.d(R.string.lbl_fatigue, 0, 2, null, mVar20);
                    rVar20.d(R.string.lbl_shortness_of_breath, 0, 2, null, mVar20);
                    rVar20.d(R.string.lbl_chest_tightness_or_pain, 0, 2, null, mVar20);
                    rVar20.d(R.string.lbl_fainting, 0, 2, null, mVar20);
                    rVar20.d(R.string.lbl_dizziness, 0, 2, null, mVar20);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 20:
                p3.m mVar21 = (p3.m) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                pf0.b bVar12 = pf0.b.f137466a;
                if (mVar21.n(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    x1 x1Var21 = p3.n.f135158a;
                    r rVar21 = this.f133337b;
                    rVar21.d(R.string.msg_inconclusive_reason_1, 0, 2, null, mVar21);
                    rVar21.d(R.string.msg_inconclusive_reason_2, 0, 2, null, mVar21);
                    rVar21.d(R.string.msg_inconclusive_reason_3, 0, 2, null, mVar21);
                    rVar21.d(R.string.msg_inconclusive_reason_4, 0, 2, null, mVar21);
                    rVar21.d(R.string.msg_inconclusive_reason_5, 0, 2, null, mVar21);
                    rVar21.d(R.string.msg_inconclusive_reason_6, 0, 2, null, mVar21);
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            case 21:
                p3.m mVar22 = (p3.m) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                pf0.b bVar13 = pf0.b.f137466a;
                if (mVar22.n(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    x1 x1Var22 = p3.n.f135158a;
                    r rVar22 = this.f133337b;
                    rVar22.o(R.string.lbl_remember_ecg_app_limitations, 0, 2, null, mVar22);
                    rVar22.g(z3.f.c(1445225036, new f(rVar22, 18), mVar22), mVar22, 6);
                    rVar22.o(R.string.msg_remember_ecg_app_4, 0, 2, null, mVar22);
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
            case 22:
                p3.m mVar23 = (p3.m) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar5 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                if (mVar23.n(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    x1 x1Var23 = p3.n.f135158a;
                    r rVar23 = this.f133337b;
                    rVar23.d(R.string.msg_take_your_first_ecg_recording_step_0_updated, 0, 2, null, mVar23);
                    rVar23.d(R.string.msg_take_your_first_ecg_recording_step_1, 0, 2, null, mVar23);
                    rVar23.d(R.string.msg_take_your_first_ecg_recording_step_2, 0, 2, null, mVar23);
                    rVar23.d(R.string.msg_take_your_first_ecg_recording_step_3, 0, 2, null, mVar23);
                } else {
                    mVar23.e();
                }
                return Unit.INSTANCE;
            case 23:
                p3.m mVar24 = (p3.m) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar6 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                if (mVar24.n(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    x1 x1Var24 = p3.n.f135158a;
                    r rVar24 = this.f133337b;
                    rVar24.o(R.string.lbl_ecg_steps_improve_reading, 0, 2, null, mVar24);
                    rVar24.g(z3.f.c(-2035723145, new f(rVar24, 26), mVar24), mVar24, 6);
                } else {
                    mVar24.e();
                }
                return Unit.INSTANCE;
            case 24:
                p3.m mVar25 = (p3.m) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar7 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                if (mVar25.n(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    x1 x1Var25 = p3.n.f135158a;
                    r rVar25 = this.f133337b;
                    rVar25.o(R.string.lbl_ecg_inconclusive_other_factors, 0, 2, null, mVar25);
                    rVar25.g(z3.f.c(-1845263186, new f(rVar25, 27), mVar25), mVar25, 6);
                } else {
                    mVar25.e();
                }
                return Unit.INSTANCE;
            case 25:
                p3.m mVar26 = (p3.m) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar8 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                if (mVar26.n(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    x1 x1Var26 = p3.n.f135158a;
                    r rVar26 = this.f133337b;
                    rVar26.t(R.string.lbl_ecg_in_garmin_connect, mVar26, 0);
                    rVar26.o(R.string.msg_ecg_in_garmin_connect, 0, 2, null, mVar26);
                } else {
                    mVar26.e();
                }
                return Unit.INSTANCE;
            case 26:
                p3.m mVar27 = (p3.m) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar9 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                if (mVar27.n(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    x1 x1Var27 = p3.n.f135158a;
                    r rVar27 = this.f133337b;
                    rVar27.d(R.string.msg_inconclusive_reason_1, 0, 2, null, mVar27);
                    rVar27.d(R.string.msg_inconclusive_reason_2, 0, 2, null, mVar27);
                    rVar27.d(R.string.msg_inconclusive_reason_3, 0, 2, null, mVar27);
                    rVar27.d(R.string.msg_inconclusive_reason_4, 0, 2, null, mVar27);
                    rVar27.d(R.string.msg_inconclusive_reason_5, 0, 2, null, mVar27);
                    rVar27.d(R.string.msg_inconclusive_reason_6, 0, 2, null, mVar27);
                } else {
                    mVar27.e();
                }
                return Unit.INSTANCE;
            case 27:
                p3.m mVar28 = (p3.m) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar10 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                if (mVar28.n(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    x1 x1Var28 = p3.n.f135158a;
                    r rVar28 = this.f133337b;
                    rVar28.d(R.string.msg_inconclusive_reason_other_1, 0, 2, null, mVar28);
                    rVar28.d(R.string.msg_inconclusive_reason_other_2, 0, 2, null, mVar28);
                    rVar28.d(R.string.msg_inconclusive_reason_other_3, 0, 2, null, mVar28);
                    rVar28.d(R.string.msg_inconclusive_reason_other_4, 0, 2, null, mVar28);
                } else {
                    mVar28.e();
                }
                return Unit.INSTANCE;
            case 28:
                p3.m mVar29 = (p3.m) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                int i26 = pf1.g.f137573f;
                if (mVar29.n(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    x1 x1Var29 = p3.n.f135158a;
                    r rVar29 = this.f133337b;
                    rVar29.D(R.string.running_tolerance, mVar29, 0);
                    rVar29.l(R.string.running_tolerance_help_header_description, 0, 2, null, mVar29);
                } else {
                    mVar29.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar30 = (p3.m) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                pk1.c cVar = pk1.c.f138275a;
                if (mVar30.n(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    x1 x1Var30 = p3.n.f135158a;
                    r rVar30 = this.f133337b;
                    rVar30.t(R.string.lbl_first_day_of_the_week, mVar30, 0);
                    rVar30.o(R.string.settings_first_day_of_week_help, 0, 2, null, mVar30);
                } else {
                    mVar30.e();
                }
                return Unit.INSTANCE;
        }
    }
}
