package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class db extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20051e;

    static {
        bk bkVar = new bk("event_race_predictions", 489);
        f20051e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("local_timestamp", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.LOCAL_DATE_TIME));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("sporting_event_id", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("sporting_event_uuid", 2, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("prediction", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("feedback_phrase", 4, 0, 1.0d, 0.0d, "", false, zn.EVENT_RACE_PREDICTIONS_FEEDBACK_PHRASE));
        bkVar.e(new rc("optimistic_projection_limit", 5, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("pessimistic_projection_limit", 6, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("midpoint_projection", 7, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("goal_time", 8, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public db() {
        super(wb.b(489));
    }

    public db(bk bkVar) {
        super(bkVar);
    }
}
