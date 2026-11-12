package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class ci extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19782e;

    static {
        bk bkVar = new bk("incident_accelerometer_data", 380);
        f19782e = bkVar;
        zn znVar = zn.MESSAGE_INDEX;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("parent_index", 0, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("sample_cnt", 1, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("samples", 2, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ci() {
        super(wb.b(380));
    }

    public ci(bk bkVar) {
        super(bkVar);
    }
}
