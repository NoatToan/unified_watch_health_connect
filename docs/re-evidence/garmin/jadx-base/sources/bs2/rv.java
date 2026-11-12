package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class rv extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20470e;

    static {
        bk bkVar = new bk("sport_settings", 296);
        f20470e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("sport", 0, 0, 1.0d, 0.0d, "", false, zn.SPORT));
        bkVar.e(new rc("sub_sport", 1, 0, 1.0d, 0.0d, "", false, zn.SUB_SPORT));
        bkVar.e(new rc("start_threshold", 2, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public rv() {
        super(wb.b(296));
    }

    public rv(bk bkVar) {
        super(bkVar);
    }
}
