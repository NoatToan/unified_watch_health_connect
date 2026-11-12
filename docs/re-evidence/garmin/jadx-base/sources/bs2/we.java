package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class we extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20646e;

    static {
        bk bkVar = new bk("golf_swing_data", 417);
        f20646e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("club_id_upper", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("club_id_lower", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("club_speed", 2, 132, 100.0d, 0.0d, "m/s", false, znVar2));
        bkVar.e(new rc("ball_speed", 3, 132, 100.0d, 0.0d, "m/s", false, znVar2));
        bkVar.e(new rc("est_carry_dist", 4, 132, 100.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("est_total_dist", 5, 132, 100.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("smash_factor", 6, 132, 100.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("backswing_time", 7, 132, 100.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("downswing_time", 8, 132, 100.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("tempo", 9, 132, 100.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("back_stroke_length", 10, 132, 100.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("target_carry_dist", 11, 132, 1.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("target_total_dist", 12, 132, 1.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("target_backswing_time", 13, 132, 100.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("target_downswing_time", 14, 132, 100.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("target_tempo", 15, 132, 100.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("shot_source", 16, 0, 1.0d, 0.0d, "", false, zn.GOLF_SHOT_SOURCE_TYPE));
        bkVar.e(new rc("forward_stroke_length", 17, 132, 100.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public we() {
        super(wb.b(417));
    }

    public we(bk bkVar) {
        super(bkVar);
    }
}
