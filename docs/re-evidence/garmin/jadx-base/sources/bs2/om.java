package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class om extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20384e;

    static {
        bk bkVar = new bk("one_d_sensor_calibration", 210);
        f20384e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("sensor_type", 0, 0, 1.0d, 0.0d, "", false, zn.SENSOR_TYPE));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("calibration_factor", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(2).f20460i.add(new pw("baro_cal_factor", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "Pa"));
        bkVar.f19753c.get(2).f20460i.get(0).b(0, 3L);
        bkVar.e(new rc("calibration_divisor", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "counts", false, znVar));
        bkVar.e(new rc("level_shift", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("offset_cal", 4, 133, 1.0d, 0.0d, "", false, zn.SINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public om() {
        super(wb.b(210));
    }

    public om(bk bkVar) {
        super(bkVar);
    }
}
