package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes11.dex */
public class r6 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20452e;

    static {
        bk bkVar = new bk("debug", 24);
        f20452e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT8;
        bkVar.e(new rc(TtmlNode.ATTR_ID, 0, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("string", 1, 7, 1.0d, 0.0d, "", false, zn.STRING));
        zn znVar2 = zn.BYTE;
        bkVar.e(new rc("data", 2, 13, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("time256", 3, 2, 256.0d, 0.0d, "s", false, znVar));
        bkVar.f19753c.get(4).f20459h.add(new vc(4, false, 8, 256.0d, 0.0d));
        bkVar.e(new rc("fractional_timestamp", 4, 132, 32768.0d, 0.0d, "s", false, zn.UINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar2));
    }

    public r6() {
        super(wb.b(24));
    }

    public r6(bk bkVar) {
        super(bkVar);
    }
}
