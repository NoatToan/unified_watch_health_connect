package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class zr extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f21024e;

    static {
        bk bkVar = new bk("segment_point", 150);
        f21024e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.SINT32;
        bkVar.e(new rc("position_lat", 1, 133, 1.0d, 0.0d, "semicircles", false, znVar));
        bkVar.e(new rc("position_long", 2, 133, 1.0d, 0.0d, "semicircles", false, znVar));
        zn znVar2 = zn.UINT32;
        bkVar.e(new rc("distance", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("altitude", 4, 132, 5.0d, 500.0d, "m", false, zn.UINT16));
        bkVar.f19753c.get(4).f20459h.add(new vc(6, false, 16, 5.0d, 500.0d));
        bkVar.e(new rc("leader_time", 5, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("enhanced_altitude", 6, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 5.0d, 500.0d, "m", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public zr() {
        super(wb.b(150));
    }

    public zr(bk bkVar) {
        super(bkVar);
    }
}
