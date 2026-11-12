package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class yg extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20690e;

    static {
        bk bkVar = new bk("hrv_value", 371);
        f20690e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("value", 0, 132, 128.0d, 0.0d, "ms", false, zn.UINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public yg() {
        super(wb.b(371));
    }

    public yg(bk bkVar) {
        super(bkVar);
    }
}
