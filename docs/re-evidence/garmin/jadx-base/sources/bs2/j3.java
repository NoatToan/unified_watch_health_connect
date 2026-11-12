package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class j3 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20228e;

    static {
        bk bkVar = new bk("bikelight_controller_auto_settings", 181);
        f20228e = bkVar;
        zn znVar = zn.BOOL;
        bkVar.e(new rc("on_off", 0, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("light_intensity", 1, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("turn_signal_cancellation", 2, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("beam_mode", 3, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public j3() {
        super(wb.b(181));
    }

    public j3(bk bkVar) {
        super(bkVar);
    }
}
