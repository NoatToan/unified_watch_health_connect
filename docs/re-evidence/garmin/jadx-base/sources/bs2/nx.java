package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class nx extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20364e;

    static {
        bk bkVar = new bk("three_d_sensor_calibration", 167);
        f20364e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("sensor_type", 0, 0, 1.0d, 0.0d, "", false, zn.SENSOR_TYPE));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("calibration_factor", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(2).f20460i.add(new pw("accel_cal_factor", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "g"));
        bkVar.f19753c.get(2).f20460i.get(0).b(0, 0L);
        bkVar.f19753c.get(2).f20460i.add(new pw("gyro_cal_factor", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "deg/s"));
        bkVar.f19753c.get(2).f20460i.get(1).b(0, 1L);
        bkVar.f19753c.get(2).f20460i.add(new pw("mag_cal_factor", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "G"));
        bkVar.f19753c.get(2).f20460i.get(2).b(0, 2L);
        bkVar.e(new rc("calibration_divisor", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "counts", false, znVar));
        bkVar.e(new rc("level_shift", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.SINT32;
        bkVar.e(new rc("offset_cal", 4, 133, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("orientation_matrix", 5, 133, 65535.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public nx() {
        super(wb.b(167));
    }

    public nx(bk bkVar) {
        super(bkVar);
    }
}
