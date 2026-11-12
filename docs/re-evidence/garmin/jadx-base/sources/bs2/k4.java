package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class k4 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20252e;

    static {
        bk bkVar = new bk("bridge_temp_cal_vex", 115);
        f20252e = bkVar;
        zn znVar = zn.UINT16;
        bkVar.e(new rc("vex_start_offset", 0, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("num_points", 1, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public k4() {
        super(wb.b(115));
    }

    public k4(bk bkVar) {
        super(bkVar);
    }
}
