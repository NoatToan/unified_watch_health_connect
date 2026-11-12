package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class p1 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20393e;

    static {
        bk bkVar = new bk("automotive_data", 265);
        f20393e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("commit_time", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("gps_timestamp", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        zn znVar2 = zn.SINT32;
        bkVar.e(new rc("latitude", 2, 133, 1.0d, 0.0d, "Semicircle", false, znVar2));
        bkVar.e(new rc("longitude", 3, 133, 1.0d, 0.0d, "Semicircle", false, znVar2));
        bkVar.e(new rc("elevation", 4, 133, 1.0d, 0.0d, "Semicircle", false, znVar2));
        bkVar.e(new rc("yaw", 5, 133, 1.0d, 0.0d, "Semicircle", false, znVar2));
        bkVar.e(new rc("pitch", 6, 133, 1.0d, 0.0d, "Semicircle", false, znVar2));
        bkVar.e(new rc("roll", 7, 133, 1.0d, 0.0d, "Semicircle", false, znVar2));
        bkVar.e(new rc("speed", 8, 133, 256.0d, 0.0d, "Meters/Sec", false, znVar2));
        bkVar.e(new rc("g_force_x", 9, 133, 256.0d, 0.0d, "m/s^2", false, znVar2));
        bkVar.e(new rc("g_force_y", 10, 133, 256.0d, 0.0d, "m/s^2", false, znVar2));
        bkVar.e(new rc("g_force_z", 11, 133, 256.0d, 0.0d, "m/s^2", false, znVar2));
        zn znVar3 = zn.UINT32;
        bkVar.e(new rc("speedometer", 12, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 256.0d, 0.0d, "KPH", false, znVar3));
        bkVar.e(new rc("odometer", 13, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 256.0d, 0.0d, "Kilometers", false, znVar3));
        zn znVar4 = zn.UINT16;
        bkVar.e(new rc("tachometer", 14, 132, 1.0d, 0.0d, "RPM", false, znVar4));
        bkVar.e(new rc("steering_angle", 15, 132, 1.0d, 0.0d, "Semicircle", false, znVar4));
        bkVar.e(new rc("gear_setting", 16, 0, 1.0d, 0.0d, "", false, zn.AUTOMOTIVE_GEAR_SETTING));
        bkVar.e(new rc("accelerator_pedal_percentage", 17, 132, 1.0d, 0.0d, "Scaled", false, znVar4));
        bkVar.e(new rc("brake_pressure", 18, 132, 8.0d, 0.0d, "PSI", false, znVar4));
        bkVar.e(new rc("oil_pressure", 19, 132, 8.0d, 0.0d, "PSI", false, znVar4));
        bkVar.e(new rc("engine_coolant_temperature", 20, 132, 1.0d, 0.0d, "C", false, znVar4));
        bkVar.e(new rc("transfer_case_status", 21, 0, 1.0d, 0.0d, "", false, zn.AUTOMOTIVE_TURN_INDICATOR));
        bkVar.e(new rc("axle_lock_status", 22, 0, 1.0d, 0.0d, "", false, zn.AUTOMOTIVE_AXLE_LOCK_STATUS));
        bkVar.e(new rc("lap_number", 23, 132, 1.0d, 0.0d, "Laps", false, znVar4));
        bkVar.e(new rc("segment_number", 24, 132, 1.0d, 0.0d, "Lap Segments", false, znVar4));
        zn znVar5 = zn.UINT64;
        bkVar.e(new rc("lap_time", 25, 143, 1.0d, 0.0d, "Nanoseconds", false, znVar5));
        bkVar.e(new rc("segment_time", 26, 143, 1.0d, 0.0d, "Nanoseconds", false, znVar5));
        bkVar.e(new rc("distance_traversed", 27, 132, 8.0d, 0.0d, "Meters", false, znVar4));
        bkVar.e(new rc("heart_rate", 28, 2, 1.0d, 0.0d, "bpm", false, zn.UINT8));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public p1() {
        super(wb.b(265));
    }

    public p1(bk bkVar) {
        super(bkVar);
    }
}
