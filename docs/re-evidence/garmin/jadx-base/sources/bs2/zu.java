package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class zu extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f21027e;

    static {
        bk bkVar = new bk("spindle_finish_spin_cal", 93);
        f21027e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("fractional_timestamp", 0, 132, 32768.0d, 0.0d, "s", false, zn.UINT16));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("pco_neg_index", 1, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("pco_pos_index", 2, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("pedal_hanger_index", 3, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("pedal_index", 4, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public zu() {
        super(wb.b(93));
    }

    public zu(bk bkVar) {
        super(bkVar);
    }
}
