package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class x3 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20662e;

    static {
        bk bkVar = new bk("body_battery_true_up_reconstruction", 464);
        f20662e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("parent_index", 0, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("snapshot_time", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("local_snapshot_time", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("body_battery", 3, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("body_battery_status", 4, 1, 1.0d, 0.0d, "", false, zn.BODY_BATTERY_STATUS));
        bkVar.e(new rc("stress_level_value", 5, 131, 1.0d, 0.0d, "", false, zn.SINT16));
        zn znVar2 = zn.SINT8;
        bkVar.e(new rc("average_stress_intensity", 6, 1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("body_battery_event_type", 7, 0, 1.0d, 0.0d, "", false, zn.BODY_BATTERY_EVENT_TYPE));
        bkVar.e(new rc("body_battery_event_duration_minutes", 8, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("body_battery_event_impact", 9, 1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("body_battery_event_feedback", 10, 0, 1.0d, 0.0d, "", false, zn.BODY_BATTERY_EVENT_FEEDBACK));
        bkVar.e(new rc("body_battery_event_feedback_short", 11, 0, 1.0d, 0.0d, "", false, zn.BODY_BATTERY_EVENT_FEEDBACK_SHORT));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public x3() {
        super(wb.b(464));
    }

    public x3(bk bkVar) {
        super(bkVar);
    }
}
