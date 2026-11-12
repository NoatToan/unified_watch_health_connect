package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class n2 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20323e;

    static {
        bk bkVar = new bk("bbp_config", 360);
        f20323e = bkVar;
        bkVar.e(new rc("enabled", 0, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("mode", 1, 2, 1.0d, 0.0d, "", false, zn.BBP_MODE));
        zn znVar = zn.UINT16;
        bkVar.e(new rc("max_time_to_break", 2, 132, 1.0d, 0.0d, "minutes", false, znVar));
        bkVar.e(new rc("min_break_duration", 3, 132, 1.0d, 0.0d, "minutes", false, znVar));
        bkVar.e(new rc("max_daily_drive", 4, 132, 1.0d, 0.0d, "minutes", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public n2() {
        super(wb.b(360));
    }

    public n2(bk bkVar) {
        super(bkVar);
    }
}
