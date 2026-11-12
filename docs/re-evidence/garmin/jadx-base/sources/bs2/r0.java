package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class r0 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20446e;

    static {
        bk bkVar = new bk("algorithm_profile", 355);
        f20446e = bkVar;
        bkVar.e(new rc("algorithm_type", 0, 132, 1.0d, 0.0d, "", false, zn.ALGORITHM_TYPE));
        bkVar.e(new rc("algorithm_runs_on", 1, 132, 1.0d, 0.0d, "", false, zn.ALGORITHM_RUNS_ON));
        bkVar.e(new rc("software_version", 2, 132, 100.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public r0() {
        super(wb.b(355));
    }

    public r0(bk bkVar) {
        super(bkVar);
    }
}
