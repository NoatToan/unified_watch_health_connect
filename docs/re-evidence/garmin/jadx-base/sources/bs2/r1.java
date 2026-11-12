package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.mapbox.turf.TurfConstants;

/* JADX INFO: loaded from: classes11.dex */
public class r1 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20447e;

    static {
        bk bkVar = new bk("aviation_attitude", 178);
        f20447e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("timestamp_ms", 0, 132, 1.0d, 0.0d, "ms", false, znVar));
        bkVar.e(new rc("system_time", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "ms", false, zn.UINT32));
        zn znVar2 = zn.SINT16;
        bkVar.e(new rc("pitch", 2, 131, 10430.38d, 0.0d, TurfConstants.UNIT_RADIANS, false, znVar2));
        bkVar.e(new rc("roll", 3, 131, 10430.38d, 0.0d, TurfConstants.UNIT_RADIANS, false, znVar2));
        bkVar.e(new rc("accel_lateral", 4, 131, 100.0d, 0.0d, "m/s^2", false, znVar2));
        bkVar.e(new rc("accel_normal", 5, 131, 100.0d, 0.0d, "m/s^2", false, znVar2));
        bkVar.e(new rc("turn_rate", 6, 131, 1024.0d, 0.0d, "radians/second", false, znVar2));
        bkVar.e(new rc("stage", 7, 0, 1.0d, 0.0d, "", false, zn.ATTITUDE_STAGE));
        bkVar.e(new rc("attitude_stage_complete", 8, 2, 1.0d, 0.0d, "%", false, zn.UINT8));
        bkVar.e(new rc("track", 9, 132, 10430.38d, 0.0d, TurfConstants.UNIT_RADIANS, false, znVar));
        bkVar.e(new rc("validity", 10, 132, 1.0d, 0.0d, "", false, zn.ATTITUDE_VALIDITY));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public r1() {
        super(wb.b(178));
    }

    public r1(bk bkVar) {
        super(bkVar);
    }
}
