package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class j5 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20229e;

    static {
        bk bkVar = new bk("chrono_shot_session", 387);
        f20229e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("min_speed", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m/s", false, znVar));
        bkVar.e(new rc("max_speed", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m/s", false, znVar));
        bkVar.e(new rc("avg_speed", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m/s", false, znVar));
        bkVar.e(new rc("shot_count", 3, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("projectile_type", 4, 0, 1.0d, 0.0d, "", false, zn.PROJECTILE_TYPE));
        bkVar.e(new rc("grain_weight", 5, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 10.0d, 0.0d, "gr", false, znVar));
        bkVar.e(new rc("standard_deviation", 6, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m/s", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public j5() {
        super(wb.b(387));
    }

    public j5(bk bkVar) {
        super(bkVar);
    }
}
