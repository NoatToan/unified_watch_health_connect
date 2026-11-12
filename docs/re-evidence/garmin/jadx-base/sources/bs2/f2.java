package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes11.dex */
public class f2 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20088e;

    static {
        bk bkVar = new bk("batter_profile", 235);
        f20088e = bkVar;
        zn znVar = zn.UINT32;
        bkVar.e(new rc(FirebaseAnalytics.Param.INDEX, 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.STRING;
        bkVar.e(new rc("friendly_name", 1, 7, 1.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.FLOAT32;
        bkVar.e(new rc("height", 2, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("weight", 3, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "kg", false, znVar3));
        zn znVar4 = zn.UINT8;
        bkVar.e(new rc("birth_year", 4, 2, 1.0d, -1900.0d, "", false, znVar4));
        bkVar.e(new rc("gender", 5, 0, 1.0d, 0.0d, "", false, zn.GENDER));
        bkVar.e(new rc("coaching", 6, 0, 1.0d, 0.0d, "", false, zn.COACHING));
        bkVar.e(new rc("skill_level", 7, 2, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("handedness", 8, 0, 1.0d, 0.0d, "", false, zn.HANDEDNESS));
        bkVar.e(new rc("last_bat_index", 9, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("bat_sport", 10, 0, 1.0d, 0.0d, "", false, zn.SPORT));
        zn znVar5 = zn.UINT16;
        bkVar.e(new rc("feet_position", 11, 132, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("bat_position", 12, 132, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("swing_count", 13, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("highest_bat_speed", 14, 132, 10.0d, 0.0d, "kph", false, znVar5));
        bkVar.e(new rc("highest_hand_speed", 15, 132, 10.0d, 0.0d, "kph", false, znVar5));
        bkVar.e(new rc("lowest_time_to_impact", 16, 132, 1.0d, 0.0d, "ms", false, znVar5));
        bkVar.e(new rc("highest_swings_per_session", 17, 132, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("avatar", 18, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("goals", 19, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("badges", 20, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("status", 21, 132, 1.0d, 0.0d, "", false, zn.RECORD_SYNC_STATUS));
        bkVar.e(new rc("last_mod_time", 22, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("curr_batting_mode", 23, 0, 1.0d, 0.0d, "", false, zn.BATTING_MODE));
        bkVar.e(new rc("shirt_color", 24, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("skin_color", 25, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("shoe_color", 26, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("pant_color", 27, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("helmet_color", 28, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("jersey_name", 29, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("jersey_number", 30, 2, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("picture_type", 31, 0, 1.0d, 0.0d, "", false, zn.BATTER_PICTURE_TYPE));
        bkVar.e(new rc("picture_number", 32, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("detection_sensitivity", 33, 0, 1.0d, 0.0d, "", false, zn.SWING_DETECT_SENSITIVITY));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public f2() {
        super(wb.b(235));
    }

    public f2(bk bkVar) {
        super(bkVar);
    }
}
