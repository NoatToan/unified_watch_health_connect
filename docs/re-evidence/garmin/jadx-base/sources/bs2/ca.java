package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class ca extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19778e;

    static {
        bk bkVar = new bk("eqn_horse_post_activity_summary", 481);
        f19778e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("average_heart_rate", 0, 132, 1.0d, 0.0d, "bpm", false, znVar));
        bkVar.e(new rc("max_heart_rate", 1, 132, 1.0d, 0.0d, "bpm", false, znVar));
        bkVar.e(new rc("max_speed", 2, 132, 1000.0d, 0.0d, "m/s", false, znVar));
        bkVar.e(new rc("avg_speed", 3, 132, 1000.0d, 0.0d, "m/s", false, znVar));
        bkVar.e(new rc("total_distance", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, zn.UINT32));
        bkVar.e(new rc("delta_temperature", 5, 131, 100.0d, 0.0d, "C", false, zn.SINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ca() {
        super(wb.b(481));
    }

    public ca(bk bkVar) {
        super(bkVar);
    }
}
