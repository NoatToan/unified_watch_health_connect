package fe2;

import com.garmin.proto.generated.GDIDataTypes;
import com.garmin.proto.generated.GDIGroupLiveTrack;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes11.dex */
public final class o1 {
    public static final GDIGroupLiveTrack.LiveConnectionTrackPoint a(ae2.k kVar) {
        kVar.getClass();
        GDIGroupLiveTrack.LiveConnectionTrackPoint.Builder builderNewBuilder = GDIGroupLiveTrack.LiveConnectionTrackPoint.newBuilder();
        String sessionId = kVar.getSessionId();
        if (sessionId != null) {
            builderNewBuilder.setSessionId(sessionId);
        }
        ae2.r activityType = kVar.getActivityType();
        if (activityType != null) {
            builderNewBuilder.setActivityType(GDIGroupLiveTrack.FitnessPointData.ActivityType.valueOf(activityType.f2990a));
        }
        Integer headingSemicircle = kVar.getHeadingSemicircle();
        if (headingSemicircle != null) {
            builderNewBuilder.setHeadingSc(headingSemicircle.intValue());
        }
        DateTime reportedDateTime = kVar.getReportedDateTime();
        if (reportedDateTime != null) {
            builderNewBuilder.setReportedTimestamp(reportedDateTime.getMillis());
        }
        Double speedMps = kVar.getSpeedMps();
        if (speedMps != null) {
            builderNewBuilder.setSpeedMps(speedMps.doubleValue());
        }
        if (kVar.getLat() != null && kVar.getLon() != null) {
            GDIDataTypes.ScPoint.Builder builderNewBuilder2 = GDIDataTypes.ScPoint.newBuilder();
            builderNewBuilder2.setLat(kVar.getLat().intValue());
            builderNewBuilder2.setLon(kVar.getLon().intValue());
            builderNewBuilder.setPosition(builderNewBuilder2.build());
        }
        GDIGroupLiveTrack.LiveConnectionTrackPoint liveConnectionTrackPointBuild = builderNewBuilder.build();
        liveConnectionTrackPointBuild.getClass();
        return liveConnectionTrackPointBuild;
    }
}
