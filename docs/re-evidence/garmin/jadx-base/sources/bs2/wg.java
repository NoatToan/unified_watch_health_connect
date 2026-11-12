package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class wg extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20648e;

    static {
        bk bkVar = new bk("hrv_status_summary", 370);
        f20648e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("weekly_average", 0, 132, 128.0d, 0.0d, "ms", false, znVar));
        bkVar.e(new rc("last_night_average", 1, 132, 128.0d, 0.0d, "ms", false, znVar));
        bkVar.e(new rc("last_night_5_min_high", 2, 132, 128.0d, 0.0d, "ms", false, znVar));
        bkVar.e(new rc("baseline_low_upper", 3, 132, 128.0d, 0.0d, "ms", false, znVar));
        bkVar.e(new rc("baseline_balanced_lower", 4, 132, 128.0d, 0.0d, "ms", false, znVar));
        bkVar.e(new rc("baseline_balanced_upper", 5, 132, 128.0d, 0.0d, "ms", false, znVar));
        bkVar.e(new rc("status", 6, 0, 1.0d, 0.0d, "", false, zn.HRV_STATUS));
        bkVar.e(new rc("feedback", 7, 0, 1.0d, 0.0d, "", false, zn.HRV_STATUS_FEEDBACK));
        bkVar.e(new rc("marker", 8, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 65536.0d, 0.0d, "%", false, zn.UINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public wg() {
        super(wb.b(370));
    }

    public wg(bk bkVar) {
        super(bkVar);
    }
}
