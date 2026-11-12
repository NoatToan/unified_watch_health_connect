package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class uz extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20605e;

    static {
        bk bkVar = new bk("ui", 61);
        f20605e = bkVar;
        bkVar.e(new rc("uint32", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("uint16", 1, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("uint8", 2, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public uz() {
        super(wb.b(61));
    }

    public uz(bk bkVar) {
        super(bkVar);
    }
}
