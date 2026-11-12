package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.turf.TurfConstants;

/* JADX INFO: loaded from: classes11.dex */
public class rs extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20468e;

    static {
        bk bkVar = new bk("shot_data", 300);
        f20468e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("shot_id", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("hit", 1, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        zn znVar2 = zn.UINT8;
        bkVar.e(new rc("handicap", 2, 2, 1.0d, 0.0d, TurfConstants.UNIT_METERS, false, znVar2));
        bkVar.e(new rc("shot_num", 3, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("round_num", 4, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("station", 5, 2, 1.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.UINT16;
        bkVar.e(new rc("clay_exit_distance", 6, 132, 1.0d, 0.0d, TurfConstants.UNIT_METERS, false, znVar3));
        bkVar.e(new rc("clay_break_distance", 7, 132, 1.0d, 0.0d, TurfConstants.UNIT_METERS, false, znVar3));
        bkVar.e(new rc("reaction_time", 8, 132, 1.0d, 0.0d, "milliseconds", false, znVar3));
        zn znVar4 = zn.SINT16;
        bkVar.e(new rc("horizontal_offset", 9, 131, 1.0d, 0.0d, "cm", false, znVar4));
        bkVar.e(new rc("vertical_offset", 10, 131, 1.0d, 0.0d, "cm", false, znVar4));
        bkVar.e(new rc("clay_speed", 11, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "cm/s", false, znVar));
        bkVar.e(new rc("shot_speed", 12, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "cm/s", false, znVar));
        bkVar.e(new rc("break_category", 13, 0, 1.0d, 0.0d, "", false, zn.BREAK_TYPE));
        bkVar.e(new rc("clay_direction", 14, 0, 1.0d, 0.0d, "", false, zn.CLAY_DIRECTION));
        zn znVar5 = zn.SINT8;
        bkVar.e(new rc(FirebaseAnalytics.Param.SCORE, 15, 1, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("break_factor", 16, 1, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public rs() {
        super(wb.b(300));
    }

    public rs(bk bkVar) {
        super(bkVar);
    }
}
