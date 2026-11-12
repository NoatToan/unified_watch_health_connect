package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class w8 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20639e;

    static {
        bk bkVar = new bk("ebike_range_estimate", 349);
        f20639e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("range_remaining", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, zn.UINT32));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("model_error", 1, 2, 1.0d, 0.0d, "percent", false, znVar));
        bkVar.e(new rc("ebike_battery_level", 2, 2, 1.0d, 0.0d, "percent", false, znVar));
        bkVar.e(new rc("ebike_battery_level_estimate", 3, 2, 1.0d, 0.0d, "percent", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public w8() {
        super(wb.b(349));
    }

    public w8(bk bkVar) {
        super(bkVar);
    }
}
