package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class hc extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20183e;

    static {
        bk bkVar = new bk("fbt_lha_min_hr_data", 431);
        f20183e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("reliability", 0, 1, 1.0d, 0.0d, "", false, zn.SINT8));
        bkVar.e(new rc("timestamp_days", 1, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("last_applied_timestamp", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("value", 3, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public hc() {
        super(wb.b(431));
    }

    public hc(bk bkVar) {
        super(bkVar);
    }
}
