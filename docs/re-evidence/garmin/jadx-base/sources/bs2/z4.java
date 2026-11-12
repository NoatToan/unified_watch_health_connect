package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class z4 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20709e;

    static {
        bk bkVar = new bk("camera_status", 219);
        f20709e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("case_status", 0, 2, 1.0d, 0.0d, "", false, zn.CASE_STATUS));
        bkVar.e(new rc("lens_status", 1, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("timestamp_ms", 2, 132, 1.0d, 0.0d, "ms", false, zn.UINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public z4() {
        super(wb.b(219));
    }

    public z4(bk bkVar) {
        super(bkVar);
    }
}
