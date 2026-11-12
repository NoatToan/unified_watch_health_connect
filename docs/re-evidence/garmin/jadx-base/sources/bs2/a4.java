package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.mapbox.maps.MapboxMap;

/* JADX INFO: loaded from: classes11.dex */
public class a4 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19658e;

    static {
        bk bkVar = new bk("bridge_cal", 108);
        f19658e = bkVar;
        bkVar.e(new rc("force", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 16.0d, 0.0d, "", false, zn.UINT32));
        zn znVar = zn.SINT16;
        bkVar.e(new rc("pco", 1, 131, 16.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("temperature", 2, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("temp_slope", 3, 131, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("handedness", 4, 0, 1.0d, 0.0d, "", false, zn.SIDE));
        bkVar.e(new rc(MapboxMap.QFE_OFFSET, 5, 132, 16.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("x_sens", 6, 131, 16384.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("gain", 7, 131, 16384.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("adb_matrix", 8, 131, 32768.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("correction", 9, 131, 16384.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("db_slope", 10, 132, 4096.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("db_offset", 11, 132, 16.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("vex_offset", 12, 132, 16.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("g_range", 13, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("xb", 14, 131, 16384.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("xm", 15, 131, 1.6777216E7d, 0.0d, "", false, znVar));
        bkVar.e(new rc("pedal_weight", 16, 132, 16.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("pedal_pco", 17, 131, 16.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("mag", 18, 132, 16.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("offset_slope", 19, 131, 16384.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public a4() {
        super(wb.b(108));
    }

    public a4(bk bkVar) {
        super(bkVar);
    }
}
