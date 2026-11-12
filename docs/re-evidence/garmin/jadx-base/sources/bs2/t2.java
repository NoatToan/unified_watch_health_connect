package bs2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class t2 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20569e;

    static {
        bk bkVar = new bk("bike_data", 50);
        f20569e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("event_timestamp", 0, 132, 1024.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("event_count", 1, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc(NotificationConstants.KEY_DATA_MIME_TYPE, 2, 0, 1.0d, 0.0d, "", false, zn.BIKE_DATA_TYPE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public t2() {
        super(wb.b(50));
    }

    public t2(bk bkVar) {
        super(bkVar);
    }
}
