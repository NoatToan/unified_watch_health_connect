package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class q00 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20421e;

    static {
        bk bkVar = new bk("vector_air_settings", 277);
        f20421e = bkVar;
        zn znVar = zn.UINT16;
        bkVar.e(new rc("rider_weight", 0, 132, 100.0d, 0.0d, "kg", false, znVar));
        bkVar.e(new rc("rider_height", 1, 132, 10.0d, 0.0d, "mm", false, znVar));
        bkVar.e(new rc("bike_weight", 2, 132, 100.0d, 0.0d, "kg", false, znVar));
        bkVar.e(new rc("wheel_size", 3, 132, 1.0d, 0.0d, "mm", false, znVar));
        zn znVar2 = zn.UINT32Z;
        bkVar.e(new rc("spd_ant_id", 4, 140, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("power_ant_id", 5, 140, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("logging", 6, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public q00() {
        super(wb.b(277));
    }

    public final Long r() {
        return j(5, 65535);
    }

    public final Long s() {
        return j(4, 65535);
    }

    public q00(bk bkVar) {
        super(bkVar);
    }
}
