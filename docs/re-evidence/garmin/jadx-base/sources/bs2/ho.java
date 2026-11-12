package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class ho extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20193e;

    static {
        bk bkVar = new bk("race_predictions_run", 339);
        f20193e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("local_timestamp", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.LOCAL_DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("race_time_5k", 1, 132, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("race_time_10k", 2, 132, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("race_time_half", 3, 132, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("race_time_marathon", 4, 132, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ho() {
        super(wb.b(339));
    }

    public ho(bk bkVar) {
        super(bkVar);
    }
}
