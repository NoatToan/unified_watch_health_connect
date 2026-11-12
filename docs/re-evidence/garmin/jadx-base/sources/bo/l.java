package bo;

import bm.y;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.List;
import m63.e0;
import m63.m0;
import m63.m1;
import m63.u1;
import m63.v0;
import m63.x;
import m63.y1;
import okhttp3.internal.http2.Http2Connection;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 r2\u00020\u0001:\u0002stBõ\b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010B\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010D\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010D\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010D\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010D\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010W\u001a\n\u0012\u0004\u0012\u00020V\u0018\u00010(\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010a\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010b\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010c\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010d\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010e\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(\u0012\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\bj\u0010kBß\u0007\b\u0010\u0012\u0006\u0010l\u001a\u00020D\u0012\u0006\u0010m\u001a\u00020D\u0012\u0006\u0010n\u001a\u00020D\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0011\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010(\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0011\u0012\b\u00100\u001a\u0004\u0018\u00010\u0011\u0012\b\u00101\u001a\u0004\u0018\u00010\u0011\u0012\b\u00102\u001a\u0004\u0018\u00010\u0011\u0012\b\u00103\u001a\u0004\u0018\u00010\u0011\u0012\b\u00104\u001a\u0004\u0018\u00010\u0011\u0012\b\u00105\u001a\u0004\u0018\u00010\u0011\u0012\b\u00106\u001a\u0004\u0018\u00010\u0011\u0012\b\u00107\u001a\u0004\u0018\u00010\u0011\u0012\b\u00108\u001a\u0004\u0018\u00010\u0011\u0012\b\u00109\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010A\u001a\u0004\u0018\u00010\f\u0012\b\u0010C\u001a\u0004\u0018\u00010B\u0012\b\u0010E\u001a\u0004\u0018\u00010D\u0012\b\u0010F\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010G\u001a\u0004\u0018\u00010D\u0012\b\u0010H\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010I\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010J\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010K\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010L\u001a\u0004\u0018\u00010D\u0012\b\u0010M\u001a\u0004\u0018\u00010D\u0012\b\u0010N\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010O\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010P\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010Q\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010R\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010S\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010T\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010U\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010W\u001a\n\u0012\u0004\u0012\u00020V\u0018\u00010(\u0012\b\u0010X\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010Y\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010Z\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010[\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\\\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010]\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010^\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010_\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010`\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010a\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010b\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010d\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010e\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(\u0012\b\u0010g\u001a\u0004\u0018\u00010\f\u0012\b\u0010h\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010i\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010p\u001a\u0004\u0018\u00010o¢\u0006\u0004\bj\u0010q¨\u0006u"}, d2 = {"Lbo/l;", "", "", "activityId", "", "activityName", "startTimeLocal", "startTimeGMT", "Lbo/e;", "activityType", "Lbo/g;", "eventType", "", "isFavorite", "isPR", "isParent", "parentId", "", "distance", "duration", "elapsedDuration", "movingDuration", "elevationGain", "elevationLoss", "averageSpeed", "maxSpeed", "startLatitude", "startLongitude", "ownerId", "ownerDisplayName", "calories", "averageHR", "maxHR", "averageRunningCadenceInStepsPerMinute", "maxRunningCadenceInStepsPerMinute", "averageBikingCadenceInRevPerMinute", "maxBikingCadenceInRevPerMinute", "averageSwolf", "steps", "requestorRelationship", "", "userRoles", "Lbo/a;", "privacy", "avgPower", "maxPower", "aerobicTrainingEffect", "strokes", "normPower", "avgLeftBalance", "max20MinPower", "avgVerticalOscillation", "avgGroundContactTime", "avgStrideLength", "trainingStressScore", "avgVerticalRatio", "avgGroundContactBalance", "avgStrokeCadence", "deviceId", "minTemperature", "maxTemperature", "minElevation", "maxElevation", "maxDepth", "surfaceInterval", "isDecoDive", "Lbo/o;", "summarizedDiveInfo", "", "diveCount", "bottomTime", "lapCount", "endLatitude", "endLongitude", "flow", "grit", "totalSets", "totalReps", "minRespirationRate", "maxRespirationRate", "avgRespirationRate", "avgStress", "startStress", "endStress", "differenceStress", "maxStress", "Lbo/j;", "splitSummaries", "avgGradeAdjustedSpeed", "avgWheelchairCadence", "maxWheelchairCadence", "beginPackWeight", "avgStepSpeedLoss", "avgStepSpeedLossPercent", "longestPoolApneaInterval", "avgForce", "maxForce", "normalizedForce", "poolApneaBreathHoldDuration", "endTimeGMT", "carbonOffset", "hasDog", "dogProfileIds", "isFamilyActivity", "locationName", "floorsClimbed", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbo/e;Lbo/g;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Lbo/a;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Lbo/o;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;)V", "seen0", "seen1", "seen2", "Lm63/u1;", "serializationConstructorMarker", "(IIILjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbo/e;Lbo/g;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;Lbo/a;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Lbo/o;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Lm63/u1;)V", "Companion", "a", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class l {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final o13.l<i63.c<Object>>[] P0;
    public final Double A;
    public final Double A0;
    public final Double B;
    public final Double B0;
    public final Double C;
    public final Double C0;
    public final Double D;
    public final Double D0;
    public final Long E;
    public final Double E0;
    public final String F;
    public final Double F0;
    public final List<String> G;
    public final Double G0;
    public final bo.a H;
    public final Double H0;
    public final Double I;
    public final String I0;
    public final Double J;
    public final Double J0;
    public final Double K;
    public final Boolean K0;
    public final Double L;
    public final List<Long> L0;
    public final Double M;
    public final Boolean M0;
    public final Double N;
    public final String N0;
    public final Double O;
    public final Double O0;
    public final Double P;
    public final Double Q;
    public final Double R;
    public final Double S;
    public final Double T;
    public final Double U;
    public final Double V;
    public final Long W;
    public final Double X;
    public final Double Y;
    public final Double Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f19159a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Double f19160a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19161b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Double f19162b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19163c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final Double f19164c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19165d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Boolean f19166d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f19167e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final o f19168e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f19169f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final Integer f19170f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f19171g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final Double f19172g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f19173h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Integer f19174h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Boolean f19175i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final Double f19176i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f19177j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final Double f19178j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Double f19179k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Double f19180k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Double f19181l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final Double f19182l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Double f19183m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final Integer f19184m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Double f19185n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final Integer f19186n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Double f19187o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final Double f19188o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Double f19189p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Double f19190p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Double f19191q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Double f19192q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Double f19193r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Double f19194r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Double f19195s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Double f19196s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Double f19197t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Double f19198t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Long f19199u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Double f19200u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f19201v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Double f19202v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Double f19203w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final List<j> f19204w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Double f19205x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Double f19206x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Double f19207y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final Double f19208y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Double f19209z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final Double f19210z0;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/garmin/android/apps/connectmobile/activities/history/data/model/SummarizedActivityDTO.$serializer", "Lm63/e0;", "Lbo/l;", "<init>", "()V", "Lk63/e;", "descriptor", "Lk63/e;", "getDescriptor", "()Lk63/e;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @o13.e
    public static final /* synthetic */ class a implements e0<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f19211a;
        private static final k63.e descriptor;

        static {
            a aVar = new a();
            f19211a = aVar;
            m1 m1Var = new m1("com.garmin.android.apps.connectmobile.activities.history.data.model.SummarizedActivityDTO", aVar, 93);
            m1Var.j("activityId", true);
            m1Var.j("activityName", true);
            m1Var.j("startTimeLocal", true);
            m1Var.j("startTimeGMT", true);
            m1Var.j("activityType", true);
            m1Var.j("eventType", true);
            m1Var.j("isFavorite", true);
            m1Var.j("isPR", true);
            m1Var.j("isParent", true);
            m1Var.j("parentId", true);
            m1Var.j("distance", true);
            m1Var.j("duration", true);
            m1Var.j("elapsedDuration", true);
            m1Var.j("movingDuration", true);
            m1Var.j("elevationGain", true);
            m1Var.j("elevationLoss", true);
            m1Var.j("averageSpeed", true);
            m1Var.j("maxSpeed", true);
            m1Var.j("startLatitude", true);
            m1Var.j("startLongitude", true);
            m1Var.j("ownerId", true);
            m1Var.j("ownerDisplayName", true);
            m1Var.j("calories", true);
            m1Var.j("averageHR", true);
            m1Var.j("maxHR", true);
            m1Var.j("averageRunningCadenceInStepsPerMinute", true);
            m1Var.j("maxRunningCadenceInStepsPerMinute", true);
            m1Var.j("averageBikingCadenceInRevPerMinute", true);
            m1Var.j("maxBikingCadenceInRevPerMinute", true);
            m1Var.j("averageSwolf", true);
            m1Var.j("steps", true);
            m1Var.j("requestorRelationship", true);
            m1Var.j("userRoles", true);
            m1Var.j("privacy", true);
            m1Var.j("avgPower", true);
            m1Var.j("maxPower", true);
            m1Var.j("aerobicTrainingEffect", true);
            m1Var.j("strokes", true);
            m1Var.j("normPower", true);
            m1Var.j("avgLeftBalance", true);
            m1Var.j("max20MinPower", true);
            m1Var.j("avgVerticalOscillation", true);
            m1Var.j("avgGroundContactTime", true);
            m1Var.j("avgStrideLength", true);
            m1Var.j("trainingStressScore", true);
            m1Var.j("avgVerticalRatio", true);
            m1Var.j("avgGroundContactBalance", true);
            m1Var.j("avgStrokeCadence", true);
            m1Var.j("deviceId", true);
            m1Var.j("minTemperature", true);
            m1Var.j("maxTemperature", true);
            m1Var.j("minElevation", true);
            m1Var.j("maxElevation", true);
            m1Var.j("maxDepth", true);
            m1Var.j("surfaceInterval", true);
            m1Var.j("isDecoDive", true);
            m1Var.j("summarizedDiveInfo", true);
            m1Var.j("diveCount", true);
            m1Var.j("bottomTime", true);
            m1Var.j("lapCount", true);
            m1Var.j("endLatitude", true);
            m1Var.j("endLongitude", true);
            m1Var.j("flow", true);
            m1Var.j("grit", true);
            m1Var.j("totalSets", true);
            m1Var.j("totalReps", true);
            m1Var.j("minRespirationRate", true);
            m1Var.j("maxRespirationRate", true);
            m1Var.j("avgRespirationRate", true);
            m1Var.j("avgStress", true);
            m1Var.j("startStress", true);
            m1Var.j("endStress", true);
            m1Var.j("differenceStress", true);
            m1Var.j("maxStress", true);
            m1Var.j("splitSummaries", true);
            m1Var.j("avgGradeAdjustedSpeed", true);
            m1Var.j("avgWheelchairCadence", true);
            m1Var.j("maxWheelchairCadence", true);
            m1Var.j("beginPackWeight", true);
            m1Var.j("avgStepSpeedLoss", true);
            m1Var.j("avgStepSpeedLossPercent", true);
            m1Var.j("longestPoolApneaInterval", true);
            m1Var.j("avgForce", true);
            m1Var.j("maxForce", true);
            m1Var.j("normalizedForce", true);
            m1Var.j("poolApneaBreathHoldDuration", true);
            m1Var.j("endTimeGMT", true);
            m1Var.j("carbonOffset", true);
            m1Var.j("hasDog", true);
            m1Var.j("dogProfileIds", true);
            m1Var.j("isFamilyActivity", true);
            m1Var.j("locationName", true);
            m1Var.j("floorsClimbed", true);
            descriptor = m1Var;
        }

        private a() {
        }

        @Override // m63.e0
        public final i63.c<?>[] childSerializers() {
            o13.l<i63.c<Object>>[] lVarArr = l.P0;
            v0 v0Var = v0.f117027a;
            i63.c<?> cVarD = j63.a.d(v0Var);
            y1 y1Var = y1.f117048a;
            i63.c<?> cVarD2 = j63.a.d(y1Var);
            i63.c<?> cVarD3 = j63.a.d(y1Var);
            i63.c<?> cVarD4 = j63.a.d(y1Var);
            i63.c<?> cVarD5 = j63.a.d(e.a.f19112a);
            i63.c<?> cVarD6 = j63.a.d(g.a.f19119a);
            m63.g gVar = m63.g.f116948a;
            i63.c<?> cVarD7 = j63.a.d(gVar);
            i63.c<?> cVarD8 = j63.a.d(gVar);
            i63.c<?> cVarD9 = j63.a.d(gVar);
            i63.c<?> cVarD10 = j63.a.d(v0Var);
            x xVar = x.f117036a;
            i63.c<?> cVarD11 = j63.a.d(xVar);
            i63.c<?> cVarD12 = j63.a.d(xVar);
            i63.c<?> cVarD13 = j63.a.d(xVar);
            i63.c<?> cVarD14 = j63.a.d(xVar);
            i63.c<?> cVarD15 = j63.a.d(xVar);
            i63.c<?> cVarD16 = j63.a.d(xVar);
            i63.c<?> cVarD17 = j63.a.d(xVar);
            i63.c<?> cVarD18 = j63.a.d(xVar);
            i63.c<?> cVarD19 = j63.a.d(xVar);
            i63.c<?> cVarD20 = j63.a.d(xVar);
            i63.c<?> cVarD21 = j63.a.d(v0Var);
            i63.c<?> cVarD22 = j63.a.d(y1Var);
            i63.c<?> cVarD23 = j63.a.d(xVar);
            i63.c<?> cVarD24 = j63.a.d(xVar);
            i63.c<?> cVarD25 = j63.a.d(xVar);
            i63.c<?> cVarD26 = j63.a.d(xVar);
            i63.c<?> cVarD27 = j63.a.d(xVar);
            i63.c<?> cVarD28 = j63.a.d(xVar);
            i63.c<?> cVarD29 = j63.a.d(xVar);
            i63.c<?> cVarD30 = j63.a.d(xVar);
            i63.c<?> cVarD31 = j63.a.d(v0Var);
            i63.c<?> cVarD32 = j63.a.d(y1Var);
            i63.c<?> cVarD33 = j63.a.d(lVarArr[32].getValue());
            i63.c<?> cVarD34 = j63.a.d(bo.a.C0277a.f19085a);
            i63.c<?> cVarD35 = j63.a.d(xVar);
            i63.c<?> cVarD36 = j63.a.d(xVar);
            i63.c<?> cVarD37 = j63.a.d(xVar);
            i63.c<?> cVarD38 = j63.a.d(xVar);
            i63.c<?> cVarD39 = j63.a.d(xVar);
            i63.c<?> cVarD40 = j63.a.d(xVar);
            i63.c<?> cVarD41 = j63.a.d(xVar);
            i63.c<?> cVarD42 = j63.a.d(xVar);
            i63.c<?> cVarD43 = j63.a.d(xVar);
            i63.c<?> cVarD44 = j63.a.d(xVar);
            i63.c<?> cVarD45 = j63.a.d(xVar);
            i63.c<?> cVarD46 = j63.a.d(xVar);
            i63.c<?> cVarD47 = j63.a.d(xVar);
            i63.c<?> cVarD48 = j63.a.d(xVar);
            i63.c<?> cVarD49 = j63.a.d(v0Var);
            i63.c<?> cVarD50 = j63.a.d(xVar);
            i63.c<?> cVarD51 = j63.a.d(xVar);
            i63.c<?> cVarD52 = j63.a.d(xVar);
            i63.c<?> cVarD53 = j63.a.d(xVar);
            i63.c<?> cVarD54 = j63.a.d(xVar);
            i63.c<?> cVarD55 = j63.a.d(xVar);
            i63.c<?> cVarD56 = j63.a.d(gVar);
            i63.c<?> cVarD57 = j63.a.d(o.a.f19229a);
            m0 m0Var = m0.f116981a;
            return new i63.c[]{cVarD, cVarD2, cVarD3, cVarD4, cVarD5, cVarD6, cVarD7, cVarD8, cVarD9, cVarD10, cVarD11, cVarD12, cVarD13, cVarD14, cVarD15, cVarD16, cVarD17, cVarD18, cVarD19, cVarD20, cVarD21, cVarD22, cVarD23, cVarD24, cVarD25, cVarD26, cVarD27, cVarD28, cVarD29, cVarD30, cVarD31, cVarD32, cVarD33, cVarD34, cVarD35, cVarD36, cVarD37, cVarD38, cVarD39, cVarD40, cVarD41, cVarD42, cVarD43, cVarD44, cVarD45, cVarD46, cVarD47, cVarD48, cVarD49, cVarD50, cVarD51, cVarD52, cVarD53, cVarD54, cVarD55, cVarD56, cVarD57, j63.a.d(m0Var), j63.a.d(xVar), j63.a.d(m0Var), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(m0Var), j63.a.d(m0Var), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(lVarArr[74].getValue()), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(xVar), j63.a.d(y1Var), j63.a.d(xVar), j63.a.d(gVar), j63.a.d(lVarArr[89].getValue()), j63.a.d(gVar), j63.a.d(y1Var), j63.a.d(xVar)};
        }

        @Override // i63.b
        public final Object deserialize(l63.e eVar) {
            int i14;
            int i15;
            int i16;
            int i17;
            int i18;
            eVar.getClass();
            k63.e eVar2 = descriptor;
            l63.c cVarC = eVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = l.P0;
            int i19 = l63.c.f110557a;
            Double d14 = null;
            Double d15 = null;
            Double d16 = null;
            Double d17 = null;
            Double d18 = null;
            Double d19 = null;
            Boolean bool = null;
            Double d24 = null;
            String str = null;
            Double d25 = null;
            String str2 = null;
            Double d26 = null;
            List list = null;
            Boolean bool2 = null;
            boolean z14 = true;
            Long l14 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            e eVar3 = null;
            g gVar = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Long l15 = null;
            Double d27 = null;
            Double d28 = null;
            Double d29 = null;
            Double d34 = null;
            int i24 = 0;
            Double d35 = null;
            Double d36 = null;
            Double d37 = null;
            Double d38 = null;
            Double d39 = null;
            Double d44 = null;
            Long l16 = null;
            String str6 = null;
            Double d45 = null;
            Double d46 = null;
            Double d47 = null;
            Double d48 = null;
            Double d49 = null;
            Double d54 = null;
            Double d55 = null;
            Double d56 = null;
            Long l17 = null;
            String str7 = null;
            List list2 = null;
            bo.a aVar = null;
            Double d57 = null;
            Double d58 = null;
            Double d59 = null;
            Double d64 = null;
            Double d65 = null;
            Double d66 = null;
            Double d67 = null;
            Double d68 = null;
            Double d69 = null;
            Double d74 = null;
            Double d75 = null;
            Double d76 = null;
            int i25 = 0;
            Double d77 = null;
            Double d78 = null;
            Long l18 = null;
            Double d79 = null;
            Double d84 = null;
            Double d85 = null;
            Double d86 = null;
            Double d87 = null;
            Double d88 = null;
            Boolean bool6 = null;
            o oVar = null;
            Integer num = null;
            Double d89 = null;
            Integer num2 = null;
            Double d93 = null;
            Double d94 = null;
            Double d95 = null;
            Double d96 = null;
            Integer num3 = null;
            Integer num4 = null;
            Double d97 = null;
            Double d98 = null;
            Double d99 = null;
            Double d100 = null;
            Double d101 = null;
            Double d102 = null;
            Double d103 = null;
            Double d104 = null;
            List list3 = null;
            Double d105 = null;
            Double d106 = null;
            Double d107 = null;
            int i26 = 0;
            Double d108 = null;
            while (z14) {
                int iE = cVarC.e(eVar2);
                switch (iE) {
                    case -1:
                        Double d109 = d14;
                        d16 = d16;
                        d17 = d17;
                        Boolean bool7 = bool4;
                        int i27 = i24;
                        Double d110 = d35;
                        int i28 = i25;
                        Double d111 = d77;
                        Unit unit = Unit.INSTANCE;
                        z14 = false;
                        d15 = d15;
                        d14 = d109;
                        d108 = d108;
                        i26 = i26;
                        d77 = d111;
                        i25 = i28;
                        d35 = d110;
                        i24 = i27;
                        bool4 = bool7;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 0:
                        d14 = d14;
                        d16 = d16;
                        Double d112 = d17;
                        Boolean bool8 = bool4;
                        int i29 = i24;
                        Double d113 = d35;
                        int i30 = i25;
                        Double d114 = d77;
                        int i34 = i26;
                        str3 = str3;
                        Long l19 = (Long) cVarC.v(eVar2, 0, v0.f117027a, l14);
                        Unit unit2 = Unit.INSTANCE;
                        i24 = i29 | 1;
                        d15 = d15;
                        d108 = d108;
                        i26 = i34;
                        d77 = d114;
                        i25 = i30;
                        d35 = d113;
                        l14 = l19;
                        bool4 = bool8;
                        d17 = d112;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 1:
                        Double d115 = d14;
                        d16 = d16;
                        Double d116 = d17;
                        Boolean bool9 = bool4;
                        int i35 = i24;
                        Double d117 = d35;
                        int i36 = i25;
                        Double d118 = d77;
                        int i37 = i26;
                        String str8 = (String) cVarC.v(eVar2, 1, y1.f117048a, str3);
                        int i38 = i35 | 2;
                        Unit unit3 = Unit.INSTANCE;
                        str3 = str8;
                        bool4 = bool9;
                        str4 = str4;
                        d15 = d15;
                        d17 = d116;
                        d14 = d115;
                        d108 = d108;
                        i26 = i37;
                        d77 = d118;
                        i25 = i36;
                        d35 = d117;
                        i24 = i38;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 2:
                        int i39 = i24;
                        Double d119 = d35;
                        int i44 = i25;
                        Double d120 = d77;
                        int i45 = i26;
                        String str9 = (String) cVarC.v(eVar2, 2, y1.f117048a, str4);
                        Unit unit4 = Unit.INSTANCE;
                        i24 = i39 | 4;
                        d15 = d15;
                        d108 = d108;
                        i26 = i45;
                        d77 = d120;
                        i25 = i44;
                        d35 = d119;
                        str4 = str9;
                        bool4 = bool4;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 3:
                        int i46 = i24;
                        Double d121 = d35;
                        int i47 = i25;
                        Double d122 = d77;
                        int i48 = i26;
                        String str10 = (String) cVarC.v(eVar2, 3, y1.f117048a, str5);
                        Unit unit5 = Unit.INSTANCE;
                        i24 = i46 | 8;
                        d15 = d15;
                        d108 = d108;
                        i26 = i48;
                        d77 = d122;
                        i25 = i47;
                        d35 = d121;
                        str5 = str10;
                        bool4 = bool4;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 4:
                        int i49 = i24;
                        Double d123 = d35;
                        int i54 = i25;
                        Double d124 = d77;
                        int i55 = i26;
                        e eVar4 = (e) cVarC.v(eVar2, 4, e.a.f19112a, eVar3);
                        Unit unit6 = Unit.INSTANCE;
                        i24 = i49 | 16;
                        d15 = d15;
                        d108 = d108;
                        i26 = i55;
                        d77 = d124;
                        i25 = i54;
                        d35 = d123;
                        eVar3 = eVar4;
                        bool4 = bool4;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 5:
                        int i56 = i24;
                        Double d125 = d35;
                        int i57 = i25;
                        Double d126 = d77;
                        int i58 = i26;
                        g gVar2 = (g) cVarC.v(eVar2, 5, g.a.f19119a, gVar);
                        Unit unit7 = Unit.INSTANCE;
                        i24 = i56 | 32;
                        d15 = d15;
                        d108 = d108;
                        i26 = i58;
                        d77 = d126;
                        i25 = i57;
                        d35 = d125;
                        gVar = gVar2;
                        bool4 = bool4;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 6:
                        Double d127 = d108;
                        Double d128 = d15;
                        int i59 = i24;
                        Double d129 = d35;
                        Boolean bool10 = (Boolean) cVarC.v(eVar2, 6, m63.g.f116948a, bool3);
                        Unit unit8 = Unit.INSTANCE;
                        i24 = i59 | 64;
                        d15 = d128;
                        d108 = d127;
                        i26 = i26;
                        d77 = d77;
                        i25 = i25;
                        d35 = d129;
                        bool3 = bool10;
                        bool4 = bool4;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 7:
                        Double d130 = d108;
                        Double d131 = d15;
                        int i64 = i24;
                        Double d132 = d35;
                        d14 = d14;
                        d16 = d16;
                        Boolean bool11 = (Boolean) cVarC.v(eVar2, 7, m63.g.f116948a, bool4);
                        int i65 = i64 | 128;
                        Unit unit9 = Unit.INSTANCE;
                        bool4 = bool11;
                        str3 = str3;
                        d15 = d131;
                        d17 = d17;
                        d108 = d130;
                        i26 = i26;
                        d77 = d77;
                        i25 = i25;
                        d35 = d132;
                        i24 = i65;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 8:
                        Double d133 = d108;
                        Double d134 = d15;
                        int i66 = i24;
                        Double d135 = d35;
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        Boolean bool12 = (Boolean) cVarC.v(eVar2, 8, m63.g.f116948a, bool5);
                        Unit unit10 = Unit.INSTANCE;
                        i24 = i66 | 256;
                        d15 = d134;
                        d108 = d133;
                        i26 = i26;
                        d77 = d77;
                        i25 = i25;
                        d35 = d135;
                        bool5 = bool12;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 9:
                        Double d136 = d108;
                        Double d137 = d15;
                        int i67 = i24;
                        Double d138 = d35;
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        Long l24 = (Long) cVarC.v(eVar2, 9, v0.f117027a, l15);
                        Unit unit11 = Unit.INSTANCE;
                        i24 = i67 | 512;
                        d15 = d137;
                        d108 = d136;
                        i26 = i26;
                        d77 = d77;
                        i25 = i25;
                        d35 = d138;
                        l15 = l24;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 10:
                        Double d139 = d108;
                        Double d140 = d15;
                        int i68 = i24;
                        Double d141 = d35;
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        Double d142 = (Double) cVarC.v(eVar2, 10, x.f117036a, d27);
                        Unit unit12 = Unit.INSTANCE;
                        i24 = i68 | 1024;
                        d15 = d140;
                        d108 = d139;
                        i26 = i26;
                        d77 = d77;
                        i25 = i25;
                        d35 = d141;
                        d27 = d142;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 11:
                        Double d143 = d108;
                        Double d144 = d15;
                        int i69 = i24;
                        Double d145 = d35;
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        Double d146 = (Double) cVarC.v(eVar2, 11, x.f117036a, d28);
                        Unit unit13 = Unit.INSTANCE;
                        i24 = i69 | 2048;
                        d15 = d144;
                        d108 = d143;
                        i26 = i26;
                        d77 = d77;
                        i25 = i25;
                        d35 = d145;
                        d28 = d146;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 12:
                        Double d147 = d108;
                        Double d148 = d15;
                        int i74 = i24;
                        Double d149 = d35;
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        Double d150 = (Double) cVarC.v(eVar2, 12, x.f117036a, d29);
                        Unit unit14 = Unit.INSTANCE;
                        i24 = i74 | 4096;
                        d15 = d148;
                        d108 = d147;
                        i26 = i26;
                        d77 = d77;
                        i25 = i25;
                        d35 = d149;
                        d29 = d150;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 13:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        int i75 = i25;
                        Double d151 = d77;
                        int i76 = i26;
                        Double d152 = (Double) cVarC.v(eVar2, 13, x.f117036a, d34);
                        Unit unit15 = Unit.INSTANCE;
                        i24 |= 8192;
                        d15 = d15;
                        d108 = d108;
                        i26 = i76;
                        d77 = d151;
                        i25 = i75;
                        d35 = d35;
                        d34 = d152;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 14:
                        Double d153 = (Double) cVarC.v(eVar2, 14, x.f117036a, d35);
                        i14 = i24 | 16384;
                        Unit unit16 = Unit.INSTANCE;
                        d35 = d153;
                        i24 = i14;
                        d15 = d15;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        d77 = d77;
                        i25 = i25;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 15:
                        Double d154 = (Double) cVarC.v(eVar2, 15, x.f117036a, d36);
                        i14 = i24 | 32768;
                        Unit unit17 = Unit.INSTANCE;
                        d36 = d154;
                        i24 = i14;
                        d15 = d15;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        d77 = d77;
                        i25 = i25;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 16:
                        Double d155 = (Double) cVarC.v(eVar2, 16, x.f117036a, d37);
                        i14 = i24 | 65536;
                        Unit unit18 = Unit.INSTANCE;
                        d37 = d155;
                        i24 = i14;
                        d15 = d15;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        d77 = d77;
                        i25 = i25;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 17:
                        Double d156 = (Double) cVarC.v(eVar2, 17, x.f117036a, d38);
                        i14 = i24 | 131072;
                        Unit unit19 = Unit.INSTANCE;
                        d38 = d156;
                        i24 = i14;
                        d15 = d15;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        d77 = d77;
                        i25 = i25;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 18:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        i25 = i25;
                        d77 = d77;
                        i26 = i26;
                        d108 = d108;
                        d15 = d15;
                        Double d157 = (Double) cVarC.v(eVar2, 18, x.f117036a, d39);
                        int i77 = i24 | GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                        Unit unit20 = Unit.INSTANCE;
                        i24 = i77;
                        d39 = d157;
                        d15 = d15;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        d77 = d77;
                        i25 = i25;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 19:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        i25 = i25;
                        d77 = d77;
                        i26 = i26;
                        d108 = d108;
                        d15 = d15;
                        Double d158 = (Double) cVarC.v(eVar2, 19, x.f117036a, d44);
                        Unit unit21 = Unit.INSTANCE;
                        i24 |= 524288;
                        d44 = d158;
                        d15 = d15;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        d77 = d77;
                        i25 = i25;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 20:
                        Long l25 = (Long) cVarC.v(eVar2, 20, v0.f117027a, l16);
                        i14 = i24 | ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        Unit unit22 = Unit.INSTANCE;
                        l16 = l25;
                        i24 = i14;
                        d15 = d15;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        d77 = d77;
                        i25 = i25;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 21:
                        String str11 = (String) cVarC.v(eVar2, 21, y1.f117048a, str6);
                        i14 = i24 | 2097152;
                        Unit unit23 = Unit.INSTANCE;
                        str6 = str11;
                        i24 = i14;
                        d15 = d15;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        d77 = d77;
                        i25 = i25;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 22:
                        Double d159 = (Double) cVarC.v(eVar2, 22, x.f117036a, d45);
                        i14 = i24 | 4194304;
                        Unit unit24 = Unit.INSTANCE;
                        d45 = d159;
                        i24 = i14;
                        d15 = d15;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        d77 = d77;
                        i25 = i25;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 23:
                        Double d160 = (Double) cVarC.v(eVar2, 23, x.f117036a, d46);
                        i14 = i24 | 8388608;
                        Unit unit25 = Unit.INSTANCE;
                        d46 = d160;
                        i24 = i14;
                        d15 = d15;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        d77 = d77;
                        i25 = i25;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 24:
                        Double d161 = (Double) cVarC.v(eVar2, 24, x.f117036a, d47);
                        i14 = i24 | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                        Unit unit26 = Unit.INSTANCE;
                        d47 = d161;
                        i24 = i14;
                        d15 = d15;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        d77 = d77;
                        i25 = i25;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 25:
                        Double d162 = (Double) cVarC.v(eVar2, 25, x.f117036a, d48);
                        i14 = i24 | 33554432;
                        Unit unit27 = Unit.INSTANCE;
                        d48 = d162;
                        i24 = i14;
                        d15 = d15;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        d77 = d77;
                        i25 = i25;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 26:
                        Double d163 = (Double) cVarC.v(eVar2, 26, x.f117036a, d49);
                        i14 = i24 | 67108864;
                        Unit unit28 = Unit.INSTANCE;
                        d49 = d163;
                        i24 = i14;
                        d15 = d15;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        d77 = d77;
                        i25 = i25;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 27:
                        Double d164 = (Double) cVarC.v(eVar2, 27, x.f117036a, d54);
                        i14 = i24 | 134217728;
                        Unit unit29 = Unit.INSTANCE;
                        d54 = d164;
                        i24 = i14;
                        d15 = d15;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        d77 = d77;
                        i25 = i25;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 28:
                        Double d165 = (Double) cVarC.v(eVar2, 28, x.f117036a, d55);
                        i14 = i24 | 268435456;
                        Unit unit30 = Unit.INSTANCE;
                        d55 = d165;
                        i24 = i14;
                        d15 = d15;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        d77 = d77;
                        i25 = i25;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 29:
                        Double d166 = (Double) cVarC.v(eVar2, 29, x.f117036a, d56);
                        i14 = i24 | 536870912;
                        Unit unit31 = Unit.INSTANCE;
                        d56 = d166;
                        i24 = i14;
                        d15 = d15;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        d77 = d77;
                        i25 = i25;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 30:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        i25 = i25;
                        d77 = d77;
                        i26 = i26;
                        d108 = d108;
                        d15 = d15;
                        Long l26 = (Long) cVarC.v(eVar2, 30, v0.f117027a, l17);
                        Unit unit32 = Unit.INSTANCE;
                        i24 |= 1073741824;
                        l17 = l26;
                        d15 = d15;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        d77 = d77;
                        i25 = i25;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 31:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        i25 = i25;
                        d77 = d77;
                        i26 = i26;
                        d108 = d108;
                        d15 = d15;
                        String str12 = (String) cVarC.v(eVar2, 31, y1.f117048a, str7);
                        Unit unit33 = Unit.INSTANCE;
                        i24 |= Integer.MIN_VALUE;
                        str7 = str12;
                        d15 = d15;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        d77 = d77;
                        i25 = i25;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 32:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        int i78 = i25;
                        Double d167 = d77;
                        int i79 = i26;
                        List list4 = (List) cVarC.v(eVar2, 32, lVarArr[32].getValue(), list2);
                        Unit unit34 = Unit.INSTANCE;
                        i25 = i78 | 1;
                        d15 = d15;
                        d108 = d108;
                        i26 = i79;
                        d77 = d167;
                        list2 = list4;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 33:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        int i84 = i25;
                        Double d168 = d77;
                        int i85 = i26;
                        bo.a aVar2 = (bo.a) cVarC.v(eVar2, 33, bo.a.C0277a.f19085a, aVar);
                        Unit unit35 = Unit.INSTANCE;
                        i25 = i84 | 2;
                        d15 = d15;
                        d108 = d108;
                        i26 = i85;
                        d77 = d168;
                        aVar = aVar2;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 34:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        int i86 = i25;
                        Double d169 = d77;
                        int i87 = i26;
                        Double d170 = (Double) cVarC.v(eVar2, 34, x.f117036a, d57);
                        Unit unit36 = Unit.INSTANCE;
                        i25 = i86 | 4;
                        d15 = d15;
                        d108 = d108;
                        i26 = i87;
                        d77 = d169;
                        d57 = d170;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 35:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        int i88 = i25;
                        Double d171 = d77;
                        int i89 = i26;
                        Double d172 = (Double) cVarC.v(eVar2, 35, x.f117036a, d58);
                        Unit unit37 = Unit.INSTANCE;
                        i25 = i88 | 8;
                        d15 = d15;
                        d108 = d108;
                        i26 = i89;
                        d77 = d171;
                        d58 = d172;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 36:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        int i93 = i25;
                        Double d173 = d77;
                        int i94 = i26;
                        Double d174 = (Double) cVarC.v(eVar2, 36, x.f117036a, d59);
                        Unit unit38 = Unit.INSTANCE;
                        i25 = i93 | 16;
                        d15 = d15;
                        d108 = d108;
                        i26 = i94;
                        d77 = d173;
                        d59 = d174;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 37:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        int i95 = i25;
                        Double d175 = d77;
                        int i96 = i26;
                        Double d176 = (Double) cVarC.v(eVar2, 37, x.f117036a, d64);
                        Unit unit39 = Unit.INSTANCE;
                        i25 = i95 | 32;
                        d15 = d15;
                        d108 = d108;
                        i26 = i96;
                        d77 = d175;
                        d64 = d176;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 38:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        int i97 = i25;
                        Double d177 = d77;
                        int i98 = i26;
                        Double d178 = (Double) cVarC.v(eVar2, 38, x.f117036a, d65);
                        Unit unit40 = Unit.INSTANCE;
                        i25 = i97 | 64;
                        d15 = d15;
                        d108 = d108;
                        i26 = i98;
                        d77 = d177;
                        d65 = d178;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 39:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        int i99 = i25;
                        Double d179 = d77;
                        int i100 = i26;
                        Double d180 = (Double) cVarC.v(eVar2, 39, x.f117036a, d66);
                        Unit unit41 = Unit.INSTANCE;
                        i25 = i99 | 128;
                        d15 = d15;
                        d108 = d108;
                        i26 = i100;
                        d77 = d179;
                        d66 = d180;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 40:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        int i101 = i25;
                        Double d181 = d77;
                        int i102 = i26;
                        Double d182 = (Double) cVarC.v(eVar2, 40, x.f117036a, d67);
                        Unit unit42 = Unit.INSTANCE;
                        i25 = i101 | 256;
                        d15 = d15;
                        d108 = d108;
                        i26 = i102;
                        d77 = d181;
                        d67 = d182;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 41:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        int i103 = i25;
                        Double d183 = d77;
                        int i104 = i26;
                        Double d184 = (Double) cVarC.v(eVar2, 41, x.f117036a, d68);
                        Unit unit43 = Unit.INSTANCE;
                        i25 = i103 | 512;
                        d15 = d15;
                        d108 = d108;
                        i26 = i104;
                        d77 = d183;
                        d68 = d184;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 42:
                        Double d185 = (Double) cVarC.v(eVar2, 42, x.f117036a, d69);
                        i15 = i25 | 1024;
                        Unit unit44 = Unit.INSTANCE;
                        d69 = d185;
                        str3 = str3;
                        d15 = d15;
                        d17 = d17;
                        d108 = d108;
                        i26 = i26;
                        d77 = d77;
                        i25 = i15;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 43:
                        Double d186 = (Double) cVarC.v(eVar2, 43, x.f117036a, d74);
                        i15 = i25 | 2048;
                        Unit unit45 = Unit.INSTANCE;
                        d74 = d186;
                        str3 = str3;
                        d15 = d15;
                        d17 = d17;
                        d108 = d108;
                        i26 = i26;
                        d77 = d77;
                        i25 = i15;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 44:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        int i105 = i25;
                        Double d187 = d77;
                        int i106 = i26;
                        Double d188 = (Double) cVarC.v(eVar2, 44, x.f117036a, d75);
                        Unit unit46 = Unit.INSTANCE;
                        i25 = i105 | 4096;
                        d15 = d15;
                        d108 = d108;
                        i26 = i106;
                        d77 = d187;
                        d75 = d188;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 45:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        int i107 = i26;
                        Double d189 = (Double) cVarC.v(eVar2, 45, x.f117036a, d76);
                        Unit unit47 = Unit.INSTANCE;
                        i25 |= 8192;
                        d15 = d15;
                        d108 = d108;
                        i26 = i107;
                        d77 = d77;
                        d76 = d189;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 46:
                        Double d190 = (Double) cVarC.v(eVar2, 46, x.f117036a, d77);
                        i16 = i25 | 16384;
                        Unit unit48 = Unit.INSTANCE;
                        d77 = d190;
                        i25 = i16;
                        str3 = str3;
                        d15 = d15;
                        d17 = d17;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 47:
                        Double d191 = (Double) cVarC.v(eVar2, 47, x.f117036a, d78);
                        i16 = i25 | 32768;
                        Unit unit49 = Unit.INSTANCE;
                        d78 = d191;
                        i25 = i16;
                        str3 = str3;
                        d15 = d15;
                        d17 = d17;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 48:
                        Long l27 = (Long) cVarC.v(eVar2, 48, v0.f117027a, l18);
                        i16 = i25 | 65536;
                        Unit unit50 = Unit.INSTANCE;
                        l18 = l27;
                        i25 = i16;
                        str3 = str3;
                        d15 = d15;
                        d17 = d17;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 49:
                        Double d192 = (Double) cVarC.v(eVar2, 49, x.f117036a, d79);
                        i16 = i25 | 131072;
                        Unit unit51 = Unit.INSTANCE;
                        d79 = d192;
                        i25 = i16;
                        str3 = str3;
                        d15 = d15;
                        d17 = d17;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 50:
                        Double d193 = (Double) cVarC.v(eVar2, 50, x.f117036a, d84);
                        i16 = i25 | GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                        Unit unit52 = Unit.INSTANCE;
                        d84 = d193;
                        i25 = i16;
                        str3 = str3;
                        d15 = d15;
                        d17 = d17;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 51:
                        Double d194 = (Double) cVarC.v(eVar2, 51, x.f117036a, d85);
                        i16 = i25 | 524288;
                        Unit unit53 = Unit.INSTANCE;
                        d85 = d194;
                        i25 = i16;
                        str3 = str3;
                        d15 = d15;
                        d17 = d17;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 52:
                        Double d195 = (Double) cVarC.v(eVar2, 52, x.f117036a, d86);
                        i16 = i25 | ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        Unit unit54 = Unit.INSTANCE;
                        d86 = d195;
                        i25 = i16;
                        str3 = str3;
                        d15 = d15;
                        d17 = d17;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 53:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        i26 = i26;
                        d108 = d108;
                        d15 = d15;
                        Double d196 = (Double) cVarC.v(eVar2, 53, x.f117036a, d87);
                        Unit unit55 = Unit.INSTANCE;
                        i25 |= 2097152;
                        d87 = d196;
                        str3 = str3;
                        d15 = d15;
                        d17 = d17;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 54:
                        Double d197 = (Double) cVarC.v(eVar2, 54, x.f117036a, d88);
                        i16 = i25 | 4194304;
                        Unit unit56 = Unit.INSTANCE;
                        d88 = d197;
                        i25 = i16;
                        str3 = str3;
                        d15 = d15;
                        d17 = d17;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 55:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        i26 = i26;
                        d108 = d108;
                        d15 = d15;
                        Boolean bool13 = (Boolean) cVarC.v(eVar2, 55, m63.g.f116948a, bool6);
                        Unit unit57 = Unit.INSTANCE;
                        i25 |= 8388608;
                        bool6 = bool13;
                        str3 = str3;
                        d15 = d15;
                        d17 = d17;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 56:
                        o oVar2 = (o) cVarC.v(eVar2, 56, o.a.f19229a, oVar);
                        i16 = i25 | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                        Unit unit58 = Unit.INSTANCE;
                        oVar = oVar2;
                        i25 = i16;
                        str3 = str3;
                        d15 = d15;
                        d17 = d17;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 57:
                        Integer num5 = (Integer) cVarC.v(eVar2, 57, m0.f116981a, num);
                        i16 = i25 | 33554432;
                        Unit unit59 = Unit.INSTANCE;
                        num = num5;
                        i25 = i16;
                        str3 = str3;
                        d15 = d15;
                        d17 = d17;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 58:
                        Double d198 = (Double) cVarC.v(eVar2, 58, x.f117036a, d89);
                        i16 = i25 | 67108864;
                        Unit unit60 = Unit.INSTANCE;
                        d89 = d198;
                        i25 = i16;
                        str3 = str3;
                        d15 = d15;
                        d17 = d17;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 59:
                        Integer num6 = (Integer) cVarC.v(eVar2, 59, m0.f116981a, num2);
                        i16 = i25 | 134217728;
                        Unit unit61 = Unit.INSTANCE;
                        num2 = num6;
                        i25 = i16;
                        str3 = str3;
                        d15 = d15;
                        d17 = d17;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 60:
                        Double d199 = (Double) cVarC.v(eVar2, 60, x.f117036a, d93);
                        i16 = i25 | 268435456;
                        Unit unit62 = Unit.INSTANCE;
                        d93 = d199;
                        i25 = i16;
                        str3 = str3;
                        d15 = d15;
                        d17 = d17;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 61:
                        Double d200 = (Double) cVarC.v(eVar2, 61, x.f117036a, d94);
                        i16 = i25 | 536870912;
                        Unit unit63 = Unit.INSTANCE;
                        d94 = d200;
                        i25 = i16;
                        str3 = str3;
                        d15 = d15;
                        d17 = d17;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 62:
                        Double d201 = (Double) cVarC.v(eVar2, 62, x.f117036a, d95);
                        i16 = i25 | 1073741824;
                        Unit unit64 = Unit.INSTANCE;
                        d95 = d201;
                        i25 = i16;
                        str3 = str3;
                        d15 = d15;
                        d17 = d17;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 63:
                        Double d202 = (Double) cVarC.v(eVar2, 63, x.f117036a, d96);
                        i16 = i25 | Integer.MIN_VALUE;
                        Unit unit65 = Unit.INSTANCE;
                        d96 = d202;
                        i25 = i16;
                        str3 = str3;
                        d15 = d15;
                        d17 = d17;
                        d14 = d14;
                        d108 = d108;
                        i26 = i26;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 64:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        int i108 = i26;
                        Double d203 = d108;
                        Double d204 = d15;
                        Integer num7 = (Integer) cVarC.v(eVar2, 64, m0.f116981a, num3);
                        int i109 = i108 | 1;
                        Unit unit66 = Unit.INSTANCE;
                        i26 = i109;
                        d15 = d204;
                        d108 = d203;
                        num3 = num7;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 65:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        int i110 = i26;
                        Double d205 = d108;
                        Double d206 = d15;
                        Integer num8 = (Integer) cVarC.v(eVar2, 65, m0.f116981a, num4);
                        int i111 = i110 | 2;
                        Unit unit67 = Unit.INSTANCE;
                        i26 = i111;
                        d15 = d206;
                        d108 = d205;
                        num4 = num8;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 66:
                        Double d207 = (Double) cVarC.v(eVar2, 66, x.f117036a, d97);
                        i17 = i26 | 4;
                        Unit unit68 = Unit.INSTANCE;
                        d97 = d207;
                        str3 = str3;
                        d15 = d15;
                        d17 = d17;
                        d108 = d108;
                        i26 = i17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 67:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        int i112 = i26;
                        Double d208 = d108;
                        Double d209 = d15;
                        Double d210 = (Double) cVarC.v(eVar2, 67, x.f117036a, d98);
                        int i113 = i112 | 8;
                        Unit unit69 = Unit.INSTANCE;
                        i26 = i113;
                        d15 = d209;
                        d108 = d208;
                        d98 = d210;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 68:
                        Double d211 = (Double) cVarC.v(eVar2, 68, x.f117036a, d99);
                        i17 = i26 | 16;
                        Unit unit70 = Unit.INSTANCE;
                        d99 = d211;
                        str3 = str3;
                        d15 = d15;
                        d17 = d17;
                        d108 = d108;
                        i26 = i17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 69:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        int i114 = i26;
                        Double d212 = d108;
                        Double d213 = d15;
                        Double d214 = (Double) cVarC.v(eVar2, 69, x.f117036a, d100);
                        int i115 = i114 | 32;
                        Unit unit71 = Unit.INSTANCE;
                        i26 = i115;
                        d15 = d213;
                        d108 = d212;
                        d100 = d214;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 70:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        int i116 = i26;
                        Double d215 = d108;
                        Double d216 = d15;
                        Double d217 = (Double) cVarC.v(eVar2, 70, x.f117036a, d101);
                        int i117 = i116 | 64;
                        Unit unit72 = Unit.INSTANCE;
                        i26 = i117;
                        d15 = d216;
                        d108 = d215;
                        d101 = d217;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 71:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        int i118 = i26;
                        Double d218 = d108;
                        Double d219 = d15;
                        Double d220 = (Double) cVarC.v(eVar2, 71, x.f117036a, d102);
                        int i119 = i118 | 128;
                        Unit unit73 = Unit.INSTANCE;
                        i26 = i119;
                        d15 = d219;
                        d108 = d218;
                        d102 = d220;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 72:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        int i120 = i26;
                        Double d221 = d108;
                        Double d222 = d15;
                        Double d223 = (Double) cVarC.v(eVar2, 72, x.f117036a, d103);
                        int i121 = i120 | 256;
                        Unit unit74 = Unit.INSTANCE;
                        i26 = i121;
                        d15 = d222;
                        d108 = d221;
                        d103 = d223;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 73:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        int i122 = i26;
                        Double d224 = d108;
                        Double d225 = d15;
                        Double d226 = (Double) cVarC.v(eVar2, 73, x.f117036a, d104);
                        int i123 = i122 | 512;
                        Unit unit75 = Unit.INSTANCE;
                        i26 = i123;
                        d15 = d225;
                        d108 = d224;
                        d104 = d226;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 74:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        int i124 = i26;
                        Double d227 = d108;
                        Double d228 = d15;
                        List list5 = (List) cVarC.v(eVar2, 74, lVarArr[74].getValue(), list3);
                        int i125 = i124 | 1024;
                        Unit unit76 = Unit.INSTANCE;
                        i26 = i125;
                        d15 = d228;
                        d108 = d227;
                        list3 = list5;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 75:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        int i126 = i26;
                        Double d229 = d108;
                        Double d230 = d15;
                        Double d231 = (Double) cVarC.v(eVar2, 75, x.f117036a, d105);
                        int i127 = i126 | 2048;
                        Unit unit77 = Unit.INSTANCE;
                        i26 = i127;
                        d15 = d230;
                        d108 = d229;
                        d105 = d231;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 76:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        int i128 = i26;
                        Double d232 = d108;
                        Double d233 = d15;
                        Double d234 = (Double) cVarC.v(eVar2, 76, x.f117036a, d106);
                        int i129 = i128 | 4096;
                        Unit unit78 = Unit.INSTANCE;
                        i26 = i129;
                        d15 = d233;
                        d108 = d232;
                        d106 = d234;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 77:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        Double d235 = d108;
                        Double d236 = (Double) cVarC.v(eVar2, 77, x.f117036a, d107);
                        Unit unit79 = Unit.INSTANCE;
                        i26 |= 8192;
                        d15 = d15;
                        d108 = d235;
                        d107 = d236;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 78:
                        d14 = d14;
                        d16 = d16;
                        d17 = d17;
                        Double d237 = (Double) cVarC.v(eVar2, 78, x.f117036a, d108);
                        Unit unit80 = Unit.INSTANCE;
                        d108 = d237;
                        i26 |= 16384;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 79:
                        d14 = d14;
                        d16 = d16;
                        d17 = (Double) cVarC.v(eVar2, 79, x.f117036a, d17);
                        Unit unit81 = Unit.INSTANCE;
                        i26 |= 32768;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 80:
                        d17 = d17;
                        d14 = d14;
                        Double d238 = (Double) cVarC.v(eVar2, 80, x.f117036a, d16);
                        Unit unit82 = Unit.INSTANCE;
                        i26 |= 65536;
                        d16 = d238;
                        d17 = d17;
                        d14 = d14;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 81:
                        d15 = (Double) cVarC.v(eVar2, 81, x.f117036a, d15);
                        i18 = i26 | 131072;
                        Unit unit83 = Unit.INSTANCE;
                        i26 = i18;
                        str3 = str3;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 82:
                        d14 = (Double) cVarC.v(eVar2, 82, x.f117036a, d14);
                        i18 = i26 | GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                        Unit unit84 = Unit.INSTANCE;
                        i26 = i18;
                        str3 = str3;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 83:
                        d18 = (Double) cVarC.v(eVar2, 83, x.f117036a, d18);
                        i18 = i26 | 524288;
                        Unit unit85 = Unit.INSTANCE;
                        i26 = i18;
                        str3 = str3;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 84:
                        d24 = (Double) cVarC.v(eVar2, 84, x.f117036a, d24);
                        i18 = i26 | ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        Unit unit86 = Unit.INSTANCE;
                        i26 = i18;
                        str3 = str3;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 85:
                        d25 = (Double) cVarC.v(eVar2, 85, x.f117036a, d25);
                        i18 = i26 | 2097152;
                        Unit unit87 = Unit.INSTANCE;
                        i26 = i18;
                        str3 = str3;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 86:
                        str2 = (String) cVarC.v(eVar2, 86, y1.f117048a, str2);
                        i18 = i26 | 4194304;
                        Unit unit88 = Unit.INSTANCE;
                        i26 = i18;
                        str3 = str3;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 87:
                        d26 = (Double) cVarC.v(eVar2, 87, x.f117036a, d26);
                        i18 = i26 | 8388608;
                        Unit unit89 = Unit.INSTANCE;
                        i26 = i18;
                        str3 = str3;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 88:
                        bool = (Boolean) cVarC.v(eVar2, 88, m63.g.f116948a, bool);
                        i18 = i26 | Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                        Unit unit810 = Unit.INSTANCE;
                        i26 = i18;
                        str3 = str3;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 89:
                        list = (List) cVarC.v(eVar2, 89, lVarArr[89].getValue(), list);
                        i18 = i26 | 33554432;
                        Unit unit811 = Unit.INSTANCE;
                        i26 = i18;
                        str3 = str3;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 90:
                        bool2 = (Boolean) cVarC.v(eVar2, 90, m63.g.f116948a, bool2);
                        i18 = i26 | 67108864;
                        Unit unit812 = Unit.INSTANCE;
                        i26 = i18;
                        str3 = str3;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 91:
                        str = (String) cVarC.v(eVar2, 91, y1.f117048a, str);
                        i18 = i26 | 134217728;
                        Unit unit813 = Unit.INSTANCE;
                        i26 = i18;
                        str3 = str3;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    case 92:
                        d19 = (Double) cVarC.v(eVar2, 92, x.f117036a, d19);
                        i18 = i26 | 268435456;
                        Unit unit814 = Unit.INSTANCE;
                        i26 = i18;
                        str3 = str3;
                        d17 = d17;
                        str3 = str3;
                        d16 = d16;
                        break;
                    default:
                        hb.a.o(iE);
                        return null;
                }
            }
            Double d239 = d16;
            Double d240 = d17;
            String str13 = str3;
            String str14 = str4;
            Boolean bool14 = bool4;
            int i130 = i24;
            Double d241 = d35;
            int i131 = i25;
            Double d242 = d77;
            int i132 = i26;
            Double d243 = d108;
            Double d244 = d15;
            Long l28 = l14;
            cVarC.b(eVar2);
            return new l(i130, i131, i132, l28, str13, str14, str5, eVar3, gVar, bool3, bool14, bool5, l15, d27, d28, d29, d34, d241, d36, d37, d38, d39, d44, l16, str6, d45, d46, d47, d48, d49, d54, d55, d56, l17, str7, list2, aVar, d57, d58, d59, d64, d65, d66, d67, d68, d69, d74, d75, d76, d242, d78, l18, d79, d84, d85, d86, d87, d88, bool6, oVar, num, d89, num2, d93, d94, d95, d96, num3, num4, d97, d98, d99, d100, d101, d102, d103, d104, list3, d105, d106, d107, d243, d240, d239, d244, d14, d18, d24, d25, str2, d26, bool, list, bool2, str, d19, (u1) null);
        }

        @Override // i63.i, i63.b
        /* JADX INFO: renamed from: getDescriptor */
        public final k63.e getF158591b() {
            return descriptor;
        }

        /* JADX WARN: Code duplicated, block: B:280:0x0498  */
        /* JADX WARN: Code duplicated, block: B:286:0x04ac  */
        /* JADX WARN: Code duplicated, block: B:292:0x04c0  */
        /* JADX WARN: Code duplicated, block: B:298:0x04d4  */
        /* JADX WARN: Code duplicated, block: B:304:0x04e8  */
        /* JADX WARN: Code duplicated, block: B:310:0x04fc  */
        /* JADX WARN: Code duplicated, block: B:316:0x0510  */
        /* JADX WARN: Code duplicated, block: B:322:0x0524  */
        /* JADX WARN: Code duplicated, block: B:328:0x0538  */
        /* JADX WARN: Code duplicated, block: B:334:0x054c  */
        /* JADX WARN: Code duplicated, block: B:340:0x0560  */
        /* JADX WARN: Code duplicated, block: B:346:0x0574  */
        /* JADX WARN: Code duplicated, block: B:352:0x0588  */
        /* JADX WARN: Code duplicated, block: B:358:0x059c  */
        /* JADX WARN: Code duplicated, block: B:364:0x05b0  */
        /* JADX WARN: Code duplicated, block: B:370:0x05c4  */
        /* JADX WARN: Code duplicated, block: B:376:0x05d8  */
        /* JADX WARN: Code duplicated, block: B:382:0x05ec  */
        /* JADX WARN: Code duplicated, block: B:388:0x0600  */
        /* JADX WARN: Code duplicated, block: B:394:0x0614  */
        /* JADX WARN: Code duplicated, block: B:400:0x0628  */
        /* JADX WARN: Code duplicated, block: B:406:0x0642  */
        /* JADX WARN: Code duplicated, block: B:412:0x0656  */
        /* JADX WARN: Code duplicated, block: B:418:0x066a  */
        /* JADX WARN: Code duplicated, block: B:424:0x067e  */
        /* JADX WARN: Code duplicated, block: B:430:0x0692  */
        /* JADX WARN: Code duplicated, block: B:436:0x06a6  */
        /* JADX WARN: Code duplicated, block: B:442:0x06ba  */
        /* JADX WARN: Code duplicated, block: B:448:0x06ce  */
        /* JADX WARN: Code duplicated, block: B:454:0x06e2  */
        /* JADX WARN: Code duplicated, block: B:460:0x06f6  */
        /* JADX WARN: Code duplicated, block: B:466:0x070a  */
        /* JADX WARN: Code duplicated, block: B:472:0x071e  */
        /* JADX WARN: Code duplicated, block: B:478:0x0732  */
        /* JADX WARN: Code duplicated, block: B:484:0x0746  */
        /* JADX WARN: Code duplicated, block: B:490:0x075a  */
        /* JADX WARN: Code duplicated, block: B:496:0x0774  */
        /* JADX WARN: Code duplicated, block: B:502:0x0788  */
        /* JADX WARN: Code duplicated, block: B:508:0x079c  */
        @Override // i63.i
        public final void serialize(l63.f fVar, Object obj) {
            l lVar;
            l lVar2 = (l) obj;
            lVar2.getClass();
            Double d14 = lVar2.f19160a0;
            Double d15 = lVar2.Z;
            Double d16 = lVar2.Y;
            Double d17 = lVar2.X;
            Long l14 = lVar2.W;
            Double d18 = lVar2.V;
            Double d19 = lVar2.U;
            Double d24 = lVar2.T;
            Double d25 = lVar2.S;
            Double d26 = lVar2.R;
            Double d27 = lVar2.Q;
            Double d28 = lVar2.P;
            Double d29 = lVar2.O;
            Double d34 = lVar2.N;
            Double d35 = lVar2.M;
            Double d36 = lVar2.L;
            Double d37 = lVar2.K;
            Double d38 = lVar2.J;
            Double d39 = lVar2.I;
            bo.a aVar = lVar2.H;
            List<String> list = lVar2.G;
            String str = lVar2.F;
            Long l15 = lVar2.E;
            Double d44 = lVar2.D;
            Double d45 = lVar2.C;
            Double d46 = lVar2.B;
            Double d47 = lVar2.A;
            Double d48 = lVar2.f19209z;
            Double d49 = lVar2.f19207y;
            Double d54 = lVar2.f19205x;
            Double d55 = lVar2.f19203w;
            String str2 = lVar2.f19201v;
            Long l16 = lVar2.f19199u;
            Double d56 = lVar2.f19197t;
            Double d57 = lVar2.f19195s;
            Double d58 = lVar2.f19193r;
            Double d59 = lVar2.f19191q;
            Double d64 = lVar2.f19189p;
            Double d65 = lVar2.f19187o;
            Double d66 = lVar2.f19185n;
            Double d67 = lVar2.f19183m;
            Double d68 = lVar2.f19181l;
            Double d69 = lVar2.f19179k;
            Long l17 = lVar2.f19177j;
            Boolean bool = lVar2.f19175i;
            Boolean bool2 = lVar2.f19173h;
            Boolean bool3 = lVar2.f19171g;
            g gVar = lVar2.f19169f;
            e eVar = lVar2.f19167e;
            String str3 = lVar2.f19165d;
            String str4 = lVar2.f19163c;
            String str5 = lVar2.f19161b;
            Long l18 = lVar2.f19159a;
            k63.e eVar2 = descriptor;
            l63.d dVarC = fVar.c(eVar2);
            o13.l<i63.c<Object>>[] lVarArr = l.P0;
            if (dVarC.C(eVar2) || l18 != null) {
                dVarC.d(eVar2, 0, v0.f117027a, l18);
            }
            if (dVarC.C(eVar2) || str5 != null) {
                dVarC.d(eVar2, 1, y1.f117048a, str5);
            }
            if (dVarC.C(eVar2) || str4 != null) {
                dVarC.d(eVar2, 2, y1.f117048a, str4);
            }
            if (dVarC.C(eVar2) || str3 != null) {
                dVarC.d(eVar2, 3, y1.f117048a, str3);
            }
            if (dVarC.C(eVar2) || eVar != null) {
                dVarC.d(eVar2, 4, e.a.f19112a, eVar);
            }
            if (dVarC.C(eVar2) || gVar != null) {
                dVarC.d(eVar2, 5, g.a.f19119a, gVar);
            }
            if (dVarC.C(eVar2) || bool3 != null) {
                dVarC.d(eVar2, 6, m63.g.f116948a, bool3);
            }
            if (dVarC.C(eVar2) || bool2 != null) {
                dVarC.d(eVar2, 7, m63.g.f116948a, bool2);
            }
            if (dVarC.C(eVar2) || bool != null) {
                dVarC.d(eVar2, 8, m63.g.f116948a, bool);
            }
            if (dVarC.C(eVar2) || l17 != null) {
                dVarC.d(eVar2, 9, v0.f117027a, l17);
            }
            if (dVarC.C(eVar2) || d69 != null) {
                dVarC.d(eVar2, 10, x.f117036a, d69);
            }
            if (dVarC.C(eVar2) || d68 != null) {
                dVarC.d(eVar2, 11, x.f117036a, d68);
            }
            if (dVarC.C(eVar2) || d67 != 0) {
                dVarC.d(eVar2, 12, x.f117036a, d67);
            }
            if (dVarC.C(eVar2) || d66 != 0) {
                dVarC.d(eVar2, 13, x.f117036a, d66);
            }
            if (dVarC.C(eVar2) || d65 != null) {
                dVarC.d(eVar2, 14, x.f117036a, d65);
            }
            if (dVarC.C(eVar2) || d64 != null) {
                dVarC.d(eVar2, 15, x.f117036a, d64);
            }
            if (dVarC.C(eVar2) || d59 != null) {
                dVarC.d(eVar2, 16, x.f117036a, d59);
            }
            if (dVarC.C(eVar2) || d58 != null) {
                dVarC.d(eVar2, 17, x.f117036a, d58);
            }
            if (dVarC.C(eVar2) || d57 != null) {
                dVarC.d(eVar2, 18, x.f117036a, d57);
            }
            if (dVarC.C(eVar2) || d56 != null) {
                dVarC.d(eVar2, 19, x.f117036a, d56);
            }
            if (dVarC.C(eVar2) || l16 != null) {
                dVarC.d(eVar2, 20, v0.f117027a, l16);
            }
            if (dVarC.C(eVar2) || str2 != null) {
                dVarC.d(eVar2, 21, y1.f117048a, str2);
            }
            if (dVarC.C(eVar2) || d55 != null) {
                dVarC.d(eVar2, 22, x.f117036a, d55);
            }
            if (dVarC.C(eVar2) || d54 != null) {
                dVarC.d(eVar2, 23, x.f117036a, d54);
            }
            if (dVarC.C(eVar2) || d49 != null) {
                dVarC.d(eVar2, 24, x.f117036a, d49);
            }
            if (dVarC.C(eVar2) || d48 != null) {
                dVarC.d(eVar2, 25, x.f117036a, d48);
            }
            if (dVarC.C(eVar2) || d47 != null) {
                dVarC.d(eVar2, 26, x.f117036a, d47);
            }
            if (dVarC.C(eVar2) || d46 != null) {
                dVarC.d(eVar2, 27, x.f117036a, d46);
            }
            if (dVarC.C(eVar2) || d45 != null) {
                dVarC.d(eVar2, 28, x.f117036a, d45);
            }
            if (dVarC.C(eVar2) || d44 != null) {
                dVarC.d(eVar2, 29, x.f117036a, d44);
            }
            if (dVarC.C(eVar2) || l15 != null) {
                dVarC.d(eVar2, 30, v0.f117027a, l15);
            }
            if (dVarC.C(eVar2) || str != null) {
                dVarC.d(eVar2, 31, y1.f117048a, str);
            }
            if (dVarC.C(eVar2) || list != null) {
                dVarC.d(eVar2, 32, lVarArr[32].getValue(), list);
            }
            if (dVarC.C(eVar2) || aVar != null) {
                dVarC.d(eVar2, 33, bo.a.C0277a.f19085a, aVar);
            }
            if (dVarC.C(eVar2) || d39 != null) {
                dVarC.d(eVar2, 34, x.f117036a, d39);
            }
            if (dVarC.C(eVar2) || d38 != null) {
                dVarC.d(eVar2, 35, x.f117036a, d38);
            }
            if (dVarC.C(eVar2) || d37 != null) {
                dVarC.d(eVar2, 36, x.f117036a, d37);
            }
            if (dVarC.C(eVar2) || d36 != null) {
                dVarC.d(eVar2, 37, x.f117036a, d36);
            }
            if (dVarC.C(eVar2) || d35 != null) {
                dVarC.d(eVar2, 38, x.f117036a, d35);
            }
            if (dVarC.C(eVar2) || d34 != null) {
                dVarC.d(eVar2, 39, x.f117036a, d34);
            }
            if (dVarC.C(eVar2) || d29 != null) {
                dVarC.d(eVar2, 40, x.f117036a, d29);
            }
            if (dVarC.C(eVar2) || d28 != null) {
                dVarC.d(eVar2, 41, x.f117036a, d28);
            }
            if (dVarC.C(eVar2) || d27 != null) {
                dVarC.d(eVar2, 42, x.f117036a, d27);
            }
            if (dVarC.C(eVar2) || d26 != null) {
                dVarC.d(eVar2, 43, x.f117036a, d26);
            }
            if (dVarC.C(eVar2) || d25 != null) {
                dVarC.d(eVar2, 44, x.f117036a, d25);
            }
            if (dVarC.C(eVar2) || d24 != null) {
                dVarC.d(eVar2, 45, x.f117036a, d24);
            }
            if (dVarC.C(eVar2) || d19 != null) {
                dVarC.d(eVar2, 46, x.f117036a, d19);
            }
            if (dVarC.C(eVar2) || d18 != null) {
                dVarC.d(eVar2, 47, x.f117036a, d18);
            }
            if (dVarC.C(eVar2) || l14 != null) {
                dVarC.d(eVar2, 48, v0.f117027a, l14);
            }
            if (dVarC.C(eVar2) || d17 != null) {
                dVarC.d(eVar2, 49, x.f117036a, d17);
            }
            if (dVarC.C(eVar2) || d16 != null) {
                dVarC.d(eVar2, 50, x.f117036a, d16);
            }
            if (dVarC.C(eVar2) || d15 != null) {
                dVarC.d(eVar2, 51, x.f117036a, d15);
            }
            if (dVarC.C(eVar2) || d14 != null) {
                dVarC.d(eVar2, 52, x.f117036a, d14);
            }
            if (!dVarC.C(eVar2)) {
                lVar = lVar2;
                if (lVar.f19162b0 != null) {
                }
                if (dVarC.C(eVar2) || lVar.f19164c0 != null) {
                    dVarC.d(eVar2, 54, x.f117036a, lVar.f19164c0);
                }
                if (dVarC.C(eVar2) || lVar.f19166d0 != null) {
                    dVarC.d(eVar2, 55, m63.g.f116948a, lVar.f19166d0);
                }
                if (dVarC.C(eVar2) || lVar.f19168e0 != null) {
                    dVarC.d(eVar2, 56, o.a.f19229a, lVar.f19168e0);
                }
                if (dVarC.C(eVar2) || lVar.f19170f0 != null) {
                    dVarC.d(eVar2, 57, m0.f116981a, lVar.f19170f0);
                }
                if (dVarC.C(eVar2) || lVar.f19172g0 != null) {
                    dVarC.d(eVar2, 58, x.f117036a, lVar.f19172g0);
                }
                if (dVarC.C(eVar2) || lVar.f19174h0 != null) {
                    dVarC.d(eVar2, 59, m0.f116981a, lVar.f19174h0);
                }
                if (dVarC.C(eVar2) || lVar.f19176i0 != null) {
                    dVarC.d(eVar2, 60, x.f117036a, lVar.f19176i0);
                }
                if (dVarC.C(eVar2) || lVar.f19178j0 != null) {
                    dVarC.d(eVar2, 61, x.f117036a, lVar.f19178j0);
                }
                if (dVarC.C(eVar2) || lVar.f19180k0 != null) {
                    dVarC.d(eVar2, 62, x.f117036a, lVar.f19180k0);
                }
                if (dVarC.C(eVar2) || lVar.f19182l0 != null) {
                    dVarC.d(eVar2, 63, x.f117036a, lVar.f19182l0);
                }
                if (dVarC.C(eVar2) || lVar.f19184m0 != null) {
                    dVarC.d(eVar2, 64, m0.f116981a, lVar.f19184m0);
                }
                if (dVarC.C(eVar2) || lVar.f19186n0 != null) {
                    dVarC.d(eVar2, 65, m0.f116981a, lVar.f19186n0);
                }
                if (dVarC.C(eVar2) || lVar.f19188o0 != null) {
                    dVarC.d(eVar2, 66, x.f117036a, lVar.f19188o0);
                }
                if (dVarC.C(eVar2) || lVar.f19190p0 != null) {
                    dVarC.d(eVar2, 67, x.f117036a, lVar.f19190p0);
                }
                if (dVarC.C(eVar2) || lVar.f19192q0 != null) {
                    dVarC.d(eVar2, 68, x.f117036a, lVar.f19192q0);
                }
                if (dVarC.C(eVar2) || lVar.f19194r0 != null) {
                    dVarC.d(eVar2, 69, x.f117036a, lVar.f19194r0);
                }
                if (dVarC.C(eVar2) || lVar.f19196s0 != null) {
                    dVarC.d(eVar2, 70, x.f117036a, lVar.f19196s0);
                }
                if (dVarC.C(eVar2) || lVar.f19198t0 != null) {
                    dVarC.d(eVar2, 71, x.f117036a, lVar.f19198t0);
                }
                if (dVarC.C(eVar2) || lVar.f19200u0 != null) {
                    dVarC.d(eVar2, 72, x.f117036a, lVar.f19200u0);
                }
                if (dVarC.C(eVar2) || lVar.f19202v0 != null) {
                    dVarC.d(eVar2, 73, x.f117036a, lVar.f19202v0);
                }
                if (dVarC.C(eVar2) || lVar.f19204w0 != null) {
                    dVarC.d(eVar2, 74, lVarArr[74].getValue(), lVar.f19204w0);
                }
                if (dVarC.C(eVar2) || lVar.f19206x0 != null) {
                    dVarC.d(eVar2, 75, x.f117036a, lVar.f19206x0);
                }
                if (dVarC.C(eVar2) || lVar.f19208y0 != null) {
                    dVarC.d(eVar2, 76, x.f117036a, lVar.f19208y0);
                }
                if (dVarC.C(eVar2) || lVar.f19210z0 != null) {
                    dVarC.d(eVar2, 77, x.f117036a, lVar.f19210z0);
                }
                if (dVarC.C(eVar2) || lVar.A0 != null) {
                    dVarC.d(eVar2, 78, x.f117036a, lVar.A0);
                }
                if (dVarC.C(eVar2) || lVar.B0 != null) {
                    dVarC.d(eVar2, 79, x.f117036a, lVar.B0);
                }
                if (dVarC.C(eVar2) || lVar.C0 != null) {
                    dVarC.d(eVar2, 80, x.f117036a, lVar.C0);
                }
                if (dVarC.C(eVar2) || lVar.D0 != null) {
                    dVarC.d(eVar2, 81, x.f117036a, lVar.D0);
                }
                if (dVarC.C(eVar2) || lVar.E0 != null) {
                    dVarC.d(eVar2, 82, x.f117036a, lVar.E0);
                }
                if (dVarC.C(eVar2) || lVar.F0 != null) {
                    dVarC.d(eVar2, 83, x.f117036a, lVar.F0);
                }
                if (dVarC.C(eVar2) || lVar.G0 != null) {
                    dVarC.d(eVar2, 84, x.f117036a, lVar.G0);
                }
                if (dVarC.C(eVar2) || lVar.H0 != null) {
                    dVarC.d(eVar2, 85, x.f117036a, lVar.H0);
                }
                if (dVarC.C(eVar2) || lVar.I0 != null) {
                    dVarC.d(eVar2, 86, y1.f117048a, lVar.I0);
                }
                if (dVarC.C(eVar2) || lVar.J0 != null) {
                    dVarC.d(eVar2, 87, x.f117036a, lVar.J0);
                }
                if (dVarC.C(eVar2) || lVar.K0 != null) {
                    dVarC.d(eVar2, 88, m63.g.f116948a, lVar.K0);
                }
                if (dVarC.C(eVar2) || lVar.L0 != null) {
                    dVarC.d(eVar2, 89, lVarArr[89].getValue(), lVar.L0);
                }
                if (dVarC.C(eVar2) || lVar.M0 != null) {
                    dVarC.d(eVar2, 90, m63.g.f116948a, lVar.M0);
                }
                if (dVarC.C(eVar2) || lVar.N0 != null) {
                    dVarC.d(eVar2, 91, y1.f117048a, lVar.N0);
                }
                if (dVarC.C(eVar2) || lVar.O0 != null) {
                    dVarC.d(eVar2, 92, x.f117036a, lVar.O0);
                }
                dVarC.b(eVar2);
            }
            lVar = lVar2;
            dVarC.d(eVar2, 53, x.f117036a, lVar.f19162b0);
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 54, x.f117036a, lVar.f19164c0);
            } else {
                dVarC.d(eVar2, 54, x.f117036a, lVar.f19164c0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 55, m63.g.f116948a, lVar.f19166d0);
            } else {
                dVarC.d(eVar2, 55, m63.g.f116948a, lVar.f19166d0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 56, o.a.f19229a, lVar.f19168e0);
            } else {
                dVarC.d(eVar2, 56, o.a.f19229a, lVar.f19168e0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 57, m0.f116981a, lVar.f19170f0);
            } else {
                dVarC.d(eVar2, 57, m0.f116981a, lVar.f19170f0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 58, x.f117036a, lVar.f19172g0);
            } else {
                dVarC.d(eVar2, 58, x.f117036a, lVar.f19172g0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 59, m0.f116981a, lVar.f19174h0);
            } else {
                dVarC.d(eVar2, 59, m0.f116981a, lVar.f19174h0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 60, x.f117036a, lVar.f19176i0);
            } else {
                dVarC.d(eVar2, 60, x.f117036a, lVar.f19176i0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 61, x.f117036a, lVar.f19178j0);
            } else {
                dVarC.d(eVar2, 61, x.f117036a, lVar.f19178j0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 62, x.f117036a, lVar.f19180k0);
            } else {
                dVarC.d(eVar2, 62, x.f117036a, lVar.f19180k0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 63, x.f117036a, lVar.f19182l0);
            } else {
                dVarC.d(eVar2, 63, x.f117036a, lVar.f19182l0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 64, m0.f116981a, lVar.f19184m0);
            } else {
                dVarC.d(eVar2, 64, m0.f116981a, lVar.f19184m0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 65, m0.f116981a, lVar.f19186n0);
            } else {
                dVarC.d(eVar2, 65, m0.f116981a, lVar.f19186n0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 66, x.f117036a, lVar.f19188o0);
            } else {
                dVarC.d(eVar2, 66, x.f117036a, lVar.f19188o0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 67, x.f117036a, lVar.f19190p0);
            } else {
                dVarC.d(eVar2, 67, x.f117036a, lVar.f19190p0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 68, x.f117036a, lVar.f19192q0);
            } else {
                dVarC.d(eVar2, 68, x.f117036a, lVar.f19192q0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 69, x.f117036a, lVar.f19194r0);
            } else {
                dVarC.d(eVar2, 69, x.f117036a, lVar.f19194r0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 70, x.f117036a, lVar.f19196s0);
            } else {
                dVarC.d(eVar2, 70, x.f117036a, lVar.f19196s0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 71, x.f117036a, lVar.f19198t0);
            } else {
                dVarC.d(eVar2, 71, x.f117036a, lVar.f19198t0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 72, x.f117036a, lVar.f19200u0);
            } else {
                dVarC.d(eVar2, 72, x.f117036a, lVar.f19200u0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 73, x.f117036a, lVar.f19202v0);
            } else {
                dVarC.d(eVar2, 73, x.f117036a, lVar.f19202v0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 74, lVarArr[74].getValue(), lVar.f19204w0);
            } else {
                dVarC.d(eVar2, 74, lVarArr[74].getValue(), lVar.f19204w0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 75, x.f117036a, lVar.f19206x0);
            } else {
                dVarC.d(eVar2, 75, x.f117036a, lVar.f19206x0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 76, x.f117036a, lVar.f19208y0);
            } else {
                dVarC.d(eVar2, 76, x.f117036a, lVar.f19208y0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 77, x.f117036a, lVar.f19210z0);
            } else {
                dVarC.d(eVar2, 77, x.f117036a, lVar.f19210z0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 78, x.f117036a, lVar.A0);
            } else {
                dVarC.d(eVar2, 78, x.f117036a, lVar.A0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 79, x.f117036a, lVar.B0);
            } else {
                dVarC.d(eVar2, 79, x.f117036a, lVar.B0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 80, x.f117036a, lVar.C0);
            } else {
                dVarC.d(eVar2, 80, x.f117036a, lVar.C0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 81, x.f117036a, lVar.D0);
            } else {
                dVarC.d(eVar2, 81, x.f117036a, lVar.D0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 82, x.f117036a, lVar.E0);
            } else {
                dVarC.d(eVar2, 82, x.f117036a, lVar.E0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 83, x.f117036a, lVar.F0);
            } else {
                dVarC.d(eVar2, 83, x.f117036a, lVar.F0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 84, x.f117036a, lVar.G0);
            } else {
                dVarC.d(eVar2, 84, x.f117036a, lVar.G0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 85, x.f117036a, lVar.H0);
            } else {
                dVarC.d(eVar2, 85, x.f117036a, lVar.H0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 86, y1.f117048a, lVar.I0);
            } else {
                dVarC.d(eVar2, 86, y1.f117048a, lVar.I0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 87, x.f117036a, lVar.J0);
            } else {
                dVarC.d(eVar2, 87, x.f117036a, lVar.J0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 88, m63.g.f116948a, lVar.K0);
            } else {
                dVarC.d(eVar2, 88, m63.g.f116948a, lVar.K0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 89, lVarArr[89].getValue(), lVar.L0);
            } else {
                dVarC.d(eVar2, 89, lVarArr[89].getValue(), lVar.L0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 90, m63.g.f116948a, lVar.M0);
            } else {
                dVarC.d(eVar2, 90, m63.g.f116948a, lVar.M0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 91, y1.f117048a, lVar.N0);
            } else {
                dVarC.d(eVar2, 91, y1.f117048a, lVar.N0);
            }
            if (dVarC.C(eVar2)) {
                dVarC.d(eVar2, 92, x.f117036a, lVar.O0);
            } else {
                dVarC.d(eVar2, 92, x.f117036a, lVar.O0);
            }
            dVarC.b(eVar2);
        }
    }

    static {
        o13.n nVar = o13.n.PUBLICATION;
        P0 = new o13.l[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, o13.m.a(nVar, new y(9)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, o13.m.a(nVar, new y(10)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, o13.m.a(nVar, new y(11)), null, null, null};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l(Long l14, String str, String str2, String str3, e eVar, g gVar, Boolean bool, Boolean bool2, Boolean bool3, Long l15, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Long l16, String str4, Double d28, Double d29, Double d34, Double d35, Double d36, Double d37, Double d38, Double d39, Long l17, String str5, List list, bo.a aVar, Double d44, Double d45, Double d46, Double d47, Double d48, Double d49, Double d54, Double d55, Double d56, Double d57, Double d58, Double d59, Double d64, Double d65, Long l18, Double d66, Double d67, Double d68, Double d69, Double d74, Double d75, Boolean bool4, o oVar, Integer num, Double d76, Integer num2, Double d77, Double d78, Double d79, Double d84, Integer num3, Integer num4, Double d85, Double d86, Double d87, Double d88, Double d89, Double d93, Double d94, Double d95, List list2, Double d96, Double d97, Double d98, Double d99, Double d100, Double d101, Double d102, Double d103, Double d104, Double d105, Double d106, String str6, Double d107, Boolean bool5, List list3, Boolean bool6, String str7, Double d108, int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        Long l19 = (i14 & 1) != 0 ? null : l14;
        String str8 = (i14 & 2) != 0 ? null : str;
        String str9 = (i14 & 4) != 0 ? null : str2;
        String str10 = (i14 & 8) != 0 ? null : str3;
        e eVar2 = (i14 & 16) != 0 ? null : eVar;
        g gVar2 = (i14 & 32) != 0 ? null : gVar;
        Boolean bool7 = (i14 & 64) != 0 ? null : bool;
        Boolean bool8 = (i14 & 128) != 0 ? null : bool2;
        Boolean bool9 = (i14 & 256) != 0 ? null : bool3;
        Long l24 = (i14 & 512) != 0 ? null : l15;
        Double d109 = (i14 & 1024) != 0 ? null : d14;
        Double d110 = (i14 & 2048) != 0 ? null : d15;
        Double d111 = (i14 & 4096) != 0 ? null : d16;
        Long l25 = l19;
        Double d112 = (i14 & 8192) != 0 ? null : d17;
        Double d113 = (i14 & 16384) != 0 ? null : d18;
        Double d114 = (i14 & 32768) != 0 ? null : d19;
        Double d115 = (i14 & 65536) != 0 ? null : d24;
        Double d116 = (i14 & 131072) != 0 ? null : d25;
        Double d117 = (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : d26;
        Double d118 = (i14 & 524288) != 0 ? null : d27;
        Long l26 = (i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : l16;
        String str11 = (i14 & 2097152) != 0 ? null : str4;
        Double d119 = (i14 & 4194304) != 0 ? null : d28;
        Double d120 = (i14 & 8388608) != 0 ? null : d29;
        Double d121 = (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : d34;
        Double d122 = (i14 & 33554432) != 0 ? null : d35;
        Double d123 = (i14 & 67108864) != 0 ? null : d36;
        Double d124 = (i14 & 134217728) != 0 ? null : d37;
        Double d125 = (i14 & 268435456) != 0 ? null : d38;
        Double d126 = (i14 & 536870912) != 0 ? null : d39;
        Long l27 = (i14 & 1073741824) != 0 ? null : l17;
        String str12 = (i14 & Integer.MIN_VALUE) != 0 ? null : str5;
        this(l25, str8, str9, str10, eVar2, gVar2, bool7, bool8, bool9, l24, d109, d110, d111, d112, d113, d114, d115, d116, d117, d118, l26, str11, d119, d120, d121, d122, d123, d124, d125, d126, l27, str12, (i15 & 1) != 0 ? null : list, (i15 & 2) != 0 ? null : aVar, (i15 & 4) != 0 ? null : d44, (i15 & 8) != 0 ? null : d45, (i15 & 16) != 0 ? null : d46, (i15 & 32) != 0 ? null : d47, (i15 & 64) != 0 ? null : d48, (i15 & 128) != 0 ? null : d49, (i15 & 256) != 0 ? null : d54, (i15 & 512) != 0 ? null : d55, (i15 & 1024) != 0 ? null : d56, (i15 & 2048) != 0 ? null : d57, (i15 & 4096) != 0 ? null : d58, (i15 & 8192) != 0 ? null : d59, (i15 & 16384) != 0 ? null : d64, (i15 & 32768) != 0 ? null : d65, (i15 & 65536) != 0 ? null : l18, (i15 & 131072) != 0 ? null : d66, (i15 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : d67, (i15 & 524288) != 0 ? null : d68, (i15 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : d69, (i15 & 2097152) != 0 ? null : d74, (i15 & 4194304) != 0 ? null : d75, (i15 & 8388608) != 0 ? null : bool4, (i15 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : oVar, (i15 & 33554432) != 0 ? null : num, (i15 & 67108864) != 0 ? null : d76, (i15 & 134217728) != 0 ? null : num2, (i15 & 268435456) != 0 ? null : d77, (i15 & 536870912) != 0 ? null : d78, (i15 & 1073741824) != 0 ? null : d79, (i15 & Integer.MIN_VALUE) != 0 ? null : d84, (i16 & 1) != 0 ? null : num3, (i16 & 2) != 0 ? null : num4, (i16 & 4) != 0 ? null : d85, (i16 & 8) != 0 ? null : d86, (i16 & 16) != 0 ? null : d87, (i16 & 32) != 0 ? null : d88, (i16 & 64) != 0 ? null : d89, (i16 & 128) != 0 ? null : d93, (i16 & 256) != 0 ? null : d94, (i16 & 512) != 0 ? null : d95, (i16 & 1024) != 0 ? null : list2, (i16 & 2048) != 0 ? null : d96, (i16 & 4096) != 0 ? null : d97, (i16 & 8192) != 0 ? null : d98, (i16 & 16384) != 0 ? null : d99, (i16 & 32768) != 0 ? null : d100, (i16 & 65536) != 0 ? null : d101, (i16 & 131072) != 0 ? null : d102, (i16 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : d103, (i16 & 524288) != 0 ? null : d104, (i16 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : d105, (i16 & 2097152) != 0 ? null : d106, (i16 & 4194304) != 0 ? null : str6, (i16 & 8388608) != 0 ? null : d107, (i16 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : bool5, (i16 & 33554432) != 0 ? null : list3, (i16 & 67108864) != 0 ? null : bool6, (i16 & 134217728) != 0 ? null : str7, (i16 & 268435456) != 0 ? null : d108);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return s.g(this.f19159a, lVar.f19159a) && s.g(this.f19161b, lVar.f19161b) && s.g(this.f19163c, lVar.f19163c) && s.g(this.f19165d, lVar.f19165d) && s.g(this.f19167e, lVar.f19167e) && s.g(this.f19169f, lVar.f19169f) && s.g(this.f19171g, lVar.f19171g) && s.g(this.f19173h, lVar.f19173h) && s.g(this.f19175i, lVar.f19175i) && s.g(this.f19177j, lVar.f19177j) && s.g(this.f19179k, lVar.f19179k) && s.g(this.f19181l, lVar.f19181l) && s.g(this.f19183m, lVar.f19183m) && s.g(this.f19185n, lVar.f19185n) && s.g(this.f19187o, lVar.f19187o) && s.g(this.f19189p, lVar.f19189p) && s.g(this.f19191q, lVar.f19191q) && s.g(this.f19193r, lVar.f19193r) && s.g(this.f19195s, lVar.f19195s) && s.g(this.f19197t, lVar.f19197t) && s.g(this.f19199u, lVar.f19199u) && s.g(this.f19201v, lVar.f19201v) && s.g(this.f19203w, lVar.f19203w) && s.g(this.f19205x, lVar.f19205x) && s.g(this.f19207y, lVar.f19207y) && s.g(this.f19209z, lVar.f19209z) && s.g(this.A, lVar.A) && s.g(this.B, lVar.B) && s.g(this.C, lVar.C) && s.g(this.D, lVar.D) && s.g(this.E, lVar.E) && s.g(this.F, lVar.F) && s.g(this.G, lVar.G) && s.g(this.H, lVar.H) && s.g(this.I, lVar.I) && s.g(this.J, lVar.J) && s.g(this.K, lVar.K) && s.g(this.L, lVar.L) && s.g(this.M, lVar.M) && s.g(this.N, lVar.N) && s.g(this.O, lVar.O) && s.g(this.P, lVar.P) && s.g(this.Q, lVar.Q) && s.g(this.R, lVar.R) && s.g(this.S, lVar.S) && s.g(this.T, lVar.T) && s.g(this.U, lVar.U) && s.g(this.V, lVar.V) && s.g(this.W, lVar.W) && s.g(this.X, lVar.X) && s.g(this.Y, lVar.Y) && s.g(this.Z, lVar.Z) && s.g(this.f19160a0, lVar.f19160a0) && s.g(this.f19162b0, lVar.f19162b0) && s.g(this.f19164c0, lVar.f19164c0) && s.g(this.f19166d0, lVar.f19166d0) && s.g(this.f19168e0, lVar.f19168e0) && s.g(this.f19170f0, lVar.f19170f0) && s.g(this.f19172g0, lVar.f19172g0) && s.g(this.f19174h0, lVar.f19174h0) && s.g(this.f19176i0, lVar.f19176i0) && s.g(this.f19178j0, lVar.f19178j0) && s.g(this.f19180k0, lVar.f19180k0) && s.g(this.f19182l0, lVar.f19182l0) && s.g(this.f19184m0, lVar.f19184m0) && s.g(this.f19186n0, lVar.f19186n0) && s.g(this.f19188o0, lVar.f19188o0) && s.g(this.f19190p0, lVar.f19190p0) && s.g(this.f19192q0, lVar.f19192q0) && s.g(this.f19194r0, lVar.f19194r0) && s.g(this.f19196s0, lVar.f19196s0) && s.g(this.f19198t0, lVar.f19198t0) && s.g(this.f19200u0, lVar.f19200u0) && s.g(this.f19202v0, lVar.f19202v0) && s.g(this.f19204w0, lVar.f19204w0) && s.g(this.f19206x0, lVar.f19206x0) && s.g(this.f19208y0, lVar.f19208y0) && s.g(this.f19210z0, lVar.f19210z0) && s.g(this.A0, lVar.A0) && s.g(this.B0, lVar.B0) && s.g(this.C0, lVar.C0) && s.g(this.D0, lVar.D0) && s.g(this.E0, lVar.E0) && s.g(this.F0, lVar.F0) && s.g(this.G0, lVar.G0) && s.g(this.H0, lVar.H0) && s.g(this.I0, lVar.I0) && s.g(this.J0, lVar.J0) && s.g(this.K0, lVar.K0) && s.g(this.L0, lVar.L0) && s.g(this.M0, lVar.M0) && s.g(this.N0, lVar.N0) && s.g(this.O0, lVar.O0);
    }

    public final int hashCode() {
        Long l14 = this.f19159a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.f19161b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f19163c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19165d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        e eVar = this.f19167e;
        int iHashCode5 = (iHashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        g gVar = this.f19169f;
        int iHashCode6 = (iHashCode5 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Boolean bool = this.f19171g;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f19173h;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f19175i;
        int iHashCode9 = (iHashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l15 = this.f19177j;
        int iHashCode10 = (iHashCode9 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Double d14 = this.f19179k;
        int iHashCode11 = (iHashCode10 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f19181l;
        int iHashCode12 = (iHashCode11 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f19183m;
        int iHashCode13 = (iHashCode12 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.f19185n;
        int iHashCode14 = (iHashCode13 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.f19187o;
        int iHashCode15 = (iHashCode14 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.f19189p;
        int iHashCode16 = (iHashCode15 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.f19191q;
        int iHashCode17 = (iHashCode16 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.f19193r;
        int iHashCode18 = (iHashCode17 + (d25 == null ? 0 : d25.hashCode())) * 31;
        Double d26 = this.f19195s;
        int iHashCode19 = (iHashCode18 + (d26 == null ? 0 : d26.hashCode())) * 31;
        Double d27 = this.f19197t;
        int iHashCode20 = (iHashCode19 + (d27 == null ? 0 : d27.hashCode())) * 31;
        Long l16 = this.f19199u;
        int iHashCode21 = (iHashCode20 + (l16 == null ? 0 : l16.hashCode())) * 31;
        String str4 = this.f19201v;
        int iHashCode22 = (iHashCode21 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d28 = this.f19203w;
        int iHashCode23 = (iHashCode22 + (d28 == null ? 0 : d28.hashCode())) * 31;
        Double d29 = this.f19205x;
        int iHashCode24 = (iHashCode23 + (d29 == null ? 0 : d29.hashCode())) * 31;
        Double d34 = this.f19207y;
        int iHashCode25 = (iHashCode24 + (d34 == null ? 0 : d34.hashCode())) * 31;
        Double d35 = this.f19209z;
        int iHashCode26 = (iHashCode25 + (d35 == null ? 0 : d35.hashCode())) * 31;
        Double d36 = this.A;
        int iHashCode27 = (iHashCode26 + (d36 == null ? 0 : d36.hashCode())) * 31;
        Double d37 = this.B;
        int iHashCode28 = (iHashCode27 + (d37 == null ? 0 : d37.hashCode())) * 31;
        Double d38 = this.C;
        int iHashCode29 = (iHashCode28 + (d38 == null ? 0 : d38.hashCode())) * 31;
        Double d39 = this.D;
        int iHashCode30 = (iHashCode29 + (d39 == null ? 0 : d39.hashCode())) * 31;
        Long l17 = this.E;
        int iHashCode31 = (iHashCode30 + (l17 == null ? 0 : l17.hashCode())) * 31;
        String str5 = this.F;
        int iHashCode32 = (iHashCode31 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list = this.G;
        int iHashCode33 = (iHashCode32 + (list == null ? 0 : list.hashCode())) * 31;
        bo.a aVar = this.H;
        int iHashCode34 = (iHashCode33 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Double d44 = this.I;
        int iHashCode35 = (iHashCode34 + (d44 == null ? 0 : d44.hashCode())) * 31;
        Double d45 = this.J;
        int iHashCode36 = (iHashCode35 + (d45 == null ? 0 : d45.hashCode())) * 31;
        Double d46 = this.K;
        int iHashCode37 = (iHashCode36 + (d46 == null ? 0 : d46.hashCode())) * 31;
        Double d47 = this.L;
        int iHashCode38 = (iHashCode37 + (d47 == null ? 0 : d47.hashCode())) * 31;
        Double d48 = this.M;
        int iHashCode39 = (iHashCode38 + (d48 == null ? 0 : d48.hashCode())) * 31;
        Double d49 = this.N;
        int iHashCode40 = (iHashCode39 + (d49 == null ? 0 : d49.hashCode())) * 31;
        Double d54 = this.O;
        int iHashCode41 = (iHashCode40 + (d54 == null ? 0 : d54.hashCode())) * 31;
        Double d55 = this.P;
        int iHashCode42 = (iHashCode41 + (d55 == null ? 0 : d55.hashCode())) * 31;
        Double d56 = this.Q;
        int iHashCode43 = (iHashCode42 + (d56 == null ? 0 : d56.hashCode())) * 31;
        Double d57 = this.R;
        int iHashCode44 = (iHashCode43 + (d57 == null ? 0 : d57.hashCode())) * 31;
        Double d58 = this.S;
        int iHashCode45 = (iHashCode44 + (d58 == null ? 0 : d58.hashCode())) * 31;
        Double d59 = this.T;
        int iHashCode46 = (iHashCode45 + (d59 == null ? 0 : d59.hashCode())) * 31;
        Double d64 = this.U;
        int iHashCode47 = (iHashCode46 + (d64 == null ? 0 : d64.hashCode())) * 31;
        Double d65 = this.V;
        int iHashCode48 = (iHashCode47 + (d65 == null ? 0 : d65.hashCode())) * 31;
        Long l18 = this.W;
        int iHashCode49 = (iHashCode48 + (l18 == null ? 0 : l18.hashCode())) * 31;
        Double d66 = this.X;
        int iHashCode50 = (iHashCode49 + (d66 == null ? 0 : d66.hashCode())) * 31;
        Double d67 = this.Y;
        int iHashCode51 = (iHashCode50 + (d67 == null ? 0 : d67.hashCode())) * 31;
        Double d68 = this.Z;
        int iHashCode52 = (iHashCode51 + (d68 == null ? 0 : d68.hashCode())) * 31;
        Double d69 = this.f19160a0;
        int iHashCode53 = (iHashCode52 + (d69 == null ? 0 : d69.hashCode())) * 31;
        Double d74 = this.f19162b0;
        int iHashCode54 = (iHashCode53 + (d74 == null ? 0 : d74.hashCode())) * 31;
        Double d75 = this.f19164c0;
        int iHashCode55 = (iHashCode54 + (d75 == null ? 0 : d75.hashCode())) * 31;
        Boolean bool4 = this.f19166d0;
        int iHashCode56 = (iHashCode55 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        o oVar = this.f19168e0;
        int iHashCode57 = (iHashCode56 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        Integer num = this.f19170f0;
        int iHashCode58 = (iHashCode57 + (num == null ? 0 : num.hashCode())) * 31;
        Double d76 = this.f19172g0;
        int iHashCode59 = (iHashCode58 + (d76 == null ? 0 : d76.hashCode())) * 31;
        Integer num2 = this.f19174h0;
        int iHashCode60 = (iHashCode59 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d77 = this.f19176i0;
        int iHashCode61 = (iHashCode60 + (d77 == null ? 0 : d77.hashCode())) * 31;
        Double d78 = this.f19178j0;
        int iHashCode62 = (iHashCode61 + (d78 == null ? 0 : d78.hashCode())) * 31;
        Double d79 = this.f19180k0;
        int iHashCode63 = (iHashCode62 + (d79 == null ? 0 : d79.hashCode())) * 31;
        Double d84 = this.f19182l0;
        int iHashCode64 = (iHashCode63 + (d84 == null ? 0 : d84.hashCode())) * 31;
        Integer num3 = this.f19184m0;
        int iHashCode65 = (iHashCode64 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f19186n0;
        int iHashCode66 = (iHashCode65 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Double d85 = this.f19188o0;
        int iHashCode67 = (iHashCode66 + (d85 == null ? 0 : d85.hashCode())) * 31;
        Double d86 = this.f19190p0;
        int iHashCode68 = (iHashCode67 + (d86 == null ? 0 : d86.hashCode())) * 31;
        Double d87 = this.f19192q0;
        int iHashCode69 = (iHashCode68 + (d87 == null ? 0 : d87.hashCode())) * 31;
        Double d88 = this.f19194r0;
        int iHashCode70 = (iHashCode69 + (d88 == null ? 0 : d88.hashCode())) * 31;
        Double d89 = this.f19196s0;
        int iHashCode71 = (iHashCode70 + (d89 == null ? 0 : d89.hashCode())) * 31;
        Double d93 = this.f19198t0;
        int iHashCode72 = (iHashCode71 + (d93 == null ? 0 : d93.hashCode())) * 31;
        Double d94 = this.f19200u0;
        int iHashCode73 = (iHashCode72 + (d94 == null ? 0 : d94.hashCode())) * 31;
        Double d95 = this.f19202v0;
        int iHashCode74 = (iHashCode73 + (d95 == null ? 0 : d95.hashCode())) * 31;
        List<j> list2 = this.f19204w0;
        int iHashCode75 = (iHashCode74 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Double d96 = this.f19206x0;
        int iHashCode76 = (iHashCode75 + (d96 == null ? 0 : d96.hashCode())) * 31;
        Double d97 = this.f19208y0;
        int iHashCode77 = (iHashCode76 + (d97 == null ? 0 : d97.hashCode())) * 31;
        Double d98 = this.f19210z0;
        int iHashCode78 = (iHashCode77 + (d98 == null ? 0 : d98.hashCode())) * 31;
        Double d99 = this.A0;
        int iHashCode79 = (iHashCode78 + (d99 == null ? 0 : d99.hashCode())) * 31;
        Double d100 = this.B0;
        int iHashCode80 = (iHashCode79 + (d100 == null ? 0 : d100.hashCode())) * 31;
        Double d101 = this.C0;
        int iHashCode81 = (iHashCode80 + (d101 == null ? 0 : d101.hashCode())) * 31;
        Double d102 = this.D0;
        int iHashCode82 = (iHashCode81 + (d102 == null ? 0 : d102.hashCode())) * 31;
        Double d103 = this.E0;
        int iHashCode83 = (iHashCode82 + (d103 == null ? 0 : d103.hashCode())) * 31;
        Double d104 = this.F0;
        int iHashCode84 = (iHashCode83 + (d104 == null ? 0 : d104.hashCode())) * 31;
        Double d105 = this.G0;
        int iHashCode85 = (iHashCode84 + (d105 == null ? 0 : d105.hashCode())) * 31;
        Double d106 = this.H0;
        int iHashCode86 = (iHashCode85 + (d106 == null ? 0 : d106.hashCode())) * 31;
        String str6 = this.I0;
        int iHashCode87 = (iHashCode86 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d107 = this.J0;
        int iHashCode88 = (iHashCode87 + (d107 == null ? 0 : d107.hashCode())) * 31;
        Boolean bool5 = this.K0;
        int iHashCode89 = (iHashCode88 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        List<Long> list3 = this.L0;
        int iHashCode90 = (iHashCode89 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool6 = this.M0;
        int iHashCode91 = (iHashCode90 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str7 = this.N0;
        int iHashCode92 = (iHashCode91 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Double d108 = this.O0;
        return iHashCode92 + (d108 != null ? d108.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbJ = b71.i.j("SummarizedActivityDTO(activityId=", ", activityName=", this.f19161b, this.f19159a, ", startTimeLocal=");
        sn.a.t(sbJ, this.f19163c, ", startTimeGMT=", this.f19165d, ", activityType=");
        sbJ.append(this.f19167e);
        sbJ.append(", eventType=");
        sbJ.append(this.f19169f);
        sbJ.append(", isFavorite=");
        b71.i.o(this.f19171g, this.f19173h, ", isPR=", ", isParent=", sbJ);
        sbJ.append(this.f19175i);
        sbJ.append(", parentId=");
        sbJ.append(this.f19177j);
        sbJ.append(", distance=");
        b71.i.p(this.f19179k, this.f19181l, ", duration=", ", elapsedDuration=", sbJ);
        b71.i.p(this.f19183m, this.f19185n, ", movingDuration=", ", elevationGain=", sbJ);
        b71.i.p(this.f19187o, this.f19189p, ", elevationLoss=", ", averageSpeed=", sbJ);
        b71.i.p(this.f19191q, this.f19193r, ", maxSpeed=", ", startLatitude=", sbJ);
        b71.i.p(this.f19195s, this.f19197t, ", startLongitude=", ", ownerId=", sbJ);
        b71.i.q(this.f19199u, ", ownerDisplayName=", this.f19201v, ", calories=", sbJ);
        b71.i.p(this.f19203w, this.f19205x, ", averageHR=", ", maxHR=", sbJ);
        b71.i.p(this.f19207y, this.f19209z, ", averageRunningCadenceInStepsPerMinute=", ", maxRunningCadenceInStepsPerMinute=", sbJ);
        b71.i.p(this.A, this.B, ", averageBikingCadenceInRevPerMinute=", ", maxBikingCadenceInRevPerMinute=", sbJ);
        b71.i.p(this.C, this.D, ", averageSwolf=", ", steps=", sbJ);
        b71.i.q(this.E, ", requestorRelationship=", this.F, ", userRoles=", sbJ);
        sbJ.append(this.G);
        sbJ.append(", privacy=");
        sbJ.append(this.H);
        sbJ.append(", avgPower=");
        b71.i.p(this.I, this.J, ", maxPower=", ", aerobicTrainingEffect=", sbJ);
        b71.i.p(this.K, this.L, ", strokes=", ", normPower=", sbJ);
        b71.i.p(this.M, this.N, ", avgLeftBalance=", ", max20MinPower=", sbJ);
        b71.i.p(this.O, this.P, ", avgVerticalOscillation=", ", avgGroundContactTime=", sbJ);
        b71.i.p(this.Q, this.R, ", avgStrideLength=", ", trainingStressScore=", sbJ);
        b71.i.p(this.S, this.T, ", avgVerticalRatio=", ", avgGroundContactBalance=", sbJ);
        b71.i.p(this.U, this.V, ", avgStrokeCadence=", ", deviceId=", sbJ);
        sbJ.append(this.W);
        sbJ.append(", minTemperature=");
        sbJ.append(this.X);
        sbJ.append(", maxTemperature=");
        b71.i.p(this.Y, this.Z, ", minElevation=", ", maxElevation=", sbJ);
        b71.i.p(this.f19160a0, this.f19162b0, ", maxDepth=", ", surfaceInterval=", sbJ);
        sbJ.append(this.f19164c0);
        sbJ.append(", isDecoDive=");
        sbJ.append(this.f19166d0);
        sbJ.append(", summarizedDiveInfo=");
        sbJ.append(this.f19168e0);
        sbJ.append(", diveCount=");
        sbJ.append(this.f19170f0);
        sbJ.append(", bottomTime=");
        b71.i.t(sbJ, this.f19172g0, ", lapCount=", this.f19174h0, ", endLatitude=");
        b71.i.p(this.f19176i0, this.f19178j0, ", endLongitude=", ", flow=", sbJ);
        b71.i.p(this.f19180k0, this.f19182l0, ", grit=", ", totalSets=", sbJ);
        j20.x.m(sbJ, this.f19184m0, ", totalReps=", this.f19186n0, ", minRespirationRate=");
        b71.i.p(this.f19188o0, this.f19190p0, ", maxRespirationRate=", ", avgRespirationRate=", sbJ);
        b71.i.p(this.f19192q0, this.f19194r0, ", avgStress=", ", startStress=", sbJ);
        b71.i.p(this.f19196s0, this.f19198t0, ", endStress=", ", differenceStress=", sbJ);
        b71.i.p(this.f19200u0, this.f19202v0, ", maxStress=", ", splitSummaries=", sbJ);
        sbJ.append(this.f19204w0);
        sbJ.append(", avgGradeAdjustedSpeed=");
        sbJ.append(this.f19206x0);
        sbJ.append(", avgWheelchairCadence=");
        b71.i.p(this.f19208y0, this.f19210z0, ", maxWheelchairCadence=", ", beginPackWeight=", sbJ);
        b71.i.p(this.A0, this.B0, ", avgStepSpeedLoss=", ", avgStepSpeedLossPercent=", sbJ);
        b71.i.p(this.C0, this.D0, ", longestPoolApneaInterval=", ", avgForce=", sbJ);
        b71.i.p(this.E0, this.F0, ", maxForce=", ", normalizedForce=", sbJ);
        b71.i.p(this.G0, this.H0, ", poolApneaBreathHoldDuration=", ", endTimeGMT=", sbJ);
        b71.i.x(sbJ, this.I0, ", carbonOffset=", this.J0, ", hasDog=");
        sbJ.append(this.K0);
        sbJ.append(", dogProfileIds=");
        sbJ.append(this.L0);
        sbJ.append(", isFamilyActivity=");
        b71.i.s(sbJ, this.M0, ", locationName=", this.N0, ", floorsClimbed=");
        return b71.i.g(sbJ, this.O0, ")");
    }

    /* JADX INFO: renamed from: bo.l$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbo/l$b;", "", "<init>", "()V", "Li63/c;", "Lbo/l;", "serializer", "()Li63/c;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<l> serializer() {
            return a.f19211a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ l(int i14, int i15, int i16, Long l14, String str, String str2, String str3, e eVar, g gVar, Boolean bool, Boolean bool2, Boolean bool3, Long l15, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Long l16, String str4, Double d28, Double d29, Double d34, Double d35, Double d36, Double d37, Double d38, Double d39, Long l17, String str5, List list, bo.a aVar, Double d44, Double d45, Double d46, Double d47, Double d48, Double d49, Double d54, Double d55, Double d56, Double d57, Double d58, Double d59, Double d64, Double d65, Long l18, Double d66, Double d67, Double d68, Double d69, Double d74, Double d75, Boolean bool4, o oVar, Integer num, Double d76, Integer num2, Double d77, Double d78, Double d79, Double d84, Integer num3, Integer num4, Double d85, Double d86, Double d87, Double d88, Double d89, Double d93, Double d94, Double d95, List list2, Double d96, Double d97, Double d98, Double d99, Double d100, Double d101, Double d102, Double d103, Double d104, Double d105, Double d106, String str6, Double d107, Boolean bool5, List list3, Boolean bool6, String str7, Double d108, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f19159a = null;
        } else {
            this.f19159a = l14;
        }
        if ((i14 & 2) == 0) {
            this.f19161b = null;
        } else {
            this.f19161b = str;
        }
        if ((i14 & 4) == 0) {
            this.f19163c = null;
        } else {
            this.f19163c = str2;
        }
        if ((i14 & 8) == 0) {
            this.f19165d = null;
        } else {
            this.f19165d = str3;
        }
        if ((i14 & 16) == 0) {
            this.f19167e = null;
        } else {
            this.f19167e = eVar;
        }
        if ((i14 & 32) == 0) {
            this.f19169f = null;
        } else {
            this.f19169f = gVar;
        }
        if ((i14 & 64) == 0) {
            this.f19171g = null;
        } else {
            this.f19171g = bool;
        }
        if ((i14 & 128) == 0) {
            this.f19173h = null;
        } else {
            this.f19173h = bool2;
        }
        if ((i14 & 256) == 0) {
            this.f19175i = null;
        } else {
            this.f19175i = bool3;
        }
        if ((i14 & 512) == 0) {
            this.f19177j = null;
        } else {
            this.f19177j = l15;
        }
        if ((i14 & 1024) == 0) {
            this.f19179k = null;
        } else {
            this.f19179k = d14;
        }
        if ((i14 & 2048) == 0) {
            this.f19181l = null;
        } else {
            this.f19181l = d15;
        }
        if ((i14 & 4096) == 0) {
            this.f19183m = null;
        } else {
            this.f19183m = d16;
        }
        if ((i14 & 8192) == 0) {
            this.f19185n = null;
        } else {
            this.f19185n = d17;
        }
        if ((i14 & 16384) == 0) {
            this.f19187o = null;
        } else {
            this.f19187o = d18;
        }
        if ((i14 & 32768) == 0) {
            this.f19189p = null;
        } else {
            this.f19189p = d19;
        }
        if ((i14 & 65536) == 0) {
            this.f19191q = null;
        } else {
            this.f19191q = d24;
        }
        if ((i14 & 131072) == 0) {
            this.f19193r = null;
        } else {
            this.f19193r = d25;
        }
        if ((i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) == 0) {
            this.f19195s = null;
        } else {
            this.f19195s = d26;
        }
        if ((i14 & 524288) == 0) {
            this.f19197t = null;
        } else {
            this.f19197t = d27;
        }
        if ((i14 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 0) {
            this.f19199u = null;
        } else {
            this.f19199u = l16;
        }
        if ((2097152 & i14) == 0) {
            this.f19201v = null;
        } else {
            this.f19201v = str4;
        }
        if ((4194304 & i14) == 0) {
            this.f19203w = null;
        } else {
            this.f19203w = d28;
        }
        if ((8388608 & i14) == 0) {
            this.f19205x = null;
        } else {
            this.f19205x = d29;
        }
        if ((16777216 & i14) == 0) {
            this.f19207y = null;
        } else {
            this.f19207y = d34;
        }
        if ((33554432 & i14) == 0) {
            this.f19209z = null;
        } else {
            this.f19209z = d35;
        }
        if ((67108864 & i14) == 0) {
            this.A = null;
        } else {
            this.A = d36;
        }
        if ((134217728 & i14) == 0) {
            this.B = null;
        } else {
            this.B = d37;
        }
        if ((268435456 & i14) == 0) {
            this.C = null;
        } else {
            this.C = d38;
        }
        if ((536870912 & i14) == 0) {
            this.D = null;
        } else {
            this.D = d39;
        }
        if ((1073741824 & i14) == 0) {
            this.E = null;
        } else {
            this.E = l17;
        }
        if ((i14 & Integer.MIN_VALUE) == 0) {
            this.F = null;
        } else {
            this.F = str5;
        }
        if ((i15 & 1) == 0) {
            this.G = null;
        } else {
            this.G = list;
        }
        if ((i15 & 2) == 0) {
            this.H = null;
        } else {
            this.H = aVar;
        }
        if ((i15 & 4) == 0) {
            this.I = null;
        } else {
            this.I = d44;
        }
        if ((i15 & 8) == 0) {
            this.J = null;
        } else {
            this.J = d45;
        }
        if ((i15 & 16) == 0) {
            this.K = null;
        } else {
            this.K = d46;
        }
        if ((i15 & 32) == 0) {
            this.L = null;
        } else {
            this.L = d47;
        }
        if ((i15 & 64) == 0) {
            this.M = null;
        } else {
            this.M = d48;
        }
        if ((i15 & 128) == 0) {
            this.N = null;
        } else {
            this.N = d49;
        }
        if ((i15 & 256) == 0) {
            this.O = null;
        } else {
            this.O = d54;
        }
        if ((i15 & 512) == 0) {
            this.P = null;
        } else {
            this.P = d55;
        }
        if ((i15 & 1024) == 0) {
            this.Q = null;
        } else {
            this.Q = d56;
        }
        if ((i15 & 2048) == 0) {
            this.R = null;
        } else {
            this.R = d57;
        }
        if ((i15 & 4096) == 0) {
            this.S = null;
        } else {
            this.S = d58;
        }
        if ((i15 & 8192) == 0) {
            this.T = null;
        } else {
            this.T = d59;
        }
        if ((i15 & 16384) == 0) {
            this.U = null;
        } else {
            this.U = d64;
        }
        if ((i15 & 32768) == 0) {
            this.V = null;
        } else {
            this.V = d65;
        }
        if ((i15 & 65536) == 0) {
            this.W = null;
        } else {
            this.W = l18;
        }
        if ((i15 & 131072) == 0) {
            this.X = null;
        } else {
            this.X = d66;
        }
        if ((i15 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) == 0) {
            this.Y = null;
        } else {
            this.Y = d67;
        }
        if ((i15 & 524288) == 0) {
            this.Z = null;
        } else {
            this.Z = d68;
        }
        if ((i15 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 0) {
            this.f19160a0 = null;
        } else {
            this.f19160a0 = d69;
        }
        if ((2097152 & i15) == 0) {
            this.f19162b0 = null;
        } else {
            this.f19162b0 = d74;
        }
        if ((4194304 & i15) == 0) {
            this.f19164c0 = null;
        } else {
            this.f19164c0 = d75;
        }
        if ((8388608 & i15) == 0) {
            this.f19166d0 = null;
        } else {
            this.f19166d0 = bool4;
        }
        if ((16777216 & i15) == 0) {
            this.f19168e0 = null;
        } else {
            this.f19168e0 = oVar;
        }
        if ((33554432 & i15) == 0) {
            this.f19170f0 = null;
        } else {
            this.f19170f0 = num;
        }
        if ((67108864 & i15) == 0) {
            this.f19172g0 = null;
        } else {
            this.f19172g0 = d76;
        }
        if ((134217728 & i15) == 0) {
            this.f19174h0 = null;
        } else {
            this.f19174h0 = num2;
        }
        if ((268435456 & i15) == 0) {
            this.f19176i0 = null;
        } else {
            this.f19176i0 = d77;
        }
        if ((536870912 & i15) == 0) {
            this.f19178j0 = null;
        } else {
            this.f19178j0 = d78;
        }
        if ((1073741824 & i15) == 0) {
            this.f19180k0 = null;
        } else {
            this.f19180k0 = d79;
        }
        if ((Integer.MIN_VALUE & i15) == 0) {
            this.f19182l0 = null;
        } else {
            this.f19182l0 = d84;
        }
        if ((i16 & 1) == 0) {
            this.f19184m0 = null;
        } else {
            this.f19184m0 = num3;
        }
        if ((i16 & 2) == 0) {
            this.f19186n0 = null;
        } else {
            this.f19186n0 = num4;
        }
        if ((i16 & 4) == 0) {
            this.f19188o0 = null;
        } else {
            this.f19188o0 = d85;
        }
        if ((i16 & 8) == 0) {
            this.f19190p0 = null;
        } else {
            this.f19190p0 = d86;
        }
        if ((i16 & 16) == 0) {
            this.f19192q0 = null;
        } else {
            this.f19192q0 = d87;
        }
        if ((i16 & 32) == 0) {
            this.f19194r0 = null;
        } else {
            this.f19194r0 = d88;
        }
        if ((i16 & 64) == 0) {
            this.f19196s0 = null;
        } else {
            this.f19196s0 = d89;
        }
        if ((i16 & 128) == 0) {
            this.f19198t0 = null;
        } else {
            this.f19198t0 = d93;
        }
        if ((i16 & 256) == 0) {
            this.f19200u0 = null;
        } else {
            this.f19200u0 = d94;
        }
        if ((i16 & 512) == 0) {
            this.f19202v0 = null;
        } else {
            this.f19202v0 = d95;
        }
        if ((i16 & 1024) == 0) {
            this.f19204w0 = null;
        } else {
            this.f19204w0 = list2;
        }
        if ((i16 & 2048) == 0) {
            this.f19206x0 = null;
        } else {
            this.f19206x0 = d96;
        }
        if ((i16 & 4096) == 0) {
            this.f19208y0 = null;
        } else {
            this.f19208y0 = d97;
        }
        if ((i16 & 8192) == 0) {
            this.f19210z0 = null;
        } else {
            this.f19210z0 = d98;
        }
        if ((i16 & 16384) == 0) {
            this.A0 = null;
        } else {
            this.A0 = d99;
        }
        if ((i16 & 32768) == 0) {
            this.B0 = null;
        } else {
            this.B0 = d100;
        }
        if ((i16 & 65536) == 0) {
            this.C0 = null;
        } else {
            this.C0 = d101;
        }
        if ((i16 & 131072) == 0) {
            this.D0 = null;
        } else {
            this.D0 = d102;
        }
        if ((i16 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) == 0) {
            this.E0 = null;
        } else {
            this.E0 = d103;
        }
        if ((i16 & 524288) == 0) {
            this.F0 = null;
        } else {
            this.F0 = d104;
        }
        if ((i16 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 0) {
            this.G0 = null;
        } else {
            this.G0 = d105;
        }
        if ((2097152 & i16) == 0) {
            this.H0 = null;
        } else {
            this.H0 = d106;
        }
        if ((4194304 & i16) == 0) {
            this.I0 = null;
        } else {
            this.I0 = str6;
        }
        if ((8388608 & i16) == 0) {
            this.J0 = null;
        } else {
            this.J0 = d107;
        }
        if ((16777216 & i16) == 0) {
            this.K0 = null;
        } else {
            this.K0 = bool5;
        }
        if ((33554432 & i16) == 0) {
            this.L0 = null;
        } else {
            this.L0 = list3;
        }
        if ((67108864 & i16) == 0) {
            this.M0 = null;
        } else {
            this.M0 = bool6;
        }
        if ((134217728 & i16) == 0) {
            this.N0 = null;
        } else {
            this.N0 = str7;
        }
        if ((268435456 & i16) == 0) {
            this.O0 = null;
        } else {
            this.O0 = d108;
        }
    }

    public l(Long l14, String str, String str2, String str3, e eVar, g gVar, Boolean bool, Boolean bool2, Boolean bool3, Long l15, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Long l16, String str4, Double d28, Double d29, Double d34, Double d35, Double d36, Double d37, Double d38, Double d39, Long l17, String str5, List<String> list, bo.a aVar, Double d44, Double d45, Double d46, Double d47, Double d48, Double d49, Double d54, Double d55, Double d56, Double d57, Double d58, Double d59, Double d64, Double d65, Long l18, Double d66, Double d67, Double d68, Double d69, Double d74, Double d75, Boolean bool4, o oVar, Integer num, Double d76, Integer num2, Double d77, Double d78, Double d79, Double d84, Integer num3, Integer num4, Double d85, Double d86, Double d87, Double d88, Double d89, Double d93, Double d94, Double d95, List<j> list2, Double d96, Double d97, Double d98, Double d99, Double d100, Double d101, Double d102, Double d103, Double d104, Double d105, Double d106, String str6, Double d107, Boolean bool5, List<Long> list3, Boolean bool6, String str7, Double d108) {
        this.f19159a = l14;
        this.f19161b = str;
        this.f19163c = str2;
        this.f19165d = str3;
        this.f19167e = eVar;
        this.f19169f = gVar;
        this.f19171g = bool;
        this.f19173h = bool2;
        this.f19175i = bool3;
        this.f19177j = l15;
        this.f19179k = d14;
        this.f19181l = d15;
        this.f19183m = d16;
        this.f19185n = d17;
        this.f19187o = d18;
        this.f19189p = d19;
        this.f19191q = d24;
        this.f19193r = d25;
        this.f19195s = d26;
        this.f19197t = d27;
        this.f19199u = l16;
        this.f19201v = str4;
        this.f19203w = d28;
        this.f19205x = d29;
        this.f19207y = d34;
        this.f19209z = d35;
        this.A = d36;
        this.B = d37;
        this.C = d38;
        this.D = d39;
        this.E = l17;
        this.F = str5;
        this.G = list;
        this.H = aVar;
        this.I = d44;
        this.J = d45;
        this.K = d46;
        this.L = d47;
        this.M = d48;
        this.N = d49;
        this.O = d54;
        this.P = d55;
        this.Q = d56;
        this.R = d57;
        this.S = d58;
        this.T = d59;
        this.U = d64;
        this.V = d65;
        this.W = l18;
        this.X = d66;
        this.Y = d67;
        this.Z = d68;
        this.f19160a0 = d69;
        this.f19162b0 = d74;
        this.f19164c0 = d75;
        this.f19166d0 = bool4;
        this.f19168e0 = oVar;
        this.f19170f0 = num;
        this.f19172g0 = d76;
        this.f19174h0 = num2;
        this.f19176i0 = d77;
        this.f19178j0 = d78;
        this.f19180k0 = d79;
        this.f19182l0 = d84;
        this.f19184m0 = num3;
        this.f19186n0 = num4;
        this.f19188o0 = d85;
        this.f19190p0 = d86;
        this.f19192q0 = d87;
        this.f19194r0 = d88;
        this.f19196s0 = d89;
        this.f19198t0 = d93;
        this.f19200u0 = d94;
        this.f19202v0 = d95;
        this.f19204w0 = list2;
        this.f19206x0 = d96;
        this.f19208y0 = d97;
        this.f19210z0 = d98;
        this.A0 = d99;
        this.B0 = d100;
        this.C0 = d101;
        this.D0 = d102;
        this.E0 = d103;
        this.F0 = d104;
        this.G0 = d105;
        this.H0 = d106;
        this.I0 = str6;
        this.J0 = d107;
        this.K0 = bool5;
        this.L0 = list3;
        this.M0 = bool6;
        this.N0 = str7;
        this.O0 = d108;
    }

    public l() {
        this((Long) null, (String) null, (String) null, (String) null, (e) null, (g) null, (Boolean) null, (Boolean) null, (Boolean) null, (Long) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Long) null, (String) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Long) null, (String) null, (List) null, (bo.a) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Long) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Boolean) null, (o) null, (Integer) null, (Double) null, (Integer) null, (Double) null, (Double) null, (Double) null, (Double) null, (Integer) null, (Integer) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (List) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (Double) null, (String) null, (Double) null, (Boolean) null, (List) null, (Boolean) null, (String) null, (Double) null, -1, -1, 536870911, (p005kotlin.jvm.internal.j) null);
    }
}
