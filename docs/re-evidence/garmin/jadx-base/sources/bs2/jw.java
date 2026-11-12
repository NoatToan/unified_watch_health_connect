package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class jw extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20245e;

    static {
        bk bkVar = new bk("strain_temp_cal_start", 247);
        f20245e = bkVar;
        zn znVar = zn.UINT16;
        bkVar.e(new rc("vex_start_offset", 0, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("num_points", 1, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public jw() {
        super(wb.b(247));
    }

    public jw(bk bkVar) {
        super(bkVar);
    }
}
