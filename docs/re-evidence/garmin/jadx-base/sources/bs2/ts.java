package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class ts extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20584e;

    static {
        bk bkVar = new bk("shot_info", 194);
        f20584e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT8;
        bkVar.e(new rc("player_index", 0, 2, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("hole_number", 1, 2, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.SINT32;
        bkVar.e(new rc("start_location_lat", 2, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("start_location_long", 3, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("stop_location_lat", 4, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("stop_location_long", 5, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        zn znVar3 = zn.UINT32;
        bkVar.e(new rc("club_id_upper", 6, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("club_id_lower", 7, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("confidence_level", 8, 0, 1.0d, 0.0d, "", false, zn.GOLF_SHOT_CONFIDENCE_LEVEL));
        bkVar.e(new rc("auto_shot_type", 9, 0, 1.0d, 0.0d, "", false, zn.GOLF_AUTO_SHOT_TYPE));
        bkVar.e(new rc("club_sensor", 10, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("heart_rate", 11, 2, 1.0d, 0.0d, "bpm", false, znVar));
        zn znVar4 = zn.UINT16;
        bkVar.e(new rc("swing_tempo", 12, 132, 100.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("start_elevation", 13, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 5.0d, 500.0d, "m", false, znVar3));
        bkVar.e(new rc("vc_recommended_club_id_upper", 14, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("vc_recommended_club_id_lower", 15, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("vc_avg_strokes", 16, 132, 100.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("vc_dispersion_nwc_lat", 17, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("vc_dispersion_nwc_long", 18, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("vc_dispersion_nec_lat", 19, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("vc_dispersion_nec_long", 20, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("vc_dispersion_sec_lat", 21, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("vc_dispersion_sec_long", 22, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("vc_dispersion_swc_lat", 23, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("vc_dispersion_swc_long", 24, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("vc_shot_type", 25, 0, 1.0d, 0.0d, "", false, zn.GOLF_SHOT_TYPE));
        bkVar.e(new rc("shot_source", 26, 0, 1.0d, 0.0d, "", false, zn.GOLF_SHOT_SOURCE_TYPE));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ts() {
        super(wb.b(194));
    }

    public ts(bk bkVar) {
        super(bkVar);
    }
}
