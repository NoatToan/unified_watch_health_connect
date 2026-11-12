package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.mapbox.common.HttpHeaders;

/* JADX INFO: loaded from: classes11.dex */
public class od extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20377e;

    static {
        bk bkVar = new bk("firstbeat_profile", 79);
        f20377e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("max_met", 0, 132, 1024.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.UINT8;
        bkVar.e(new rc(HttpHeaders.AGE, 1, 2, 1.0d, 0.0d, "years", false, znVar3));
        bkVar.e(new rc("height", 2, 2, 100.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("weight", 3, 132, 10.0d, 0.0d, "kg", false, znVar2));
        bkVar.e(new rc("gender", 4, 0, 1.0d, 0.0d, "", false, zn.GENDER));
        bkVar.e(new rc("activity_class", 5, 0, 1.0d, 0.0d, "", false, zn.ACTIVITY_CLASS));
        bkVar.e(new rc("max_hr", 6, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("fb_status", 7, 1, 1.0d, 0.0d, "", false, zn.SINT8));
        bkVar.e(new rc("resource_recovery", 8, 132, 1.0d, 0.0d, "minutes", false, znVar2));
        bkVar.e(new rc("monthly_load", 9, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("minimal_hr", 10, 2, 1.0d, 0.0d, "bpm", false, znVar3));
        bkVar.e(new rc("anaerobic_threshold_bpm", 11, 132, 1.0d, 0.0d, "bpm", false, znVar2));
        bkVar.e(new rc("anaerobic_threshold_watts", 12, 132, 1.0d, 0.0d, "watts", false, znVar2));
        bkVar.e(new rc("anaerobic_threshold_kmh", 13, 132, 10.0d, 0.0d, "km/h", false, znVar2));
        bkVar.e(new rc("max_body_status", 14, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("stress_balance", 15, 2, 1.0d, 0.0d, "", false, znVar3));
        zn znVar4 = zn.UINT32;
        bkVar.e(new rc("date_id", 16, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar4));
        zn znVar5 = zn.SINT32;
        bkVar.e(new rc("maximal_met_heat", 17, 133, 65536.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("maximal_met_heat_alti", 18, 133, 65536.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("maximal_met_uncorrected", 19, 133, 65536.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("error_code", 20, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("average_sleep_hrd", 21, 133, 65536.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("average_sleep_mad", 22, 133, 65536.0d, 0.0d, "", false, znVar5));
        zn znVar6 = zn.SINT16;
        bkVar.e(new rc("time_zone_offset", 23, 131, 1.0d, 0.0d, "minutes", false, znVar6));
        bkVar.e(new rc("anaerobic_work_capacity", 24, 2, 1.0d, 0.0d, "percent", false, znVar3));
        zn znVar7 = zn.LOCALTIME_INTO_DAY;
        bkVar.e(new rc("wake_time", 25, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar7));
        bkVar.e(new rc("sleep_time", 26, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar7));
        bkVar.e(new rc("running_anaerobic_work_capacity", 27, 2, 1.0d, 0.0d, "kcal", false, znVar3));
        bkVar.e(new rc("cycling_anaerobic_work_capacity", 28, 2, 1.0d, 0.0d, "kcal", false, znVar3));
        bkVar.e(new rc("running_maximal_tolerable_distance", 29, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar4));
        bkVar.e(new rc("cycling_maximal_tolerable_distance", 30, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar4));
        bkVar.e(new rc("load_based_stamina_potential", 31, 2, 1.0d, 0.0d, "%", false, znVar3));
        bkVar.e(new rc("distance_based_stamina_potential", 32, 2, 1.0d, 0.0d, "%", false, znVar3));
        bkVar.e(new rc("recovery_time_latest", 33, 132, 1.0d, 0.0d, "minutes", false, znVar2));
        bkVar.e(new rc("maximal_met_confidence_interval", 34, 132, 1000.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("maximal_met_date", 35, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("average_sleep_mad_mean_rri", 36, 133, 65536.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("acceleration_gradient_noise_level", 37, 131, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("sleep_need", 38, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("previous_wakeup_time", 39, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("wheelchair_user", 40, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("running_training_history_multiplier", 41, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("cycling_training_history_multiplier", 42, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("pack_weight", 43, 132, 10.0d, 0.0d, "kg", false, znVar2));
        bkVar.e(new rc("sport", 44, 0, 1.0d, 0.0d, "", false, zn.SPORT));
        bkVar.e(new rc("sub_sport", 45, 0, 1.0d, 0.0d, "", false, zn.SUB_SPORT));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public od() {
        super(wb.b(79));
    }

    public od(bk bkVar) {
        super(bkVar);
    }
}
