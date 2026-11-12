package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class he extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20190e;

    static {
        bk bkVar = new bk("glucose_tod_alert", 130);
        f20190e = bkVar;
        bkVar.e(new rc("alert_time", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.TIME_INTO_DAY));
        bkVar.e(new rc("rising_alert", 1, 0, 1.0d, 0.0d, "", false, zn.GLUCOSE_RISING_ALERT));
        bkVar.e(new rc("falling_alert", 2, 0, 1.0d, 0.0d, "", false, zn.GLUCOSE_FALLING_ALERT));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("low_alert_level", 3, 132, 1.0d, 0.0d, "mg/dL", false, znVar));
        bkVar.e(new rc("high_alert_level", 4, 132, 1.0d, 0.0d, "mg/dL", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public he() {
        super(wb.b(130));
    }

    public he(bk bkVar) {
        super(bkVar);
    }
}
