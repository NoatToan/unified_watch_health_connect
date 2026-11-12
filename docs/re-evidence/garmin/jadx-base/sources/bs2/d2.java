package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class d2 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20044e;

    static {
        bk bkVar = new bk("bat_swing_path", 238);
        f20044e = bkVar;
        zn znVar = zn.SINT16;
        bkVar.e(new rc("knob_posx", 0, 131, 1.0d, 0.0d, "mm", false, znVar));
        bkVar.e(new rc("knob_posy", 1, 131, 1.0d, 0.0d, "mm", false, znVar));
        bkVar.e(new rc("knob_posz", 2, 131, 1.0d, 0.0d, "mm", false, znVar));
        bkVar.e(new rc("end_posx", 3, 131, 1.0d, 0.0d, "mm", false, znVar));
        bkVar.e(new rc("end_posy", 4, 131, 1.0d, 0.0d, "mm", false, znVar));
        bkVar.e(new rc("end_posz", 5, 131, 1.0d, 0.0d, "mm", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public d2() {
        super(wb.b(238));
    }

    public d2(bk bkVar) {
        super(bkVar);
    }
}
