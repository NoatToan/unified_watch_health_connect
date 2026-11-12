package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class mb extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20309e;

    static {
        bk bkVar = new bk("exercise_benchmark_info", 344);
        f20309e = bkVar;
        zn znVar = zn.UINT16;
        bkVar.e(new rc("exercise_benchmark_id", 0, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("one_rep_max", 1, 132, 100.0d, 0.0d, "kg", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public mb() {
        super(wb.b(344));
    }

    public mb(bk bkVar) {
        super(bkVar);
    }
}
