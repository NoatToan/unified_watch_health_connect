package ih0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import i3.mh;
import ii0.x;
import java.util.Locale;
import jk0.w;
import l72.p2;
import l72.r1;
import li0.c0;
import org.slf4j.Marker;
import p005kotlin.Unit;
import p3.x1;
import p5.v;
import r1.e0;
import s5.x0;
import u1.a2;
import u1.y0;
import v62.d2;
import v62.o7;
import v62.s9;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93442a;

    public /* synthetic */ a(int i14) {
        this.f93442a = i14;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0403  */
    /* JADX WARN: Code duplicated, block: B:65:0x0291  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f93442a;
        int i15 = 11;
        int i16 = 5;
        p3.m.a aVar = p3.m.f135153a;
        int i17 = 18;
        int i18 = 4;
        int i19 = 6;
        int i24 = 16;
        switch (i14) {
            case 0:
                h82.r rVar = (h82.r) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                b bVar = b.f93443a;
                rVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(rVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    int i25 = (iIntValue << 3) & 112;
                    rVar.D(R.string.lbl_obtaining_fitness_age, mVar, i25);
                    int i26 = (iIntValue << 6) & 896;
                    rVar.l(R.string.msg_not_receiving_fitness_age_factors, i26, 2, null, mVar);
                    rVar.t(R.string.lbl_missing_data, mVar, i25);
                    int i27 = i25 | 6;
                    rVar.j(z3.f.c(1599806391, new i40.a(rVar, 9), mVar), mVar, i27);
                    rVar.o(R.string.msg_fitness_age_rhr_availability_1, i26, 2, null, mVar);
                    rVar.o(R.string.msg_compute_body_fat, i26, 2, null, mVar);
                    rVar.j(z3.f.c(-614514720, new i40.a(rVar, 10), mVar), mVar, i27);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                int i28 = 2;
                h82.r rVar2 = (h82.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                b bVar2 = b.f93443a;
                rVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    if (mVar2.B(rVar2)) {
                        i28 = 4;
                    }
                    iIntValue2 |= i28;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    int i29 = (iIntValue2 << 3) & 112;
                    rVar2.D(R.string.lbl_no_fitness_age_available, mVar2, i29);
                    rVar2.l(R.string.msg_fitness_age_restrictions_circumstances, (iIntValue2 << 6) & 896, 2, null, mVar2);
                    int i30 = i29 | 6;
                    rVar2.j(z3.f.c(-361491849, new i40.a(rVar2, i15), mVar2), mVar2, i30);
                    rVar2.j(z3.f.c(-279994834, new i40.a(rVar2, 12), mVar2), mVar2, i30);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ii0.a aVar2 = ii0.a.f93546a;
                ((e2.d) obj).getClass();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    x.a(mVar3, 0);
                    h4.r.a aVar3 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar3, j92.b.f97899b.f97917b), mVar3);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ii0.b bVar3 = ii0.b.f93557a;
                ((e2.d) obj).getClass();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = d2.a(t62.b.f162798a);
                    String strQ = y.Q(mVar4, R.string.social_empty_discover_contacts_title);
                    String strQ2 = y.Q(mVar4, R.string.social_empty_discover_contacts_message);
                    h4.r.a aVar4 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    b82.n.c(dVarA, strQ, strQ2, c2.l.C(aVar4, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13), null, mVar4, 0, 16);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ii0.d dVar = ii0.d.f93571a;
                ((e2.d) obj).getClass();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var5 = p3.n.f135158a;
                    x.a(mVar5, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ii0.d dVar2 = ii0.d.f93571a;
                ((e2.d) obj).getClass();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var6 = p3.n.f135158a;
                    r1.b(y.Q(mVar6, R.string.lbl_follower_requests), null, mVar6, 0, 2);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ii0.d dVar3 = ii0.d.f93571a;
                ((e2.d) obj).getClass();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var7 = p3.n.f135158a;
                    r1.b(y.Q(mVar7, R.string.concept_followers), null, mVar7, 0, 2);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ii0.d dVar4 = ii0.d.f93571a;
                ((e2.d) obj).getClass();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var8 = p3.n.f135158a;
                    h4.r.a aVar5 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar5, j92.b.f97899b.f97918c), mVar8);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ii0.d dVar5 = ii0.d.f93571a;
                ((e2.d) obj).getClass();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x1 x1Var9 = p3.n.f135158a;
                    h4.r.a aVar6 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar6, j92.b.f97899b.f97918c), mVar9);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ii0.g gVar = ii0.g.f93601a;
                ((e2.d) obj).getClass();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    x1 x1Var10 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    b82.n.c(o7.a(t62.b.f162798a), y.Q(mVar10, R.string.msg_empty_search_title), y.Q(mVar10, R.string.msg_empty_search_description), null, null, mVar10, 0, 24);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                h82.r rVar3 = (h82.r) obj;
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ij1.a aVar7 = ij1.a.f93817a;
                rVar3.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= mVar11.B(rVar3) ? 4 : 2;
                }
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    x1 x1Var11 = p3.n.f135158a;
                    int i34 = (iIntValue11 << 3) & 112;
                    rVar3.D(R.string.primary_training_device, mVar11, i34);
                    rVar3.l(R.string.primary_training_help_description, (iIntValue11 << 6) & 896, 2, null, mVar11);
                    int i35 = i34 | 6;
                    rVar3.j(z3.f.c(-867102138, new i40.a(rVar3, 15), mVar11), mVar11, i35);
                    rVar3.j(z3.f.c(1475781949, new i40.a(rVar3, i24), mVar11), mVar11, i35);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 11:
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                io1.a aVar8 = io1.a.f94593a;
                ((e2.d) obj).getClass();
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    x1 x1Var12 = p3.n.f135158a;
                    io1.e.b(mVar12, 0);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 12:
                h4.r rVar4 = (h4.r) obj;
                p3.m mVar13 = (p3.m) obj2;
                v.h.y(-1581184155, rVar4, (Integer) obj3, mVar13);
                x1 x1Var13 = p3.n.f135158a;
                h4.r rVarB = a2.b(rVar4, a2.a(mVar13), true);
                mVar13.f();
                return rVarB;
            case 13:
                h82.r rVar5 = (h82.r) obj;
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                iv1.a aVar9 = iv1.a.f95206a;
                rVar5.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= mVar14.B(rVar5) ? 4 : 2;
                }
                if (mVar14.n(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    x1 x1Var14 = p3.n.f135158a;
                    int i36 = (iIntValue13 << 3) & 112;
                    rVar5.D(R.string.what_events_can_i_train_for, mVar14, i36);
                    int i37 = (iIntValue13 << 6) & 896;
                    rVar5.l(R.string.create_coach_plan_for_events, i37, 2, null, mVar14);
                    rVar5.o(R.string.events_training_help_description, i37, 2, null, mVar14);
                    rVar5.q(y.P(R.string.events_training_help_description_dates, new Object[]{"6-52"}, mVar14), mVar14, i36);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 14:
                h82.r rVar6 = (h82.r) obj;
                p3.m mVar15 = (p3.m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ix.m mVar16 = ix.m.f95670a;
                rVar6.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= mVar15.B(rVar6) ? 4 : 2;
                }
                if (mVar15.n(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    x1 x1Var15 = p3.n.f135158a;
                    rVar6.D(R.string.gcm_help_body_battery_section4_title, mVar15, (iIntValue14 << 3) & 112);
                    rVar6.o(R.string.gcm_body_battery_help_about_label_2, (iIntValue14 << 6) & 896, 2, null, mVar15);
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 15:
                h82.r rVar7 = (h82.r) obj;
                p3.m mVar17 = (p3.m) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ix0.a aVar10 = ix0.a.f95672a;
                rVar7.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= mVar17.B(rVar7) ? 4 : 2;
                }
                if (mVar17.n(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    x1 x1Var16 = p3.n.f135158a;
                    int i38 = (iIntValue15 << 3) & 112;
                    rVar7.D(R.string.mct_menstrual_cycles, mVar17, i38);
                    int i39 = i38 | 6;
                    rVar7.j(z3.f.c(-1063307603, new i40.a(rVar7, 19), mVar17), mVar17, i39);
                    rVar7.j(z3.f.c(-2096109354, new i40.a(rVar7, 20), mVar17), mVar17, i39);
                    rVar7.j(z3.f.c(-801690507, new i40.a(rVar7, 21), mVar17), mVar17, i39);
                    rVar7.j(z3.f.c(492728340, new i40.a(rVar7, 22), mVar17), mVar17, i39);
                    rVar7.j(z3.f.c(1787147187, new i40.a(rVar7, 23), mVar17), mVar17, i39);
                    rVar7.j(z3.f.c(-1213401262, new i40.a(rVar7, 24), mVar17), mVar17, i39);
                    rVar7.o(R.string.mct_this_feature_is_not_contraception, (iIntValue15 << 6) & 896, 2, null, mVar17);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 16:
                h82.r rVar8 = (h82.r) obj;
                p3.m mVar18 = (p3.m) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ix0.a aVar11 = ix0.a.f95672a;
                rVar8.getClass();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= mVar18.B(rVar8) ? 4 : 2;
                }
                if (mVar18.n(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    x1 x1Var17 = p3.n.f135158a;
                    int i44 = (iIntValue16 << 3) & 112;
                    rVar8.D(R.string.pregnancy_help_guidance_advice, mVar18, i44);
                    rVar8.l(R.string.pregnancy_help_overview_subtitle, (iIntValue16 << 6) & 896, 2, null, mVar18);
                    int i45 = i44 | 6;
                    rVar8.j(z3.f.c(238461119, new i40.a(rVar8, 25), mVar18), mVar18, i45);
                    rVar8.j(z3.f.c(1187205622, new i40.a(rVar8, i17), mVar18), mVar18, i45);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 17:
                h82.r rVar9 = (h82.r) obj;
                p3.m mVar19 = (p3.m) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ix0.b bVar4 = ix0.b.f95675a;
                rVar9.getClass();
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= mVar19.B(rVar9) ? 4 : 2;
                }
                if (mVar19.n(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                    x1 x1Var18 = p3.n.f135158a;
                    int i46 = (iIntValue17 << 3) & 112;
                    rVar9.D(R.string.pregnancy_help_guidance_advice, mVar19, i46);
                    int i47 = (iIntValue17 << 6) & 896;
                    rVar9.l(R.string.pregnancy_help_overview_subtitle, i47, 2, null, mVar19);
                    rVar9.t(R.string.pregnancy_help_updated_weekly_title, mVar19, i46);
                    rVar9.o(R.string.pregnancy_help_updated_weekly_body, i47, 2, null, mVar19);
                    rVar9.t(R.string.pregnancy_help_talk_to_your_doctor_title, mVar19, i46);
                    rVar9.o(R.string.pregnancy_help_talk_to_your_doctor_body, i47, 2, null, mVar19);
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 18:
                int i48 = 2;
                h82.r rVar10 = (h82.r) obj;
                p3.m mVar20 = (p3.m) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                iz1.a aVar12 = iz1.a.f95860a;
                rVar10.getClass();
                if ((iIntValue18 & 6) == 0) {
                    if (mVar20.B(rVar10)) {
                        i48 = 4;
                    }
                    iIntValue18 |= i48;
                }
                if (mVar20.n(iIntValue18 & 1, (iIntValue18 & 19) != 18)) {
                    x1 x1Var19 = p3.n.f135158a;
                    int i49 = (iIntValue18 << 3) & 112;
                    rVar10.D(R.string.training_priority, mVar20, i49);
                    int i54 = (iIntValue18 << 6) & 896;
                    rVar10.l(R.string.training_priority_help_description, i54, 2, null, mVar20);
                    int i55 = i49 | 6;
                    rVar10.j(z3.f.c(1821750390, new ix0.f(rVar10, 3), mVar20), mVar20, i55);
                    rVar10.j(z3.f.c(689464287, new ix0.f(rVar10, i18), mVar20), mVar20, i55);
                    rVar10.j(z3.f.c(-645909442, new ix0.f(rVar10, i16), mVar20), mVar20, i55);
                    rVar10.c(mVar20, iIntValue18 & 14);
                    Context context = (Context) mVar20.A(AndroidCompositionLocals_androidKt.f6042b);
                    String strQ3 = y.Q(mVar20, R.string.view_priority_of_all_events);
                    boolean zR = mVar20.r(context);
                    Object objQ = mVar20.q();
                    if (zR) {
                        objQ = new ho0.a(context, i15);
                        mVar20.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ho0.a(context, i15);
                            mVar20.K(objQ);
                        }
                    }
                    rVar10.h(i54, (e23.a) objQ, strQ3, mVar20);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 19:
                p3.m mVar21 = (p3.m) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                j21.a aVar13 = j21.a.f96635a;
                ((e2.d) obj).getClass();
                if (mVar21.n(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    x1 x1Var20 = p3.n.f135158a;
                    String strQ4 = y.Q(mVar21, R.string.lbl_no_results_found);
                    Object objQ2 = mVar21.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new j02.r(i16);
                        mVar21.K(objQ2);
                    }
                    j21.k.a(strQ4, (e23.l) objQ2, mVar21, 48);
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            case 20:
                p3.m mVar22 = (p3.m) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                j21.b bVar5 = j21.b.f96637a;
                ((e2.d) obj).getClass();
                if (mVar22.n(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    x1 x1Var21 = p3.n.f135158a;
                    p2.f111205a.a(y.Q(mVar22, R.string.lbl_empty_string), mVar22, 0);
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
            case 21:
                p3.m mVar23 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                j21.c cVar = j21.c.f96639a;
                ((e0) obj).getClass();
                x1 x1Var22 = p3.n.f135158a;
                String strQ5 = y.Q(mVar23, R.string.lbl_attention_required);
                String strP = y.P(R.string.servings_amount_must_be_greater_than, new Object[]{0}, mVar23);
                h4.r rVarF = x2.f(h4.r.S, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j92.e eVar = j92.b.f97899b;
                h4.r rVarA = c2.l.A(c2.l.C(rVarF, 0.0f, eVar.f97917b, 0.0f, eVar.f97918c, 5), eVar.f97920e, 0.0f, 2);
                boolean zB = mVar23.B(strQ5) | mVar23.B(strP);
                Object objQ3 = mVar23.q();
                if (zB) {
                    objQ3 = new cn1.j(strQ5, strP, i19);
                    mVar23.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new cn1.j(strQ5, strP, i19);
                        mVar23.K(objQ3);
                    }
                }
                h4.r rVarC = v.c((e23.l) objQ3, rVarA, false);
                String strN = fb1.c.n(Marker.ANY_MARKER, strP);
                d6.h.f57752b.getClass();
                int i56 = d6.h.f57757g;
                d92.b.f58624b.getClass();
                mh.c(strN, rVarC, 0L, null, 0L, null, 0L, d6.h.a(i56), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar23), mVar23, 0, 0, 130044);
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj3).getClass();
                j21.c cVar2 = j21.c.f96639a;
                ((e0) obj).getClass();
                x1 x1Var23 = p3.n.f135158a;
                h4.r.a aVar14 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarQ = x2.q(c2.l.C(aVar14, j92.b.f97899b.f97918c, 0.0f, 0.0f, 0.0f, 14), j92.b.f97901d.f97904c);
                s62.a.f157643a.getClass();
                y0.b(s9.a(t62.b.f162798a), null, rVarQ, null, (p3.m) obj2, 48, 120);
                return Unit.INSTANCE;
            case 23:
                h4.r rVar11 = (h4.r) obj;
                p3.m mVar24 = (p3.m) obj2;
                v.h.y(-1926522542, rVar11, (Integer) obj3, mVar24);
                x1 x1Var24 = p3.n.f135158a;
                h4.r rVarA2 = l4.k.a(rVar11, 0.5f);
                mVar24.f();
                return rVarA2;
            case 24:
                h4.r rVar12 = (h4.r) obj;
                p3.m mVar25 = (p3.m) obj2;
                v.h.y(-1901663499, rVar12, (Integer) obj3, mVar25);
                x1 x1Var25 = p3.n.f135158a;
                h4.r rVarA3 = l4.k.a(rVar12, 0.5f);
                mVar25.f();
                return rVarA3;
            case 25:
                p3.m mVar26 = (p3.m) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                p003ji0.i iVar = p003ji0.i.f98783a;
                ((e2.d) obj).getClass();
                if (mVar26.n(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    x1 x1Var26 = p3.n.f135158a;
                    p003ji0.l.a(R.string.msg_search_at_least_two, mVar26, 0);
                } else {
                    mVar26.e();
                }
                return Unit.INSTANCE;
            case 26:
                p3.m mVar27 = (p3.m) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                p003ji0.i iVar2 = p003ji0.i.f98783a;
                ((e2.d) obj).getClass();
                if (mVar27.n(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    x1 x1Var27 = p3.n.f135158a;
                    c0.f112641a.e(mVar27, 0);
                } else {
                    mVar27.e();
                }
                return Unit.INSTANCE;
            case 27:
                p3.m mVar28 = (p3.m) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                p003ji0.i iVar3 = p003ji0.i.f98783a;
                ((e2.d) obj).getClass();
                if (mVar28.n(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    x1 x1Var28 = p3.n.f135158a;
                    p003ji0.l.a(R.string.msg_search_no_match, mVar28, 0);
                } else {
                    mVar28.e();
                }
                return Unit.INSTANCE;
            case 28:
                p3.m mVar29 = (p3.m) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                jl1.b bVar6 = jl1.b.f99470a;
                ((e2.d) obj).getClass();
                if (mVar29.n(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    x1 x1Var29 = p3.n.f135158a;
                    String strQ6 = y.Q(mVar29, R.string.msg_select_activities_info);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97932i, mVar29);
                    h4.r.a aVar15 = h4.r.S;
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    mh.c(strQ6, c2.l.C(c2.l.A(aVar15, eVar2.f97920e, 0.0f, 2), 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar29, 0, 0, 131068);
                } else {
                    mVar29.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar30 = (p3.m) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                jl1.b bVar7 = jl1.b.f99470a;
                ((e2.d) obj).getClass();
                if (mVar30.n(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    x1 x1Var30 = p3.n.f135158a;
                    String upperCase = y.Q(mVar30, R.string.lbl_favorites).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    Object objQ4 = mVar30.q();
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new w(i16);
                        mVar30.K(objQ4);
                    }
                    r1.c(upperCase, "", (e23.a) objQ4, false, null, null, mVar30, 432, 56);
                } else {
                    mVar30.e();
                }
                return Unit.INSTANCE;
        }
    }
}
