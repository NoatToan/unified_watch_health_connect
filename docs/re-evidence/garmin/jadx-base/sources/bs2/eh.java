package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class eh extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20080e;

    static {
        bk bkVar = new bk("hsa_configuration_data", 389);
        f20080e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.BYTE;
        bkVar.e(new rc("data", 0, 13, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("data_size", 1, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar));
    }

    public eh() {
        super(wb.b(389));
    }

    public eh(bk bkVar) {
        super(bkVar);
    }
}
