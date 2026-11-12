package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class j2 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20227e;

    static {
        bk bkVar = new bk("battery_save_mode_settings", 215);
        f20227e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("enabled", 0, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("alerts", 1, 140, 1.0d, 0.0d, "", false, zn.BATTERY_SAVE_MODE_ALERTS));
        bkVar.e(new rc("phone_notification_filters", 2, 10, 1.0d, 0.0d, "", false, zn.PHONE_NOTIFICATION_FILTER_0));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public j2() {
        super(wb.b(215));
    }

    public j2(bk bkVar) {
        super(bkVar);
    }
}
