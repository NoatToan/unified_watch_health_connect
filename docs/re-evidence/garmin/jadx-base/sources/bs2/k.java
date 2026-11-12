package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class k extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20247e;

    static {
        bk bkVar = new bk("accel_temp_cal_start", 250);
        f20247e = bkVar;
        zn znVar = zn.UINT16;
        bkVar.e(new rc("temp_start_offset", 0, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("num_points", 1, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public k() {
        super(wb.b(250));
    }

    public k(bk bkVar) {
        super(bkVar);
    }
}
