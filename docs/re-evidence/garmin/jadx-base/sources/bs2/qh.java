package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class qh extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20433e;

    static {
        bk bkVar = new bk("hsa_spo2_data", 305);
        f20433e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("processing_interval", 0, 132, 1.0d, 0.0d, "s", false, zn.UINT16));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("reading_spo2", 1, 2, 1.0d, 0.0d, "percent", false, znVar));
        bkVar.e(new rc("confidence", 2, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public qh() {
        super(wb.b(305));
    }

    public qh(bk bkVar) {
        super(bkVar);
    }
}
