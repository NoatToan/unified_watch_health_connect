package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.mapbox.maps.MapboxMap;

/* JADX INFO: loaded from: classes11.dex */
public class g extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20148e;

    static {
        bk bkVar = new bk("accel_temp_cal", 118);
        f20148e = bkVar;
        zn znVar = zn.UINT8;
        bkVar.e(new rc("temperature_variance", 0, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("temperature_delta", 1, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc(MapboxMap.QFE_OFFSET, 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 16.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("offset_variance", 3, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("offset_delta", 4, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public g() {
        super(wb.b(118));
    }

    public g(bk bkVar) {
        super(bkVar);
    }
}
