package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class cf extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19779e;

    static {
        bk bkVar = new bk("gps_ephemeris_stats", 141);
        f19779e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("valid", 0, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("start_time", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("end_time", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("seed_time", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.SINT32;
        bkVar.e(new rc("seed_position_lat", 4, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("seed_position_long", 5, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public cf() {
        super(wb.b(141));
    }

    public cf(bk bkVar) {
        super(bkVar);
    }
}
