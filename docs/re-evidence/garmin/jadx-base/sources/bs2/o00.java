package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class o00 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20369e;

    static {
        bk bkVar = new bk("vector3_inter_cal_sample", 256);
        f20369e = bkVar;
        zn znVar = zn.SINT16;
        bkVar.e(new rc("accel", 0, 131, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("bridge", 1, 131, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public o00() {
        super(wb.b(256));
    }

    public o00(bk bkVar) {
        super(bkVar);
    }
}
