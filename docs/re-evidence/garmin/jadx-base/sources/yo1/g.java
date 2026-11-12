package yo1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import ps.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\bA\b\u0087\b\u0018\u00002\u00020\u0001BÙ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u001f\u001a\u0004\b/\u0010!R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b0\u00109R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b.\u00109R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u00109R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u00107\u001a\u0004\b(\u00109R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u00107\u001a\u0004\b@\u00109R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u00107\u001a\u0004\b\"\u00109R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u00107\u001a\u0004\bC\u00109R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u00107\u001a\u0004\b,\u00109R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u00107\u001a\u0004\bF\u00109R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u00107\u001a\u0004\bH\u00109R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u00107\u001a\u0004\bJ\u00109R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N¨\u0006O"}, d2 = {"Lyo1/g;", "Landroid/os/Parcelable;", "", "groupRideUUID", "", "userProfilePk", "deviceId", "startTimeLocal", "endTimeLocal", "startTimeGMT", "endTimeGMT", "", "completed", "didNotFinish", "", "distance", "duration", "averageSpeed", "maxSpeed", "averageHR", "maxHR", "averageBikeCadence", "maxBikeCadence", "averagePower", "maxPower", "elevationGain", "elevationLoss", "competitionId", "<init>", "(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;)V", "a", "Ljava/lang/String;", "getGroupRideUUID", "()Ljava/lang/String;", "b", "J", "getUserProfilePk", "()J", "c", "getDeviceId", "d", "getStartTimeLocal", JWKParameterNames.RSA_EXPONENT, "getEndTimeLocal", "f", "getStartTimeGMT", "g", "getEndTimeGMT", "h", "Z", "getCompleted", "()Z", IntegerTokenConverter.CONVERTER_KEY, "getDidNotFinish", "j", "Ljava/lang/Double;", "getDistance", "()Ljava/lang/Double;", JWKParameterNames.OCT_KEY_VALUE, "l", "m", "getMaxSpeed", JWKParameterNames.RSA_MODULUS, "o", "getMaxHR", "p", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "getMaxBikeCadence", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "getMaxPower", "v", "getElevationGain", "w", "getElevationLoss", "x", "Ljava/lang/Long;", "getCompetitionId", "()Ljava/lang/Long;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupRideUUID")
    private final String groupRideUUID;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private final long userProfilePk;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final long deviceId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimeLocal")
    private final String startTimeLocal;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endTimeLocal")
    private final String endTimeLocal;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimeGMT")
    private final String startTimeGMT;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endTimeGMT")
    private final String endTimeGMT;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("completed")
    private final boolean completed;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("didNotFinish")
    private final boolean didNotFinish;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distance")
    private final Double distance;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("duration")
    private final Double duration;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageSpeed")
    private final Double averageSpeed;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxSpeed")
    private final Double maxSpeed;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageHR")
    private final Double averageHR;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxHR")
    private final Double maxHR;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageBikeCadence")
    private final Double averageBikeCadence;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxBikeCadence")
    private final Double maxBikeCadence;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averagePower")
    private final Double averagePower;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxPower")
    private final Double maxPower;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevationGain")
    private final Double elevationGain;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevationLoss")
    private final Double elevationLoss;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("competitionId")
    private final Long competitionId;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new g(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public g(String str, long j8, long j14, String str2, String str3, String str4, String str5, boolean z14, boolean z15, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, Double d27, Double d28, Double d29, Long l14) {
        str.getClass();
        this.groupRideUUID = str;
        this.userProfilePk = j8;
        this.deviceId = j14;
        this.startTimeLocal = str2;
        this.endTimeLocal = str3;
        this.startTimeGMT = str4;
        this.endTimeGMT = str5;
        this.completed = z14;
        this.didNotFinish = z15;
        this.distance = d14;
        this.duration = d15;
        this.averageSpeed = d16;
        this.maxSpeed = d17;
        this.averageHR = d18;
        this.maxHR = d19;
        this.averageBikeCadence = d24;
        this.maxBikeCadence = d25;
        this.averagePower = d26;
        this.maxPower = d27;
        this.elevationGain = d28;
        this.elevationLoss = d29;
        this.competitionId = l14;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getAverageBikeCadence() {
        return this.averageBikeCadence;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getAverageHR() {
        return this.averageHR;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.groupRideUUID, gVar.groupRideUUID) && this.userProfilePk == gVar.userProfilePk && this.deviceId == gVar.deviceId && s.g(this.startTimeLocal, gVar.startTimeLocal) && s.g(this.endTimeLocal, gVar.endTimeLocal) && s.g(this.startTimeGMT, gVar.startTimeGMT) && s.g(this.endTimeGMT, gVar.endTimeGMT) && this.completed == gVar.completed && this.didNotFinish == gVar.didNotFinish && s.g(this.distance, gVar.distance) && s.g(this.duration, gVar.duration) && s.g(this.averageSpeed, gVar.averageSpeed) && s.g(this.maxSpeed, gVar.maxSpeed) && s.g(this.averageHR, gVar.averageHR) && s.g(this.maxHR, gVar.maxHR) && s.g(this.averageBikeCadence, gVar.averageBikeCadence) && s.g(this.maxBikeCadence, gVar.maxBikeCadence) && s.g(this.averagePower, gVar.averagePower) && s.g(this.maxPower, gVar.maxPower) && s.g(this.elevationGain, gVar.elevationGain) && s.g(this.elevationLoss, gVar.elevationLoss) && s.g(this.competitionId, gVar.competitionId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getAveragePower() {
        return this.averagePower;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getAverageSpeed() {
        return this.averageSpeed;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Double getDuration() {
        return this.duration;
    }

    public final int hashCode() {
        int iE = q6.f.e(q6.f.e(this.groupRideUUID.hashCode() * 31, 31, this.userProfilePk), 31, this.deviceId);
        String str = this.startTimeLocal;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.endTimeLocal;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.startTimeGMT;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.endTimeGMT;
        int iG = q6.f.g(q6.f.g((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.completed), 31, this.didNotFinish);
        Double d14 = this.distance;
        int iHashCode4 = (iG + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.duration;
        int iHashCode5 = (iHashCode4 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.averageSpeed;
        int iHashCode6 = (iHashCode5 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.maxSpeed;
        int iHashCode7 = (iHashCode6 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.averageHR;
        int iHashCode8 = (iHashCode7 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.maxHR;
        int iHashCode9 = (iHashCode8 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.averageBikeCadence;
        int iHashCode10 = (iHashCode9 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.maxBikeCadence;
        int iHashCode11 = (iHashCode10 + (d25 == null ? 0 : d25.hashCode())) * 31;
        Double d26 = this.averagePower;
        int iHashCode12 = (iHashCode11 + (d26 == null ? 0 : d26.hashCode())) * 31;
        Double d27 = this.maxPower;
        int iHashCode13 = (iHashCode12 + (d27 == null ? 0 : d27.hashCode())) * 31;
        Double d28 = this.elevationGain;
        int iHashCode14 = (iHashCode13 + (d28 == null ? 0 : d28.hashCode())) * 31;
        Double d29 = this.elevationLoss;
        int iHashCode15 = (iHashCode14 + (d29 == null ? 0 : d29.hashCode())) * 31;
        Long l14 = this.competitionId;
        return iHashCode15 + (l14 != null ? l14.hashCode() : 0);
    }

    public final long i() {
        Double d14 = this.duration;
        return MathKt.d(d14 != null ? d14.doubleValue() : 0.0d);
    }

    public final x1 j() {
        x1 x1Var = new x1(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 2097151, null);
        x1Var.t3(g22.k.q(this.startTimeGMT, "yyyy-MM-dd'T'HH:mm:ss.S", null));
        x1Var.P2(g22.k.q(this.endTimeGMT, "yyyy-MM-dd'T'HH:mm:ss.S", null));
        x1Var.v3(g22.k.q(this.startTimeLocal, "yyyy-MM-dd'T'HH:mm:ss.S", null));
        x1Var.h2(this.averageSpeed);
        x1Var.z2(this.distance);
        x1Var.A2(this.duration);
        x1Var.g2(this.averageHR);
        x1Var.k3(this.maxHR);
        x1Var.H2(this.elevationGain);
        x1Var.J2(this.elevationLoss);
        x1Var.o3(this.maxSpeed);
        x1Var.l2(this.averagePower);
        x1Var.l3(this.maxPower);
        x1Var.k2(this.averageBikeCadence);
        x1Var.j3(this.maxBikeCadence);
        x1Var.a3(this.competitionId);
        return x1Var;
    }

    public final String toString() {
        String str = this.groupRideUUID;
        long j8 = this.userProfilePk;
        long j14 = this.deviceId;
        String str2 = this.startTimeLocal;
        String str3 = this.endTimeLocal;
        String str4 = this.startTimeGMT;
        String str5 = this.endTimeGMT;
        boolean z14 = this.completed;
        boolean z15 = this.didNotFinish;
        Double d14 = this.distance;
        Double d15 = this.duration;
        Double d16 = this.averageSpeed;
        Double d17 = this.maxSpeed;
        Double d18 = this.averageHR;
        Double d19 = this.maxHR;
        Double d24 = this.averageBikeCadence;
        Double d25 = this.maxBikeCadence;
        Double d26 = this.averagePower;
        Double d27 = this.maxPower;
        Double d28 = this.elevationGain;
        Double d29 = this.elevationLoss;
        Long l14 = this.competitionId;
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(j8, "SocialGroupRideCoreDataDTO(groupRideUUID=", str, ", userProfilePk=");
        x.j(j14, ", deviceId=", ", startTimeLocal=", sbJ);
        sn.a.t(sbJ, str2, ", endTimeLocal=", str3, ", startTimeGMT=");
        sn.a.t(sbJ, str4, ", endTimeGMT=", str5, ", completed=");
        kg.f.q(", didNotFinish=", ", distance=", sbJ, z14, z15);
        b71.i.p(d14, d15, ", duration=", ", averageSpeed=", sbJ);
        b71.i.p(d16, d17, ", maxSpeed=", ", averageHR=", sbJ);
        b71.i.p(d18, d19, ", maxHR=", ", averageBikeCadence=", sbJ);
        b71.i.p(d24, d25, ", maxBikeCadence=", ", averagePower=", sbJ);
        b71.i.p(d26, d27, ", maxPower=", ", elevationGain=", sbJ);
        b71.i.p(d28, d29, ", elevationLoss=", ", competitionId=", sbJ);
        return p6.b.g(sbJ, l14, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.groupRideUUID);
        parcel.writeLong(this.userProfilePk);
        parcel.writeLong(this.deviceId);
        parcel.writeString(this.startTimeLocal);
        parcel.writeString(this.endTimeLocal);
        parcel.writeString(this.startTimeGMT);
        parcel.writeString(this.endTimeGMT);
        parcel.writeInt(this.completed ? 1 : 0);
        parcel.writeInt(this.didNotFinish ? 1 : 0);
        Double d14 = this.distance;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.duration;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.averageSpeed;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.maxSpeed;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        Double d18 = this.averageHR;
        if (d18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d18);
        }
        Double d19 = this.maxHR;
        if (d19 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d19);
        }
        Double d24 = this.averageBikeCadence;
        if (d24 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d24);
        }
        Double d25 = this.maxBikeCadence;
        if (d25 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d25);
        }
        Double d26 = this.averagePower;
        if (d26 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d26);
        }
        Double d27 = this.maxPower;
        if (d27 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d27);
        }
        Double d28 = this.elevationGain;
        if (d28 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d28);
        }
        Double d29 = this.elevationLoss;
        if (d29 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d29);
        }
        Long l14 = this.competitionId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
    }
}
