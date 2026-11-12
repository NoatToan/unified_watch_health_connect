package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class ok extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20382e;

    static {
        bk bkVar = new bk("metrics_info", 241);
        f20382e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("local_timestamp", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.LOCAL_DATE_TIME));
        bkVar.e(new rc("training_paused", 1, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ok() {
        super(wb.b(241));
    }

    public ok(bk bkVar) {
        super(bkVar);
    }
}
