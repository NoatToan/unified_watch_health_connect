package bs2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class nw extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20363e;

    static {
        bk bkVar = new bk("stride", 45);
        f20363e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("time256", 0, 2, 256.0d, 0.0d, "s", false, znVar));
        bkVar.f19753c.get(1).f20459h.add(new vc(8, false, 8, 256.0d, 0.0d));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("duration", 1, 132, 256.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("speed", 2, 132, 256.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("distance", 3, 132, 256.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("cum_distance", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 256.0d, 0.0d, "m", false, zn.UINT32));
        bkVar.e(new rc("count", 5, 132, 1.0d, 0.0d, "strides", false, znVar2));
        bkVar.e(new rc("filtered_speed", 6, 132, 256.0d, 0.0d, "m/s", false, znVar2));
        bkVar.e(new rc("filtered_cadence", 7, 2, 1.0d, 0.0d, "strides/min", false, znVar));
        bkVar.e(new rc("fractional_timestamp", 8, 132, 32768.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("event_time", 9, 132, 256.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc(NotificationConstants.KEY_DATA_MIME_TYPE, 10, 0, 1.0d, 0.0d, "", false, zn.DSI_MOTION_EVENT_TYPE));
        bkVar.e(new rc("event_status", 11, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(12).f20459h.add(new vc(12, false, 1, 1.0d, 0.0d));
        bkVar.f19753c.get(12).f20459h.add(new vc(13, false, 1, 1.0d, 0.0d));
        bkVar.f19753c.get(12).f20459h.add(new vc(14, false, 1, 1.0d, 0.0d));
        bkVar.f19753c.get(12).f20459h.add(new vc(15, false, 1, 1.0d, 0.0d));
        bkVar.f19753c.get(12).f20459h.add(new vc(16, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(12).f20459h.add(new vc(20, false, 1, 1.0d, 0.0d));
        bkVar.f19753c.get(12).f20459h.add(new vc(15, false, 7, 1.0d, 0.0d));
        bkVar.e(new rc("timeout_flag", 12, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("stride_flag", 13, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("cycle_flag", 14, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("reserved_flag", 15, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("events_since_idle", 16, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("stride_status", 17, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("gear", 18, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("global_event_count", 19, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("torso_e_flag", 20, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public nw() {
        super(wb.b(45));
    }

    public nw(bk bkVar) {
        super(bkVar);
    }
}
