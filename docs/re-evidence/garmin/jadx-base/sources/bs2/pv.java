package bs2;

import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes11.dex */
public class pv extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20409e;

    static {
        bk bkVar = new bk("sport", 12);
        f20409e = bkVar;
        bkVar.e(new rc("sport", 0, 0, 1.0d, 0.0d, "", false, zn.SPORT));
        bkVar.e(new rc("sub_sport", 1, 0, 1.0d, 0.0d, "", false, zn.SUB_SPORT));
        bkVar.e(new rc("name", 3, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("calorie_sources", 4, 132, 1.0d, 0.0d, "", false, zn.CALORIE_SOURCES));
        zn znVar = zn.BOOL;
        bkVar.e(new rc("enabled", 5, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("sport_event", 6, 0, 1.0d, 0.0d, "", false, zn.SPORT_EVENT));
        zn znVar2 = zn.UINT8;
        bkVar.e(new rc("background_index", 7, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("current_map_profile", 8, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("current_routing_profile", 9, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc(TtmlNode.ATTR_TTS_COLOR, 10, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("high_contrast", 11, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("activity_profile_index", 12, 2, 1.0d, 0.0d, "", false, zn.ACTIVITY_PROFILE_INDEX));
        bkVar.e(new rc("auto_lock_enabled", 13, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("auto_activity_start_threshold", 14, 2, 1.0d, 0.0d, "minutes", false, znVar2));
        bkVar.e(new rc("popularity_routing_enabled", 15, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("force_display_on_in_activity", 16, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("navigation_prompt_mode", 17, 0, 1.0d, 0.0d, "", false, zn.NAVIGATION_PROMPT_MODE));
        bkVar.e(new rc("sharp_bend_warnings_enabled", 18, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("recent_app_options_items", 19, 0, 1.0d, 0.0d, "", false, zn.APP_OPTIONS_ITEM));
        bkVar.e(new rc("visibility_conditions_key", 20, 0, 1.0d, 0.0d, "", false, zn.TRAINING_PAGE_VISIBILITY_CONDITION_TYPE));
        bkVar.e(new rc("workout_videos_enabled", 21, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("high_traffic_warnings_enabled", 22, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("road_hazard_warnings", 23, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("unpaved_roads_warnings_enabled", 24, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public pv() {
        super(wb.b(12));
    }

    public pv(bk bkVar) {
        super(bkVar);
    }
}
