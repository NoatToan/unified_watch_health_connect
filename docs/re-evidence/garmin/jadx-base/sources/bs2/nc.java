package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class nc extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20329e;

    static {
        bk bkVar = new bk("fbt_lha_sleep_median", 391);
        f20329e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("departure_time", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.SINT16;
        bkVar.e(new rc("start_time", 1, 131, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("end_time", 2, 131, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("duration", 3, 131, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public nc() {
        super(wb.b(391));
    }

    public nc(bk bkVar) {
        super(bkVar);
    }
}
