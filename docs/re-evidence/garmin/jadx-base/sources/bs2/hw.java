package bs2;

import com.mapbox.maps.MapboxMap;

/* JADX INFO: loaded from: classes11.dex */
public class hw extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20201e;

    static {
        bk bkVar = new bk("strain_temp_cal_offset", 248);
        f20201e = bkVar;
        bkVar.e(new rc(MapboxMap.QFE_OFFSET, 0, 131, 1.0d, 0.0d, "", false, zn.SINT16));
        bkVar.e(new rc("bin_filled", 1, 2, 1.0d, 0.0d, "", false, zn.TEMP_CAL_BIN_STATUS));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public hw() {
        super(wb.b(248));
    }

    public hw(bk bkVar) {
        super(bkVar);
    }
}
