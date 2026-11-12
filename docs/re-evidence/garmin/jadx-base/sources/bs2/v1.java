package bs2;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class v1 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20608e;

    static {
        bk bkVar = new bk("avtn_settings", PsExtractor.VIDEO_STREAM_MASK);
        f20608e = bkVar;
        bkVar.e(new rc("avtn_units_enabled", 0, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        zn znVar = zn.DISPLAY_MEASURE;
        bkVar.e(new rc("avtn_dist_setting", 1, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("avtn_speed_setting", 2, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("avtn_elev_setting", 3, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("avtn_vspeed_setting", 4, 0, 1.0d, 0.0d, "", false, zn.AVTN_VERT_SPEED_UNITS));
        bkVar.e(new rc("avtn_altimeter_setting", 5, 0, 1.0d, 0.0d, "", false, zn.AVTN_PRESSURE_UNITS));
        bkVar.e(new rc("avtn_runway_length_setting", 6, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("avtn_visibility_setting", 7, 0, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("avtn_wind_speed_setting", 8, 0, 1.0d, 0.0d, "", false, zn.AVTN_WIND_UNITS));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public v1() {
        super(wb.b(PsExtractor.VIDEO_STREAM_MASK));
    }

    public v1(bk bkVar) {
        super(bkVar);
    }
}
