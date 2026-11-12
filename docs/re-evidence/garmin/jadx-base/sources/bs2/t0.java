package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class t0 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20567e;

    static {
        bk bkVar = new bk("ant_channel_id", 82);
        f20567e = bkVar;
        bkVar.e(new rc("channel_number", 0, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        zn znVar = zn.UINT8Z;
        bkVar.e(new rc("device_type", 1, 10, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("device_number", 2, 139, 1.0d, 0.0d, "", false, zn.UINT16Z));
        bkVar.e(new rc("transmission_type", 3, 10, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("device_index", 4, 2, 1.0d, 0.0d, "", false, zn.DEVICE_INDEX));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public t0() {
        super(wb.b(82));
    }

    public t0(bk bkVar) {
        super(bkVar);
    }
}
