package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class ag extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19677e;

    static {
        bk bkVar = new bk("hfd_context_data", 469);
        f19677e = bkVar;
        zn znVar = zn.MESSAGE_INDEX;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("hfd_event_identifier", 0, 132, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("vib_start", 1, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("vib_stop", 2, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ag() {
        super(wb.b(469));
    }

    public ag(bk bkVar) {
        super(bkVar);
    }
}
