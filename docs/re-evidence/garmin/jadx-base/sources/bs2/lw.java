package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class lw extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20288e;

    static {
        bk bkVar = new bk("stress_level", 227);
        f20288e = bkVar;
        bkVar.e(new rc("stress_level_value", 0, 131, 1.0d, 0.0d, "", false, zn.SINT16));
        bkVar.e(new rc("stress_level_time", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.SINT8;
        bkVar.e(new rc("average_stress_intensity", 2, 1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("body_battery", 3, 1, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("body_battery_status", 4, 1, 1.0d, 0.0d, "", false, zn.BODY_BATTERY_STATUS));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public lw() {
        super(wb.b(227));
    }

    public lw(bk bkVar) {
        super(bkVar);
    }
}
