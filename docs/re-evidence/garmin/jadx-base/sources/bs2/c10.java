package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class c10 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19768e;

    static {
        bk bkVar = new bk("vector_settings", 230);
        f19768e = bkVar;
        zn znVar = zn.UINT32Z;
        bkVar.e(new rc("left_ant_id", 0, 140, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("right_ant_id", 1, 140, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("left_scale_factor", 2, 132, 32768.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("right_scale_factor", 3, 132, 32768.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.UINT8;
        bkVar.e(new rc("power_phase_threshold", 4, 2, 1.0d, 0.0d, "%", false, znVar3));
        bkVar.e(new rc("rider_position_threshold_time", 5, 2, 1.0d, 0.0d, "seconds", false, znVar3));
        bkVar.e(new rc("cranklength", 6, 2, 2.0d, -110.0d, "mm", false, znVar3));
        bkVar.e(new rc("logging", 7, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("logging_config", 8, 2, 1.0d, 0.0d, "", false, znVar3));
        zn znVar4 = zn.BOOL;
        bkVar.e(new rc("te_ps_enabled", 9, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("cycling_dynamics_enabled", 10, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("auto_zero_offset_enabled", 11, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("ble_cycling_power_enabled", 12, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public c10() {
        super(wb.b(230));
    }

    public c10(bk bkVar) {
        super(bkVar);
    }
}
