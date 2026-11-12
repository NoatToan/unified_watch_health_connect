package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.mapbox.turf.TurfConstants;

/* JADX INFO: loaded from: classes11.dex */
public class ef extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20078e;

    static {
        bk bkVar = new bk("gps_metadata", SyslogConstants.LOG_LOCAL4);
        f20078e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("timestamp_ms", 0, 132, 1.0d, 0.0d, "ms", false, znVar2));
        zn znVar3 = zn.SINT32;
        bkVar.e(new rc("position_lat", 1, 133, 1.0d, 0.0d, "semicircles", false, znVar3));
        bkVar.e(new rc("position_long", 2, 133, 1.0d, 0.0d, "semicircles", false, znVar3));
        zn znVar4 = zn.UINT32;
        bkVar.e(new rc("enhanced_altitude", 3, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 5.0d, 500.0d, "m", false, znVar4));
        bkVar.e(new rc("enhanced_speed", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "m/s", false, znVar4));
        bkVar.e(new rc("heading", 5, 132, 100.0d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar2));
        bkVar.e(new rc("utc_timestamp", 6, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "s", false, znVar));
        bkVar.e(new rc("velocity", 7, 131, 100.0d, 0.0d, "m/s", false, zn.SINT16));
        bkVar.e(new rc("epv", 8, 132, 1.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("eph", 9, 132, 1.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("epe", 10, 132, 1.0d, 0.0d, "m", false, znVar2));
        bkVar.e(new rc("vdop", 11, 132, 100.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("hdop", 12, 132, 100.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public ef() {
        super(wb.b(SyslogConstants.LOG_LOCAL4));
    }

    public ef(bk bkVar) {
        super(bkVar);
    }
}
