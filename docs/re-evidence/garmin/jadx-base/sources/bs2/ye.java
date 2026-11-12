package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class ye extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20688e;

    static {
        bk bkVar = new bk("golf_training_info", 416);
        f20688e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("training_type", 0, 0, 1.0d, 0.0d, "", false, zn.GOLF_TRAINING_TYPE));
        bkVar.e(new rc("num_swings", 1, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ye() {
        super(wb.b(416));
    }

    public ye(bk bkVar) {
        super(bkVar);
    }
}
