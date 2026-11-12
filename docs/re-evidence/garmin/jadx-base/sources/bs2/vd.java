package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class vd extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20619e;

    static {
        bk bkVar = new bk("gc_queue_info", 196);
        f20619e = bkVar;
        zn znVar = zn.STRING;
        bkVar.e(new rc("oauth_token", 0, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("oauth_secret", 1, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("queue_has_data", 2, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public vd() {
        super(wb.b(196));
    }

    public vd(bk bkVar) {
        super(bkVar);
    }
}
