package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class ya extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20686e;

    static {
        bk bkVar = new bk("evening_report_settings", 436);
        f20686e = bkVar;
        bkVar.e(new rc("enabled", 0, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("cards", 1, 0, 1.0d, 0.0d, "", false, zn.EVENING_REPORT_CARD_TYPE));
        bkVar.e(new rc("alert_time", 2, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ya() {
        super(wb.b(436));
    }

    public ya(bk bkVar) {
        super(bkVar);
    }
}
