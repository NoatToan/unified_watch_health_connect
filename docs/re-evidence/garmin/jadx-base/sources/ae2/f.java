package ae2;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.library.livetrack.data.typeadapters.ElevationSourceAdapter;
import com.garmin.android.library.livetrack.data.typeadapters.GcsDateTimeAdapter;
import com.garmin.android.library.livetrack.data.typeadapters.LtActivityTypeAdapter;
import com.garmin.android.library.livetrack.data.typeadapters.LtEventTypeListAdapter;
import com.garmin.android.library.livetrack.data.typeadapters.PointStatusAdapter;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bE\b\u0080\b\u0018\u00002\u00020\u0001:\u0002 $Bé\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b$\u0010(R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b)\u0010-R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b \u00104\"\u0004\b.\u00105R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010!\u001a\u0004\b7\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010!\u001a\u0004\b9\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010!\u001a\u0004\b;\u0010#R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\b2\u0010DR\u001a\u0010\u0014\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010/\u001a\u0004\bF\u00101R\u001a\u0010\u0015\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010/\u001a\u0004\bH\u00101R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010!\u001a\u0004\bR\u0010#R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010!\u001a\u0004\bT\u0010#R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010!\u001a\u0004\bV\u0010#R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010!\u001a\u0004\bX\u0010#R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010!\u001a\u0004\bZ\u0010#¨\u0006["}, d2 = {"Lae2/f;", "", "", "accumulatedPowerWatts", "Lorg/joda/time/DateTime;", "activityCreatedTime", "Lae2/r;", "activityType", "", "cadenceCyclesPerMin", "", "deviceId", "distanceMeters", "durationSecs", "elevationGainMeters", "Lae2/f$a;", "elevationSource", "", "Lae2/t;", "eventTypes", "heartRateBeatsPerMin", "leftRightBalance", "Lae2/f$b;", "pointStatus", "powerWatts", "speedMetersPerSec", "timeToDestinationSecs", "totalDistanceMeters", "totalDurationSecs", "totalElevationGainMeters", "<init>", "(Ljava/lang/Double;Lorg/joda/time/DateTime;Lae2/r;ILjava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lae2/f$a;Ljava/util/List;IILae2/f$b;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "a", "Ljava/lang/Double;", "getAccumulatedPowerWatts", "()Ljava/lang/Double;", "b", "Lorg/joda/time/DateTime;", "getActivityCreatedTime", "()Lorg/joda/time/DateTime;", "(Lorg/joda/time/DateTime;)V", "c", "Lae2/r;", "getActivityType", "()Lae2/r;", "(Lae2/r;)V", "d", "I", "getCadenceCyclesPerMin", "()I", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Long;", "()Ljava/lang/Long;", "(Ljava/lang/Long;)V", "f", "getDistanceMeters", "g", "getDurationSecs", "h", "getElevationGainMeters", IntegerTokenConverter.CONVERTER_KEY, "Lae2/f$a;", "getElevationSource", "()Lae2/f$a;", "j", "Ljava/util/List;", "getEventTypes", "()Ljava/util/List;", "(Ljava/util/List;)V", JWKParameterNames.OCT_KEY_VALUE, "getHeartRateBeatsPerMin", "l", "getLeftRightBalance", "m", "Lae2/f$b;", "getPointStatus", "()Lae2/f$b;", JWKParameterNames.RSA_MODULUS, "D", "getPowerWatts", "()D", "o", "getSpeedMetersPerSec", "p", "getTimeToDestinationSecs", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "getTotalDistanceMeters", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "getTotalDurationSecs", "s", "getTotalElevationGainMeters", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("accumulatedPowerWatts")
    private final Double accumulatedPowerWatts;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityCreatedTime")
    @JsonAdapter(GcsDateTimeAdapter.class)
    private DateTime activityCreatedTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityType")
    @JsonAdapter(LtActivityTypeAdapter.class)
    private r activityType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cadenceCyclesPerMin")
    private final int cadenceCyclesPerMin;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private Long deviceId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distanceMeters")
    private final Double distanceMeters;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("durationSecs")
    private final Double durationSecs;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevationGainMeters")
    private final Double elevationGainMeters;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevationSource")
    @JsonAdapter(ElevationSourceAdapter.class)
    private final a elevationSource;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventTypes")
    @JsonAdapter(LtEventTypeListAdapter.class)
    private List<t> eventTypes;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("heartRateBeatsPerMin")
    private final int heartRateBeatsPerMin;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("leftRightBalance")
    private final int leftRightBalance;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pointStatus")
    @JsonAdapter(PointStatusAdapter.class)
    private final b pointStatus;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("powerWatts")
    private final double powerWatts;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("speedMetersPerSec")
    private final Double speedMetersPerSec;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timeToDestinationSecs")
    private final Double timeToDestinationSecs;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalDistanceMeters")
    private final Double totalDistanceMeters;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalDurationSecs")
    private final Double totalDurationSecs;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalElevationGainMeters")
    private final Double totalElevationGainMeters;

    public /* synthetic */ f(Double d14, DateTime dateTime, r rVar, int i14, Long l14, Double d15, Double d16, Double d17, a aVar, List list, int i15, int i16, b bVar, double d18, Double d19, Double d24, Double d25, Double d26, Double d27, int i17, p005kotlin.jvm.internal.j jVar) {
        this((i17 & 1) != 0 ? null : d14, (i17 & 2) != 0 ? null : dateTime, (i17 & 4) != 0 ? null : rVar, (i17 & 8) != 0 ? -1 : i14, (i17 & 16) != 0 ? null : l14, (i17 & 32) != 0 ? null : d15, (i17 & 64) != 0 ? null : d16, (i17 & 128) != 0 ? null : d17, (i17 & 256) != 0 ? null : aVar, (i17 & 512) != 0 ? null : list, (i17 & 1024) != 0 ? 0 : i15, (i17 & 2048) == 0 ? i16 : -1, (i17 & 4096) != 0 ? null : bVar, (i17 & 8192) != 0 ? -1.0d : d18, (i17 & 16384) != 0 ? null : d19, (i17 & 32768) != 0 ? null : d24, (i17 & 65536) != 0 ? null : d25, (i17 & 131072) != 0 ? null : d26, (i17 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : d27);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getDeviceId() {
        return this.deviceId;
    }

    public final void b(DateTime dateTime) {
        this.activityCreatedTime = dateTime;
    }

    public final void c(r rVar) {
        this.activityType = rVar;
    }

    public final void d(Long l14) {
        this.deviceId = l14;
    }

    public final void e(List<t> list) {
        this.eventTypes = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p005kotlin.jvm.internal.s.g(this.accumulatedPowerWatts, fVar.accumulatedPowerWatts) && p005kotlin.jvm.internal.s.g(this.activityCreatedTime, fVar.activityCreatedTime) && p005kotlin.jvm.internal.s.g(this.activityType, fVar.activityType) && this.cadenceCyclesPerMin == fVar.cadenceCyclesPerMin && p005kotlin.jvm.internal.s.g(this.deviceId, fVar.deviceId) && p005kotlin.jvm.internal.s.g(this.distanceMeters, fVar.distanceMeters) && p005kotlin.jvm.internal.s.g(this.durationSecs, fVar.durationSecs) && p005kotlin.jvm.internal.s.g(this.elevationGainMeters, fVar.elevationGainMeters) && p005kotlin.jvm.internal.s.g(this.elevationSource, fVar.elevationSource) && p005kotlin.jvm.internal.s.g(this.eventTypes, fVar.eventTypes) && this.heartRateBeatsPerMin == fVar.heartRateBeatsPerMin && this.leftRightBalance == fVar.leftRightBalance && p005kotlin.jvm.internal.s.g(this.pointStatus, fVar.pointStatus) && Double.compare(this.powerWatts, fVar.powerWatts) == 0 && p005kotlin.jvm.internal.s.g(this.speedMetersPerSec, fVar.speedMetersPerSec) && p005kotlin.jvm.internal.s.g(this.timeToDestinationSecs, fVar.timeToDestinationSecs) && p005kotlin.jvm.internal.s.g(this.totalDistanceMeters, fVar.totalDistanceMeters) && p005kotlin.jvm.internal.s.g(this.totalDurationSecs, fVar.totalDurationSecs) && p005kotlin.jvm.internal.s.g(this.totalElevationGainMeters, fVar.totalElevationGainMeters);
    }

    public final int hashCode() {
        Double d14 = this.accumulatedPowerWatts;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        DateTime dateTime = this.activityCreatedTime;
        int iHashCode2 = (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        r rVar = this.activityType;
        int iD = q2.d(this.cadenceCyclesPerMin, (iHashCode2 + (rVar == null ? 0 : rVar.hashCode())) * 31, 31);
        Long l14 = this.deviceId;
        int iHashCode3 = (iD + (l14 == null ? 0 : l14.hashCode())) * 31;
        Double d15 = this.distanceMeters;
        int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.durationSecs;
        int iHashCode5 = (iHashCode4 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.elevationGainMeters;
        int iHashCode6 = (iHashCode5 + (d17 == null ? 0 : d17.hashCode())) * 31;
        a aVar = this.elevationSource;
        int iHashCode7 = (iHashCode6 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List<t> list = this.eventTypes;
        int iD2 = q2.d(this.leftRightBalance, q2.d(this.heartRateBeatsPerMin, (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31, 31), 31);
        b bVar = this.pointStatus;
        int iB = org.apache.commons.lang3.e.b((iD2 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.powerWatts);
        Double d18 = this.speedMetersPerSec;
        int iHashCode8 = (iB + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.timeToDestinationSecs;
        int iHashCode9 = (iHashCode8 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.totalDistanceMeters;
        int iHashCode10 = (iHashCode9 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.totalDurationSecs;
        int iHashCode11 = (iHashCode10 + (d25 == null ? 0 : d25.hashCode())) * 31;
        Double d26 = this.totalElevationGainMeters;
        return iHashCode11 + (d26 != null ? d26.hashCode() : 0);
    }

    public final String toString() {
        Double d14 = this.accumulatedPowerWatts;
        DateTime dateTime = this.activityCreatedTime;
        r rVar = this.activityType;
        int i14 = this.cadenceCyclesPerMin;
        Long l14 = this.deviceId;
        Double d15 = this.distanceMeters;
        Double d16 = this.durationSecs;
        Double d17 = this.elevationGainMeters;
        a aVar = this.elevationSource;
        List<t> list = this.eventTypes;
        int i15 = this.heartRateBeatsPerMin;
        int i16 = this.leftRightBalance;
        b bVar = this.pointStatus;
        double d18 = this.powerWatts;
        Double d19 = this.speedMetersPerSec;
        Double d24 = this.timeToDestinationSecs;
        Double d25 = this.totalDistanceMeters;
        Double d26 = this.totalDurationSecs;
        Double d27 = this.totalElevationGainMeters;
        StringBuilder sb3 = new StringBuilder("FitnessPointData(accumulatedPowerWatts=");
        sb3.append(d14);
        sb3.append(", activityCreatedTime=");
        sb3.append(dateTime);
        sb3.append(", activityType=");
        sb3.append(rVar);
        sb3.append(", cadenceCyclesPerMin=");
        sb3.append(i14);
        sb3.append(", deviceId=");
        sb3.append(l14);
        sb3.append(", distanceMeters=");
        sb3.append(d15);
        sb3.append(", durationSecs=");
        b71.i.p(d16, d17, ", elevationGainMeters=", ", elevationSource=", sb3);
        sb3.append(aVar);
        sb3.append(", eventTypes=");
        sb3.append(list);
        sb3.append(", heartRateBeatsPerMin=");
        ds.e0.m(i15, i16, ", leftRightBalance=", ", pointStatus=", sb3);
        sb3.append(bVar);
        sb3.append(", powerWatts=");
        sb3.append(d18);
        sn.a.p(d19, d24, ", speedMetersPerSec=", ", timeToDestinationSecs=", sb3);
        sn.a.p(d25, d26, ", totalDistanceMeters=", ", totalDurationSecs=", sb3);
        sb3.append(", totalElevationGainMeters=");
        sb3.append(d27);
        sb3.append(")");
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lae2/f$a;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;)V", "a", "c", "b", "Lae2/f$a$a;", "Lae2/f$a$c;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f2857b = new b(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2858a;

        /* JADX INFO: renamed from: ae2.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/f$a$a;", "Lae2/f$a;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0043a extends a {
            public C0043a() {
                super("BAROMETRIC", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/f$a$c;", "Lae2/f$a;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c extends a {
            public c() {
                super("GPS", null);
            }
        }

        private a(String str) {
            this.f2858a = str;
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lae2/f$a$b;", "", "<init>", "()V", "", "BAROMETRIC", "Ljava/lang/String;", "GPS", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b {
            public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private b() {
            }
        }

        public /* synthetic */ a(String str, p005kotlin.jvm.internal.j jVar) {
            this(str);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Lae2/f$b;", "", "", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;)V", "c", "d", "b", "a", "Lae2/f$b$b;", "Lae2/f$b$c;", "Lae2/f$b$d;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f2859b = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2860a;

        /* JADX INFO: renamed from: ae2.f$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/f$b$b;", "Lae2/f$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0044b extends b {
            public C0044b() {
                super("DISCONNECTED", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/f$b$c;", "Lae2/f$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c extends b {
            public c() {
                super("MOVING", null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lae2/f$b$d;", "Lae2/f$b;", "<init>", "()V", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class d extends b {
            public d() {
                super("STATIONARY", null);
            }
        }

        private b(String str) {
            this.f2860a = str;
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lae2/f$b$a;", "", "<init>", "()V", "", "MOVING", "Ljava/lang/String;", "STATIONARY", "DISCONNECTED", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            private a() {
            }
        }

        public /* synthetic */ b(String str, p005kotlin.jvm.internal.j jVar) {
            this(str);
        }
    }

    public f(Double d14, DateTime dateTime, r rVar, int i14, Long l14, Double d15, Double d16, Double d17, a aVar, List<t> list, int i15, int i16, b bVar, double d18, Double d19, Double d24, Double d25, Double d26, Double d27) {
        this.accumulatedPowerWatts = d14;
        this.activityCreatedTime = dateTime;
        this.activityType = rVar;
        this.cadenceCyclesPerMin = i14;
        this.deviceId = l14;
        this.distanceMeters = d15;
        this.durationSecs = d16;
        this.elevationGainMeters = d17;
        this.elevationSource = aVar;
        this.eventTypes = list;
        this.heartRateBeatsPerMin = i15;
        this.leftRightBalance = i16;
        this.pointStatus = bVar;
        this.powerWatts = d18;
        this.speedMetersPerSec = d19;
        this.timeToDestinationSecs = d24;
        this.totalDistanceMeters = d25;
        this.totalDurationSecs = d26;
        this.totalElevationGainMeters = d27;
    }

    public f() {
        this(null, null, null, 0, null, null, null, null, null, null, 0, 0, null, 0.0d, null, null, null, null, null, 524287, null);
    }
}
