package bs2;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes11.dex */
public class nn extends bk {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final bk f20332e;

    static {
        bk bkVar = new bk("power_guidance", 352);
        f20332e = bkVar;
        zn znVar = zn.DATE_TIME;
        bkVar.e(new rc("event_timestamp", 0, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("name", 1, 7, 1.0d, 0.0d, "", false, zn.STRING));
        zn znVar2 = zn.UINT16;
        bkVar.e(new rc("split_count", 2, 132, 1.0d, 0.0d, "", false, znVar2));
        bkVar.e(new rc("course_serial_number", 3, 140, 1.0d, 0.0d, "", false, zn.UINT32Z));
        bkVar.e(new rc("course_time_created", 4, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "", false, znVar));
        bkVar.e(new rc("course_manufacturer", 5, 132, 1.0d, 0.0d, "", false, zn.MANUFACTURER));
        bkVar.e(new rc("user_ftp", 6, 132, 1.0d, 0.0d, "watts", false, znVar2));
        zn znVar3 = zn.FLOAT32;
        bkVar.e(new rc("goal_effort", 7, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("aero_coefficient", 8, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("rolling_resistance_coefficient", 9, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar3));
        bkVar.e(new rc("rider_mass", 10, 132, 100.0d, 0.0d, "kg", false, znVar2));
        bkVar.e(new rc("equipment_mass", 11, 132, 100.0d, 0.0d, "kg", false, znVar2));
        bkVar.e(new rc("elevation_segment_tolerance", 12, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "", false, znVar3));
        zn znVar4 = zn.UINT32;
        bkVar.e(new rc("min_split_length", 13, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 100.0d, 0.0d, "m", false, znVar4));
        bkVar.e(new rc("estimated_duration", 14, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1000.0d, 0.0d, "s", false, znVar4));
        bkVar.e(new rc("ftp_usage_percent", 15, SyslogConstants.LOG_LOCAL1, 1.0d, 0.0d, "%", false, znVar3));
        bkVar.e(new rc("max_power_target", 16, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "%", false, znVar4));
        bkVar.e(new rc("mean_power_target", 17, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 1.0d, 0.0d, "%", false, znVar4));
        bkVar.e(new rc("aero_profile", 18, 0, 1.0d, 0.0d, "", false, zn.POWER_GUIDANCE_AERO_PROFILE));
        bkVar.e(new rc("terrain_profile", 19, 0, 1.0d, 0.0d, "", false, zn.POWER_GUIDANCE_TERRAIN_PROFILE));
        zn znVar5 = zn.BOOL;
        bkVar.e(new rc("adjust_for_wind", 20, 0, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("adjust_for_stamina", 21, 0, 1.0d, 0.0d, "", false, znVar5));
        bkVar.e(new rc("checksum", 252, 2, 1.0d, 0.0d, "", false, zn.CHECKSUM));
        bkVar.e(new rc("pad", 251, 13, 1.0d, 0.0d, "", false, zn.BYTE));
    }

    public nn() {
        super(wb.b(352));
    }

    public nn(bk bkVar) {
        super(bkVar);
    }
}
