package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class z2 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20703e;

    static {
        bk bkVar = new bk("bike_radar_data", 214);
        f20703e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("time256", 0, 2, 256.0d, 0.0d, "s", false, znVar));
        bkVar.f19753c.get(1).f20459h.add(new vc(1, false, 8, 256.0d, 0.0d));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("fractional_timestamp", 1, 132, 32768.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("targets", 2, 10, 1.0d, 0.0d, "", false, zn.RADAR_TARGETS));
        zn znVar3 = zn.RADAR_THREAT_LEVEL;
        bkVar.e(new rc("threat_level_target1", 3, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("threat_level_target2", 4, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("threat_level_target3", 5, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("threat_level_target4", 6, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("threat_level", 7, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(8).f20459h.add(new vc(3, false, 2, 1.0d, 0.0d));
        bkVar.f19753c.get(8).f20459h.add(new vc(4, false, 2, 1.0d, 0.0d));
        bkVar.f19753c.get(8).f20459h.add(new vc(5, false, 2, 1.0d, 0.0d));
        bkVar.f19753c.get(8).f20459h.add(new vc(6, false, 2, 1.0d, 0.0d));
        zn znVar4 = zn.RADAR_THREAT_SIDE;
        bkVar.e(new rc("threat_side_target1", 8, 2, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("threat_side_target2", 9, 2, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("threat_side_target3", 10, 2, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("threat_side_target4", 11, 2, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("threat_side", 12, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(13).f20459h.add(new vc(8, false, 2, 1.0d, 0.0d));
        bkVar.f19753c.get(13).f20459h.add(new vc(9, false, 2, 1.0d, 0.0d));
        bkVar.f19753c.get(13).f20459h.add(new vc(10, false, 2, 1.0d, 0.0d));
        bkVar.f19753c.get(13).f20459h.add(new vc(11, false, 2, 1.0d, 0.0d));
        zn znVar5 = zn.UINT32;
        bkVar.e(new rc("range_target1", 13, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m", false, znVar5));
        bkVar.e(new rc("range_target2", 14, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m", false, znVar5));
        bkVar.e(new rc("range_target3", 15, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m", false, znVar5));
        bkVar.e(new rc("range_target4", 16, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m", false, znVar5));
        zn znVar6 = zn.BYTE;
        bkVar.e(new rc("target_range", 17, 13, 1.0d, 0.0d, "", false, znVar6));
        bkVar.f19753c.get(18).f20459h.add(new vc(13, false, 6, 0.319999993d, 0.0d));
        bkVar.f19753c.get(18).f20459h.add(new vc(14, false, 6, 0.319999993d, 0.0d));
        bkVar.f19753c.get(18).f20459h.add(new vc(15, false, 6, 0.319999993d, 0.0d));
        bkVar.f19753c.get(18).f20459h.add(new vc(16, false, 6, 0.319999993d, 0.0d));
        bkVar.e(new rc("speed_target1", 18, 132, 100.0d, 0.0d, "m/s", false, znVar2));
        bkVar.e(new rc("speed_target2", 19, 132, 100.0d, 0.0d, "m/s", false, znVar2));
        bkVar.e(new rc("speed_target3", 20, 132, 100.0d, 0.0d, "m/s", false, znVar2));
        bkVar.e(new rc("speed_target4", 21, 132, 100.0d, 0.0d, "m/s", false, znVar2));
        bkVar.e(new rc("target_speed", 22, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.f19753c.get(23).f20459h.add(new vc(18, false, 4, 0.328947365d, 0.0d));
        bkVar.f19753c.get(23).f20459h.add(new vc(19, false, 4, 0.328947365d, 0.0d));
        bkVar.f19753c.get(23).f20459h.add(new vc(20, false, 4, 0.328947365d, 0.0d));
        bkVar.f19753c.get(23).f20459h.add(new vc(21, false, 4, 0.328947365d, 0.0d));
        bkVar.e(new rc("id_target1", 23, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("id_target2", 24, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("id_target3", 25, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("id_target4", 26, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("target_id", 27, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(28).f20459h.add(new vc(23, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(28).f20459h.add(new vc(24, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(28).f20459h.add(new vc(25, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(28).f20459h.add(new vc(26, false, 8, 1.0d, 0.0d));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar6));
    }

    public z2() {
        super(wb.b(214));
    }

    public z2(bk bkVar) {
        super(bkVar);
    }
}
