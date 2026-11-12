package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class p2 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20394e;

    static {
        bk bkVar = new bk("bbp_timers", 361);
        f20394e = bkVar;
        zn znVar = zn.UINT32;
        bkVar.e(new rc("driving_time", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "seconds", false, znVar));
        bkVar.e(new rc("break_time", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "seconds", false, znVar));
        bkVar.e(new rc("total_driving_time", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "seconds", false, znVar));
        bkVar.e(new rc("excluded_driving_time", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "seconds", false, znVar));
        bkVar.e(new rc("state_change_timestamp", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("current_state", 5, 2, 1.0d, 0.0d, "", false, zn.BBP_STATE));
        bkVar.e(new rc("total_break_time", 6, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "seconds", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public p2() {
        super(wb.b(361));
    }

    public p2(bk bkVar) {
        super(bkVar);
    }
}
