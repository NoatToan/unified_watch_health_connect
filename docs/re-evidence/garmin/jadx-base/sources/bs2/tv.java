package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes11.dex */
public class tv extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20586e;

    static {
        bk bkVar = new bk("sporting_event_leg", 461);
        f20586e = bkVar;
        zn znVar = zn.UINT32;
        bkVar.e(new rc(TtmlNode.ATTR_ID, 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("sporting_event_id", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("sport", 2, 0, 1.0d, 0.0d, "", false, zn.SPORT));
        bkVar.e(new rc("sub_sport", 3, 0, 1.0d, 0.0d, "", false, zn.SUB_SPORT));
        bkVar.e(new rc("duration_value", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("duration_type", 5, 0, 1.0d, 0.0d, "", false, zn.SPORTING_EVENT_DURATION_TYPE));
        zn znVar2 = zn.DISPLAY_MEASURE;
        bkVar.e(new rc("duration_units", 6, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("goal_value", 7, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("goal_type", 8, 0, 1.0d, 0.0d, "", false, zn.SPORTING_EVENT_GOAL_TYPE));
        bkVar.e(new rc("goal_units", 9, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("course_id", 10, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public tv() {
        super(wb.b(461));
    }

    public tv(bk bkVar) {
        super(bkVar);
    }
}
