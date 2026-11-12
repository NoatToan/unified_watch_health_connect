package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class rn extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20463e;

    static {
        bk bkVar = new bk("power_mode_profile", 321);
        f20463e = bkVar;
        bkVar.e(new rc("low_battery_alert", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.LOW_BATTERY_ALERT));
        zn znVar = zn.SINT32;
        bkVar.e(new rc("default_power_mode", 1, 133, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("alt_power_mode", 2, 133, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("alt_transition_time", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public rn() {
        super(wb.b(321));
    }

    public rn(bk bkVar) {
        super(bkVar);
    }
}
