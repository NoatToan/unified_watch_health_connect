package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class ez extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20086e;

    static {
        bk bkVar = new bk("tsb_diver_config", 366);
        f20086e = bkVar;
        zn znVar = zn.UINT32Z;
        bkVar.e(new rc("ant_id", 0, 140, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("diver_name", 1, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("t1_tankpod_sw_ver", 2, 132, 100.0d, 0.0d, "", false, zn.UINT16));
        zn znVar2 = zn.BOOL;
        bkVar.e(new rc("location_enabled", 3, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("messaging_enabled", 4, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("t1_owner_ant_id", 5, 140, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ez() {
        super(wb.b(366));
    }

    public ez(bk bkVar) {
        super(bkVar);
    }
}
