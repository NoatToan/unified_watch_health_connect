package bs2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class qg extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20432e;

    static {
        bk bkVar = new bk("hrm_event", 48);
        f20432e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc(NotificationConstants.KEY_DATA_MIME_TYPE, 0, 0, 1.0d, 0.0d, "", false, zn.HRM_EVENT_TYPE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public qg() {
        super(wb.b(48));
    }

    public qg(bk bkVar) {
        super(bkVar);
    }
}
