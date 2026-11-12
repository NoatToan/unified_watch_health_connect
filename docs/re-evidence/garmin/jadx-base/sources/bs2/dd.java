package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class dd extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20053e;

    static {
        bk bkVar = new bk("file_creator", 49);
        f20053e = bkVar;
        bkVar.e(new rc("software_version", 0, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("hardware_version", 1, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        zn znVar = zn.STRING;
        bkVar.e(new rc("creator_name", 2, 7, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.BOOL;
        bkVar.e(new rc("primary_training_device", 3, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("primary_activity_tracker", 4, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("os_version", 5, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public dd() {
        super(wb.b(49));
    }

    public dd(bk bkVar) {
        super(bkVar);
    }
}
