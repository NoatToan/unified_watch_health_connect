package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class g8 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20154e;

    static {
        bk bkVar = new bk("dive_summary", 268);
        f20154e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("reference_mesg", 0, 132, 1.0d, 0.0d, "", false, zn.MESG_NUM));
        bkVar.e(new rc("reference_index", 1, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("avg_depth", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m", false, znVar));
        bkVar.e(new rc("max_depth", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m", false, znVar));
        bkVar.e(new rc("surface_interval", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        zn znVar2 = zn.UINT8;
        bkVar.e(new rc("start_cns", 5, 2, 1.0d, 0.0d, "percent", false, znVar2));
        bkVar.e(new rc("end_cns", 6, 2, 1.0d, 0.0d, "percent", false, znVar2));
        zn znVar3 = zn.UINT16;
        bkVar.e(new rc("start_n2", 7, 132, 1.0d, 0.0d, "percent", false, znVar3));
        bkVar.e(new rc("end_n2", 8, 132, 1.0d, 0.0d, "percent", false, znVar3));
        bkVar.e(new rc("o2_toxicity", 9, 132, 1.0d, 0.0d, "OTUs", false, znVar3));
        bkVar.e(new rc("dive_number", 10, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("bottom_time", 11, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("avg_pressure_sac", 12, 132, 100.0d, 0.0d, "bar/min", false, znVar3));
        bkVar.e(new rc("avg_volume_sac", 13, 132, 100.0d, 0.0d, "L/min", false, znVar3));
        bkVar.e(new rc("avg_rmv", 14, 132, 100.0d, 0.0d, "L/min", false, znVar3));
        bkVar.e(new rc("descent_time", 15, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("ascent_time", 16, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("avg_ascent_rate", 17, 133, 1000.0d, 0.0d, "m/s", false, zn.SINT32));
        bkVar.e(new rc("start_rgd_idx", 18, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("end_rgd_idx", 19, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("clean_time", 20, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("tsb_detected", 21, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("avg_descent_rate", 22, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m/s", false, znVar));
        bkVar.e(new rc("max_ascent_rate", 23, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m/s", false, znVar));
        bkVar.e(new rc("max_descent_rate", 24, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m/s", false, znVar));
        bkVar.e(new rc("hang_time", 25, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public g8() {
        super(wb.b(268));
    }

    public g8(bk bkVar) {
        super(bkVar);
    }
}
