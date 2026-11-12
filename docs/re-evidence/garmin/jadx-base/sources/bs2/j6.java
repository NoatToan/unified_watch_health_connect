package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class j6 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20230e;

    static {
        bk bkVar = new bk("daily_suggested_workout_settings", 341);
        f20230e = bkVar;
        bkVar.e(new rc("enabled", 0, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("last_workout_completed", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("running_target_type", 2, 0, 1.0d, 0.0d, "", false, zn.DAILY_SUGGESTED_WORKOUT_RUNNING_TARGET_TYPE));
        bkVar.e(new rc("cycling_target_type", 3, 0, 1.0d, 0.0d, "", false, zn.DAILY_SUGGESTED_WORKOUT_CYCLING_TARGET_TYPE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public j6() {
        super(wb.b(341));
    }

    public j6(bk bkVar) {
        super(bkVar);
    }
}
