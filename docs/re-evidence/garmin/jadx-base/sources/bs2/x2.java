package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes11.dex */
public class x2 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20661e;

    static {
        bk bkVar = new bk("bike_profile", 6);
        f20661e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.STRING;
        bkVar.e(new rc("name", 0, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("sport", 1, 0, 1.0d, 0.0d, "", false, zn.SPORT));
        bkVar.e(new rc("sub_sport", 2, 0, 1.0d, 0.0d, "", false, zn.SUB_SPORT));
        bkVar.e(new rc("odometer", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, zn.UINT32));
        zn znVar2 = zn.UINT16Z;
        bkVar.e(new rc("bike_spd_ant_id", 4, 139, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("bike_cad_ant_id", 5, 139, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("bike_spdcad_ant_id", 6, 139, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("bike_power_ant_id", 7, 139, 1.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.UINT16;
        bkVar.e(new rc("custom_wheelsize", 8, 132, 1000.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("auto_wheelsize", 9, 132, 1000.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("bike_weight", 10, 132, 10.0d, 0.0d, "kg", false, znVar3));
        bkVar.e(new rc("power_cal_factor", 11, 132, 10.0d, 0.0d, "%", false, znVar3));
        zn znVar4 = zn.BOOL;
        bkVar.e(new rc("auto_wheel_cal", 12, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("auto_power_zero", 13, 0, 1.0d, 0.0d, "", false, znVar4));
        zn znVar5 = zn.UINT8;
        bkVar.e(new rc(TtmlNode.ATTR_ID, 14, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("spd_enabled", 15, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("cad_enabled", 16, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("spdcad_enabled", 17, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("power_enabled", 18, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("crank_length", 19, 2, 2.0d, -110.0d, "mm", false, znVar5));
        bkVar.e(new rc("enabled", 20, 0, 1.0d, 0.0d, "", false, znVar4));
        zn znVar6 = zn.UINT8Z;
        bkVar.e(new rc("bike_spd_ant_id_trans_type", 21, 10, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("bike_cad_ant_id_trans_type", 22, 10, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("bike_spdcad_ant_id_trans_type", 23, 10, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("bike_power_ant_id_trans_type", 24, 10, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("fork_id", 25, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("fork_pressure", 26, 132, 10.0d, 0.0d, "kPa", false, znVar3));
        bkVar.e(new rc("fork_sag", 27, 2, 2.0d, 0.0d, "%", false, znVar5));
        bkVar.e(new rc("fork_rebound", 28, 2, 2.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("shock_id", 29, 7, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("shock_pressure", 30, 132, 10.0d, 0.0d, "kPa", false, znVar3));
        bkVar.e(new rc("shock_sag", 31, 2, 2.0d, 0.0d, "%", false, znVar5));
        bkVar.e(new rc("shock_rebound", 32, 2, 2.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("lever_ratio_a", 33, 132, 100.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("auto_crank_length", 34, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc(TtmlNode.ATTR_TTS_COLOR, 35, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("bike_image", 36, 0, 1.0d, 0.0d, "", false, zn.BIKE_IMAGE));
        bkVar.e(new rc("odometer_rollover", 37, 2, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("front_gear_num", 38, 10, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("front_gear", 39, 10, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("rear_gear_num", 40, 10, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("rear_gear", 41, 10, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("bike_shimano_di2_ant_id", 42, 139, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("bike_shimano_di2_ant_trans_type", 43, 10, 1.0d, 0.0d, "", false, znVar6));
        bkVar.e(new rc("shimano_di2_enabled", 44, 0, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public x2() {
        super(wb.b(6));
    }

    public x2(bk bkVar) {
        super(bkVar);
    }
}
