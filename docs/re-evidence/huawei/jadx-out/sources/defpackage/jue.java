package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.viewholder.TrackMainFragmentShowType;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import health.compact.a.LogAnonymous;
import health.compact.a.UnitUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class jue {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<TrackMainFragmentShowType, String> f39054b;

    static {
        HashMap map = new HashMap();
        f39054b = map;
        map.put(TrackMainFragmentShowType.TOTAL_TIME, "duration");
        map.put(TrackMainFragmentShowType.TOTAL_DISTANCES, "distance");
        map.put(TrackMainFragmentShowType.SPEED, "speed");
        map.put(TrackMainFragmentShowType.AVG_SPEED, "avgSpeed");
        map.put(TrackMainFragmentShowType.MAX_SPEED, "maxSpeed");
        map.put(TrackMainFragmentShowType.PACE, "pace");
        map.put(TrackMainFragmentShowType.HEART_RATE, IndoorEquipManagerApi.KEY_HEART_RATE);
        map.put(TrackMainFragmentShowType.TOTAL_DECLINE, BleConstants.TOTAL_DESCENT);
        map.put(TrackMainFragmentShowType.TOTAL_CLIMB, "totalCreep");
        map.put(TrackMainFragmentShowType.ACTIVE_CALORIE, HwExerciseConstants.JSON_NAME_ACTIVECALORIE);
        map.put(TrackMainFragmentShowType.CALORIE, "calorie");
        map.put(TrackMainFragmentShowType.ALTITUDE, "altitude");
        map.put(TrackMainFragmentShowType.CADENCE, "cadenceData");
        map.put(TrackMainFragmentShowType.POWER, "power");
        map.put(TrackMainFragmentShowType.SLOPE, "slope");
        map.put(TrackMainFragmentShowType.STEP_RATE, "stepRate");
        map.put(TrackMainFragmentShowType.STEPS, MedalConstants.EVENT_STEPS);
        map.put(TrackMainFragmentShowType.CONTACT_TIME, "groundContactTime");
        map.put(TrackMainFragmentShowType.GROUND_IMPACT, "mGroundImpactAcceleration");
        map.put(TrackMainFragmentShowType.EVERSION_EXCURSION, "eversion");
        map.put(TrackMainFragmentShowType.SWING_ANGLE, "swingAngle");
        map.put(TrackMainFragmentShowType.JUMP_DURATION, "hangTime");
        map.put(TrackMainFragmentShowType.GROUND_TO_AIR_RATIO, "flightRatio");
        map.put(TrackMainFragmentShowType.GC_TIME_BALANCE, "GCTimeBalance");
        map.put(TrackMainFragmentShowType.VERTICAL_OSCILLATION, "verticalOscillation");
        map.put(TrackMainFragmentShowType.VERTICAL_RATIO, "mVerticalRatio");
        map.put(TrackMainFragmentShowType.IMPACT_PEAK, "activePeak");
        map.put(TrackMainFragmentShowType.AVERAGE_VERTICAL_IMPACT_RATE, "verticalLoadingRate");
    }

    public static Map<TrackMainFragmentShowType, jvw> e(Bundle bundle) {
        if (bundle == null) {
            LogUtil.e("TrackDataConstructUtils", "getShowItemValueMap(), sportData == null");
            return null;
        }
        HashMap map = new HashMap(10);
        c(bundle, map);
        map.put(TrackMainFragmentShowType.HEART_RATE, f(y(d(bundle.getString(IndoorEquipManagerApi.KEY_HEART_RATE)))));
        map.put(TrackMainFragmentShowType.CONTACT_TIME, v(y(e(bundle, "groundContactTime", 0))));
        map.put(TrackMainFragmentShowType.GROUND_IMPACT, ac(y(e(bundle, "mGroundImpactAcceleration", 0))));
        map.put(TrackMainFragmentShowType.EVERSION_EXCURSION, w(y(e(bundle, "eversion", 0))));
        map.put(TrackMainFragmentShowType.SWING_ANGLE, an(y(e(bundle, "swingAngle", 0))));
        map.put(TrackMainFragmentShowType.JUMP_DURATION, aa(y(e(bundle, "hangTime", 0))));
        map.put(TrackMainFragmentShowType.GROUND_TO_AIR_RATIO, z(y(e(bundle, "flightRatio", 1))));
        map.put(TrackMainFragmentShowType.GC_TIME_BALANCE, x(y(e(bundle, "GCTimeBalance", 1))));
        map.put(TrackMainFragmentShowType.VERTICAL_OSCILLATION, ar(y(e(bundle, "verticalOscillation", 1))));
        map.put(TrackMainFragmentShowType.VERTICAL_RATIO, ap(y(b(bundle, "mVerticalRatio", 1))));
        map.put(TrackMainFragmentShowType.IMPACT_PEAK, ab(y(e(bundle, "activePeak", 1))));
        map.put(TrackMainFragmentShowType.AVERAGE_VERTICAL_IMPACT_RATE, n(y(e(bundle, "verticalLoadingRate", 0))));
        map.put(TrackMainFragmentShowType.CADENCE, b(bundle));
        map.put(TrackMainFragmentShowType.MAX_SPEED, ad(y(e(bundle, "maxSpeed", 2))));
        map.put(TrackMainFragmentShowType.AVG_SPEED, p(y(e(bundle, "avgSpeed", 2))));
        map.put(TrackMainFragmentShowType.POWER, c(bundle));
        map.put(TrackMainFragmentShowType.SLOPE, ah(y(h(bundle))));
        map.put(TrackMainFragmentShowType.AVG_POWER, d(bundle));
        map.put(TrackMainFragmentShowType.AVG_CADENCE, a(bundle));
        return map;
    }

    private static void c(Bundle bundle, Map<TrackMainFragmentShowType, jvw> map) {
        map.put(TrackMainFragmentShowType.TOTAL_TIME, al(y(bundle.getString("duration"))));
        map.put(TrackMainFragmentShowType.TOTAL_DISTANCES, g(y(g(bundle))));
        map.put(TrackMainFragmentShowType.PACE, af(y(izd.e(bundle.getString("pace")))));
        map.put(TrackMainFragmentShowType.SPEED, i(y(e(bundle, "speed", 2))));
        map.put(TrackMainFragmentShowType.CALORIE, am(y(b(bundle, "calorie"))));
        map.put(TrackMainFragmentShowType.ACTIVE_CALORIE, r(y(b(bundle, HwExerciseConstants.JSON_NAME_ACTIVECALORIE))));
        map.put(TrackMainFragmentShowType.STEP_RATE, ai(y(e(bundle, "stepRate", 0))));
        map.put(TrackMainFragmentShowType.STEPS, ae(y(e(bundle, MedalConstants.EVENT_STEPS, 0))));
        map.put(TrackMainFragmentShowType.ALTITUDE, j(y(c(bundle.getString("altitude")))));
        map.put(TrackMainFragmentShowType.TOTAL_CLIMB, aj(y(b(bundle.getString("totalCreep")))));
        map.put(TrackMainFragmentShowType.TOTAL_DECLINE, ak(y(e(bundle.getString(BleConstants.TOTAL_DESCENT)))));
    }

    public static jvw e(TrackMainFragmentShowType trackMainFragmentShowType, Bundle bundle) {
        jvw jvwVarH;
        if (trackMainFragmentShowType == null || bundle == null) {
            return null;
        }
        switch (AnonymousClass4.f39055b[trackMainFragmentShowType.ordinal()]) {
            case 1:
                jvwVarH = h(y(bundle.getString("countdownValue")));
                break;
            case 2:
                jvwVarH = u(y(bundle.getString("countdownValue")));
                break;
            case 3:
                jvwVarH = a(y(bundle.getString("countdownValue")));
                break;
            case 4:
                jvwVarH = aj(y(b(bundle.getString("totalCreep"))));
                break;
            case 5:
                jvwVarH = ak(y(e(bundle.getString(BleConstants.TOTAL_DESCENT))));
                break;
            case 6:
                jvwVarH = v(y(e(bundle, "groundContactTime", 0)));
                break;
            default:
                jvwVarH = b(bundle, trackMainFragmentShowType);
                break;
        }
        return jvwVarH == null ? a(bundle, trackMainFragmentShowType) : jvwVarH;
    }

    private static jvw b(Bundle bundle, TrackMainFragmentShowType trackMainFragmentShowType) {
        switch (trackMainFragmentShowType) {
            case GROUND_IMPACT:
                return ac(y(e(bundle, "mGroundImpactAcceleration", 0)));
            case EVERSION_EXCURSION:
                return w(y(e(bundle, "eversion", 0)));
            case SWING_ANGLE:
                return an(y(e(bundle, "swingAngle", 0)));
            case JUMP_DURATION:
                return aa(y(e(bundle, "hangTime", 0)));
            case GROUND_TO_AIR_RATIO:
                return z(y(e(bundle, "flightRatio", 1)));
            case IMPACT_PEAK:
                return ab(y(e(bundle, "activePeak", 1)));
            case AVERAGE_VERTICAL_IMPACT_RATE:
                return n(y(e(bundle, "verticalLoadingRate", 0)));
            case VERTICAL_RATIO:
                return ap(y(b(bundle, "mVerticalRatio", 1)));
            case VERTICAL_OSCILLATION:
                return ar(y(e(bundle, "verticalOscillation", 1)));
            case GC_TIME_BALANCE:
                return x(y(e(bundle, "GCTimeBalance", 1)));
            default:
                return null;
        }
    }

    private static jvw a(Bundle bundle, TrackMainFragmentShowType trackMainFragmentShowType) {
        switch (trackMainFragmentShowType) {
            case STEPS:
                return ae(y(e(bundle, MedalConstants.EVENT_STEPS, 0)));
            case ALTITUDE:
                return j(y(c(bundle.getString("altitude"))));
            case TOTAL_DISTANCES:
                return g(y(g(bundle)));
            case TOTAL_TIME:
                return al(y(bundle.getString("duration")));
            case SPEED:
                return i(y(e(bundle, "speed", 2)));
            case AVG_SPEED:
                return p(y(e(bundle, "avgSpeed", 2)));
            case MAX_SPEED:
                return ad(y(e(bundle, "maxSpeed", 2)));
            case CALORIE:
                return am(y(b(bundle, "calorie")));
            case ACTIVE_CALORIE:
                return r(y(b(bundle, HwExerciseConstants.JSON_NAME_ACTIVECALORIE)));
            default:
                return c(bundle, trackMainFragmentShowType);
        }
    }

    private static jvw c(Bundle bundle, TrackMainFragmentShowType trackMainFragmentShowType) {
        switch (trackMainFragmentShowType) {
            case HEART_RATE:
                return f(y(d(bundle.getString(IndoorEquipManagerApi.KEY_HEART_RATE))));
            case STEP_RATE:
                return ai(y(e(bundle, "stepRate", 0)));
            case PACE:
                return af(y(izd.e(bundle.getString("pace"))));
            case CADENCE:
                return b(bundle);
            case POWER:
                return c(bundle);
            case SLOPE:
                return ah(y(h(bundle)));
            case AVG_POWER:
                return d(bundle);
            case AVG_CADENCE:
                return a(bundle);
            default:
                LogUtil.e("TrackDataConstructUtils", "not a default type");
                return null;
        }
    }

    private static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            double d = ((double) Integer.parseInt(str)) / 10.0d;
            if (UnitUtil.f()) {
                return UnitUtil.e(UnitUtil.e(d, 1), 1, 0);
            }
            return UnitUtil.e(Double.parseDouble(String.valueOf(d)), 1, 0);
        } catch (NumberFormatException e) {
            LogUtil.e("TrackDataConstructUtils", LogAnonymous.b(e));
            return null;
        }
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            double d = ((double) Integer.parseInt(str)) / 10.0d;
            if (UnitUtil.f()) {
                return UnitUtil.e(UnitUtil.e(d, 1), 1, 0);
            }
            return UnitUtil.e(Double.parseDouble(String.valueOf(d)), 1, 0);
        } catch (NumberFormatException e) {
            LogUtil.e("TrackDataConstructUtils", LogAnonymous.b(e));
            return null;
        }
    }

    private static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            double d = ((double) Integer.parseInt(str)) / 10.0d;
            if (UnitUtil.f()) {
                return UnitUtil.e(UnitUtil.e(d, 1), 1, 0);
            }
            return UnitUtil.e(Double.parseDouble(String.valueOf(d)), 1, 0);
        } catch (NumberFormatException e) {
            LogUtil.e("TrackDataConstructUtils", LogAnonymous.b(e));
            return null;
        }
    }

    private static String d(String str) {
        if (!TextUtils.isEmpty(str)) {
            if ("0".equals(str) || str.equals(BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_invalid_data))) {
                str = BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_invalid_data);
            } else {
                try {
                    str = UnitUtil.e(Double.parseDouble(str), 1, 0);
                } catch (NumberFormatException e) {
                    LogUtil.e("TrackDataConstructUtils", "constructHeartRate NumberFormatException", e.getMessage());
                }
            }
        }
        return TextUtils.isEmpty(str) ? BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_invalid_data) : str;
    }

    private static jvw aa(String str) {
        return new jvw(BaseApplication.getContext().getResources().getString(R.string.IDS_aw_version2_duration_of_passage_with_unit), str, "");
    }

    private static jvw z(String str) {
        return new jvw(BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_ground_to_air_ratio), str, "");
    }

    private static jvw q(String str) {
        return new jvw(BaseApplication.getContext().getResources().getString(R.string.IDS_cadence_unit), str, "");
    }

    private static jvw k(String str) {
        return new jvw(qre.f(R.string.IDS_track_analog_cadence_unit), str, "");
    }

    private static jvw t(String str) {
        return new jvw(qre.f(R.string.IDS_track_average_cadence_with_unit), str, "");
    }

    private static jvw l(String str) {
        return new jvw(qre.f(R.string.IDS_track_avg_analog_cadence_unit), str, "");
    }

    private static jvw ag(String str) {
        return new jvw(qre.f(R.string.IDS_power_name_and_unit), str, "");
    }

    private static jvw m(String str) {
        return new jvw(qre.f(R.string.IDS_track_analog_power_with_unit), str, "");
    }

    private static jvw s(String str) {
        return new jvw(qre.f(R.string.IDS_track_average_power_with_unit), str, "");
    }

    private static jvw o(String str) {
        return new jvw(qre.f(R.string.IDS_track_average_analog_power_with_unit), str, "");
    }

    private static jvw ah(String str) {
        return new jvw(qre.f(R.string.IDS_fitness_equipment_slope), str, "");
    }

    private static jvw u(String str) {
        return new jvw(BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_map_remain_time), str, "");
    }

    private static jvw an(String str) {
        return new jvw(BaseApplication.getContext().getResources().getString(R.string.IDS_sport_noun_explain_paobuzhitai_baidongjiaodu_title), str, "");
    }

    private static jvw ac(String str) {
        return new jvw(BaseApplication.getContext().getResources().getString(R.string.IDS_running_posture_ground_impact_acceleration_with_unit), str, "");
    }

    private static jvw v(String str) {
        return new jvw(BaseApplication.getContext().getResources().getString(R.string.IDS_running_posture_ground_contact_time_with_unit), str, "");
    }

    private static jvw w(String str) {
        return new jvw(BaseApplication.getContext().getResources().getString(R.string.IDS_sport_noun_explain_paobuzhitai_waifanfudu_title), str, "");
    }

    private static jvw ak(String str) {
        return new jvw(BaseApplication.getContext().getResources().getString(UnitUtil.f() ? R.string.IDS_hwh_motiontrack_total_descent_with_imperial_unit : R.string.IDS_hwh_motiontrack_total_descent_with_unit), str, "");
    }

    private static jvw aj(String str) {
        return new jvw(BaseApplication.getContext().getResources().getString(UnitUtil.f() ? R.string.IDS_hwh_motiontrack_total_climbed_with_imperial_unit : R.string.IDS_hwh_motiontrack_total_climbed_with_unit), str, "");
    }

    private static jvw j(String str) {
        return new jvw(BaseApplication.getContext().getResources().getString(UnitUtil.f() ? R.string.IDS_hwh_motiontrack_alti_with_unit_foot : R.string.IDS_hwh_motiontrack_alti_with_unit_m), str, "");
    }

    private static jvw ae(String str) {
        return new jvw(BaseApplication.getContext().getResources().getString(R.string.IDS_settings_steps), str, "");
    }

    private static jvw af(String str) {
        return new jvw(BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_map_sport_peisu_1), str, "");
    }

    private static jvw al(String str) {
        return new jvw(BaseApplication.getContext().getResources().getString(R.string.IDS_workout_data_time), str, "");
    }

    private static jvw r(String str) {
        return new jvw(BaseApplication.getContext().getResources().getString(R.string.IDS_track_active_calories_kcal), str, "");
    }

    private static jvw am(String str) {
        return new jvw(qre.f(R.string.IDS_track_total_calories_kcal), str, "");
    }

    private static jvw ab(String str) {
        return new jvw(BaseApplication.getContext().getResources().getString(R.string.IDS_bolt_shock_peak), str, "");
    }

    private static jvw n(String str) {
        return new jvw(BaseApplication.getContext().getResources().getString(R.string.IDS_bolt_peak_impact_rate), str, "");
    }

    private static jvw ap(String str) {
        return new jvw(BaseApplication.getContext().getResources().getString(R.string.IDS_bolt_vertical_stride_rate), str, "");
    }

    private static jvw ar(String str) {
        if (!BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_invalid_data).equals(str) && UnitUtil.f()) {
            str = UnitUtil.e((float) UnitUtil.e(qrs.g(str), 0), 1, 1);
        }
        return new jvw(BaseApplication.getContext().getResources().getString(R.string.IDS_bolt_vertical_amplitude), str, "");
    }

    private static jvw x(String str) {
        return new jvw(BaseApplication.getContext().getResources().getString(R.string.IDS_bolt_balance_left_right_touches), str, "");
    }

    private static String y(String str) {
        return TextUtils.isEmpty(str) ? BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_invalid_data) : str;
    }

    private static String g(Bundle bundle) {
        if (bundle == null || bundle.getString("distance") == null) {
            return UnitUtil.e(0.0d, 1, 0);
        }
        try {
            return UnitUtil.e(Double.parseDouble(bundle.getString("distance")), 1, 2);
        } catch (NumberFormatException e) {
            LogUtil.e("TrackDataConstructUtils", "distance", e.getMessage());
            return "";
        }
    }

    private static String e(Bundle bundle, String str, int i) {
        String string = BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_invalid_data);
        if (bundle == null || TextUtils.isEmpty(bundle.getString(str))) {
            return string;
        }
        String string2 = bundle.getString(str);
        try {
            return UnitUtil.e(Double.parseDouble(string2), 1, i);
        } catch (NumberFormatException e) {
            LogUtil.e("TrackDataConstructUtils", str, e.getMessage());
            return string2;
        }
    }

    private static String a(Bundle bundle, String str) {
        return (bundle == null || !bundle.containsKey(str) || bundle.getInt(str) < 0) ? BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_invalid_data) : UnitUtil.e(bundle.getInt(str), 1, 0);
    }

    private static String c(Bundle bundle, String str) {
        return (bundle == null || !bundle.containsKey(str) || bundle.getInt(str) <= 0) ? qre.f(R.string.IDS_motiontrack_show_invalid_data) : UnitUtil.e(bundle.getInt(str), 1, 0);
    }

    private static jvw c(Bundle bundle) {
        if (((Boolean) jxk.f39163b.second).booleanValue()) {
            if (bundle.containsKey("threeSecPower")) {
                return ag(y(a(bundle, "threeSecPower")));
            }
            return ag(y(a(bundle, "power")));
        }
        int i = bundle.getInt(BleConstants.SPORT_TYPE);
        if (i == 258 || i == 264) {
            return ag(y(a(bundle, HwExerciseConstants.EXTEND_CYCLE_ANALOG_POWER)));
        }
        if (bundle.containsKey("threeSecAnalogPower")) {
            return m(y(a(bundle, "threeSecAnalogPower")));
        }
        return m(y(a(bundle, HwExerciseConstants.EXTEND_CYCLE_ANALOG_POWER)));
    }

    private static jvw d(Bundle bundle) {
        if (((Boolean) jxk.f39163b.second).booleanValue()) {
            return s(y(a(bundle, "avgPower")));
        }
        return o(y(a(bundle, "avgAnalogPower")));
    }

    private static jvw a(Bundle bundle) {
        if (((Boolean) jxk.f39162a.second).booleanValue()) {
            return t(y(c(bundle, "avgCadence")));
        }
        return l(y(c(bundle, "avgAnalogCadence")));
    }

    private static jvw b(Bundle bundle) {
        if (((Boolean) jxk.f39162a.second).booleanValue()) {
            return q(y(c(bundle, "cadenceData")));
        }
        return k(y(c(bundle, HwExerciseConstants.EXTEND_CYCLE_ANALOG_CADENCE)));
    }

    private static String b(Bundle bundle, String str, int i) {
        String string = BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_invalid_data);
        if (bundle == null || TextUtils.isEmpty(bundle.getString(str)) || bundle.getInt(str) == -101) {
            return string;
        }
        String string2 = bundle.getString(str);
        try {
            return UnitUtil.e(Double.parseDouble(string2), 2, i);
        } catch (NumberFormatException e) {
            LogUtil.e("TrackDataConstructUtils", str, e.getMessage());
            return string2;
        }
    }

    private static String h(Bundle bundle) {
        int i;
        return (bundle != null && (i = bundle.getInt("slope", Integer.MIN_VALUE)) > -101 && i < 101) ? UnitUtil.e(i, 2, 0) : BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_invalid_data);
    }

    private static String b(Bundle bundle, String str) {
        if (bundle == null || bundle.getString(str) == null) {
            return qre.f(R.string.IDS_motiontrack_show_invalid_data);
        }
        String strE = UnitUtil.e(0.0d, 1, 0);
        try {
            return UnitUtil.e(Double.parseDouble(bundle.getString(str)), 1, 0);
        } catch (NumberFormatException e) {
            LogUtil.e("TrackDataConstructUtils", str, e.getMessage());
            return strE;
        }
    }

    private static jvw f(String str) {
        return new jvw(BaseApplication.getContext().getResources().getString(R.string.IDS_main_watch_heart_rate_string), str, BaseApplication.getContext().getResources().getString(R.string.IDS_main_watch_heart_rate_unit_string));
    }

    private static jvw a(String str) {
        return new jvw(BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_map_remain_calorie), str, BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_kcal));
    }

    private static jvw h(String str) {
        if (UnitUtil.f()) {
            return new jvw(BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_map_remain_distance), str, BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_sport_unit_mi));
        }
        return new jvw(BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_map_remain_distance), str, BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_sport_unit_km));
    }

    private static jvw ai(String str) {
        return new jvw(BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_detail_fm_heart_bupin_with_unit), str, "");
    }

    private static jvw i(String str) {
        int i;
        if (UnitUtil.f()) {
            i = R.string.IDS_hwh_motiontrack_show_speed_mi_hour;
        } else {
            i = R.string.IDS_hwh_motiontrack_show_speed_km_hour;
        }
        return new jvw(BaseApplication.getContext().getResources().getString(i), str, "");
    }

    private static jvw p(String str) {
        int i;
        if (UnitUtil.f()) {
            i = R.string.IDS_motiontrack_show_avgspeed_mi;
        } else {
            i = R.string.IDS_motiontrack_show_avgspeed_km;
        }
        return new jvw(BaseApplication.getContext().getResources().getString(i), str, "");
    }

    private static jvw ad(String str) {
        int i;
        if (UnitUtil.f()) {
            i = R.string.IDS_motiontrack_show_maxspeed_mi;
        } else {
            i = R.string.IDS_motiontrack_show_maxspeed_km;
        }
        return new jvw(BaseApplication.getContext().getResources().getString(i), str, "");
    }

    private static jvw g(String str) {
        if (UnitUtil.f()) {
            return new jvw(BaseApplication.getContext().getResources().getString(R.string.IDS_workout_data_distance_mi), str, "");
        }
        return new jvw(BaseApplication.getContext().getResources().getString(R.string.IDS_workout_data_distance_km), str, "");
    }

    public static String c(TrackMainFragmentShowType trackMainFragmentShowType) {
        if (trackMainFragmentShowType == TrackMainFragmentShowType.POWER && !((Boolean) jxk.f39163b.second).booleanValue()) {
            return HwExerciseConstants.EXTEND_CYCLE_ANALOG_POWER;
        }
        if (trackMainFragmentShowType == TrackMainFragmentShowType.CADENCE && !((Boolean) jxk.f39162a.second).booleanValue()) {
            return HwExerciseConstants.EXTEND_CYCLE_ANALOG_CADENCE;
        }
        return f39054b.get(trackMainFragmentShowType);
    }
}
