package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class zi extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20714e;

    static {
        bk bkVar = new bk("living_altitude", 282);
        f20714e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("altitude", 1, 133, 65536.0d, 0.0d, "", false, zn.SINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public zi() {
        super(wb.b(282));
    }

    public zi(bk bkVar) {
        super(bkVar);
    }
}
