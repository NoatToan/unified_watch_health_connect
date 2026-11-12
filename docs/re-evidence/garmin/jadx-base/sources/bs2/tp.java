package bs2;

import ch.qos.logback.core.net.SyslogConstants;

/* JADX INFO: loaded from: classes11.dex */
public class tp extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20581e;

    static {
        bk bkVar = new bk("rally_x10_zerocal_offset", 456);
        f20581e = bkVar;
        zn znVar = zn.FLOAT32;
        bkVar.e(new rc("strain_offset", 0, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "lsb", false, znVar));
        zn znVar2 = zn.SINT16;
        bkVar.e(new rc("strain_offset_temp", 1, 131, 256.0d, 0.0d, "degrees C", false, znVar2));
        bkVar.e(new rc("accel_offset", 2, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "lsb", false, znVar));
        bkVar.e(new rc("gyro_offset", 3, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "lsb", false, znVar));
        bkVar.e(new rc("imu_offset_temp", 4, 131, 256.0d, 0.0d, "degrees C", false, znVar2));
        bkVar.e(new rc("last_cal_torque_corr_n32", 5, 133, 32.0d, 0.0d, "N*m", false, zn.SINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public tp() {
        super(wb.b(456));
    }

    public tp(bk bkVar) {
        super(bkVar);
    }
}
