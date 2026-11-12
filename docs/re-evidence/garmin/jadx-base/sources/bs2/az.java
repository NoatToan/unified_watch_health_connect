package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class az extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19683e;

    static {
        bk bkVar = new bk("true_up", 198);
        f19683e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("snapshot_time", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("calories", 1, 132, 1.0d, 0.0d, "kcal", false, znVar2));
        zn znVar3 = zn.UINT32;
        bkVar.e(new rc("distance", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("steps", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "steps", false, znVar3));
        bkVar.e(new rc("active_calories", 4, 132, 1.0d, 0.0d, "kcal", false, znVar2));
        bkVar.e(new rc("calories_in", 5, 132, 1.0d, 0.0d, "kcal", false, znVar2));
        bkVar.e(new rc("ascent", 6, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("descent", 7, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("moderate_activity_minutes", 8, 132, 1.0d, 0.0d, "minutes", false, znVar2));
        bkVar.e(new rc("vigorous_activity_minutes", 9, 132, 1.0d, 0.0d, "minutes", false, znVar2));
        bkVar.e(new rc("bmr_calories", 10, 132, 1.0d, 0.0d, "kcal", false, znVar2));
        bkVar.e(new rc("local_snapshot_time", 11, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("moderate_weekly_activity_minutes", 12, 132, 1.0d, 0.0d, "minutes", false, znVar2));
        bkVar.e(new rc("vigorous_weekly_activity_minutes", 13, 132, 1.0d, 0.0d, "minutes", false, znVar2));
        bkVar.e(new rc("current_day_resting_heart_rate_timestamp", 14, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        zn znVar4 = zn.UINT8;
        bkVar.e(new rc("resting_heart_rate", 15, 2, 1.0d, 0.0d, "bpm", false, znVar4));
        bkVar.e(new rc("current_day_resting_heart_rate", 16, 2, 1.0d, 0.0d, "bpm", false, znVar4));
        zn znVar5 = zn.BOOL;
        bkVar.e(new rc("daily_step_goal_achieved", 17, 0, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("daily_floors_climbed_goal_achieved", 18, 0, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("current_daily_step_goal_streak", 19, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("current_daily_floors_climbed_streak", 20, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("body_battery", 21, 2, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("body_battery_charged", 22, 2, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("body_battery_drained", 23, 2, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("body_battery_max", 24, 2, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("body_battery_start", 25, 2, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("pushes", 26, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("current_daily_pushes_goal_streak", 27, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("daily_pushes_goal_achieved", 28, 0, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("pushes_distance", 29, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar3));
        zn znVar6 = zn.SINT16;
        bkVar.e(new rc("stress_level_value", 30, 131, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("average_stress_intensity", 31, 1, 1.0d, 0.0d, "", false, zn.SINT8));
        bkVar.e(new rc("stress_overall", 32, 131, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("stress_rest_duration_s", 33, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("stress_low_duration_s", 34, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("stress_medium_duration_s", 35, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("stress_high_duration_s", 36, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("body_battery_level", 37, 0, 1.0d, 0.0d, "", false, zn.BODY_BATTERY_LEVEL));
        bkVar.e(new rc("body_battery_dynamic_feedback_short", 38, 132, 1.0d, 0.0d, "", false, zn.BODY_BATTERY_DYNAMIC_FEEDBACK_SHORT));
        bkVar.e(new rc("body_battery_dynamic_feedback_long", 39, 132, 1.0d, 0.0d, "", false, zn.BODY_BATTERY_DYNAMIC_FEEDBACK_LONG));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public az() {
        super(wb.b(198));
    }

    public az(bk bkVar) {
        super(bkVar);
    }
}
