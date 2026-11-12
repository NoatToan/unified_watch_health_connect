package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.health.health.constants.ObserveLabels;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hihealth.data.model.RelativeSportData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.UnitUtil;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class iyp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<jpg> f38216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f38217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MotionPath f38218c;
    List<gyk> d = new ArrayList(16);
    private MotionPathSimplify e;
    private jqp f;
    private gyd h;
    private int j;

    public iyp(Context context, MotionPathSimplify motionPathSimplify, jqp jqpVar, List<jpg> list) {
        this.j = 0;
        this.f38217b = context;
        this.e = motionPathSimplify;
        this.j = motionPathSimplify.requestSportType();
        this.f = jqpVar;
        this.f38218c = jqpVar.b();
        this.f38216a = list;
    }

    public void a() {
        this.d.clear();
        this.h = new gyd();
        HashMap map = new HashMap();
        c();
        b(map);
        a(map);
        o(map);
        f(map);
        l(map);
        e(map);
        g(map);
        d(map);
        h(map);
        j(map);
        n(map);
        j();
        i(map);
        k(map);
        c(map);
        this.h.e(map);
        if (!this.f.ay()) {
            this.h.a(this.f38216a);
        }
        e();
    }

    private void c() {
        int extendDataInt;
        if (this.j == 220 && (extendDataInt = this.e.getExtendDataInt("golfSwingCount")) >= 0) {
            String strE = UnitUtil.e(extendDataInt, 1, 0);
            String strE2 = qre.e(R.plurals.IDS_band_data_golf_count_unit, extendDataInt, "");
            String strF = qre.f(R.string.IDS_track_total_golf_count_with_unit);
            gyk gykVar = new gyk();
            gykVar.a(qre.f(R.string.IDS_pluginmotiontrack_detail_golf_total_count));
            gykVar.e(strE);
            gykVar.b(strE2);
            gykVar.d(strF);
            gykVar.c("SWING_TOTAL_COUNT");
            haj.a aVarC = haj.c("SWING_TOTAL_COUNT");
            if (aVarC != null) {
                gykVar.a(aVarC.e());
                gykVar.a(aVarC.a());
            }
            this.d.add(gykVar);
        }
    }

    private void e() {
        jqp jqpVar;
        if (this.h == null || (jqpVar = this.f) == null) {
            return;
        }
        int iRequestSportType = jqpVar.d().requestSportType();
        if (iRequestSportType == 512 || iRequestSportType == 220 || this.f.ay()) {
            this.h.d(this.d);
            return;
        }
        if (njy.e(this.f.o())) {
            LogUtil.j("Track_ShareWatermarkDataController", "parseCustomShareData datalist is null");
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        if (this.f.i() != null) {
            if (iRequestSportType != 271 || !this.f.i().e().equals("DISTANCE")) {
                arrayList.add(this.f.i());
            }
        } else {
            LogUtil.a("Track_ShareWatermarkDataController", "parseCustomShareData chiefData is null.");
        }
        arrayList.addAll(this.f.o());
        if (iRequestSportType == 262 || iRequestSportType == 266) {
            arrayList.addAll(this.d);
        }
        this.h.d(arrayList);
    }

    private void j() {
        int iRequestAvgHeartRate;
        if (this.j == 220 && (iRequestAvgHeartRate = this.e.requestAvgHeartRate()) > 0) {
            String strE = UnitUtil.e(iRequestAvgHeartRate, 1, 0);
            gyk gykVar = new gyk();
            gykVar.a(qre.f(R.string.IDS_motiontrack_show_detail_avrageheartrate));
            gykVar.e(String.valueOf(strE));
            gykVar.b(qre.f(R.string.IDS_main_watch_heart_rate_unit_string));
            gykVar.d(qre.f(R.string.IDS_track_average_heart_rate_with_unit));
            gykVar.c(ObserveLabels.HEART_RATE);
            haj.a aVarC = haj.c(ObserveLabels.HEART_RATE);
            if (aVarC != null) {
                gykVar.a(aVarC.e());
                gykVar.a(aVarC.a());
            }
            this.d.add(gykVar);
        }
    }

    private void c(Map<String, String> map) {
        String strB;
        if (this.j == 222) {
            map.put("sport_type_title", this.f38217b.getString(R.string.IDS_hw_sport_oal));
            map.put("sport_simple_language", jaa.b(this.e));
            map.put("waypoint_mileage_title", this.f38217b.getString(R.string.IDS_hw_sport_waypoint_mileage));
            int extendDataInt = this.e.getExtendDataInt("wayPointDistance");
            if (extendDataInt == 0) {
                strB = this.f38217b.getString(R.string.IDS_motiontrack_show_invalid_data);
            } else {
                strB = jpq.b(extendDataInt);
            }
            map.put("waypoint_mileage_value", strB);
            String string = this.f38217b.getResources().getString(R.string.IDS_motiontrack_show_sport_unit_km);
            if (UnitUtil.f()) {
                string = this.f38217b.getResources().getString(R.string.IDS_band_data_sport_distance_unit_en);
            }
            map.put("waypoint_mileage_unit", string);
            map.put("step_unit", this.f38217b.getResources().getQuantityString(R.plurals.IDS_settings_steps_unit, this.e.requestTotalSteps()));
            long jRequestTotalTime = this.e.requestTotalTime();
            int[] iArrA = ezo.a(jRequestTotalTime);
            int i = iArrA[0];
            int i2 = iArrA[1];
            int i3 = iArrA[2];
            map.put("duration", String.valueOf(jRequestTotalTime));
            map.put("duration_unit_day", this.f38217b.getResources().getQuantityString(R.plurals.IDS_physiology_day, i, ""));
            map.put("duration_unit_hour", this.f38217b.getResources().getQuantityString(R.plurals.IDS_hour_single_unit, i2, ""));
            String quantityString = this.f38217b.getResources().getQuantityString(R.plurals.IDS_min_single_unit, i3, "");
            if (i == 0 && i2 == 0) {
                quantityString = this.f38217b.getResources().getQuantityString(R.plurals.IDS_min_insert_unit, i3, "");
            }
            map.put("duration_unit_min", quantityString);
            map.put("step_title", this.f38217b.getString(R.string.IDS_settings_steps));
        }
    }

    private void k(Map<String, String> map) {
        int i = this.j;
        if (i == 266 || i == 262) {
            map.put("stroke", jao.c(this.e.requestSportData() != null ? this.e.requestSportData().get("swim_stroke") : null, this.f38217b));
            map.put("stroke_title", this.f38217b.getResources().getString(R.string.IDS_hwh_motiontrack_main_style));
            float fRequestAvgPace = this.e.requestAvgPace();
            String string = this.f38217b.getResources().getString(R.string.IDS_motiontrack_show_invalid_data);
            if (fRequestAvgPace > 0.0f) {
                string = jpq.j(fRequestAvgPace);
            }
            map.put("pace_unit", jao.e(this.f38217b, this.j));
            map.put("pace", jao.c(this.f38217b, string));
        }
    }

    private void b(Map<String, String> map) {
        MotionPathSimplify motionPathSimplify;
        String strF;
        String strF2;
        if (this.f38217b == null || (motionPathSimplify = this.e) == null) {
            return;
        }
        double dRequestTotalDistance = ((double) motionPathSimplify.requestTotalDistance()) / 1000.0d;
        String strF3 = qre.f(R.string.IDS_motiontrack_show_sport_unit_km);
        String strF4 = qre.f(R.string.IDS_motiontrack_show_map_sport_distance);
        String strF5 = qre.f(R.string.IDS_track_distance_with_unit);
        if (UnitUtil.f()) {
            dRequestTotalDistance = UnitUtil.e(dRequestTotalDistance, 3);
            strF3 = qre.f(R.string.IDS_band_data_sport_distance_unit_en);
            strF5 = qre.f(R.string.IDS_track_distance_en_with_unit);
        }
        if (dRequestTotalDistance > 0.0d) {
            strF = UnitUtil.e(dRequestTotalDistance, 1, 2);
        } else {
            strF = qre.f(R.string.IDS_motiontrack_show_invalid_data);
        }
        int i = this.j;
        if (i == 262 || i == 266) {
            dRequestTotalDistance = this.e.requestTotalDistance();
            if (UnitUtil.f()) {
                dRequestTotalDistance = UnitUtil.e(dRequestTotalDistance, 2);
                strF3 = qre.e(R.plurals.IDS_hwh_motiontrack_unit_yd, (int) Math.round(dRequestTotalDistance), new Object[0]);
                strF2 = qre.f(R.string.IDS_track_distance_yd_with_unit);
            } else {
                strF3 = qre.f(R.string.IDS_fitness_data_list_activity_meter_unit);
                strF2 = qre.f(R.string.IDS_track_distance_meter_with_unit);
            }
            String strE = UnitUtil.e(dRequestTotalDistance, 1, 0);
            if (dRequestTotalDistance <= 0.0d) {
                strE = qre.f(R.string.IDS_motiontrack_show_invalid_data);
            }
            String str = strF2;
            strF = strE;
            strF5 = str;
        }
        if (nub.c(this.j)) {
            strF4 = qre.f(R.string.IDS_motiontrack_show_detail_ski_distance);
            map.put("distance_title", strF4);
        }
        map.put("distance_title_with_unit", jao.c(this.f38217b, this.j));
        map.put("distance", strF);
        map.put("distance_unit", strF3);
        if (dRequestTotalDistance > 0.0d) {
            a(strF4, strF, strF3, strF5);
        }
    }

    private void a(String str, String str2, String str3, String str4) {
        if (this.j == 512 || this.f.ay()) {
            gyk gykVar = new gyk();
            gykVar.a(str);
            gykVar.e(str2);
            gykVar.b(str3);
            gykVar.d(str4);
            gykVar.c("DISTANCE");
            haj.a aVarC = haj.c("DISTANCE");
            if (aVarC != null) {
                gykVar.a(aVarC.e());
                gykVar.a(aVarC.a());
            }
            this.d.add(gykVar);
        }
    }

    private void e(Map<String, String> map) {
        String quantityString;
        if (this.j == 273) {
            String string = this.f38217b.getString(R.string.IDS_settings_steps);
            String string2 = this.f38217b.getString(R.string.IDS_indoor_equip_cadence);
            MotionPath motionPath = this.f38218c;
            if (motionPath != null && motionPath.isValidCadenceData()) {
                int iC = jpq.c(this.e, this.f38218c);
                String strB = jao.b(this.f38217b, iC);
                quantityString = this.f38217b.getResources().getQuantityString(R.plurals.IDS_indoor_equip_cadence_pre_unit_times, iC, "");
                map.put("cadence", strB);
            } else {
                map.put("cadence", this.f38217b.getString(R.string.IDS_motiontrack_show_invalid_data));
                quantityString = null;
            }
            map.put("cadence_title", string2);
            map.put("cadence_unit", quantityString);
            String strB2 = jao.b(this.f38217b, this.e.requestTotalSteps());
            map.put("step_title", string);
            map.put("step", strB2);
        }
    }

    private void g(Map<String, String> map) {
        String quantityString;
        if (this.j == 274) {
            String string = this.f38217b.getString(R.string.IDS_indoor_equip_paddle_times);
            String string2 = this.f38217b.getString(R.string.IDS_indoor_equip_paddle_frequency);
            MotionPath motionPath = this.f38218c;
            if (motionPath != null && motionPath.isValidPaddleData()) {
                int iA = jpq.a(this.e);
                String strB = jao.b(this.f38217b, iA);
                quantityString = this.f38217b.getResources().getQuantityString(R.plurals.IDS_hwh_motiontrack_stroke_rate_unit, iA);
                map.put("paddle_frequency", strB);
            } else {
                map.put("paddle_frequency", this.f38217b.getString(R.string.IDS_motiontrack_show_invalid_data));
                quantityString = null;
            }
            map.put("paddle_title", string2);
            map.put("paddle_unit", quantityString);
            map.put("paddle", jao.b(this.f38217b, this.e.requestTotalSteps()));
            map.put("paddle_title", string);
        }
    }

    private void f(Map<String, String> map) {
        String string;
        String strE;
        float fRequestAvgPace = this.e.requestAvgPace();
        if (UnitUtil.f()) {
            fRequestAvgPace = jao.e(fRequestAvgPace, this.j);
        }
        if (fRequestAvgPace > 0.0f) {
            strE = jao.e(this.f38217b, this.j);
            string = izn.a(fRequestAvgPace);
        } else {
            string = this.f38217b.getString(R.string.IDS_motiontrack_show_invalid_data);
            strE = null;
        }
        String strA = jao.a(this.f38217b, this.j);
        map.put("pace", string);
        map.put("pace_unit", strE);
        map.put("pace_title_with_unit", strA);
        int i = this.j;
        if ((i == 262 || i == 266) && fRequestAvgPace > 0.0f) {
            gyk gykVar = new gyk();
            gykVar.a(qre.f(R.string.IDS_motiontrack_show_detail_avragepace));
            gykVar.e(jpq.j(this.e.requestAvgPace()));
            gykVar.d(qre.a(R.string.IDS_track_average_pace_half_with_unit, strE));
            gykVar.c("AVERAGE_PACE");
            haj.a aVarC = haj.c("AVERAGE_PACE");
            if (aVarC != null) {
                gykVar.a(aVarC.e());
                gykVar.a(aVarC.a());
            }
            this.d.add(gykVar);
        }
    }

    private void j(Map<String, String> map) {
        int i;
        if (this.j == 283) {
            String extendDataString = this.e.getExtendDataString("skipNum");
            try {
                i = Integer.parseInt(extendDataString);
            } catch (NumberFormatException e) {
                LogUtil.e("Track_ShareWatermarkDataController", LogAnonymous.b(e));
                i = 0;
            }
            if (i > 0) {
                map.put("rope_skipping_numbers", extendDataString);
            } else {
                map.put("rope_skipping_numbers", this.f38217b.getString(R.string.IDS_motiontrack_show_invalid_data));
            }
            map.put("rope_skipping_numbers_unit", this.f38217b.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_number_unit_value, i, ""));
            if (this.e.getExtendDataInt("skipSpeed") <= 0) {
                map.put("rope_skipping_frequency", this.f38217b.getString(R.string.IDS_motiontrack_show_invalid_data));
            } else {
                map.put("rope_skipping_frequency", this.e.getExtendDataString("skipSpeed"));
            }
            map.put("rope_skipping_frequency_unit", this.f38217b.getResources().getString(R.string.IDS_indoor_skipper_number_minute));
            map.put("rope_skipping_frequency_title", this.f38217b.getResources().getString(R.string.IDS_indoor_equip_cadence));
            map.put("rope_skipping_frequency_title_with_unit", this.f38217b.getResources().getString(R.string.IDS_indoor_skipper_speed_number_minute));
            map.put("rope_skipping_numbers_title", this.f38217b.getResources().getString(R.string.IDS_indoor_skipper_jump_num));
            if (this.e.requestSportDataSource() == 5) {
                String strD = d();
                if (TextUtils.isEmpty(strD)) {
                    return;
                }
                map.put("sport_source", strD);
            }
        }
    }

    private String d() {
        SharedPreferences sharedPreferences = BaseApplication.getContext().getSharedPreferences("device_name", 0);
        return sharedPreferences != null ? sharedPreferences.getString("device_name_key", "") : "";
    }

    private void h(Map<String, String> map) {
        int i = this.j;
        if (i == 263 || i == 220) {
            map.put("swings", this.e.requestExtendDataMap().get("golfSwingCount"));
            d(map, this.e);
            map.put("swings_title", this.f38217b.getString(R.string.IDS_pluginmotiontrack_detail_golf_score));
            a(map, this.e);
            map.put("swing_tempo_title", this.f38217b.getString(R.string.IDS_pluginmotiontrack_detail_swing_rhythm));
            c(map, this.e);
            map.put("swing_speed_unit", jao.a(this.f38217b));
            if (UnitUtil.f()) {
                map.put("swing_speed_title_with_unit", this.f38217b.getString(R.string.IDS_share_golf_swing_speed_imperial));
            } else {
                map.put("swing_speed_title_with_unit", this.f38217b.getString(R.string.IDS_share_golf_swing_speed));
            }
        }
    }

    private void d(Map<String, String> map, MotionPathSimplify motionPathSimplify) {
        double extendDataDouble = motionPathSimplify.getExtendDataDouble("golfSwingTempo");
        if (extendDataDouble != -1.0d) {
            map.put("swing_tempo", jao.c(this.f38217b, UnitUtil.e((extendDataDouble / 100.0d) * 1.0d, 1, 1)));
        } else {
            map.put("swing_tempo", this.f38217b.getString(R.string.IDS_motiontrack_show_invalid_data));
        }
    }

    private void c(Map<String, String> map, MotionPathSimplify motionPathSimplify) {
        double extendDataDouble = motionPathSimplify.getExtendDataDouble("golfSwingSpeed");
        if (extendDataDouble != -1.0d) {
            String strC = jao.c(this.f38217b, UnitUtil.e((extendDataDouble / 100.0d) * 1.0d, 1, 1));
            map.put("swing_speed_title", this.f38217b.getString(R.string.IDS_pluginmotiontrack_detail_swing_speed));
            e(map, extendDataDouble, strC);
            return;
        }
        map.put("swing_speed", this.f38217b.getString(R.string.IDS_motiontrack_show_invalid_data));
    }

    private void e(Map<String, String> map, double d, String str) {
        if (UnitUtil.f()) {
            map.put("swing_speed", jao.c(this.f38217b, UnitUtil.e(UnitUtil.e((d / 100.0d) * 3.5999999046325684d, 3), 1, 1)));
        } else {
            map.put("swing_speed", str);
        }
    }

    private void a(Map<String, String> map, MotionPathSimplify motionPathSimplify) {
        int extendDataInt = motionPathSimplify.getExtendDataInt("golfSwingCount");
        if (extendDataInt != -1) {
            map.put("swings_unit", this.f38217b.getResources().getQuantityString(R.plurals.IDS_band_data_golf_count_unit, extendDataInt, ""));
        } else {
            map.put("swings_unit", this.f38217b.getString(R.string.IDS_motiontrack_show_invalid_data));
        }
    }

    private void d(Map<String, String> map) {
        String str;
        String strE;
        String str2;
        String strE2;
        String strE3;
        if (this.j == 271) {
            MotionPathSimplify motionPathSimplify = this.e;
            if (motionPathSimplify == null || motionPathSimplify.requestSportData() == null) {
                str = null;
                strE = null;
            } else {
                String strE4 = this.e.requestSportData().containsKey("overall_score") ? UnitUtil.e(this.e.requestSportData().get("overall_score").intValue(), 1, 0) : null;
                if (this.e.requestSportData().containsKey("jump_times")) {
                    str = strE4;
                    strE = UnitUtil.e(this.e.requestSportData().get("jump_times").intValue(), 1, 0);
                } else {
                    str = strE4;
                    strE = null;
                }
            }
            MotionPath motionPath = this.f38218c;
            if (motionPath == null || !njy.b(motionPath.requestJumpDataList())) {
                str2 = null;
                strE2 = null;
            } else {
                if (UnitUtil.f()) {
                    strE3 = UnitUtil.e((int) UnitUtil.e(jpq.c(this.f38218c.requestJumpDataList()), 0), 1, 0);
                } else {
                    strE3 = UnitUtil.e(jpq.c(this.f38218c.requestJumpDataList()), 1, 0);
                }
                strE2 = UnitUtil.e(jpq.d(this.f38218c.requestJumpDataList()), 1, 0);
                str2 = strE3;
            }
            e(map, str, strE, str2, strE2);
        }
    }

    private void e(Map<String, String> map, String str, String str2, String str3, String str4) {
        String strC = jao.c(this.f38217b, str);
        String strC2 = jao.c(this.f38217b, str2);
        String strC3 = jao.c(this.f38217b, str3);
        String strC4 = jao.c(this.f38217b, str4);
        map.put("show_score", strC);
        map.put("show_score_title", this.f38217b.getResources().getString(R.string.IDS_aw_version2_show_score));
        map.put("show_score_unit", this.f38217b.getResources().getString(R.string.IDS_aw_version2_score));
        map.put("jumps_times_title", this.f38217b.getResources().getString(R.string.IDS_aw_version2_jump_times));
        map.put("jump_times_unit", this.f38217b.getResources().getString(R.string.IDS_awake_times));
        map.put("jump_times", strC2);
        map.put("jump_height", strC3);
        map.put("jump_height_title", this.f38217b.getResources().getString(R.string.IDS_aw_version2_average_jump_height));
        if (UnitUtil.f()) {
            map.put("jump_height_unit", this.f38217b.getResources().getString(R.string.IDS_ins));
        } else {
            map.put("jump_height_unit", this.f38217b.getResources().getString(R.string.IDS_cm));
        }
        map.put("hang_time", strC4);
        map.put("hang_time_unit", this.f38217b.getResources().getString(R.string.IDS_msec_unit));
        map.put("hang_time_title", this.f38217b.getResources().getString(R.string.IDS_aw_version2_average_jump_time));
    }

    private void l(Map<String, String> map) {
        String string;
        float fRequestAvgPace = this.e.requestAvgPace();
        String string2 = this.f38217b.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed);
        String string3 = this.f38217b.getResources().getString(R.string.IDS_hwh_motiontrack_show_speed_km_hour);
        if (UnitUtil.f()) {
            string2 = this.f38217b.getResources().getString(R.string.IDS_motiontrack_show_detail_average_speed_imp);
            string3 = this.f38217b.getResources().getString(R.string.IDS_hwh_motiontrack_show_speed_mi_hour);
        }
        if (jpq.i(this.j)) {
            if (fRequestAvgPace > 0.0f) {
                string = jpq.i(fRequestAvgPace);
            } else {
                string = this.f38217b.getString(R.string.IDS_motiontrack_show_invalid_data);
            }
            map.put("speed", string);
            map.put("speed_unit", string2);
            map.put("speed_title_with_unit", string3);
        }
    }

    private void o(Map<String, String> map) {
        String strB = jxq.b(this.e);
        if (TextUtils.isEmpty(strB)) {
            int iRequestDeviceType = this.e.requestDeviceType();
            Context context = this.f38217b;
            strB = een.b(iRequestDeviceType, context, context.getPackageName(), this.e.requestProductId(), this.e.requestSubProductId());
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "Md"));
        long jRequestStartTime = this.e.requestStartTime();
        if (this.f.ay()) {
            List<RelativeSportData> listRequestChildSportItems = this.e.requestChildSportItems();
            if (njy.b(listRequestChildSportItems) && listRequestChildSportItems.get(0) != null) {
                jRequestStartTime = listRequestChildSportItems.get(0).getStartTime();
            }
        }
        String str = simpleDateFormat.format(Long.valueOf(jRequestStartTime));
        String extendDataString = this.e.getExtendDataString("alias");
        if (TextUtils.isEmpty(extendDataString)) {
            if (this.f.ay()) {
                extendDataString = qre.f(R.string.IDS_workout_record_merge_tracks);
            } else {
                int i = this.j;
                if (i == 227) {
                    extendDataString = jqq.e(this.e.requestExtendDataMap());
                } else {
                    extendDataString = jaa.d(this.f38217b, i);
                }
            }
        }
        map.put("sport_source", strB);
        map.put("sport_date", str);
        map.put("sport_time", String.valueOf(jRequestStartTime));
        map.put("sport_type", extendDataString);
    }

    private void a(Map<String, String> map) {
        long jRequestTotalTime;
        String strE;
        if (this.e.requestSportDataSource() != 2 && nub.e(this.j)) {
            jRequestTotalTime = this.e.getExtendDataLong("skiTotalTime");
        } else {
            jRequestTotalTime = this.e.requestTotalTime();
        }
        if (jRequestTotalTime <= 0) {
            strE = qre.f(R.string.IDS_motiontrack_show_invalid_data);
        } else {
            strE = UnitUtil.e((int) TimeUnit.MILLISECONDS.toSeconds(jRequestTotalTime));
        }
        if (TextUtils.isEmpty(strE)) {
            strE = qre.f(R.string.IDS_motiontrack_show_invalid_data);
        }
        String strF = qre.f(R.string.IDS_hwh_health_sport_duration);
        map.put("duration", strE);
        map.put("duration_title", strF);
        int i = this.j;
        if ((i == 512 || i == 220 || this.f.ay()) && jRequestTotalTime > 0) {
            gyk gykVar = new gyk();
            gykVar.a(qre.f(R.string.IDS_motiontrack_show_detail_sporttime));
            gykVar.e(strE);
            gykVar.d(qre.f(R.string.IDS_motiontrack_show_detail_sporttime));
            gykVar.c("TIME");
            haj.a aVarC = haj.c("TIME");
            if (aVarC != null) {
                gykVar.a(aVarC.e());
                gykVar.a(aVarC.a());
            }
            this.d.add(gykVar);
        }
    }

    private void i(Map<String, String> map) {
        String strE;
        String string;
        if (nub.c(this.j)) {
            String string2 = this.f38217b.getString(R.string.IDS_motiontrack_show_detail_ski_time);
            long jRequestTotalTime = this.e.requestTotalTime();
            int iRequestSportDataSource = this.e.requestSportDataSource();
            float fE = (float) gzz.e(this.f38218c.requestRealTimeSpeedList());
            if (jRequestTotalTime <= 0) {
                strE = this.f38217b.getString(R.string.IDS_motiontrack_show_invalid_data);
            } else {
                strE = UnitUtil.e((int) TimeUnit.MILLISECONDS.toSeconds(jRequestTotalTime));
            }
            if (TextUtils.isEmpty(strE) || iRequestSportDataSource == 2) {
                strE = this.f38217b.getString(R.string.IDS_motiontrack_show_invalid_data);
            }
            String string3 = this.f38217b.getString(R.string.IDS_hwh_motiontrack_fast_speed);
            if (fE > 0.0f) {
                if (UnitUtil.f()) {
                    string = UnitUtil.e(UnitUtil.e(fE, 3), 1, 2);
                } else {
                    string = UnitUtil.e(fE, 1, 2);
                }
            } else {
                string = this.f38217b.getString(R.string.IDS_motiontrack_show_invalid_data);
            }
            map.put("skiing_time_value", strE);
            map.put("skiing_time_title", string2);
            map.put("skiing_max_speed_title", string3);
            map.put("skiing_max_speed", string);
        }
    }

    private void n(Map<String, String> map) {
        String strD = jao.d(this.f38217b, this.e.requestTotalCalories());
        String strB = jao.b(this.f38217b, this.e.requestTotalSteps());
        String strF = qre.f(R.string.IDS_motiontrack_show_kcal);
        String strF2 = this.j == 273 ? qre.f(R.string.IDS_settings_steps) : null;
        map.put("calorie", strD);
        map.put("calorie_unit", strF);
        map.put("step", strB);
        map.put("step_title", strF2);
        map.put("calorie_title", qre.f(R.string.IDS_track_total_calorie));
        map.put("calorie_title_with_unit", qre.f(R.string.IDS_track_total_calorie_kcal));
        int i = this.j;
        if (i == 512 || i == 220 || this.f.ay()) {
            gyk gykVar = new gyk();
            gykVar.a(qre.f(R.string.IDS_track_total_calorie));
            gykVar.e(strD);
            gykVar.b(strF);
            gykVar.d(qre.f(R.string.IDS_track_total_calorie_kcal));
            gykVar.c("CALORIES");
            haj.a aVarC = haj.c("CALORIES");
            if (aVarC != null) {
                gykVar.a(aVarC.e());
                gykVar.a(aVarC.a());
            }
            this.d.add(gykVar);
        }
    }

    public gyd b() {
        return this.h;
    }

    public void b(String str) {
        Map<String, String> mapD;
        gyd gydVar = this.h;
        if (gydVar == null || (mapD = gydVar.d()) == null) {
            return;
        }
        mapD.put("sport_type", str);
    }

    public void d(String str) {
        if (this.h == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("Track_ShareWatermarkDataController", "srcPath in null");
            return;
        }
        try {
            FileUtils.e(new File(str), new File(gxu.f36208c));
            this.h.e(gxu.f36208c);
        } catch (IOException unused) {
            LogUtil.e("Track_ShareWatermarkDataController", "copy file is fail in setWatermarkPath");
        }
    }

    public void d(List<jpg> list) {
        gyd gydVar = this.h;
        if (gydVar != null) {
            gydVar.b(list);
        }
    }

    public void e(List<Integer> list) {
        gyd gydVar = this.h;
        if (gydVar != null) {
            gydVar.c(list);
        }
    }
}
