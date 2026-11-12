package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class sk extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20536e;

    static {
        bk bkVar = new bk("monitoring_environment", 279);
        f20536e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("enhanced_altitude", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 5.0d, 500.0d, "m", false, zn.UINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public sk() {
        super(wb.b(279));
    }

    public sk(bk bkVar) {
        super(bkVar);
    }
}
