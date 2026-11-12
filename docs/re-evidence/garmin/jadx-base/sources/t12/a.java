package t12;

import com.garmin.android.apps.connectmobile.R;
import e23.p;
import gl1.y;
import h82.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import t31.g;
import t61.e;
import t72.f;
import uj1.i0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f161738b;

    public /* synthetic */ a(r rVar, int i14) {
        this.f161737a = i14;
        this.f161738b = rVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f161737a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                b bVar = b.f161739a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r rVar = this.f161738b;
                    rVar.t(R.string.concept_activities, mVar, 0);
                    rVar.o(R.string.privacy_help_activities_description, 0, 2, null, mVar);
                    rVar.o(R.string.help_profile_and_privacy_activity_description2, 0, 2, null, mVar);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                b bVar2 = b.f161739a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r rVar2 = this.f161738b;
                    rVar2.t(R.string.follower_setup_follower_approval_title, mVar2, 0);
                    rVar2.o(R.string.privacy_help_follower_requests_description, 0, 2, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                b bVar3 = b.f161739a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    r rVar3 = this.f161738b;
                    rVar3.t(R.string.concept_badges, mVar3, 0);
                    rVar3.o(R.string.help_profile_and_privacy_badge_description, 0, 2, null, mVar3);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                b bVar4 = b.f161739a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    r rVar4 = this.f161738b;
                    rVar4.t(R.string.lbl_muted_users, mVar4, 0);
                    rVar4.o(R.string.privacy_help_muted_users_description, 0, 2, null, mVar4);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                b bVar5 = b.f161739a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    r rVar5 = this.f161738b;
                    rVar5.t(R.string.lbl_blocked_users, mVar5, 0);
                    rVar5.o(R.string.help_profile_and_privacy_blocked_users_description, 0, 2, null, mVar5);
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i14 = g.f162217g;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    String strQ = y.Q(mVar6, R.string.gcm_training_status_hrv_training_status);
                    r rVar6 = this.f161738b;
                    rVar6.s(0, 2, strQ, null, mVar6);
                    rVar6.q(y.Q(mVar6, R.string.gcm_training_status_hrv_training_status_desc), mVar6, 0);
                } else {
                    mVar6.e();
                }
                break;
            case 6:
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i15 = g.f162217g;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    String strQ2 = y.Q(mVar7, R.string.ohrv_help_title_about_status);
                    r rVar7 = this.f161738b;
                    rVar7.s(0, 2, strQ2, null, mVar7);
                    rVar7.q(y.Q(mVar7, R.string.ohrv_help_description_about_status), mVar7, 0);
                } else {
                    mVar7.e();
                }
                break;
            case 7:
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int i16 = g.f162217g;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    String strQ3 = y.Q(mVar8, R.string.ohrv_help_title_receiving_status);
                    r rVar8 = this.f161738b;
                    rVar8.s(0, 2, strQ3, null, mVar8);
                    rVar8.q(y.Q(mVar8, R.string.gcm_training_status_receiving_hrv_status_desc), mVar8, 0);
                } else {
                    mVar8.e();
                }
                break;
            case 8:
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                int i17 = e.f162741f;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    r rVar9 = this.f161738b;
                    rVar9.D(R.string.lbl_hrv_stress, mVar9, 0);
                    rVar9.l(R.string.gcm_help_hrv_stress_subtitle, 0, 2, null, mVar9);
                } else {
                    mVar9.e();
                }
                break;
            case 9:
                m mVar10 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                int i18 = f.f163126f;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    r rVar10 = this.f161738b;
                    rVar10.D(R.string.main_help_title, mVar10, 0);
                    rVar10.l(R.string.main_help_intro, 0, 2, null, mVar10);
                } else {
                    mVar10.e();
                }
                break;
            case 10:
                m mVar11 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                t72.g gVar = t72.g.f163127a;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    r rVar11 = this.f161738b;
                    rVar11.e(6, 2, "39-80 - Excellent", null, mVar11);
                    rVar11.e(6, 2, "35-38 - Good", null, mVar11);
                    rVar11.e(6, 2, "31-34 - Fair", null, mVar11);
                    rVar11.e(6, 2, "28-30 - Poor", null, mVar11);
                } else {
                    mVar11.e();
                }
                break;
            case 11:
                m mVar12 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                int i19 = tn.r.f165491f;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    r rVar12 = this.f161738b;
                    rVar12.D(R.string.lbl_health_snapshot, mVar12, 0);
                    rVar12.l(R.string.msg_health_snapshot_feature_info_v2, 0, 2, null, mVar12);
                } else {
                    mVar12.e();
                }
                break;
            case 12:
                m mVar13 = (m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                int i24 = i0.f171523j;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    r rVar13 = this.f161738b;
                    rVar13.t(R.string.lbl_emergency_calling, mVar13, 0);
                    rVar13.o(R.string.msg_emergency_calling_description, 0, 2, null, mVar13);
                } else {
                    mVar13.e();
                }
                break;
            case 13:
                m mVar14 = (m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                vg1.g gVar2 = vg1.g.f178109a;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = n.f135158a;
                    r rVar14 = this.f161738b;
                    rVar14.t(R.string.common_how_it_works, mVar14, 0);
                    rVar14.o(R.string.bike_alarm_how_it_works_description, 0, 2, null, mVar14);
                } else {
                    mVar14.e();
                }
                break;
            case 14:
                m mVar15 = (m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                vg1.g gVar3 = vg1.g.f178109a;
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = n.f135158a;
                    r rVar15 = this.f161738b;
                    rVar15.t(R.string.bike_alarm_theft_deterrent, mVar15, 0);
                    rVar15.o(R.string.bike_alarm_theft_deterrent_description, 0, 2, null, mVar15);
                    rVar15.o(R.string.pairing_generic_instructions_2_a, 0, 2, null, mVar15);
                } else {
                    mVar15.e();
                }
                break;
            case 15:
                m mVar16 = (m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                vp1.b bVar6 = vp1.b.f179385a;
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = n.f135158a;
                    r rVar16 = this.f161738b;
                    rVar16.D(R.string.help_solar_charging_title_4, mVar16, 0);
                    rVar16.l(R.string.help_solar_charging_message_4, 0, 2, null, mVar16);
                } else {
                    mVar16.e();
                }
                break;
            case 16:
                m mVar17 = (m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                vp1.b bVar7 = vp1.b.f179385a;
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var17 = n.f135158a;
                    r rVar17 = this.f161738b;
                    rVar17.t(R.string.help_solar_charging_title_5, mVar17, 0);
                    rVar17.o(R.string.help_solar_charging_message_5, 0, 2, null, mVar17);
                } else {
                    mVar17.e();
                }
                break;
            case 17:
                m mVar18 = (m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                vp1.b bVar8 = vp1.b.f179385a;
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var18 = n.f135158a;
                    r rVar18 = this.f161738b;
                    rVar18.t(R.string.help_solar_charging_title_6, mVar18, 0);
                    rVar18.o(R.string.help_solar_charging_message_6, 0, 2, null, mVar18);
                } else {
                    mVar18.e();
                }
                break;
            case 18:
                m mVar19 = (m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                vp1.b bVar9 = vp1.b.f179385a;
                if (mVar19.n(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x1 x1Var19 = n.f135158a;
                    r rVar19 = this.f161738b;
                    rVar19.t(R.string.help_solar_charging_title_7, mVar19, 0);
                    rVar19.o(R.string.help_solar_charging_message_7, 0, 2, null, mVar19);
                } else {
                    mVar19.e();
                }
                break;
            case 19:
                m mVar20 = (m) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                int i25 = vp1.f.f179398h;
                if (mVar20.n(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    x1 x1Var20 = n.f135158a;
                    r rVar20 = this.f161738b;
                    rVar20.D(R.string.help_solar_charging_title_1, mVar20, 0);
                    rVar20.l(R.string.help_solar_charging_message_1, 0, 2, null, mVar20);
                } else {
                    mVar20.e();
                }
                break;
            case 20:
                m mVar21 = (m) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                int i26 = vp1.f.f179398h;
                if (mVar21.n(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    x1 x1Var21 = n.f135158a;
                    r rVar21 = this.f161738b;
                    rVar21.t(R.string.common_how_it_works, mVar21, 0);
                    rVar21.o(R.string.help_solar_charging_message_2, 0, 2, null, mVar21);
                } else {
                    mVar21.e();
                }
                break;
            case 21:
                m mVar22 = (m) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                int i27 = vp1.f.f179398h;
                if (mVar22.n(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    x1 x1Var22 = n.f135158a;
                    r rVar22 = this.f161738b;
                    rVar22.t(R.string.help_solar_charging_title_3, mVar22, 0);
                    rVar22.o(R.string.help_solar_charging_message_3, 0, 2, null, mVar22);
                } else {
                    mVar22.e();
                }
                break;
            case 22:
                m mVar23 = (m) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                int i28 = vp1.f.f179398h;
                if (mVar23.n(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    x1 x1Var23 = n.f135158a;
                    r rVar23 = this.f161738b;
                    rVar23.t(R.string.lbl_solar_intensity_unmeasurable_header, mVar23, 0);
                    rVar23.o(R.string.lbl_solar_intensity_unmeasurable_text, 0, 2, null, mVar23);
                } else {
                    mVar23.e();
                }
                break;
            case 23:
                m mVar24 = (m) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                int i29 = vp1.f.f179398h;
                if (mVar24.n(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    x1 x1Var24 = n.f135158a;
                    r rVar24 = this.f161738b;
                    rVar24.D(R.string.help_solar_charging, mVar24, 0);
                    rVar24.l(R.string.help_solar_charging_message, 0, 2, null, mVar24);
                } else {
                    mVar24.e();
                }
                break;
            case 24:
                m mVar25 = (m) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                int i30 = vp1.f.f179398h;
                if (mVar25.n(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    x1 x1Var25 = n.f135158a;
                    r rVar25 = this.f161738b;
                    rVar25.j(z3.f.c(210033938, new a(rVar25, 23), mVar25), mVar25, 6);
                } else {
                    mVar25.e();
                }
                break;
            case 25:
                m mVar26 = (m) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                vr1.a aVar = vr1.a.f179483a;
                if (mVar26.n(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    x1 x1Var26 = n.f135158a;
                    r rVar26 = this.f161738b;
                    rVar26.t(R.string.stress_help_reading_title_2, mVar26, 0);
                    rVar26.o(R.string.stress_help_reading_description_2, 0, 2, null, mVar26);
                } else {
                    mVar26.e();
                }
                break;
            case 26:
                m mVar27 = (m) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                vr1.a aVar2 = vr1.a.f179483a;
                if (mVar27.n(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    x1 x1Var27 = n.f135158a;
                    r rVar27 = this.f161738b;
                    rVar27.t(R.string.stress_level_rest, mVar27, 0);
                    rVar27.o(R.string.stress_help_reading_description_3, 0, 2, null, mVar27);
                } else {
                    mVar27.e();
                }
                break;
            case 27:
                m mVar28 = (m) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                vr1.a aVar3 = vr1.a.f179483a;
                if (mVar28.n(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    x1 x1Var28 = n.f135158a;
                    r rVar28 = this.f161738b;
                    rVar28.t(R.string.device_screen_activity, mVar28, 0);
                    rVar28.o(R.string.stress_help_reading_description_4, 0, 2, null, mVar28);
                } else {
                    mVar28.e();
                }
                break;
            case 28:
                m mVar29 = (m) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.stress.presentation.view.a.C0859a c0859a = com.garmin.android.apps.connectmobile.stress.presentation.view.a.f45025j;
                if (mVar29.n(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    x1 x1Var29 = n.f135158a;
                    r rVar29 = this.f161738b;
                    rVar29.D(R.string.title_stress, mVar29, 0);
                    rVar29.l(R.string.stress_help_main_description, 0, 2, null, mVar29);
                } else {
                    mVar29.e();
                }
                break;
            default:
                m mVar30 = (m) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                vu0.a aVar4 = vu0.a.f180221a;
                if (mVar30.n(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    x1 x1Var30 = n.f135158a;
                    String strQ4 = y.Q(mVar30, R.string.lbl_using_grouptrack);
                    String strB = lv0.b.b(y.Q(mVar30, R.string.lbl_using_grouptrack), mVar30);
                    r rVar30 = this.f161738b;
                    rVar30.s(0, 0, strQ4, strB, mVar30);
                    rVar30.p(y.Q(mVar30, R.string.msg_grouptrack_usage), lv0.b.b(y.Q(mVar30, R.string.msg_grouptrack_usage), mVar30), mVar30, 0);
                } else {
                    mVar30.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
