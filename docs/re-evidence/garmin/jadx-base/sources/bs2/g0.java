package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class g0 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20149e;

    static {
        bk bkVar = new bk("afe_sample_config", 449);
        f20149e = bkVar;
        zn znVar = zn.BYTE;
        bkVar.e(new rc("afe_gain", 0, 13, 1.0d, 0.0d, "lsb", false, znVar));
        bkVar.e(new rc("afe_channels", 1, 13, 1.0d, 0.0d, "lsb", false, znVar));
        bkVar.e(new rc("afe_rate", 2, 13, 1.0d, 0.0d, "Hz", false, znVar));
        bkVar.e(new rc("exc_gain", 3, 13, 1.0d, 0.0d, "lsb", false, znVar));
        bkVar.e(new rc("exc_channels", 4, 13, 1.0d, 0.0d, "lsb", false, znVar));
        bkVar.e(new rc("exc_current", 5, 132, 1.0d, 0.0d, "uA", false, zn.UINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, znVar));
    }

    public g0() {
        super(wb.b(449));
    }

    public g0(bk bkVar) {
        super(bkVar);
    }
}
