package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class lq extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20284e;

    static {
        bk bkVar = new bk("round_info", 190);
        f20284e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar2 = zn.UINT32;
        bkVar.e(new rc("global_course_id", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.STRING;
        bkVar.e(new rc("course_name", 1, 7, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("local_timestamp", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.LOCAL_DATE_TIME));
        bkVar.e(new rc("start_time", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("stop_time", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("scoring_method", 5, 0, 1.0d, 0.0d, "", false, zn.GOLF_SCORING_TYPE));
        zn znVar4 = zn.BOOL;
        bkVar.e(new rc("use_handicap_scoring", 6, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("use_stroke_counting", 7, 0, 1.0d, 0.0d, "", false, znVar4));
        zn znVar5 = zn.UINT8;
        bkVar.e(new rc("out_par", 8, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("in_par", 9, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("total_par", 10, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("tee_box_used", 11, 7, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("tee_box_slope", 12, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("distance_walked", 13, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 10.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("steps_walked", 14, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "steps", false, znVar2));
        bkVar.e(new rc("back_nine_global_course_id", 15, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("back_nine_course_name", 16, 7, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("round_type", 17, 0, 1.0d, 0.0d, "", false, zn.GOLF_ROUND_TYPE));
        bkVar.e(new rc("scorekeeper_profile_id", 18, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("player_profile_id", 19, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("player_course_handicap", 20, 1, 1.0d, 0.0d, "", false, zn.SINT8));
        zn znVar6 = zn.FLOAT32;
        bkVar.e(new rc("tee_box_rating", 21, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar6));
        zn znVar7 = zn.GOLF_TEE_BOX;
        bkVar.e(new rc("tee_box_type", 22, 0, 1.0d, 0.0d, "", false, znVar7));
        bkVar.e(new rc("privacy_type", 23, 0, 1.0d, 0.0d, "", false, zn.GOLF_ROUND_PRIVACY_TYPE));
        bkVar.e(new rc("club_track_on_putter", 24, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("second_tee_box_used", 25, 7, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("second_tee_box_slope", 26, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("second_tee_box_rating", 27, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("second_tee_box_type", 28, 0, 1.0d, 0.0d, "", false, znVar7));
        bkVar.e(new rc("exclude_scorecard_from_stats", 29, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("starting_hole", 30, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public lq() {
        super(wb.b(190));
    }

    public lq(bk bkVar) {
        super(bkVar);
    }
}
