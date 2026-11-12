package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class t3 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20570e;

    static {
        bk bkVar = new bk("body_battery_dynamic_feedback_event", 408);
        f20570e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("level", 0, 0, 1.0d, 0.0d, "", false, zn.BODY_BATTERY_LEVEL));
        bkVar.e(new rc("feedback_short", 1, 132, 1.0d, 0.0d, "", false, zn.BODY_BATTERY_DYNAMIC_FEEDBACK_SHORT));
        bkVar.e(new rc("feedback_long", 2, 132, 1.0d, 0.0d, "", false, zn.BODY_BATTERY_DYNAMIC_FEEDBACK_LONG));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public t3() {
        super(wb.b(408));
    }

    public t3(bk bkVar) {
        super(bkVar);
    }
}
