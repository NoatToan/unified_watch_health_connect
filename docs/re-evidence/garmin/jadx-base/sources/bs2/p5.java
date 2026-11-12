package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class p5 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20398e;

    static {
        bk bkVar = new bk("club_total_stats", 322);
        f20398e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("club_tracking_round_cnt", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        zn znVar = zn.SINT16;
        bkVar.e(new rc("avg_strokes_gained_bunker", 1, 131, 100.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("avg_putts_per_hole", 2, 2, 100.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("chip_miss_percentage", 3, 131, 100.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public p5() {
        super(wb.b(322));
    }

    public p5(bk bkVar) {
        super(bkVar);
    }
}
