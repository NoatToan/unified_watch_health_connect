package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes11.dex */
public class vv extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20632e;

    static {
        bk bkVar = new bk("sporting_event", 358);
        f20632e = bkVar;
        zn znVar = zn.UINT32;
        bkVar.e(new rc(TtmlNode.ATTR_ID, 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.STRING;
        bkVar.e(new rc("uuid", 1, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("start_time", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        bkVar.e(new rc("start_time_local", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.LOCAL_DATE_TIME));
        bkVar.e(new rc("name", 4, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc(FirebaseAnalytics.Param.LOCATION, 5, 7, 1.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.SINT32;
        bkVar.e(new rc("location_lat", 6, 133, 1.0d, 0.0d, "semicircles", false, znVar3));
        bkVar.e(new rc("location_lon", 7, 133, 1.0d, 0.0d, "semicircles", false, znVar3));
        bkVar.e(new rc("event_priority", 8, 0, 1.0d, 0.0d, "", false, zn.SPORTING_EVENT_PRIORITY));
        bkVar.e(new rc("duration_type", 9, 0, 1.0d, 0.0d, "", false, zn.SPORTING_EVENT_DURATION_TYPE));
        bkVar.e(new rc("duration_value", 10, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(10).f20460i.add(new pw("duration_distance", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m"));
        bkVar.f19753c.get(10).f20460i.get(0).b(9, 0L);
        bkVar.f19753c.get(10).f20460i.add(new pw("duration_time", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s"));
        bkVar.f19753c.get(10).f20460i.get(1).b(9, 1L);
        zn znVar4 = zn.DISPLAY_MEASURE;
        bkVar.e(new rc("duration_units", 11, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("goal_value", 12, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.f19753c.get(12).f20460i.add(new pw("goal_distance", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m"));
        bkVar.f19753c.get(12).f20460i.get(0).b(23, 0L);
        bkVar.f19753c.get(12).f20460i.add(new pw("goal_time", TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s"));
        bkVar.f19753c.get(12).f20460i.get(1).b(23, 1L);
        bkVar.e(new rc("goal_units", 13, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("sport", 14, 0, 1.0d, 0.0d, "", false, zn.SPORT));
        bkVar.e(new rc("sub_sport", 15, 0, 1.0d, 0.0d, "", false, zn.SUB_SPORT));
        bkVar.e(new rc("course_id", 16, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("workout_id", 17, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("paceband_ids", 18, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc(FirebaseAnalytics.Param.GROUP_ID, 19, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("image_uuid", 20, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("event_category", 21, 0, 1.0d, 0.0d, "", false, zn.SPORTING_EVENT_CATEGORY));
        bkVar.e(new rc("is_event_owner", 22, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("goal_type", 23, 0, 1.0d, 0.0d, "", false, zn.SPORTING_EVENT_GOAL_TYPE));
        bkVar.e(new rc("city", 24, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("province", 25, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("country", 26, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("time_zone_for_display", 27, 7, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("attendance_type", 28, 0, 1.0d, 0.0d, "", false, zn.SPORTING_EVENT_ATTENDANCE_TYPE));
        bkVar.e(new rc("total_ascent", 29, 131, 1.0d, 0.0d, "m", false, zn.SINT16));
        bkVar.e(new rc("elevation_profile_type", 30, 0, 1.0d, 0.0d, "", false, zn.ELEVATION_PROFILE));
        bkVar.e(new rc("hill_type", 31, 0, 1.0d, 0.0d, "", false, zn.HILL_TYPE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public vv() {
        super(wb.b(358));
    }

    public vv(bk bkVar) {
        super(bkVar);
    }
}
