package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes11.dex */
public class bs extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19759e;

    static {
        bk bkVar = new bk("sensor_profile", 147);
        f19759e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("ant_channel_id", 0, 140, 1.0d, 0.0d, "", false, zn.ANT_CHANNEL_ID));
        bkVar.e(new rc("ant_channel_type", 1, 2, 1.0d, 0.0d, "", false, zn.ANT_CHANNEL_TYPE));
        zn znVar = zn.STRING;
        bkVar.e(new rc("name", 2, 7, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.BOOL;
        bkVar.e(new rc("enabled", 3, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("log", 4, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("auto_crank_length", 5, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("auto_wheel_cal", 6, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("auto_power_zero", 7, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("speed_source", 8, 0, 1.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.UINT8;
        bkVar.e(new rc("crank_length", 9, 2, 2.0d, -110.0d, "mm", false, znVar3));
        zn znVar4 = zn.UINT16;
        bkVar.e(new rc("custom_wheelsize", 10, 132, 1000.0d, 0.0d, "m", false, znVar4));
        bkVar.e(new rc("cal_factor", 11, 132, 10.0d, 0.0d, "%", false, znVar4));
        bkVar.e(new rc("odometer_rollover", 12, 2, 1.0d, 0.0d, "", false, znVar3));
        zn znVar5 = zn.UINT32;
        bkVar.e(new rc("odometer", 13, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar5));
        bkVar.e(new rc("virb_recording_mode", 14, 2, 1.0d, 0.0d, "", false, zn.VIDEO_RECORDING_MODE));
        zn znVar6 = zn.REMOTE_ACTION;
        bkVar.e(new rc("remote_action_press", 15, 2, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("remote_action_press_hold", 16, 2, 1.0d, 0.0d, "", false, znVar6));
        zn znVar7 = zn.UINT8Z;
        bkVar.e(new rc("front_gear_num", 17, 10, 1.0d, 0.0d, "", false, znVar7));
        bkVar.e(new rc("front_gear", 18, 10, 1.0d, 0.0d, "", false, znVar7));
        bkVar.e(new rc("rear_gear_num", 19, 10, 1.0d, 0.0d, "", false, znVar7));
        bkVar.e(new rc("rear_gear", 20, 10, 1.0d, 0.0d, "", false, znVar7));
        bkVar.e(new rc("auto_wheelsize", 21, 132, 1000.0d, 0.0d, "m", false, znVar4));
        bkVar.e(new rc("auto_sdm_cal", 24, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("gear_ratio", 25, 132, 100.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("bike_weight", 26, 132, 10.0d, 0.0d, "kg", false, znVar4));
        bkVar.e(new rc("remote_action_double_press", 27, 2, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("remote_action_buttons_press", 28, 2, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("remote_action_buttons_press_hold", 29, 2, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("remote_action_buttons_double_press", 30, 2, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("peak_power_phase_percentage", 31, 2, 1.0d, 0.0d, "%", false, znVar3));
        bkVar.e(new rc("part_number", 32, 132, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("manufacturer", 33, 132, 1.0d, 0.0d, "", false, zn.MANUFACTURER));
        bkVar.e(new rc("software_version", 34, 132, 100.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("product", 35, 132, 1.0d, 0.0d, "", false, znVar4));
        bkVar.f19753c.get(34).f20460i.add(new pw("favero_product", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(34).f20460i.get(0).b(33, 263L);
        bkVar.f19753c.get(34).f20460i.add(new pw("garmin_product", 132, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(34).f20460i.get(1).b(33, 1L);
        bkVar.f19753c.get(34).f20460i.get(1).b(33, 15L);
        bkVar.f19753c.get(34).f20460i.get(1).b(33, 13L);
        bkVar.f19753c.get(34).f20460i.get(1).b(33, 89L);
        bkVar.e(new rc("bike_light_network_config", 36, 0, 1.0d, 0.0d, "", false, zn.BIKE_LIGHT_NETWORK_CONFIG_TYPE));
        bkVar.e(new rc("bike_light_type", 37, 0, 1.0d, 0.0d, "", false, zn.BIKE_LIGHT_LIGHT_TYPE));
        bkVar.e(new rc("bike_light_beam", 38, 0, 1.0d, 0.0d, "", false, zn.BIKE_LIGHT_BEAM_TYPE));
        bkVar.e(new rc("bike_light_mode", 39, 0, 1.0d, 0.0d, "", false, zn.BIKE_LIGHT_MODE_TYPE));
        bkVar.e(new rc("bike_light_settings", 40, 139, 1.0d, 0.0d, "", false, zn.BIKE_LIGHT_SETTINGS_BITS));
        bkVar.e(new rc("bike_light_beam_focus", 41, 2, 1.0d, 0.0d, "%", false, znVar3));
        bkVar.e(new rc("te_ps_enabled", 42, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("cycling_dynamics_enabled", 43, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("hrm_capabilities_supported", 44, 10, 1.0d, 0.0d, "", false, zn.HRM_CAPABILITY_BITS));
        bkVar.f19753c.get(43).f20460i.add(new pw("garmin_hrm_capabilities_supported", 10, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(43).f20460i.get(0).b(33, 1L);
        bkVar.f19753c.get(43).f20460i.get(0).b(33, 15L);
        bkVar.f19753c.get(43).f20460i.get(0).b(33, 13L);
        zn znVar8 = zn.SENSOR_SOURCE_USAGE;
        bkVar.e(new rc("advanced_speed_source", 45, 0, 1.0d, 0.0d, "", false, znVar8));
        bkVar.e(new rc("advanced_distance_source", 46, 0, 1.0d, 0.0d, "", false, znVar8));
        bkVar.e(new rc("bike_light_radar_capable", 47, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("power_calibration_prompt", 48, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("bike_light_beam_intensity", 49, 2, 1.0d, 0.0d, "%", false, znVar3));
        bkVar.e(new rc("ble_address", 50, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("sensor_tech", 51, 0, 1.0d, 0.0d, "", false, zn.SENSOR_TECH_TYPE));
        bkVar.e(new rc("sensor_type", 52, 0, 1.0d, 0.0d, "", false, zn.WIRELESS_SENSOR_TYPE));
        bkVar.e(new rc("ble_addr_type", 53, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("shimano_di2_tone_frequency", 54, 0, 1.0d, 0.0d, "", false, zn.TONE_FREQUENCY));
        bkVar.e(new rc("chain_weight", 55, 132, 1.0d, 0.0d, "g", false, znVar4));
        bkVar.e(new rc("chain_length", 56, 132, 1.0d, 0.0d, "mm", false, znVar4));
        bkVar.e(new rc("span_length", 57, 132, 1.0d, 0.0d, "mm", false, znVar4));
        bkVar.e(new rc(FirebaseAnalytics.Param.LOCATION, 58, 0, 1.0d, 0.0d, "", false, zn.SENSOR_LOCATION));
        bkVar.e(new rc("exd_product_type", 59, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("auto_set_front_gears", 60, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("auto_set_rear_gears", 61, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("hr_beat_event_type", 62, 2, 1.0d, 0.0d, "", false, znVar3));
        zn znVar9 = zn.GOLF_CLUB;
        bkVar.e(new rc("club_type", 63, 0, 1.0d, 0.0d, "", false, znVar9));
        bkVar.e(new rc("club_id_upper", 64, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("club_id_lower", 65, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("rider_weight", 66, 132, 100.0d, 0.0d, "kg", false, znVar4));
        bkVar.e(new rc("rider_height", 67, 132, 10.0d, 0.0d, "mm", false, znVar4));
        bkVar.e(new rc("auto_sensor_config", 68, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("cda", 69, 132, 1000.0d, 0.0d, "m^2", false, znVar4));
        bkVar.e(new rc("maintenance_date", 70, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        bkVar.e(new rc("maintenance_alert", 71, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("transition_time_offset", 72, 2, 1.0d, 0.0d, "s", false, znVar3));
        bkVar.e(new rc("supported_sensor_tech", 73, 139, 1.0d, 0.0d, "", false, zn.SENSOR_TECH_BITS));
        bkVar.e(new rc("pressure_units", 74, 0, 1.0d, 0.0d, "", false, zn.PRESSURE_MEASURE));
        bkVar.e(new rc("rated_pressure", 75, 132, 1.0d, 0.0d, "", false, znVar4));
        bkVar.f19753c.get(74).f20460i.add(new pw("rated_pressure_psi", 132, 1.0d, 0.0d, "PSI"));
        bkVar.f19753c.get(74).f20460i.get(0).b(74, 0L);
        bkVar.f19753c.get(74).f20460i.add(new pw("rated_pressure_bar", 132, 1.0d, 0.0d, "Bar"));
        bkVar.f19753c.get(74).f20460i.get(1).b(74, 2L);
        bkVar.e(new rc("reserve_pressure", 76, 132, 1.0d, 0.0d, "", false, znVar4));
        bkVar.f19753c.get(75).f20460i.add(new pw("reserve_pressure_psi", 132, 1.0d, 0.0d, "PSI"));
        bkVar.f19753c.get(75).f20460i.get(0).b(74, 0L);
        bkVar.f19753c.get(75).f20460i.add(new pw("reserve_pressure_bar", 132, 1.0d, 0.0d, "Bar"));
        bkVar.f19753c.get(75).f20460i.get(1).b(74, 2L);
        bkVar.e(new rc("volume", 77, 132, 1.0d, 0.0d, "", false, znVar4));
        bkVar.f19753c.get(76).f20460i.add(new pw("volume_cuft", 132, 10.0d, 0.0d, "CuFt"));
        bkVar.f19753c.get(76).f20460i.get(0).b(74, 0L);
        bkVar.f19753c.get(76).f20460i.add(new pw("volume_l", 132, 10.0d, 0.0d, "L"));
        bkVar.f19753c.get(76).f20460i.get(1).b(74, 2L);
        bkVar.e(new rc("used_for_gas_rate", 78, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("exd_auto_scroll", 79, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("exd_brightness", 80, 0, 1.0d, 0.0d, "", false, zn.EXD_BRIGHTNESS_TYPE));
        bkVar.e(new rc("exd_operational_mode", 81, 0, 1.0d, 0.0d, "", false, zn.EXD_OPERATIONAL_MODE_TYPE));
        bkVar.e(new rc("bike_light_camera_capable", 82, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("video_resolution", 83, 2, 1.0d, 0.0d, "", false, zn.VIDEO_RESOLUTION));
        bkVar.e(new rc("audio_recording_mode", 84, 2, 1.0d, 0.0d, "", false, zn.AUDIO_RECORDING_MODE));
        bkVar.e(new rc("sdm_hrm_treadmill_cal_factor", 85, 132, 100.0d, 0.0d, "%", false, znVar4));
        bkVar.e(new rc("auto_sdm_hrm_cal", 86, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("bike_radar_mfg_id_pending", 87, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("original_club_type", 88, 0, 1.0d, 0.0d, "", false, znVar9));
        bkVar.e(new rc("transmission_power", 89, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("subwave_version", 90, 10, 1.0d, 0.0d, "", false, znVar7));
        bkVar.e(new rc("public_name", 91, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("eis_mode", 92, 0, 1.0d, 0.0d, "", false, zn.EIS_MODE));
        bkVar.e(new rc("app_uuid", 93, 2, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("running_step_speed_loss_support", 94, 0, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("power_calibration_prompt_ext", 95, 0, 1.0d, 0.0d, "", false, zn.POWER_CALIBRATION_PROMPT));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public bs() {
        super(wb.b(147));
    }

    public bs(bk bkVar) {
        super(bkVar);
    }
}
