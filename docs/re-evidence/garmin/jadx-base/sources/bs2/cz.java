package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class cz extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20042e;

    static {
        bk bkVar = new bk("true_up_reconstruction", 368);
        f20042e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("parent_index", 0, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("snapshot_time", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("local_snapshot_time", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        zn znVar2 = zn.UINT32;
        bkVar.e(new rc("steps", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "steps", false, znVar2));
        bkVar.e(new rc("ascent", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("descent", 5, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m", false, znVar2));
        zn znVar3 = zn.UINT16;
        bkVar.e(new rc("total_activity_minutes", 6, 132, 1.0d, 0.0d, "minutes", false, znVar3));
        bkVar.e(new rc("moderate_activity_minutes", 7, 132, 1.0d, 0.0d, "minutes", false, znVar3));
        bkVar.e(new rc("vigorous_activity_minutes", 8, 132, 1.0d, 0.0d, "minutes", false, znVar3));
        bkVar.e(new rc("active_calories", 9, 132, 1.0d, 0.0d, "kcal", false, znVar3));
        bkVar.e(new rc("body_battery", 10, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("body_battery_status", 11, 1, 1.0d, 0.0d, "", false, zn.BODY_BATTERY_STATUS));
        bkVar.e(new rc("pushes", 12, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("stress_level_value", 13, 131, 1.0d, 0.0d, "", false, zn.SINT16));
        zn znVar4 = zn.SINT8;
        bkVar.e(new rc("average_stress_intensity", 14, 1, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("body_battery_event_type", 15, 0, 1.0d, 0.0d, "", false, zn.BODY_BATTERY_EVENT_TYPE));
        bkVar.e(new rc("body_battery_event_duration_minutes", 16, 132, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("body_battery_event_impact", 17, 1, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("body_battery_event_feedback", 18, 0, 1.0d, 0.0d, "", false, zn.BODY_BATTERY_EVENT_FEEDBACK));
        bkVar.e(new rc("body_battery_event_data_move_iq_activity_type", 19, 0, 1.0d, 0.0d, "", false, zn.ACTIVITY_TYPE));
        bkVar.e(new rc("body_battery_event_data_move_iq_activity_subtype", 20, 0, 1.0d, 0.0d, "", false, zn.ACTIVITY_SUBTYPE));
        bkVar.e(new rc("body_battery_event_feedback_short", 21, 0, 1.0d, 0.0d, "", false, zn.BODY_BATTERY_EVENT_FEEDBACK_SHORT));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public cz() {
        super(wb.b(368));
    }

    public cz(bk bkVar) {
        super(bkVar);
    }
}
