package bs2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class dr extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20059e;

    static {
        bk bkVar = new bk("schedule", 28);
        f20059e = bkVar;
        bkVar.e(new rc("manufacturer", 0, 132, 1.0d, 0.0d, "", false, zn.MANUFACTURER));
        bkVar.e(new rc("product", 1, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.f19753c.get(1).f20460i.add(new pw("favero_product", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(1).f20460i.get(0).b(0, 263L);
        bkVar.f19753c.get(1).f20460i.add(new pw("garmin_product", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(1).f20460i.get(1).b(0, 1L);
        bkVar.f19753c.get(1).f20460i.get(1).b(0, 15L);
        bkVar.f19753c.get(1).f20460i.get(1).b(0, 13L);
        bkVar.f19753c.get(1).f20460i.get(1).b(0, 89L);
        bkVar.e(new rc("serial_number", 2, 140, 1.0d, 0.0d, "", false, zn.UINT32Z));
        bkVar.e(new rc("time_created", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.BOOL;
        bkVar.e(new rc("completed", 4, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc(NotificationConstants.KEY_DATA_MIME_TYPE, 5, 0, 1.0d, 0.0d, "", false, zn.SCHEDULE));
        bkVar.e(new rc("scheduled_time", 6, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.LOCAL_DATE_TIME));
        bkVar.e(new rc("training_plan_index", 7, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("goal_capability_increase", 8, 1, 1.0d, 0.0d, "", false, zn.SINT8));
        bkVar.e(new rc("skipped", 9, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("priority", 10, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public dr() {
        super(wb.b(28));
    }

    public dr(bk bkVar) {
        super(bkVar);
    }
}
