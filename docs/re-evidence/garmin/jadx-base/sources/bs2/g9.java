package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class g9 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20155e;

    static {
        bk bkVar = new bk("end_of_file", 276);
        f20155e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public g9() {
        super(wb.b(276));
    }

    public g9(bk bkVar) {
        super(bkVar);
    }
}
