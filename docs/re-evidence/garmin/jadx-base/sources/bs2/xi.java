package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class xi extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20668e;

    static {
        bk bkVar = new bk("lev_profile", 139);
        f20668e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.BOOL;
        bkVar.e(new rc("enabled", 0, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("lev_ant_id", 1, 139, 1.0d, 0.0d, "", false, zn.UINT16Z));
        bkVar.e(new rc("log_lev", 2, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("lev_ant_id_trans_type", 3, 10, 1.0d, 0.0d, "", false, zn.UINT8Z));
        bkVar.e(new rc("auto_wheel_size", 4, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("custom_wheel_size", 5, 132, 1.0d, 0.0d, "", false, zn.LEV_WHEEL_SIZE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public xi() {
        super(wb.b(139));
    }

    public xi(bk bkVar) {
        super(bkVar);
    }
}
