package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class yh extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20691e;

    static {
        bk bkVar = new bk("imu_sample_config", 447);
        f20691e = bkVar;
        zn znVar = zn.BYTE;
        bkVar.e(new rc("accel_scale", 0, 13, 1.0d, 0.0d, "G", false, znVar));
        bkVar.e(new rc("accel_channels", 1, 13, 1.0d, 0.0d, "lsb", false, znVar));
        bkVar.e(new rc("accel_rate", 2, 13, 1.0d, 0.0d, "Hz", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("gyro_scale", 3, 132, 1.0d, 0.0d, "deg/s", false, znVar2));
        bkVar.e(new rc("gyro_channels", 4, 13, 1.0d, 0.0d, "lsb", false, znVar));
        bkVar.e(new rc("gyro_rate", 5, 13, 1.0d, 0.0d, "Hz", false, znVar));
        bkVar.e(new rc("mag_scale", 6, 132, 1.0d, 0.0d, "uT", false, znVar2));
        bkVar.e(new rc("mag_channels", 7, 13, 1.0d, 0.0d, "lsb", false, znVar));
        bkVar.e(new rc("mag_rate", 8, 13, 1.0d, 0.0d, "Hz", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar));
    }

    public yh() {
        super(wb.b(447));
    }

    public yh(bk bkVar) {
        super(bkVar);
    }
}
