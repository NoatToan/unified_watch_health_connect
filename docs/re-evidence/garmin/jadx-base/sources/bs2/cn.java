package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class cn extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20039e;

    static {
        bk bkVar = new bk("performance_capacity_results", 356);
        f20039e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("running_anaerobic_work_capacity", 0, 2, 1.0d, 0.0d, "kcal", false, znVar));
        bkVar.e(new rc("cycling_anaerobic_work_capacity", 1, 2, 1.0d, 0.0d, "kcal", false, znVar));
        zn znVar2 = zn.UINT32;
        bkVar.e(new rc("running_maximal_tolerable_distance", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("cycling_maximal_tolerable_distance", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar2));
        zn znVar3 = zn.UINT16;
        bkVar.e(new rc("cycling_anaerobic_threshold_power", 4, 132, 1.0d, 0.0d, "watts", false, znVar3));
        bkVar.e(new rc("running_training_history_multiplier", 5, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("cycling_training_history_multiplier", 6, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("running_anaerobic_threshold_power", 7, 132, 1.0d, 0.0d, "watts", false, znVar3));
        bkVar.e(new rc("running_anaerobic_threshold_hr", 8, 2, 1.0d, 0.0d, "bpm", false, znVar));
        bkVar.e(new rc("cycling_anaerobic_threshold_hr", 9, 2, 1.0d, 0.0d, "bpm", false, znVar));
        bkVar.e(new rc("running_anaerobic_threshold_speed", 10, 132, 10.0d, 0.0d, "km/h", false, znVar3));
        zn znVar4 = zn.BOOL;
        bkVar.e(new rc("running_anaerobic_threshold_notify", 11, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("cycling_anaerobic_threshold_notify", 12, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public cn() {
        super(wb.b(356));
    }

    public cn(bk bkVar) {
        super(bkVar);
    }
}
