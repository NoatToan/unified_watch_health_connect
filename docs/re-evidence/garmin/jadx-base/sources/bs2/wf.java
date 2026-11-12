package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class wf extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20647e;

    static {
        bk bkVar = new bk("heat_altitude_acclimatization", 281);
        f20647e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("acc_altitude_ts", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("acc_heat_ts", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("prev_acc_heat_ts", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("prev_acc_altitude_ts", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("acc_altitude", 4, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("prev_acc_altitude", 5, 132, 1.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.UINT8;
        bkVar.e(new rc("acc_heat_prcnt", 6, 2, 1.0d, 0.0d, "", false, znVar3));
        zn znVar4 = zn.ACCLIMATIZATION_TREND;
        bkVar.e(new rc("heat_trend", 7, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("altitude_trend", 8, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("prev_acc_heat_prcnt", 9, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("acc_prcnt", 10, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("raw_altitude", 11, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("prev_acc_prcnt", 12, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("prev_raw_altitude", 13, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public wf() {
        super(wb.b(281));
    }

    public wf(bk bkVar) {
        super(bkVar);
    }
}
