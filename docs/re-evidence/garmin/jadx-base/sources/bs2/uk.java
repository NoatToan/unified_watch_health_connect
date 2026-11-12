package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class uk extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20600e;

    static {
        bk bkVar = new bk("monitoring_hr_data", 211);
        f20600e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("resting_heart_rate", 0, 2, 1.0d, 0.0d, "bpm", false, znVar));
        bkVar.e(new rc("current_day_resting_heart_rate", 1, 2, 1.0d, 0.0d, "bpm", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public uk() {
        super(wb.b(211));
    }

    public uk(bk bkVar) {
        super(bkVar);
    }
}
