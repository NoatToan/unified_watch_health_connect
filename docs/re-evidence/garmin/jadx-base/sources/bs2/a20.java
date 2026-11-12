package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mapbox.turf.TurfConstants;

/* JADX INFO: loaded from: classes11.dex */
public class a20 extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f19657e;

    static {
        bk bkVar = new bk("weather_conditions", 128);
        f19657e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("timestamp", 253, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("weather_report", 0, 0, 1.0d, 0.0d, "", false, zn.WEATHER_REPORT));
        zn znVar2 = zn.SINT8;
        bkVar.e(new rc("temperature", 1, 1, 1.0d, 0.0d, "C", false, znVar2));
        bkVar.e(new rc("condition", 2, 0, 1.0d, 0.0d, "", false, zn.WEATHER_STATUS));
        zn znVar3 = zn.UINT16;
        bkVar.e(new rc("wind_direction", 3, 132, 1.0d, 0.0d, TurfConstants.UNIT_DEGREES, false, znVar3));
        bkVar.e(new rc("wind_speed", 4, 132, 1000.0d, 0.0d, "m/s", false, znVar3));
        zn znVar4 = zn.UINT8;
        bkVar.e(new rc("precipitation_probability", 5, 2, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc("temperature_feels_like", 6, 1, 1.0d, 0.0d, "C", false, znVar2));
        bkVar.e(new rc("relative_humidity", 7, 2, 1.0d, 0.0d, "", false, znVar4));
        bkVar.e(new rc(FirebaseAnalytics.Param.LOCATION, 8, 7, 1.0d, 0.0d, "", false, zn.STRING));
        bkVar.e(new rc("observed_at_time", 9, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        zn znVar5 = zn.SINT32;
        bkVar.e(new rc("observed_location_lat", 10, 133, 1.0d, 0.0d, "semicircles", false, znVar5));
        bkVar.e(new rc("observed_location_long", 11, 133, 1.0d, 0.0d, "semicircles", false, znVar5));
        bkVar.e(new rc("day_of_week", 12, 0, 1.0d, 0.0d, "", false, zn.DAY_OF_WEEK));
        bkVar.e(new rc("high_temperature", 13, 1, 1.0d, 0.0d, "C", false, znVar2));
        bkVar.e(new rc("low_temperature", 14, 1, 1.0d, 0.0d, "C", false, znVar2));
        bkVar.e(new rc("dew_point", 15, 1, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("uv_index", 16, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, zn.FLOAT32));
        bkVar.e(new rc("air_quality", 17, 0, 1.0d, 0.0d, "", false, zn.AIR_QUALITY_TYPE));
        bkVar.e(new rc("atmospheric_pressure", 18, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "Pa", false, zn.UINT32));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public a20() {
        super(wb.b(128));
    }

    public a20(bk bkVar) {
        super(bkVar);
    }
}
