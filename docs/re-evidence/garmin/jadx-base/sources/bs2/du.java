package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class du extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20062e;

    static {
        bk bkVar = new bk("software", 35);
        f20062e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("version", 3, 132, 100.0d, 0.0d, "", false, zn.UINT16));
        zn znVar = zn.STRING;
        bkVar.e(new rc("part_number", 5, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("version_string", 6, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public du() {
        super(wb.b(35));
    }

    public du(bk bkVar) {
        super(bkVar);
    }
}
