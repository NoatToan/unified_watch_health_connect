package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class i20 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20207e;

    static {
        bk bkVar = new bk("whr_diag", 233);
        f20207e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("fractional_timestamp", 1, 132, 32768.0d, 0.0d, "s", false, zn.UINT16));
        zn znVar = zn.BYTE;
        bkVar.e(new rc("page_data", 2, 13, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar));
    }

    public i20() {
        super(wb.b(233));
    }

    public i20(bk bkVar) {
        super(bkVar);
    }
}
