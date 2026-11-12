package tt;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.util.adapters.YearMonthDayDateTimeJsonAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001BÛ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b!\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010 R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010*\u001a\u0004\b1\u0010,R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b2\u0010,R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u00100R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b4\u0010,R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b%\u0010,R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010.\u001a\u0004\b'\u00100R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010*\u001a\u0004\b7\u0010,R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010\u001f\u001a\u0004\b5\u0010 R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b6\u00100R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\u001f\u001a\u0004\b9\u0010 R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\u001f\u001a\u0004\b)\u0010 R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010.\u001a\u0004\b-\u00100R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b8\u0010 ¨\u0006:"}, d2 = {"Ltt/a;", "", "", "badgeCount", "", "", "badges", "badgePoints", "prCount", "", "prTypeIdList", "", "firstFitnessAge", "Lorg/joda/time/DateTime;", "firstFitnessAgeDate", "lastFitnessAge", "firstGenericVo2Max", "firstGenericVo2MaxDate", "lastGenericVo2Max", "firstCyclingVo2Max", "firstCyclingVo2MaxDate", "lastCyclingVo2Max", "firstHillScore", "firstHillScoreDate", "lastHillScore", "firstEnduranceScore", "firstEnduranceScoreDate", "lastEnduranceScore", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Double;Lorg/joda/time/DateTime;Ljava/lang/Double;Ljava/lang/Double;Lorg/joda/time/DateTime;Ljava/lang/Double;Ljava/lang/Double;Lorg/joda/time/DateTime;Ljava/lang/Double;Ljava/lang/Integer;Lorg/joda/time/DateTime;Ljava/lang/Integer;Ljava/lang/Integer;Lorg/joda/time/DateTime;Ljava/lang/Integer;)V", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "d", "s", JWKParameterNames.RSA_EXPONENT, JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "f", "Ljava/lang/Double;", "h", "()Ljava/lang/Double;", "g", "Lorg/joda/time/DateTime;", IntegerTokenConverter.CONVERTER_KEY, "()Lorg/joda/time/DateTime;", "p", "j", JWKParameterNames.OCT_KEY_VALUE, JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "l", "m", JWKParameterNames.RSA_MODULUS, "o", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgeCount")
    private final Integer badgeCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badges")
    private final List<String> badges;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("badgePoints")
    private final Integer badgePoints;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("prCount")
    private final Integer prCount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("prTypeIdList")
    private final List<Long> prTypeIdList;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("firstFitnessAge")
    private final Double firstFitnessAge;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("firstFitnessAgeDate")
    @JsonAdapter(YearMonthDayDateTimeJsonAdapter.class)
    private final DateTime firstFitnessAgeDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastFitnessAge")
    private final Double lastFitnessAge;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("firstGenericVo2Max")
    private final Double firstGenericVo2Max;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("firstGenericVo2MaxDate")
    @JsonAdapter(YearMonthDayDateTimeJsonAdapter.class)
    private final DateTime firstGenericVo2MaxDate;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastGenericVo2Max")
    private final Double lastGenericVo2Max;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("firstCyclingVo2Max")
    private final Double firstCyclingVo2Max;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("firstCyclingVo2MaxDate")
    @JsonAdapter(YearMonthDayDateTimeJsonAdapter.class)
    private final DateTime firstCyclingVo2MaxDate;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastCyclingVo2Max")
    private final Double lastCyclingVo2Max;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("firstHillScore")
    private final Integer firstHillScore;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("firstHillScoreDate")
    @JsonAdapter(YearMonthDayDateTimeJsonAdapter.class)
    private final DateTime firstHillScoreDate;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastHillScore")
    private final Integer lastHillScore;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("firstEnduranceScore")
    private final Integer firstEnduranceScore;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @SerializedName("firstEnduranceScoreDate")
    @JsonAdapter(YearMonthDayDateTimeJsonAdapter.class)
    private final DateTime firstEnduranceScoreDate;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastEnduranceScore")
    private final Integer lastEnduranceScore;

    public a(Integer num, List<String> list, Integer num2, Integer num3, List<Long> list2, Double d14, DateTime dateTime, Double d15, Double d16, DateTime dateTime2, Double d17, Double d18, DateTime dateTime3, Double d19, Integer num4, DateTime dateTime4, Integer num5, Integer num6, DateTime dateTime5, Integer num7) {
        this.badgeCount = num;
        this.badges = list;
        this.badgePoints = num2;
        this.prCount = num3;
        this.prTypeIdList = list2;
        this.firstFitnessAge = d14;
        this.firstFitnessAgeDate = dateTime;
        this.lastFitnessAge = d15;
        this.firstGenericVo2Max = d16;
        this.firstGenericVo2MaxDate = dateTime2;
        this.lastGenericVo2Max = d17;
        this.firstCyclingVo2Max = d18;
        this.firstCyclingVo2MaxDate = dateTime3;
        this.lastCyclingVo2Max = d19;
        this.firstHillScore = num4;
        this.firstHillScoreDate = dateTime4;
        this.lastHillScore = num5;
        this.firstEnduranceScore = num6;
        this.firstEnduranceScoreDate = dateTime5;
        this.lastEnduranceScore = num7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getBadgeCount() {
        return this.badgeCount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getBadgePoints() {
        return this.badgePoints;
    }

    public final List<String> c() {
        return this.badges;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getFirstCyclingVo2Max() {
        return this.firstCyclingVo2Max;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final DateTime getFirstCyclingVo2MaxDate() {
        return this.firstCyclingVo2MaxDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.badgeCount, aVar.badgeCount) && s.g(this.badges, aVar.badges) && s.g(this.badgePoints, aVar.badgePoints) && s.g(this.prCount, aVar.prCount) && s.g(this.prTypeIdList, aVar.prTypeIdList) && s.g(this.firstFitnessAge, aVar.firstFitnessAge) && s.g(this.firstFitnessAgeDate, aVar.firstFitnessAgeDate) && s.g(this.lastFitnessAge, aVar.lastFitnessAge) && s.g(this.firstGenericVo2Max, aVar.firstGenericVo2Max) && s.g(this.firstGenericVo2MaxDate, aVar.firstGenericVo2MaxDate) && s.g(this.lastGenericVo2Max, aVar.lastGenericVo2Max) && s.g(this.firstCyclingVo2Max, aVar.firstCyclingVo2Max) && s.g(this.firstCyclingVo2MaxDate, aVar.firstCyclingVo2MaxDate) && s.g(this.lastCyclingVo2Max, aVar.lastCyclingVo2Max) && s.g(this.firstHillScore, aVar.firstHillScore) && s.g(this.firstHillScoreDate, aVar.firstHillScoreDate) && s.g(this.lastHillScore, aVar.lastHillScore) && s.g(this.firstEnduranceScore, aVar.firstEnduranceScore) && s.g(this.firstEnduranceScoreDate, aVar.firstEnduranceScoreDate) && s.g(this.lastEnduranceScore, aVar.lastEnduranceScore);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getFirstEnduranceScore() {
        return this.firstEnduranceScore;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final DateTime getFirstEnduranceScoreDate() {
        return this.firstEnduranceScoreDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Double getFirstFitnessAge() {
        return this.firstFitnessAge;
    }

    public final int hashCode() {
        Integer num = this.badgeCount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<String> list = this.badges;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.badgePoints;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.prCount;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<Long> list2 = this.prTypeIdList;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Double d14 = this.firstFitnessAge;
        int iHashCode6 = (iHashCode5 + (d14 == null ? 0 : d14.hashCode())) * 31;
        DateTime dateTime = this.firstFitnessAgeDate;
        int iHashCode7 = (iHashCode6 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Double d15 = this.lastFitnessAge;
        int iHashCode8 = (iHashCode7 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.firstGenericVo2Max;
        int iHashCode9 = (iHashCode8 + (d16 == null ? 0 : d16.hashCode())) * 31;
        DateTime dateTime2 = this.firstGenericVo2MaxDate;
        int iHashCode10 = (iHashCode9 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        Double d17 = this.lastGenericVo2Max;
        int iHashCode11 = (iHashCode10 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.firstCyclingVo2Max;
        int iHashCode12 = (iHashCode11 + (d18 == null ? 0 : d18.hashCode())) * 31;
        DateTime dateTime3 = this.firstCyclingVo2MaxDate;
        int iHashCode13 = (iHashCode12 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        Double d19 = this.lastCyclingVo2Max;
        int iHashCode14 = (iHashCode13 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Integer num4 = this.firstHillScore;
        int iHashCode15 = (iHashCode14 + (num4 == null ? 0 : num4.hashCode())) * 31;
        DateTime dateTime4 = this.firstHillScoreDate;
        int iHashCode16 = (iHashCode15 + (dateTime4 == null ? 0 : dateTime4.hashCode())) * 31;
        Integer num5 = this.lastHillScore;
        int iHashCode17 = (iHashCode16 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.firstEnduranceScore;
        int iHashCode18 = (iHashCode17 + (num6 == null ? 0 : num6.hashCode())) * 31;
        DateTime dateTime5 = this.firstEnduranceScoreDate;
        int iHashCode19 = (iHashCode18 + (dateTime5 == null ? 0 : dateTime5.hashCode())) * 31;
        Integer num7 = this.lastEnduranceScore;
        return iHashCode19 + (num7 != null ? num7.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final DateTime getFirstFitnessAgeDate() {
        return this.firstFitnessAgeDate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Double getFirstGenericVo2Max() {
        return this.firstGenericVo2Max;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final DateTime getFirstGenericVo2MaxDate() {
        return this.firstGenericVo2MaxDate;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final Integer getFirstHillScore() {
        return this.firstHillScore;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final DateTime getFirstHillScoreDate() {
        return this.firstHillScoreDate;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final Double getLastCyclingVo2Max() {
        return this.lastCyclingVo2Max;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Integer getLastEnduranceScore() {
        return this.lastEnduranceScore;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Double getLastFitnessAge() {
        return this.lastFitnessAge;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Double getLastGenericVo2Max() {
        return this.lastGenericVo2Max;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Integer getLastHillScore() {
        return this.lastHillScore;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Integer getPrCount() {
        return this.prCount;
    }

    public final List<Long> t() {
        return this.prTypeIdList;
    }

    public final String toString() {
        Integer num = this.badgeCount;
        List<String> list = this.badges;
        Integer num2 = this.badgePoints;
        Integer num3 = this.prCount;
        List<Long> list2 = this.prTypeIdList;
        Double d14 = this.firstFitnessAge;
        DateTime dateTime = this.firstFitnessAgeDate;
        Double d15 = this.lastFitnessAge;
        Double d16 = this.firstGenericVo2Max;
        DateTime dateTime2 = this.firstGenericVo2MaxDate;
        Double d17 = this.lastGenericVo2Max;
        Double d18 = this.firstCyclingVo2Max;
        DateTime dateTime3 = this.firstCyclingVo2MaxDate;
        Double d19 = this.lastCyclingVo2Max;
        Integer num4 = this.firstHillScore;
        DateTime dateTime4 = this.firstHillScoreDate;
        Integer num5 = this.lastHillScore;
        Integer num6 = this.firstEnduranceScore;
        DateTime dateTime5 = this.firstEnduranceScoreDate;
        Integer num7 = this.lastEnduranceScore;
        StringBuilder sb3 = new StringBuilder("AchievementData(badgeCount=");
        sb3.append(num);
        sb3.append(", badges=");
        sb3.append(list);
        sb3.append(", badgePoints=");
        x.m(sb3, num2, ", prCount=", num3, ", prTypeIdList=");
        sb3.append(list2);
        sb3.append(", firstFitnessAge=");
        sb3.append(d14);
        sb3.append(", firstFitnessAgeDate=");
        sb3.append(dateTime);
        sb3.append(", lastFitnessAge=");
        sb3.append(d15);
        sb3.append(", firstGenericVo2Max=");
        sb3.append(d16);
        sb3.append(", firstGenericVo2MaxDate=");
        sb3.append(dateTime2);
        sb3.append(", lastGenericVo2Max=");
        b71.i.p(d17, d18, ", firstCyclingVo2Max=", ", firstCyclingVo2MaxDate=", sb3);
        sb3.append(dateTime3);
        sb3.append(", lastCyclingVo2Max=");
        sb3.append(d19);
        sb3.append(", firstHillScore=");
        sb3.append(num4);
        sb3.append(", firstHillScoreDate=");
        sb3.append(dateTime4);
        sb3.append(", lastHillScore=");
        x.m(sb3, num5, ", firstEnduranceScore=", num6, ", firstEnduranceScoreDate=");
        sb3.append(dateTime5);
        sb3.append(", lastEnduranceScore=");
        sb3.append(num7);
        sb3.append(")");
        return sb3.toString();
    }
}
