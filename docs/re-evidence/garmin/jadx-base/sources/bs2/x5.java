package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class x5 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20664e;

    static {
        bk bkVar = new bk("course_hole_info", 193);
        f20664e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("hole_number", 0, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("hole_distance", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, zn.UINT32));
        bkVar.e(new rc("hole_par", 2, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("hole_handicap", 3, 2, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.SINT32;
        bkVar.e(new rc("pin_location_lat", 4, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("pin_location_long", 5, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public x5() {
        super(wb.b(193));
    }

    public x5(bk bkVar) {
        super(bkVar);
    }
}
