package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.mapbox.maps.MapboxMap;

/* JADX INFO: loaded from: classes11.dex */
public class e4 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20073e;

    static {
        bk bkVar = new bk("bridge_inter_cal", 107);
        f20073e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("force", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 16.0d, 0.0d, "", false, zn.UINT32));
        zn znVar = zn.SINT16;
        bkVar.e(new rc("pco", 1, 131, 16.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("temperature", 2, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc(MapboxMap.QFE_OFFSET, 3, 132, 16.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("x_sens", 4, 131, 16384.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("gain", 5, 131, 16384.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("magnitude", 6, 132, 16.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("mag_var", 7, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("mag_min", 8, 132, 16.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("mag_max", 9, 132, 16.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("avg_mag_error", 10, 131, 16.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("adb_offset", 11, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("vex_offset_old", 12, 132, 16.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("g_range", 13, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc("vex_offset", 14, 132, 16.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("x_amplitude", 15, 131, 16.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("x_offset", 16, 131, 16.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("bias", 17, 132, 16.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public e4() {
        super(wb.b(107));
    }

    public e4(bk bkVar) {
        super(bkVar);
    }
}
