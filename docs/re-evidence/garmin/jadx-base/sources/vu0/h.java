package vu0;

import c22.l3;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import f12.l;
import gl1.y;
import h82.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import w2.a0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f180244b;

    public /* synthetic */ h(r rVar, int i14) {
        this.f180243a = i14;
        this.f180244b = rVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f180243a;
        r rVar = this.f180244b;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i15 = j.f180247o;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r rVar2 = this.f180244b;
                    rVar2.D(R.string.title_live_track, mVar, 0);
                    rVar2.l(R.string.live_track_help_description_detailed, 0, 2, null, mVar);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i16 = j.f180247o;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r rVar3 = this.f180244b;
                    rVar3.t(R.string.livetrack_active_session_privacy, mVar2, 0);
                    rVar3.o(R.string.livetrack_active_session_description_1, 0, 2, null, mVar2);
                    rVar3.o(R.string.livetrack_past_active_session_description, 0, 2, null, mVar2);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i17 = j.f180247o;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    r rVar4 = this.f180244b;
                    rVar4.t(R.string.lbl_saved_session_privacy, mVar3, 0);
                    rVar4.o(R.string.livetrack_past_session_description, 0, 2, null, mVar3);
                    rVar4.o(R.string.livetrack_past_active_session_description, 0, 2, null, mVar3);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i18 = j.f180247o;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    r rVar5 = this.f180244b;
                    rVar5.t(R.string.lbl_access_code, mVar4, 0);
                    rVar5.o(R.string.lbl_access_code_help_description, 0, 2, null, mVar4);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i19 = j.f180247o;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    r rVar6 = this.f180244b;
                    rVar6.t(R.string.lbl_garmin_messenger_app_name, mVar5, 0);
                    rVar6.o(R.string.lbl_garmin_messenger_help_description, 0, 2, null, mVar5);
                } else {
                    mVar5.e();
                }
                break;
            case 5:
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i24 = j.f180247o;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    r rVar7 = this.f180244b;
                    rVar7.t(R.string.lbl_email_contacts, mVar6, 0);
                    rVar7.o(R.string.msg_how_to_share_livetrack_via_email, 0, 2, null, mVar6);
                } else {
                    mVar6.e();
                }
                break;
            case 6:
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i25 = j.f180247o;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    r rVar8 = this.f180244b;
                    rVar8.t(R.string.lbl_other_sharing_options, mVar7, 0);
                    rVar8.o(R.string.msg_how_to_share_livetrack_via_share_icon, 0, 2, null, mVar7);
                } else {
                    mVar7.e();
                }
                break;
            case 7:
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                vv0.a aVar = vv0.a.f180424a;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    rVar.E(y.Q(mVar8, R.string.lbl_log_your_behaviors), mVar8, 0);
                    rVar.q(y.Q(mVar8, R.string.msg_log_your_behaviors_help_intro), mVar8, 0);
                } else {
                    mVar8.e();
                }
                break;
            case 8:
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                vv0.a aVar2 = vv0.a.f180424a;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    String strQ = y.Q(mVar9, R.string.lbl_reports);
                    r rVar9 = this.f180244b;
                    rVar9.s(0, 2, strQ, null, mVar9);
                    rVar9.q(y.Q(mVar9, R.string.msg_reports_help_intro), mVar9, 0);
                } else {
                    mVar9.e();
                }
                break;
            case 9:
                m mVar10 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                vv0.a aVar3 = vv0.a.f180424a;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    String strQ2 = y.Q(mVar10, R.string.lbl_reading_your_reports);
                    r rVar10 = this.f180244b;
                    rVar10.s(0, 2, strQ2, null, mVar10);
                    rVar10.q(y.Q(mVar10, R.string.msg_reading_your_reports_help_1), mVar10, 0);
                    rVar10.q(y.Q(mVar10, R.string.msg_reading_your_reports_help_2), mVar10, 0);
                } else {
                    mVar10.e();
                }
                break;
            case 10:
                m mVar11 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                vv0.a aVar4 = vv0.a.f180424a;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    String strQ3 = y.Q(mVar11, R.string.lbl_unexpected_results);
                    r rVar11 = this.f180244b;
                    rVar11.s(0, 2, strQ3, null, mVar11);
                    rVar11.q(y.Q(mVar11, R.string.msg_unexpected_results_help_1), mVar11, 0);
                    rVar11.q(y.Q(mVar11, R.string.msg_unexpected_results_help_2), mVar11, 0);
                } else {
                    mVar11.e();
                }
                break;
            case 11:
                m mVar12 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                vv0.a aVar5 = vv0.a.f180424a;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    rVar.E(y.Q(mVar12, R.string.lbl_best_practices_for_logging), mVar12, 0);
                    rVar.q(y.Q(mVar12, R.string.msg_best_practices_for_logging_help_intro), mVar12, 0);
                } else {
                    mVar12.e();
                }
                break;
            case 12:
                m mVar13 = (m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                vv0.a aVar6 = vv0.a.f180424a;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    String strQ4 = y.Q(mVar13, R.string.lbl_log_each_day);
                    r rVar12 = this.f180244b;
                    rVar12.s(0, 2, strQ4, null, mVar13);
                    rVar12.q(y.Q(mVar13, R.string.msg_log_each_day_help_1), mVar13, 0);
                    rVar12.q(y.Q(mVar13, R.string.msg_log_each_day_help_2), mVar13, 0);
                } else {
                    mVar13.e();
                }
                break;
            case 13:
                m mVar14 = (m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                int i26 = vv0.f.f180442f;
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = n.f135158a;
                    String strQ5 = y.Q(mVar14, R.string.lbl_lifestyle_logging);
                    r rVar13 = this.f180244b;
                    rVar13.E(strQ5, mVar14, 0);
                    rVar13.m(0, 2, y.Q(mVar14, R.string.msg_lifestyle_logging_help_main), null, mVar14);
                } else {
                    mVar14.e();
                }
                break;
            case 14:
                m mVar15 = (m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                int i27 = vx1.d.f180657g;
                if (mVar15.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = n.f135158a;
                    r rVar14 = this.f180244b;
                    rVar14.t(R.string.lbl_safety_caution, mVar15, 0);
                    rVar14.o(R.string.msg_using_benchmarks_disclaimer, 0, 2, null, mVar15);
                } else {
                    mVar15.e();
                }
                break;
            case 15:
                m mVar16 = (m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                int i28 = w30.e.f181832f;
                if (mVar16.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = n.f135158a;
                    r rVar15 = this.f180244b;
                    rVar15.D(R.string.climb_help_title, mVar16, 0);
                    rVar15.l(R.string.climb_help_intro, 0, 2, null, mVar16);
                } else {
                    mVar16.e();
                }
                break;
            case 16:
                m mVar17 = (m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                w61.a aVar7 = w61.a.f183133a;
                if (mVar17.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var17 = n.f135158a;
                    boolean z14 = !((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
                    l3.a aVar8 = l3.f23124b;
                    l22.a aVarS = a0.s(mVar17);
                    aVar8.getClass();
                    String strU0 = l3.a.U0(aVarS, 22.0d, z14, false, true);
                    rVar.t(R.string.gcm_training_status_altitude_acclimation_header_2, mVar17, 0);
                    String strP = y.P(R.string.gcm_training_status_heat_acclimation_description_2, new Object[]{strU0}, mVar17);
                    Object objQ = mVar17.q();
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new w40.d(8);
                        mVar17.K(objQ);
                    }
                    rVar.p(strP, oi0.c.B(strP, (e23.l) objQ, mVar17), mVar17, 0);
                } else {
                    mVar17.e();
                }
                break;
            case 17:
                m mVar18 = (m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                w61.a aVar9 = w61.a.f183133a;
                if (mVar18.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var18 = n.f135158a;
                    r rVar16 = this.f180244b;
                    rVar16.t(R.string.gcm_training_status_altitude_acclimation_header_3, mVar18, 0);
                    rVar16.o(R.string.gcm_training_status_heat_acclimation_description_3, 0, 2, null, mVar18);
                } else {
                    mVar18.e();
                }
                break;
            case 18:
                m mVar19 = (m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                w61.a aVar10 = w61.a.f183133a;
                if (mVar19.n(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x1 x1Var19 = n.f135158a;
                    r rVar17 = this.f180244b;
                    rVar17.t(R.string.gcm_training_status_load_focus_header_2, mVar19, 0);
                    rVar17.o(R.string.gcm_training_status_load_focus_description_2, 0, 2, null, mVar19);
                } else {
                    mVar19.e();
                }
                break;
            case 19:
                m mVar20 = (m) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                w61.a aVar11 = w61.a.f183133a;
                if (mVar20.n(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    x1 x1Var20 = n.f135158a;
                    r rVar18 = this.f180244b;
                    rVar18.t(R.string.setting_a_device_priority, mVar20, 0);
                    rVar18.o(R.string.primary_training_device_help_description, 0, 2, null, mVar20);
                    rVar18.o(R.string.primary_wearable_help_recommendation, 0, 2, null, mVar20);
                } else {
                    mVar20.e();
                }
                break;
            case 20:
                m mVar21 = (m) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                w61.a aVar12 = w61.a.f183133a;
                if (mVar21.n(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    x1 x1Var21 = n.f135158a;
                    r rVar19 = this.f180244b;
                    rVar19.t(R.string.incompatible_devices, mVar21, 0);
                    rVar19.o(R.string.primary_training_device_disclaimer, 0, 2, null, mVar21);
                } else {
                    mVar21.e();
                }
                break;
            case 21:
                m mVar22 = (m) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                w61.a aVar13 = w61.a.f183133a;
                if (mVar22.n(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    x1 x1Var22 = n.f135158a;
                    r rVar20 = this.f180244b;
                    rVar20.t(R.string.gcm_training_status_acute_training_load, mVar22, 0);
                    rVar20.o(R.string.gcm_training_status_calculate_training_load_desc, 0, 2, null, mVar22);
                } else {
                    mVar22.e();
                }
                break;
            case 22:
                m mVar23 = (m) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                w61.a aVar14 = w61.a.f183133a;
                if (mVar23.n(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    x1 x1Var23 = n.f135158a;
                    r rVar21 = this.f180244b;
                    rVar21.t(R.string.load_ratio_title, mVar23, 0);
                    rVar21.o(R.string.lbl_training_load_ratio_description, 0, 2, null, mVar23);
                } else {
                    mVar23.e();
                }
                break;
            case 23:
                m mVar24 = (m) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                w61.a aVar15 = w61.a.f183133a;
                if (mVar24.n(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    x1 x1Var24 = n.f135158a;
                    r rVar22 = this.f180244b;
                    rVar22.t(R.string.gcm_training_status_training_load_header_2, mVar24, 0);
                    rVar22.o(R.string.gcm_training_status_training_load_description_2, 0, 2, null, mVar24);
                } else {
                    mVar24.e();
                }
                break;
            case 24:
                m mVar25 = (m) obj;
                int iIntValue25 = ((Integer) obj2).intValue();
                w61.a aVar16 = w61.a.f183133a;
                if (mVar25.n(iIntValue25 & 1, (iIntValue25 & 3) != 2)) {
                    x1 x1Var25 = n.f135158a;
                    r rVar23 = this.f180244b;
                    rVar23.t(R.string.gcm_training_status_altitude_acclimation_header_3, mVar25, 0);
                    rVar23.o(R.string.gcm_training_status_altitude_acclimation_description_3, 0, 2, null, mVar25);
                } else {
                    mVar25.e();
                }
                break;
            case 25:
                m mVar26 = (m) obj;
                int iIntValue26 = ((Integer) obj2).intValue();
                w61.a aVar17 = w61.a.f183133a;
                if (mVar26.n(iIntValue26 & 1, (iIntValue26 & 3) != 2)) {
                    x1 x1Var26 = n.f135158a;
                    r rVar24 = this.f180244b;
                    rVar24.t(R.string.gcm_training_status_acute_training_load, mVar26, 0);
                    rVar24.o(R.string.gcm_training_status_calculate_training_load_desc, 0, 2, null, mVar26);
                } else {
                    mVar26.e();
                }
                break;
            case 26:
                m mVar27 = (m) obj;
                int iIntValue27 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar18 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                if (mVar27.n(iIntValue27 & 1, (iIntValue27 & 3) != 2)) {
                    x1 x1Var27 = n.f135158a;
                    r rVar25 = this.f180244b;
                    rVar25.D(R.string.lbl_training_status, mVar27, 0);
                    rVar25.l(R.string.gcm_training_status_main_help_page_description, 0, 2, null, mVar27);
                } else {
                    mVar27.e();
                }
                break;
            case 27:
                m mVar28 = (m) obj;
                int iIntValue28 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar19 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                if (mVar28.n(iIntValue28 & 1, (iIntValue28 & 3) != 2)) {
                    x1 x1Var28 = n.f135158a;
                    String strQ6 = y.Q(mVar28, R.string.ohrv_help_title_receiving_status);
                    r rVar26 = this.f180244b;
                    rVar26.s(0, 2, strQ6, null, mVar28);
                    rVar26.q(y.Q(mVar28, R.string.gcm_training_status_receiving_hrv_status_desc), mVar28, 0);
                } else {
                    mVar28.e();
                }
                break;
            case 28:
                m mVar29 = (m) obj;
                int iIntValue29 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.performance.stats.improvement.c.a aVar20 = com.garmin.android.apps.connectmobile.performance.stats.improvement.c.f40122j;
                if (mVar29.n(iIntValue29 & 1, (iIntValue29 & 3) != 2)) {
                    x1 x1Var29 = n.f135158a;
                    String strQ7 = y.Q(mVar29, R.string.gcm_training_status_hrv_training_status);
                    r rVar27 = this.f180244b;
                    rVar27.s(0, 2, strQ7, null, mVar29);
                    rVar27.q(y.Q(mVar29, R.string.gcm_training_status_hrv_training_status_desc), mVar29, 0);
                } else {
                    mVar29.e();
                }
                break;
            default:
                m mVar30 = (m) obj;
                int iIntValue30 = ((Integer) obj2).intValue();
                wd0.b bVar = wd0.b.f184359a;
                if (mVar30.n(iIntValue30 & 1, (iIntValue30 & 3) != 2)) {
                    x1 x1Var30 = n.f135158a;
                    x0.f23314a.getClass();
                    String strW = gl1.d.W(x0.Y7);
                    r rVar28 = this.f180244b;
                    rVar28.E(strW, mVar30, 0);
                    rVar28.s(0, 2, gl1.d.W(x0.f23541n8), null, mVar30);
                    rVar28.q(gl1.d.W(x0.f23557o8), mVar30, 0);
                } else {
                    mVar30.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
