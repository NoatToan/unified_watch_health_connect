package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class sg extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20509e;

    static {
        bk bkVar = new bk("hrm_profile", 4);
        f20509e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.BOOL;
        bkVar.e(new rc("enabled", 0, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("hrm_ant_id", 1, 139, 1.0d, 0.0d, "", false, zn.UINT16Z));
        bkVar.e(new rc("log_hrv", 2, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("hrm_ant_id_trans_type", 3, 10, 1.0d, 0.0d, "", false, zn.UINT8Z));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public sg() {
        super(wb.b(4));
    }

    public sg(bk bkVar) {
        super(bkVar);
    }
}
