package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class i0 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20204e;

    static {
        bk bkVar = new bk("afe_sample_data", 450);
        f20204e = bkVar;
        zn znVar = zn.UINT32;
        bkVar.e(new rc("timestamp_32k", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 32768.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("timestamp_ms", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("afe", 2, 133, 1.0d, 0.0d, "lsb", false, zn.SINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public i0() {
        super(wb.b(450));
    }

    public i0(bk bkVar) {
        super(bkVar);
    }
}
