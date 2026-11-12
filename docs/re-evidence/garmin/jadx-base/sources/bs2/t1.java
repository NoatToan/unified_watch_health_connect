package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class t1 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20568e;

    static {
        bk bkVar = new bk("avtn_fly_info", 503);
        f20568e = bkVar;
        zn znVar = zn.STRING;
        bkVar.e(new rc("departure_airport", 0, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("arrival_airport", 1, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public t1() {
        super(wb.b(503));
    }

    public t1(bk bkVar) {
        super(bkVar);
    }
}
