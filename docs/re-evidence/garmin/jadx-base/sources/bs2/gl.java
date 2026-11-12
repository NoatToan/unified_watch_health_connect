package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class gl extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20168e;

    static {
        bk bkVar = new bk("multisport", 143);
        f20168e = bkVar;
        bkVar.e(new rc("name", 0, 7, 1.0d, 0.0d, "", false, zn.STRING));
        zn znVar = zn.BOOL;
        bkVar.e(new rc("transitions_enabled", 1, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("leg_count", 2, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("auto_pause_enabled", 3, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("alerts_enabled", 4, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("auto_lap_enabled", 5, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("extended_timeout_enabled", 6, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("auto_scroll_enabled", 7, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("repeat_enabled", 8, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("auto_lock_enabled", 9, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("auto_sport_change_enabled", 10, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("sub_sport", 11, 0, 1.0d, 0.0d, "", false, zn.SUB_SPORT));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public gl() {
        super(wb.b(143));
    }

    public gl(bk bkVar) {
        super(bkVar);
    }
}
