package bs2;

import com.mapbox.maps.MapboxMap;

/* JADX INFO: loaded from: classes11.dex */
public class i4 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20208e;

    static {
        bk bkVar = new bk("bridge_temp_cal", 116);
        f20208e = bkVar;
        bkVar.e(new rc(MapboxMap.QFE_OFFSET, 0, 132, 16.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("num_samples", 1, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public i4() {
        super(wb.b(116));
    }

    public i4(bk bkVar) {
        super(bkVar);
    }
}
