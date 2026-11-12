package bs2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;

/* JADX INFO: loaded from: classes11.dex */
public class p0 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20392e;

    static {
        bk bkVar = new bk("alarm_settings", 222);
        f20392e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("time", 0, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("days", 1, 140, 1.0d, 0.0d, "", false, zn.ALARM_DAYS_SET));
        zn znVar = zn.BOOL;
        bkVar.e(new rc("enabled", 2, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("sound", 3, 0, 1.0d, 0.0d, "", false, zn.TONE));
        bkVar.e(new rc("backlight", 4, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc(TtmlNode.ATTR_ID, 5, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("alarm_mesg", 6, 7, 1.0d, 0.0d, "", false, zn.STRING));
        zn znVar2 = zn.UINT8;
        bkVar.e(new rc("snooze_count", 7, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc(Constants.ScionAnalytics.PARAM_LABEL, 8, 0, 1.0d, 0.0d, "", false, zn.ALARM_LABEL));
        bkVar.e(new rc(NotificationConstants.KEY_DATA_MIME_TYPE, 9, 0, 1.0d, 0.0d, "", false, zn.ALARM_TYPE));
        bkVar.e(new rc("icon", 10, 0, 1.0d, 0.0d, "", false, zn.ALARM_ICON));
        bkVar.e(new rc("last_modified_time", 11, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("is_smart_wake", 12, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("volume", 13, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("vibration", 14, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("use_time_zone_position", 15, 0, 1.0d, 0.0d, "", false, znVar));
        zn znVar3 = zn.SINT32;
        bkVar.e(new rc("time_zone_lat", 16, 133, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("time_zone_long", 17, 133, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public p0() {
        super(wb.b(222));
    }

    public p0(bk bkVar) {
        super(bkVar);
    }
}
