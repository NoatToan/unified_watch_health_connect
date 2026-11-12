package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;

/* JADX INFO: loaded from: classes11.dex */
public class e8 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20075e;

    static {
        bk bkVar = new bk("dive_settings", 258);
        f20075e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.MESSAGE_INDEX;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("name", 0, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc(ModelSourceWrapper.TYPE, 1, 0, 1.0d, 0.0d, "", false, zn.TISSUE_MODEL_TYPE));
        zn znVar2 = zn.UINT8;
        bkVar.e(new rc("gf_low", 2, 2, 1.0d, 0.0d, "percent", false, znVar2));
        bkVar.e(new rc("gf_high", 3, 2, 1.0d, 0.0d, "percent", false, znVar2));
        bkVar.e(new rc("water_type", 4, 0, 1.0d, 0.0d, "", false, zn.WATER_TYPE));
        zn znVar3 = zn.FLOAT32;
        bkVar.e(new rc("water_density", 5, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "kg/m^3", false, znVar3));
        bkVar.e(new rc("po2_warn", 6, 2, 100.0d, 0.0d, "percent", false, znVar2));
        bkVar.e(new rc("po2_critical", 7, 2, 100.0d, 0.0d, "percent", false, znVar2));
        bkVar.e(new rc("po2_deco", 8, 2, 100.0d, 0.0d, "percent", false, znVar2));
        zn znVar4 = zn.BOOL;
        bkVar.e(new rc("safety_stop_enabled", 9, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("bottom_depth", 10, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar3));
        zn znVar5 = zn.UINT32;
        bkVar.e(new rc("bottom_time", 11, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("apnea_countdown_enabled", 12, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("apnea_countdown_time", 13, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("backlight_mode", 14, 0, 1.0d, 0.0d, "", false, zn.DIVE_BACKLIGHT_MODE));
        bkVar.e(new rc("backlight_brightness", 15, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("backlight_timeout", 16, 2, 1.0d, 0.0d, "", false, zn.BACKLIGHT_TIMEOUT));
        zn znVar6 = zn.UINT16;
        bkVar.e(new rc("repeat_dive_interval", 17, 132, 1.0d, 0.0d, "s", false, znVar6));
        bkVar.e(new rc("safety_stop_time", 18, 132, 1.0d, 0.0d, "s", false, znVar6));
        bkVar.e(new rc("heart_rate_source_type", 19, 0, 1.0d, 0.0d, "", false, zn.SOURCE_TYPE));
        bkVar.e(new rc("heart_rate_source", 20, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.f19753c.get(22).f20460i.add(new pw("heart_rate_antplus_device_type", 2, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(22).f20460i.get(0).b(19, 1L);
        bkVar.f19753c.get(22).f20460i.add(new pw("heart_rate_local_device_type", 2, 1.0d, 0.0d, ""));
        bkVar.f19753c.get(22).f20460i.get(1).b(19, 5L);
        bkVar.e(new rc("travel_gas", 21, 132, 1.0d, 0.0d, "", false, znVar));
        zn znVar7 = zn.CCR_SETPOINT_SWITCH_MODE;
        bkVar.e(new rc("ccr_low_setpoint_switch_mode", 22, 0, 1.0d, 0.0d, "", false, znVar7));
        bkVar.e(new rc("ccr_low_setpoint", 23, 2, 100.0d, 0.0d, "percent", false, znVar2));
        bkVar.e(new rc("ccr_low_setpoint_depth", 24, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m", false, znVar5));
        bkVar.e(new rc("ccr_high_setpoint_switch_mode", 25, 0, 1.0d, 0.0d, "", false, znVar7));
        bkVar.e(new rc("ccr_high_setpoint", 26, 2, 100.0d, 0.0d, "percent", false, znVar2));
        bkVar.e(new rc("ccr_high_setpoint_depth", 27, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m", false, znVar5));
        zn znVar8 = zn.ANT_CHANNEL_ID;
        bkVar.e(new rc("gas_consumption_transmitter", 28, 140, 1.0d, 0.0d, "", false, znVar8));
        bkVar.e(new rc("gas_consumption_display", 29, 0, 1.0d, 0.0d, "", false, zn.GAS_CONSUMPTION_RATE_TYPE));
        bkVar.e(new rc("up_key_enabled", 30, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("compass_enabled", 31, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("ccr_shallow_oc_mode", 32, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("ccr_auto_close_depth", 33, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m", false, znVar5));
        bkVar.e(new rc("ccr_auto_open_depth", 34, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m", false, znVar5));
        bkVar.e(new rc("dive_sounds", 35, 0, 1.0d, 0.0d, "", false, zn.TONE));
        bkVar.e(new rc("last_stop_multiple", 36, 2, 10.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("no_fly_time_mode", 37, 0, 1.0d, 0.0d, "", false, zn.NO_FLY_TIME_MODE));
        bkVar.e(new rc("subwave_location_enabled", 38, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("subwave_messaging_enabled", 39, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("subwave_messaging_tsb_ant_id", 40, 140, 1.0d, 0.0d, "", false, znVar8));
        zn znVar9 = zn.HOT_KEY;
        bkVar.e(new rc("hot_key_1", 41, 0, 1.0d, 0.0d, "", false, znVar9));
        bkVar.e(new rc("hot_key_2", 42, 0, 1.0d, 0.0d, "", false, znVar9));
        bkVar.e(new rc("hot_key_3", 43, 0, 1.0d, 0.0d, "", false, znVar9));
        bkVar.e(new rc("hot_key_4", 44, 0, 1.0d, 0.0d, "", false, znVar9));
        bkVar.e(new rc("hot_key_5", 45, 0, 1.0d, 0.0d, "", false, znVar9));
        bkVar.e(new rc("hot_key_6", 46, 0, 1.0d, 0.0d, "", false, znVar9));
        bkVar.e(new rc("hot_key_7", 47, 0, 1.0d, 0.0d, "", false, znVar9));
        bkVar.e(new rc("hot_key_8", 48, 0, 1.0d, 0.0d, "", false, znVar9));
        bkVar.e(new rc("hot_key_9", 49, 0, 1.0d, 0.0d, "", false, znVar9));
        zn znVar10 = zn.SCREEN_BRIGHTNESS;
        bkVar.e(new rc("screen_brightness", 50, 0, 1.0d, 0.0d, "", false, znVar10));
        bkVar.e(new rc("transmitter_units", 51, 0, 1.0d, 0.0d, "", false, zn.PRESSURE_MEASURE));
        bkVar.e(new rc("apnea_discipline", 52, 0, 1.0d, 0.0d, "", false, zn.APNEA_DISCIPLINE));
        bkVar.e(new rc("screen_ao_brightness", 53, 0, 1.0d, 0.0d, "", false, znVar10));
        bkVar.e(new rc("dynamic_apnea_auto_start_depth", 54, 132, 100.0d, 0.0d, "m", false, znVar6));
        bkVar.e(new rc("pool_length", 55, 132, 100.0d, 0.0d, "m", false, znVar6));
        bkVar.e(new rc("pool_length_unit", 56, 0, 1.0d, 0.0d, "", false, zn.DISPLAY_MEASURE));
        bkVar.e(new rc("deco_lockout_enabled", 57, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("dynamic_apnea_auto_end_depth", 58, 132, 100.0d, 0.0d, "m", false, znVar6));
        bkVar.e(new rc("dynamic_apnea_breathe_up_time", 59, 132, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("subwave_msg_favorites", 60, 0, 1.0d, 0.0d, "", false, zn.DIVE_MSG_ID));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public e8() {
        super(wb.b(258));
    }

    public e8(bk bkVar) {
        super(bkVar);
    }
}
