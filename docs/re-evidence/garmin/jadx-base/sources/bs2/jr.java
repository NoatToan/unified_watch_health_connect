package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class jr extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20238e;

    static {
        bk bkVar = new bk("sdm_data", 58);
        f20238e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("event_timestamp", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 256.0d, 0.0d, "s", true, znVar));
        bkVar.e(new rc("distance", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 256.0d, 0.0d, "m", true, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("speed", 2, 132, 256.0d, 0.0d, "m/s", false, znVar2));
        bkVar.e(new rc("stride_count", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "strides", true, znVar));
        bkVar.e(new rc("cadence", 4, 132, 256.0d, 0.0d, "strides/min", false, znVar2));
        bkVar.e(new rc("calories", 5, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "kcal", true, znVar));
        bkVar.e(new rc("status", 6, 2, 1.0d, 0.0d, "", false, zn.SDM_STATUS));
        zn znVar3 = zn.UINT8;
        bkVar.e(new rc("event_latency", 7, 2, 32.0d, 0.0d, "s", false, znVar3));
        bkVar.e(new rc("x_event_timestamp200", 8, 2, 200.0d, 0.0d, "s", false, znVar3));
        bkVar.f19753c.get(9).f20459h.add(new vc(18, false, 8, 200.0d, 0.0d));
        bkVar.e(new rc("x_event_timestamp", 9, 2, 1.0d, 0.0d, "s", false, znVar3));
        bkVar.f19753c.get(10).f20459h.add(new vc(18, false, 8, 1.0d, 0.0d));
        bkVar.e(new rc("x_distance", 10, 2, 1.0d, 0.0d, "m", false, znVar3));
        bkVar.f19753c.get(11).f20459h.add(new vc(17, false, 8, 1.0d, 0.0d));
        bkVar.e(new rc("x_speed_dist16", 11, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.f19753c.get(12).f20459h.add(new vc(2, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(12).f20459h.add(new vc(17, false, 4, 16.0d, 0.0d));
        bkVar.e(new rc("x_speed256", 12, 2, 256.0d, 0.0d, "m/s", false, znVar3));
        bkVar.f19753c.get(13).f20459h.add(new vc(2, false, 8, 256.0d, 0.0d));
        bkVar.e(new rc("x_stride_count", 13, 2, 1.0d, 0.0d, "strides", false, znVar3));
        bkVar.f19753c.get(14).f20459h.add(new vc(3, true, 8, 1.0d, 0.0d));
        zn znVar4 = zn.UINT8Z;
        bkVar.e(new rc("x_cadence", 14, 10, 1.0d, 0.0d, "strides/min", false, znVar4));
        bkVar.f19753c.get(15).f20459h.add(new vc(4, false, 8, 1.0d, 0.0d));
        bkVar.e(new rc("x_speed_cad16", 15, 10, 1.0d, 0.0d, "", false, znVar4));
        bkVar.f19753c.get(16).f20459h.add(new vc(2, false, 4, 16.0d, 0.0d));
        bkVar.f19753c.get(16).f20459h.add(new vc(4, false, 4, 1.0d, 0.0d));
        bkVar.e(new rc("x_calories", 16, 2, 1.0d, 0.0d, "kcal", false, znVar3));
        bkVar.f19753c.get(17).f20459h.add(new vc(5, true, 8, 1.0d, 0.0d));
        bkVar.e(new rc("x_distance256", 17, 132, 256.0d, 0.0d, "m", false, znVar2));
        bkVar.f19753c.get(18).f20459h.add(new vc(1, true, 16, 256.0d, 0.0d));
        bkVar.e(new rc("x_event_timestamp256", 18, 132, 256.0d, 0.0d, "s", false, znVar2));
        bkVar.f19753c.get(19).f20459h.add(new vc(0, true, 16, 256.0d, 0.0d));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public jr() {
        super(wb.b(58));
    }

    public jr(bk bkVar) {
        super(bkVar);
    }
}
