package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.mapbox.turf.TurfConstants;

/* JADX INFO: loaded from: classes11.dex */
public class zq extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f21023e;

    static {
        bk bkVar = new bk("running_track", 335);
        f21023e = bkVar;
        zn znVar = zn.UINT16;
        bkVar.e(new rc("version", 0, 132, 100.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("track_name", 1, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("read_only", 2, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        zn znVar2 = zn.SINT32;
        bkVar.e(new rc("center_lat", 3, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("center_long", 4, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("angle", 5, 131, 100.0d, 0.0d, TurfConstants.UNIT_DEGREES, false, zn.SINT16));
        bkVar.e(new rc("straightaway_length", 6, 132, 100.0d, 0.0d, "cm", false, znVar));
        bkVar.e(new rc("inside_radius", 7, 132, 100.0d, 0.0d, "cm", false, znVar));
        bkVar.e(new rc("track_type", 8, 0, 1.0d, 0.0d, "", false, zn.RUNNING_TRACK_TYPE));
        bkVar.e(new rc("loop_count", 9, 132, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("enhanced_altitude", 10, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 5.0d, 500.0d, "m", false, zn.UINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public zq() {
        super(wb.b(335));
    }

    public zq(bk bkVar) {
        super(bkVar);
    }
}
