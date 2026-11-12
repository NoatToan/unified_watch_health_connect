package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class gn extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20170e;

    static {
        bk bkVar = new bk("personal_rep_record", 331);
        f20170e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("max", 1, 132, 100.0d, 0.0d, "kg", false, zn.UINT16));
        bkVar.e(new rc("exercise", 2, 2, 1.0d, 0.0d, "", false, zn.PR_REP_EXERCISE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public gn() {
        super(wb.b(331));
    }

    public gn(bk bkVar) {
        super(bkVar);
    }
}
