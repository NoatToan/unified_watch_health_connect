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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u0016\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001f"}, d2 = {"Ltt/o;", "", "", "totalPushes", "totalPushDistance", "marathonCount", "", "monthlyPushes", "Lorg/joda/time/DateTime;", "mostPushDate", "mostDailyPushes", "longestPushGoalDayCount", "longestPushGoalStartDate", "longestPushGoalEndDate", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/Integer;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "a", "Ljava/lang/Integer;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/Integer;", "b", "h", "c", "d", "Ljava/util/List;", JWKParameterNames.RSA_EXPONENT, "()Ljava/util/List;", "Lorg/joda/time/DateTime;", "g", "()Lorg/joda/time/DateTime;", "f", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalPushes")
    private final Integer totalPushes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalPushDistance")
    private final Integer totalPushDistance;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("marathonCount")
    private final Integer marathonCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("monthlyPushes")
    private final List<Integer> monthlyPushes;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mostPushDate")
    @JsonAdapter(YearMonthDayDateTimeJsonAdapter.class)
    private final DateTime mostPushDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mostDailyPushes")
    private final Integer mostDailyPushes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("longestPushGoalDayCount")
    private final Integer longestPushGoalDayCount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("longestPushGoalStartDate")
    @JsonAdapter(YearMonthDayDateTimeJsonAdapter.class)
    private final DateTime longestPushGoalStartDate;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("longestPushGoalEndDate")
    @JsonAdapter(YearMonthDayDateTimeJsonAdapter.class)
    private final DateTime longestPushGoalEndDate;

    public o(Integer num, Integer num2, Integer num3, List<Integer> list, DateTime dateTime, Integer num4, Integer num5, DateTime dateTime2, DateTime dateTime3) {
        this.totalPushes = num;
        this.totalPushDistance = num2;
        this.marathonCount = num3;
        this.monthlyPushes = list;
        this.mostPushDate = dateTime;
        this.mostDailyPushes = num4;
        this.longestPushGoalDayCount = num5;
        this.longestPushGoalStartDate = dateTime2;
        this.longestPushGoalEndDate = dateTime3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getLongestPushGoalDayCount() {
        return this.longestPushGoalDayCount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DateTime getLongestPushGoalEndDate() {
        return this.longestPushGoalEndDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final DateTime getLongestPushGoalStartDate() {
        return this.longestPushGoalStartDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getMarathonCount() {
        return this.marathonCount;
    }

    public final List<Integer> e() {
        return this.monthlyPushes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return s.g(this.totalPushes, oVar.totalPushes) && s.g(this.totalPushDistance, oVar.totalPushDistance) && s.g(this.marathonCount, oVar.marathonCount) && s.g(this.monthlyPushes, oVar.monthlyPushes) && s.g(this.mostPushDate, oVar.mostPushDate) && s.g(this.mostDailyPushes, oVar.mostDailyPushes) && s.g(this.longestPushGoalDayCount, oVar.longestPushGoalDayCount) && s.g(this.longestPushGoalStartDate, oVar.longestPushGoalStartDate) && s.g(this.longestPushGoalEndDate, oVar.longestPushGoalEndDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getMostDailyPushes() {
        return this.mostDailyPushes;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final DateTime getMostPushDate() {
        return this.mostPushDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getTotalPushDistance() {
        return this.totalPushDistance;
    }

    public final int hashCode() {
        Integer num = this.totalPushes;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.totalPushDistance;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.marathonCount;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<Integer> list = this.monthlyPushes;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        DateTime dateTime = this.mostPushDate;
        int iHashCode5 = (iHashCode4 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Integer num4 = this.mostDailyPushes;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.longestPushGoalDayCount;
        int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        DateTime dateTime2 = this.longestPushGoalStartDate;
        int iHashCode8 = (iHashCode7 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.longestPushGoalEndDate;
        return iHashCode8 + (dateTime3 != null ? dateTime3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getTotalPushes() {
        return this.totalPushes;
    }

    public final String toString() {
        Integer num = this.totalPushes;
        Integer num2 = this.totalPushDistance;
        Integer num3 = this.marathonCount;
        List<Integer> list = this.monthlyPushes;
        DateTime dateTime = this.mostPushDate;
        Integer num4 = this.mostDailyPushes;
        Integer num5 = this.longestPushGoalDayCount;
        DateTime dateTime2 = this.longestPushGoalStartDate;
        DateTime dateTime3 = this.longestPushGoalEndDate;
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(num, "PushesData(totalPushes=", ", totalPushDistance=", ", marathonCount=", num2);
        sbL.append(num3);
        sbL.append(", monthlyPushes=");
        sbL.append(list);
        sbL.append(", mostPushDate=");
        sbL.append(dateTime);
        sbL.append(", mostDailyPushes=");
        sbL.append(num4);
        sbL.append(", longestPushGoalDayCount=");
        sbL.append(num5);
        sbL.append(", longestPushGoalStartDate=");
        sbL.append(dateTime2);
        sbL.append(", longestPushGoalEndDate=");
        sbL.append(dateTime3);
        sbL.append(")");
        return sbL.toString();
    }
}
