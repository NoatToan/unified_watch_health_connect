package bs2;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.messaging.Constants;
import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* JADX INFO: loaded from: classes11.dex */
public class e0 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20067e;

    static {
        bk bkVar = new bk("adaptive_coaching_workout", 428);
        f20067e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc(NotificationConstants.KEY_DATA_MIME_TYPE, 0, 0, 1.0d, 0.0d, "", false, zn.ADAPTIVE_COACHING_WORKOUT_TYPE));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("workout_index", 1, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("status", 2, 0, 1.0d, 0.0d, "", false, zn.ADAPTIVE_COACHING_WORKOUT_STATUS));
        bkVar.e(new rc(Constants.ScionAnalytics.PARAM_LABEL, 3, 0, 1.0d, 0.0d, "", false, zn.TRAINING_EFFECT_LABEL));
        bkVar.e(new rc("phrase", 4, 0, 1.0d, 0.0d, "", false, zn.ADAPTIVE_COACHING_WORKOUT_PHRASE));
        zn znVar3 = zn.UINT8;
        bkVar.e(new rc("training_effect", 5, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("anaerobic_training_effect", 6, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("sport", 7, 0, 1.0d, 0.0d, "", false, zn.SPORT));
        bkVar.e(new rc("sub_sport", 8, 0, 1.0d, 0.0d, "", false, zn.SUB_SPORT));
        bkVar.e(new rc("duration", 9, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("local_timestamp", 10, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.LOCAL_DATE_TIME));
        bkVar.e(new rc("dsw_external_workout", 11, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("alternative_set", 12, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("multisport_set", 13, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID, 14, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public e0() {
        super(wb.b(428));
    }

    public e0(bk bkVar) {
        super(bkVar);
    }
}
