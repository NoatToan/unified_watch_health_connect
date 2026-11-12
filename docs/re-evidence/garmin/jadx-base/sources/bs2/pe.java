package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class pe extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20401e;

    static {
        bk bkVar = new bk("gnss_ntfctn", 326);
        f20401e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("ntfctn_type", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "enum", false, znVar));
        bkVar.e(new rc("payload", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "unitless", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public pe() {
        super(wb.b(326));
    }

    public pe(bk bkVar) {
        super(bkVar);
    }
}
