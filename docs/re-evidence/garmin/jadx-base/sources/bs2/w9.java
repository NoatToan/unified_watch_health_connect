package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class w9 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20640e;

    static {
        bk bkVar = new bk("eqn_horse_heart_rate_summary", 478);
        f20640e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("time_in_activity", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, zn.UINT32));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("zone_1_time_percentage", 1, 2, 1.0d, 0.0d, "%", false, znVar));
        bkVar.e(new rc("zone_2_time_percentage", 2, 2, 1.0d, 0.0d, "%", false, znVar));
        bkVar.e(new rc("zone_3_time_percentage", 3, 2, 1.0d, 0.0d, "%", false, znVar));
        bkVar.e(new rc("zone_4_time_percentage", 4, 2, 1.0d, 0.0d, "%", false, znVar));
        bkVar.e(new rc("zone_5_time_percentage", 5, 2, 1.0d, 0.0d, "%", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public w9() {
        super(wb.b(478));
    }

    public w9(bk bkVar) {
        super(bkVar);
    }
}
