package bs2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes11.dex */
public class te extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20576e;

    static {
        bk bkVar = new bk("goal", 15);
        f20576e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("sport", 0, 0, 1.0d, 0.0d, "", false, zn.SPORT));
        bkVar.e(new rc("sub_sport", 1, 0, 1.0d, 0.0d, "", false, zn.SUB_SPORT));
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc(FirebaseAnalytics.Param.START_DATE, 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc(FirebaseAnalytics.Param.END_DATE, 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc(NotificationConstants.KEY_DATA_MIME_TYPE, 4, 0, 1.0d, 0.0d, "", false, zn.GOAL));
        zn znVar2 = zn.UINT32;
        bkVar.e(new rc("value", 5, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.BOOL;
        bkVar.e(new rc("repeat", 6, 0, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("target_value", 7, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("recurrence", 8, 0, 1.0d, 0.0d, "", false, zn.GOAL_RECURRENCE));
        bkVar.e(new rc("recurrence_value", 9, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("enabled", 10, 0, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("source", 11, 0, 1.0d, 0.0d, "", false, zn.GOAL_SOURCE));
        bkVar.e(new rc("auto_goal_seed", 12, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public te() {
        super(wb.b(15));
    }

    public te(bk bkVar) {
        super(bkVar);
    }
}
