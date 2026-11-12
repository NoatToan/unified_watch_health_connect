package bs2;

import com.mapbox.maps.MapboxMap;

/* JADX INFO: loaded from: classes11.dex */
public class zv extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f21028e;

    static {
        bk bkVar = new bk("ss_cal_data", 88);
        f21028e = bkVar;
        zn znVar = zn.SINT32;
        bkVar.e(new rc("bridge_n", 0, 133, 16.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("bridge_p", 1, 133, 16.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("db_slope", 2, 133, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("db_offset", 3, 133, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("slope", 4, 132, 256.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc(MapboxMap.QFE_OFFSET, 5, 132, 16.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("accel_db_angle", 6, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("adb_matrix", 7, 131, 1.0d, 0.0d, "", false, zn.SINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public zv() {
        super(wb.b(88));
    }

    public zv(bk bkVar) {
        super(bkVar);
    }
}
