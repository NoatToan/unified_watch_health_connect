package bs2;

import com.mapbox.maps.MapboxMap;

/* JADX INFO: loaded from: classes11.dex */
public class c extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19765e;

    static {
        bk bkVar = new bk("accel_cal", 85);
        f19765e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.SINT32;
        bkVar.e(new rc(MapboxMap.QFE_OFFSET, 0, 133, 16.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("gain", 1, 133, 65536.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("variance", 2, 132, 256.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("delta", 3, 132, 16.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.SINT16;
        bkVar.e(new rc("temp_slope", 4, 131, 65536.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("temperature", 5, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("g_range", 6, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("align", 7, 131, 32768.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public c() {
        super(wb.b(85));
    }

    public c(bk bkVar) {
        super(bkVar);
    }
}
