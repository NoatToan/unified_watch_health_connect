package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes11.dex */
public class zs extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f21025e;

    static {
        bk bkVar = new bk("shotgun_round_data", MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE);
        f21025e = bkVar;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("round_id", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("round_type", 1, 0, 1.0d, 0.0d, "", false, zn.TRAP_ROUND));
        zn znVar2 = zn.UINT8;
        bkVar.e(new rc("hits", 2, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("misses", 3, 2, 1.0d, 0.0d, "", false, znVar2));
        zn znVar3 = zn.UINT16;
        bkVar.e(new rc(FirebaseAnalytics.Param.SCORE, 4, 132, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("break_factor", 5, 132, 1.0d, 0.0d, "", false, znVar3));
        zn znVar4 = zn.STRING;
        bkVar.e(new rc("shooter_name", 6, 7, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc(FirebaseAnalytics.Param.LOCATION, 7, 7, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("notes", 8, 7, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("shots", 9, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("clay_color", 10, 0, 1.0d, 0.0d, "", false, zn.COLOR));
        bkVar.e(new rc("starting_station", 11, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("handicap", 12, 2, 1.0d, 0.0d, "decimeters", false, znVar2));
        bkVar.e(new rc("station_count", 13, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("targets_per_station", 14, 2, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public zs() {
        super(wb.b(MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE));
    }

    public zs(bk bkVar) {
        super(bkVar);
    }
}
