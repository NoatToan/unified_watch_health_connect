package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class g4 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20152e;

    static {
        bk bkVar = new bk("bridge_temp_cal_convergence", 120);
        f20152e = bkVar;
        zn znVar = zn.UINT16;
        bkVar.e(new rc("temp_start", 0, 132, 32.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("vex_start", 1, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("temp_end", 2, 132, 32.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("vex_end", 3, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("temp_converge", 4, 132, 32.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("vex_converge", 5, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("offset_diff", 6, 131, 16.0d, 0.0d, "", false, zn.SINT16));
        bkVar.e(new rc("num_samples", 7, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public g4() {
        super(wb.b(120));
    }

    public g4(bk bkVar) {
        super(bkVar);
    }
}
