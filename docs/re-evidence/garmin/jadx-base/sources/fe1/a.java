package fe1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import gl1.y;
import h82.r;
import o4.q1;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.x1;
import p3.y3;
import s5.i0;
import w5.b0;
import w5.c0;
import w5.f0;
import w5.q;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f70527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f70528b;

    public /* synthetic */ a(r rVar, int i14) {
        this.f70527a = i14;
        this.f70528b = rVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = 16;
        int i15 = 6;
        switch (this.f70527a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                b bVar = b.f70529a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    r rVar = this.f70528b;
                    rVar.t(R.string.lbl_more_accurate_data, mVar, 0);
                    rVar.o(R.string.msg_interpreting_your_data_help_p2, 0, 2, null, mVar);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                b bVar2 = b.f70529a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    r rVar2 = this.f70528b;
                    rVar2.D(R.string.lbl_value_of_respiration_data, mVar2, 0);
                    rVar2.l(R.string.msg_interpreting_your_data_help_intro, 0, 2, null, mVar2);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                g.a aVar = g.f70543g;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    r rVar3 = this.f70528b;
                    rVar3.D(R.string.activities_respiration_title, mVar3, 0);
                    rVar3.l(R.string.msg_respiration_rate_help, 0, 2, null, mVar3);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i16 = k.f70552f;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    r rVar4 = this.f70528b;
                    rVar4.D(R.string.activities_respiration_rate, mVar4, 0);
                    rVar4.l(R.string.activities_respiration_rate_description_text, 0, 2, null, mVar4);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i17 = g51.f.f75946f;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    r rVar5 = this.f70528b;
                    rVar5.D(R.string.pacepro_title, mVar5, 0);
                    rVar5.l(R.string.pacepro_help_main_message, 0, 2, null, mVar5);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                h81.b bVar3 = h81.b.f82406a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    mVar6.C(242225342);
                    s5.c.b bVar4 = new s5.c.b(0, 1, null);
                    mVar6.C(242226656);
                    f0.f182097b.getClass();
                    f0 f0Var = f0.f182105j;
                    int iJ = bVar4.j(new i0(0L, 0L, f0Var, (b0) null, (c0) null, (q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65531, (p005kotlin.jvm.internal.j) null));
                    try {
                        bVar4.b(y.Q(mVar6, R.string.lbl_better_pacing));
                        Unit unit = Unit.INSTANCE;
                        bVar4.f(iJ);
                        mVar6.f();
                        bVar4.b(StringUtils.SPACE);
                        bVar4.b(y.Q(mVar6, R.string.smart_training_help_bullet1));
                        s5.c cVarK = bVar4.k();
                        mVar6.f();
                        r rVar6 = this.f70528b;
                        rVar6.f(cVarK, null, mVar6, 0, 2);
                        h4.r.a aVar2 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        float f14 = j92.b.f97899b.f97917b;
                        c2.l.f(x2.h(aVar2, f14), mVar6);
                        mVar6.C(242241184);
                        s5.c.b bVar5 = new s5.c.b(0, 1, null);
                        mVar6.C(242242498);
                        int iJ2 = bVar5.j(new i0(0L, 0L, f0Var, (b0) null, (c0) null, (q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65531, (p005kotlin.jvm.internal.j) null));
                        try {
                            bVar5.b(y.Q(mVar6, R.string.lbl_smarter_workout));
                            bVar5.f(iJ2);
                            mVar6.f();
                            bVar5.b(StringUtils.SPACE);
                            bVar5.b(y.Q(mVar6, R.string.smart_training_help_bullet2));
                            s5.c cVarK2 = bVar5.k();
                            mVar6.f();
                            rVar6.f(cVarK2, null, mVar6, 0, 2);
                            c2.l.f(x2.h(aVar2, f14), mVar6);
                            mVar6.C(242257096);
                            s5.c.b bVar6 = new s5.c.b(0, 1, null);
                            mVar6.C(242258410);
                            int iJ3 = bVar6.j(new i0(0L, 0L, f0Var, (b0) null, (c0) null, (q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65531, (p005kotlin.jvm.internal.j) null));
                            try {
                                bVar6.b(y.Q(mVar6, R.string.lbl_clear_progress_tracking));
                                bVar6.f(iJ3);
                                mVar6.f();
                                bVar6.b(StringUtils.SPACE);
                                bVar6.b(y.Q(mVar6, R.string.smart_training_help_bullet3));
                                s5.c cVarK3 = bVar6.k();
                                mVar6.f();
                                rVar6.f(cVarK3, null, mVar6, 0, 2);
                                c2.l.f(x2.h(aVar2, f14), mVar6);
                                mVar6.C(242273260);
                                s5.c.b bVar7 = new s5.c.b(0, 1, null);
                                mVar6.C(242274574);
                                int iJ4 = bVar7.j(new i0(0L, 0L, f0Var, (b0) null, (c0) null, (q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, 65531, (p005kotlin.jvm.internal.j) null));
                                try {
                                    bVar7.b(y.Q(mVar6, R.string.lbl_less_guesswork_fatigue_risk));
                                    bVar7.f(iJ4);
                                    mVar6.f();
                                    bVar7.b(StringUtils.SPACE);
                                    bVar7.b(y.Q(mVar6, R.string.smart_training_help_bullet4));
                                    s5.c cVarK4 = bVar7.k();
                                    mVar6.f();
                                    rVar6.f(cVarK4, null, mVar6, 0, 2);
                                } catch (Throwable th3) {
                                    bVar7.f(iJ4);
                                    throw th3;
                                }
                            } catch (Throwable th4) {
                                bVar6.f(iJ3);
                                throw th4;
                            }
                        } catch (Throwable th5) {
                            bVar5.f(iJ2);
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        bVar4.f(iJ);
                        throw th6;
                    }
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                h81.b bVar8 = h81.b.f82406a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    String strQ = y.Q(mVar7, R.string.stamina_curve_help_bullet1);
                    r rVar7 = this.f70528b;
                    rVar7.e(0, 2, strQ, null, mVar7);
                    h4.r.a aVar3 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f15 = j92.b.f97899b.f97917b;
                    c2.l.f(x2.h(aVar3, f15), mVar7);
                    rVar7.e(0, 2, y.Q(mVar7, R.string.stamina_curve_help_bullet2), null, mVar7);
                    c2.l.f(x2.h(aVar3, f15), mVar7);
                    rVar7.e(0, 2, y.Q(mVar7, R.string.stamina_curve_help_bullet3), null, mVar7);
                    c2.l.f(x2.h(aVar3, f15), mVar7);
                    rVar7.e(0, 2, y.Q(mVar7, R.string.stamina_curve_help_bullet4), null, mVar7);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                h81.b bVar9 = h81.b.f82406a;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    r rVar8 = this.f70528b;
                    rVar8.D(R.string.lbl_stamina_zones, mVar8, 0);
                    rVar8.m(0, 2, y.Q(mVar8, R.string.lbl_stamina_zones_help_intro), null, mVar8);
                    rVar8.q(y.Q(mVar8, R.string.lbl_stamina_zones_help_body1), mVar8, 0);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                h81.b bVar10 = h81.b.f82406a;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    String strQ2 = y.Q(mVar9, R.string.lbl_stamina_curve);
                    r rVar9 = this.f70528b;
                    rVar9.s(0, 2, strQ2, null, mVar9);
                    rVar9.q(y.Q(mVar9, R.string.lbl_stamina_curve_help_body1), mVar9, 0);
                    rVar9.g(z3.f.c(-2043735806, new a(rVar9, i15), mVar9), mVar9, 6);
                    rVar9.q(y.Q(mVar9, R.string.stamina_curve_help_body2), mVar9, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                h81.b bVar11 = h81.b.f82406a;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    String strQ3 = y.Q(mVar10, R.string.lbl_smarter_training_help_heading);
                    r rVar10 = this.f70528b;
                    rVar10.s(0, 2, strQ3, null, mVar10);
                    rVar10.q(y.Q(mVar10, R.string.lbl_smarter_training_body1_help), mVar10, 0);
                    rVar10.g(z3.f.c(491871619, new a(rVar10, 5), mVar10), mVar10, 6);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                h81.b bVar12 = h81.b.f82406a;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    r rVar11 = this.f70528b;
                    rVar11.t(R.string.lbl_stamina_help_potential_actual_title_v2, mVar11, 0);
                    rVar11.o(R.string.lbl_stamina_help_potential_actual_paragraph_2, 0, 2, null, mVar11);
                    rVar11.o(R.string.lbl_stamina_help_potential_actual_paragraph_3, 0, 2, null, mVar11);
                    rVar11.o(R.string.lbl_stamina_help_potential_actual_paragraph_4, 0, 2, null, mVar11);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 11:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                h81.b bVar13 = h81.b.f82406a;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    r rVar12 = this.f70528b;
                    rVar12.t(R.string.lbl_stamina_help_training_title, mVar12, 0);
                    rVar12.o(R.string.lbl_stamina_help_training_description_v2, 0, 2, null, mVar12);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 12:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    r rVar13 = this.f70528b;
                    rVar13.t(R.string.lbl_receiving_endurance_score, mVar13, 0);
                    rVar13.o(R.string.msg_receive_endurance_score, 0, 2, null, mVar13);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 13:
                p3.m mVar14 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    r rVar14 = this.f70528b;
                    rVar14.t(R.string.lbl_calculating_endurance_score, mVar14, 0);
                    rVar14.o(R.string.msg_training_calculate_endurance_score, 0, 2, null, mVar14);
                    rVar14.o(R.string.msg_activity_length_calculate_endurance_score, 0, 2, null, mVar14);
                    rVar14.o(R.string.msg_endurance_score_following_factors, 0, 2, null, mVar14);
                    rVar14.g(z3.f.c(-200453889, new a(rVar14, i14), mVar14), mVar14, 6);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 14:
                p3.m mVar15 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    r rVar15 = this.f70528b;
                    rVar15.t(R.string.lbl_endurance_score_contributors, mVar15, 0);
                    rVar15.o(R.string.msg_endurance_score_contributors, 0, 2, null, mVar15);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 15:
                p3.m mVar16 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = p3.n.f135158a;
                    r rVar16 = this.f70528b;
                    rVar16.t(R.string.lbl_about_endurance_score, mVar16, 0);
                    rVar16.o(R.string.msg_endurance_score_metric_description, 0, 2, null, mVar16);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 16:
                p3.m mVar17 = (p3.m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var17 = p3.n.f135158a;
                    r rVar17 = this.f70528b;
                    rVar17.d(R.string.msg_endurance_score_factor_duration_and_intensity, 0, 2, null, mVar17);
                    rVar17.d(R.string.msg_endurance_score_factor_speed_and_power, 0, 2, null, mVar17);
                    String strQ4 = y.Q(mVar17, R.string.msg_endurance_score_factor_vo2_max_v2);
                    y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                    Context context = (Context) mVar17.A(y3Var);
                    Object objQ = mVar17.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new h02.a(19);
                        mVar17.K(objQ);
                    }
                    rVar17.d(R.string.msg_endurance_score_factor_vo2_max_v2, 0, 0, oi0.c.A(context, (e23.l) objQ, strQ4), mVar17);
                    String strQ5 = y.Q(mVar17, R.string.msg_endurance_score_factor_age_gender_bmi_v2);
                    Context context2 = (Context) mVar17.A(y3Var);
                    Object objQ2 = mVar17.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new h02.a(20);
                        mVar17.K(objQ2);
                    }
                    rVar17.d(R.string.msg_endurance_score_factor_age_gender_bmi_v2, 0, 0, oi0.c.A(context2, (e23.l) objQ2, strQ5), mVar17);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 17:
                p3.m mVar18 = (p3.m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                int i18 = h81.h.f82423h;
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var18 = p3.n.f135158a;
                    String strQ6 = y.Q(mVar18, R.string.lbl_endurance_stamina_title);
                    r rVar18 = this.f70528b;
                    rVar18.E(strQ6, mVar18, 0);
                    rVar18.m(0, 2, y.Q(mVar18, R.string.lbl_endurance_stamina_help_intro), null, mVar18);
                    rVar18.q(y.Q(mVar18, R.string.lbl_endurance_stamina_help_body1), mVar18, 0);
                    g6.f.a aVar4 = g6.f.f75994b;
                    c2.l.f(x2.h(h4.r.S, 16), mVar18);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 18:
                p3.m mVar19 = (p3.m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                ho0.b bVar14 = ho0.b.f84701a;
                if (mVar19.n(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x1 x1Var19 = p3.n.f135158a;
                    r rVar19 = this.f70528b;
                    rVar19.d(R.string.title_exercise, 0, 2, null, mVar19);
                    rVar19.d(R.string.title_stress, 0, 2, null, mVar19);
                    rVar19.d(R.string.title_caffeine, 0, 2, null, mVar19);
                    rVar19.d(R.string.title_medication, 0, 2, null, mVar19);
                    rVar19.d(R.string.title_illness, 0, 2, null, mVar19);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 19:
                p3.m mVar20 = (p3.m) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                ho0.b bVar15 = ho0.b.f84701a;
                if (mVar20.n(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    x1 x1Var20 = p3.n.f135158a;
                    r rVar20 = this.f70528b;
                    rVar20.o(R.string.hr_help_things_list_header, 0, 2, null, mVar20);
                    rVar20.g(z3.f.c(-2108625818, new a(rVar20, 18), mVar20), mVar20, 6);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 20:
                p3.m mVar21 = (p3.m) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                int i19 = ho0.h.f84713l;
                if (mVar21.n(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    x1 x1Var21 = p3.n.f135158a;
                    r rVar21 = this.f70528b;
                    rVar21.D(R.string.activity_details_heart_rate, mVar21, 0);
                    rVar21.l(R.string.msg_help_tracking_heart_rate, 0, 2, null, mVar21);
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            case 21:
                p3.m mVar22 = (p3.m) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                int i24 = hp1.e.f84947f;
                if (mVar22.n(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    x1 x1Var22 = p3.n.f135158a;
                    r rVar22 = this.f70528b;
                    rVar22.D(R.string.edge_solar_charging_help_title, mVar22, 0);
                    rVar22.l(R.string.edge_solar_charging_desc, 0, 2, null, mVar22);
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
            case 22:
                p3.m mVar23 = (p3.m) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                ht0.a aVar5 = ht0.a.f85509a;
                if (mVar23.n(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    x1 x1Var23 = p3.n.f135158a;
                    r rVar23 = this.f70528b;
                    rVar23.d(R.string.ftp_help_message_4, 0, 2, null, mVar23);
                    rVar23.d(R.string.msg_lactate_threshold_help7, 0, 2, null, mVar23);
                    rVar23.d(R.string.ftp_help_message_6, 0, 2, null, mVar23);
                } else {
                    mVar23.e();
                }
                return Unit.INSTANCE;
            case 23:
                p3.m mVar24 = (p3.m) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                ht0.a aVar6 = ht0.a.f85509a;
                if (mVar24.n(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    x1 x1Var24 = p3.n.f135158a;
                    r rVar24 = this.f70528b;
                    rVar24.o(R.string.msg_lactate_threshold_help6, 0, 2, null, mVar24);
                    rVar24.g(z3.f.c(1592058004, new a(rVar24, 22), mVar24), mVar24, 6);
                } else {
                    mVar24.e();
                }
                return Unit.INSTANCE;
            case 24:
                p3.m mVar25 = (p3.m) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                int i25 = ht0.e.f85518g;
                if (mVar25.n(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    x1 x1Var25 = p3.n.f135158a;
                    r rVar25 = this.f70528b;
                    rVar25.D(R.string.lbl_lactate_threshold, mVar25, 0);
                    rVar25.l(R.string.lactate_threshold_feature_description, 0, 2, null, mVar25);
                } else {
                    mVar25.e();
                }
                return Unit.INSTANCE;
            case 25:
                p3.m mVar26 = (p3.m) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                int i26 = ht0.j.f85529g;
                if (mVar26.n(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    x1 x1Var26 = p3.n.f135158a;
                    r rVar26 = this.f70528b;
                    rVar26.D(R.string.lbl_lt_and_training, mVar26, 0);
                    rVar26.q(y.Q(mVar26, R.string.msg_generic_lactate_threshold_help3), mVar26, 0);
                    rVar26.g(z3.f.c(1923935662, new a(rVar26, 26), mVar26), mVar26, 6);
                } else {
                    mVar26.e();
                }
                return Unit.INSTANCE;
            case 26:
                p3.m mVar27 = (p3.m) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                int i27 = ht0.j.f85529g;
                if (mVar27.n(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    x1 x1Var27 = p3.n.f135158a;
                    r rVar27 = this.f70528b;
                    rVar27.d(R.string.ftp_help_message_4, 0, 2, null, mVar27);
                    rVar27.d(R.string.msg_lactate_threshold_help7, 0, 2, null, mVar27);
                    rVar27.d(R.string.ftp_help_message_6, 0, 2, null, mVar27);
                } else {
                    mVar27.e();
                }
                return Unit.INSTANCE;
            case 27:
                p3.m mVar28 = (p3.m) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                i40.b bVar16 = i40.b.f90891a;
                if (mVar28.n(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    x1 x1Var28 = p3.n.f135158a;
                    r rVar28 = this.f70528b;
                    rVar28.t(R.string.lbl_automatic, mVar28, 0);
                    rVar28.o(R.string.msg_round_trip_help, 0, 2, null, mVar28);
                } else {
                    mVar28.e();
                }
                return Unit.INSTANCE;
            case 28:
                p3.m mVar29 = (p3.m) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                i40.b bVar17 = i40.b.f90891a;
                if (mVar29.n(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    x1 x1Var29 = p3.n.f135158a;
                    r rVar29 = this.f70528b;
                    rVar29.t(R.string.lbl_custom, mVar29, 0);
                    rVar29.o(R.string.msg_custom_help, 0, 2, null, mVar29);
                } else {
                    mVar29.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar30 = (p3.m) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                i40.b bVar18 = i40.b.f90891a;
                if (mVar30.n(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    x1 x1Var30 = p3.n.f135158a;
                    r rVar30 = this.f70528b;
                    rVar30.t(R.string.lbl_course_points, mVar30, 0);
                    rVar30.o(R.string.msg_course_points_help, 0, 2, null, mVar30);
                } else {
                    mVar30.e();
                }
                return Unit.INSTANCE;
        }
    }
}
