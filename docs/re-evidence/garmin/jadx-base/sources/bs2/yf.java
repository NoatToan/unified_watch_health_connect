package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class yf extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20689e;

    static {
        bk bkVar = new bk("hfd_accelerometer_data", 468);
        f20689e = bkVar;
        zn znVar = zn.MESSAGE_INDEX;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("hfd_event_identifier", 0, 132, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.SINT16;
        bkVar.e(new rc("x_axis", 1, 131, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("y_axis", 2, 131, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("z_axis", 3, 131, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public yf() {
        super(wb.b(468));
    }

    public yf(bk bkVar) {
        super(bkVar);
    }
}
