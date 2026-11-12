package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class s9 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20477e;

    static {
        bk bkVar = new bk("eqn_horse_arrhythmia", 480);
        f20477e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("is_arrhythmia_detected", 0, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("missed_beats_count", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("total_beat_counts", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public s9() {
        super(wb.b(480));
    }

    public s9(bk bkVar) {
        super(bkVar);
    }
}
