package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class ia extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20211e;

    static {
        bk bkVar = new bk("eqn_linking_num", 492);
        f20211e = bkVar;
        bkVar.e(new rc("linking_num", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ia() {
        super(wb.b(492));
    }

    public ia(bk bkVar) {
        super(bkVar);
    }
}
