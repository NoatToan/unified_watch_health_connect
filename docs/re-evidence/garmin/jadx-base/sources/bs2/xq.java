package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class xq extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20673e;

    static {
        bk bkVar = new bk("running_tolerance", 473);
        f20673e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("feedback", 0, 0, 1.0d, 0.0d, "", false, zn.RUNNING_TOLERANCE_FEEDBACK));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("acute_impact_load", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("acute_distance", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("acute_tolerance", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("downhill_tolerance", 4, 132, 10.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("sprint_tolerance", 5, 132, 10.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("long_distance_tolerance", 6, 132, 10.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public xq() {
        super(wb.b(473));
    }

    public xq(bk bkVar) {
        super(bkVar);
    }
}
