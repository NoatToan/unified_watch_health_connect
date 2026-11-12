package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class af extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19676e;

    static {
        bk bkVar = new bk("gpe_ephemeris_stats", 394);
        f19676e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("valid", 0, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("start_time", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("end_time", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("seed_time", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.SINT32;
        bkVar.e(new rc("seed_position_lat", 4, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("seed_position_long", 5, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("gpe_type", 6, 0, 1.0d, 0.0d, "", false, zn.GPE_EPHEMERIS_TYPE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public af() {
        super(wb.b(394));
    }

    public af(bk bkVar) {
        super(bkVar);
    }
}
