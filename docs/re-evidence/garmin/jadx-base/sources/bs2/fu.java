package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class fu extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20144e;

    static {
        bk bkVar = new bk("solar_instantaneous_data", 318);
        f20144e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("charge_percent", 0, 132, 100.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("charge_status", 1, 132, 1.0d, 0.0d, "", false, zn.SOLAR_CHARGE_STATUS_BITS));
        bkVar.e(new rc("quality", 2, 132, 1.0d, 0.0d, "", false, zn.SOLAR_QUALITY_BITS));
        bkVar.e(new rc("activity_time_gain_ms", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "ms", false, zn.UINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public fu() {
        super(wb.b(318));
    }

    public fu(bk bkVar) {
        super(bkVar);
    }
}
