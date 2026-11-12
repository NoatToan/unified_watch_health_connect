package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class y extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20680e;

    static {
        bk bkVar = new bk("acute_load_results", 378);
        f20680e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("acwr_percent", 0, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("status", 1, 0, 1.0d, 0.0d, "", false, zn.ACWR_STATUS));
        bkVar.e(new rc("status_feedback", 2, 0, 1.0d, 0.0d, "", false, zn.ACWR_STATUS_FEEDBACK));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("daily_training_load_acute", 3, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("daily_training_load_chronic", 4, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("daily_acute_chronic_workload_ratio", 5, 2, 10.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public y() {
        super(wb.b(378));
    }

    public y(bk bkVar) {
        super(bkVar);
    }
}
