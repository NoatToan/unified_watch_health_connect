package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class xu extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20676e;

    static {
        bk bkVar = new bk("spindle_enter_temperature_cal_mode", 110);
        f20676e = bkVar;
        bkVar.e(new rc("flash_key", 0, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("option", 1, 0, 1.0d, 0.0d, "", false, zn.SPINDLE_TEMPERATURE_CAL_OPTION));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public xu() {
        super(wb.b(110));
    }

    public xu(bk bkVar) {
        super(bkVar);
    }
}
