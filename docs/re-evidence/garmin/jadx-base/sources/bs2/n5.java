package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.mapbox.turf.TurfConstants;

/* JADX INFO: loaded from: classes11.dex */
public class n5 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20327e;

    static {
        bk bkVar = new bk("club_info", 173);
        f20327e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        zn znVar2 = zn.UINT32;
        bkVar.e(new rc("club_id_upper", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("club_id_lower", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("club_type", 2, 0, 1.0d, 0.0d, "", false, zn.GOLF_CLUB));
        zn znVar3 = zn.STRING;
        bkVar.e(new rc("club_nickname", 3, 7, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("shaft_flex", 4, 0, 1.0d, 0.0d, "", false, zn.SHAFT_FLEX));
        zn znVar4 = zn.SINT16;
        bkVar.e(new rc("length_offset", 5, 131, 100.0d, 0.0d, TurfConstants.UNIT_INCHES, false, znVar4));
        bkVar.e(new rc("club_average_distance", 6, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("club_advice_distance", 7, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar2));
        zn znVar5 = zn.UINT16;
        bkVar.e(new rc("club_loft", 8, 132, 100.0d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar5));
        bkVar.e(new rc("club_lie", 9, 132, 100.0d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar5));
        bkVar.e(new rc("club_deleted_state", 10, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        zn znVar6 = zn.UINT8;
        bkVar.e(new rc("fairway_hit_pct", 11, 2, 1.0d, 0.0d, "percent", false, znVar6));
        bkVar.e(new rc("fairway_miss_left_pct", 12, 2, 1.0d, 0.0d, "percent", false, znVar6));
        bkVar.e(new rc("fairway_miss_right_pct", 13, 2, 1.0d, 0.0d, "percent", false, znVar6));
        bkVar.e(new rc("green_hit_pct", 14, 2, 1.0d, 0.0d, "percent", false, znVar6));
        bkVar.e(new rc("green_miss_left_pct", 15, 2, 1.0d, 0.0d, "percent", false, znVar6));
        bkVar.e(new rc("green_miss_right_pct", 16, 2, 1.0d, 0.0d, "percent", false, znVar6));
        bkVar.e(new rc("green_miss_long_pct", 17, 2, 1.0d, 0.0d, "percent", false, znVar6));
        bkVar.e(new rc("green_miss_short_pct", 18, 2, 1.0d, 0.0d, "percent", false, znVar6));
        bkVar.e(new rc("club_maximum_distance", 19, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("aggressive_dispersion_offset_nec", 20, 131, 100.0d, 0.0d, "m", false, znVar4));
        bkVar.e(new rc("aggressive_dispersion_dist_nec", 21, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("aggressive_dispersion_offset_swc", 22, 131, 100.0d, 0.0d, "m", false, znVar4));
        bkVar.e(new rc("aggressive_dispersion_dist_swc", 23, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("aggressive_avg_position_offset", 24, 131, 100.0d, 0.0d, "m", false, znVar4));
        bkVar.e(new rc("aggressive_avg_position_dist", 25, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("moderate_dispersion_offset_nec", 26, 131, 100.0d, 0.0d, "m", false, znVar4));
        bkVar.e(new rc("moderate_dispersion_dist_nec", 27, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("moderate_dispersion_offset_swc", 28, 131, 100.0d, 0.0d, "m", false, znVar4));
        bkVar.e(new rc("moderate_dispersion_dist_swc", 29, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("moderate_avg_position_offset", 30, 131, 100.0d, 0.0d, "m", false, znVar4));
        bkVar.e(new rc("moderate_avg_position_dist", 31, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("conservative_dispersion_offset_nec", 32, 131, 100.0d, 0.0d, "m", false, znVar4));
        bkVar.e(new rc("conservative_dispersion_dist_nec", 33, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("conservative_dispersion_offset_swc", 34, 131, 100.0d, 0.0d, "m", false, znVar4));
        bkVar.e(new rc("conservative_dispersion_dist_swc", 35, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("conservative_avg_position_offset", 36, 131, 100.0d, 0.0d, "m", false, znVar4));
        bkVar.e(new rc("conservative_avg_position_dist", 37, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("average_air_density", 38, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "kg/m^3", false, zn.FLOAT32));
        bkVar.e(new rc("tag_uuid", 39, 7, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("tag_last_updated", 40, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public n5() {
        super(wb.b(173));
    }

    public n5(bk bkVar) {
        super(bkVar);
    }
}
