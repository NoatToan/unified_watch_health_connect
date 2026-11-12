package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class re extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20461e;

    static {
        bk bkVar = new bk("gnss_sat_data_fit", 325);
        f20461e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("num_used_tracked", 0, 2, 1.0d, 0.0d, "bf", false, znVar));
        bkVar.e(new rc("num_lbe_cpe", 1, 2, 1.0d, 0.0d, "bf", false, znVar));
        bkVar.e(new rc("num_ape_hdop", 2, 2, 1.0d, 0.0d, "bf", false, znVar));
        bkVar.e(new rc("num_cno_low_mid", 3, 2, 1.0d, 0.0d, "bf", false, znVar));
        bkVar.e(new rc("num_cno_high_elev_low", 4, 2, 1.0d, 0.0d, "bf", false, znVar));
        bkVar.e(new rc("num_elev_mid_high", 5, 2, 1.0d, 0.0d, "bf", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public re() {
        super(wb.b(325));
    }

    public re(bk bkVar) {
        super(bkVar);
    }
}
