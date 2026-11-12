package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class f6 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20115e;

    static {
        bk bkVar = new bk("csv_info", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO);
        f20115e = bkVar;
        bkVar.e(new rc("col_index", 0, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("col_name", 1, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public f6() {
        super(wb.b(TsExtractor.TS_STREAM_TYPE_SPLICE_INFO));
    }

    public f6(bk bkVar) {
        super(bkVar);
    }
}
