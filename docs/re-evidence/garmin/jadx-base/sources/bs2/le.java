package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class le extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20279e;

    static {
        bk bkVar = new bk("gnss_fix_info", 499);
        f20279e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("raw_gps_3d_fix_time", 0, 132, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("garmin_pvt_solution_3d_fix_time", 1, 132, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("wbl_convergence_3d_time", 2, 132, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("stable_wbl_convergence_3d_time", 3, 132, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("lost_fix_count_after_wbl_convergence", 4, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public le() {
        super(wb.b(499));
    }

    public le(bk bkVar) {
        super(bkVar);
    }
}
