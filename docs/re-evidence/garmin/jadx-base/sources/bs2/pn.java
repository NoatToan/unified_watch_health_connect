package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.mapbox.turf.TurfConstants;

/* JADX INFO: loaded from: classes11.dex */
public class pn extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20403e;

    static {
        bk bkVar = new bk("power_guidance_split", 353);
        f20403e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        zn znVar = zn.UINT32;
        bkVar.e(new rc("power_target", 1, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "%", false, znVar));
        bkVar.e(new rc("distance", 2, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar));
        bkVar.e(new rc("estimated_duration", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar));
        zn znVar2 = zn.SINT16;
        bkVar.e(new rc("mean_grade", 4, 131, 100.0d, 0.0d, "%", false, znVar2));
        bkVar.e(new rc("max_grade", 5, 131, 100.0d, 0.0d, "%", false, znVar2));
        zn znVar3 = zn.SINT32;
        bkVar.e(new rc("start_position_lat", 6, 133, 1.0d, 0.0d, "semicircles", false, znVar3));
        bkVar.e(new rc("start_position_long", 7, 133, 1.0d, 0.0d, "semicircles", false, znVar3));
        bkVar.e(new rc("end_position_lat", 8, 133, 1.0d, 0.0d, "semicircles", false, znVar3));
        bkVar.e(new rc("end_position_long", 9, 133, 1.0d, 0.0d, "semicircles", false, znVar3));
        bkVar.e(new rc("elevation_change", 10, 133, 100.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("heading", 11, 133, 10000.0d, 0.0d, TurfConstants.UNIT_RADIANS, false, znVar3));
        bkVar.e(new rc("wind_heading", 12, 133, 10000.0d, 0.0d, TurfConstants.UNIT_RADIANS, false, znVar3));
        bkVar.e(new rc("wind_speed", 13, 132, 1.0d, 0.0d, "", false, zn.UINT16));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public pn() {
        super(wb.b(353));
    }

    public pn(bk bkVar) {
        super(bkVar);
    }
}
