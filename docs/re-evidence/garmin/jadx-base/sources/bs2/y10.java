package bs2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class y10 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20682e;

    static {
        bk bkVar = new bk("weather_alert", 129);
        f20682e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("report_id", 0, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("issue_time", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("expire_time", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("severity", 3, 0, 1.0d, 0.0d, "", false, zn.WEATHER_SEVERITY));
        bkVar.e(new rc(NotificationConstants.KEY_DATA_MIME_TYPE, 4, 0, 1.0d, 0.0d, "", false, zn.WEATHER_SEVERE_TYPE));
        zn znVar2 = zn.SINT32;
        bkVar.e(new rc("position_lat", 5, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("position_long", 6, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public y10() {
        super(wb.b(129));
    }

    public y10(bk bkVar) {
        super(bkVar);
    }
}
