package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class yk extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20692e;

    static {
        bk bkVar = new bk("monitoring", 55);
        f20692e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("device_index", 0, 2, 1.0d, 0.0d, "", false, zn.DEVICE_INDEX));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("calories", 1, 132, 1.0d, 0.0d, "kcal", false, znVar));
        zn znVar2 = zn.UINT32;
        bkVar.e(new rc("distance", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("cycles", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 2.0d, 0.0d, "cycles", false, znVar2));
        bkVar.f19753c.get(4).f20460i.add(new pw("steps", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "steps"));
        bkVar.f19753c.get(4).f20460i.get(0).b(5, 6L);
        bkVar.f19753c.get(4).f20460i.get(0).b(5, 1L);
        bkVar.f19753c.get(4).f20460i.add(new pw("strokes", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 2.0d, 0.0d, "strokes"));
        bkVar.f19753c.get(4).f20460i.get(1).b(5, 2L);
        bkVar.f19753c.get(4).f20460i.get(1).b(5, 5L);
        bkVar.e(new rc("active_time", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("activity_type", 5, 0, 1.0d, 0.0d, "", false, zn.ACTIVITY_TYPE));
        bkVar.e(new rc("activity_subtype", 6, 0, 1.0d, 0.0d, "", false, zn.ACTIVITY_SUBTYPE));
        bkVar.e(new rc("activity_level", 7, 0, 1.0d, 0.0d, "", false, zn.ACTIVITY_LEVEL));
        bkVar.e(new rc("distance_16", 8, 132, 1.0d, 0.0d, "100 * m", false, znVar));
        bkVar.e(new rc("cycles_16", 9, 132, 1.0d, 0.0d, "2 * cycles (steps)", false, znVar));
        bkVar.e(new rc("active_time_16", 10, 132, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("local_timestamp", 11, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.LOCAL_DATE_TIME));
        zn znVar3 = zn.SINT16;
        bkVar.e(new rc("temperature", 12, 131, 100.0d, 0.0d, "C", false, znVar3));
        bkVar.e(new rc("temperature_min", 14, 131, 100.0d, 0.0d, "C", false, znVar3));
        bkVar.e(new rc("temperature_max", 15, 131, 100.0d, 0.0d, "C", false, znVar3));
        bkVar.e(new rc("activity_time", 16, 132, 1.0d, 0.0d, "minutes", false, znVar));
        bkVar.e(new rc("active_calories", 19, 132, 1.0d, 0.0d, "kcal", false, znVar));
        zn znVar4 = zn.BYTE;
        bkVar.e(new rc("current_activity_type_intensity", 24, 13, 1.0d, 0.0d, "", false, znVar4));
        bkVar.f19753c.get(18).f20459h.add(new vc(5, false, 5, 1.0d, 0.0d));
        bkVar.f19753c.get(18).f20459h.add(new vc(28, false, 3, 1.0d, 0.0d));
        zn znVar5 = zn.UINT8;
        bkVar.e(new rc("timestamp_min_8", 25, 2, 1.0d, 0.0d, "min", false, znVar5));
        bkVar.e(new rc("timestamp_16", 26, 132, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("heart_rate", 27, 2, 1.0d, 0.0d, "bpm", false, znVar5));
        bkVar.e(new rc("intensity", 28, 2, 10.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("duration_min", 29, 132, 1.0d, 0.0d, "min", false, znVar));
        bkVar.e(new rc("duration", 30, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("ascent", 31, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("descent", 32, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("moderate_activity_minutes", 33, 132, 1.0d, 0.0d, "minutes", false, znVar));
        bkVar.e(new rc("vigorous_activity_minutes", 34, 132, 1.0d, 0.0d, "minutes", false, znVar));
        bkVar.e(new rc("ascent_total", 35, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("descent_total", 36, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("moderate_activity_minutes_total", 37, 132, 1.0d, 0.0d, "minutes", false, znVar));
        bkVar.e(new rc("vigorous_activity_minutes_total", 38, 132, 1.0d, 0.0d, "minutes", false, znVar));
        bkVar.e(new rc("dog_activity", 39, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("active_time_8", 40, 2, 1.0d, 0.0d, "s", false, znVar5));
        bkVar.e(new rc("pushes", 41, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar4));
    }

    public yk() {
        super(wb.b(55));
    }

    public yk(bk bkVar) {
        super(bkVar);
    }
}
