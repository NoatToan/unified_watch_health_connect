package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class dx extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20065e;

    static {
        bk bkVar = new bk("system_user_behavior", 291);
        f20065e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("system_event", 0, 140, 1.0d, 0.0d, "", false, zn.SYSTEM_EVENT));
        bkVar.e(new rc("system_popup", 1, 0, 1.0d, 0.0d, "", false, zn.SYSTEM_POPUP));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("battery_percent", 2, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("session_id", 3, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("sport", 4, 0, 1.0d, 0.0d, "", false, zn.SPORT));
        bkVar.e(new rc("sub_sport", 5, 0, 1.0d, 0.0d, "", false, zn.SUB_SPORT));
        bkVar.e(new rc("connected_gps", 6, 0, 1.0d, 0.0d, "", false, zn.CONNECTED_GPS));
        bkVar.e(new rc("hnd_cal_type", 7, 0, 1.0d, 0.0d, "", false, zn.HND_CAL_TYPE));
        bkVar.e(new rc("hnd_cal_event", 8, 140, 1.0d, 0.0d, "", false, zn.HND_CAL_EVENT));
        bkVar.e(new rc("smrt_noti_cnt", 9, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public dx() {
        super(wb.b(291));
    }

    public dx(bk bkVar) {
        super(bkVar);
    }
}
