package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class de extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20054e;

    static {
        bk bkVar = new bk("glucose", 62);
        f20054e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("concentration", 0, 132, 1.0d, 0.0d, "mg/dL", false, zn.UINT16));
        bkVar.e(new rc("marker", 1, 0, 1.0d, 0.0d, "", false, zn.GLUCOSE_MARKER_TYPE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public de() {
        super(wb.b(62));
    }

    public de(bk bkVar) {
        super(bkVar);
    }
}
