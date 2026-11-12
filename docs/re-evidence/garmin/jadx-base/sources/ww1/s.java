package ww1;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010\u0010¨\u0006!"}, d2 = {"Lww1/s;", "", "", "activityType", "name", "startLocal", "workoutType", "adaptiveCoachingWorkoutStatus", "parentId", "", "calendarEventId", "calendarEventUuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "getName", "c", "getStartLocal", "d", "getWorkoutType", JWKParameterNames.RSA_EXPONENT, "getAdaptiveCoachingWorkoutStatus", "f", "getParentId", "g", "Ljava/lang/Long;", "getCalendarEventId", "()Ljava/lang/Long;", "h", "getCalendarEventUuid", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityType")
    private final String activityType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startLocal")
    private final String startLocal;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("workoutType")
    private final String workoutType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("adaptiveCoachingWorkoutStatus")
    private final String adaptiveCoachingWorkoutStatus;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("parentId")
    private final String parentId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarEventId")
    private final Long calendarEventId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarEventUuid")
    private final String calendarEventUuid;

    public s(String str, String str2, String str3, String str4, String str5, String str6, Long l14, String str7) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.activityType = str;
        this.name = str2;
        this.startLocal = str3;
        this.workoutType = str4;
        this.adaptiveCoachingWorkoutStatus = str5;
        this.parentId = str6;
        this.calendarEventId = l14;
        this.calendarEventUuid = str7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActivityType() {
        return this.activityType;
    }

    public final DateTime b() {
        if (g22.n.d(this.startLocal)) {
            return new DateTime(this.startLocal);
        }
        return null;
    }

    public final boolean c() {
        if (!d53.u.q(this.workoutType, "ADAPTIVE_COACHING", true)) {
            return false;
        }
        vt1.b.a aVar = vt1.b.f180079b;
        String str = this.adaptiveCoachingWorkoutStatus;
        aVar.getClass();
        return vt1.b.a.a(str);
    }

    public final boolean d() {
        return (this.calendarEventUuid == null && this.calendarEventId == null) ? false : true;
    }

    public final boolean e() {
        return this.parentId == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return p005kotlin.jvm.internal.s.g(this.activityType, sVar.activityType) && p005kotlin.jvm.internal.s.g(this.name, sVar.name) && p005kotlin.jvm.internal.s.g(this.startLocal, sVar.startLocal) && p005kotlin.jvm.internal.s.g(this.workoutType, sVar.workoutType) && p005kotlin.jvm.internal.s.g(this.adaptiveCoachingWorkoutStatus, sVar.adaptiveCoachingWorkoutStatus) && p005kotlin.jvm.internal.s.g(this.parentId, sVar.parentId) && p005kotlin.jvm.internal.s.g(this.calendarEventId, sVar.calendarEventId) && p005kotlin.jvm.internal.s.g(this.calendarEventUuid, sVar.calendarEventUuid);
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(this.activityType.hashCode() * 31, 31, this.name), 31, this.startLocal);
        String str = this.workoutType;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.adaptiveCoachingWorkoutStatus;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.parentId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l14 = this.calendarEventId;
        int iHashCode4 = (iHashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str4 = this.calendarEventUuid;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.activityType;
        String str2 = this.name;
        String str3 = this.startLocal;
        String str4 = this.workoutType;
        String str5 = this.adaptiveCoachingWorkoutStatus;
        String str6 = this.parentId;
        Long l14 = this.calendarEventId;
        String str7 = this.calendarEventUuid;
        StringBuilder sbI = p6.b.i("DashboardFitnessStatsActivityDTO(activityType=", str, ", name=", str2, ", startLocal=");
        sn.a.t(sbI, str3, ", workoutType=", str4, ", adaptiveCoachingWorkoutStatus=");
        sn.a.t(sbI, str5, ", parentId=", str6, ", calendarEventId=");
        sbI.append(l14);
        sbI.append(", calendarEventUuid=");
        sbI.append(str7);
        sbI.append(")");
        return sbI.toString();
    }
}
