package wd0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import gl1.d;
import gl1.y;
import h82.r;
import java.util.List;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import ww.f;
import x91.j;
import xa1.b0;
import xh1.h;
import xn.x;
import yp0.k;
import zo1.z;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f184358b;

    public /* synthetic */ a(r rVar, int i14) {
        this.f184357a = i14;
        this.f184358b = rVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f184357a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                b bVar = b.f184359a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    x0.f23314a.getClass();
                    String strW = d.W(x0.G8);
                    r rVar = this.f184358b;
                    rVar.s(0, 2, strW, null, mVar);
                    rVar.q(d.W(x0.f23574p8), mVar, 0);
                    rVar.q(d.W(x0.f23591q8), mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                f.a aVar = f.f187506i;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r rVar2 = this.f184358b;
                    rVar2.d(R.string.lbl_getting_active, 0, 2, null, mVar2);
                    rVar2.d(R.string.lbl_eating_healthier, 0, 2, null, mVar2);
                    rVar2.d(R.string.lbl_limit_alcohol_caffeine_consumption, 0, 2, null, mVar2);
                    rVar2.d(R.string.lbl_reduce_salt_intake, 0, 2, null, mVar2);
                    rVar2.d(R.string.lbl_maintain_healthy_weight, 0, 2, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                f.a aVar2 = f.f187506i;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    r rVar3 = this.f184358b;
                    rVar3.d(R.string.lbl_blood_pressure_measuring_advice_1, 0, 2, null, mVar3);
                    rVar3.d(R.string.lbl_blood_pressure_measuring_advice_2, 0, 2, null, mVar3);
                    rVar3.d(R.string.lbl_blood_pressure_measuring_advice_3, 0, 2, null, mVar3);
                    rVar3.d(R.string.lbl_blood_pressure_measuring_advice_4, 0, 2, null, mVar3);
                    rVar3.d(R.string.lbl_blood_pressure_measuring_advice_5, 0, 2, null, mVar3);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                f.a aVar3 = f.f187506i;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    r rVar4 = this.f184358b;
                    rVar4.D(R.string.lbl_blood_pressure, mVar4, 0);
                    rVar4.l(R.string.lbl_blood_pressure_help_msg, 0, 2, null, mVar4);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i14 = b0.f189732f;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    r rVar5 = this.f184358b;
                    rVar5.D(R.string.power_guide_title, mVar5, 0);
                    Context context = (Context) mVar5.A(AndroidCompositionLocals_androidKt.f6042b);
                    String strQ = y.Q(mVar5, R.string.power_guide_help_intro);
                    Object objQ = mVar5.q();
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new j(10);
                        mVar5.K(objQ);
                    }
                    rVar5.l(R.string.power_guide_help_intro, 0, 0, oi0.c.A(context, (l) objQ, strQ), mVar5);
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                xc1.a aVar4 = xc1.a.f189964a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    r rVar6 = this.f184358b;
                    rVar6.D(R.string.proj_rtp_help_header_title, mVar6, 0);
                    rVar6.l(R.string.proj_rtp_help_header_description, 0, 2, null, mVar6);
                } else {
                    mVar6.e();
                }
                break;
            case 6:
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i15 = h.f191064f;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    r rVar7 = this.f184358b;
                    rVar7.D(R.string.lbl_css, mVar7, 0);
                    rVar7.l(R.string.msg_css_short_description, 0, 2, null, mVar7);
                } else {
                    mVar7.e();
                }
                break;
            case 7:
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                xk1.a aVar5 = xk1.a.f191211a;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    r rVar8 = this.f184358b;
                    rVar8.t(R.string.hr_zones_help_zone_1_title, mVar8, 0);
                    rVar8.o(R.string.hr_zones_help_zone_1_descr, 0, 2, null, mVar8);
                } else {
                    mVar8.e();
                }
                break;
            case 8:
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                xk1.a aVar6 = xk1.a.f191211a;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    r rVar9 = this.f184358b;
                    rVar9.t(R.string.hr_zones_help_zone_2_title, mVar9, 0);
                    rVar9.o(R.string.hr_zones_help_zone_2_descr, 0, 2, null, mVar9);
                } else {
                    mVar9.e();
                }
                break;
            case 9:
                m mVar10 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                xk1.a aVar7 = xk1.a.f191211a;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    r rVar10 = this.f184358b;
                    rVar10.t(R.string.hr_zones_help_zone_3_title, mVar10, 0);
                    rVar10.o(R.string.hr_zones_help_zone_3_descr, 0, 2, null, mVar10);
                } else {
                    mVar10.e();
                }
                break;
            case 10:
                m mVar11 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                xk1.a aVar8 = xk1.a.f191211a;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    r rVar11 = this.f184358b;
                    rVar11.t(R.string.hr_zones_help_zone_4_title, mVar11, 0);
                    rVar11.o(R.string.hr_zones_help_zone_4_descr, 0, 2, null, mVar11);
                } else {
                    mVar11.e();
                }
                break;
            case 11:
                m mVar12 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                xk1.a aVar9 = xk1.a.f191211a;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    r rVar12 = this.f184358b;
                    rVar12.t(R.string.hr_zones_help_zone_5_title, mVar12, 0);
                    rVar12.o(R.string.hr_zones_help_zone_5_descr, 0, 2, null, mVar12);
                } else {
                    mVar12.e();
                }
                break;
            case 12:
                m mVar13 = (m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                xk1.a aVar10 = xk1.a.f191211a;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    r rVar13 = this.f184358b;
                    rVar13.t(R.string.allday_stress_unmeasurable, mVar13, 0);
                    rVar13.o(R.string.hr_zones_help_zone_unmeasurable, 0, 2, null, mVar13);
                } else {
                    mVar13.e();
                }
                break;
            case 13:
                m mVar14 = (m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                int i16 = xk1.f.f191223j;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = n.f135158a;
                    String strB = g22.n.b(y.Q(mVar14, R.string.lbl_heart_rate_zones_low_cap));
                    r rVar14 = this.f184358b;
                    rVar14.E(strB, mVar14, 0);
                    rVar14.l(R.string.hr_zones_help_lead_paragraph, 0, 2, null, mVar14);
                } else {
                    mVar14.e();
                }
                break;
            case 14:
                m mVar15 = (m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                xn.d dVar = xn.d.f191592a;
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = n.f135158a;
                    r rVar15 = this.f184358b;
                    rVar15.getClass();
                    rVar15.f(r.G(mVar15, R.string.activities_gaming_win_10_percent), null, mVar15, 0, 2);
                    rVar15.f(r.G(mVar15, R.string.activities_gaming_tie_11_to_60_percent), null, mVar15, 0, 2);
                    rVar15.f(r.G(mVar15, R.string.activities_gaming_loss_61_percent_or_lower), null, mVar15, 0, 2);
                } else {
                    mVar15.e();
                }
                break;
            case 15:
                m mVar16 = (m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                xn.d dVar2 = xn.d.f191592a;
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = n.f135158a;
                    r rVar16 = this.f184358b;
                    rVar16.t(R.string.activities_gaming_win_rate_heading, mVar16, 0);
                    rVar16.o(R.string.activities_gaming_win_rate_desc, 0, 2, null, mVar16);
                    rVar16.g(z3.f.c(-607647021, new a(rVar16, 14), mVar16), mVar16, 6);
                } else {
                    mVar16.e();
                }
                break;
            case 16:
                m mVar17 = (m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                int i17 = xn.p.f191619g;
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var17 = n.f135158a;
                    r rVar17 = this.f184358b;
                    rVar17.D(R.string.lbl_nutrition_hydration_tracking, mVar17, 0);
                    rVar17.l(R.string.lbl_nutrition_hydration_tracking_description, 0, 2, null, mVar17);
                } else {
                    mVar17.e();
                }
                break;
            case 17:
                m mVar18 = (m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                List<Integer> list = x.f191633p;
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var18 = n.f135158a;
                    r rVar18 = this.f184358b;
                    rVar18.D(R.string.activity_details_running_dynamics_title, mVar18, 0);
                    rVar18.l(R.string.running_dynamics_help_text, 0, 2, null, mVar18);
                } else {
                    mVar18.e();
                }
                break;
            case 18:
                m mVar19 = (m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                xo.a aVar11 = xo.a.f191747a;
                if (mVar19.n(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x1 x1Var19 = n.f135158a;
                    r rVar19 = this.f184358b;
                    rVar19.t(R.string.edit_legs_adjusting_duration_distance, mVar19, 0);
                    rVar19.o(R.string.edit_legs_adjusting_duration_distance_help_text, 0, 2, null, mVar19);
                } else {
                    mVar19.e();
                }
                break;
            case 19:
                m mVar20 = (m) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                xo.a aVar12 = xo.a.f191747a;
                if (mVar20.n(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    x1 x1Var20 = n.f135158a;
                    r rVar20 = this.f184358b;
                    rVar20.t(R.string.edit_legs_dividing_legs, mVar20, 0);
                    rVar20.o(R.string.edit_legs_dividing_legs_help_text, 0, 2, null, mVar20);
                } else {
                    mVar20.e();
                }
                break;
            case 20:
                m mVar21 = (m) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                xo.a aVar13 = xo.a.f191747a;
                if (mVar21.n(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    x1 x1Var21 = n.f135158a;
                    r rVar21 = this.f184358b;
                    rVar21.t(R.string.edit_legs_deleting_legs, mVar21, 0);
                    rVar21.o(R.string.edit_legs_deleting_legs_help_text, 0, 2, null, mVar21);
                } else {
                    mVar21.e();
                }
                break;
            case 21:
                m mVar22 = (m) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                yp0.c cVar = yp0.c.f198630a;
                if (mVar22.n(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    x1 x1Var22 = n.f135158a;
                    r rVar22 = this.f184358b;
                    rVar22.d(R.string.lbl_hydration_temperature_regulation, 0, 2, null, mVar22);
                    rVar22.d(R.string.lbl_hydration_joint_protection, 0, 2, null, mVar22);
                    rVar22.d(R.string.lbl_hydration_waste_removal, 0, 2, null, mVar22);
                    rVar22.d(R.string.lbl_hydration_skin_defense, 0, 2, null, mVar22);
                    rVar22.d(R.string.lbl_hydration_weight_loss, 0, 2, null, mVar22);
                    rVar22.d(R.string.lbl_hydration_disease_defense, 0, 2, null, mVar22);
                } else {
                    mVar22.e();
                }
                break;
            case 22:
                m mVar23 = (m) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                yp0.c cVar2 = yp0.c.f198630a;
                if (mVar23.n(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    x1 x1Var23 = n.f135158a;
                    r rVar23 = this.f184358b;
                    rVar23.t(R.string.lbl_hydration_benefits_help_heading, mVar23, 0);
                    rVar23.o(R.string.msg_hydration_help_water_benefits, 0, 2, null, mVar23);
                    rVar23.g(z3.f.c(-195913098, new a(rVar23, 21), mVar23), mVar23, 6);
                } else {
                    mVar23.e();
                }
                break;
            case 23:
                m mVar24 = (m) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                yp0.c cVar3 = yp0.c.f198630a;
                if (mVar24.n(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    x1 x1Var24 = n.f135158a;
                    r rVar24 = this.f184358b;
                    rVar24.t(R.string.lbl_when_to_hydrate, mVar24, 0);
                    rVar24.o(R.string.msg_when_to_hydrate_1, 0, 2, null, mVar24);
                    rVar24.o(R.string.msg_when_to_hydrate_2, 0, 2, null, mVar24);
                } else {
                    mVar24.e();
                }
                break;
            case 24:
                m mVar25 = (m) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                yp0.c cVar4 = yp0.c.f198630a;
                if (mVar25.n(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    x1 x1Var25 = n.f135158a;
                    r rVar25 = this.f184358b;
                    rVar25.t(R.string.lbl_hydration_choice_help_heading, mVar25, 0);
                    rVar25.o(R.string.msg_hydration_choice, 0, 2, null, mVar25);
                } else {
                    mVar25.e();
                }
                break;
            case 25:
                m mVar26 = (m) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                yp0.c cVar5 = yp0.c.f198630a;
                if (mVar26.n(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    x1 x1Var26 = n.f135158a;
                    r rVar26 = this.f184358b;
                    rVar26.t(R.string.lbl_daily_goal, mVar26, 0);
                    rVar26.o(R.string.msg_hydration_help_daily_goal, 0, 2, null, mVar26);
                    rVar26.o(R.string.msg_hydration_help_auto_goal, 0, 2, null, mVar26);
                } else {
                    mVar26.e();
                }
                break;
            case 26:
                m mVar27 = (m) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                yp0.c cVar6 = yp0.c.f198630a;
                if (mVar27.n(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    x1 x1Var27 = n.f135158a;
                    r rVar27 = this.f184358b;
                    rVar27.t(R.string.lbl_containers, mVar27, 0);
                    rVar27.q(y.P(R.string.msg_hydration_help_containers, new Object[]{y.Q(mVar27, R.string.lbl_hydration_drinking_containers), y.Q(mVar27, R.string.lbl_quick_add)}, mVar27), mVar27, 0);
                } else {
                    mVar27.e();
                }
                break;
            case 27:
                m mVar28 = (m) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                int i18 = k.f198665f;
                if (mVar28.n(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    x1 x1Var28 = n.f135158a;
                    r rVar28 = this.f184358b;
                    rVar28.D(R.string.lbl_hydration_title, mVar28, 0);
                    rVar28.l(R.string.msg_hydration_help_description, 0, 2, null, mVar28);
                } else {
                    mVar28.e();
                }
                break;
            case 28:
                m mVar29 = (m) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                z.a aVar14 = z.f206495h;
                if (mVar29.n(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    x1 x1Var29 = n.f135158a;
                    r rVar29 = this.f184358b;
                    rVar29.d(R.string.lbl_groupride_privacy_bullet_text1, 0, 2, null, mVar29);
                    rVar29.d(R.string.lbl_groupride_privacy_bullet_text2, 0, 2, null, mVar29);
                    rVar29.d(R.string.lbl_groupride_privacy_bullet_text3, 0, 2, null, mVar29);
                } else {
                    mVar29.e();
                }
                break;
            default:
                m mVar30 = (m) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                z.a aVar15 = z.f206495h;
                if (mVar30.n(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    x1 x1Var30 = n.f135158a;
                    r rVar30 = this.f184358b;
                    rVar30.d(R.string.lbl_groupride_privacy_bullet_text4, 0, 2, null, mVar30);
                    rVar30.d(R.string.lbl_groupride_privacy_bullet_text5, 0, 2, null, mVar30);
                    rVar30.d(R.string.lbl_groupride_privacy_bullet_text6, 0, 2, null, mVar30);
                } else {
                    mVar30.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
