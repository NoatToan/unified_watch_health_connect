package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.mapbox.maps.MapboxMap;

/* JADX INFO: loaded from: classes11.dex */
public class m0 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20291e;

    static {
        bk bkVar = new bk("afe_selfcal_data", 453);
        f20291e = bkVar;
        zn znVar = zn.UINT32;
        bkVar.e(new rc("timestamp_32k", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 32768.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("timestamp_ms", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT8;
        bkVar.e(new rc("afe_channels", 2, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("afe_setup", 3, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("gain", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "lsb/V", false, znVar));
        bkVar.e(new rc(MapboxMap.QFE_OFFSET, 5, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "lsb", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public m0() {
        super(wb.b(453));
    }

    public m0(bk bkVar) {
        super(bkVar);
    }
}
