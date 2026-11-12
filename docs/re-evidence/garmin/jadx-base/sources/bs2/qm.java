package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class qm extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20437e;

    static {
        bk bkVar = new bk("optimal_sleep_window_results", 506);
        f20437e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("sleep_need_baseline", 0, 132, 1.0d, 0.0d, "minutes", false, znVar));
        bkVar.e(new rc("sleep_window_start", 1, 132, 1.0d, 0.0d, "minutes", false, znVar));
        bkVar.e(new rc("sleep_window_end", 2, 132, 1.0d, 0.0d, "minutes", false, znVar));
        bkVar.e(new rc("feedback", 3, 0, 1.0d, 0.0d, "", false, zn.OPTIMAL_SLEEP_WINDOW_FEEDBACK));
        bkVar.e(new rc("ideal_sleep_window_midpoint", 4, 132, 1.0d, 0.0d, "minutes", false, znVar));
        bkVar.e(new rc("previous_night_sleep_midpoint", 5, 132, 1.0d, 0.0d, "minutes", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public qm() {
        super(wb.b(506));
    }

    public qm(bk bkVar) {
        super(bkVar);
    }
}
