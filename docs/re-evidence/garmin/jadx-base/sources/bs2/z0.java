package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class z0 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20701e;

    static {
        bk bkVar = new bk("ant_rx", 80);
        f20701e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("fractional_timestamp", 0, 132, 32768.0d, 0.0d, "s", false, zn.UINT16));
        zn znVar = zn.BYTE;
        bkVar.e(new rc("mesg_id", 1, 13, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("mesg_data", 2, 13, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(3).f20459h.add(new vc(3, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(4, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(4, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(4, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(4, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(4, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(4, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(4, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(4, false, 8, 1.0d, 0.0d));
        bkVar.e(new rc("channel_number", 3, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("data", 4, 13, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("rssi", 5, 1, 1.0d, 0.0d, "", false, zn.SINT8));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar));
    }

    public z0() {
        super(wb.b(80));
    }

    public z0(bk bkVar) {
        super(bkVar);
    }
}
