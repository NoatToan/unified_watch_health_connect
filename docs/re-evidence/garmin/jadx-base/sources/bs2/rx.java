package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class rx extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20471e;

    static {
        bk bkVar = new bk("time_zone", 423);
        f20471e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("zone_id", 0, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("region_id", 1, 2, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.STRING;
        bkVar.e(new rc("name", 2, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("abbreviation", 3, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("is_favorite", 4, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        zn znVar3 = zn.SINT32;
        bkVar.e(new rc("position_lat", 5, 133, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("position_long", 6, 133, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public rx() {
        super(wb.b(423));
    }

    public rx(bk bkVar) {
        super(bkVar);
    }
}
