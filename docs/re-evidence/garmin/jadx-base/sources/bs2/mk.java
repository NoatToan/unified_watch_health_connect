package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class mk extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20315e;

    static {
        bk bkVar = new bk("met_zone", 10);
        f20315e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("high_bpm", 1, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("calories", 2, 132, 10.0d, 0.0d, "kcal / min", false, zn.UINT16));
        bkVar.e(new rc("fat_calories", 3, 2, 10.0d, 0.0d, "kcal / min", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public mk() {
        super(wb.b(10));
    }

    public mk(bk bkVar) {
        super(bkVar);
    }
}
