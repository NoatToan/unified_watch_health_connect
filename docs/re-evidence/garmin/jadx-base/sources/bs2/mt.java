package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class mt extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20319e;

    static {
        bk bkVar = new bk("sleep_disruption_severity_period", 470);
        f20319e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("severity", 0, 0, 1.0d, 0.0d, "", false, zn.SLEEP_DISRUPTION_SEVERITY));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public mt() {
        super(wb.b(470));
    }

    public mt(bk bkVar) {
        super(bkVar);
    }
}
