package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class h2 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20174e;

    static {
        bk bkVar = new bk("battery", 104);
        f20174e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("voltage", 0, 132, 1.0d, 0.0d, "mV", false, zn.UINT16));
        bkVar.e(new rc("current", 1, 131, 1.0d, 0.0d, "mA", false, zn.SINT16));
        bkVar.e(new rc("capacity", 2, 2, 1.0d, 0.0d, "%", false, zn.UINT8));
        bkVar.e(new rc("temperature", 3, 1, 1.0d, 0.0d, "C", false, zn.SINT8));
        bkVar.e(new rc("current_microamps", 4, 133, 1.0d, 0.0d, "uA", false, zn.SINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public h2() {
        super(wb.b(104));
    }

    public h2(bk bkVar) {
        super(bkVar);
    }
}
