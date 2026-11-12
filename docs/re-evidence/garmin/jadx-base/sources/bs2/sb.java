package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class sb extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20479e;

    static {
        bk bkVar = new bk("explore_reference", 462);
        f20479e = bkVar;
        bkVar.e(new rc("edm_timestamp", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.BYTE;
        bkVar.e(new rc("edm_uuid", 1, 13, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("reference_index", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar));
    }

    public sb() {
        super(wb.b(462));
    }

    public sb(bk bkVar) {
        super(bkVar);
    }
}
