package bs2;

import ch.qos.logback.core.net.SyslogConstants;

/* JADX INFO: loaded from: classes11.dex */
public class i00 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20205e;

    static {
        bk bkVar = new bk("vbt_rep_metrics", 491);
        f20205e = bkVar;
        zn znVar = zn.MESSAGE_INDEX;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("set_index", 0, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("rep_number", 1, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("contraction_phase", 2, 0, 1.0d, 0.0d, "", false, zn.MUSCLE_CONTRACTION_PHASE));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("peak_velocity", 3, 132, 100.0d, 0.0d, "m/s", false, znVar2));
        bkVar.e(new rc("mean_velocity", 4, 132, 100.0d, 0.0d, "m/s", false, znVar2));
        bkVar.e(new rc("mean_propul_velocity", 5, 132, 100.0d, 0.0d, "m/s", false, znVar2));
        bkVar.e(new rc("rom", 6, 132, 100.0d, 0.0d, "cm", false, znVar2));
        zn znVar3 = zn.FLOAT32;
        bkVar.e(new rc("peak_power", 7, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "watts", false, znVar3));
        bkVar.e(new rc("mean_power", 8, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "watts", false, znVar3));
        bkVar.e(new rc("mean_propul_power", 9, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "watts", false, znVar3));
        bkVar.e(new rc("duration", 10, 132, 100.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("bar_path_points", 11, 131, 100.0d, 0.0d, "", false, zn.SINT16));
        bkVar.e(new rc("ecc_peak_velocity", 12, 132, 100.0d, 0.0d, "m/s", false, znVar2));
        bkVar.e(new rc("ecc_mean_velocity", 13, 132, 100.0d, 0.0d, "m/s", false, znVar2));
        bkVar.e(new rc("ecc_rom", 14, 132, 100.0d, 0.0d, "cm", false, znVar2));
        bkVar.e(new rc("ecc_duration", 15, 132, 100.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public i00() {
        super(wb.b(491));
    }

    public i00(bk bkVar) {
        super(bkVar);
    }
}
