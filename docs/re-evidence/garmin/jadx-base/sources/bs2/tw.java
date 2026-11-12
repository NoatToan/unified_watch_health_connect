package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class tw extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20587e;

    static {
        bk bkVar = new bk("subwave_diver_assistance_event", 465);
        f20587e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("is_start", 0, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("message_status", 1, 0, 1.0d, 0.0d, "", false, zn.SUBWAVE_STATUS_TYPE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public tw() {
        super(wb.b(465));
    }

    public tw(bk bkVar) {
        super(bkVar);
    }
}
