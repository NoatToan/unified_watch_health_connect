package bs2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class ln extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20281e;

    static {
        bk bkVar = new bk("power_curve", 280);
        f20281e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc(NotificationConstants.KEY_DATA_MIME_TYPE, 0, 0, 1.0d, 0.0d, "", false, zn.POWER_CURVE));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("duration", 1, 132, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("power", 2, 132, 1.0d, 0.0d, "watts", false, znVar));
        bkVar.e(new rc("exclude", 3, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ln() {
        super(wb.b(280));
    }

    public ln(bk bkVar) {
        super(bkVar);
    }
}
