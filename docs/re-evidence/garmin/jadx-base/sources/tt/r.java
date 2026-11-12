package tt;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.util.adapters.YearMonthDayDateTimeJsonAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u0016\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001f"}, d2 = {"Ltt/r;", "", "", "totalSteps", "totalStepDistance", "marathonCount", "", "monthlySteps", "Lorg/joda/time/DateTime;", "mostStepDate", "mostDailySteps", "longestStepGoalDayCount", "longestStepGoalStartDate", "longestStepGoalEndDate", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/Integer;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "a", "Ljava/lang/Integer;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/Integer;", "b", "h", "c", "d", "Ljava/util/List;", JWKParameterNames.RSA_EXPONENT, "()Ljava/util/List;", "Lorg/joda/time/DateTime;", "g", "()Lorg/joda/time/DateTime;", "f", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalSteps")
    private final Integer totalSteps;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalStepDistance")
    private final Integer totalStepDistance;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("marathonCount")
    private final Integer marathonCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("monthlySteps")
    private final List<Integer> monthlySteps;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mostStepDate")
    @JsonAdapter(YearMonthDayDateTimeJsonAdapter.class)
    private final DateTime mostStepDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mostDailySteps")
    private final Integer mostDailySteps;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("longestStepGoalDayCount")
    private final Integer longestStepGoalDayCount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("longestStepGoalStartDate")
    @JsonAdapter(YearMonthDayDateTimeJsonAdapter.class)
    private final DateTime longestStepGoalStartDate;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("longestStepGoalEndDate")
    @JsonAdapter(YearMonthDayDateTimeJsonAdapter.class)
    private final DateTime longestStepGoalEndDate;

    public r(Integer num, Integer num2, Integer num3, List<Integer> list, DateTime dateTime, Integer num4, Integer num5, DateTime dateTime2, DateTime dateTime3) {
        this.totalSteps = num;
        this.totalStepDistance = num2;
        this.marathonCount = num3;
        this.monthlySteps = list;
        this.mostStepDate = dateTime;
        this.mostDailySteps = num4;
        this.longestStepGoalDayCount = num5;
        this.longestStepGoalStartDate = dateTime2;
        this.longestStepGoalEndDate = dateTime3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getLongestStepGoalDayCount() {
        return this.longestStepGoalDayCount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DateTime getLongestStepGoalEndDate() {
        return this.longestStepGoalEndDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DateTime getLongestStepGoalStartDate() {
        return this.longestStepGoalStartDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getMarathonCount() {
        return this.marathonCount;
    }

    public final List<Integer> e() {
        return this.monthlySteps;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return s.g(this.totalSteps, rVar.totalSteps) && s.g(this.totalStepDistance, rVar.totalStepDistance) && s.g(this.marathonCount, rVar.marathonCount) && s.g(this.monthlySteps, rVar.monthlySteps) && s.g(this.mostStepDate, rVar.mostStepDate) && s.g(this.mostDailySteps, rVar.mostDailySteps) && s.g(this.longestStepGoalDayCount, rVar.longestStepGoalDayCount) && s.g(this.longestStepGoalStartDate, rVar.longestStepGoalStartDate) && s.g(this.longestStepGoalEndDate, rVar.longestStepGoalEndDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getMostDailySteps() {
        return this.mostDailySteps;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final DateTime getMostStepDate() {
        return this.mostStepDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getTotalStepDistance() {
        return this.totalStepDistance;
    }

    public final int hashCode() {
        Integer num = this.totalSteps;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.totalStepDistance;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.marathonCount;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<Integer> list = this.monthlySteps;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        DateTime dateTime = this.mostStepDate;
        int iHashCode5 = (iHashCode4 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Integer num4 = this.mostDailySteps;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.longestStepGoalDayCount;
        int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        DateTime dateTime2 = this.longestStepGoalStartDate;
        int iHashCode8 = (iHashCode7 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.longestStepGoalEndDate;
        return iHashCode8 + (dateTime3 != null ? dateTime3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getTotalSteps() {
        return this.totalSteps;
    }

    public final String toString() {
        Integer num = this.totalSteps;
        Integer num2 = this.totalStepDistance;
        Integer num3 = this.marathonCount;
        List<Integer> list = this.monthlySteps;
        DateTime dateTime = this.mostStepDate;
        Integer num4 = this.mostDailySteps;
        Integer num5 = this.longestStepGoalDayCount;
        DateTime dateTime2 = this.longestStepGoalStartDate;
        DateTime dateTime3 = this.longestStepGoalEndDate;
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(num, "StepsData(totalSteps=", ", totalStepDistance=", ", marathonCount=", num2);
        sbL.append(num3);
        sbL.append(", monthlySteps=");
        sbL.append(list);
        sbL.append(", mostStepDate=");
        sbL.append(dateTime);
        sbL.append(", mostDailySteps=");
        sbL.append(num4);
        sbL.append(", longestStepGoalDayCount=");
        sbL.append(num5);
        sbL.append(", longestStepGoalStartDate=");
        sbL.append(dateTime2);
        sbL.append(", longestStepGoalEndDate=");
        sbL.append(dateTime3);
        sbL.append(")");
        return sbL.toString();
    }
}
