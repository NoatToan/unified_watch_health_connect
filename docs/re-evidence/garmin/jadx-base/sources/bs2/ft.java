package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class ft extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20143e;

    static {
        bk bkVar = new bk("slave_device", 106);
        f20143e = bkVar;
        bkVar.e(new rc("manufacturer", 0, 132, 1.0d, 0.0d, "", false, zn.MANUFACTURER));
        bkVar.e(new rc("product", 1, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.f19753c.get(1).f20460i.add(new pw("favero_product", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(1).f20460i.get(0).b(0, 263L);
        bkVar.f19753c.get(1).f20460i.add(new pw("garmin_product", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(1).f20460i.get(1).b(0, 1L);
        bkVar.f19753c.get(1).f20460i.get(1).b(0, 15L);
        bkVar.f19753c.get(1).f20460i.get(1).b(0, 13L);
        bkVar.f19753c.get(1).f20460i.get(1).b(0, 89L);
        bkVar.e(new rc("serial_number", 2, 140, 1.0d, 0.0d, "", false, zn.UINT32Z));
        bkVar.e(new rc("software_index", 3, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ft() {
        super(wb.b(106));
    }

    public ft(bk bkVar) {
        super(bkVar);
    }
}
