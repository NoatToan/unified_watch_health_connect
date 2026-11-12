package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class m extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20290e;

    static {
        bk bkVar = new bk("accel_temp_cal_temp", 117);
        f20290e = bkVar;
        zn znVar = zn.UINT16;
        bkVar.e(new rc("temp_start_offset", 0, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("num_points", 1, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public m() {
        super(wb.b(117));
    }

    public m(bk bkVar) {
        super(bkVar);
    }
}
