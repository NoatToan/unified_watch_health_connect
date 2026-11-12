package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class qd extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20430e;

    static {
        bk bkVar = new bk("firstbeat_results", 140);
        f20430e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("corrected_hr", 0, 2, 1.0d, 0.0d, "bpm", false, znVar));
        bkVar.e(new rc("maximal_hr", 1, 2, 1.0d, 0.0d, "bpm", false, znVar));
        zn znVar2 = zn.SINT32;
        bkVar.e(new rc("epoc", 2, 133, 65536.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("training_load_peak", 3, 133, 65536.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("training_effect", 4, 2, 10.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("energy_expenditure", 5, 133, 65536.0d, 0.0d, "kcal/min", false, znVar2));
        bkVar.e(new rc("cumulative_energy_expenditure", 6, 133, 65536.0d, 0.0d, "kcal", false, znVar2));
        bkVar.e(new rc("maximal_met", 7, 133, 65536.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.SINT8;
        bkVar.e(new rc("maximal_met_minutes", 8, 1, 1.0d, 0.0d, "minutes", false, znVar3));
        zn znVar4 = zn.UINT16;
        bkVar.e(new rc("resource_recovery", 9, 132, 1.0d, 0.0d, "minutes", false, znVar4));
        bkVar.e(new rc("version", 10, 132, 100.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("sport", 11, 0, 1.0d, 0.0d, "", false, zn.SPORT));
        bkVar.e(new rc("sub_sport", 12, 0, 1.0d, 0.0d, "", false, zn.SUB_SPORT));
        bkVar.e(new rc("minimal_hr", 13, 2, 1.0d, 0.0d, "bpm", false, znVar));
        bkVar.e(new rc("anaerobic_threshold_bpm", 14, 132, 1.0d, 0.0d, "bpm", false, znVar4));
        bkVar.e(new rc("anaerobic_threshold_watts", 15, 132, 1.0d, 0.0d, "watts", false, znVar4));
        bkVar.e(new rc("anaerobic_threshold_kmh", 16, 132, 10.0d, 0.0d, "km/h", false, znVar4));
        bkVar.e(new rc("daily_performance", 17, 1, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("body_status_index", 18, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("max_body_status", 19, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("anaerobic_training_effect", 20, 2, 10.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("respiratory_rate", 21, 133, 65536.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("aerobic_training_effect_desc_index", 22, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("anaerobic_training_effect_desc_index", 23, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("mean_mad", 24, 133, 65536.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("stress_balance", 25, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("training_load_session", 26, 133, 65536.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("maximal_met_heat", 27, 133, 65536.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("maximal_met_heat_alti", 28, 133, 65536.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("maximal_met_uncorrected", 29, 133, 65536.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("avg_temperature", 30, 1, 1.0d, 0.0d, "C", false, znVar3));
        bkVar.e(new rc("avg_humidity", 31, 1, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("avg_altitude", 32, 133, 65536.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("corrections_flag", 33, 2, 1.0d, 0.0d, "", false, znVar));
        zn znVar5 = zn.BOOL;
        bkVar.e(new rc("calibrated_data", 34, 0, 1.0d, 0.0d, "", false, znVar5));
        zn znVar6 = zn.UINT32;
        bkVar.e(new rc("total_elapsed_time", 35, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar6));
        bkVar.e(new rc("total_distance", 36, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar6));
        bkVar.e(new rc("training_load_peak_sum", 37, 133, 65536.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("training_load_peak_anaerobic", 38, 133, 65536.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("training_load_peak_sum_session", 39, 133, 65536.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("training_load_peak_anaerobic_session", 40, 133, 65536.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("workout_label", 41, 0, 1.0d, 0.0d, "", false, zn.TRAINING_EFFECT_LABEL));
        bkVar.e(new rc("heat_dose", 42, 2, 1.0d, 0.0d, "", false, znVar));
        zn znVar7 = zn.SINT16;
        bkVar.e(new rc("recovery_time_physical_activity", 43, 131, 1.0d, 0.0d, "", false, znVar7));
        bkVar.e(new rc("recovery_time_sleep", 44, 131, 1.0d, 0.0d, "", false, znVar7));
        bkVar.e(new rc("recovery_time_stress_and_recovery", 45, 131, 1.0d, 0.0d, "", false, znVar7));
        bkVar.e(new rc("recovery_time_phrase", 46, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("training_paused", 47, 0, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("end_timestamp_local", 48, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.LOCAL_DATE_TIME));
        bkVar.e(new rc("load_based_stamina_potential", 49, 2, 1.0d, 0.0d, "%", false, znVar));
        bkVar.e(new rc("distance_based_stamina_potential", 50, 2, 1.0d, 0.0d, "%", false, znVar));
        bkVar.e(new rc("hr_source", 51, 0, 1.0d, 0.0d, "", false, zn.MAX_MET_HEART_RATE_SOURCE));
        bkVar.e(new rc("speed_source", 52, 0, 1.0d, 0.0d, "", false, zn.MAX_MET_SPEED_SOURCE));
        bkVar.e(new rc("maximal_hr_estimate", 53, 2, 1.0d, 0.0d, "bpm", false, znVar));
        bkVar.e(new rc("maximal_hr_estimate_reliability", 54, 133, 65536.0d, 0.0d, "%", false, znVar2));
        bkVar.e(new rc("maximal_met_confidence_interval", 55, 132, 1000.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("fba_sport_mode", 56, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("ascent_low_intensity_minutes", 57, 132, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("ascent_high_intensity_minutes", 58, 132, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("multisport_session", 59, 0, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("total_ascent", 60, 132, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("total_descent", 61, 132, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("average_power", 62, 132, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("average_heart_rate", 63, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("user_weight", 64, 2, 1.0d, 0.0d, "kg", false, znVar));
        bkVar.e(new rc("unweighted_anaerobic_heart_rate", 65, 2, 1.0d, 0.0d, "bpm", false, znVar));
        bkVar.e(new rc("unweighted_anaerobic_power", 66, 132, 1.0d, 0.0d, "W", false, znVar4));
        bkVar.e(new rc("unweighted_anaerobic_speed", 67, 132, 1.0d, 0.0d, "km/h * 10", false, znVar4));
        bkVar.e(new rc("dsw_external_workout", 68, 132, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("activity_record_5k", 69, 132, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("activity_record_10k", 70, 132, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("activity_record_half", 71, 132, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("activity_record_marathon", 72, 132, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("bmrl_total_equivalent_distance", 73, 132, 1.0d, 0.0d, "dm", false, znVar4));
        bkVar.e(new rc("bmrl_downhill_equivalent_distance", 74, 132, 1.0d, 0.0d, "dm", false, znVar4));
        bkVar.e(new rc("bmrl_uphill_equivalent_distance", 75, 132, 1.0d, 0.0d, "dm", false, znVar4));
        bkVar.e(new rc("bmrl_sprint_equivalent_distance", 76, 132, 1.0d, 0.0d, "dm", false, znVar4));
        bkVar.e(new rc("bmrl_fast_equivalent_distance", 77, 132, 1.0d, 0.0d, "dm", false, znVar4));
        bkVar.e(new rc("running_economy", 78, 133, 65536.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("running_economy_reliability", 79, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public qd() {
        super(wb.b(140));
    }

    public qd(bk bkVar) {
        super(bkVar);
    }
}
