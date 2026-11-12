package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class lv extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20287e;

    static {
        bk bkVar = new bk("spo2_data", 269);
        f20287e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("reading_spo2", 0, 2, 1.0d, 0.0d, "percent", false, znVar));
        bkVar.e(new rc("reading_confidence", 1, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("mode", 2, 0, 1.0d, 0.0d, "", false, zn.SPO2_MEASUREMENT_TYPE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public lv() {
        super(wb.b(269));
    }

    public lv(bk bkVar) {
        super(bkVar);
    }
}
