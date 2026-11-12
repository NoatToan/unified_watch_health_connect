package bs2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.turf.TurfConstants;

/* JADX INFO: loaded from: classes11.dex */
public class bj extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19750e;

    static {
        bk bkVar = new bk(FirebaseAnalytics.Param.LOCATION, 29);
        f19750e = bkVar;
        bkVar.e(new rc("message_index", 254, 132, 1.0d, 0.0d, "", false, zn.MESSAGE_INDEX));
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, zn.DATE_TIME));
        zn znVar = zn.STRING;
        bkVar.e(new rc("name", 0, 7, 1.0d, 0.0d, "", false, znVar));
        zn znVar2 = zn.SINT32;
        bkVar.e(new rc("position_lat", 1, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("position_long", 2, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("symbol", 3, 132, 1.0d, 0.0d, "", false, zn.LOCATION_SYMBOL));
        zn znVar3 = zn.UINT16;
        bkVar.e(new rc("altitude", 4, 132, 5.0d, 500.0d, "m", false, znVar3));
        bkVar.e(new rc("altitude_reference_radius", 5, 132, 1.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("comment", 6, 7, 1.0d, 0.0d, "", false, znVar));
        zn znVar4 = zn.UINT32;
        bkVar.e(new rc("depth", 7, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m", false, znVar4));
        bkVar.e(new rc("origin_lat", 8, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("origin_long", 9, 133, 1.0d, 0.0d, "semicircles", false, znVar2));
        bkVar.e(new rc("gps_error", 10, 132, 100.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("range", 11, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar4));
        bkVar.e(new rc("origin_slope", 12, 131, 10000.0d, 0.0d, TurfConstants.UNIT_RADIANS, false, zn.SINT16));
        bkVar.e(new rc("slope_error", 13, 132, 10000.0d, 0.0d, TurfConstants.UNIT_RADIANS, false, znVar3));
        bkVar.e(new rc("heading_error", 14, 132, 10000.0d, 0.0d, TurfConstants.UNIT_RADIANS, false, znVar3));
        bkVar.e(new rc("origin_elevation", 15, 132, 5.0d, 500.0d, "m", false, znVar3));
        bkVar.e(new rc("range_error", 16, 132, 100.0d, 0.0d, "m", false, znVar3));
        bkVar.e(new rc("has_transfer_uuid", 17, 0, 1.0d, 0.0d, "", false, zn.BOOL));
        bkVar.e(new rc("transfer_uuid", 18, 2, 1.0d, 0.0d, "", false, zn.UINT8));
        bkVar.e(new rc(TtmlNode.ATTR_TTS_COLOR, 19, 0, 1.0d, 0.0d, "", false, zn.LOCATION_COLOR));
        bkVar.e(new rc("symbol_style", 20, 0, 1.0d, 0.0d, "", false, zn.LOCATION_SYMBOL_STYLE));
        bkVar.e(new rc("coordinate_system", 21, 0, 1.0d, 0.0d, "", false, zn.COORDINATE_SYSTEM));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public bj() {
        super(wb.b(29));
    }

    public bj(bk bkVar) {
        super(bkVar);
    }
}
