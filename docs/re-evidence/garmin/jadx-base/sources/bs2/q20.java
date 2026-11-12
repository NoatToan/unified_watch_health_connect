package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class q20 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20423e;

    static {
        bk bkVar = new bk("workout", 26);
        f20423e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("sport", 4, 0, 1.0d, 0.0d, "", false, zn.SPORT));
        bkVar.e(new rc("capabilities", 5, 140, 1.0d, 0.0d, "", false, zn.WORKOUT_CAPABILITIES));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("num_valid_steps", 6, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("protection", 7, 132, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.STRING;
        bkVar.e(new rc("wkt_name", 8, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("estimated_duration_type", 9, 0, 1.0d, 0.0d, "", false, zn.WKT_ESTIMATED_DURATION));
        zn znVar3 = zn.UINT32;
        bkVar.e(new rc("estimated_duration_value", 10, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar3));
        bkVar.f19753c.get(7).f20460i.add(new pw("estimated_duration_time", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s"));
        bkVar.f19753c.get(7).f20460i.get(0).b(9, 0L);
        bkVar.f19753c.get(7).f20460i.add(new pw("estimated_duration_distance", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m"));
        bkVar.f19753c.get(7).f20460i.get(1).b(9, 1L);
        bkVar.e(new rc("sub_sport", 11, 0, 1.0d, 0.0d, "", false, zn.SUB_SPORT));
        bkVar.e(new rc("num_sessions", 12, 132, 1.0d, 0.0d, "", false, znVar));
        zn znVar4 = zn.BOOL;
        bkVar.e(new rc("session_transitions_enabled", 13, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("pool_length", 14, 132, 100.0d, 0.0d, "m", false, znVar));
        bkVar.e(new rc("pool_length_unit", 15, 0, 1.0d, 0.0d, "", false, zn.DISPLAY_MEASURE));
        zn znVar5 = zn.BYTE;
        bkVar.e(new rc("workout_source_id", 16, 13, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("wkt_description", 17, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("audio_note_uuid", 18, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("workout_type", 19, 0, 1.0d, 0.0d, "", false, zn.WORKOUT_TYPE));
        bkVar.e(new rc("workout_index", 20, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("duration_time", 21, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar3));
        bkVar.e(new rc("duration_distance", 22, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar3));
        zn znVar6 = zn.WORKOUT_DURATION_CALCULATION;
        bkVar.e(new rc("duration_time_calculation", 23, 0, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("duration_distance_calculation", 24, 0, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("is_wheelchair", 25, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar5));
    }

    public q20() {
        super(wb.b(26));
    }

    public q20(bk bkVar) {
        super(bkVar);
    }
}
