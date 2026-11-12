package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class lp extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20283e;

    static {
        bk bkVar = new bk("rally_x10_tempcal_data", 452);
        f20283e = bkVar;
        bkVar.e(new rc("timestamp_32k", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 32768.0d, 0.0d, "s", false, zn.UINT32));
        zn znVar = zn.FLOAT32;
        bkVar.e(new rc("accel", 1, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "lsb", false, znVar));
        bkVar.e(new rc("gyro", 2, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "lsb", false, znVar));
        bkVar.e(new rc("strain", 3, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "lsb", false, znVar));
        zn znVar2 = zn.SINT32;
        bkVar.e(new rc("excitation", 4, 133, 1.0d, 0.0d, "lsb", false, znVar2));
        bkVar.e(new rc("accel_var", 5, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "lsb^2", false, znVar));
        bkVar.e(new rc("gyro_var", 6, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "lsb^2", false, znVar));
        bkVar.e(new rc("strain_var", 7, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "lsb^2", false, znVar));
        bkVar.e(new rc("excitation_var", 8, 133, 1.0d, 0.0d, "lsb^2", false, znVar2));
        bkVar.e(new rc("accel_min", 9, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "lsb", false, znVar));
        bkVar.e(new rc("gyro_min", 10, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "lsb", false, znVar));
        bkVar.e(new rc("strain_min", 11, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "lsb", false, znVar));
        bkVar.e(new rc("excitation_min", 12, 133, 1.0d, 0.0d, "lsb", false, znVar2));
        bkVar.e(new rc("accel_max", 13, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "lsb", false, znVar));
        bkVar.e(new rc("gyro_max", 14, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "lsb", false, znVar));
        bkVar.e(new rc("strain_max", 15, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "lsb", false, znVar));
        bkVar.e(new rc("excitation_max", 16, 133, 1.0d, 0.0d, "lsb", false, znVar2));
        zn znVar3 = zn.SINT16;
        bkVar.e(new rc("mcu_temp", 17, 131, 256.0d, 0.0d, "degrees C", false, znVar3));
        bkVar.e(new rc("imu_temp", 18, 131, 256.0d, 0.0d, "degrees C", false, znVar3));
        bkVar.e(new rc("afe_temp", 19, 131, 256.0d, 0.0d, "degrees C", false, znVar3));
        bkVar.e(new rc("pmic_temp", 20, 131, 256.0d, 0.0d, "degrees C", false, znVar3));
        bkVar.e(new rc("mcu_temp_min", 21, 131, 256.0d, 0.0d, "degrees C", false, znVar3));
        bkVar.e(new rc("imu_temp_min", 22, 131, 256.0d, 0.0d, "degrees C", false, znVar3));
        bkVar.e(new rc("afe_temp_min", 23, 131, 256.0d, 0.0d, "degrees C", false, znVar3));
        bkVar.e(new rc("pmic_temp_min", 24, 131, 256.0d, 0.0d, "degrees C", false, znVar3));
        bkVar.e(new rc("mcu_temp_max", 25, 131, 256.0d, 0.0d, "degrees C", false, znVar3));
        bkVar.e(new rc("imu_temp_max", 26, 131, 256.0d, 0.0d, "degrees C", false, znVar3));
        bkVar.e(new rc("afe_temp_max", 27, 131, 256.0d, 0.0d, "degrees C", false, znVar3));
        bkVar.e(new rc("pmic_temp_max", 28, 131, 256.0d, 0.0d, "degrees C", false, znVar3));
        zn znVar4 = zn.UINT16;
        bkVar.e(new rc("mcu_temp_var", 29, 132, 256.0d, 0.0d, "degrees C", false, znVar4));
        bkVar.e(new rc("imu_temp_var", 30, 132, 256.0d, 0.0d, "degrees C", false, znVar4));
        bkVar.e(new rc("afe_temp_var", 31, 132, 256.0d, 0.0d, "degrees C", false, znVar4));
        bkVar.e(new rc("pmic_temp_var", 32, 132, 256.0d, 0.0d, "degrees C", false, znVar4));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public lp() {
        super(wb.b(452));
    }

    public lp(bk bkVar) {
        super(bkVar);
    }
}
