package zk0;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000fBW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0003\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u001f\u0010\u001aR\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u0016\u001a\u0004\b\u000f\u0010\u0018\"\u0004\b!\u0010\u001aR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\u001b\u0010$\"\u0004\b%\u0010&R\"\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010#\u001a\u0004\b\u0015\u0010$\"\u0004\b(\u0010&R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010\u0018\"\u0004\b+\u0010\u001a¨\u0006,"}, d2 = {"Lzk0/f;", "", "", "userProfilePk", "", "userGoalCategory", "userGoalType", "startDate", "endDate", "", "lowWeightGoal", "highWeightGoal", "trackingPeriodType", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;)V", "a", "J", "getUserProfilePk", "()J", "setUserProfilePk", "(J)V", "b", "Ljava/lang/String;", "getUserGoalCategory", "()Ljava/lang/String;", "setUserGoalCategory", "(Ljava/lang/String;)V", "c", "getUserGoalType", "setUserGoalType", "d", "setStartDate", JWKParameterNames.RSA_EXPONENT, "setEndDate", "f", "D", "()D", "setLowWeightGoal", "(D)V", "g", "setHighWeightGoal", "h", "getTrackingPeriodType", "setTrackingPeriodType", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private long userProfilePk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userGoalCategory")
    private String userGoalCategory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userGoalType")
    private String userGoalType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    private String startDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endDate")
    private String endDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lowWeightGoalInGrams")
    private double lowWeightGoal;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("highWeightGoalInGrams")
    private double highWeightGoal;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trackingPeriodType")
    private String trackingPeriodType;

    static {
        new a(null);
    }

    public /* synthetic */ f(long j8, String str, String str2, String str3, String str4, double d14, double d15, String str5, int i14, j jVar) {
        this((i14 & 1) != 0 ? 0L : j8, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? "" : str2, (i14 & 8) != 0 ? "" : str3, (i14 & 16) != 0 ? "" : str4, (i14 & 32) != 0 ? 0.0d : d14, (i14 & 64) != 0 ? 0.0d : d15, (i14 & 128) != 0 ? "DAILY" : str5);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getHighWeightGoal() {
        return this.highWeightGoal;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getLowWeightGoal() {
        return this.lowWeightGoal;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.userProfilePk == fVar.userProfilePk && s.g(this.userGoalCategory, fVar.userGoalCategory) && s.g(this.userGoalType, fVar.userGoalType) && s.g(this.startDate, fVar.startDate) && s.g(this.endDate, fVar.endDate) && Double.compare(this.lowWeightGoal, fVar.lowWeightGoal) == 0 && Double.compare(this.highWeightGoal, fVar.highWeightGoal) == 0 && s.g(this.trackingPeriodType, fVar.trackingPeriodType);
    }

    public final int hashCode() {
        return this.trackingPeriodType.hashCode() + org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(wr.g.j(wr.g.j(wr.g.j(wr.g.j(Long.hashCode(this.userProfilePk) * 31, 31, this.userGoalCategory), 31, this.userGoalType), 31, this.startDate), 31, this.endDate), 31, this.lowWeightGoal), 31, this.highWeightGoal);
    }

    public final String toString() {
        long j8 = this.userProfilePk;
        String str = this.userGoalCategory;
        String str2 = this.userGoalType;
        String str3 = this.startDate;
        String str4 = this.endDate;
        double d14 = this.lowWeightGoal;
        double d15 = this.highWeightGoal;
        String str5 = this.trackingPeriodType;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "UserGoalHighLowRangeDTO(userProfilePk=", ", userGoalCategory=", str);
        sn.a.t(sbK, ", userGoalType=", str2, ", startDate=", str3);
        am.j.y(sbK, ", endDate=", str4, ", lowWeightGoal=");
        sbK.append(d14);
        am.j.x(sbK, ", highWeightGoal=", d15, ", trackingPeriodType=");
        return am.j.o(str5, ")", sbK);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lzk0/f$a;", "", "<init>", "()V", "", "USER_PROFILE_PK", "Ljava/lang/String;", "USER_GOAL_CATEGORY", "USER_GOAL_TYPE", "START_DATE", "END_DATE", "LOW_WEIGHT_GOAL_IN_GRAMS", "HIGH_WEIGHT_GOAL_IN_GRAMS", "TRACKING_PERIOD_TYPE", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public f(long j8, String str, String str2, String str3, String str4, double d14, double d15, String str5) {
        hb.a.p(str, str2, str3, str4, str5);
        this.userProfilePk = j8;
        this.userGoalCategory = str;
        this.userGoalType = str2;
        this.startDate = str3;
        this.endDate = str4;
        this.lowWeightGoal = d14;
        this.highWeightGoal = d15;
        this.trackingPeriodType = str5;
    }

    public f() {
        this(0L, null, null, null, null, 0.0d, 0.0d, null, 255, null);
    }
}
