package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.mapbox.turf.TurfConstants;

/* JADX INFO: loaded from: classes11.dex */
public class q7 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20425e;

    static {
        bk bkVar = new bk("device_settings2", 415);
        f20425e = bkVar;
        zn znVar = zn.RED_SHIFT_DISPLAY;
        bkVar.e(new rc("red_shift_display", 0, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("red_shift_display_current_activity", 1, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("red_shift_display_during_sleep", 2, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("screen_brightness_night_vision", 3, 0, 1.0d, 0.0d, "", false, zn.SCREEN_BRIGHTNESS));
        bkVar.e(new rc("backlight_timeout_night_vision", 4, 2, 1.0d, 0.0d, "", false, zn.BACKLIGHT_TIMEOUT));
        zn znVar2 = zn.BOOL;
        bkVar.e(new rc("touch_enabled_night_vision", 5, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("night_vision_do_not_disturb_enabled", 6, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("backlight_mode_during_sleep", 7, 0, 1.0d, 0.0d, "", false, zn.BACKLIGHT_MODE));
        zn znVar3 = zn.UINT16;
        bkVar.e(new rc("lume_mode_lux_cutoff", 8, 132, 1.0d, 0.0d, "", false, znVar3));
        zn znVar4 = zn.RED_SHIFT_COLOR;
        bkVar.e(new rc("red_shift_color", 9, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("red_shift_color_current_activity", 10, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("red_shift_color_during_sleep", 11, 0, 1.0d, 0.0d, "", false, znVar4));
        zn znVar5 = zn.TONE;
        bkVar.e(new rc("nap_timer_tone", 12, 0, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("find_my_phone_alerts_enabled", 13, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("do_not_disturb_red_shift", 14, 0, 1.0d, 0.0d, "", false, zn.DO_NOT_DISTURB_SETTING));
        bkVar.e(new rc("garmin_share_enabled", 15, 0, 1.0d, 0.0d, "", false, znVar2));
        zn znVar6 = zn.FLASHLIGHT_BRIGHTNESS;
        bkVar.e(new rc("flashlight_brightness", 16, 2, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("flashlight_strobe_mode", 17, 0, 1.0d, 0.0d, "", false, zn.FLASHLIGHT_STROBE_MODE));
        bkVar.e(new rc("flashlight_strobe_speed", 18, 0, 1.0d, 0.0d, "", false, zn.FLASHLIGHT_STROBE_SPEED));
        bkVar.e(new rc("flashlight_strobe_color", 19, 0, 1.0d, 0.0d, "", false, zn.FLASHLIGHT_STROBE_COLOR));
        bkVar.e(new rc("compass_target_angle", 20, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 10430.38d, 0.0d, TurfConstants.UNIT_RADIANS, false, zn.UINT32));
        bkVar.e(new rc("map_zoom", 21, 0, 1.0d, 0.0d, "", false, zn.ZOOM_LEVEL));
        bkVar.e(new rc("ab_input_units", 22, 2, 1.0d, 0.0d, "", false, zn.AB_INPUT_UNITS));
        bkVar.e(new rc("ab_wind_units", 23, 2, 1.0d, 0.0d, "", false, zn.AB_WIND_UNITS));
        bkVar.e(new rc("ab_auto_update", 24, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("ab_mv_temp_table_cal_enabled", 25, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("ab_cnfg_fld", 26, 132, 1.0d, 0.0d, "", false, zn.DISPLAY_FIELD_EXTENDED));
        bkVar.e(new rc("position_enhancement", 27, 2, 1.0d, 0.0d, "", false, zn.POSITION_ENHANCEMENT));
        bkVar.e(new rc("audio_muted", 28, 0, 1.0d, 0.0d, "", false, znVar2));
        zn znVar7 = zn.UINT8;
        bkVar.e(new rc("voice_volume", 29, 2, 1.0d, 0.0d, "", false, znVar7));
        bkVar.e(new rc("media_volume", 30, 2, 1.0d, 0.0d, "", false, znVar7));
        bkVar.e(new rc("system_volume", 31, 2, 1.0d, 0.0d, "", false, znVar7));
        bkVar.e(new rc("map_mode", 32, 0, 1.0d, 0.0d, "", false, zn.MAP_PROFILE_MODE));
        bkVar.e(new rc("map_activity_theme", 33, 2, 1.0d, 0.0d, "", false, znVar7));
        bkVar.e(new rc("tap_to_wake", 34, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("backlight_timeout_16", 35, 132, 1.0d, 0.0d, "", false, zn.BACKLIGHT_TIMEOUT_16));
        bkVar.e(new rc("draw_popularity", 36, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("hybrid_map_enabled", 37, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("hybrid_map_type", 38, 0, 1.0d, 0.0d, "", false, zn.HYBRID_MAP_TYPE));
        bkVar.e(new rc("hybrid_map_id", 39, 132, 1.0d, 0.0d, "", false, znVar3));
        bkVar.f19753c.get(39).f20460i.add(new pw("mdb_map_type", 0, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(39).f20460i.get(0).b(38, 0L);
        zn znVar8 = zn.KEYBOARD_LANGUAGE;
        bkVar.e(new rc("keyboard_languages", 40, 0, 1.0d, 0.0d, "", false, znVar8));
        bkVar.e(new rc("keyboard_language_selector_enabled", 41, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("current_keyboard_language", 42, 0, 1.0d, 0.0d, "", false, znVar8));
        bkVar.e(new rc("ab_range_units", 43, 0, 1.0d, 0.0d, "", false, zn.AB_RANGE_UNITS));
        bkVar.e(new rc("ab_muzzle_velocity_units", 44, 0, 1.0d, 0.0d, "", false, zn.AB_MUZZLE_VELOCITY_UNITS));
        bkVar.e(new rc("ab_gun_parameter_units", 45, 0, 1.0d, 0.0d, "", false, zn.AB_GUN_PARAMETER_UNITS));
        bkVar.e(new rc("ab_hold_precision_units", 46, 0, 1.0d, 0.0d, "", false, zn.AB_HOLD_PRECISION_UNITS));
        bkVar.e(new rc("ab_bullet_weight_units", 47, 0, 1.0d, 0.0d, "", false, zn.AB_BULLET_WEIGHT_UNITS));
        bkVar.e(new rc("ab_temperature_units", 48, 0, 1.0d, 0.0d, "", false, zn.AB_TEMPERATURE_UNITS));
        bkVar.e(new rc("ab_pressure_units", 49, 0, 1.0d, 0.0d, "", false, zn.AB_PRESSURE_UNITS));
        bkVar.e(new rc("ab_altitude_units", 50, 0, 1.0d, 0.0d, "", false, zn.AB_ALTITUDE_UNITS));
        bkVar.e(new rc("ab_energy_units", 51, 0, 1.0d, 0.0d, "", false, zn.AB_ENERGY_UNITS));
        bkVar.e(new rc("ab_target_type", 52, 0, 1.0d, 0.0d, "", false, zn.AB_TARGET_TYPE));
        bkVar.e(new rc("ab_sight_on_condition", 53, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("ab_advanced", 54, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("five_hertz_recording_enabled", 55, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("passcode_type_bits", 56, 10, 1.0d, 0.0d, "", false, zn.PASSCODE_TYPE_BITS));
        bkVar.e(new rc("passcode_lock_state", 57, 0, 1.0d, 0.0d, "", false, zn.PASSCODE_LOCK_STATE));
        bkVar.e(new rc("device_passcode_enabled", 58, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("sleep_ui_restriction_enabled", 59, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("nap_timer_volume", 60, 2, 1.0d, 0.0d, "", false, znVar7));
        bkVar.e(new rc("nap_timer_vibration", 61, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("notification_volume", 62, 2, 1.0d, 0.0d, "", false, znVar7));
        bkVar.e(new rc("keyboard_tones_enabled", 63, 0, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("timer_change_tones_enabled", 64, 0, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("lap_tones_enabled", 65, 0, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("virtual_partner_enabled", 66, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("night_vision_flashlight_brightness", 67, 2, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("spoken_watch_face_mode", 68, 0, 1.0d, 0.0d, "", false, zn.SPOKEN_WATCH_FACE_MODE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public q7() {
        super(wb.b(415));
    }

    public q7(bk bkVar) {
        super(bkVar);
    }
}
