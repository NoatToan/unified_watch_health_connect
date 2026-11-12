package bs2;

import com.mapbox.maps.MapboxMap;

/* JADX INFO: loaded from: classes11.dex */
public class fw extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20146e;

    static {
        bk bkVar = new bk("strain_temp_cal_convergence", 249);
        f20146e = bkVar;
        zn znVar = zn.UINT16;
        bkVar.e(new rc("temperature", 0, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("vex", 1, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc(MapboxMap.QFE_OFFSET, 2, 131, 1.0d, 0.0d, "", false, zn.SINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public fw() {
        super(wb.b(249));
    }

    public fw(bk bkVar) {
        super(bkVar);
    }
}
