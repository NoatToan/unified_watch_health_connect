package com.huawei.ui.homehealth.runcard.trackfragments.models;

import android.content.Context;
import android.content.res.Resources;
import com.huawei.ui.homehealth.R;
import defpackage.syx;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class SportNounChildData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Resources f25968a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String[] f25970c;
    private Context e;
    private int[] j = {R.string.IDS_train_activation_aerobic, R.string.IDS_train_maintain_aerobic, R.string.IDS_train_improve_aerobic, R.string.IDS_train_enhanced_aerobic, R.string.IDS_train_challenge_message};
    private int[] h = {R.string.IDS_train_activation_anaerobic, R.string.IDS_train_maintain_anaerobic, R.string.IDS_train_improve_anaerobic, R.string.IDS_train_enhanced_anaerobic, R.string.IDS_train_challenge_message};
    private int[] d = {R.string.IDS_motiontrack_recovery_effect_aerobic_explain, R.string.IDS_motiontrack_maintain_effect_aerobic_explain, R.string.IDS_motiontrack_improve_effect_aerobic_explain, R.string.IDS_motiontrack_enhanced_effect_aerobic_explain, R.string.IDS_motiontrack_excessive_exercise_explain};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f25969b = {R.string.IDS_motiontrack_recovery_effect_anaerobic_explain, R.string.IDS_motiontrack_maintain_effect_anaerobic_explain, R.string.IDS_motiontrack_improve_effect_anaerobic_explain, R.string.IDS_motiontrack_enhanced_effect_anaerobic_explain, R.string.IDS_motiontrack_excessive_exercise_explain};

    public SportNounChildData() {
    }

    public SportNounChildData(Context context) {
        this.e = context;
        this.f25968a = context.getResources();
    }

    public List<syx> b() {
        String[] strArr = {this.f25968a.getString(R.string.IDS_resting_heart_rate_string), this.f25968a.getString(R.string.IDS_plugin_motion_track_show_detail_max_heartrate), this.f25968a.getString(R.string.IDS_motiontrack_res_heart_rate)};
        String[] strArr2 = {String.format(this.f25968a.getString(R.string.IDS_resting_heart_rate_details_string_new), 60, 100, 60), this.f25968a.getString(R.string.IDS_sport_noun_explain_xinlv_zuidaxinlv_content), this.f25968a.getString(R.string.IDS_motiontrack_res_heart_rate_des)};
        ArrayList arrayList = new ArrayList(3);
        c(arrayList, strArr, strArr2);
        return arrayList;
    }

    public List<syx> i() {
        String[] strArr = {this.f25968a.getString(R.string.IDS_motiontrack_detail_fm_heart_bupin), this.f25968a.getString(R.string.IDS_motiontrack_show_detail_pace)};
        String[] strArr2 = {String.format(this.f25968a.getString(R.string.IDS_sport_noun_explain_bufa_bupin_content), 180), this.f25968a.getString(R.string.IDS_sport_noun_explain_bufa_bufu_content)};
        ArrayList arrayList = new ArrayList(2);
        c(arrayList, strArr, strArr2);
        return arrayList;
    }

    public List<syx> h() {
        String[] strArr = {this.f25968a.getString(R.string.IDS_running_posture_ground_contact_time), this.f25968a.getString(R.string.IDS_aw_version2_duration_of_passage), this.f25968a.getString(R.string.IDS_motiontrack_ground_to_air_ratio), this.f25968a.getString(R.string.IDS_running_posture_ground_impact_acceleration), this.f25968a.getString(R.string.IDS_sport_noun_explain_paobuzhitai_waifanfudu_title), this.f25968a.getString(R.string.IDS_sport_noun_explain_paobuzhitai_baidongjiaodu_title), this.f25968a.getString(R.string.IDS_running_posture_avg_foot_strike_pattern)};
        String[] strArr2 = {String.format(this.f25968a.getString(R.string.IDS_sport_noun_explain_paobuzhitai_chudishijian_content), 200), String.format(this.f25968a.getString(R.string.IDS_hwh_runningstyle_hang_time_definition), 125), String.format(this.f25968a.getString(R.string.IDS_hwh_runningstyle_ground_hang_time_rate_definition), Float.valueOf(1.5f)), String.format(this.f25968a.getString(R.string.IDS_sport_noun_explain_paobuzhitai_zhuodichongji_content), 6, 20), String.format(this.f25968a.getString(R.string.IDS_sport_noun_explain_paobuzhitai_waifanfudu_content), 5, 25), String.format(this.f25968a.getString(R.string.IDS_sport_noun_explain_paobuzhitai_baidongjiaodu_content), 70, 140), this.f25968a.getString(R.string.IDS_sport_noun_explain_paobuzhitai_zhuodifangshi_content)};
        ArrayList arrayList = new ArrayList(7);
        c(arrayList, strArr, strArr2);
        return arrayList;
    }

    public List<syx> c(int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 0) {
            e(arrayList);
        } else {
            c(arrayList);
        }
        a(arrayList);
        a(arrayList, i);
        return arrayList;
    }

    public List<syx> o() {
        ArrayList arrayList = new ArrayList();
        e(arrayList);
        c(arrayList);
        a(arrayList);
        a(arrayList, 1);
        return arrayList;
    }

    private List<syx> e(List<syx> list) {
        String[] strArrC = c(this.d);
        String[] strArrC2 = c(this.f25969b);
        b(list, new String[]{this.f25968a.getString(R.string.IDS_sport_noun_explain_xunlianbiaoxian_youyang_title), this.f25968a.getString(R.string.IDS_pluginmotiontrack_anaerobic_exercise)}, e(strArrC, this.f25968a.getString(R.string.IDS_sport_noun_explain_xunlianbiaoxian_youyang_content)), e(strArrC2, this.f25968a.getString(R.string.IDS_sport_noun_explain_xunlianbiaoxian_wuyang_content)));
        return list;
    }

    private List<syx> c(List<syx> list) {
        String[] strArrC = c(this.j);
        String[] strArrC2 = c(this.h);
        b(list, new String[]{this.f25968a.getString(R.string.IDS_aerobic_train_pressure), this.f25968a.getString(R.string.IDS_anaerobic_train_pressure)}, e(strArrC, this.f25968a.getString(R.string.IDS_aerobic_pressure_message)), e(strArrC2, this.f25968a.getString(R.string.IDS_anaerobic_pressure_message)));
        return list;
    }

    private String[] c(int[] iArr) {
        String[] strArrM = m();
        String[] strArr = new String[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            if (i == iArr.length - 1) {
                strArr[i] = String.format(this.e.getString(iArr[i]), strArrM[i * 2]);
            } else {
                int i2 = i * 2;
                strArr[i] = String.format(this.e.getString(iArr[i]), strArrM[i2], strArrM[i2 + 1]);
            }
        }
        return strArr;
    }

    private List<syx> a(List<syx> list) {
        syx syxVar = new syx();
        syxVar.c(this.f25968a.getString(R.string.IDS_hwh_health_vo2max));
        syxVar.e(this.f25968a.getString(R.string.IDS_hwh_health_vo2max_explain));
        list.add(syxVar);
        return list;
    }

    private List<syx> a(List<syx> list, int i) {
        syx syxVar = new syx();
        syxVar.c(this.f25968a.getString(R.string.IDS_motiontrack_detail_retire));
        if (i == 0) {
            syxVar.e(this.f25968a.getString(R.string.IDS_sport_noun_explain_xunlianbiaoxian_huifushijian_content));
        } else {
            syxVar.e(this.f25968a.getString(R.string.IDS_training_recover_time));
        }
        list.add(syxVar);
        return list;
    }

    private String[] m() {
        String[] strArr = this.f25970c;
        if (strArr != null) {
            return strArr;
        }
        String[] strArr2 = new String[9];
        this.f25970c = strArr2;
        strArr2[0] = UnitUtil.e(1.0d, 1, 1);
        this.f25970c[1] = UnitUtil.e(1.9d, 1, 1);
        this.f25970c[2] = UnitUtil.e(2.0d, 1, 1);
        this.f25970c[3] = UnitUtil.e(2.9d, 1, 1);
        this.f25970c[4] = UnitUtil.e(3.0d, 1, 1);
        this.f25970c[5] = UnitUtil.e(3.9d, 1, 1);
        this.f25970c[6] = UnitUtil.e(4.0d, 1, 1);
        this.f25970c[7] = UnitUtil.e(4.9d, 1, 1);
        this.f25970c[8] = UnitUtil.e(5.0d, 1, 1);
        return this.f25970c;
    }

    private void b(List<syx> list, String[] strArr, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        c(list, strArr, new String[]{stringBuffer.toString(), stringBuffer2.toString()});
    }

    private StringBuffer e(String[] strArr, String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        for (String str2 : strArr) {
            stringBuffer.append("\\n");
            stringBuffer.append(str2);
        }
        return stringBuffer;
    }

    public List<syx> g() {
        String str;
        String[] strArr = {this.f25968a.getString(R.string.IDS_hwh_motiontrack_pull_times), this.f25968a.getString(R.string.IDS_hwh_motiontrack_pull_frequence), this.f25968a.getString(R.string.IDS_hwh_motiontrack_swim_SWOLF)};
        String string = this.f25968a.getString(R.string.IDS_hwh_motiontrack_stroketimes_info);
        String string2 = this.f25968a.getString(R.string.IDS_hwh_motiontrack_pullfrequence_info);
        if (UnitUtil.f()) {
            str = String.format(this.f25968a.getString(R.string.IDS_hwh_motiontrack_swolf_info), 50, this.f25968a.getQuantityString(R.plurals.IDS_hwh_motiontrack_unit_yd, 50));
        } else {
            str = String.format(this.f25968a.getString(R.string.IDS_hwh_motiontrack_swolf_info), 50, this.f25968a.getString(R.string.IDS_fitness_data_list_activity_meter_unit));
        }
        String[] strArr2 = {string, string2, str};
        ArrayList arrayList = new ArrayList(3);
        c(arrayList, strArr, strArr2);
        return arrayList;
    }

    public List<syx> d() {
        String[] strArr = {this.f25968a.getString(R.string.IDS_aw_version2_jump_height), this.f25968a.getString(R.string.IDS_aw_version2_duration_of_passage)};
        String[] strArr2 = {d(new String[]{this.f25968a.getString(R.string.IDS_aw_version2_jump_height_answer_1), this.f25968a.getString(R.string.IDS_aw_version2_jump_height_answer_2), String.format(this.f25968a.getString(R.string.IDS_aw_version2_jump_height_answer_3), 90)}), d(new String[]{this.f25968a.getString(R.string.IDS_aw_version2_jump_time_answer_1), this.f25968a.getString(R.string.IDS_aw_version2_jump_time_answer_2), String.format(this.f25968a.getString(R.string.IDS_aw_version2_jump_time_answer_3), 900)})};
        ArrayList arrayList = new ArrayList(2);
        c(arrayList, strArr, strArr2);
        return arrayList;
    }

    public List<syx> f() {
        String[] strArr = {this.f25968a.getString(R.string.IDS_hwh_motiontrack_tread_frequence)};
        String[] strArr2 = {this.f25968a.getString(R.string.IDS_hwh_motiontrack_treadfrequence_info)};
        ArrayList arrayList = new ArrayList(1);
        c(arrayList, strArr, strArr2);
        return arrayList;
    }

    public List<syx> c() {
        String[] strArr = {this.f25968a.getString(R.string.IDS_motiontrack_detail_fm_heart_bupin), this.f25968a.getString(R.string.IDS_hwh_motiontrack_tread_frequence)};
        String[] strArr2 = {this.f25968a.getString(R.string.IDS_hwh_motiontrack_stepfrequence_info), this.f25968a.getString(R.string.IDS_hwh_motiontrack_ellipticaltrainer_info)};
        ArrayList arrayList = new ArrayList(2);
        c(arrayList, strArr, strArr2);
        return arrayList;
    }

    public List<syx> e() {
        String[] strArr = {this.f25968a.getString(R.string.IDS_aw_version2_jump_score), this.f25968a.getString(R.string.IDS_aw_version2_burst_score), this.f25968a.getString(R.string.IDS_aw_version2_breakthrough_score), this.f25968a.getString(R.string.IDS_aw_version2_moving_score), this.f25968a.getString(R.string.IDS_aw_version2_sport_intensity_score), this.f25968a.getString(R.string.IDS_aw_version2_composite_score)};
        String[] strArr2 = {this.f25968a.getString(R.string.IDS_aw_version2_jump_score_info), this.f25968a.getString(R.string.IDS_aw_version2_burst_score_info), this.f25968a.getString(R.string.IDS_aw_version2_breakthrough_score_info), this.f25968a.getString(R.string.IDS_aw_version2_moving_score_info), this.f25968a.getString(R.string.IDS_aw_version2_sport_intensity_score_info), this.f25968a.getString(R.string.IDS_aw_version2_composite_score_info)};
        ArrayList arrayList = new ArrayList(6);
        c(arrayList, strArr, strArr2);
        return arrayList;
    }

    public List<syx> a() {
        String[] strArr = {this.f25968a.getString(R.string.IDS_pluginmotiontrack_detail_swing_rhythm), this.f25968a.getString(R.string.IDS_pluginmotiontrack_detail_back_swing_time), this.f25968a.getString(R.string.IDS_pluginmotiontrack_detail_down_swing_time), this.f25968a.getString(R.string.IDS_pluginmotiontrack_detail_swing_speed)};
        String[] strArr2 = {this.f25968a.getString(R.string.IDS_pluginmotiontrack_detail_swing_tempo_definition, 3, 1), this.f25968a.getString(R.string.IDS_pluginmotiontrack_detail_swing_back_time_definition), this.f25968a.getString(R.string.IDS_pluginmotiontrack_detail_swing_down_time_definition), this.f25968a.getString(R.string.IDS_pluginmotiontrack_detail_swing_speed_definition)};
        ArrayList arrayList = new ArrayList(4);
        c(arrayList, strArr, strArr2);
        return arrayList;
    }

    public List<syx> j() {
        String[] strArr = {this.f25968a.getString(R.string.IDS_rope_performance_indicator_endurance), this.f25968a.getString(R.string.IDS_rope_performance_indicator_speed_endurance), this.f25968a.getString(R.string.IDS_indoor_skipper_speed_number_minute), this.f25968a.getString(R.string.IDS_rope_performance_indicator_load), this.f25968a.getString(R.string.IDS_rope_performance_indicator_continuity)};
        String[] strArr2 = {this.f25968a.getString(R.string.IDS_rope_performance_indicator_endurance_des), this.f25968a.getString(R.string.IDS_rope_performance_indicator_speed_endurance_des), this.f25968a.getString(R.string.IDS_rope_performance_indicator_speed_des), this.f25968a.getString(R.string.IDS_rope_performance_indicator_load_des), this.f25968a.getString(R.string.IDS_rope_performance_indicator_continuity_des)};
        ArrayList arrayList = new ArrayList(5);
        c(arrayList, strArr, strArr2);
        return arrayList;
    }

    private String d(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        int length = strArr.length;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int i2 = length - 1;
            if (i < i2) {
                sb.append(strArr[i]);
                sb.append(System.lineSeparator());
                i++;
            } else {
                sb.append(strArr[i2]);
                return sb.toString();
            }
        }
    }

    private void c(List<syx> list, String[] strArr, String[] strArr2) {
        for (int i = 0; i < strArr.length; i++) {
            syx syxVar = new syx();
            syxVar.c(strArr[i]);
            syxVar.e(strArr2[i]);
            list.add(syxVar);
        }
    }
}
