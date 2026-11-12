package ix0;

import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import gl1.y;
import h82.r;
import kq.g0;
import kq.k;
import kq.o;
import kq.o0;
import kq.t;
import kq.v;
import kq.x;
import kq.z;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f95686b;

    public /* synthetic */ f(r rVar, int i14) {
        this.f95685a = i14;
        this.f95686b = rVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f95685a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i14 = i.f95700f;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r rVar = this.f95686b;
                    rVar.t(R.string.mct_fertility_predictions, mVar, 0);
                    rVar.o(R.string.mct_fertility_predictions_body_1, 0, 2, null, mVar);
                    rVar.o(R.string.mct_fertility_predictions_body_2, 0, 2, null, mVar);
                    rVar.q(y.P(R.string.mct_fertility_predictions_body_3, new Object[]{y.Q(mVar, R.string.mct_no_period)}, mVar), mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i15 = i.f95700f;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r rVar2 = this.f95686b;
                    rVar2.t(R.string.lbl_ovulation_estimates, mVar2, 0);
                    rVar2.o(R.string.msg_ovulation_estimates, 0, 2, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i16 = i.f95700f;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    r rVar3 = this.f95686b;
                    rVar3.t(R.string.mct_hormonal_contraceptives, mVar3, 0);
                    rVar3.o(R.string.mct_hormonal_contraception_body_1, 0, 2, null, mVar3);
                    rVar3.o(R.string.mct_hormonal_contraception_body_2, 0, 2, null, mVar3);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                iz1.a aVar = iz1.a.f95860a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    r rVar4 = this.f95686b;
                    rVar4.t(R.string.primary_event, mVar4, 0);
                    rVar4.o(R.string.primary_event_help_description, 0, 2, null, mVar4);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                iz1.a aVar2 = iz1.a.f95860a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    r rVar5 = this.f95686b;
                    rVar5.t(R.string.supporting_events, mVar5, 0);
                    rVar5.o(R.string.supporting_event_help_description_1, 0, 2, null, mVar5);
                    rVar5.o(R.string.supporting_event_help_description_2, 0, 2, null, mVar5);
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                iz1.a aVar3 = iz1.a.f95860a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    r rVar6 = this.f95686b;
                    rVar6.t(R.string.changing_training_priority, mVar6, 0);
                    rVar6.o(R.string.changing_training_priority_help_description, 0, 2, null, mVar6);
                } else {
                    mVar6.e();
                }
                break;
            case 6:
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i17 = kq.f.f106067f;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    r rVar7 = this.f95686b;
                    rVar7.D(R.string.hiit_help_title, mVar7, 0);
                    rVar7.l(R.string.hiit_help_description, 0, 2, null, mVar7);
                } else {
                    mVar7.e();
                }
                break;
            case 7:
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int i18 = k.f106092f;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    r rVar8 = this.f95686b;
                    rVar8.D(R.string.lbl_breathwork, mVar8, 0);
                    rVar8.l(R.string.breathwork_help_description, 0, 2, null, mVar8);
                } else {
                    mVar8.e();
                }
                break;
            case 8:
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                o oVar = o.f106112a;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    x0.f23314a.getClass();
                    String strW = gl1.d.W(x0.f23575p9);
                    r rVar9 = this.f95686b;
                    rVar9.s(0, 2, strW, null, mVar9);
                    rVar9.q(gl1.d.W(x0.A9), mVar9, 0);
                    rVar9.q(gl1.d.W(x0.G9), mVar9, 0);
                } else {
                    mVar9.e();
                }
                break;
            case 9:
                m mVar10 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                kq.p pVar = kq.p.f106117a;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    r rVar10 = this.f95686b;
                    rVar10.D(R.string.dance_metrics, mVar10, 0);
                    rVar10.l(R.string.dance_metrics_help_paragraph1, 0, 2, null, mVar10);
                } else {
                    mVar10.e();
                }
                break;
            case 10:
                m mVar11 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                t tVar = t.f106129a;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    r rVar11 = this.f95686b;
                    rVar11.D(R.string.jump_rope_speed_help_title, mVar11, 0);
                    rVar11.l(R.string.jump_rope_speed_help_text, 0, 2, null, mVar11);
                } else {
                    mVar11.e();
                }
                break;
            case 11:
                m mVar12 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                v vVar = v.f106136a;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    r rVar12 = this.f95686b;
                    rVar12.D(R.string.lbl_pack_weight, mVar12, 0);
                    rVar12.l(R.string.lbl_pack_weight_help_description, 0, 2, null, mVar12);
                } else {
                    mVar12.e();
                }
                break;
            case 12:
                m mVar13 = (m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                x xVar = x.f106142a;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    r rVar13 = this.f95686b;
                    rVar13.t(R.string.race_predictor_trends_help_in_gcm_title, mVar13, 0);
                    rVar13.o(R.string.race_predictor_trends_help_in_gcm_description, 0, 2, null, mVar13);
                } else {
                    mVar13.e();
                }
                break;
            case 13:
                m mVar14 = (m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                z zVar = z.f106149a;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = n.f135158a;
                    r rVar14 = this.f95686b;
                    rVar14.t(R.string.lbl_stamina_help_potential_actual_title_v2, mVar14, 0);
                    rVar14.o(R.string.lbl_stamina_help_potential_actual_paragraph_1, 0, 2, null, mVar14);
                    rVar14.o(R.string.lbl_stamina_help_potential_actual_paragraph_2, 0, 2, null, mVar14);
                    rVar14.o(R.string.lbl_stamina_help_potential_actual_paragraph_3, 0, 2, null, mVar14);
                    rVar14.o(R.string.lbl_stamina_help_potential_actual_paragraph_4, 0, 2, null, mVar14);
                } else {
                    mVar14.e();
                }
                break;
            case 14:
                m mVar15 = (m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                z zVar2 = z.f106149a;
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = n.f135158a;
                    r rVar15 = this.f95686b;
                    rVar15.t(R.string.lbl_stamina_help_training_title, mVar15, 0);
                    rVar15.o(R.string.lbl_stamina_help_training_description_v2, 0, 2, null, mVar15);
                } else {
                    mVar15.e();
                }
                break;
            case 15:
                m mVar16 = (m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                int i19 = g0.f106072g;
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = n.f135158a;
                    r rVar16 = this.f95686b;
                    rVar16.t(R.string.lbl_using_cycling_position, mVar16, 0);
                    rVar16.o(R.string.msg_cycling_position_by_reviewing, 0, 2, null, mVar16);
                    x0.f23314a.getClass();
                    rVar16.q(gl1.d.W(x0.f23673v9), mVar16, 0);
                } else {
                    mVar16.e();
                }
                break;
            case 16:
                m mVar17 = (m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                int i24 = g0.f106072g;
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var17 = n.f135158a;
                    r rVar17 = this.f95686b;
                    rVar17.t(R.string.lbl_using_cycling_position, mVar17, 0);
                    rVar17.o(R.string.msg_cycling_position_by_reviewing, 0, 2, null, mVar17);
                } else {
                    mVar17.e();
                }
                break;
            case 17:
                m mVar18 = (m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                int i25 = o0.f106115f;
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var18 = n.f135158a;
                    x0.f23314a.getClass();
                    String strW2 = gl1.d.W(x0.f23657u9);
                    r rVar18 = this.f95686b;
                    rVar18.s(0, 2, strW2, null, mVar18);
                    rVar18.q(gl1.d.W(x0.C9), mVar18, 0);
                    rVar18.q(gl1.d.W(x0.f23741z9), mVar18, 0);
                } else {
                    mVar18.e();
                }
                break;
            case 18:
                m mVar19 = (m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                int i26 = o81.a.f130834f;
                if (mVar19.n(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x1 x1Var19 = n.f135158a;
                    r rVar19 = this.f95686b;
                    rVar19.t(R.string.lbl_about_hill_score, mVar19, 0);
                    rVar19.o(R.string.msg_hill_score_metric_utility_description_v2, 0, 2, null, mVar19);
                } else {
                    mVar19.e();
                }
                break;
            case 19:
                m mVar20 = (m) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                or0.a aVar4 = or0.a.f133327a;
                if (mVar20.n(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    x1 x1Var20 = n.f135158a;
                    r rVar20 = this.f95686b;
                    rVar20.t(R.string.common_lbl_automatic, mVar20, 0);
                    rVar20.o(R.string.intensity_minutes_config_default_calc_desc, 0, 2, null, mVar20);
                } else {
                    mVar20.e();
                }
                break;
            case 20:
                m mVar21 = (m) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                or0.a aVar5 = or0.a.f133327a;
                if (mVar21.n(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    x1 x1Var21 = n.f135158a;
                    r rVar21 = this.f95686b;
                    rVar21.t(R.string.devices_lbl_heart_rate_zones, mVar21, 0);
                    rVar21.o(R.string.intensity_minutes_config_calc_method_hr_zones_desc, 0, 2, null, mVar21);
                } else {
                    mVar21.e();
                }
                break;
            case 21:
                m mVar22 = (m) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                or0.j.a aVar6 = or0.j.f133348g;
                if (mVar22.n(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    x1 x1Var22 = n.f135158a;
                    mVar22.C(1331867747);
                    String str = y.Q(mVar22, R.string.intensity_msg_health_organizations_recommendation) + StringUtils.SPACE + y.Q(mVar22, R.string.intensity_msg_im_week_total);
                    mVar22.f();
                    this.f95686b.q(str, mVar22, 0);
                } else {
                    mVar22.e();
                }
                break;
            case 22:
                m mVar23 = (m) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                or0.j.a aVar7 = or0.j.f133348g;
                if (mVar23.n(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    x1 x1Var23 = n.f135158a;
                    r rVar22 = this.f95686b;
                    rVar22.t(R.string.lbl_intensity_moderate, mVar23, 0);
                    rVar22.o(R.string.lbl_help_moderate_explanation, 0, 2, null, mVar23);
                } else {
                    mVar23.e();
                }
                break;
            case 23:
                m mVar24 = (m) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                or0.j.a aVar8 = or0.j.f133348g;
                if (mVar24.n(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    x1 x1Var24 = n.f135158a;
                    r rVar23 = this.f95686b;
                    rVar23.t(R.string.lbl_intensity_vigorous, mVar24, 0);
                    rVar23.o(R.string.intensity_minutes_config_vigorous_desc, 0, 2, null, mVar24);
                } else {
                    mVar24.e();
                }
                break;
            case 24:
                m mVar25 = (m) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                or0.j.a aVar9 = or0.j.f133348g;
                if (mVar25.n(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    x1 x1Var25 = n.f135158a;
                    r rVar24 = this.f95686b;
                    rVar24.t(R.string.reaching_your_goal, mVar25, 0);
                    rVar24.o(R.string.intensity_msg_reach_im_goal, 0, 2, null, mVar25);
                } else {
                    mVar25.e();
                }
                break;
            case 25:
                m mVar26 = (m) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                or0.j.a aVar10 = or0.j.f133348g;
                if (mVar26.n(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    x1 x1Var26 = n.f135158a;
                    r rVar25 = this.f95686b;
                    rVar25.t(R.string.reaching_your_goal, mVar26, 0);
                    rVar25.o(R.string.lbl_help_complete_intensity_minutes, 0, 2, null, mVar26);
                } else {
                    mVar26.e();
                }
                break;
            case 26:
                m mVar27 = (m) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                or0.j.a aVar11 = or0.j.f133348g;
                if (mVar27.n(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    x1 x1Var27 = n.f135158a;
                    r rVar26 = this.f95686b;
                    rVar26.D(R.string.title_intensity_minutes, mVar27, 0);
                    rVar26.l(R.string.intensity_minutes_general_info, 0, 2, null, mVar27);
                } else {
                    mVar27.e();
                }
                break;
            case 27:
                m mVar28 = (m) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                or0.j.a aVar12 = or0.j.f133348g;
                if (mVar28.n(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    x1 x1Var28 = n.f135158a;
                    r rVar27 = this.f95686b;
                    rVar27.t(R.string.lbl_intensity_moderate, mVar28, 0);
                    rVar27.o(R.string.lbl_help_moderate_explanation, 0, 2, null, mVar28);
                } else {
                    mVar28.e();
                }
                break;
            case 28:
                m mVar29 = (m) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                or0.j.a aVar13 = or0.j.f133348g;
                if (mVar29.n(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    x1 x1Var29 = n.f135158a;
                    r rVar28 = this.f95686b;
                    rVar28.t(R.string.lbl_intensity_vigorous, mVar29, 0);
                    rVar28.o(R.string.lbl_help_vigorous_explanation, 0, 2, null, mVar29);
                } else {
                    mVar29.e();
                }
                break;
            default:
                m mVar30 = (m) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                or0.j.a aVar14 = or0.j.f133348g;
                if (mVar30.n(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    x1 x1Var30 = n.f135158a;
                    r rVar29 = this.f95686b;
                    rVar29.t(R.string.reaching_your_goal, mVar30, 0);
                    rVar29.o(R.string.intensity_msg_reach_im_goal, 0, 2, null, mVar30);
                } else {
                    mVar30.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
