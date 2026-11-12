package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.mapbox.turf.TurfConstants;

/* JADX INFO: loaded from: classes11.dex */
public class zw extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f21029e;

    static {
        bk bkVar = new bk("swing_metrics", 171);
        f21029e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.DATE_TIME));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("swing_speed", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m/s", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("backswing_time", 1, 132, 1000.0d, 0.0d, "s", false, znVar2));
        bkVar.e(new rc("downswing_time", 2, 132, 1000.0d, 0.0d, "s", false, znVar2));
        zn znVar3 = zn.SINT16;
        bkVar.e(new rc("shaft_lean_at_address", 3, 131, 10.0d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar3));
        bkVar.e(new rc("shaft_angle_at_address", 4, 132, 10.0d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar2));
        bkVar.e(new rc("club_path_at_impact", 5, 131, 10.0d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar3));
        bkVar.e(new rc("face_angle_at_impact", 7, 131, 10.0d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar3));
        bkVar.e(new rc("angle_of_attack_at_impact", 8, 131, 10.0d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar3));
        bkVar.e(new rc("club_loft_at_impact", 9, 132, 10.0d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar2));
        bkVar.e(new rc("shaft_lean_at_impact", 10, 131, 10.0d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar3));
        bkVar.e(new rc("shaft_angle_at_impact", 11, 132, 10.0d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar2));
        bkVar.e(new rc("front_vector_north", 12, 131, 10000.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("front_vector_east", 13, 131, 10000.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("front_vector_ground", 14, 131, 10000.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("club_id_upper", 15, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("club_id_lower", 16, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("local_timestamp", 17, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, zn.LOCAL_DATE_TIME));
        bkVar.e(new rc("face_to_target_at_impact", 18, 131, 10.0d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar3));
        bkVar.e(new rc("club_loft_offset_at_impact", 19, 131, 10.0d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar3));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public zw() {
        super(wb.b(171));
    }

    public final l6 getTimestamp() {
        return p(j(253, 65535));
    }

    public zw(bk bkVar) {
        super(bkVar);
    }
}
