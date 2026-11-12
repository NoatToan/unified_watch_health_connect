package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class lr extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20285e;

    static {
        bk bkVar = new bk("sdm_field_data", 36);
        f20285e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("device_index", 0, 2, 1.0d, 0.0d, "", false, zn.DEVICE_INDEX));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("version", 1, 132, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.BYTE;
        bkVar.e(new rc("data_1", 2, 13, 1.0d, 0.0d, "", false, znVar2));
        bkVar.f19753c.get(3).f20459h.add(new vc(3, false, 32, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(4, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(5, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(6, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(6, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(6, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(7, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(8, false, 4, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(9, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(10, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(11, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(12, false, 16, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(13, false, 24, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(14, false, 24, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(15, false, 24, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(16, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(17, false, 24, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(18, false, 32, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(19, false, 24, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(20, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(21, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(22, false, 32, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(23, false, 16, 32.0d, 273.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(24, false, 16, 32.0d, 273.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(25, false, 16, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(26, false, 16, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(27, false, 24, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(27, false, 24, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(28, false, 8, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(29, false, 16, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(30, false, 16, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(31, false, 16, 1.0d, 0.0d));
        bkVar.f19753c.get(3).f20459h.add(new vc(32, false, 16, 1.0d, 0.0d));
        zn znVar3 = zn.UINT32Z;
        bkVar.e(new rc("serial_number", 3, 140, 1.0d, 0.0d, "", false, znVar3));
        zn znVar4 = zn.UINT8Z;
        bkVar.e(new rc("hardware_minor_version", 4, 10, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("hardware_major_version", 5, 10, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("product", 6, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("software_minor_version", 7, 10, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("software_major_version", 8, 10, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("software_development_version", 9, 10, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("special", 10, 10, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("customization", 11, 10, 1.0d, 0.0d, "", false, znVar4));
        zn znVar5 = zn.UINT16Z;
        bkVar.e(new rc("control_bits", 12, 139, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("operating_time", 13, 140, 1.0d, 0.0d, "s", false, znVar3));
        bkVar.e(new rc("rf_on_time", 14, 140, 1.0d, 0.0d, "s", false, znVar3));
        bkVar.e(new rc("stride_time", 15, 140, 1.0d, 0.0d, "s", false, znVar3));
        bkVar.e(new rc("resets", 16, 10, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("distance", 17, 140, 1.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("strides", 18, 140, 1.0d, 0.0d, "strides", false, znVar3));
        bkVar.e(new rc("accel_on_time", 19, 140, 1.0d, 0.0d, "s", false, znVar3));
        bkVar.e(new rc("watchdog_resets", 20, 10, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("hardware_resets", 21, 10, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("session_flags", 22, 140, 1.0d, 0.0d, "", false, zn.SDM_SESSION_FLAGS));
        bkVar.e(new rc("min_temperature", 23, 139, 32.0d, 273.0d, "C", false, znVar5));
        bkVar.e(new rc("max_temperature", 24, 139, 32.0d, 273.0d, "C", false, znVar5));
        bkVar.e(new rc("sd_errors", 25, 139, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("sd_out_of_phase", 26, 139, 1.0d, 0.0d, "strides", false, znVar5));
        bkVar.e(new rc("accel_sleep_time", 27, 140, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("clock_error_count", 28, 10, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("csm_run_model_cadence", 29, 139, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("csm_run_model_speed", 30, 139, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("csm_walk_model_cadence", 31, 139, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("csm_walk_model_speed", 32, 139, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("memory_access_errors", 33, 10, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("last_error_location", 34, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("last_error_code", 35, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("fs_formats", 36, 10, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("file_size_adjustments", 37, 10, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("ant_queue_overflows", 38, 10, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("svs_resets", 39, 10, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar2));
    }

    public lr() {
        super(wb.b(36));
    }

    public lr(bk bkVar) {
        super(bkVar);
    }
}
