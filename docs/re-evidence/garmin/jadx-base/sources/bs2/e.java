package bs2;

import com.mapbox.maps.MapboxMap;

/* JADX INFO: loaded from: classes11.dex */
public class e extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20066e;

    static {
        bk bkVar = new bk("accel_temp_cal_convergence", 252);
        f20066e = bkVar;
        bkVar.e(new rc("temperature", 0, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc(MapboxMap.QFE_OFFSET, 1, 131, 1.0d, 0.0d, "", false, zn.SINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public e() {
        super(wb.b(252));
    }

    public e(bk bkVar) {
        super(bkVar);
    }
}
