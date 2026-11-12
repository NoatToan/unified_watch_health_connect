package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class f3 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20113e;

    static {
        bk bkVar = new bk("bikelight_auto_settings", 179);
        f20113e = bkVar;
        zn znVar = zn.BOOL;
        bkVar.e(new rc("deceleration", 0, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("power_conservation", 1, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("conservation_mode", 2, 2, 1.0d, 0.0d, "", false, zn.POWER_CONSERVATION_MODE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public f3() {
        super(wb.b(179));
    }

    public f3(bk bkVar) {
        super(bkVar);
    }
}
