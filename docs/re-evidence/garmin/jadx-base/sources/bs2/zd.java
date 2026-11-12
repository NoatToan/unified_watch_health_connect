package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class zd extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20713e;

    static {
        bk bkVar = new bk("glucose_config", 64);
        f20713e = bkVar;
        bkVar.e(new rc("measurement_type", 0, 0, 1.0d, 0.0d, "", false, zn.GLUCOSE_MEASUREMENT_TYPE));
        bkVar.e(new rc("strip_code", 1, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("tester", 2, 0, 1.0d, 0.0d, "", false, zn.GLUCOSE_TESTER));
        bkVar.e(new rc("sample_location", 3, 0, 1.0d, 0.0d, "", false, zn.GLUCOSE_SAMPLE_LOCATION));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public zd() {
        super(wb.b(64));
    }

    public zd(bk bkVar) {
        super(bkVar);
    }
}
