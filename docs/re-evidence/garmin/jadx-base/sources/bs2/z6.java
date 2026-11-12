package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class z6 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20711e;

    static {
        bk bkVar = new bk("debug_tag_value", 125);
        f20711e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("time256", 0, 2, 256.0d, 0.0d, "s", false, znVar));
        bkVar.f19753c.get(1).f20459h.add(new vc(3, false, 8, 256.0d, 0.0d));
        bkVar.e(new rc("tag_id", 1, 2, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("tag_value", 2, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("fractional_timestamp", 3, 132, 32768.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("device_index", 4, 2, 1.0d, 0.0d, "", false, zn.DEVICE_INDEX));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public z6() {
        super(wb.b(125));
    }

    public z6(bk bkVar) {
        super(bkVar);
    }
}
