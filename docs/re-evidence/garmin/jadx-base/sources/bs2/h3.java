package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class h3 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20175e;

    static {
        bk bkVar = new bk("bikelight_button_settings", 180);
        f20175e = bkVar;
        zn znVar = zn.BOOL;
        bkVar.e(new rc("overdrive", 0, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("high", 1, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("medium", 2, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("low", 3, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("flashing", 4, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public h3() {
        super(wb.b(180));
    }

    public h3(bk bkVar) {
        super(bkVar);
    }
}
