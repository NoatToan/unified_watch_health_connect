package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class vu extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20631e;

    static {
        bk bkVar = new bk("spindle_enter_cal_mode", 90);
        f20631e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("fractional_timestamp", 0, 132, 32768.0d, 0.0d, "s", false, zn.UINT16));
        bkVar.e(new rc("handedness", 1, 0, 1.0d, 0.0d, "", false, zn.SIDE));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("flash_key", 2, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("g_range", 3, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public vu() {
        super(wb.b(90));
    }

    public vu(bk bkVar) {
        super(bkVar);
    }
}
