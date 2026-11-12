package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class sh extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20510e;

    static {
        bk bkVar = new bk("hsa_step_data", 304);
        f20510e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("processing_interval", 0, 132, 1.0d, 0.0d, "s", false, zn.UINT16));
        bkVar.e(new rc("steps", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "steps", false, zn.UINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public sh() {
        super(wb.b(304));
    }

    public sh(bk bkVar) {
        super(bkVar);
    }
}
