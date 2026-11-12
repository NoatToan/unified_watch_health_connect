package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class j1 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20226e;

    static {
        bk bkVar = new bk("area_calc_settings", 485);
        f20226e = bkVar;
        bkVar.e(new rc("calc_method", 0, 0, 1.0d, 0.0d, "", false, zn.AREA_CALC_METHOD));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("slope_angle", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("price_per_area", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("area_unit", 3, 0, 1.0d, 0.0d, "", false, zn.AREA_CALC_AREA_UNIT));
        zn znVar2 = zn.AREA_CALC_LENGTH_UNIT;
        bkVar.e(new rc("length_unit", 4, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("tractor_width", 5, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("tractor_width_unit", 6, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("price_per_length", 7, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("manual_add_point", 8, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public j1() {
        super(wb.b(485));
    }

    public j1(bk bkVar) {
        super(bkVar);
    }
}
