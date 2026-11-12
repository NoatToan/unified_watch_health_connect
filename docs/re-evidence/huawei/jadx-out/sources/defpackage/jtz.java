package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.adapter.TrackGridViewAdapter;
import com.huawei.healthcloud.plugintrack.ui.viewholder.ShowDataConfig;
import com.huawei.healthcloud.plugintrack.ui.viewholder.TrackMainFragmentShowType;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class jtz implements ShowDataConfig {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile jtz f39042c;
    private static final Object e = new Object();

    private jtz() {
    }

    public static ShowDataConfig b() {
        if (f39042c == null) {
            synchronized (e) {
                if (f39042c == null) {
                    f39042c = new jtz();
                }
            }
        }
        return f39042c;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.ShowDataConfig
    public SparseArray<TrackMainFragmentShowType> getConfigFromLocal(int i, int i2) {
        SparseArray<TrackMainFragmentShowType> sparseArray = new SparseArray<>(10);
        try {
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), c(i, i2));
            if (TextUtils.isEmpty(strE)) {
                LogUtil.e("ShowDataConfigManager", "TextUtils.isEmpty(temp)");
                return sparseArray;
            }
            JSONArray jSONArray = new JSONArray(strE);
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i3);
                sparseArray.put(jSONObject.getInt(MedalConstants.EVENT_KEY), d(jSONObject.getString("type")));
            }
            return sparseArray;
        } catch (JSONException unused) {
            LogUtil.e("ShowDataConfigManager", "getConfigFromLocal(), JSONException");
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.ShowDataConfig
    public void saveConfigToLocal(SparseArray<TrackMainFragmentShowType> sparseArray, int i, int i2) {
        if (sparseArray == null || sparseArray.size() < 7) {
            ReleaseLogUtil.a("ShowDataConfigManager", "saveConfigToLocal is error, ", sparseArray);
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            try {
                int iKeyAt = sparseArray.keyAt(i3);
                jSONArray.put(i3, e(iKeyAt, sparseArray.get(iKeyAt)));
            } catch (JSONException unused) {
                LogUtil.e("ShowDataConfigManager", "saveConfigToLocal(), JSONException");
            }
        }
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), c(i, i2), jSONArray.toString(), null);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.ShowDataConfig
    public SparseArray<TrackMainFragmentShowType> getDefaultConfig(int i) {
        if (i == 259) {
            return e();
        }
        if (i == 264) {
            return f();
        }
        if (i == 265) {
            return a();
        }
        return h();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.ShowDataConfig
    public List<TrackGridViewAdapter.b> getValueHolderList(int i, int i2, boolean z, boolean z2) {
        List<TrackMainFragmentShowType> listB;
        LogUtil.a("ShowDataConfigManager", "sportType = ", Integer.valueOf(i));
        if (i == 264) {
            listB = b(false);
        } else if (i == 265) {
            listB = i();
        } else if (i == 281) {
            listB = d(false);
        } else if (i != 282) {
            switch (i) {
                case 257:
                    listB = d(true);
                    break;
                case 258:
                    listB = b(true);
                    break;
                case 259:
                    listB = b(i2);
                    break;
                case 260:
                    listB = c();
                    break;
                default:
                    listB = d(true);
                    break;
            }
        } else {
            listB = d();
        }
        return a(listB);
    }

    private List<TrackGridViewAdapter.b> a(List<TrackMainFragmentShowType> list) {
        ArrayList arrayList = new ArrayList(10);
        for (TrackMainFragmentShowType trackMainFragmentShowType : list) {
            switch (AnonymousClass5.e[trackMainFragmentShowType.ordinal()]) {
                case 1:
                    arrayList.add(new TrackGridViewAdapter.b(R.drawable.data_ic_distance_nor, R.drawable.data_ic_distance_selection, R.string.IDS_sport_distance, TrackMainFragmentShowType.TOTAL_DISTANCES));
                    break;
                case 2:
                    arrayList.add(new TrackGridViewAdapter.b(R.drawable.data_ic_time_nor, R.drawable.data_ic_time_selection, R.string.IDS_workout_data_time, TrackMainFragmentShowType.TOTAL_TIME));
                    break;
                case 3:
                    arrayList.add(new TrackGridViewAdapter.b(R.drawable.data_ic_total_calorie, R.drawable.data_ic_total_calorie_selection, R.string.IDS_track_total_calories, TrackMainFragmentShowType.CALORIE));
                    break;
                case 4:
                    arrayList.add(new TrackGridViewAdapter.b(R.drawable.data_ic_active_calorie, R.drawable.data_ic_active_calorie_selection, R.string.IDS_track_active_calories, TrackMainFragmentShowType.ACTIVE_CALORIE));
                    break;
                case 5:
                    arrayList.add(new TrackGridViewAdapter.b(R.drawable.data_ic_pace_nor, R.drawable.data_ic_pace_selection, R.string.IDS_motiontrack_show_map_sport_peisu_1, TrackMainFragmentShowType.PACE));
                    break;
                case 6:
                    arrayList.add(new TrackGridViewAdapter.b(R.drawable.data_ic_speed_nor, R.drawable.data_ic_speed_selection, R.string.IDS_motiontrack_show_sport_tip_icon_text_pace, TrackMainFragmentShowType.SPEED));
                    break;
                case 7:
                    arrayList.add(new TrackGridViewAdapter.b(R.drawable.data_ic_max, R.drawable.data_ic_max_select, R.string.IDS_motiontrack_show_maxspeed, TrackMainFragmentShowType.MAX_SPEED));
                    break;
                default:
                    b(arrayList, trackMainFragmentShowType);
                    break;
            }
        }
        return arrayList;
    }

    private void b(List<TrackGridViewAdapter.b> list, TrackMainFragmentShowType trackMainFragmentShowType) {
        switch (trackMainFragmentShowType) {
            case AVG_SPEED:
                list.add(new TrackGridViewAdapter.b(R.drawable.date_ic_avg, R.drawable.date_ic_avg_select, R.string.IDS_motiontrack_show_detail_averagespeed, TrackMainFragmentShowType.AVG_SPEED));
                break;
            case STEPS:
                list.add(new TrackGridViewAdapter.b(R.drawable.data_ic_steps_nor, R.drawable.data_ic_steps_selection, R.string.IDS_settings_steps, TrackMainFragmentShowType.STEPS));
                break;
            case STEP_RATE:
                list.add(new TrackGridViewAdapter.b(R.drawable.data_ic_cadence__nor, R.drawable.data_ic_cadence_selection, R.string.IDS_motiontrack_detail_fm_heart_bupin, TrackMainFragmentShowType.STEP_RATE));
                break;
            case TOTAL_CLIMB:
                list.add(new TrackGridViewAdapter.b(R.drawable.data_ic_climb_nor, R.drawable.data_ic_climb_selection, R.string.IDS_hwh_motiontrack_total_climbed, TrackMainFragmentShowType.TOTAL_CLIMB));
                break;
            case TOTAL_DECLINE:
                list.add(new TrackGridViewAdapter.b(R.drawable.data_ic_decline_nor, R.drawable.data_ic_decline_selection, R.string.IDS_hwh_motiontrack_total_descent, TrackMainFragmentShowType.TOTAL_DECLINE));
                break;
            case SLOPE:
                list.add(new TrackGridViewAdapter.b(R.drawable.data_ic_slope, R.drawable.data_ic_slope_select, R.string.IDS_fitness_equipment_slope, TrackMainFragmentShowType.SLOPE));
                break;
            case ALTITUDE:
                list.add(new TrackGridViewAdapter.b(R.drawable.data_ic_altitude_nor, R.drawable.data_ic_altitude_selection, R.string.IDS_hwh_motiontrack_alti, TrackMainFragmentShowType.ALTITUDE));
                break;
            case CONTACT_TIME:
                list.add(new TrackGridViewAdapter.b(R.drawable.data_ic_touchdown_time_nor, R.drawable.data_ic_touchdown_time_selection, R.string.IDS_running_posture_ground_contact_time, TrackMainFragmentShowType.CONTACT_TIME));
                break;
            default:
                a(list, trackMainFragmentShowType);
                break;
        }
    }

    private void a(List<TrackGridViewAdapter.b> list, TrackMainFragmentShowType trackMainFragmentShowType) {
        switch (trackMainFragmentShowType) {
            case GROUND_IMPACT:
                list.add(new TrackGridViewAdapter.b(R.drawable.data_ic_landing_impact_nor, R.drawable.data_ic_landing_impact_selection, R.string.IDS_running_posture_ground_impact_acceleration, TrackMainFragmentShowType.GROUND_IMPACT));
                break;
            case EVERSION_EXCURSION:
                list.add(new TrackGridViewAdapter.b(R.drawable.data_ic_valgus_range_nor, R.drawable.data_ic_valgus_range_selection, R.string.IDS_sport_noun_explain_paobuzhitai_waifanfudu_title, TrackMainFragmentShowType.EVERSION_EXCURSION));
                break;
            case SWING_ANGLE:
                list.add(new TrackGridViewAdapter.b(R.drawable.data_ic_swing_angle_nor, R.drawable.data_ic_swing_angle_selection, R.string.IDS_sport_noun_explain_paobuzhitai_baidongjiaodu_title, TrackMainFragmentShowType.SWING_ANGLE));
                break;
            case JUMP_DURATION:
                list.add(new TrackGridViewAdapter.b(R.drawable.data_ic_jump_duration, R.drawable.data_ic_jump_duration_selection, R.string.IDS_aw_version2_duration_of_passage, TrackMainFragmentShowType.JUMP_DURATION));
                break;
            case GROUND_TO_AIR_RATIO:
                list.add(new TrackGridViewAdapter.b(R.drawable.data_ic_ground_to_air_ratio, R.drawable.data_ic_ground_to_air_ratio_selection, R.string.IDS_motiontrack_ground_to_air_ratio, TrackMainFragmentShowType.GROUND_TO_AIR_RATIO));
                break;
            case GC_TIME_BALANCE:
                list.add(new TrackGridViewAdapter.b(R.drawable.data_ic_gc_time_balance_normal, R.drawable.data_ic_gc_time_balance_select, R.string.IDS_bolt_balance_left_right_touches, TrackMainFragmentShowType.GC_TIME_BALANCE));
                break;
            case VERTICAL_OSCILLATION:
                list.add(new TrackGridViewAdapter.b(R.drawable.data_ic_vertical_oscillation_mormal, R.drawable.data_ic_vertical_oscillation_select, R.string.IDS_bolt_vertical_amplitude, TrackMainFragmentShowType.VERTICAL_OSCILLATION));
                break;
            default:
                c(list, trackMainFragmentShowType);
                break;
        }
    }

    private void c(List<TrackGridViewAdapter.b> list, TrackMainFragmentShowType trackMainFragmentShowType) {
        switch (trackMainFragmentShowType) {
            case VERTICAL_RATIO:
                list.add(new TrackGridViewAdapter.b(R.drawable.data_ic_vertical_ratio_normal, R.drawable.data_ic_vertical_ratio_select, R.string.IDS_bolt_vertical_stride_rate, TrackMainFragmentShowType.VERTICAL_RATIO));
                break;
            case IMPACT_PEAK:
                list.add(new TrackGridViewAdapter.b(R.drawable.data_ic_impact_peak_normal, R.drawable.data_ic_impact_peak_select, R.string.IDS_bolt_shock_peak, TrackMainFragmentShowType.IMPACT_PEAK));
                break;
            case AVERAGE_VERTICAL_IMPACT_RATE:
                list.add(new TrackGridViewAdapter.b(R.drawable.data_ic_average_vertical_impact_rate_normal, R.drawable.data_ic_average_vertical_impact_rate_select, R.string.IDS_bolt_peak_impact_rate, TrackMainFragmentShowType.AVERAGE_VERTICAL_IMPACT_RATE));
                break;
            case CADENCE:
                list.add(new TrackGridViewAdapter.b(R.drawable.data_ic_cadence_nor, R.drawable.data_ic_cadence_sel, R.string.IDS_indoor_equip_cadence, TrackMainFragmentShowType.CADENCE));
                break;
            case AVG_CADENCE:
                list.add(new TrackGridViewAdapter.b(R.drawable.data_ic_avg_cadence_nor, R.drawable.data_ic_avg_cadence_selection, R.string.IDS_indoor_equip_detail_cadence_average, TrackMainFragmentShowType.AVG_CADENCE));
                break;
            case POWER:
                list.add(new TrackGridViewAdapter.b(R.drawable.data_ic_power, R.drawable.data_ic_power_select, R.string.IDS_indoor_equip_power, TrackMainFragmentShowType.POWER));
                break;
            case AVG_POWER:
                list.add(new TrackGridViewAdapter.b(R.drawable.data_ic_avg_power, R.drawable.data_ic_avg_power_selection, R.string.IDS_average_power_not_abbreviate, TrackMainFragmentShowType.AVG_POWER));
                break;
            case HEART_RATE:
                list.add(new TrackGridViewAdapter.b(R.drawable.data_ic_heart_nor, R.drawable.data_ic_heart_selection, R.string.IDS_main_watch_heart_rate_string, TrackMainFragmentShowType.HEART_RATE));
                break;
        }
    }

    private List<TrackMainFragmentShowType> d(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TrackMainFragmentShowType.TOTAL_DISTANCES);
        arrayList.add(TrackMainFragmentShowType.TOTAL_TIME);
        arrayList.add(TrackMainFragmentShowType.CALORIE);
        arrayList.add(TrackMainFragmentShowType.ACTIVE_CALORIE);
        arrayList.add(TrackMainFragmentShowType.PACE);
        arrayList.add(TrackMainFragmentShowType.SPEED);
        arrayList.add(TrackMainFragmentShowType.HEART_RATE);
        arrayList.add(TrackMainFragmentShowType.STEPS);
        arrayList.add(TrackMainFragmentShowType.STEP_RATE);
        if (z) {
            arrayList.add(TrackMainFragmentShowType.TOTAL_CLIMB);
            arrayList.add(TrackMainFragmentShowType.TOTAL_DECLINE);
            arrayList.add(TrackMainFragmentShowType.ALTITUDE);
        }
        return arrayList;
    }

    private List<TrackMainFragmentShowType> b(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TrackMainFragmentShowType.TOTAL_DISTANCES);
        arrayList.add(TrackMainFragmentShowType.TOTAL_TIME);
        arrayList.add(TrackMainFragmentShowType.CALORIE);
        arrayList.add(TrackMainFragmentShowType.ACTIVE_CALORIE);
        arrayList.add(TrackMainFragmentShowType.PACE);
        arrayList.add(TrackMainFragmentShowType.SPEED);
        arrayList.add(TrackMainFragmentShowType.HEART_RATE);
        arrayList.add(TrackMainFragmentShowType.STEPS);
        arrayList.add(TrackMainFragmentShowType.STEP_RATE);
        if (z) {
            arrayList.add(TrackMainFragmentShowType.TOTAL_CLIMB);
            arrayList.add(TrackMainFragmentShowType.TOTAL_DECLINE);
            arrayList.add(TrackMainFragmentShowType.ALTITUDE);
        }
        arrayList.add(TrackMainFragmentShowType.CONTACT_TIME);
        arrayList.add(TrackMainFragmentShowType.GROUND_IMPACT);
        arrayList.add(TrackMainFragmentShowType.EVERSION_EXCURSION);
        arrayList.add(TrackMainFragmentShowType.SWING_ANGLE);
        arrayList.add(TrackMainFragmentShowType.JUMP_DURATION);
        arrayList.add(TrackMainFragmentShowType.GROUND_TO_AIR_RATIO);
        arrayList.add(TrackMainFragmentShowType.GC_TIME_BALANCE);
        arrayList.add(TrackMainFragmentShowType.VERTICAL_OSCILLATION);
        arrayList.add(TrackMainFragmentShowType.VERTICAL_RATIO);
        arrayList.add(TrackMainFragmentShowType.IMPACT_PEAK);
        arrayList.add(TrackMainFragmentShowType.AVERAGE_VERTICAL_IMPACT_RATE);
        arrayList.add(TrackMainFragmentShowType.POWER);
        return arrayList;
    }

    private List<TrackMainFragmentShowType> b(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TrackMainFragmentShowType.TOTAL_DISTANCES);
        arrayList.add(TrackMainFragmentShowType.TOTAL_TIME);
        arrayList.add(TrackMainFragmentShowType.CALORIE);
        arrayList.add(TrackMainFragmentShowType.ACTIVE_CALORIE);
        arrayList.add(TrackMainFragmentShowType.SPEED);
        arrayList.add(TrackMainFragmentShowType.MAX_SPEED);
        arrayList.add(TrackMainFragmentShowType.AVG_SPEED);
        arrayList.add(TrackMainFragmentShowType.HEART_RATE);
        arrayList.add(TrackMainFragmentShowType.TOTAL_CLIMB);
        arrayList.add(TrackMainFragmentShowType.TOTAL_DECLINE);
        arrayList.add(TrackMainFragmentShowType.SLOPE);
        arrayList.add(TrackMainFragmentShowType.ALTITUDE);
        arrayList.add(TrackMainFragmentShowType.CADENCE);
        arrayList.add(TrackMainFragmentShowType.AVG_CADENCE);
        arrayList.add(TrackMainFragmentShowType.POWER);
        arrayList.add(TrackMainFragmentShowType.AVG_POWER);
        return arrayList;
    }

    private List<TrackMainFragmentShowType> i() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TrackMainFragmentShowType.TOTAL_DISTANCES);
        arrayList.add(TrackMainFragmentShowType.TOTAL_TIME);
        arrayList.add(TrackMainFragmentShowType.CALORIE);
        arrayList.add(TrackMainFragmentShowType.ACTIVE_CALORIE);
        arrayList.add(TrackMainFragmentShowType.SPEED);
        arrayList.add(TrackMainFragmentShowType.MAX_SPEED);
        arrayList.add(TrackMainFragmentShowType.AVG_SPEED);
        arrayList.add(TrackMainFragmentShowType.HEART_RATE);
        arrayList.add(TrackMainFragmentShowType.CADENCE);
        arrayList.add(TrackMainFragmentShowType.POWER);
        arrayList.add(TrackMainFragmentShowType.AVG_POWER);
        arrayList.add(TrackMainFragmentShowType.AVG_CADENCE);
        return arrayList;
    }

    private List<TrackMainFragmentShowType> d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TrackMainFragmentShowType.TOTAL_DISTANCES);
        arrayList.add(TrackMainFragmentShowType.TOTAL_TIME);
        arrayList.add(TrackMainFragmentShowType.CALORIE);
        arrayList.add(TrackMainFragmentShowType.ACTIVE_CALORIE);
        arrayList.add(TrackMainFragmentShowType.PACE);
        arrayList.add(TrackMainFragmentShowType.SPEED);
        arrayList.add(TrackMainFragmentShowType.HEART_RATE);
        arrayList.add(TrackMainFragmentShowType.STEPS);
        arrayList.add(TrackMainFragmentShowType.TOTAL_CLIMB);
        arrayList.add(TrackMainFragmentShowType.TOTAL_DECLINE);
        arrayList.add(TrackMainFragmentShowType.ALTITUDE);
        return arrayList;
    }

    private List<TrackMainFragmentShowType> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TrackMainFragmentShowType.TOTAL_DISTANCES);
        arrayList.add(TrackMainFragmentShowType.TOTAL_TIME);
        arrayList.add(TrackMainFragmentShowType.CALORIE);
        arrayList.add(TrackMainFragmentShowType.ACTIVE_CALORIE);
        arrayList.add(TrackMainFragmentShowType.PACE);
        arrayList.add(TrackMainFragmentShowType.SPEED);
        arrayList.add(TrackMainFragmentShowType.HEART_RATE);
        arrayList.add(TrackMainFragmentShowType.STEPS);
        arrayList.add(TrackMainFragmentShowType.TOTAL_CLIMB);
        arrayList.add(TrackMainFragmentShowType.TOTAL_DECLINE);
        arrayList.add(TrackMainFragmentShowType.ALTITUDE);
        return arrayList;
    }

    private String c(int i, int i2) {
        if (i2 == 100) {
            return "show_data_type_config_" + i + "_" + i2;
        }
        return "show_data_type_config_" + i;
    }

    private TrackMainFragmentShowType d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (TrackMainFragmentShowType trackMainFragmentShowType : TrackMainFragmentShowType.values()) {
            if (trackMainFragmentShowType.toString().equals(str)) {
                return trackMainFragmentShowType;
            }
        }
        return null;
    }

    private JSONObject e(int i, TrackMainFragmentShowType trackMainFragmentShowType) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MedalConstants.EVENT_KEY, i);
            jSONObject.put("type", trackMainFragmentShowType == null ? "" : trackMainFragmentShowType.toString());
            return jSONObject;
        } catch (JSONException unused) {
            LogUtil.e("ShowDataConfigManager", "getConfigJsonObject(), JSONException");
            return jSONObject;
        }
    }

    private SparseArray<TrackMainFragmentShowType> h() {
        SparseArray<TrackMainFragmentShowType> sparseArray = new SparseArray<>(10);
        sparseArray.put(0, TrackMainFragmentShowType.TOTAL_DISTANCES);
        sparseArray.put(1, TrackMainFragmentShowType.TOTAL_TIME);
        sparseArray.put(2, TrackMainFragmentShowType.CALORIE);
        sparseArray.put(3, TrackMainFragmentShowType.PACE);
        sparseArray.put(4, TrackMainFragmentShowType.STEPS);
        sparseArray.put(5, TrackMainFragmentShowType.STEP_RATE);
        sparseArray.put(6, TrackMainFragmentShowType.TOTAL_CLIMB);
        return sparseArray;
    }

    private SparseArray<TrackMainFragmentShowType> f() {
        SparseArray<TrackMainFragmentShowType> sparseArray = new SparseArray<>(10);
        sparseArray.put(0, TrackMainFragmentShowType.TOTAL_DISTANCES);
        sparseArray.put(1, TrackMainFragmentShowType.TOTAL_TIME);
        sparseArray.put(2, TrackMainFragmentShowType.CALORIE);
        sparseArray.put(3, TrackMainFragmentShowType.PACE);
        sparseArray.put(4, TrackMainFragmentShowType.STEPS);
        sparseArray.put(5, TrackMainFragmentShowType.STEP_RATE);
        sparseArray.put(6, TrackMainFragmentShowType.SPEED);
        return sparseArray;
    }

    private SparseArray<TrackMainFragmentShowType> e() {
        SparseArray<TrackMainFragmentShowType> sparseArray = new SparseArray<>(10);
        sparseArray.put(0, TrackMainFragmentShowType.TOTAL_DISTANCES);
        sparseArray.put(1, TrackMainFragmentShowType.TOTAL_TIME);
        sparseArray.put(2, TrackMainFragmentShowType.SPEED);
        sparseArray.put(3, TrackMainFragmentShowType.CALORIE);
        sparseArray.put(4, TrackMainFragmentShowType.TOTAL_CLIMB);
        sparseArray.put(5, TrackMainFragmentShowType.ALTITUDE);
        sparseArray.put(6, TrackMainFragmentShowType.TOTAL_DECLINE);
        return sparseArray;
    }

    private SparseArray<TrackMainFragmentShowType> a() {
        SparseArray<TrackMainFragmentShowType> sparseArray = new SparseArray<>(10);
        sparseArray.put(0, TrackMainFragmentShowType.TOTAL_DISTANCES);
        sparseArray.put(1, TrackMainFragmentShowType.TOTAL_TIME);
        sparseArray.put(2, TrackMainFragmentShowType.SPEED);
        sparseArray.put(3, TrackMainFragmentShowType.CALORIE);
        sparseArray.put(4, TrackMainFragmentShowType.ACTIVE_CALORIE);
        sparseArray.put(5, TrackMainFragmentShowType.MAX_SPEED);
        sparseArray.put(6, TrackMainFragmentShowType.AVG_SPEED);
        return sparseArray;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.ShowDataConfig
    public List<TrackMainFragmentShowType> getPriorityConfig(int i, boolean z) {
        if (i == 258) {
            return j();
        }
        if (i == 259) {
            return e(z);
        }
        if (i == 264) {
            return g();
        }
        if (i == 265) {
            return a(z);
        }
        return m();
    }

    private List<TrackMainFragmentShowType> e(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TrackMainFragmentShowType.TOTAL_DISTANCES);
        arrayList.add(TrackMainFragmentShowType.TOTAL_TIME);
        if (!z) {
            arrayList.add(TrackMainFragmentShowType.POWER);
        }
        arrayList.add(TrackMainFragmentShowType.CADENCE);
        arrayList.add(TrackMainFragmentShowType.SPEED);
        arrayList.add(TrackMainFragmentShowType.SLOPE);
        arrayList.add(TrackMainFragmentShowType.CALORIE);
        arrayList.add(TrackMainFragmentShowType.TOTAL_CLIMB);
        arrayList.add(TrackMainFragmentShowType.ALTITUDE);
        arrayList.add(TrackMainFragmentShowType.TOTAL_DECLINE);
        arrayList.add(TrackMainFragmentShowType.ACTIVE_CALORIE);
        arrayList.add(TrackMainFragmentShowType.MAX_SPEED);
        arrayList.add(TrackMainFragmentShowType.AVG_SPEED);
        arrayList.add(TrackMainFragmentShowType.AVG_POWER);
        arrayList.add(TrackMainFragmentShowType.AVG_CADENCE);
        return arrayList;
    }

    private List<TrackMainFragmentShowType> a(boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TrackMainFragmentShowType.CALORIE);
        arrayList.add(TrackMainFragmentShowType.TOTAL_TIME);
        if (!z) {
            arrayList.add(TrackMainFragmentShowType.POWER);
        }
        arrayList.add(TrackMainFragmentShowType.CADENCE);
        arrayList.add(TrackMainFragmentShowType.SPEED);
        arrayList.add(TrackMainFragmentShowType.TOTAL_DISTANCES);
        arrayList.add(TrackMainFragmentShowType.ACTIVE_CALORIE);
        arrayList.add(TrackMainFragmentShowType.MAX_SPEED);
        arrayList.add(TrackMainFragmentShowType.AVG_SPEED);
        arrayList.add(TrackMainFragmentShowType.AVG_POWER);
        arrayList.add(TrackMainFragmentShowType.AVG_CADENCE);
        return arrayList;
    }

    private List<TrackMainFragmentShowType> m() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TrackMainFragmentShowType.TOTAL_DISTANCES);
        arrayList.add(TrackMainFragmentShowType.TOTAL_TIME);
        arrayList.add(TrackMainFragmentShowType.CALORIE);
        arrayList.add(TrackMainFragmentShowType.PACE);
        arrayList.add(TrackMainFragmentShowType.STEPS);
        arrayList.add(TrackMainFragmentShowType.STEP_RATE);
        arrayList.add(TrackMainFragmentShowType.TOTAL_CLIMB);
        arrayList.add(TrackMainFragmentShowType.ALTITUDE);
        arrayList.add(TrackMainFragmentShowType.TOTAL_DECLINE);
        arrayList.add(TrackMainFragmentShowType.SPEED);
        arrayList.add(TrackMainFragmentShowType.ACTIVE_CALORIE);
        return arrayList;
    }

    private List<TrackMainFragmentShowType> j() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TrackMainFragmentShowType.TOTAL_DISTANCES);
        arrayList.add(TrackMainFragmentShowType.TOTAL_TIME);
        arrayList.add(TrackMainFragmentShowType.CALORIE);
        arrayList.add(TrackMainFragmentShowType.PACE);
        arrayList.add(TrackMainFragmentShowType.POWER);
        arrayList.add(TrackMainFragmentShowType.CONTACT_TIME);
        arrayList.add(TrackMainFragmentShowType.VERTICAL_OSCILLATION);
        arrayList.add(TrackMainFragmentShowType.STEPS);
        arrayList.add(TrackMainFragmentShowType.STEP_RATE);
        arrayList.add(TrackMainFragmentShowType.TOTAL_CLIMB);
        arrayList.add(TrackMainFragmentShowType.TOTAL_DECLINE);
        arrayList.add(TrackMainFragmentShowType.ALTITUDE);
        arrayList.add(TrackMainFragmentShowType.SPEED);
        arrayList.add(TrackMainFragmentShowType.GROUND_IMPACT);
        arrayList.add(TrackMainFragmentShowType.EVERSION_EXCURSION);
        arrayList.add(TrackMainFragmentShowType.SWING_ANGLE);
        arrayList.add(TrackMainFragmentShowType.JUMP_DURATION);
        arrayList.add(TrackMainFragmentShowType.GROUND_TO_AIR_RATIO);
        arrayList.add(TrackMainFragmentShowType.GC_TIME_BALANCE);
        arrayList.add(TrackMainFragmentShowType.VERTICAL_RATIO);
        arrayList.add(TrackMainFragmentShowType.IMPACT_PEAK);
        arrayList.add(TrackMainFragmentShowType.AVERAGE_VERTICAL_IMPACT_RATE);
        arrayList.add(TrackMainFragmentShowType.ACTIVE_CALORIE);
        return arrayList;
    }

    private List<TrackMainFragmentShowType> g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TrackMainFragmentShowType.TOTAL_DISTANCES);
        arrayList.add(TrackMainFragmentShowType.TOTAL_TIME);
        arrayList.add(TrackMainFragmentShowType.CALORIE);
        arrayList.add(TrackMainFragmentShowType.PACE);
        arrayList.add(TrackMainFragmentShowType.POWER);
        arrayList.add(TrackMainFragmentShowType.CONTACT_TIME);
        arrayList.add(TrackMainFragmentShowType.VERTICAL_OSCILLATION);
        arrayList.add(TrackMainFragmentShowType.STEPS);
        arrayList.add(TrackMainFragmentShowType.STEP_RATE);
        arrayList.add(TrackMainFragmentShowType.SPEED);
        arrayList.add(TrackMainFragmentShowType.GROUND_IMPACT);
        arrayList.add(TrackMainFragmentShowType.EVERSION_EXCURSION);
        arrayList.add(TrackMainFragmentShowType.SWING_ANGLE);
        arrayList.add(TrackMainFragmentShowType.JUMP_DURATION);
        arrayList.add(TrackMainFragmentShowType.GROUND_TO_AIR_RATIO);
        arrayList.add(TrackMainFragmentShowType.GC_TIME_BALANCE);
        arrayList.add(TrackMainFragmentShowType.VERTICAL_RATIO);
        arrayList.add(TrackMainFragmentShowType.IMPACT_PEAK);
        arrayList.add(TrackMainFragmentShowType.AVERAGE_VERTICAL_IMPACT_RATE);
        arrayList.add(TrackMainFragmentShowType.ACTIVE_CALORIE);
        arrayList.add(TrackMainFragmentShowType.POWER);
        return arrayList;
    }
}
