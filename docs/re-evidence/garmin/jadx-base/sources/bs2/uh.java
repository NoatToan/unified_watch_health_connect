package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class uh extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20599e;

    static {
        bk bkVar = new bk("hsa_stress_data", 306);
        f20599e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("processing_interval", 0, 132, 1.0d, 0.0d, "s", false, zn.UINT16));
        bkVar.e(new rc("stress_level", 1, 1, 1.0d, 0.0d, "s", false, zn.SINT8));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public uh() {
        super(wb.b(306));
    }

    public uh(bk bkVar) {
        super(bkVar);
    }
}
