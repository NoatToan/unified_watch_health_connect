package bs2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class v3 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20610e;

    static {
        bk bkVar = new bk("body_battery_event", 407);
        f20610e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc(NotificationConstants.KEY_DATA_MIME_TYPE, 0, 0, 1.0d, 0.0d, "", false, zn.BODY_BATTERY_EVENT_TYPE));
        bkVar.e(new rc("duration_minutes", 1, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("impact", 2, 1, 1.0d, 0.0d, "", false, zn.SINT8));
        bkVar.e(new rc("feedback", 3, 0, 1.0d, 0.0d, "", false, zn.BODY_BATTERY_EVENT_FEEDBACK));
        bkVar.e(new rc("data_move_iq_activity_type", 4, 0, 1.0d, 0.0d, "", false, zn.ACTIVITY_TYPE));
        bkVar.e(new rc("data_move_iq_activity_subtype", 5, 0, 1.0d, 0.0d, "", false, zn.ACTIVITY_SUBTYPE));
        bkVar.e(new rc("feedback_short", 6, 0, 1.0d, 0.0d, "", false, zn.BODY_BATTERY_EVENT_FEEDBACK_SHORT));
        bkVar.e(new rc("time_created", 7, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "seconds", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public v3() {
        super(wb.b(407));
    }

    public v3(bk bkVar) {
        super(bkVar);
    }
}
