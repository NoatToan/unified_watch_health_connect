package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class b3 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19686e;

    static {
        bk bkVar = new bk("bike_radar_profile", 212);
        f19686e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("enabled", 0, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("radar_ant_id", 1, 139, 1.0d, 0.0d, "", false, zn.UINT16Z));
        bkVar.e(new rc("radar_ant_id_trans_type", 2, 10, 1.0d, 0.0d, "", false, zn.UINT8Z));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public b3() {
        super(wb.b(212));
    }

    public b3(bk bkVar) {
        super(bkVar);
    }
}
