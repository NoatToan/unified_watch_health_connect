package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class lj extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20280e;

    static {
        bk bkVar = new bk("map_profile", 70);
        f20280e = bkVar;
        zn znVar = zn.MESSAGE_INDEX;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("mode", 0, 0, 1.0d, 0.0d, "", false, zn.MAP_PROFILE_MODE));
        bkVar.e(new rc("detail", 1, 0, 1.0d, 0.0d, "", false, zn.MAP_DETAIL));
        bkVar.e(new rc("shaded_relief", 2, 0, 1.0d, 0.0d, "", false, zn.SHADED_RELIEF));
        zn znVar2 = zn.ZOOM_LEVEL;
        bkVar.e(new rc("points_zoom", 3, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("locations_zoom", 4, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("street_zoom", 5, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("land_cover_zoom", 6, 0, 1.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.TEXT_SIZE;
        bkVar.e(new rc("points_text", 7, 0, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("locations_text", 8, 0, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("street_text", 9, 0, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("land_cover_text", 10, 0, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("map_orientation", 11, 0, 1.0d, 0.0d, "", false, zn.MAP_ORIENTATION));
        zn znVar4 = zn.BOOL;
        bkVar.e(new rc("map_show", 12, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("map_show_locations", 13, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("map_auto_zoom", 14, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("map_guidance", 15, 0, 1.0d, 0.0d, "", false, zn.MAP_GUIDANCE));
        bkVar.e(new rc("map_show_track", 16, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("use_device_settings", 17, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("map_track_color", 18, 0, 1.0d, 0.0d, "", false, zn.TRACK_COLOR));
        bkVar.e(new rc("turn_guidance", 20, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("disabled_maps", 21, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("marine_chart_mode", 22, 0, 1.0d, 0.0d, "", false, zn.MARINE_CHART_MODE));
        bkVar.e(new rc("spot_soundings", 23, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("light_sectors", 24, 0, 1.0d, 0.0d, "", false, zn.SWITCH));
        bkVar.e(new rc("marine_symbol_set", 25, 0, 1.0d, 0.0d, "", false, zn.MARINE_SYMBOL_SET));
        bkVar.e(new rc("map_information", 26, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.UINT32));
        bkVar.e(new rc("draw_segments", 27, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("draw_contour_lines", 28, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("map_theme_filename", 29, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("use_device_map_theme", 30, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("draw_popularity", 31, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("draw_course_points", 32, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("map_color_mode", 33, 0, 1.0d, 0.0d, "", false, zn.MAP_COLOR_MODE));
        bkVar.e(new rc("draw_high_traffic", 34, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("draw_climb_pro", 35, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("draw_road_hazards", 36, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("draw_unpaved_roads", 37, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("map_zoom_level", 38, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("map_show_cities", 39, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("map_show_grid_lines", 40, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("show_weather", 41, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("current_weather_layer", 42, 0, 1.0d, 0.0d, "", false, zn.WEATHER_LAYER_TYPE));
        bkVar.e(new rc("map_show_dive_points", 43, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public lj() {
        super(wb.b(70));
    }

    public lj(bk bkVar) {
        super(bkVar);
    }
}
