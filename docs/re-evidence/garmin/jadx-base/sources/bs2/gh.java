package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class gh extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20166e;

    static {
        bk bkVar = new bk("hsa_event", 315);
        f20166e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("event_id", 0, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public gh() {
        super(wb.b(315));
    }

    public gh(bk bkVar) {
        super(bkVar);
    }
}
