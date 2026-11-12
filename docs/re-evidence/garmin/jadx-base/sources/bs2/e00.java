package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.mapbox.common.HttpHeaders;

/* JADX INFO: loaded from: classes11.dex */
public class e00 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20068e;

    static {
        bk bkVar = new bk("user_profile", 3);
        f20068e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.STRING;
        bkVar.e(new rc("friendly_name", 0, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("gender", 1, 0, 1.0d, 0.0d, "", false, zn.GENDER));
        zn znVar2 = zn.UINT8;
        bkVar.e(new rc(HttpHeaders.AGE, 2, 2, 1.0d, 0.0d, "years", false, znVar2));
        bkVar.e(new rc("height", 3, 2, 100.0d, 0.0d, "m", false, znVar2));
        zn znVar3 = zn.UINT16;
        bkVar.e(new rc("weight", 4, 132, 10.0d, 0.0d, "kg", false, znVar3));
        bkVar.e(new rc("language", 5, 0, 1.0d, 0.0d, "", false, zn.LANGUAGE));
        zn znVar4 = zn.DISPLAY_MEASURE;
        bkVar.e(new rc("elev_setting", 6, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("weight_setting", 7, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("resting_heart_rate", 8, 2, 1.0d, 0.0d, "bpm", false, znVar2));
        bkVar.e(new rc("default_max_running_heart_rate", 9, 2, 1.0d, 0.0d, "bpm", false, znVar2));
        bkVar.e(new rc("default_max_biking_heart_rate", 10, 2, 1.0d, 0.0d, "bpm", false, znVar2));
        bkVar.e(new rc("default_max_heart_rate", 11, 2, 1.0d, 0.0d, "bpm", false, znVar2));
        bkVar.e(new rc("hr_setting", 12, 0, 1.0d, 0.0d, "", false, zn.DISPLAY_HEART));
        bkVar.e(new rc("speed_setting", 13, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("dist_setting", 14, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("power_setting", 16, 0, 1.0d, 0.0d, "", false, zn.DISPLAY_POWER));
        bkVar.e(new rc("activity_class", 17, 0, 1.0d, 0.0d, "", false, zn.ACTIVITY_CLASS));
        bkVar.e(new rc("position_setting", 18, 0, 1.0d, 0.0d, "", false, zn.DISPLAY_POSITION));
        bkVar.e(new rc("rmr", 19, 132, 1.0d, 0.0d, "kcal/day", false, znVar3));
        bkVar.e(new rc("active_time", 20, 2, 1.0d, 0.0d, "min", false, znVar2));
        bkVar.e(new rc("temperature_setting", 21, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("local_id", 22, 132, 1.0d, 0.0d, "", false, zn.USER_LOCAL_ID));
        zn znVar5 = zn.BYTE;
        bkVar.e(new rc("global_id", 23, 13, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("birth_year", 24, 2, 1.0d, -1900.0d, "", false, znVar2));
        bkVar.e(new rc("avg_cycle_length", 25, 132, 10000.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("pressure_setting", 26, 0, 1.0d, 0.0d, "", false, zn.PRESSURE_MEASURE));
        bkVar.e(new rc("handedness", 27, 0, 1.0d, 0.0d, "", false, zn.HANDEDNESS));
        zn znVar6 = zn.LOCALTIME_INTO_DAY;
        bkVar.e(new rc("wake_time", 28, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("sleep_time", 29, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("height_setting", 30, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("user_running_step_length", 31, 132, 1000.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("user_walking_step_length", 32, 132, 1000.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("firstbeat_monthly_load", 33, 132, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("firstbeat_recovery_time", 34, 132, 1.0d, 0.0d, "", false, znVar3));
        zn znVar7 = zn.UINT32;
        bkVar.e(new rc("firstbeat_recovery_time_start", 35, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar7));
        bkVar.e(new rc("firstbeat_max_stress_score", 36, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("firstbeat_running_lt_kmh", 37, 132, 10.0d, 0.0d, "km/h", false, znVar3));
        bkVar.e(new rc("firstbeat_cycling_lt_watts", 38, 132, 1.0d, 0.0d, "", false, znVar3));
        zn znVar8 = zn.FLOAT32;
        bkVar.e(new rc("firstbeat_running_maxMET", 39, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar8));
        bkVar.e(new rc("firstbeat_cycling_maxMET", 40, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar8));
        zn znVar9 = zn.DATE_TIME;
        bkVar.e(new rc("firstbeat_running_lt_timestamp", 41, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar9));
        bkVar.e(new rc("firstbeat_cycling_lt_timestamp", 42, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar9));
        zn znVar10 = zn.BOOL;
        bkVar.e(new rc("resting_hr_auto_update_enabled", 43, 0, 1.0d, 0.0d, "", false, znVar10));
        bkVar.e(new rc("birth_day", 44, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("birth_month", 45, 10, 1.0d, 0.0d, "", false, zn.MONTH));
        bkVar.e(new rc("avatar", 46, 2, 1.0d, 0.0d, "", false, zn.AVATAR));
        bkVar.e(new rc("depth_setting", 47, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("dive_count", 49, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar7));
        bkVar.e(new rc("phone_number", 50, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("keep_user_name_private", 51, 0, 1.0d, 0.0d, "", false, znVar10));
        bkVar.e(new rc("active_minutes_calc_method", 52, 0, 1.0d, 0.0d, "", false, zn.ACTIVE_MINUTES_CALC_METHOD));
        bkVar.e(new rc("active_minutes_moderate_zone", 53, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("active_minutes_vigorous_zone", 54, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("swim_skill_level", 55, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("country_code", 56, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("training_paused", 57, 0, 1.0d, 0.0d, "", false, znVar10));
        bkVar.e(new rc("golf_dist_setting", 58, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("assistance_plus_enabled", 59, 0, 1.0d, 0.0d, "", false, znVar10));
        bkVar.e(new rc("suggested_workout_daily_preference_setting", 60, 0, 1.0d, 0.0d, "", false, zn.DAILY_SUGGESTED_WORKOUT_DAILY_PREFERENCE_TYPE));
        bkVar.e(new rc("wheelchair_mode_enabled", 61, 0, 1.0d, 0.0d, "", false, znVar10));
        bkVar.e(new rc("non_algorithm_gender", 62, 0, 1.0d, 0.0d, "", false, zn.NON_ALGORITHM_GENDER));
        bkVar.e(new rc("fluid_quantity_setting", 63, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("user_pushing_length", 64, 132, 1000.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("adaptive_coaching_running_target_type", 65, 0, 1.0d, 0.0d, "", false, zn.DAILY_SUGGESTED_WORKOUT_RUNNING_TARGET_TYPE));
        bkVar.e(new rc("adaptive_coaching_cycling_target_type", 66, 0, 1.0d, 0.0d, "", false, zn.DAILY_SUGGESTED_WORKOUT_CYCLING_TARGET_TYPE));
        bkVar.e(new rc("garmin_connect_full_name", 67, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("adaptive_coaching_gym_access", 68, 0, 1.0d, 0.0d, "", false, znVar10));
        bkVar.e(new rc("adaptive_coaching_plan_type", 69, 0, 1.0d, 0.0d, "", false, zn.ADAPTIVE_COACHING_PLAN_TYPE));
        bkVar.e(new rc("on_device_sleep_capable_count", 70, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar5));
    }

    public e00() {
        super(wb.b(3));
    }

    public e00(bk bkVar) {
        super(bkVar);
    }
}
