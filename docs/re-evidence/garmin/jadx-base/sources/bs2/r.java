package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class r extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20445e;

    static {
        bk bkVar = new bk("activity_data", 57);
        f20445e = bkVar;
        bkVar.e(new rc("device_index", 0, 2, 1.0d, 0.0d, "", false, zn.DEVICE_INDEX));
        zn znVar = zn.SINT32;
        bkVar.e(new rc("position_lat", 1, 133, 1.0d, 0.0d, "semicircles", false, znVar));
        bkVar.e(new rc("position_long", 2, 133, 1.0d, 0.0d, "semicircles", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("altitude", 3, 132, 5.0d, 500.0d, "m", false, znVar2));
        zn znVar3 = zn.UINT8;
        bkVar.e(new rc("heart_rate", 4, 2, 1.0d, 0.0d, "bpm", false, znVar3));
        bkVar.e(new rc("calories", 5, 2, 1.0d, 0.0d, "kcal", false, znVar3));
        bkVar.e(new rc("cadence", 6, 2, 1.0d, 0.0d, "rpm", false, znVar3));
        bkVar.e(new rc("cycles", 7, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("cycle_length", 8, 2, 100.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("speed", 9, 132, 1000.0d, 0.0d, "m/s", false, znVar2));
        bkVar.e(new rc("distance", 10, 132, 100.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("power", 11, 132, 1.0d, 0.0d, "watts", false, znVar2));
        bkVar.e(new rc("grade", 12, 131, 100.0d, 0.0d, "%", false, zn.SINT16));
        bkVar.e(new rc("resistance", 13, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("temperature", 14, 1, 1.0d, 0.0d, "C", false, zn.SINT8));
        bkVar.e(new rc("swim_stroke", 15, 0, 1.0d, 0.0d, "", false, zn.SWIM_STROKE));
        bkVar.e(new rc("latency", 16, 132, 100.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public r() {
        super(wb.b(57));
    }

    public r(bk bkVar) {
        super(bkVar);
    }
}
