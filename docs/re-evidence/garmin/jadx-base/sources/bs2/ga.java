package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class ga extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20156e;

    static {
        bk bkVar = new bk("eqn_hr_zone_limits", 510);
        f20156e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("zone_1_lower_limit", 0, 132, 1.0d, 0.0d, "bpm", false, znVar));
        bkVar.e(new rc("zone_2_lower_limit", 1, 132, 1.0d, 0.0d, "bpm", false, znVar));
        bkVar.e(new rc("zone_3_lower_limit", 2, 132, 1.0d, 0.0d, "bpm", false, znVar));
        bkVar.e(new rc("zone_4_lower_limit", 3, 132, 1.0d, 0.0d, "bpm", false, znVar));
        bkVar.e(new rc("zone_5_lower_limit", 4, 132, 1.0d, 0.0d, "bpm", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ga() {
        super(wb.b(510));
    }

    public ga(bk bkVar) {
        super(bkVar);
    }
}
