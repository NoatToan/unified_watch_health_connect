package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class mz extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20321e;

    static {
        bk bkVar = new bk("ui_active_comment", 76);
        f20321e = bkVar;
        bkVar.e(new rc("comment_index", 0, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("comment_value", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("comment_decimals", 2, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public mz() {
        super(wb.b(76));
    }

    public mz(bk bkVar) {
        super(bkVar);
    }
}
