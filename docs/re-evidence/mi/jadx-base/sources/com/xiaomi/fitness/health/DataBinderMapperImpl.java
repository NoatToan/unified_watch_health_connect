package com.xiaomi.fitness.health;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetViewModel;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import defpackage.a2c;
import defpackage.a4c;
import defpackage.a6a;
import defpackage.a9e;
import defpackage.ace;
import defpackage.aka;
import defpackage.ala;
import defpackage.ana;
import defpackage.aob;
import defpackage.aqp;
import defpackage.b0c;
import defpackage.b3a;
import defpackage.b4a;
import defpackage.b7e;
import defpackage.b8a;
import defpackage.b8e;
import defpackage.bae;
import defpackage.bba;
import defpackage.bca;
import defpackage.bda;
import defpackage.bia;
import defpackage.bja;
import defpackage.bma;
import defpackage.bob;
import defpackage.bod;
import defpackage.btb;
import defpackage.bub;
import defpackage.bvb;
import defpackage.bwb;
import defpackage.bxb;
import defpackage.byb;
import defpackage.bzb;
import defpackage.c4c;
import defpackage.caa;
import defpackage.cce;
import defpackage.cka;
import defpackage.cla;
import defpackage.cna;
import defpackage.co0;
import defpackage.com;
import defpackage.d3a;
import defpackage.d4a;
import defpackage.d7a;
import defpackage.d8a;
import defpackage.d8e;
import defpackage.dba;
import defpackage.dca;
import defpackage.dda;
import defpackage.dh0;
import defpackage.dia;
import defpackage.dja;
import defpackage.dma;
import defpackage.dob;
import defpackage.dod;
import defpackage.dtb;
import defpackage.dub;
import defpackage.dvb;
import defpackage.dwb;
import defpackage.dyb;
import defpackage.dzb;
import defpackage.eaa;
import defpackage.ece;
import defpackage.eh0;
import defpackage.ena;
import defpackage.eo0;
import defpackage.evb;
import defpackage.f2c;
import defpackage.f3a;
import defpackage.f4a;
import defpackage.f7a;
import defpackage.f8a;
import defpackage.fba;
import defpackage.fda;
import defpackage.fia;
import defpackage.fja;
import defpackage.fma;
import defpackage.fod;
import defpackage.ftb;
import defpackage.fub;
import defpackage.fwb;
import defpackage.fyb;
import defpackage.fzb;
import defpackage.gaa;
import defpackage.gce;
import defpackage.gna;
import defpackage.go0;
import defpackage.gvb;
import defpackage.h3a;
import defpackage.h4a;
import defpackage.h7a;
import defpackage.h7e;
import defpackage.h8a;
import defpackage.hba;
import defpackage.hca;
import defpackage.hda;
import defpackage.hia;
import defpackage.hja;
import defpackage.hla;
import defpackage.hma;
import defpackage.ho0;
import defpackage.hob;
import defpackage.hod;
import defpackage.hsb;
import defpackage.htb;
import defpackage.hub;
import defpackage.hvb;
import defpackage.hwb;
import defpackage.hyb;
import defpackage.hzb;
import defpackage.i1f;
import defpackage.ice;
import defpackage.ide;
import defpackage.ika;
import defpackage.j3a;
import defpackage.j4a;
import defpackage.j5a;
import defpackage.j7a;
import defpackage.j8a;
import defpackage.jca;
import defpackage.jda;
import defpackage.jia;
import defpackage.jja;
import defpackage.jla;
import defpackage.jma;
import defpackage.jnd;
import defpackage.jo0;
import defpackage.jom;
import defpackage.jpm;
import defpackage.jsb;
import defpackage.jtb;
import defpackage.jub;
import defpackage.jui;
import defpackage.jvb;
import defpackage.jwb;
import defpackage.jyb;
import defpackage.jzb;
import defpackage.k1c;
import defpackage.k2c;
import defpackage.k84;
import defpackage.kaa;
import defpackage.kbe;
import defpackage.kce;
import defpackage.kde;
import defpackage.kka;
import defpackage.kna;
import defpackage.ko0;
import defpackage.l0c;
import defpackage.l3a;
import defpackage.l4a;
import defpackage.l7a;
import defpackage.l7e;
import defpackage.l8a;
import defpackage.lca;
import defpackage.lha;
import defpackage.lia;
import defpackage.lja;
import defpackage.lla;
import defpackage.lnd;
import defpackage.lom;
import defpackage.lsb;
import defpackage.ltb;
import defpackage.lub;
import defpackage.lvb;
import defpackage.lwb;
import defpackage.lyb;
import defpackage.lzb;
import defpackage.m1c;
import defpackage.maa;
import defpackage.mbe;
import defpackage.mce;
import defpackage.mde;
import defpackage.mha;
import defpackage.mka;
import defpackage.mna;
import defpackage.mo0;
import defpackage.n0c;
import defpackage.n3a;
import defpackage.n4a;
import defpackage.n7a;
import defpackage.n7e;
import defpackage.n8a;
import defpackage.n8e;
import defpackage.nba;
import defpackage.nca;
import defpackage.nia;
import defpackage.nja;
import defpackage.nla;
import defpackage.npb;
import defpackage.nsb;
import defpackage.ntb;
import defpackage.nub;
import defpackage.nvb;
import defpackage.nxb;
import defpackage.nyb;
import defpackage.nzb;
import defpackage.o1c;
import defpackage.o8e;
import defpackage.obe;
import defpackage.oce;
import defpackage.oha;
import defpackage.oi0;
import defpackage.oka;
import defpackage.ona;
import defpackage.otb;
import defpackage.owb;
import defpackage.p3a;
import defpackage.p4a;
import defpackage.p7a;
import defpackage.p7e;
import defpackage.p8a;
import defpackage.pba;
import defpackage.pca;
import defpackage.pha;
import defpackage.pia;
import defpackage.pja;
import defpackage.pla;
import defpackage.psb;
import defpackage.ptb;
import defpackage.pub;
import defpackage.pvb;
import defpackage.pxb;
import defpackage.pyb;
import defpackage.pzb;
import defpackage.q1c;
import defpackage.q8e;
import defpackage.qbe;
import defpackage.qce;
import defpackage.qk5;
import defpackage.qka;
import defpackage.qm0;
import defpackage.qna;
import defpackage.qnb;
import defpackage.r3a;
import defpackage.r4a;
import defpackage.r7a;
import defpackage.r7e;
import defpackage.r8a;
import defpackage.raa;
import defpackage.rba;
import defpackage.rca;
import defpackage.rha;
import defpackage.ria;
import defpackage.rja;
import defpackage.rk5;
import defpackage.rla;
import defpackage.rsb;
import defpackage.rtb;
import defpackage.rub;
import defpackage.rvb;
import defpackage.rwb;
import defpackage.rxb;
import defpackage.ryb;
import defpackage.rzb;
import defpackage.s1c;
import defpackage.sbe;
import defpackage.sce;
import defpackage.ska;
import defpackage.sna;
import defpackage.snb;
import defpackage.t3a;
import defpackage.t4a;
import defpackage.t7a;
import defpackage.t7e;
import defpackage.t8a;
import defpackage.taa;
import defpackage.tba;
import defpackage.tca;
import defpackage.tde;
import defpackage.tia;
import defpackage.tja;
import defpackage.tla;
import defpackage.tob;
import defpackage.tsb;
import defpackage.tub;
import defpackage.tvb;
import defpackage.txb;
import defpackage.tyb;
import defpackage.tzb;
import defpackage.u0c;
import defpackage.u1c;
import defpackage.u1f;
import defpackage.u5a;
import defpackage.ube;
import defpackage.uce;
import defpackage.uja;
import defpackage.uka;
import defpackage.una;
import defpackage.unb;
import defpackage.v3a;
import defpackage.v4a;
import defpackage.v7a;
import defpackage.v7e;
import defpackage.v8a;
import defpackage.vaa;
import defpackage.vba;
import defpackage.vca;
import defpackage.via;
import defpackage.vla;
import defpackage.vod;
import defpackage.vsb;
import defpackage.vub;
import defpackage.vvb;
import defpackage.vxb;
import defpackage.vyb;
import defpackage.vzb;
import defpackage.w1c;
import defpackage.w5a;
import defpackage.wbe;
import defpackage.wja;
import defpackage.wka;
import defpackage.wma;
import defpackage.wna;
import defpackage.wnb;
import defpackage.x0c;
import defpackage.x3a;
import defpackage.x7a;
import defpackage.x7e;
import defpackage.xaa;
import defpackage.xae;
import defpackage.xba;
import defpackage.xca;
import defpackage.xh0;
import defpackage.xia;
import defpackage.xla;
import defpackage.xnb;
import defpackage.xsb;
import defpackage.xub;
import defpackage.xvb;
import defpackage.xxb;
import defpackage.xyb;
import defpackage.xzb;
import defpackage.y1c;
import defpackage.y5a;
import defpackage.y6e;
import defpackage.ybe;
import defpackage.yde;
import defpackage.yja;
import defpackage.yma;
import defpackage.ynb;
import defpackage.yr3;
import defpackage.z3a;
import defpackage.z4a;
import defpackage.z6e;
import defpackage.z7a;
import defpackage.z7e;
import defpackage.zba;
import defpackage.zca;
import defpackage.zha;
import defpackage.zia;
import defpackage.zla;
import defpackage.zsb;
import defpackage.zub;
import defpackage.zvb;
import defpackage.zxb;
import defpackage.zyb;
import defpackage.zzb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class DataBinderMapperImpl extends qk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f12220a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f12221a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(3);
            f12221a = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "viewModel");
            sparseArray.put(2, "vm");
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f12222a;

        static {
            HashMap<String, Integer> map = new HashMap<>(353);
            f12222a = map;
            map.put("layout-sw480dp/activity_blood_glucose_landscape_0", Integer.valueOf(jui.f23146a));
            map.put("layout/activity_blood_glucose_landscape_0", Integer.valueOf(jui.f23146a));
            map.put("layout/activity_common_0", Integer.valueOf(jui.f23147b));
            map.put("layout/activity_ecg_landscape_0", Integer.valueOf(jui.c));
            map.put("layout/activity_health_ecg_item_detail_0", Integer.valueOf(jui.d));
            map.put("layout/activity_sleep_animal_detecting_0", Integer.valueOf(jui.e));
            map.put("layout/activity_sleep_animal_report_0", Integer.valueOf(jui.f));
            map.put("layout/activity_sleep_animal_share_0", Integer.valueOf(jui.g));
            map.put("layout-sw600dp-land/activity_sleep_animal_share_0", Integer.valueOf(jui.g));
            map.put("layout-small/activity_sleep_go_to_bed_time_calibrate_0", Integer.valueOf(jui.h));
            map.put("layout/activity_sleep_go_to_bed_time_calibrate_0", Integer.valueOf(jui.h));
            map.put("layout/activity_sleep_rhythm_monitor_guide_0", Integer.valueOf(jui.i));
            map.put("layout/card_weight_segmental_fat_0", Integer.valueOf(jui.l));
            map.put("layout/common_switch_header_0", Integer.valueOf(jui.common_switch_header));
            map.put("layout/fragment_blood_glucose_add_0", Integer.valueOf(jui.s));
            map.put("layout/fragment_blood_glucose_all_day_item_0", Integer.valueOf(jui.t));
            map.put("layout/fragment_blood_glucose_finger_day_item_0", Integer.valueOf(jui.u));
            map.put("layout/fragment_blood_glucose_finger_month_item_0", Integer.valueOf(jui.v));
            map.put("layout/fragment_blood_glucose_finger_week_item_0", Integer.valueOf(jui.w));
            map.put("layout/fragment_blood_glucose_month_item_0", Integer.valueOf(jui.x));
            map.put("layout/fragment_blood_glucose_week_item_0", Integer.valueOf(jui.y));
            map.put("layout/fragment_blood_pressure_add_0", Integer.valueOf(jui.z));
            map.put("layout/fragment_blood_pressure_day_item_0", Integer.valueOf(jui.A));
            map.put("layout/fragment_blood_pressure_day_r_item_0", Integer.valueOf(jui.B));
            map.put("layout/fragment_blood_pressure_month_item_0", Integer.valueOf(jui.C));
            map.put("layout/fragment_blood_pressure_week_item_0", Integer.valueOf(jui.E));
            map.put("layout/fragment_blood_pressure_week_r_item_0", Integer.valueOf(jui.F));
            map.put("layout/fragment_calendar_base_0", Integer.valueOf(jui.G));
            map.put("layout/fragment_calendar_day_0", Integer.valueOf(jui.H));
            map.put("layout/fragment_calendar_month_0", Integer.valueOf(jui.I));
            map.put("layout/fragment_calorie_day_0", Integer.valueOf(jui.J));
            map.put("layout/fragment_calorie_day_item_0", Integer.valueOf(jui.K));
            map.put("layout/fragment_calorie_day_r_item_0", Integer.valueOf(jui.L));
            map.put("layout/fragment_calorie_month_0", Integer.valueOf(jui.M));
            map.put("layout/fragment_calorie_month_item_0", Integer.valueOf(jui.N));
            map.put("layout/fragment_calorie_week_0", Integer.valueOf(jui.O));
            map.put("layout/fragment_calorie_week_item_0", Integer.valueOf(jui.P));
            map.put("layout/fragment_calorie_week_r_item_0", Integer.valueOf(jui.Q));
            map.put("layout/fragment_common_day_week_month_0", Integer.valueOf(jui.R));
            map.put("layout/fragment_data_v2_0", Integer.valueOf(jui.S));
            map.put("layout/fragment_energy_day_item_0", Integer.valueOf(jui.T));
            map.put("layout/fragment_energy_month_item_0", Integer.valueOf(jui.U));
            map.put("layout/fragment_energy_week_item_0", Integer.valueOf(jui.V));
            map.put("layout/fragment_expandable_record_detail_0", Integer.valueOf(jui.W));
            map.put("layout/fragment_health_check_0", Integer.valueOf(jui.X));
            map.put("layout/fragment_hearing_day_0", Integer.valueOf(jui.a0));
            map.put("layout/fragment_hearing_day_item_0", Integer.valueOf(jui.b0));
            map.put("layout/fragment_hearing_month_0", Integer.valueOf(jui.c0));
            map.put("layout/fragment_hearing_month_item_0", Integer.valueOf(jui.d0));
            map.put("layout/fragment_hearing_week_0", Integer.valueOf(jui.e0));
            map.put("layout/fragment_hearing_week_item_0", Integer.valueOf(jui.f0));
            map.put("layout/fragment_hrm_abnormal_chart_0", Integer.valueOf(jui.g0));
            map.put("layout/fragment_hrm_abnormal_high_list_0", Integer.valueOf(jui.h0));
            map.put("layout/fragment_hrm_abnormal_low_list_0", Integer.valueOf(jui.i0));
            map.put("layout/fragment_hrm_add_0", Integer.valueOf(jui.j0));
            map.put("layout/fragment_hrm_day_0", Integer.valueOf(jui.k0));
            map.put("layout/fragment_hrm_day_item_0", Integer.valueOf(jui.l0));
            map.put("layout/fragment_hrm_day_r_item_0", Integer.valueOf(jui.m0));
            map.put("layout/fragment_hrm_ecg_0", Integer.valueOf(jui.n0));
            map.put("layout/fragment_hrm_ecg_bar_0", Integer.valueOf(jui.o0));
            map.put("layout/fragment_hrm_fib_detail_0", Integer.valueOf(jui.p0));
            map.put("layout/fragment_hrm_manually_measured_records_list_0", Integer.valueOf(jui.q0));
            map.put("layout/fragment_hrm_month_0", Integer.valueOf(jui.r0));
            map.put("layout/fragment_hrm_month_item_0", Integer.valueOf(jui.s0));
            map.put("layout/fragment_hrm_week_0", Integer.valueOf(jui.t0));
            map.put("layout/fragment_hrm_week_item_0", Integer.valueOf(jui.u0));
            map.put("layout/fragment_hrm_week_r_item_0", Integer.valueOf(jui.v0));
            map.put("layout/fragment_mh_intensity_day_0", Integer.valueOf(jui.w0));
            map.put("layout/fragment_mh_intensity_month_0", Integer.valueOf(jui.x0));
            map.put("layout/fragment_mh_intensity_week_0", Integer.valueOf(jui.y0));
            map.put("layout/fragment_pai_day_0", Integer.valueOf(jui.z0));
            map.put("layout/fragment_pai_day_rate_0", Integer.valueOf(jui.A0));
            map.put("layout/fragment_physcial_status_day_0", Integer.valueOf(jui.B0));
            map.put("layout/fragment_record_detail_0", Integer.valueOf(jui.C0));
            map.put("layout/fragment_record_detail_blood_pressure_0", Integer.valueOf(jui.D0));
            map.put("layout/fragment_relative_care_0", Integer.valueOf(jui.E0));
            map.put("layout/fragment_running_indicator_detail_0", Integer.valueOf(jui.F0));
            map.put("layout/fragment_sao2_day_0", Integer.valueOf(jui.G0));
            map.put("layout/fragment_sao2_month_0", Integer.valueOf(jui.H0));
            map.put("layout/fragment_sao2_week_0", Integer.valueOf(jui.I0));
            map.put("layout/fragment_sleep_breath_rate_detail_0", Integer.valueOf(jui.J0));
            map.put("layout/fragment_sleep_day_item_0", Integer.valueOf(jui.K0));
            map.put("layout/fragment_sleep_day_r_item_0", Integer.valueOf(jui.L0));
            map.put("layout/fragment_sleep_diary_update_0", Integer.valueOf(jui.M0));
            map.put("layout/fragment_sleep_hrm_detail_0", Integer.valueOf(jui.N0));
            map.put("layout/fragment_sleep_interfere_detail_0", Integer.valueOf(jui.O0));
            map.put("layout/fragment_sleep_interfere_history_0", Integer.valueOf(jui.P0));
            map.put("layout/fragment_sleep_interfere_report_0", Integer.valueOf(jui.Q0));
            map.put("layout/fragment_sleep_interfere_set_0", Integer.valueOf(jui.R0));
            map.put("layout/fragment_sleep_month_0", Integer.valueOf(jui.S0));
            map.put("layout/fragment_sleep_quality_detail_0", Integer.valueOf(jui.T0));
            map.put("layout/fragment_sleep_record_add_0", Integer.valueOf(jui.U0));
            map.put("layout/fragment_sleep_rhythm_records_0", Integer.valueOf(jui.V0));
            map.put("layout/fragment_sleep_spo2_detail_0", Integer.valueOf(jui.W0));
            map.put("layout/fragment_sleep_week_0", Integer.valueOf(jui.X0));
            map.put("layout/fragment_sleep_week_month_item_0", Integer.valueOf(jui.Y0));
            map.put("layout/fragment_sleep_week_r_item_0", Integer.valueOf(jui.Z0));
            map.put("layout/fragment_spo2_abnormal_chart_0", Integer.valueOf(jui.a1));
            map.put("layout/fragment_spo2_day_item_0", Integer.valueOf(jui.b1));
            map.put("layout/fragment_spo2_day_r_item_0", Integer.valueOf(jui.c1));
            map.put("layout/fragment_spo2_month_item_0", Integer.valueOf(jui.d1));
            map.put("layout/fragment_spo2_week_item_0", Integer.valueOf(jui.e1));
            map.put("layout/fragment_spo2_week_r_item_0", Integer.valueOf(jui.f1));
            map.put("layout/fragment_sport_basic_0", Integer.valueOf(jui.g1));
            map.put("layout-sw600dp-land/fragment_sport_target_chart_0", Integer.valueOf(jui.h1));
            map.put("layout/fragment_sport_target_chart_0", Integer.valueOf(jui.h1));
            map.put("layout/fragment_sport_target_r_chart_0", Integer.valueOf(jui.i1));
            map.put("layout-sw600dp-port/fragment_sport_target_r_chart_0", Integer.valueOf(jui.i1));
            map.put("layout/fragment_sport_target_week_bar_0", Integer.valueOf(jui.j1));
            map.put("layout/fragment_stand_day_0", Integer.valueOf(jui.k1));
            map.put("layout/fragment_stand_day_item_0", Integer.valueOf(jui.l1));
            map.put("layout/fragment_stand_month_0", Integer.valueOf(jui.m1));
            map.put("layout/fragment_stand_month_item_0", Integer.valueOf(jui.n1));
            map.put("layout/fragment_stand_month_r_item_0", Integer.valueOf(jui.o1));
            map.put("layout/fragment_stand_week_0", Integer.valueOf(jui.p1));
            map.put("layout/fragment_stand_week_item_0", Integer.valueOf(jui.q1));
            map.put("layout/fragment_stand_week_r_item_0", Integer.valueOf(jui.r1));
            map.put("layout/fragment_step_day_0", Integer.valueOf(jui.s1));
            map.put("layout/fragment_step_day_item_0", Integer.valueOf(jui.t1));
            map.put("layout/fragment_step_day_r_item_0", Integer.valueOf(jui.u1));
            map.put("layout/fragment_step_hrm_detail_0", Integer.valueOf(jui.v1));
            map.put("layout/fragment_step_month_0", Integer.valueOf(jui.w1));
            map.put("layout/fragment_step_month_item_0", Integer.valueOf(jui.x1));
            map.put("layout/fragment_step_week_0", Integer.valueOf(jui.y1));
            map.put("layout/fragment_step_week_item_0", Integer.valueOf(jui.z1));
            map.put("layout/fragment_step_week_r_item_0", Integer.valueOf(jui.A1));
            map.put("layout/fragment_strength_day_item_0", Integer.valueOf(jui.B1));
            map.put("layout/fragment_strength_day_r_item_0", Integer.valueOf(jui.C1));
            map.put("layout/fragment_strength_month_item_0", Integer.valueOf(jui.D1));
            map.put("layout/fragment_strength_week_item_0", Integer.valueOf(jui.E1));
            map.put("layout/fragment_strength_week_r_item_0", Integer.valueOf(jui.F1));
            map.put("layout/fragment_stress_day_0", Integer.valueOf(jui.G1));
            map.put("layout/fragment_stress_day_item_0", Integer.valueOf(jui.H1));
            map.put("layout-sw600dp-land/fragment_stress_day_item_0", Integer.valueOf(jui.H1));
            map.put("layout/fragment_stress_month_0", Integer.valueOf(jui.I1));
            map.put("layout/fragment_stress_month_item_0", Integer.valueOf(jui.J1));
            map.put("layout/fragment_stress_week_0", Integer.valueOf(jui.K1));
            map.put("layout/fragment_stress_week_item_0", Integer.valueOf(jui.L1));
            map.put("layout/fragment_target_basic_0", Integer.valueOf(jui.M1));
            map.put("layout/fragment_target_calorie_r_0", Integer.valueOf(jui.N1));
            map.put("layout/fragment_target_mh_intensity_r_0", Integer.valueOf(jui.O1));
            map.put("layout/fragment_target_stand_r_0", Integer.valueOf(jui.P1));
            map.put("layout/fragment_target_step_r_0", Integer.valueOf(jui.Q1));
            map.put("layout/fragment_temperature_add_0", Integer.valueOf(jui.R1));
            map.put("layout/fragment_temperature_day_item_0", Integer.valueOf(jui.S1));
            map.put("layout/fragment_temperature_month_item_0", Integer.valueOf(jui.T1));
            map.put("layout/fragment_temperature_week_item_0", Integer.valueOf(jui.U1));
            map.put("layout/fragment_training_load_detail_0", Integer.valueOf(jui.V1));
            map.put("layout/fragment_understand_bloodpressure_0", Integer.valueOf(jui.W1));
            map.put("layout/fragment_understand_calorie_0", Integer.valueOf(jui.X1));
            map.put("layout/fragment_understand_energy_0", Integer.valueOf(jui.Y1));
            map.put("layout/fragment_understand_hearing_0", Integer.valueOf(jui.Z1));
            map.put("layout/fragment_understand_mh_intensity_0", Integer.valueOf(jui.a2));
            map.put("layout/fragment_understand_physical_status_0", Integer.valueOf(jui.b2));
            map.put("layout/fragment_understand_running_indicator_0", Integer.valueOf(jui.c2));
            map.put("layout/fragment_understand_sleep_aduio_no_data_0", Integer.valueOf(jui.e2));
            map.put("layout/fragment_understand_spo2_0", Integer.valueOf(jui.f2));
            map.put("layout/fragment_understand_stand_0", Integer.valueOf(jui.g2));
            map.put("layout/fragment_understand_stress_0", Integer.valueOf(jui.h2));
            map.put("layout/fragment_understand_temperature_0", Integer.valueOf(jui.i2));
            map.put("layout/fragment_understand_training_load_0", Integer.valueOf(jui.j2));
            map.put("layout/fragment_understand_v02max_0", Integer.valueOf(jui.k2));
            map.put("layout/fragment_understand_vitality_0", Integer.valueOf(jui.l2));
            map.put("layout/fragment_vitality_day_0", Integer.valueOf(jui.m2));
            map.put("layout/fragment_vo2max_day_0", Integer.valueOf(jui.o2));
            map.put("layout/fragment_vo2max_month_0", Integer.valueOf(jui.p2));
            map.put("layout/fragment_vo2max_month_item_0", Integer.valueOf(jui.q2));
            map.put("layout/fragment_vo2max_week_0", Integer.valueOf(jui.r2));
            map.put("layout/fragment_vo2max_week_item_0", Integer.valueOf(jui.s2));
            map.put("layout/fragment_weight_add_0", Integer.valueOf(jui.t2));
            map.put("layout/fragment_weight_body_indicator_0", Integer.valueOf(jui.u2));
            map.put("layout/fragment_weight_day_0", Integer.valueOf(jui.v2));
            map.put("layout/fragment_weight_day_item_0", Integer.valueOf(jui.w2));
            map.put("layout/fragment_weight_day_r_item_0", Integer.valueOf(jui.x2));
            map.put("layout/fragment_weight_index_item_0", Integer.valueOf(jui.y2));
            map.put("layout/fragment_weight_statistic_0", Integer.valueOf(jui.z2));
            map.put("layout/health_activity_curse_0", Integer.valueOf(jui.A2));
            map.put("layout/health_activity_curse_history_0", Integer.valueOf(jui.B2));
            map.put("layout/health_activity_recognize_setting_0", Integer.valueOf(jui.C2));
            map.put("layout-large/health_activity_share_calo_consum_0", Integer.valueOf(jui.D2));
            map.put("layout-small/health_activity_share_calo_consum_0", Integer.valueOf(jui.D2));
            map.put("layout/health_activity_share_calo_consum_0", Integer.valueOf(jui.D2));
            map.put("layout/health_activity_share_sport_target_0", Integer.valueOf(jui.E2));
            map.put("layout-sw600dp-land/health_activity_share_sport_target_0", Integer.valueOf(jui.E2));
            map.put("layout/health_activity_sleep_rhythm_calendar_0", Integer.valueOf(jui.F2));
            map.put("layout/health_banner_card_set_0", Integer.valueOf(jui.I2));
            map.put("layout/health_check_layout_expandable_data_0", Integer.valueOf(jui.N2));
            map.put("layout/health_common_custom_title_layout_0", Integer.valueOf(jui.R2));
            map.put("layout/health_curse_activity_reset_0", Integer.valueOf(jui.S2));
            map.put("layout/health_curse_activity_set_0", Integer.valueOf(jui.T2));
            map.put("layout/health_curse_data_holder_0", Integer.valueOf(jui.U2));
            map.put("layout/health_curse_edit_0", Integer.valueOf(jui.V2));
            map.put("layout/health_curse_info_0", Integer.valueOf(jui.W2));
            map.put("layout/health_curse_known_0", Integer.valueOf(jui.X2));
            map.put("layout/health_curse_layout_record_0", Integer.valueOf(jui.Y2));
            map.put("layout/health_curse_layout_sign_0", Integer.valueOf(jui.a3));
            map.put("layout/health_curse_layout_symptom_view_0", Integer.valueOf(jui.b3));
            map.put("layout/health_curse_list_0", Integer.valueOf(jui.c3));
            map.put("layout/health_curse_month_0", Integer.valueOf(jui.d3));
            map.put("layout/health_curse_notice_card_view_0", Integer.valueOf(jui.e3));
            map.put("layout/health_curse_record_item_0", Integer.valueOf(jui.f3));
            map.put("layout/health_curse_reset_card_view_0", Integer.valueOf(jui.g3));
            map.put("layout/health_curse_set_view_0", Integer.valueOf(jui.h3));
            map.put("layout/health_curse_setting_0", Integer.valueOf(jui.i3));
            map.put("layout-sw600dp-port/health_curse_symptom_holder_0", Integer.valueOf(jui.m3));
            map.put("layout/health_curse_symptom_holder_0", Integer.valueOf(jui.m3));
            map.put("layout-sw600dp-land/health_curse_symptom_holder_0", Integer.valueOf(jui.m3));
            map.put("layout/health_curse_temp_view_holder_0", Integer.valueOf(jui.n3));
            map.put("layout/health_fragment_all_record_page_0", Integer.valueOf(jui.r3));
            map.put("layout/health_fragment_blood_glucose_filtered_records_0", Integer.valueOf(jui.s3));
            map.put("layout/health_fragment_curse_bar_chart_0", Integer.valueOf(jui.t3));
            map.put("layout/health_fragment_curse_notify_0", Integer.valueOf(jui.u3));
            map.put("layout/health_fragment_deep_shallow_sleep_detection_setting_0", Integer.valueOf(jui.v3));
            map.put("layout/health_fragment_ecg_account_auth_login_0", Integer.valueOf(jui.w3));
            map.put("layout/health_fragment_ecg_analyze_service_auth_0", Integer.valueOf(jui.x3));
            map.put("layout/health_fragment_ecg_checking_quailty_0", Integer.valueOf(jui.y3));
            map.put("layout/health_fragment_ecg_filtered_records_0", Integer.valueOf(jui.z3));
            map.put("layout/health_fragment_ecg_layout_0", Integer.valueOf(jui.A3));
            map.put("layout/health_fragment_ecg_submit_analyze_result_0", Integer.valueOf(jui.B3));
            map.put("layout/health_fragment_hrm_filtered_records_0", Integer.valueOf(jui.C3));
            map.put("layout/health_fragment_resting_hrm_0", Integer.valueOf(jui.D3));
            map.put("layout/health_fragment_select_ecg_to_analyze_layout_0", Integer.valueOf(jui.E3));
            map.put("layout/health_fragment_share_sport_target_0", Integer.valueOf(jui.F3));
            map.put("layout-sw600dp-land/health_fragment_share_sport_target_0", Integer.valueOf(jui.F3));
            map.put("layout-sw600dp-land/health_fragment_share_sport_target_month_0", Integer.valueOf(jui.G3));
            map.put("layout/health_fragment_share_sport_target_month_0", Integer.valueOf(jui.G3));
            map.put("layout/health_fragment_sleep_diary_medication_update_0", Integer.valueOf(jui.H3));
            map.put("layout/health_fragment_sleep_disorder_diary_note_0", Integer.valueOf(jui.I3));
            map.put("layout/health_fragment_sleep_permission_setting_0", Integer.valueOf(jui.J3));
            map.put("layout/health_fragment_sleep_phythm_all_fragment_0", Integer.valueOf(jui.K3));
            map.put("layout/health_fragment_sleep_phythm_all_sleep_chat_fragment_0", Integer.valueOf(jui.L3));
            map.put("layout/health_fragment_sleep_phythm_chat_list_view_0", Integer.valueOf(jui.M3));
            map.put("layout/health_fragment_sleep_phythm_detail_0", Integer.valueOf(jui.N3));
            map.put("layout/health_fragment_sleep_phythm_detail_up_to_remote_0", Integer.valueOf(jui.O3));
            map.put("layout/health_fragment_sleep_phythm_detail_up_to_remote_suc_0", Integer.valueOf(jui.Q3));
            map.put("layout/health_fragment_sleep_rhythm_support_devices_list_0", Integer.valueOf(jui.R3));
            map.put("layout/health_fragment_sleep_rhythm_support_devices_list_item_0", Integer.valueOf(jui.S3));
            map.put("layout/health_fragment_sleep_setting_0", Integer.valueOf(jui.T3));
            map.put("layout/health_fragment_sleep_snore_detection_setting_0", Integer.valueOf(jui.U3));
            map.put("layout/health_fragment_spo2_filtered_records_0", Integer.valueOf(jui.V3));
            map.put("layout/health_fragment_temp_trend_support_devices_list_0", Integer.valueOf(jui.W3));
            map.put("layout/health_hearing_environmental_noise_0", Integer.valueOf(jui.Z3));
            map.put("layout/health_home_card_common_title_0", Integer.valueOf(jui.a4));
            map.put("layout/health_item_sleep_short_segment_0", Integer.valueOf(jui.c4));
            map.put("layout/health_layout_card_data_item_0", Integer.valueOf(jui.f4));
            map.put("layout/health_layout_card_indicator_style_0", Integer.valueOf(jui.g4));
            map.put("layout/health_layout_common_card_icon_title_0", Integer.valueOf(jui.h4));
            map.put("layout/health_layout_data_item_footer_v2_0", Integer.valueOf(jui.k4));
            map.put("layout/health_layout_ecg_analyze_entrance_0", Integer.valueOf(jui.m4));
            map.put("layout/health_layout_ecg_snippet_0", Integer.valueOf(jui.n4));
            map.put("layout/health_layout_expandable_common_data_0", Integer.valueOf(jui.o4));
            map.put("layout/health_layout_expandable_common_header_0", Integer.valueOf(jui.p4));
            map.put("layout/health_layout_show_all_fragment_0", Integer.valueOf(jui.t4));
            map.put("layout/health_layout_sleep_animal_collect_progress_0", Integer.valueOf(jui.u4));
            map.put("layout/health_layout_sleep_animal_floating_0", Integer.valueOf(jui.v4));
            map.put("layout/health_layout_sleep_animal_image_0", Integer.valueOf(jui.w4));
            map.put("layout/health_layout_sleep_animal_report_list_0", Integer.valueOf(jui.x4));
            map.put("layout/health_layout_sleep_animal_schedule_suggest_0", Integer.valueOf(jui.y4));
            map.put("layout/health_layout_sleep_day_breath_quality_v2_0", Integer.valueOf(jui.z4));
            map.put("layout/health_layout_sleep_day_heart_rate_v2_0", Integer.valueOf(jui.A4));
            map.put("layout/health_layout_sleep_day_spo2_v2_0", Integer.valueOf(jui.B4));
            map.put("layout/health_layout_sleep_insight_continuity_report_0", Integer.valueOf(jui.C4));
            map.put("layout/health_layout_sleep_insight_day_nap_report_0", Integer.valueOf(jui.D4));
            map.put("layout/health_layout_sleep_insight_schedule_report_0", Integer.valueOf(jui.E4));
            map.put("layout/health_layout_sleep_insight_strength_report_0", Integer.valueOf(jui.F4));
            map.put("layout/health_layout_sleep_insight_stress_report_0", Integer.valueOf(jui.G4));
            map.put("layout/health_layout_sleep_rhythm_diary_record_list_item_0", Integer.valueOf(jui.H4));
            map.put("layout/health_layout_sleep_rhythm_diary_record_list_view_0", Integer.valueOf(jui.I4));
            map.put("layout/health_layout_sleep_rhythm_diary_record_view_0", Integer.valueOf(jui.J4));
            map.put("layout/health_layout_sleep_rhythm_record_item_0", Integer.valueOf(jui.K4));
            map.put("layout/health_layout_sleep_wm_regular_0", Integer.valueOf(jui.L4));
            map.put("layout/health_layout_weight_body_composition_0", Integer.valueOf(jui.M4));
            map.put("layout/health_layout_weight_body_score_0", Integer.valueOf(jui.O4));
            map.put("layout/health_layout_weight_control_suggest_0", Integer.valueOf(jui.P4));
            map.put("layout/health_layout_weight_day_detail_0", Integer.valueOf(jui.Q4));
            map.put("layout/health_layout_weight_focus_index_0", Integer.valueOf(jui.R4));
            map.put("layout/health_layout_weight_index_evaluation_0", Integer.valueOf(jui.S4));
            map.put("layout/health_layout_weight_segmental_0", Integer.valueOf(jui.T4));
            map.put("layout/health_n60_blood_pressure_about_0", Integer.valueOf(jui.W4));
            map.put("layout/health_n60_ecg_about_0", Integer.valueOf(jui.X4));
            map.put("layout/health_remind_select_count_spinner_0", Integer.valueOf(jui.Z4));
            map.put("layout/health_rhythm_chart_wait_data_view_0", Integer.valueOf(jui.b5));
            map.put("layout/health_sleep_analyze_item_layout_0", Integer.valueOf(jui.c5));
            map.put("layout/health_sleep_animal_collect_item_0", Integer.valueOf(jui.d5));
            map.put("layout/health_sleep_animal_schedule_item_0", Integer.valueOf(jui.e5));
            map.put("layout/health_sleep_item_data_source_0", Integer.valueOf(jui.n5));
            map.put("layout/health_sleep_rhythm_guide_item_0", Integer.valueOf(jui.t5));
            map.put("layout/health_sleep_rhythm_indicator_layout_0", Integer.valueOf(jui.u5));
            map.put("layout/health_sleep_rhythm_monitor_setting_fragment_0", Integer.valueOf(jui.w5));
            map.put("layout/health_sleep_rhythm_month_item_0", Integer.valueOf(jui.x5));
            map.put("layout/health_sleep_rhythm_remind_setting_fragment_0", Integer.valueOf(jui.y5));
            map.put("layout/health_temperature_trend_empty_holder_0", Integer.valueOf(jui.F5));
            map.put("layout/health_triplet_item_with_logo_0", Integer.valueOf(jui.U5));
            map.put("layout/health_weight_evaluation_detail_item_0", Integer.valueOf(jui.Y5));
            map.put("layout/health_weight_evaluation_item_0", Integer.valueOf(jui.Z5));
            map.put("layout/item_blood_pressure_distribution_0", Integer.valueOf(jui.c6));
            map.put("layout/item_data_records_0", Integer.valueOf(jui.d6));
            map.put("layout/item_sleep_interfere_day_0", Integer.valueOf(jui.l6));
            map.put("layout/item_sleep_interfere_day_task_0", Integer.valueOf(jui.m6));
            map.put("layout/item_sleep_interfere_history_0", Integer.valueOf(jui.n6));
            map.put("layout/item_sleep_interfere_summary_0", Integer.valueOf(jui.o6));
            map.put("layout/item_time_data_detail_0", Integer.valueOf(jui.t6));
            map.put("layout/layout_blood_pressure_data_title_view_0", Integer.valueOf(jui.u6));
            map.put("layout-large/layout_blood_pressure_data_title_view_0", Integer.valueOf(jui.u6));
            map.put("layout/layout_common_icon_title_0", Integer.valueOf(jui.v6));
            map.put("layout/layout_current_running_indicator_0", Integer.valueOf(jui.w6));
            map.put("layout/layout_data_item_0", Integer.valueOf(jui.H6));
            map.put("layout/layout_data_item_barchart_0", Integer.valueOf(jui.I6));
            map.put("layout/layout_data_item_barchart_for_pressure_0", Integer.valueOf(jui.J6));
            map.put("layout/layout_data_item_barchart_v2_0", Integer.valueOf(jui.K6));
            map.put("layout/layout_data_item_blood_glucose_0", Integer.valueOf(jui.L6));
            map.put("layout/layout_data_item_linechart_v2_0", Integer.valueOf(jui.M6));
            map.put("layout/layout_data_item_progress_bar_0", Integer.valueOf(jui.N6));
            map.put("layout/layout_data_item_relative_0", Integer.valueOf(jui.O6));
            map.put("layout/layout_data_login_info_0", Integer.valueOf(jui.P6));
            map.put("layout/layout_data_title_view_two_columns_0", Integer.valueOf(jui.W6));
            map.put("layout/layout_edit_sleep_record_0", Integer.valueOf(jui.Z6));
            map.put("layout-small/layout_edit_sleep_record_0", Integer.valueOf(jui.Z6));
            map.put("layout/layout_edit_temperature_0", Integer.valueOf(jui.a7));
            map.put("layout/layout_energy_dwm_common_0", Integer.valueOf(jui.b7));
            map.put("layout/layout_hrm_dwm_common_0", Integer.valueOf(jui.j7));
            map.put("layout/layout_running_indicator_widget_0", Integer.valueOf(jui.r7));
            map.put("layout/layout_sleep_day_animal_entrance_0", Integer.valueOf(jui.t7));
            map.put("layout/layout_sleep_duration_0", Integer.valueOf(jui.v7));
            map.put("layout/layout_sleep_efficiency_valid_detail_0", Integer.valueOf(jui.w7));
            map.put("layout/layout_sleep_empty_0", Integer.valueOf(jui.x7));
            map.put("layout/layout_sleep_evaluation_0", Integer.valueOf(jui.y7));
            map.put("layout/layout_sleep_health_check_items_0", Integer.valueOf(jui.z7));
            map.put("layout/layout_sleep_interfere_create_entry_0", Integer.valueOf(jui.A7));
            map.put("layout/layout_sleep_interfere_day_entry_0", Integer.valueOf(jui.B7));
            map.put("layout/layout_sleep_land_detail_0", Integer.valueOf(jui.C7));
            map.put("layout/layout_sleep_quality_score_0", Integer.valueOf(jui.F7));
            map.put("layout/layout_sleep_regularity_header_0", Integer.valueOf(jui.H7));
            map.put("layout/layout_sleep_rhythm_calendar_record_0", Integer.valueOf(jui.I7));
            map.put("layout/layout_sleep_rhythm_monitor_entrance_0", Integer.valueOf(jui.J7));
            map.put("layout/layout_sleep_score_0", Integer.valueOf(jui.K7));
            map.put("layout/layout_sleep_wm_duration_0", Integer.valueOf(jui.M7));
            map.put("layout/layout_sleep_wm_efficiency_0", Integer.valueOf(jui.N7));
            map.put("layout/layout_sleep_wm_regularity_0", Integer.valueOf(jui.O7));
            map.put("layout/layout_sleep_wm_score_0", Integer.valueOf(jui.P7));
            map.put("layout/layout_spo2_dwm_common_0", Integer.valueOf(jui.Q7));
            map.put("layout/layout_stand_dwm_common_0", Integer.valueOf(jui.R7));
            map.put("layout/layout_step_dwm_common_0", Integer.valueOf(jui.T7));
            map.put("layout/layout_stress_dwm_common_0", Integer.valueOf(jui.U7));
            map.put("layout/layout_training_suggestion_0", Integer.valueOf(jui.a8));
            map.put("layout/layout_vo2max_wm_common_0", Integer.valueOf(jui.c8));
            map.put("layout/main_activity_blood_pressure_home_0", Integer.valueOf(jui.h8));
            map.put("layout/main_fragment_homepage_0", Integer.valueOf(jui.i8));
            map.put("layout/sleep_interfere_report_empty_holder_0", Integer.valueOf(jui.s8));
            map.put("layout/sleep_interfere_report_line_chart_0", Integer.valueOf(jui.t8));
            map.put("layout/sleep_interfere_report_nap_duration_0", Integer.valueOf(jui.u8));
            map.put("layout/sleep_interpretation_card_0", Integer.valueOf(jui.B8));
            map.put("layout/trail_layout_three_target_medal_0", Integer.valueOf(jui.N8));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(338);
        f12220a = sparseIntArray;
        sparseIntArray.put(jui.f23146a, 1);
        sparseIntArray.put(jui.f23147b, 2);
        sparseIntArray.put(jui.c, 3);
        sparseIntArray.put(jui.d, 4);
        sparseIntArray.put(jui.e, 5);
        sparseIntArray.put(jui.f, 6);
        sparseIntArray.put(jui.g, 7);
        sparseIntArray.put(jui.h, 8);
        sparseIntArray.put(jui.i, 9);
        sparseIntArray.put(jui.l, 10);
        sparseIntArray.put(jui.common_switch_header, 11);
        sparseIntArray.put(jui.s, 12);
        sparseIntArray.put(jui.t, 13);
        sparseIntArray.put(jui.u, 14);
        sparseIntArray.put(jui.v, 15);
        sparseIntArray.put(jui.w, 16);
        sparseIntArray.put(jui.x, 17);
        sparseIntArray.put(jui.y, 18);
        sparseIntArray.put(jui.z, 19);
        sparseIntArray.put(jui.A, 20);
        sparseIntArray.put(jui.B, 21);
        sparseIntArray.put(jui.C, 22);
        sparseIntArray.put(jui.E, 23);
        sparseIntArray.put(jui.F, 24);
        sparseIntArray.put(jui.G, 25);
        sparseIntArray.put(jui.H, 26);
        sparseIntArray.put(jui.I, 27);
        sparseIntArray.put(jui.J, 28);
        sparseIntArray.put(jui.K, 29);
        sparseIntArray.put(jui.L, 30);
        sparseIntArray.put(jui.M, 31);
        sparseIntArray.put(jui.N, 32);
        sparseIntArray.put(jui.O, 33);
        sparseIntArray.put(jui.P, 34);
        sparseIntArray.put(jui.Q, 35);
        sparseIntArray.put(jui.R, 36);
        sparseIntArray.put(jui.S, 37);
        sparseIntArray.put(jui.T, 38);
        sparseIntArray.put(jui.U, 39);
        sparseIntArray.put(jui.V, 40);
        sparseIntArray.put(jui.W, 41);
        sparseIntArray.put(jui.X, 42);
        sparseIntArray.put(jui.a0, 43);
        sparseIntArray.put(jui.b0, 44);
        sparseIntArray.put(jui.c0, 45);
        sparseIntArray.put(jui.d0, 46);
        sparseIntArray.put(jui.e0, 47);
        sparseIntArray.put(jui.f0, 48);
        sparseIntArray.put(jui.g0, 49);
        sparseIntArray.put(jui.h0, 50);
        sparseIntArray.put(jui.i0, 51);
        sparseIntArray.put(jui.j0, 52);
        sparseIntArray.put(jui.k0, 53);
        sparseIntArray.put(jui.l0, 54);
        sparseIntArray.put(jui.m0, 55);
        sparseIntArray.put(jui.n0, 56);
        sparseIntArray.put(jui.o0, 57);
        sparseIntArray.put(jui.p0, 58);
        sparseIntArray.put(jui.q0, 59);
        sparseIntArray.put(jui.r0, 60);
        sparseIntArray.put(jui.s0, 61);
        sparseIntArray.put(jui.t0, 62);
        sparseIntArray.put(jui.u0, 63);
        sparseIntArray.put(jui.v0, 64);
        sparseIntArray.put(jui.w0, 65);
        sparseIntArray.put(jui.x0, 66);
        sparseIntArray.put(jui.y0, 67);
        sparseIntArray.put(jui.z0, 68);
        sparseIntArray.put(jui.A0, 69);
        sparseIntArray.put(jui.B0, 70);
        sparseIntArray.put(jui.C0, 71);
        sparseIntArray.put(jui.D0, 72);
        sparseIntArray.put(jui.E0, 73);
        sparseIntArray.put(jui.F0, 74);
        sparseIntArray.put(jui.G0, 75);
        sparseIntArray.put(jui.H0, 76);
        sparseIntArray.put(jui.I0, 77);
        sparseIntArray.put(jui.J0, 78);
        sparseIntArray.put(jui.K0, 79);
        sparseIntArray.put(jui.L0, 80);
        sparseIntArray.put(jui.M0, 81);
        sparseIntArray.put(jui.N0, 82);
        sparseIntArray.put(jui.O0, 83);
        sparseIntArray.put(jui.P0, 84);
        sparseIntArray.put(jui.Q0, 85);
        sparseIntArray.put(jui.R0, 86);
        sparseIntArray.put(jui.S0, 87);
        sparseIntArray.put(jui.T0, 88);
        sparseIntArray.put(jui.U0, 89);
        sparseIntArray.put(jui.V0, 90);
        sparseIntArray.put(jui.W0, 91);
        sparseIntArray.put(jui.X0, 92);
        sparseIntArray.put(jui.Y0, 93);
        sparseIntArray.put(jui.Z0, 94);
        sparseIntArray.put(jui.a1, 95);
        sparseIntArray.put(jui.b1, 96);
        sparseIntArray.put(jui.c1, 97);
        sparseIntArray.put(jui.d1, 98);
        sparseIntArray.put(jui.e1, 99);
        sparseIntArray.put(jui.f1, 100);
        sparseIntArray.put(jui.g1, 101);
        sparseIntArray.put(jui.h1, 102);
        sparseIntArray.put(jui.i1, 103);
        sparseIntArray.put(jui.j1, 104);
        sparseIntArray.put(jui.k1, 105);
        sparseIntArray.put(jui.l1, 106);
        sparseIntArray.put(jui.m1, 107);
        sparseIntArray.put(jui.n1, 108);
        sparseIntArray.put(jui.o1, 109);
        sparseIntArray.put(jui.p1, 110);
        sparseIntArray.put(jui.q1, 111);
        sparseIntArray.put(jui.r1, 112);
        sparseIntArray.put(jui.s1, 113);
        sparseIntArray.put(jui.t1, 114);
        sparseIntArray.put(jui.u1, 115);
        sparseIntArray.put(jui.v1, 116);
        sparseIntArray.put(jui.w1, 117);
        sparseIntArray.put(jui.x1, 118);
        sparseIntArray.put(jui.y1, 119);
        sparseIntArray.put(jui.z1, 120);
        sparseIntArray.put(jui.A1, 121);
        sparseIntArray.put(jui.B1, 122);
        sparseIntArray.put(jui.C1, 123);
        sparseIntArray.put(jui.D1, 124);
        sparseIntArray.put(jui.E1, 125);
        sparseIntArray.put(jui.F1, 126);
        sparseIntArray.put(jui.G1, 127);
        sparseIntArray.put(jui.H1, 128);
        sparseIntArray.put(jui.I1, 129);
        sparseIntArray.put(jui.J1, 130);
        sparseIntArray.put(jui.K1, 131);
        sparseIntArray.put(jui.L1, 132);
        sparseIntArray.put(jui.M1, 133);
        sparseIntArray.put(jui.N1, 134);
        sparseIntArray.put(jui.O1, 135);
        sparseIntArray.put(jui.P1, 136);
        sparseIntArray.put(jui.Q1, 137);
        sparseIntArray.put(jui.R1, 138);
        sparseIntArray.put(jui.S1, 139);
        sparseIntArray.put(jui.T1, 140);
        sparseIntArray.put(jui.U1, 141);
        sparseIntArray.put(jui.V1, 142);
        sparseIntArray.put(jui.W1, 143);
        sparseIntArray.put(jui.X1, 144);
        sparseIntArray.put(jui.Y1, 145);
        sparseIntArray.put(jui.Z1, 146);
        sparseIntArray.put(jui.a2, 147);
        sparseIntArray.put(jui.b2, 148);
        sparseIntArray.put(jui.c2, 149);
        sparseIntArray.put(jui.e2, 150);
        sparseIntArray.put(jui.f2, 151);
        sparseIntArray.put(jui.g2, 152);
        sparseIntArray.put(jui.h2, 153);
        sparseIntArray.put(jui.i2, 154);
        sparseIntArray.put(jui.j2, 155);
        sparseIntArray.put(jui.k2, 156);
        sparseIntArray.put(jui.l2, 157);
        sparseIntArray.put(jui.m2, 158);
        sparseIntArray.put(jui.o2, 159);
        sparseIntArray.put(jui.p2, 160);
        sparseIntArray.put(jui.q2, 161);
        sparseIntArray.put(jui.r2, 162);
        sparseIntArray.put(jui.s2, 163);
        sparseIntArray.put(jui.t2, 164);
        sparseIntArray.put(jui.u2, 165);
        sparseIntArray.put(jui.v2, 166);
        sparseIntArray.put(jui.w2, 167);
        sparseIntArray.put(jui.x2, 168);
        sparseIntArray.put(jui.y2, 169);
        sparseIntArray.put(jui.z2, 170);
        sparseIntArray.put(jui.A2, 171);
        sparseIntArray.put(jui.B2, 172);
        sparseIntArray.put(jui.C2, 173);
        sparseIntArray.put(jui.D2, 174);
        sparseIntArray.put(jui.E2, 175);
        sparseIntArray.put(jui.F2, 176);
        sparseIntArray.put(jui.I2, 177);
        sparseIntArray.put(jui.N2, 178);
        sparseIntArray.put(jui.R2, 179);
        sparseIntArray.put(jui.S2, 180);
        sparseIntArray.put(jui.T2, 181);
        sparseIntArray.put(jui.U2, 182);
        sparseIntArray.put(jui.V2, SportReportBaseParser.ReportType.entryTime);
        sparseIntArray.put(jui.W2, SportReportBaseParser.ReportType.exitTime);
        sparseIntArray.put(jui.X2, 185);
        sparseIntArray.put(jui.Y2, SportReportBaseParser.ReportType.avgDivingDepth);
        sparseIntArray.put(jui.a3, SportReportBaseParser.ReportType.avgAscentRate);
        sparseIntArray.put(jui.b3, SportReportBaseParser.ReportType.avgDescentRate);
        sparseIntArray.put(jui.c3, SportReportBaseParser.ReportType.descentCount);
        sparseIntArray.put(jui.d3, SportReportBaseParser.ReportType.maxWaterTemperature);
        sparseIntArray.put(jui.e3, SportReportBaseParser.ReportType.minWaterTemperature);
        sparseIntArray.put(jui.f3, 192);
        sparseIntArray.put(jui.g3, SportReportBaseParser.ReportType.divingOTU);
        sparseIntArray.put(jui.h3, SportReportBaseParser.ReportType.divingCNS);
        sparseIntArray.put(jui.i3, SportReportBaseParser.ReportType.oxygenPartialPressureThreshold);
        sparseIntArray.put(jui.m3, SportReportBaseParser.ReportType.oxygenConcentration);
        sparseIntArray.put(jui.n3, SportReportBaseParser.ReportType.noFlyDuration);
        sparseIntArray.put(jui.r3, SportReportBaseParser.ReportType.algorithmDataSource);
        sparseIntArray.put(jui.s3, 199);
        sparseIntArray.put(jui.t3, 200);
        sparseIntArray.put(jui.u3, 201);
        sparseIntArray.put(jui.v3, 202);
        sparseIntArray.put(jui.w3, 203);
        sparseIntArray.put(jui.x3, 204);
        sparseIntArray.put(jui.y3, 205);
        sparseIntArray.put(jui.z3, 206);
        sparseIntArray.put(jui.A3, 207);
        sparseIntArray.put(jui.B3, 208);
        sparseIntArray.put(jui.C3, 209);
        sparseIntArray.put(jui.D3, 210);
        sparseIntArray.put(jui.E3, 211);
        sparseIntArray.put(jui.F3, 212);
        sparseIntArray.put(jui.G3, 213);
        sparseIntArray.put(jui.H3, 214);
        sparseIntArray.put(jui.I3, 215);
        sparseIntArray.put(jui.J3, 216);
        sparseIntArray.put(jui.K3, 217);
        sparseIntArray.put(jui.L3, 218);
        sparseIntArray.put(jui.M3, 219);
        sparseIntArray.put(jui.N3, 220);
        sparseIntArray.put(jui.O3, 221);
        sparseIntArray.put(jui.Q3, 222);
        sparseIntArray.put(jui.R3, SportReportBaseParser.ReportType.targetValueNumber);
        sparseIntArray.put(jui.S3, SportReportBaseParser.ReportType.avgFreq);
        sparseIntArray.put(jui.T3, SportReportBaseParser.ReportType.maxFreq);
        sparseIntArray.put(jui.U3, 226);
        sparseIntArray.put(jui.V3, 227);
        sparseIntArray.put(jui.W3, 228);
        sparseIntArray.put(jui.Z3, 229);
        sparseIntArray.put(jui.a4, 230);
        sparseIntArray.put(jui.c4, ErrorCode.ERROR_SP_NOTICE_NOT_READY);
        sparseIntArray.put(jui.f4, ErrorCode.ERROR_SP_NOTICE_INCOMPATIBLE);
        sparseIntArray.put(jui.g4, 233);
        sparseIntArray.put(jui.h4, 234);
        sparseIntArray.put(jui.k4, 235);
        sparseIntArray.put(jui.m4, 236);
        sparseIntArray.put(jui.n4, 237);
        sparseIntArray.put(jui.o4, 238);
        sparseIntArray.put(jui.p4, 239);
        sparseIntArray.put(jui.t4, 240);
        sparseIntArray.put(jui.u4, 241);
        sparseIntArray.put(jui.v4, 242);
        sparseIntArray.put(jui.w4, 243);
        sparseIntArray.put(jui.x4, 244);
        sparseIntArray.put(jui.y4, 245);
        sparseIntArray.put(jui.z4, 246);
        sparseIntArray.put(jui.A4, 247);
        sparseIntArray.put(jui.B4, 248);
        sparseIntArray.put(jui.C4, 249);
        sparseIntArray.put(jui.D4, 250);
        sparseIntArray.put(jui.E4, VibrateModeSetViewModel.DEFAULT_BBJI);
        sparseIntArray.put(jui.F4, 252);
        sparseIntArray.put(jui.G4, 253);
        sparseIntArray.put(jui.H4, 254);
        sparseIntArray.put(jui.I4, 255);
        sparseIntArray.put(jui.J4, 256);
        sparseIntArray.put(jui.K4, 257);
        sparseIntArray.put(jui.L4, SportSummary.VERSION_102);
        sparseIntArray.put(jui.M4, SportSummary.VERSION_103);
        sparseIntArray.put(jui.O4, 260);
        sparseIntArray.put(jui.P4, SportSummary.VERSION_105);
        sparseIntArray.put(jui.Q4, 262);
        sparseIntArray.put(jui.R4, 263);
        sparseIntArray.put(jui.S4, 264);
        sparseIntArray.put(jui.T4, 265);
        sparseIntArray.put(jui.W4, 266);
        sparseIntArray.put(jui.X4, 267);
        sparseIntArray.put(jui.Z4, 268);
        sparseIntArray.put(jui.b5, 269);
        sparseIntArray.put(jui.c5, 270);
        sparseIntArray.put(jui.d5, 271);
        sparseIntArray.put(jui.e5, 272);
        sparseIntArray.put(jui.n5, 273);
        sparseIntArray.put(jui.t5, 274);
        sparseIntArray.put(jui.u5, 275);
        sparseIntArray.put(jui.w5, 276);
        sparseIntArray.put(jui.x5, 277);
        sparseIntArray.put(jui.y5, 278);
        sparseIntArray.put(jui.F5, 279);
        sparseIntArray.put(jui.U5, 280);
        sparseIntArray.put(jui.Y5, 281);
        sparseIntArray.put(jui.Z5, 282);
        sparseIntArray.put(jui.c6, 283);
        sparseIntArray.put(jui.d6, 284);
        sparseIntArray.put(jui.l6, 285);
        sparseIntArray.put(jui.m6, 286);
        sparseIntArray.put(jui.n6, 287);
        sparseIntArray.put(jui.o6, 288);
        sparseIntArray.put(jui.t6, 289);
        sparseIntArray.put(jui.u6, 290);
        sparseIntArray.put(jui.v6, 291);
        sparseIntArray.put(jui.w6, 292);
        sparseIntArray.put(jui.H6, 293);
        sparseIntArray.put(jui.I6, 294);
        sparseIntArray.put(jui.J6, 295);
        sparseIntArray.put(jui.K6, 296);
        sparseIntArray.put(jui.L6, 297);
        sparseIntArray.put(jui.M6, 298);
        sparseIntArray.put(jui.N6, 299);
        sparseIntArray.put(jui.O6, 300);
        sparseIntArray.put(jui.P6, 301);
        sparseIntArray.put(jui.W6, 302);
        sparseIntArray.put(jui.Z6, 303);
        sparseIntArray.put(jui.a7, 304);
        sparseIntArray.put(jui.b7, 305);
        sparseIntArray.put(jui.j7, 306);
        sparseIntArray.put(jui.r7, 307);
        sparseIntArray.put(jui.t7, 308);
        sparseIntArray.put(jui.v7, 309);
        sparseIntArray.put(jui.w7, 310);
        sparseIntArray.put(jui.x7, 311);
        sparseIntArray.put(jui.y7, 312);
        sparseIntArray.put(jui.z7, 313);
        sparseIntArray.put(jui.A7, 314);
        sparseIntArray.put(jui.B7, 315);
        sparseIntArray.put(jui.C7, 316);
        sparseIntArray.put(jui.F7, 317);
        sparseIntArray.put(jui.H7, 318);
        sparseIntArray.put(jui.I7, 319);
        sparseIntArray.put(jui.J7, 320);
        sparseIntArray.put(jui.K7, 321);
        sparseIntArray.put(jui.M7, 322);
        sparseIntArray.put(jui.N7, 323);
        sparseIntArray.put(jui.O7, 324);
        sparseIntArray.put(jui.P7, 325);
        sparseIntArray.put(jui.Q7, 326);
        sparseIntArray.put(jui.R7, 327);
        sparseIntArray.put(jui.T7, 328);
        sparseIntArray.put(jui.U7, 329);
        sparseIntArray.put(jui.a8, 330);
        sparseIntArray.put(jui.c8, 331);
        sparseIntArray.put(jui.h8, 332);
        sparseIntArray.put(jui.i8, 333);
        sparseIntArray.put(jui.s8, 334);
        sparseIntArray.put(jui.t8, 335);
        sparseIntArray.put(jui.u8, 336);
        sparseIntArray.put(jui.B8, 337);
        sparseIntArray.put(jui.N8, 338);
    }

    private final ViewDataBinding a(rk5 rk5Var, View view, int i, Object obj) {
        switch (i) {
            case 1:
                if ("layout-sw480dp/activity_blood_glucose_landscape_0".equals(obj)) {
                    return new eh0(rk5Var, view);
                }
                if ("layout/activity_blood_glucose_landscape_0".equals(obj)) {
                    return new dh0(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_blood_glucose_landscape is invalid. Received: " + obj);
            case 2:
                if ("layout/activity_common_0".equals(obj)) {
                    return new xh0(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_common is invalid. Received: " + obj);
            case 3:
                if ("layout/activity_ecg_landscape_0".equals(obj)) {
                    return new oi0(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_ecg_landscape is invalid. Received: " + obj);
            case 4:
                if ("layout/activity_health_ecg_item_detail_0".equals(obj)) {
                    return new qm0(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_health_ecg_item_detail is invalid. Received: " + obj);
            case 5:
                if ("layout/activity_sleep_animal_detecting_0".equals(obj)) {
                    return new co0(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_sleep_animal_detecting is invalid. Received: " + obj);
            case 6:
                if ("layout/activity_sleep_animal_report_0".equals(obj)) {
                    return new eo0(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_sleep_animal_report is invalid. Received: " + obj);
            case 7:
                if ("layout/activity_sleep_animal_share_0".equals(obj)) {
                    return new go0(rk5Var, view);
                }
                if ("layout-sw600dp-land/activity_sleep_animal_share_0".equals(obj)) {
                    return new ho0(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_sleep_animal_share is invalid. Received: " + obj);
            case 8:
                if ("layout-small/activity_sleep_go_to_bed_time_calibrate_0".equals(obj)) {
                    return new ko0(rk5Var, view);
                }
                if ("layout/activity_sleep_go_to_bed_time_calibrate_0".equals(obj)) {
                    return new jo0(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_sleep_go_to_bed_time_calibrate is invalid. Received: " + obj);
            case 9:
                if ("layout/activity_sleep_rhythm_monitor_guide_0".equals(obj)) {
                    return new mo0(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for activity_sleep_rhythm_monitor_guide is invalid. Received: " + obj);
            case 10:
                if ("layout/card_weight_segmental_fat_0".equals(obj)) {
                    return new yr3(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for card_weight_segmental_fat is invalid. Received: " + obj);
            case 11:
                if ("layout/common_switch_header_0".equals(obj)) {
                    return new k84(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for common_switch_header is invalid. Received: " + obj);
            case 12:
                if ("layout/fragment_blood_glucose_add_0".equals(obj)) {
                    return new b3a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_blood_glucose_add is invalid. Received: " + obj);
            case 13:
                if ("layout/fragment_blood_glucose_all_day_item_0".equals(obj)) {
                    return new d3a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_blood_glucose_all_day_item is invalid. Received: " + obj);
            case 14:
                if ("layout/fragment_blood_glucose_finger_day_item_0".equals(obj)) {
                    return new f3a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_blood_glucose_finger_day_item is invalid. Received: " + obj);
            case 15:
                if ("layout/fragment_blood_glucose_finger_month_item_0".equals(obj)) {
                    return new h3a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_blood_glucose_finger_month_item is invalid. Received: " + obj);
            case 16:
                if ("layout/fragment_blood_glucose_finger_week_item_0".equals(obj)) {
                    return new j3a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_blood_glucose_finger_week_item is invalid. Received: " + obj);
            case 17:
                if ("layout/fragment_blood_glucose_month_item_0".equals(obj)) {
                    return new l3a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_blood_glucose_month_item is invalid. Received: " + obj);
            case 18:
                if ("layout/fragment_blood_glucose_week_item_0".equals(obj)) {
                    return new n3a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_blood_glucose_week_item is invalid. Received: " + obj);
            case 19:
                if ("layout/fragment_blood_pressure_add_0".equals(obj)) {
                    return new p3a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_blood_pressure_add is invalid. Received: " + obj);
            case 20:
                if ("layout/fragment_blood_pressure_day_item_0".equals(obj)) {
                    return new r3a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_blood_pressure_day_item is invalid. Received: " + obj);
            case 21:
                if ("layout/fragment_blood_pressure_day_r_item_0".equals(obj)) {
                    return new t3a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_blood_pressure_day_r_item is invalid. Received: " + obj);
            case 22:
                if ("layout/fragment_blood_pressure_month_item_0".equals(obj)) {
                    return new v3a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_blood_pressure_month_item is invalid. Received: " + obj);
            case 23:
                if ("layout/fragment_blood_pressure_week_item_0".equals(obj)) {
                    return new x3a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_blood_pressure_week_item is invalid. Received: " + obj);
            case 24:
                if ("layout/fragment_blood_pressure_week_r_item_0".equals(obj)) {
                    return new z3a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_blood_pressure_week_r_item is invalid. Received: " + obj);
            case 25:
                if ("layout/fragment_calendar_base_0".equals(obj)) {
                    return new b4a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_calendar_base is invalid. Received: " + obj);
            case 26:
                if ("layout/fragment_calendar_day_0".equals(obj)) {
                    return new d4a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_calendar_day is invalid. Received: " + obj);
            case 27:
                if ("layout/fragment_calendar_month_0".equals(obj)) {
                    return new f4a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_calendar_month is invalid. Received: " + obj);
            case 28:
                if ("layout/fragment_calorie_day_0".equals(obj)) {
                    return new h4a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_calorie_day is invalid. Received: " + obj);
            case 29:
                if ("layout/fragment_calorie_day_item_0".equals(obj)) {
                    return new j4a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_calorie_day_item is invalid. Received: " + obj);
            case 30:
                if ("layout/fragment_calorie_day_r_item_0".equals(obj)) {
                    return new l4a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_calorie_day_r_item is invalid. Received: " + obj);
            case 31:
                if ("layout/fragment_calorie_month_0".equals(obj)) {
                    return new n4a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_calorie_month is invalid. Received: " + obj);
            case 32:
                if ("layout/fragment_calorie_month_item_0".equals(obj)) {
                    return new p4a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_calorie_month_item is invalid. Received: " + obj);
            case 33:
                if ("layout/fragment_calorie_week_0".equals(obj)) {
                    return new r4a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_calorie_week is invalid. Received: " + obj);
            case 34:
                if ("layout/fragment_calorie_week_item_0".equals(obj)) {
                    return new t4a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_calorie_week_item is invalid. Received: " + obj);
            case 35:
                if ("layout/fragment_calorie_week_r_item_0".equals(obj)) {
                    return new v4a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_calorie_week_r_item is invalid. Received: " + obj);
            case 36:
                if ("layout/fragment_common_day_week_month_0".equals(obj)) {
                    return new z4a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_common_day_week_month is invalid. Received: " + obj);
            case 37:
                if ("layout/fragment_data_v2_0".equals(obj)) {
                    return new j5a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_data_v2 is invalid. Received: " + obj);
            case 38:
                if ("layout/fragment_energy_day_item_0".equals(obj)) {
                    return new u5a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_energy_day_item is invalid. Received: " + obj);
            case 39:
                if ("layout/fragment_energy_month_item_0".equals(obj)) {
                    return new w5a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_energy_month_item is invalid. Received: " + obj);
            case 40:
                if ("layout/fragment_energy_week_item_0".equals(obj)) {
                    return new y5a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_energy_week_item is invalid. Received: " + obj);
            case 41:
                if ("layout/fragment_expandable_record_detail_0".equals(obj)) {
                    return new a6a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_expandable_record_detail is invalid. Received: " + obj);
            case 42:
                if ("layout/fragment_health_check_0".equals(obj)) {
                    return new d7a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_health_check is invalid. Received: " + obj);
            case 43:
                if ("layout/fragment_hearing_day_0".equals(obj)) {
                    return new f7a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_hearing_day is invalid. Received: " + obj);
            case 44:
                if ("layout/fragment_hearing_day_item_0".equals(obj)) {
                    return new h7a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_hearing_day_item is invalid. Received: " + obj);
            case 45:
                if ("layout/fragment_hearing_month_0".equals(obj)) {
                    return new j7a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_hearing_month is invalid. Received: " + obj);
            case 46:
                if ("layout/fragment_hearing_month_item_0".equals(obj)) {
                    return new l7a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_hearing_month_item is invalid. Received: " + obj);
            case 47:
                if ("layout/fragment_hearing_week_0".equals(obj)) {
                    return new n7a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_hearing_week is invalid. Received: " + obj);
            case 48:
                if ("layout/fragment_hearing_week_item_0".equals(obj)) {
                    return new p7a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_hearing_week_item is invalid. Received: " + obj);
            case 49:
                if ("layout/fragment_hrm_abnormal_chart_0".equals(obj)) {
                    return new r7a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_hrm_abnormal_chart is invalid. Received: " + obj);
            case 50:
                if ("layout/fragment_hrm_abnormal_high_list_0".equals(obj)) {
                    return new t7a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_hrm_abnormal_high_list is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    private final ViewDataBinding b(rk5 rk5Var, View view, int i, Object obj) {
        switch (i) {
            case 51:
                if ("layout/fragment_hrm_abnormal_low_list_0".equals(obj)) {
                    return new v7a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_hrm_abnormal_low_list is invalid. Received: " + obj);
            case 52:
                if ("layout/fragment_hrm_add_0".equals(obj)) {
                    return new x7a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_hrm_add is invalid. Received: " + obj);
            case 53:
                if ("layout/fragment_hrm_day_0".equals(obj)) {
                    return new z7a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_hrm_day is invalid. Received: " + obj);
            case 54:
                if ("layout/fragment_hrm_day_item_0".equals(obj)) {
                    return new b8a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_hrm_day_item is invalid. Received: " + obj);
            case 55:
                if ("layout/fragment_hrm_day_r_item_0".equals(obj)) {
                    return new d8a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_hrm_day_r_item is invalid. Received: " + obj);
            case 56:
                if ("layout/fragment_hrm_ecg_0".equals(obj)) {
                    return new h8a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_hrm_ecg is invalid. Received: " + obj);
            case 57:
                if ("layout/fragment_hrm_ecg_bar_0".equals(obj)) {
                    return new f8a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_hrm_ecg_bar is invalid. Received: " + obj);
            case 58:
                if ("layout/fragment_hrm_fib_detail_0".equals(obj)) {
                    return new j8a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_hrm_fib_detail is invalid. Received: " + obj);
            case 59:
                if ("layout/fragment_hrm_manually_measured_records_list_0".equals(obj)) {
                    return new l8a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_hrm_manually_measured_records_list is invalid. Received: " + obj);
            case 60:
                if ("layout/fragment_hrm_month_0".equals(obj)) {
                    return new n8a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_hrm_month is invalid. Received: " + obj);
            case 61:
                if ("layout/fragment_hrm_month_item_0".equals(obj)) {
                    return new p8a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_hrm_month_item is invalid. Received: " + obj);
            case 62:
                if ("layout/fragment_hrm_week_0".equals(obj)) {
                    return new r8a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_hrm_week is invalid. Received: " + obj);
            case 63:
                if ("layout/fragment_hrm_week_item_0".equals(obj)) {
                    return new t8a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_hrm_week_item is invalid. Received: " + obj);
            case 64:
                if ("layout/fragment_hrm_week_r_item_0".equals(obj)) {
                    return new v8a(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_hrm_week_r_item is invalid. Received: " + obj);
            case 65:
                if ("layout/fragment_mh_intensity_day_0".equals(obj)) {
                    return new caa(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_mh_intensity_day is invalid. Received: " + obj);
            case 66:
                if ("layout/fragment_mh_intensity_month_0".equals(obj)) {
                    return new eaa(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_mh_intensity_month is invalid. Received: " + obj);
            case 67:
                if ("layout/fragment_mh_intensity_week_0".equals(obj)) {
                    return new gaa(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_mh_intensity_week is invalid. Received: " + obj);
            case 68:
                if ("layout/fragment_pai_day_0".equals(obj)) {
                    return new kaa(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_pai_day is invalid. Received: " + obj);
            case 69:
                if ("layout/fragment_pai_day_rate_0".equals(obj)) {
                    return new maa(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_pai_day_rate is invalid. Received: " + obj);
            case 70:
                if ("layout/fragment_physcial_status_day_0".equals(obj)) {
                    return new raa(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_physcial_status_day is invalid. Received: " + obj);
            case 71:
                if ("layout/fragment_record_detail_0".equals(obj)) {
                    return new taa(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_record_detail is invalid. Received: " + obj);
            case 72:
                if ("layout/fragment_record_detail_blood_pressure_0".equals(obj)) {
                    return new vaa(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_record_detail_blood_pressure is invalid. Received: " + obj);
            case 73:
                if ("layout/fragment_relative_care_0".equals(obj)) {
                    return new xaa(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_relative_care is invalid. Received: " + obj);
            case 74:
                if ("layout/fragment_running_indicator_detail_0".equals(obj)) {
                    return new bba(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_running_indicator_detail is invalid. Received: " + obj);
            case 75:
                if ("layout/fragment_sao2_day_0".equals(obj)) {
                    return new dba(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sao2_day is invalid. Received: " + obj);
            case 76:
                if ("layout/fragment_sao2_month_0".equals(obj)) {
                    return new fba(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sao2_month is invalid. Received: " + obj);
            case 77:
                if ("layout/fragment_sao2_week_0".equals(obj)) {
                    return new hba(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sao2_week is invalid. Received: " + obj);
            case 78:
                if ("layout/fragment_sleep_breath_rate_detail_0".equals(obj)) {
                    return new nba(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sleep_breath_rate_detail is invalid. Received: " + obj);
            case 79:
                if ("layout/fragment_sleep_day_item_0".equals(obj)) {
                    return new pba(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sleep_day_item is invalid. Received: " + obj);
            case 80:
                if ("layout/fragment_sleep_day_r_item_0".equals(obj)) {
                    return new rba(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sleep_day_r_item is invalid. Received: " + obj);
            case 81:
                if ("layout/fragment_sleep_diary_update_0".equals(obj)) {
                    return new tba(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sleep_diary_update is invalid. Received: " + obj);
            case 82:
                if ("layout/fragment_sleep_hrm_detail_0".equals(obj)) {
                    return new vba(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sleep_hrm_detail is invalid. Received: " + obj);
            case 83:
                if ("layout/fragment_sleep_interfere_detail_0".equals(obj)) {
                    return new xba(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sleep_interfere_detail is invalid. Received: " + obj);
            case 84:
                if ("layout/fragment_sleep_interfere_history_0".equals(obj)) {
                    return new zba(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sleep_interfere_history is invalid. Received: " + obj);
            case 85:
                if ("layout/fragment_sleep_interfere_report_0".equals(obj)) {
                    return new bca(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sleep_interfere_report is invalid. Received: " + obj);
            case 86:
                if ("layout/fragment_sleep_interfere_set_0".equals(obj)) {
                    return new dca(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sleep_interfere_set is invalid. Received: " + obj);
            case 87:
                if ("layout/fragment_sleep_month_0".equals(obj)) {
                    return new hca(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sleep_month is invalid. Received: " + obj);
            case 88:
                if ("layout/fragment_sleep_quality_detail_0".equals(obj)) {
                    return new jca(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sleep_quality_detail is invalid. Received: " + obj);
            case 89:
                if ("layout/fragment_sleep_record_add_0".equals(obj)) {
                    return new lca(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sleep_record_add is invalid. Received: " + obj);
            case 90:
                if ("layout/fragment_sleep_rhythm_records_0".equals(obj)) {
                    return new nca(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sleep_rhythm_records is invalid. Received: " + obj);
            case 91:
                if ("layout/fragment_sleep_spo2_detail_0".equals(obj)) {
                    return new pca(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sleep_spo2_detail is invalid. Received: " + obj);
            case 92:
                if ("layout/fragment_sleep_week_0".equals(obj)) {
                    return new rca(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sleep_week is invalid. Received: " + obj);
            case 93:
                if ("layout/fragment_sleep_week_month_item_0".equals(obj)) {
                    return new tca(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sleep_week_month_item is invalid. Received: " + obj);
            case 94:
                if ("layout/fragment_sleep_week_r_item_0".equals(obj)) {
                    return new vca(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sleep_week_r_item is invalid. Received: " + obj);
            case 95:
                if ("layout/fragment_spo2_abnormal_chart_0".equals(obj)) {
                    return new xca(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_spo2_abnormal_chart is invalid. Received: " + obj);
            case 96:
                if ("layout/fragment_spo2_day_item_0".equals(obj)) {
                    return new zca(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_spo2_day_item is invalid. Received: " + obj);
            case 97:
                if ("layout/fragment_spo2_day_r_item_0".equals(obj)) {
                    return new bda(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_spo2_day_r_item is invalid. Received: " + obj);
            case 98:
                if ("layout/fragment_spo2_month_item_0".equals(obj)) {
                    return new dda(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_spo2_month_item is invalid. Received: " + obj);
            case 99:
                if ("layout/fragment_spo2_week_item_0".equals(obj)) {
                    return new fda(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_spo2_week_item is invalid. Received: " + obj);
            case 100:
                if ("layout/fragment_spo2_week_r_item_0".equals(obj)) {
                    return new hda(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_spo2_week_r_item is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    private final ViewDataBinding c(rk5 rk5Var, View view, int i, Object obj) {
        switch (i) {
            case 101:
                if ("layout/fragment_sport_basic_0".equals(obj)) {
                    return new jda(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sport_basic is invalid. Received: " + obj);
            case 102:
                if ("layout-sw600dp-land/fragment_sport_target_chart_0".equals(obj)) {
                    return new mha(rk5Var, view);
                }
                if ("layout/fragment_sport_target_chart_0".equals(obj)) {
                    return new lha(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sport_target_chart is invalid. Received: " + obj);
            case 103:
                if ("layout/fragment_sport_target_r_chart_0".equals(obj)) {
                    return new oha(rk5Var, view);
                }
                if ("layout-sw600dp-port/fragment_sport_target_r_chart_0".equals(obj)) {
                    return new pha(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sport_target_r_chart is invalid. Received: " + obj);
            case 104:
                if ("layout/fragment_sport_target_week_bar_0".equals(obj)) {
                    return new rha(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_sport_target_week_bar is invalid. Received: " + obj);
            case 105:
                if ("layout/fragment_stand_day_0".equals(obj)) {
                    return new zha(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_stand_day is invalid. Received: " + obj);
            case 106:
                if ("layout/fragment_stand_day_item_0".equals(obj)) {
                    return new bia(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_stand_day_item is invalid. Received: " + obj);
            case 107:
                if ("layout/fragment_stand_month_0".equals(obj)) {
                    return new dia(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_stand_month is invalid. Received: " + obj);
            case 108:
                if ("layout/fragment_stand_month_item_0".equals(obj)) {
                    return new fia(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_stand_month_item is invalid. Received: " + obj);
            case 109:
                if ("layout/fragment_stand_month_r_item_0".equals(obj)) {
                    return new hia(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_stand_month_r_item is invalid. Received: " + obj);
            case 110:
                if ("layout/fragment_stand_week_0".equals(obj)) {
                    return new jia(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_stand_week is invalid. Received: " + obj);
            case 111:
                if ("layout/fragment_stand_week_item_0".equals(obj)) {
                    return new lia(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_stand_week_item is invalid. Received: " + obj);
            case 112:
                if ("layout/fragment_stand_week_r_item_0".equals(obj)) {
                    return new nia(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_stand_week_r_item is invalid. Received: " + obj);
            case 113:
                if ("layout/fragment_step_day_0".equals(obj)) {
                    return new pia(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_step_day is invalid. Received: " + obj);
            case 114:
                if ("layout/fragment_step_day_item_0".equals(obj)) {
                    return new ria(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_step_day_item is invalid. Received: " + obj);
            case 115:
                if ("layout/fragment_step_day_r_item_0".equals(obj)) {
                    return new tia(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_step_day_r_item is invalid. Received: " + obj);
            case 116:
                if ("layout/fragment_step_hrm_detail_0".equals(obj)) {
                    return new via(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_step_hrm_detail is invalid. Received: " + obj);
            case 117:
                if ("layout/fragment_step_month_0".equals(obj)) {
                    return new xia(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_step_month is invalid. Received: " + obj);
            case 118:
                if ("layout/fragment_step_month_item_0".equals(obj)) {
                    return new zia(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_step_month_item is invalid. Received: " + obj);
            case 119:
                if ("layout/fragment_step_week_0".equals(obj)) {
                    return new bja(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_step_week is invalid. Received: " + obj);
            case 120:
                if ("layout/fragment_step_week_item_0".equals(obj)) {
                    return new dja(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_step_week_item is invalid. Received: " + obj);
            case 121:
                if ("layout/fragment_step_week_r_item_0".equals(obj)) {
                    return new fja(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_step_week_r_item is invalid. Received: " + obj);
            case 122:
                if ("layout/fragment_strength_day_item_0".equals(obj)) {
                    return new hja(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_strength_day_item is invalid. Received: " + obj);
            case 123:
                if ("layout/fragment_strength_day_r_item_0".equals(obj)) {
                    return new jja(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_strength_day_r_item is invalid. Received: " + obj);
            case 124:
                if ("layout/fragment_strength_month_item_0".equals(obj)) {
                    return new lja(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_strength_month_item is invalid. Received: " + obj);
            case 125:
                if ("layout/fragment_strength_week_item_0".equals(obj)) {
                    return new nja(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_strength_week_item is invalid. Received: " + obj);
            case 126:
                if ("layout/fragment_strength_week_r_item_0".equals(obj)) {
                    return new pja(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_strength_week_r_item is invalid. Received: " + obj);
            case 127:
                if ("layout/fragment_stress_day_0".equals(obj)) {
                    return new rja(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_stress_day is invalid. Received: " + obj);
            case 128:
                if ("layout/fragment_stress_day_item_0".equals(obj)) {
                    return new tja(rk5Var, view);
                }
                if ("layout-sw600dp-land/fragment_stress_day_item_0".equals(obj)) {
                    return new uja(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_stress_day_item is invalid. Received: " + obj);
            case 129:
                if ("layout/fragment_stress_month_0".equals(obj)) {
                    return new wja(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_stress_month is invalid. Received: " + obj);
            case 130:
                if ("layout/fragment_stress_month_item_0".equals(obj)) {
                    return new yja(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_stress_month_item is invalid. Received: " + obj);
            case 131:
                if ("layout/fragment_stress_week_0".equals(obj)) {
                    return new aka(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_stress_week is invalid. Received: " + obj);
            case 132:
                if ("layout/fragment_stress_week_item_0".equals(obj)) {
                    return new cka(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_stress_week_item is invalid. Received: " + obj);
            case 133:
                if ("layout/fragment_target_basic_0".equals(obj)) {
                    return new ika(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_target_basic is invalid. Received: " + obj);
            case 134:
                if ("layout/fragment_target_calorie_r_0".equals(obj)) {
                    return new kka(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_target_calorie_r is invalid. Received: " + obj);
            case 135:
                if ("layout/fragment_target_mh_intensity_r_0".equals(obj)) {
                    return new mka(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_target_mh_intensity_r is invalid. Received: " + obj);
            case 136:
                if ("layout/fragment_target_stand_r_0".equals(obj)) {
                    return new oka(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_target_stand_r is invalid. Received: " + obj);
            case 137:
                if ("layout/fragment_target_step_r_0".equals(obj)) {
                    return new qka(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_target_step_r is invalid. Received: " + obj);
            case 138:
                if ("layout/fragment_temperature_add_0".equals(obj)) {
                    return new ska(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_temperature_add is invalid. Received: " + obj);
            case 139:
                if ("layout/fragment_temperature_day_item_0".equals(obj)) {
                    return new uka(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_temperature_day_item is invalid. Received: " + obj);
            case 140:
                if ("layout/fragment_temperature_month_item_0".equals(obj)) {
                    return new wka(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_temperature_month_item is invalid. Received: " + obj);
            case 141:
                if ("layout/fragment_temperature_week_item_0".equals(obj)) {
                    return new ala(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_temperature_week_item is invalid. Received: " + obj);
            case 142:
                if ("layout/fragment_training_load_detail_0".equals(obj)) {
                    return new cla(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_training_load_detail is invalid. Received: " + obj);
            case 143:
                if ("layout/fragment_understand_bloodpressure_0".equals(obj)) {
                    return new hla(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_understand_bloodpressure is invalid. Received: " + obj);
            case 144:
                if ("layout/fragment_understand_calorie_0".equals(obj)) {
                    return new jla(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_understand_calorie is invalid. Received: " + obj);
            case 145:
                if ("layout/fragment_understand_energy_0".equals(obj)) {
                    return new lla(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_understand_energy is invalid. Received: " + obj);
            case 146:
                if ("layout/fragment_understand_hearing_0".equals(obj)) {
                    return new nla(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_understand_hearing is invalid. Received: " + obj);
            case 147:
                if ("layout/fragment_understand_mh_intensity_0".equals(obj)) {
                    return new pla(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_understand_mh_intensity is invalid. Received: " + obj);
            case 148:
                if ("layout/fragment_understand_physical_status_0".equals(obj)) {
                    return new rla(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_understand_physical_status is invalid. Received: " + obj);
            case 149:
                if ("layout/fragment_understand_running_indicator_0".equals(obj)) {
                    return new tla(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_understand_running_indicator is invalid. Received: " + obj);
            case 150:
                if ("layout/fragment_understand_sleep_aduio_no_data_0".equals(obj)) {
                    return new vla(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_understand_sleep_aduio_no_data is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    private final ViewDataBinding d(rk5 rk5Var, View view, int i, Object obj) {
        switch (i) {
            case 151:
                if ("layout/fragment_understand_spo2_0".equals(obj)) {
                    return new xla(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_understand_spo2 is invalid. Received: " + obj);
            case 152:
                if ("layout/fragment_understand_stand_0".equals(obj)) {
                    return new zla(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_understand_stand is invalid. Received: " + obj);
            case 153:
                if ("layout/fragment_understand_stress_0".equals(obj)) {
                    return new bma(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_understand_stress is invalid. Received: " + obj);
            case 154:
                if ("layout/fragment_understand_temperature_0".equals(obj)) {
                    return new dma(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_understand_temperature is invalid. Received: " + obj);
            case 155:
                if ("layout/fragment_understand_training_load_0".equals(obj)) {
                    return new fma(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_understand_training_load is invalid. Received: " + obj);
            case 156:
                if ("layout/fragment_understand_v02max_0".equals(obj)) {
                    return new hma(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_understand_v02max is invalid. Received: " + obj);
            case 157:
                if ("layout/fragment_understand_vitality_0".equals(obj)) {
                    return new jma(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_understand_vitality is invalid. Received: " + obj);
            case 158:
                if ("layout/fragment_vitality_day_0".equals(obj)) {
                    return new wma(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_vitality_day is invalid. Received: " + obj);
            case 159:
                if ("layout/fragment_vo2max_day_0".equals(obj)) {
                    return new yma(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_vo2max_day is invalid. Received: " + obj);
            case 160:
                if ("layout/fragment_vo2max_month_0".equals(obj)) {
                    return new ana(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_vo2max_month is invalid. Received: " + obj);
            case 161:
                if ("layout/fragment_vo2max_month_item_0".equals(obj)) {
                    return new cna(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_vo2max_month_item is invalid. Received: " + obj);
            case 162:
                if ("layout/fragment_vo2max_week_0".equals(obj)) {
                    return new ena(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_vo2max_week is invalid. Received: " + obj);
            case 163:
                if ("layout/fragment_vo2max_week_item_0".equals(obj)) {
                    return new gna(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_vo2max_week_item is invalid. Received: " + obj);
            case 164:
                if ("layout/fragment_weight_add_0".equals(obj)) {
                    return new kna(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_weight_add is invalid. Received: " + obj);
            case 165:
                if ("layout/fragment_weight_body_indicator_0".equals(obj)) {
                    return new mna(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_weight_body_indicator is invalid. Received: " + obj);
            case 166:
                if ("layout/fragment_weight_day_0".equals(obj)) {
                    return new ona(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_weight_day is invalid. Received: " + obj);
            case 167:
                if ("layout/fragment_weight_day_item_0".equals(obj)) {
                    return new qna(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_weight_day_item is invalid. Received: " + obj);
            case 168:
                if ("layout/fragment_weight_day_r_item_0".equals(obj)) {
                    return new sna(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_weight_day_r_item is invalid. Received: " + obj);
            case 169:
                if ("layout/fragment_weight_index_item_0".equals(obj)) {
                    return new una(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_weight_index_item is invalid. Received: " + obj);
            case 170:
                if ("layout/fragment_weight_statistic_0".equals(obj)) {
                    return new wna(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for fragment_weight_statistic is invalid. Received: " + obj);
            case 171:
                if ("layout/health_activity_curse_0".equals(obj)) {
                    return new qnb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_activity_curse is invalid. Received: " + obj);
            case 172:
                if ("layout/health_activity_curse_history_0".equals(obj)) {
                    return new snb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_activity_curse_history is invalid. Received: " + obj);
            case 173:
                if ("layout/health_activity_recognize_setting_0".equals(obj)) {
                    return new unb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_activity_recognize_setting is invalid. Received: " + obj);
            case 174:
                if ("layout-large/health_activity_share_calo_consum_0".equals(obj)) {
                    return new xnb(rk5Var, view);
                }
                if ("layout-small/health_activity_share_calo_consum_0".equals(obj)) {
                    return new ynb(rk5Var, view);
                }
                if ("layout/health_activity_share_calo_consum_0".equals(obj)) {
                    return new wnb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_activity_share_calo_consum is invalid. Received: " + obj);
            case 175:
                if ("layout/health_activity_share_sport_target_0".equals(obj)) {
                    return new aob(rk5Var, view);
                }
                if ("layout-sw600dp-land/health_activity_share_sport_target_0".equals(obj)) {
                    return new bob(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_activity_share_sport_target is invalid. Received: " + obj);
            case 176:
                if ("layout/health_activity_sleep_rhythm_calendar_0".equals(obj)) {
                    return new dob(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_activity_sleep_rhythm_calendar is invalid. Received: " + obj);
            case 177:
                if ("layout/health_banner_card_set_0".equals(obj)) {
                    return new hob(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_banner_card_set is invalid. Received: " + obj);
            case 178:
                if ("layout/health_check_layout_expandable_data_0".equals(obj)) {
                    return new tob(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_check_layout_expandable_data is invalid. Received: " + obj);
            case 179:
                if ("layout/health_common_custom_title_layout_0".equals(obj)) {
                    return new npb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_common_custom_title_layout is invalid. Received: " + obj);
            case 180:
                if ("layout/health_curse_activity_reset_0".equals(obj)) {
                    return new hsb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_curse_activity_reset is invalid. Received: " + obj);
            case 181:
                if ("layout/health_curse_activity_set_0".equals(obj)) {
                    return new jsb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_curse_activity_set is invalid. Received: " + obj);
            case 182:
                if ("layout/health_curse_data_holder_0".equals(obj)) {
                    return new lsb(rk5Var, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for health_curse_data_holder is invalid. Received: " + obj);
            case SportReportBaseParser.ReportType.entryTime /* 183 */:
                if ("layout/health_curse_edit_0".equals(obj)) {
                    return new nsb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_curse_edit is invalid. Received: " + obj);
            case SportReportBaseParser.ReportType.exitTime /* 184 */:
                if ("layout/health_curse_info_0".equals(obj)) {
                    return new psb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_curse_info is invalid. Received: " + obj);
            case 185:
                if ("layout/health_curse_known_0".equals(obj)) {
                    return new rsb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_curse_known is invalid. Received: " + obj);
            case SportReportBaseParser.ReportType.avgDivingDepth /* 186 */:
                if ("layout/health_curse_layout_record_0".equals(obj)) {
                    return new tsb(rk5Var, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for health_curse_layout_record is invalid. Received: " + obj);
            case SportReportBaseParser.ReportType.avgAscentRate /* 187 */:
                if ("layout/health_curse_layout_sign_0".equals(obj)) {
                    return new vsb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_curse_layout_sign is invalid. Received: " + obj);
            case SportReportBaseParser.ReportType.avgDescentRate /* 188 */:
                if ("layout/health_curse_layout_symptom_view_0".equals(obj)) {
                    return new xsb(rk5Var, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for health_curse_layout_symptom_view is invalid. Received: " + obj);
            case SportReportBaseParser.ReportType.descentCount /* 189 */:
                if ("layout/health_curse_list_0".equals(obj)) {
                    return new zsb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_curse_list is invalid. Received: " + obj);
            case SportReportBaseParser.ReportType.maxWaterTemperature /* 190 */:
                if ("layout/health_curse_month_0".equals(obj)) {
                    return new btb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_curse_month is invalid. Received: " + obj);
            case SportReportBaseParser.ReportType.minWaterTemperature /* 191 */:
                if ("layout/health_curse_notice_card_view_0".equals(obj)) {
                    return new dtb(rk5Var, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for health_curse_notice_card_view is invalid. Received: " + obj);
            case 192:
                if ("layout/health_curse_record_item_0".equals(obj)) {
                    return new ftb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_curse_record_item is invalid. Received: " + obj);
            case SportReportBaseParser.ReportType.divingOTU /* 193 */:
                if ("layout/health_curse_reset_card_view_0".equals(obj)) {
                    return new htb(rk5Var, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for health_curse_reset_card_view is invalid. Received: " + obj);
            case SportReportBaseParser.ReportType.divingCNS /* 194 */:
                if ("layout/health_curse_set_view_0".equals(obj)) {
                    return new jtb(rk5Var, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for health_curse_set_view is invalid. Received: " + obj);
            case SportReportBaseParser.ReportType.oxygenPartialPressureThreshold /* 195 */:
                if ("layout/health_curse_setting_0".equals(obj)) {
                    return new ltb(rk5Var, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for health_curse_setting is invalid. Received: " + obj);
            case SportReportBaseParser.ReportType.oxygenConcentration /* 196 */:
                if ("layout-sw600dp-port/health_curse_symptom_holder_0".equals(obj)) {
                    return new ptb(rk5Var, new View[]{view});
                }
                if ("layout/health_curse_symptom_holder_0".equals(obj)) {
                    return new ntb(rk5Var, new View[]{view});
                }
                if ("layout-sw600dp-land/health_curse_symptom_holder_0".equals(obj)) {
                    return new otb(rk5Var, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for health_curse_symptom_holder is invalid. Received: " + obj);
            case SportReportBaseParser.ReportType.noFlyDuration /* 197 */:
                if ("layout/health_curse_temp_view_holder_0".equals(obj)) {
                    return new rtb(rk5Var, new View[]{view});
                }
                throw new IllegalArgumentException("The tag for health_curse_temp_view_holder is invalid. Received: " + obj);
            case SportReportBaseParser.ReportType.algorithmDataSource /* 198 */:
                if ("layout/health_fragment_all_record_page_0".equals(obj)) {
                    return new bub(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_all_record_page is invalid. Received: " + obj);
            case 199:
                if ("layout/health_fragment_blood_glucose_filtered_records_0".equals(obj)) {
                    return new dub(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_blood_glucose_filtered_records is invalid. Received: " + obj);
            case 200:
                if ("layout/health_fragment_curse_bar_chart_0".equals(obj)) {
                    return new fub(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_curse_bar_chart is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    @Override // defpackage.qk5
    public List<qk5> collectDependencies() {
        ArrayList arrayList = new ArrayList(69);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.example.statistics.export.DataBinderMapperImpl());
        arrayList.add(new com.example.user_info_export.DataBinderMapperImpl());
        arrayList.add(new com.fitness.banner.export.DataBinderMapperImpl());
        arrayList.add(new com.fitness.permission.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.fitness.temperature.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.course.export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.huami_export.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.protocol.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.qrcode.DataBinderMapperImpl());
        arrayList.add(new com.mi.health.uri_parser.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.data.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.parser.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.fitness.sync.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fit.sport_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.account.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.active.pk.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.auto.start.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.banner.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.blood_sugar_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.cache.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.chart.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.common.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.component.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.config.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.crypt.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.database.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.contact.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.device.manager.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.devicesettings.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.eco.connect.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.eco.device.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.electronic.scale.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.feedback.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.function.device.manager.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.health.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.heartrate.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.instance.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.login_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.main.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.medal.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.mine.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.miot.core.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.motion.recognition.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.net.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.privacy.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.relativecare.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.res.preload.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.research.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.resource.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.rn.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.schema.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sensor.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.service.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.settingitem.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.share.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sleep.trace.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sport_eco_manager_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.sport_manager_export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.stand.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.trail.export.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.ui.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.webview.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.fitness.widget.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.gpsalgorithm.DataBinderMapperImpl());
        arrayList.add(new com.xiaomi.wearable.yrn.export.DataBinderMapperImpl());
        arrayList.add(new services.reminder.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // defpackage.qk5
    public String convertBrIdToString(int i) {
        return a.f12221a.get(i);
    }

    public final ViewDataBinding e(rk5 rk5Var, View view, int i, Object obj) {
        switch (i) {
            case 201:
                if ("layout/health_fragment_curse_notify_0".equals(obj)) {
                    return new hub(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_curse_notify is invalid. Received: " + obj);
            case 202:
                if ("layout/health_fragment_deep_shallow_sleep_detection_setting_0".equals(obj)) {
                    return new jub(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_deep_shallow_sleep_detection_setting is invalid. Received: " + obj);
            case 203:
                if ("layout/health_fragment_ecg_account_auth_login_0".equals(obj)) {
                    return new lub(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_ecg_account_auth_login is invalid. Received: " + obj);
            case 204:
                if ("layout/health_fragment_ecg_analyze_service_auth_0".equals(obj)) {
                    return new nub(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_ecg_analyze_service_auth is invalid. Received: " + obj);
            case 205:
                if ("layout/health_fragment_ecg_checking_quailty_0".equals(obj)) {
                    return new pub(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_ecg_checking_quailty is invalid. Received: " + obj);
            case 206:
                if ("layout/health_fragment_ecg_filtered_records_0".equals(obj)) {
                    return new rub(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_ecg_filtered_records is invalid. Received: " + obj);
            case 207:
                if ("layout/health_fragment_ecg_layout_0".equals(obj)) {
                    return new tub(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_ecg_layout is invalid. Received: " + obj);
            case 208:
                if ("layout/health_fragment_ecg_submit_analyze_result_0".equals(obj)) {
                    return new vub(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_ecg_submit_analyze_result is invalid. Received: " + obj);
            case 209:
                if ("layout/health_fragment_hrm_filtered_records_0".equals(obj)) {
                    return new xub(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_hrm_filtered_records is invalid. Received: " + obj);
            case 210:
                if ("layout/health_fragment_resting_hrm_0".equals(obj)) {
                    return new zub(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_resting_hrm is invalid. Received: " + obj);
            case 211:
                if ("layout/health_fragment_select_ecg_to_analyze_layout_0".equals(obj)) {
                    return new bvb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_select_ecg_to_analyze_layout is invalid. Received: " + obj);
            case 212:
                if ("layout/health_fragment_share_sport_target_0".equals(obj)) {
                    return new dvb(rk5Var, view);
                }
                if ("layout-sw600dp-land/health_fragment_share_sport_target_0".equals(obj)) {
                    return new evb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_share_sport_target is invalid. Received: " + obj);
            case 213:
                if ("layout-sw600dp-land/health_fragment_share_sport_target_month_0".equals(obj)) {
                    return new hvb(rk5Var, view);
                }
                if ("layout/health_fragment_share_sport_target_month_0".equals(obj)) {
                    return new gvb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_share_sport_target_month is invalid. Received: " + obj);
            case 214:
                if ("layout/health_fragment_sleep_diary_medication_update_0".equals(obj)) {
                    return new jvb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_sleep_diary_medication_update is invalid. Received: " + obj);
            case 215:
                if ("layout/health_fragment_sleep_disorder_diary_note_0".equals(obj)) {
                    return new lvb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_sleep_disorder_diary_note is invalid. Received: " + obj);
            case 216:
                if ("layout/health_fragment_sleep_permission_setting_0".equals(obj)) {
                    return new nvb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_sleep_permission_setting is invalid. Received: " + obj);
            case 217:
                if ("layout/health_fragment_sleep_phythm_all_fragment_0".equals(obj)) {
                    return new pvb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_sleep_phythm_all_fragment is invalid. Received: " + obj);
            case 218:
                if ("layout/health_fragment_sleep_phythm_all_sleep_chat_fragment_0".equals(obj)) {
                    return new rvb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_sleep_phythm_all_sleep_chat_fragment is invalid. Received: " + obj);
            case 219:
                if ("layout/health_fragment_sleep_phythm_chat_list_view_0".equals(obj)) {
                    return new tvb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_sleep_phythm_chat_list_view is invalid. Received: " + obj);
            case 220:
                if ("layout/health_fragment_sleep_phythm_detail_0".equals(obj)) {
                    return new vvb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_sleep_phythm_detail is invalid. Received: " + obj);
            case 221:
                if ("layout/health_fragment_sleep_phythm_detail_up_to_remote_0".equals(obj)) {
                    return new xvb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_sleep_phythm_detail_up_to_remote is invalid. Received: " + obj);
            case 222:
                if ("layout/health_fragment_sleep_phythm_detail_up_to_remote_suc_0".equals(obj)) {
                    return new zvb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_sleep_phythm_detail_up_to_remote_suc is invalid. Received: " + obj);
            case SportReportBaseParser.ReportType.targetValueNumber /* 223 */:
                if ("layout/health_fragment_sleep_rhythm_support_devices_list_0".equals(obj)) {
                    return new bwb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_sleep_rhythm_support_devices_list is invalid. Received: " + obj);
            case SportReportBaseParser.ReportType.avgFreq /* 224 */:
                if ("layout/health_fragment_sleep_rhythm_support_devices_list_item_0".equals(obj)) {
                    return new dwb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_sleep_rhythm_support_devices_list_item is invalid. Received: " + obj);
            case SportReportBaseParser.ReportType.maxFreq /* 225 */:
                if ("layout/health_fragment_sleep_setting_0".equals(obj)) {
                    return new fwb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_sleep_setting is invalid. Received: " + obj);
            case 226:
                if ("layout/health_fragment_sleep_snore_detection_setting_0".equals(obj)) {
                    return new hwb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_sleep_snore_detection_setting is invalid. Received: " + obj);
            case 227:
                if ("layout/health_fragment_spo2_filtered_records_0".equals(obj)) {
                    return new jwb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_spo2_filtered_records is invalid. Received: " + obj);
            case 228:
                if ("layout/health_fragment_temp_trend_support_devices_list_0".equals(obj)) {
                    return new lwb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_fragment_temp_trend_support_devices_list is invalid. Received: " + obj);
            case 229:
                if ("layout/health_hearing_environmental_noise_0".equals(obj)) {
                    return new owb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_hearing_environmental_noise is invalid. Received: " + obj);
            case 230:
                if ("layout/health_home_card_common_title_0".equals(obj)) {
                    return new rwb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_home_card_common_title is invalid. Received: " + obj);
            case ErrorCode.ERROR_SP_NOTICE_NOT_READY /* 231 */:
                if ("layout/health_item_sleep_short_segment_0".equals(obj)) {
                    return new bxb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_item_sleep_short_segment is invalid. Received: " + obj);
            case ErrorCode.ERROR_SP_NOTICE_INCOMPATIBLE /* 232 */:
                if ("layout/health_layout_card_data_item_0".equals(obj)) {
                    return new nxb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_card_data_item is invalid. Received: " + obj);
            case 233:
                if ("layout/health_layout_card_indicator_style_0".equals(obj)) {
                    return new pxb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_card_indicator_style is invalid. Received: " + obj);
            case 234:
                if ("layout/health_layout_common_card_icon_title_0".equals(obj)) {
                    return new rxb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_common_card_icon_title is invalid. Received: " + obj);
            case 235:
                if ("layout/health_layout_data_item_footer_v2_0".equals(obj)) {
                    return new txb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_data_item_footer_v2 is invalid. Received: " + obj);
            case 236:
                if ("layout/health_layout_ecg_analyze_entrance_0".equals(obj)) {
                    return new vxb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_ecg_analyze_entrance is invalid. Received: " + obj);
            case 237:
                if ("layout/health_layout_ecg_snippet_0".equals(obj)) {
                    return new xxb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_ecg_snippet is invalid. Received: " + obj);
            case 238:
                if ("layout/health_layout_expandable_common_data_0".equals(obj)) {
                    return new zxb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_expandable_common_data is invalid. Received: " + obj);
            case 239:
                if ("layout/health_layout_expandable_common_header_0".equals(obj)) {
                    return new byb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_expandable_common_header is invalid. Received: " + obj);
            case 240:
                if ("layout/health_layout_show_all_fragment_0".equals(obj)) {
                    return new dyb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_show_all_fragment is invalid. Received: " + obj);
            case 241:
                if ("layout/health_layout_sleep_animal_collect_progress_0".equals(obj)) {
                    return new fyb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_sleep_animal_collect_progress is invalid. Received: " + obj);
            case 242:
                if ("layout/health_layout_sleep_animal_floating_0".equals(obj)) {
                    return new hyb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_sleep_animal_floating is invalid. Received: " + obj);
            case 243:
                if ("layout/health_layout_sleep_animal_image_0".equals(obj)) {
                    return new jyb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_sleep_animal_image is invalid. Received: " + obj);
            case 244:
                if ("layout/health_layout_sleep_animal_report_list_0".equals(obj)) {
                    return new lyb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_sleep_animal_report_list is invalid. Received: " + obj);
            case 245:
                if ("layout/health_layout_sleep_animal_schedule_suggest_0".equals(obj)) {
                    return new nyb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_sleep_animal_schedule_suggest is invalid. Received: " + obj);
            case 246:
                if ("layout/health_layout_sleep_day_breath_quality_v2_0".equals(obj)) {
                    return new pyb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_sleep_day_breath_quality_v2 is invalid. Received: " + obj);
            case 247:
                if ("layout/health_layout_sleep_day_heart_rate_v2_0".equals(obj)) {
                    return new ryb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_sleep_day_heart_rate_v2 is invalid. Received: " + obj);
            case 248:
                if ("layout/health_layout_sleep_day_spo2_v2_0".equals(obj)) {
                    return new tyb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_sleep_day_spo2_v2 is invalid. Received: " + obj);
            case 249:
                if ("layout/health_layout_sleep_insight_continuity_report_0".equals(obj)) {
                    return new vyb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_sleep_insight_continuity_report is invalid. Received: " + obj);
            case 250:
                if ("layout/health_layout_sleep_insight_day_nap_report_0".equals(obj)) {
                    return new xyb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_sleep_insight_day_nap_report is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    public final ViewDataBinding f(rk5 rk5Var, View view, int i, Object obj) {
        switch (i) {
            case VibrateModeSetViewModel.DEFAULT_BBJI /* 251 */:
                if ("layout/health_layout_sleep_insight_schedule_report_0".equals(obj)) {
                    return new zyb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_sleep_insight_schedule_report is invalid. Received: " + obj);
            case 252:
                if ("layout/health_layout_sleep_insight_strength_report_0".equals(obj)) {
                    return new bzb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_sleep_insight_strength_report is invalid. Received: " + obj);
            case 253:
                if ("layout/health_layout_sleep_insight_stress_report_0".equals(obj)) {
                    return new dzb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_sleep_insight_stress_report is invalid. Received: " + obj);
            case 254:
                if ("layout/health_layout_sleep_rhythm_diary_record_list_item_0".equals(obj)) {
                    return new fzb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_sleep_rhythm_diary_record_list_item is invalid. Received: " + obj);
            case 255:
                if ("layout/health_layout_sleep_rhythm_diary_record_list_view_0".equals(obj)) {
                    return new hzb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_sleep_rhythm_diary_record_list_view is invalid. Received: " + obj);
            case 256:
                if ("layout/health_layout_sleep_rhythm_diary_record_view_0".equals(obj)) {
                    return new jzb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_sleep_rhythm_diary_record_view is invalid. Received: " + obj);
            case 257:
                if ("layout/health_layout_sleep_rhythm_record_item_0".equals(obj)) {
                    return new lzb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_sleep_rhythm_record_item is invalid. Received: " + obj);
            case SportSummary.VERSION_102 /* 258 */:
                if ("layout/health_layout_sleep_wm_regular_0".equals(obj)) {
                    return new nzb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_sleep_wm_regular is invalid. Received: " + obj);
            case SportSummary.VERSION_103 /* 259 */:
                if ("layout/health_layout_weight_body_composition_0".equals(obj)) {
                    return new pzb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_weight_body_composition is invalid. Received: " + obj);
            case 260:
                if ("layout/health_layout_weight_body_score_0".equals(obj)) {
                    return new rzb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_weight_body_score is invalid. Received: " + obj);
            case SportSummary.VERSION_105 /* 261 */:
                if ("layout/health_layout_weight_control_suggest_0".equals(obj)) {
                    return new tzb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_weight_control_suggest is invalid. Received: " + obj);
            case 262:
                if ("layout/health_layout_weight_day_detail_0".equals(obj)) {
                    return new vzb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_weight_day_detail is invalid. Received: " + obj);
            case 263:
                if ("layout/health_layout_weight_focus_index_0".equals(obj)) {
                    return new xzb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_weight_focus_index is invalid. Received: " + obj);
            case 264:
                if ("layout/health_layout_weight_index_evaluation_0".equals(obj)) {
                    return new zzb(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_weight_index_evaluation is invalid. Received: " + obj);
            case 265:
                if ("layout/health_layout_weight_segmental_0".equals(obj)) {
                    return new b0c(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_layout_weight_segmental is invalid. Received: " + obj);
            case 266:
                if ("layout/health_n60_blood_pressure_about_0".equals(obj)) {
                    return new l0c(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_n60_blood_pressure_about is invalid. Received: " + obj);
            case 267:
                if ("layout/health_n60_ecg_about_0".equals(obj)) {
                    return new n0c(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_n60_ecg_about is invalid. Received: " + obj);
            case 268:
                if ("layout/health_remind_select_count_spinner_0".equals(obj)) {
                    return new u0c(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_remind_select_count_spinner is invalid. Received: " + obj);
            case 269:
                if ("layout/health_rhythm_chart_wait_data_view_0".equals(obj)) {
                    return new x0c(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_rhythm_chart_wait_data_view is invalid. Received: " + obj);
            case 270:
                if ("layout/health_sleep_analyze_item_layout_0".equals(obj)) {
                    return new k1c(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_sleep_analyze_item_layout is invalid. Received: " + obj);
            case 271:
                if ("layout/health_sleep_animal_collect_item_0".equals(obj)) {
                    return new m1c(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_sleep_animal_collect_item is invalid. Received: " + obj);
            case 272:
                if ("layout/health_sleep_animal_schedule_item_0".equals(obj)) {
                    return new o1c(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_sleep_animal_schedule_item is invalid. Received: " + obj);
            case 273:
                if ("layout/health_sleep_item_data_source_0".equals(obj)) {
                    return new q1c(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_sleep_item_data_source is invalid. Received: " + obj);
            case 274:
                if ("layout/health_sleep_rhythm_guide_item_0".equals(obj)) {
                    return new s1c(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_sleep_rhythm_guide_item is invalid. Received: " + obj);
            case 275:
                if ("layout/health_sleep_rhythm_indicator_layout_0".equals(obj)) {
                    return new u1c(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_sleep_rhythm_indicator_layout is invalid. Received: " + obj);
            case 276:
                if ("layout/health_sleep_rhythm_monitor_setting_fragment_0".equals(obj)) {
                    return new w1c(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_sleep_rhythm_monitor_setting_fragment is invalid. Received: " + obj);
            case 277:
                if ("layout/health_sleep_rhythm_month_item_0".equals(obj)) {
                    return new y1c(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_sleep_rhythm_month_item is invalid. Received: " + obj);
            case 278:
                if ("layout/health_sleep_rhythm_remind_setting_fragment_0".equals(obj)) {
                    return new a2c(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_sleep_rhythm_remind_setting_fragment is invalid. Received: " + obj);
            case 279:
                if ("layout/health_temperature_trend_empty_holder_0".equals(obj)) {
                    return new f2c(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_temperature_trend_empty_holder is invalid. Received: " + obj);
            case 280:
                if ("layout/health_triplet_item_with_logo_0".equals(obj)) {
                    return new k2c(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_triplet_item_with_logo is invalid. Received: " + obj);
            case 281:
                if ("layout/health_weight_evaluation_detail_item_0".equals(obj)) {
                    return new a4c(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_weight_evaluation_detail_item is invalid. Received: " + obj);
            case 282:
                if ("layout/health_weight_evaluation_item_0".equals(obj)) {
                    return new c4c(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for health_weight_evaluation_item is invalid. Received: " + obj);
            case 283:
                if ("layout/item_blood_pressure_distribution_0".equals(obj)) {
                    return new jnd(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for item_blood_pressure_distribution is invalid. Received: " + obj);
            case 284:
                if ("layout/item_data_records_0".equals(obj)) {
                    return new lnd(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for item_data_records is invalid. Received: " + obj);
            case 285:
                if ("layout/item_sleep_interfere_day_0".equals(obj)) {
                    return new bod(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for item_sleep_interfere_day is invalid. Received: " + obj);
            case 286:
                if ("layout/item_sleep_interfere_day_task_0".equals(obj)) {
                    return new dod(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for item_sleep_interfere_day_task is invalid. Received: " + obj);
            case 287:
                if ("layout/item_sleep_interfere_history_0".equals(obj)) {
                    return new fod(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for item_sleep_interfere_history is invalid. Received: " + obj);
            case 288:
                if ("layout/item_sleep_interfere_summary_0".equals(obj)) {
                    return new hod(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for item_sleep_interfere_summary is invalid. Received: " + obj);
            case 289:
                if ("layout/item_time_data_detail_0".equals(obj)) {
                    return new vod(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for item_time_data_detail is invalid. Received: " + obj);
            case 290:
                if ("layout/layout_blood_pressure_data_title_view_0".equals(obj)) {
                    return new y6e(rk5Var, view);
                }
                if ("layout-large/layout_blood_pressure_data_title_view_0".equals(obj)) {
                    return new z6e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_blood_pressure_data_title_view is invalid. Received: " + obj);
            case 291:
                if ("layout/layout_common_icon_title_0".equals(obj)) {
                    return new b7e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_common_icon_title is invalid. Received: " + obj);
            case 292:
                if ("layout/layout_current_running_indicator_0".equals(obj)) {
                    return new h7e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_current_running_indicator is invalid. Received: " + obj);
            case 293:
                if ("layout/layout_data_item_0".equals(obj)) {
                    return new r7e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_data_item is invalid. Received: " + obj);
            case 294:
                if ("layout/layout_data_item_barchart_0".equals(obj)) {
                    return new l7e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_data_item_barchart is invalid. Received: " + obj);
            case 295:
                if ("layout/layout_data_item_barchart_for_pressure_0".equals(obj)) {
                    return new n7e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_data_item_barchart_for_pressure is invalid. Received: " + obj);
            case 296:
                if ("layout/layout_data_item_barchart_v2_0".equals(obj)) {
                    return new p7e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_data_item_barchart_v2 is invalid. Received: " + obj);
            case 297:
                if ("layout/layout_data_item_blood_glucose_0".equals(obj)) {
                    return new t7e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_data_item_blood_glucose is invalid. Received: " + obj);
            case 298:
                if ("layout/layout_data_item_linechart_v2_0".equals(obj)) {
                    return new v7e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_data_item_linechart_v2 is invalid. Received: " + obj);
            case 299:
                if ("layout/layout_data_item_progress_bar_0".equals(obj)) {
                    return new x7e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_data_item_progress_bar is invalid. Received: " + obj);
            case 300:
                if ("layout/layout_data_item_relative_0".equals(obj)) {
                    return new z7e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_data_item_relative is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    public final ViewDataBinding g(rk5 rk5Var, View view, int i, Object obj) {
        switch (i) {
            case 301:
                if ("layout/layout_data_login_info_0".equals(obj)) {
                    return new b8e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_data_login_info is invalid. Received: " + obj);
            case 302:
                if ("layout/layout_data_title_view_two_columns_0".equals(obj)) {
                    return new d8e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_data_title_view_two_columns is invalid. Received: " + obj);
            case 303:
                if ("layout/layout_edit_sleep_record_0".equals(obj)) {
                    return new n8e(rk5Var, view);
                }
                if ("layout-small/layout_edit_sleep_record_0".equals(obj)) {
                    return new o8e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_edit_sleep_record is invalid. Received: " + obj);
            case 304:
                if ("layout/layout_edit_temperature_0".equals(obj)) {
                    return new q8e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_edit_temperature is invalid. Received: " + obj);
            case 305:
                if ("layout/layout_energy_dwm_common_0".equals(obj)) {
                    return new a9e(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_energy_dwm_common is invalid. Received: " + obj);
            case 306:
                if ("layout/layout_hrm_dwm_common_0".equals(obj)) {
                    return new bae(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_hrm_dwm_common is invalid. Received: " + obj);
            case 307:
                if ("layout/layout_running_indicator_widget_0".equals(obj)) {
                    return new xae(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_running_indicator_widget is invalid. Received: " + obj);
            case 308:
                if ("layout/layout_sleep_day_animal_entrance_0".equals(obj)) {
                    return new kbe(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_sleep_day_animal_entrance is invalid. Received: " + obj);
            case 309:
                if ("layout/layout_sleep_duration_0".equals(obj)) {
                    return new mbe(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_sleep_duration is invalid. Received: " + obj);
            case 310:
                if ("layout/layout_sleep_efficiency_valid_detail_0".equals(obj)) {
                    return new obe(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_sleep_efficiency_valid_detail is invalid. Received: " + obj);
            case 311:
                if ("layout/layout_sleep_empty_0".equals(obj)) {
                    return new qbe(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_sleep_empty is invalid. Received: " + obj);
            case 312:
                if ("layout/layout_sleep_evaluation_0".equals(obj)) {
                    return new sbe(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_sleep_evaluation is invalid. Received: " + obj);
            case 313:
                if ("layout/layout_sleep_health_check_items_0".equals(obj)) {
                    return new ube(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_sleep_health_check_items is invalid. Received: " + obj);
            case 314:
                if ("layout/layout_sleep_interfere_create_entry_0".equals(obj)) {
                    return new wbe(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_sleep_interfere_create_entry is invalid. Received: " + obj);
            case 315:
                if ("layout/layout_sleep_interfere_day_entry_0".equals(obj)) {
                    return new ybe(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_sleep_interfere_day_entry is invalid. Received: " + obj);
            case 316:
                if ("layout/layout_sleep_land_detail_0".equals(obj)) {
                    return new ace(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_sleep_land_detail is invalid. Received: " + obj);
            case 317:
                if ("layout/layout_sleep_quality_score_0".equals(obj)) {
                    return new cce(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_sleep_quality_score is invalid. Received: " + obj);
            case 318:
                if ("layout/layout_sleep_regularity_header_0".equals(obj)) {
                    return new ece(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_sleep_regularity_header is invalid. Received: " + obj);
            case 319:
                if ("layout/layout_sleep_rhythm_calendar_record_0".equals(obj)) {
                    return new gce(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_sleep_rhythm_calendar_record is invalid. Received: " + obj);
            case 320:
                if ("layout/layout_sleep_rhythm_monitor_entrance_0".equals(obj)) {
                    return new ice(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_sleep_rhythm_monitor_entrance is invalid. Received: " + obj);
            case 321:
                if ("layout/layout_sleep_score_0".equals(obj)) {
                    return new kce(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_sleep_score is invalid. Received: " + obj);
            case 322:
                if ("layout/layout_sleep_wm_duration_0".equals(obj)) {
                    return new mce(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_sleep_wm_duration is invalid. Received: " + obj);
            case 323:
                if ("layout/layout_sleep_wm_efficiency_0".equals(obj)) {
                    return new oce(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_sleep_wm_efficiency is invalid. Received: " + obj);
            case 324:
                if ("layout/layout_sleep_wm_regularity_0".equals(obj)) {
                    return new qce(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_sleep_wm_regularity is invalid. Received: " + obj);
            case 325:
                if ("layout/layout_sleep_wm_score_0".equals(obj)) {
                    return new sce(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_sleep_wm_score is invalid. Received: " + obj);
            case 326:
                if ("layout/layout_spo2_dwm_common_0".equals(obj)) {
                    return new uce(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_spo2_dwm_common is invalid. Received: " + obj);
            case 327:
                if ("layout/layout_stand_dwm_common_0".equals(obj)) {
                    return new ide(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_stand_dwm_common is invalid. Received: " + obj);
            case 328:
                if ("layout/layout_step_dwm_common_0".equals(obj)) {
                    return new kde(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_step_dwm_common is invalid. Received: " + obj);
            case 329:
                if ("layout/layout_stress_dwm_common_0".equals(obj)) {
                    return new mde(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_stress_dwm_common is invalid. Received: " + obj);
            case 330:
                if ("layout/layout_training_suggestion_0".equals(obj)) {
                    return new tde(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_training_suggestion is invalid. Received: " + obj);
            case 331:
                if ("layout/layout_vo2max_wm_common_0".equals(obj)) {
                    return new yde(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for layout_vo2max_wm_common is invalid. Received: " + obj);
            case 332:
                if ("layout/main_activity_blood_pressure_home_0".equals(obj)) {
                    return new i1f(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for main_activity_blood_pressure_home is invalid. Received: " + obj);
            case 333:
                if ("layout/main_fragment_homepage_0".equals(obj)) {
                    return new u1f(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for main_fragment_homepage is invalid. Received: " + obj);
            case 334:
                if ("layout/sleep_interfere_report_empty_holder_0".equals(obj)) {
                    return new com(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for sleep_interfere_report_empty_holder is invalid. Received: " + obj);
            case 335:
                if ("layout/sleep_interfere_report_line_chart_0".equals(obj)) {
                    return new jom(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for sleep_interfere_report_line_chart is invalid. Received: " + obj);
            case 336:
                if ("layout/sleep_interfere_report_nap_duration_0".equals(obj)) {
                    return new lom(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for sleep_interfere_report_nap_duration is invalid. Received: " + obj);
            case 337:
                if ("layout/sleep_interpretation_card_0".equals(obj)) {
                    return new jpm(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for sleep_interpretation_card is invalid. Received: " + obj);
            case 338:
                if ("layout/trail_layout_three_target_medal_0".equals(obj)) {
                    return new aqp(rk5Var, view);
                }
                throw new IllegalArgumentException("The tag for trail_layout_three_target_medal is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View[] viewArr, int i) {
        int i2;
        if (viewArr != null && viewArr.length != 0 && (i2 = f12220a.get(i)) > 0) {
            Object tag = viewArr[0].getTag();
            if (tag == null) {
                throw new RuntimeException("view must have a tag");
            }
            if (i2 == 182) {
                if ("layout/health_curse_data_holder_0".equals(tag)) {
                    return new lsb(rk5Var, viewArr);
                }
                throw new IllegalArgumentException("The tag for health_curse_data_holder is invalid. Received: " + tag);
            }
            if (i2 == 186) {
                if ("layout/health_curse_layout_record_0".equals(tag)) {
                    return new tsb(rk5Var, viewArr);
                }
                throw new IllegalArgumentException("The tag for health_curse_layout_record is invalid. Received: " + tag);
            }
            if (i2 == 188) {
                if ("layout/health_curse_layout_symptom_view_0".equals(tag)) {
                    return new xsb(rk5Var, viewArr);
                }
                throw new IllegalArgumentException("The tag for health_curse_layout_symptom_view is invalid. Received: " + tag);
            }
            if (i2 == 191) {
                if ("layout/health_curse_notice_card_view_0".equals(tag)) {
                    return new dtb(rk5Var, viewArr);
                }
                throw new IllegalArgumentException("The tag for health_curse_notice_card_view is invalid. Received: " + tag);
            }
            switch (i2) {
                case SportReportBaseParser.ReportType.divingOTU /* 193 */:
                    if ("layout/health_curse_reset_card_view_0".equals(tag)) {
                        return new htb(rk5Var, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for health_curse_reset_card_view is invalid. Received: " + tag);
                case SportReportBaseParser.ReportType.divingCNS /* 194 */:
                    if ("layout/health_curse_set_view_0".equals(tag)) {
                        return new jtb(rk5Var, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for health_curse_set_view is invalid. Received: " + tag);
                case SportReportBaseParser.ReportType.oxygenPartialPressureThreshold /* 195 */:
                    if ("layout/health_curse_setting_0".equals(tag)) {
                        return new ltb(rk5Var, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for health_curse_setting is invalid. Received: " + tag);
                case SportReportBaseParser.ReportType.oxygenConcentration /* 196 */:
                    if ("layout-sw600dp-port/health_curse_symptom_holder_0".equals(tag)) {
                        return new ptb(rk5Var, viewArr);
                    }
                    if ("layout/health_curse_symptom_holder_0".equals(tag)) {
                        return new ntb(rk5Var, viewArr);
                    }
                    if ("layout-sw600dp-land/health_curse_symptom_holder_0".equals(tag)) {
                        return new otb(rk5Var, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for health_curse_symptom_holder is invalid. Received: " + tag);
                case SportReportBaseParser.ReportType.noFlyDuration /* 197 */:
                    if ("layout/health_curse_temp_view_holder_0".equals(tag)) {
                        return new rtb(rk5Var, viewArr);
                    }
                    throw new IllegalArgumentException("The tag for health_curse_temp_view_holder is invalid. Received: " + tag);
            }
        }
        return null;
    }

    @Override // defpackage.qk5
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f12222a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // defpackage.qk5
    public ViewDataBinding getDataBinder(rk5 rk5Var, View view, int i) {
        int i2 = f12220a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch ((i2 - 1) / 50) {
                case 0:
                    return a(rk5Var, view, i2, tag);
                case 1:
                    return b(rk5Var, view, i2, tag);
                case 2:
                    return c(rk5Var, view, i2, tag);
                case 3:
                    return d(rk5Var, view, i2, tag);
                case 4:
                    return e(rk5Var, view, i2, tag);
                case 5:
                    return f(rk5Var, view, i2, tag);
                case 6:
                    return g(rk5Var, view, i2, tag);
                default:
                    return null;
            }
        }
        throw new RuntimeException("view must have a tag");
    }
}
