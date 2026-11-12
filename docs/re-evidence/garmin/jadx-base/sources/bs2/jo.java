package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.mapbox.maps.MapboxMap;

/* JADX INFO: loaded from: classes11.dex */
public class jo extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20235e;

    static {
        bk bkVar = new bk("rally_mlr_strain_cal", 351);
        f20235e = bkVar;
        zn znVar = zn.FLOAT32;
        bkVar.e(new rc("force", 0, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "N", false, znVar));
        bkVar.e(new rc("hanger", 1, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "N", false, znVar));
        bkVar.e(new rc("pedal_weight", 2, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "N", false, znVar));
        bkVar.e(new rc(MapboxMap.QFE_OFFSET, 3, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "lsb", false, znVar));
        bkVar.e(new rc("fp_coef", 4, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "N/lsb", false, znVar));
        bkVar.e(new rc("fn_coef", 5, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "N/lsb", false, znVar));
        bkVar.e(new rc("mp_coef", 6, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "N*mm/lsb", false, znVar));
        bkVar.e(new rc("mn_coef", 7, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "N*mm/lsb", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("vex_offset", 8, 132, 1.0d, 0.0d, "lsb", false, znVar2));
        bkVar.e(new rc("pedal_pco", 9, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "mm", false, znVar));
        bkVar.e(new rc("temperature", 10, 132, 32.0d, 0.0d, "K", false, znVar2));
        bkVar.e(new rc("g_range", 11, 2, 1.0d, 0.0d, "g", false, zn.UINT8));
        bkVar.e(new rc("handedness", 12, 0, 1.0d, 0.0d, "", false, zn.SIDE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public jo() {
        super(wb.b(351));
    }

    public jo(bk bkVar) {
        super(bkVar);
    }
}
