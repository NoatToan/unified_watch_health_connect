package e12;

import b71.i;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\bP\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b(\u0010'R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010'R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b2\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010%\u001a\u0004\b4\u0010'R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010%\u001a\u0004\b6\u0010'R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b8\u0010'R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010%\u001a\u0004\b:\u0010'R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010%\u001a\u0004\b<\u0010'R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010%\u001a\u0004\b>\u0010'R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010%\u001a\u0004\b \u0010'R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010%\u001a\u0004\b$\u0010'R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010%\u001a\u0004\bB\u0010'R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010%\u001a\u0004\bD\u0010'R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010%\u001a\u0004\bF\u0010'R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010%\u001a\u0004\bH\u0010'R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010%\u001a\u0004\bJ\u0010'R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010%\u001a\u0004\bL\u0010'R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010%\u001a\u0004\bN\u0010'R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010%\u001a\u0004\bP\u0010'R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010%\u001a\u0004\b*\u0010'R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010%\u001a\u0004\bS\u0010'¨\u0006T"}, d2 = {"Le12/d;", "", "", "userProfilePK", "", "hasConsumedCalories", "hasRemainingCalories", "hasTotalSteps", "hasTotalCalories", "hasActiveCalories", "hasBmrCalories", "hasTotalStepGoal", "hasTotalDistance", "hasWellnessTotalKilocalories", "hasWellnessActiveKilocalories", "hasWellnessDistance", "hasModerateIntensityMinutes", "hasVigorousIntensityMinutes", "hasFloorsAscended", "hasFloorsDescended", "hasMinHeartRate", "hasMaxHeartRate", "hasRestingHeartRate", "hasAverageStressLevel", "hasMaxStressLevel", "hasMinAvgHeartRate", "hasMaxAvgHeartRate", "hasAbnormalHeartRateAlertsCount", "hasWheelchairPushes", "hasWheelchairPushesGoal", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "a", "Ljava/lang/Integer;", "getUserProfilePK", "()Ljava/lang/Integer;", "b", "Ljava/lang/Boolean;", "getHasConsumedCalories", "()Ljava/lang/Boolean;", "c", "getHasRemainingCalories", "d", JWKParameterNames.RSA_EXPONENT, "getHasTotalCalories", "f", "getHasActiveCalories", "g", "getHasBmrCalories", "h", "getHasTotalStepGoal", IntegerTokenConverter.CONVERTER_KEY, "getHasTotalDistance", "j", "getHasWellnessTotalKilocalories", JWKParameterNames.OCT_KEY_VALUE, "getHasWellnessActiveKilocalories", "l", "getHasWellnessDistance", "m", "getHasModerateIntensityMinutes", JWKParameterNames.RSA_MODULUS, "getHasVigorousIntensityMinutes", "o", "p", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "getHasMinHeartRate", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "getHasMaxHeartRate", "s", "getHasRestingHeartRate", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "getHasAverageStressLevel", "u", "getHasMaxStressLevel", "v", "getHasMinAvgHeartRate", "w", "getHasMaxAvgHeartRate", "x", "getHasAbnormalHeartRateAlertsCount", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "z", "getHasWheelchairPushesGoal", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePK")
    private final Integer userProfilePK;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasConsumedCalories")
    private final Boolean hasConsumedCalories;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasRemainingCalories")
    private final Boolean hasRemainingCalories;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasTotalSteps")
    private final Boolean hasTotalSteps;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasTotalCalories")
    private final Boolean hasTotalCalories;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasActiveCalories")
    private final Boolean hasActiveCalories;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasBmrCalories")
    private final Boolean hasBmrCalories;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasTotalStepGoal")
    private final Boolean hasTotalStepGoal;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasTotalDistance")
    private final Boolean hasTotalDistance;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasWellnessTotalKilocalories")
    private final Boolean hasWellnessTotalKilocalories;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasWellnessActiveKilocalories")
    private final Boolean hasWellnessActiveKilocalories;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasWellnessDistance")
    private final Boolean hasWellnessDistance;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasModerateIntensityMinutes")
    private final Boolean hasModerateIntensityMinutes;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasVigorousIntensityMinutes")
    private final Boolean hasVigorousIntensityMinutes;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasFloorsAscended")
    private final Boolean hasFloorsAscended;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasFloorsDescended")
    private final Boolean hasFloorsDescended;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasMinHeartRate")
    private final Boolean hasMinHeartRate;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasMaxHeartRate")
    private final Boolean hasMaxHeartRate;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasRestingHeartRate")
    private final Boolean hasRestingHeartRate;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasAverageStressLevel")
    private final Boolean hasAverageStressLevel;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasMaxStressLevel")
    private final Boolean hasMaxStressLevel;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasMinAvgHeartRate")
    private final Boolean hasMinAvgHeartRate;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasMaxAvgHeartRate")
    private final Boolean hasMaxAvgHeartRate;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasAbnormalHeartRateAlertsCount")
    private final Boolean hasAbnormalHeartRateAlertsCount;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasWheelchairPushes")
    private final Boolean hasWheelchairPushes;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasWheelchairPushesGoal")
    private final Boolean hasWheelchairPushesGoal;

    public d(Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, Boolean bool15, Boolean bool16, Boolean bool17, Boolean bool18, Boolean bool19, Boolean bool20, Boolean bool21, Boolean bool22, Boolean bool23, Boolean bool24, Boolean bool25) {
        this.userProfilePK = num;
        this.hasConsumedCalories = bool;
        this.hasRemainingCalories = bool2;
        this.hasTotalSteps = bool3;
        this.hasTotalCalories = bool4;
        this.hasActiveCalories = bool5;
        this.hasBmrCalories = bool6;
        this.hasTotalStepGoal = bool7;
        this.hasTotalDistance = bool8;
        this.hasWellnessTotalKilocalories = bool9;
        this.hasWellnessActiveKilocalories = bool10;
        this.hasWellnessDistance = bool11;
        this.hasModerateIntensityMinutes = bool12;
        this.hasVigorousIntensityMinutes = bool13;
        this.hasFloorsAscended = bool14;
        this.hasFloorsDescended = bool15;
        this.hasMinHeartRate = bool16;
        this.hasMaxHeartRate = bool17;
        this.hasRestingHeartRate = bool18;
        this.hasAverageStressLevel = bool19;
        this.hasMaxStressLevel = bool20;
        this.hasMinAvgHeartRate = bool21;
        this.hasMaxAvgHeartRate = bool22;
        this.hasAbnormalHeartRateAlertsCount = bool23;
        this.hasWheelchairPushes = bool24;
        this.hasWheelchairPushesGoal = bool25;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getHasFloorsAscended() {
        return this.hasFloorsAscended;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getHasFloorsDescended() {
        return this.hasFloorsDescended;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getHasTotalSteps() {
        return this.hasTotalSteps;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getHasWheelchairPushes() {
        return this.hasWheelchairPushes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.userProfilePK, dVar.userProfilePK) && s.g(this.hasConsumedCalories, dVar.hasConsumedCalories) && s.g(this.hasRemainingCalories, dVar.hasRemainingCalories) && s.g(this.hasTotalSteps, dVar.hasTotalSteps) && s.g(this.hasTotalCalories, dVar.hasTotalCalories) && s.g(this.hasActiveCalories, dVar.hasActiveCalories) && s.g(this.hasBmrCalories, dVar.hasBmrCalories) && s.g(this.hasTotalStepGoal, dVar.hasTotalStepGoal) && s.g(this.hasTotalDistance, dVar.hasTotalDistance) && s.g(this.hasWellnessTotalKilocalories, dVar.hasWellnessTotalKilocalories) && s.g(this.hasWellnessActiveKilocalories, dVar.hasWellnessActiveKilocalories) && s.g(this.hasWellnessDistance, dVar.hasWellnessDistance) && s.g(this.hasModerateIntensityMinutes, dVar.hasModerateIntensityMinutes) && s.g(this.hasVigorousIntensityMinutes, dVar.hasVigorousIntensityMinutes) && s.g(this.hasFloorsAscended, dVar.hasFloorsAscended) && s.g(this.hasFloorsDescended, dVar.hasFloorsDescended) && s.g(this.hasMinHeartRate, dVar.hasMinHeartRate) && s.g(this.hasMaxHeartRate, dVar.hasMaxHeartRate) && s.g(this.hasRestingHeartRate, dVar.hasRestingHeartRate) && s.g(this.hasAverageStressLevel, dVar.hasAverageStressLevel) && s.g(this.hasMaxStressLevel, dVar.hasMaxStressLevel) && s.g(this.hasMinAvgHeartRate, dVar.hasMinAvgHeartRate) && s.g(this.hasMaxAvgHeartRate, dVar.hasMaxAvgHeartRate) && s.g(this.hasAbnormalHeartRateAlertsCount, dVar.hasAbnormalHeartRateAlertsCount) && s.g(this.hasWheelchairPushes, dVar.hasWheelchairPushes) && s.g(this.hasWheelchairPushesGoal, dVar.hasWheelchairPushesGoal);
    }

    public final int hashCode() {
        Integer num = this.userProfilePK;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.hasConsumedCalories;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasRemainingCalories;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasTotalSteps;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.hasTotalCalories;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.hasActiveCalories;
        int iHashCode6 = (iHashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.hasBmrCalories;
        int iHashCode7 = (iHashCode6 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.hasTotalStepGoal;
        int iHashCode8 = (iHashCode7 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.hasTotalDistance;
        int iHashCode9 = (iHashCode8 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.hasWellnessTotalKilocalories;
        int iHashCode10 = (iHashCode9 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.hasWellnessActiveKilocalories;
        int iHashCode11 = (iHashCode10 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.hasWellnessDistance;
        int iHashCode12 = (iHashCode11 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.hasModerateIntensityMinutes;
        int iHashCode13 = (iHashCode12 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.hasVigorousIntensityMinutes;
        int iHashCode14 = (iHashCode13 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        Boolean bool14 = this.hasFloorsAscended;
        int iHashCode15 = (iHashCode14 + (bool14 == null ? 0 : bool14.hashCode())) * 31;
        Boolean bool15 = this.hasFloorsDescended;
        int iHashCode16 = (iHashCode15 + (bool15 == null ? 0 : bool15.hashCode())) * 31;
        Boolean bool16 = this.hasMinHeartRate;
        int iHashCode17 = (iHashCode16 + (bool16 == null ? 0 : bool16.hashCode())) * 31;
        Boolean bool17 = this.hasMaxHeartRate;
        int iHashCode18 = (iHashCode17 + (bool17 == null ? 0 : bool17.hashCode())) * 31;
        Boolean bool18 = this.hasRestingHeartRate;
        int iHashCode19 = (iHashCode18 + (bool18 == null ? 0 : bool18.hashCode())) * 31;
        Boolean bool19 = this.hasAverageStressLevel;
        int iHashCode20 = (iHashCode19 + (bool19 == null ? 0 : bool19.hashCode())) * 31;
        Boolean bool20 = this.hasMaxStressLevel;
        int iHashCode21 = (iHashCode20 + (bool20 == null ? 0 : bool20.hashCode())) * 31;
        Boolean bool21 = this.hasMinAvgHeartRate;
        int iHashCode22 = (iHashCode21 + (bool21 == null ? 0 : bool21.hashCode())) * 31;
        Boolean bool22 = this.hasMaxAvgHeartRate;
        int iHashCode23 = (iHashCode22 + (bool22 == null ? 0 : bool22.hashCode())) * 31;
        Boolean bool23 = this.hasAbnormalHeartRateAlertsCount;
        int iHashCode24 = (iHashCode23 + (bool23 == null ? 0 : bool23.hashCode())) * 31;
        Boolean bool24 = this.hasWheelchairPushes;
        int iHashCode25 = (iHashCode24 + (bool24 == null ? 0 : bool24.hashCode())) * 31;
        Boolean bool25 = this.hasWheelchairPushesGoal;
        return iHashCode25 + (bool25 != null ? bool25.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.userProfilePK;
        Boolean bool = this.hasConsumedCalories;
        Boolean bool2 = this.hasRemainingCalories;
        Boolean bool3 = this.hasTotalSteps;
        Boolean bool4 = this.hasTotalCalories;
        Boolean bool5 = this.hasActiveCalories;
        Boolean bool6 = this.hasBmrCalories;
        Boolean bool7 = this.hasTotalStepGoal;
        Boolean bool8 = this.hasTotalDistance;
        Boolean bool9 = this.hasWellnessTotalKilocalories;
        Boolean bool10 = this.hasWellnessActiveKilocalories;
        Boolean bool11 = this.hasWellnessDistance;
        Boolean bool12 = this.hasModerateIntensityMinutes;
        Boolean bool13 = this.hasVigorousIntensityMinutes;
        Boolean bool14 = this.hasFloorsAscended;
        Boolean bool15 = this.hasFloorsDescended;
        Boolean bool16 = this.hasMinHeartRate;
        Boolean bool17 = this.hasMaxHeartRate;
        Boolean bool18 = this.hasRestingHeartRate;
        Boolean bool19 = this.hasAverageStressLevel;
        Boolean bool20 = this.hasMaxStressLevel;
        Boolean bool21 = this.hasMinAvgHeartRate;
        Boolean bool22 = this.hasMaxAvgHeartRate;
        Boolean bool23 = this.hasAbnormalHeartRateAlertsCount;
        Boolean bool24 = this.hasWheelchairPushes;
        Boolean bool25 = this.hasWheelchairPushesGoal;
        StringBuilder sb3 = new StringBuilder("ReportAvailability(userProfilePK=");
        sb3.append(num);
        sb3.append(", hasConsumedCalories=");
        sb3.append(bool);
        sb3.append(", hasRemainingCalories=");
        i.o(bool2, bool3, ", hasTotalSteps=", ", hasTotalCalories=", sb3);
        i.o(bool4, bool5, ", hasActiveCalories=", ", hasBmrCalories=", sb3);
        i.o(bool6, bool7, ", hasTotalStepGoal=", ", hasTotalDistance=", sb3);
        i.o(bool8, bool9, ", hasWellnessTotalKilocalories=", ", hasWellnessActiveKilocalories=", sb3);
        i.o(bool10, bool11, ", hasWellnessDistance=", ", hasModerateIntensityMinutes=", sb3);
        i.o(bool12, bool13, ", hasVigorousIntensityMinutes=", ", hasFloorsAscended=", sb3);
        i.o(bool14, bool15, ", hasFloorsDescended=", ", hasMinHeartRate=", sb3);
        i.o(bool16, bool17, ", hasMaxHeartRate=", ", hasRestingHeartRate=", sb3);
        i.o(bool18, bool19, ", hasAverageStressLevel=", ", hasMaxStressLevel=", sb3);
        i.o(bool20, bool21, ", hasMinAvgHeartRate=", ", hasMaxAvgHeartRate=", sb3);
        i.o(bool22, bool23, ", hasAbnormalHeartRateAlertsCount=", ", hasWheelchairPushes=", sb3);
        sb3.append(bool24);
        sb3.append(", hasWheelchairPushesGoal=");
        sb3.append(bool25);
        sb3.append(")");
        return sb3.toString();
    }
}
