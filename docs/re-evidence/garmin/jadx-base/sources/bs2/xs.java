package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class xs extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20675e;

    static {
        bk bkVar = new bk("shot_timer_settings", 487);
        f20675e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.BOOL;
        bkVar.e(new rc("auto_stop_enabled", 0, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("delay_mode", 1, 0, 1.0d, 0.0d, "", false, zn.SHOT_TIMER_DELAY_MODE));
        zn znVar2 = zn.UINT32;
        bkVar.e(new rc("delay_time", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("drill_mode", 3, 0, 1.0d, 0.0d, "", false, zn.SHOT_TIMER_MODE));
        bkVar.e(new rc("environment", 4, 0, 1.0d, 0.0d, "", false, zn.SHOT_TIMER_ENVIRONMENT));
        bkVar.e(new rc("par_alert_enabled", 5, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("par_time", 6, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar2));
        zn znVar3 = zn.UINT16;
        bkVar.e(new rc("set_count", 7, 132, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("total_shots", 8, 132, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public xs() {
        super(wb.b(487));
    }

    public xs(bk bkVar) {
        super(bkVar);
    }
}
