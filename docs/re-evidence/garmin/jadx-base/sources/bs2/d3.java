package bs2;

import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes11.dex */
public class d3 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20048e;

    static {
        bk bkVar = new bk("bike_radar_settings", MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE);
        f20048e = bkVar;
        bkVar.e(new rc("bike_radar_vehicles_display_side", 0, 0, 1.0d, 0.0d, "", false, zn.BIKE_RADAR_VEHICLES_DISPLAY_SIDE));
        bkVar.e(new rc("bike_radar_halo_display", 1, 0, 1.0d, 0.0d, "", false, zn.BIKE_RADAR_HALO_DISPLAY));
        bkVar.e(new rc("bike_radar_tone_frequency", 2, 0, 1.0d, 0.0d, "", false, zn.TONE_FREQUENCY));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public d3() {
        super(wb.b(MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE));
    }

    public d3(bk bkVar) {
        super(bkVar);
    }
}
