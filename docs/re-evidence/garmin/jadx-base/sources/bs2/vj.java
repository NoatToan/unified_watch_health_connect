package bs2;

import com.mapbox.maps.MapboxMap;

/* JADX INFO: loaded from: classes11.dex */
public class vj extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20624e;

    static {
        bk bkVar = new bk("memory_transfer_data", 168);
        f20624e = bkVar;
        bkVar.e(new rc("memory_type", 0, 2, 1.0d, 0.0d, "", false, zn.MEMORY_TRANSFER_TYPE));
        bkVar.e(new rc(MapboxMap.QFE_OFFSET, 1, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("data", 2, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public vj() {
        super(wb.b(168));
    }

    public vj(bk bkVar) {
        super(bkVar);
    }
}
