package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class oa extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20375e;

    static {
        bk bkVar = new bk("eqn_riding_metrics", 477);
        f20375e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.SINT32;
        bkVar.e(new rc("position_lat", 0, 133, 1.0d, 0.0d, "semicircles", false, znVar));
        bkVar.e(new rc("position_long", 1, 133, 1.0d, 0.0d, "semicircles", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("calc_speed", 2, 132, 1000.0d, 0.0d, "m/s", false, znVar2));
        bkVar.e(new rc("app_speed", 3, 132, 1000.0d, 0.0d, "m/s", false, znVar2));
        zn znVar3 = zn.UINT32;
        bkVar.e(new rc("calc_distance", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("delta_distance", 5, 132, 10.0d, 0.0d, "m", false, znVar2));
        zn znVar4 = zn.UINT8;
        bkVar.e(new rc("gps_quality", 6, 2, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("centiseconds", 7, 2, 1.0d, 0.0d, "s", false, znVar4));
        bkVar.e(new rc("app_distance", 8, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("altitude", 9, 132, 1.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("barometric_pressure", 10, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "Pa", false, znVar3));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public oa() {
        super(wb.b(477));
    }

    public oa(bk bkVar) {
        super(bkVar);
    }
}
