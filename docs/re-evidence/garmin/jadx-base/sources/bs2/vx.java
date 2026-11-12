package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class vx extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20634e;

    static {
        bk bkVar = new bk("timing_gate_info", 434);
        f20634e = bkVar;
        zn znVar = zn.UINT16;
        bkVar.e(new rc("version", 0, 132, 100.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("sport", 1, 0, 1.0d, 0.0d, "", false, zn.SPORT));
        bkVar.e(new rc("sub_sport", 2, 0, 1.0d, 0.0d, "", false, zn.SUB_SPORT));
        bkVar.e(new rc("width", 3, 132, 1.0d, 0.0d, "m", false, znVar));
        bkVar.e(new rc("length", 4, 132, 1.0d, 0.0d, "m", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public vx() {
        super(wb.b(434));
    }

    public vx(bk bkVar) {
        super(bkVar);
    }
}
