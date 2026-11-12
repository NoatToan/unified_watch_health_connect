package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class gm extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20169e;

    static {
        bk bkVar = new bk("nmea_sentence", 177);
        f20169e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("timestamp_ms", 0, 132, 1.0d, 0.0d, "ms", false, zn.UINT16));
        bkVar.e(new rc("sentence", 1, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public gm() {
        super(wb.b(177));
    }

    public gm(bk bkVar) {
        super(bkVar);
    }
}
