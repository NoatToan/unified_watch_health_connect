package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class s20 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20474e;

    static {
        bk bkVar = new bk("workout_session", 158);
        f20474e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("sport", 0, 0, 1.0d, 0.0d, "", false, zn.SPORT));
        bkVar.e(new rc("sub_sport", 1, 0, 1.0d, 0.0d, "", false, zn.SUB_SPORT));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("num_valid_steps", 2, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("first_step_index", 3, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("pool_length", 4, 132, 100.0d, 0.0d, "m", false, znVar));
        bkVar.e(new rc("pool_length_unit", 5, 0, 1.0d, 0.0d, "", false, zn.DISPLAY_MEASURE));
        zn znVar2 = zn.UINT32;
        bkVar.e(new rc("duration_time", 6, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("duration_distance", 7, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar2));
        zn znVar3 = zn.WORKOUT_DURATION_CALCULATION;
        bkVar.e(new rc("duration_time_calculation", 8, 0, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("duration_distance_calculation", 9, 0, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("workout_index", 10, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public s20() {
        super(wb.b(158));
    }

    public s20(bk bkVar) {
        super(bkVar);
    }
}
