package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class bw extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19763e;

    static {
        bk bkVar = new bk("ss_spin_cal_data", 86);
        f19763e = bkVar;
        zn znVar = zn.UINT8;
        bkVar.e(new rc("num_samples", 0, 2, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("bridge_mag", 4, 132, 16.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("bridge_mag_delta", 5, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("bridge_mag_var", 6, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("accel_angle", 7, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("accel_angle_delta", 8, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("accel_angle_var", 9, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public bw() {
        super(wb.b(86));
    }

    public bw(bk bkVar) {
        super(bkVar);
    }
}
