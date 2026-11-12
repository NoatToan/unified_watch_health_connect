package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class ub extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20596e;

    static {
        bk bkVar = new bk("faceit_watchface_slots", 502);
        f20596e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.STRING;
        bkVar.e(new rc("slot1", 0, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("slot2", 1, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("slot3", 2, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ub() {
        super(wb.b(502));
    }

    public ub(bk bkVar) {
        super(bkVar);
    }
}
