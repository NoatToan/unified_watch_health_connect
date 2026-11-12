package bs2;

/* JADX INFO: loaded from: classes11.dex */
public class v2 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20609e;

    static {
        bk bkVar = new bk("bike_light_profile", 213);
        f20609e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.BOOL;
        bkVar.e(new rc("enabled", 0, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("light_ant_id", 1, 139, 1.0d, 0.0d, "", false, zn.UINT16Z));
        bkVar.e(new rc("light_ant_id_trans_type", 2, 10, 1.0d, 0.0d, "", false, zn.UINT8Z));
        bkVar.e(new rc("bike_light_network_config", 3, 0, 1.0d, 0.0d, "", false, zn.BIKE_LIGHT_NETWORK_CONFIG_TYPE));
        bkVar.e(new rc("bike_light_type", 4, 0, 1.0d, 0.0d, "", false, zn.BIKE_LIGHT_LIGHT_TYPE));
        bkVar.e(new rc("bike_light_beam", 5, 0, 1.0d, 0.0d, "", false, zn.BIKE_LIGHT_BEAM_TYPE));
        bkVar.e(new rc("bike_light_mode", 6, 0, 1.0d, 0.0d, "", false, zn.BIKE_LIGHT_MODE_TYPE));
        bkVar.e(new rc("bike_light_settings", 7, 139, 1.0d, 0.0d, "", false, zn.BIKE_LIGHT_SETTINGS_BITS));
        zn znVar2 = zn.UINT8;
        bkVar.e(new rc("bike_light_beam_focus", 8, 2, 1.0d, 0.0d, "%", false, znVar2));
        bkVar.e(new rc("bike_light_radar_capable", 9, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("bike_light_beam_intensity", 10, 2, 1.0d, 0.0d, "%", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public v2() {
        super(wb.b(213));
    }

    public v2(bk bkVar) {
        super(bkVar);
    }
}
