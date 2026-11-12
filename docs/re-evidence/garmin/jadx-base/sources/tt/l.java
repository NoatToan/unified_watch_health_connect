package tt;

import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0006\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\r\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R$\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u0018"}, d2 = {"Ltt/l;", "", "", "avgDailyBbHigh", "avgDailyBbCharged", "avgDailyBbDrained", "", "monthlyBbHigh", "monthlyBbLow", "bbHighAchievedThreshold", "bbHighAchievedThresholdDayCount", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "b", "d", "Ljava/util/List;", "f", "()Ljava/util/List;", JWKParameterNames.RSA_EXPONENT, "g", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgDailyBbHigh")
    private final Integer avgDailyBbHigh;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgDailyBbCharged")
    private final Integer avgDailyBbCharged;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgDailyBbDrained")
    private final Integer avgDailyBbDrained;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("monthlyBbHigh")
    private final List<Integer> monthlyBbHigh;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("monthlyBbLow")
    private final List<Integer> monthlyBbLow;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bbHighAchievedThreshold")
    private final Integer bbHighAchievedThreshold;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bbHighAchievedThresholdDayCount")
    private final Integer bbHighAchievedThresholdDayCount;

    public l(Integer num, Integer num2, Integer num3, List<Integer> list, List<Integer> list2, Integer num4, Integer num5) {
        this.avgDailyBbHigh = num;
        this.avgDailyBbCharged = num2;
        this.avgDailyBbDrained = num3;
        this.monthlyBbHigh = list;
        this.monthlyBbLow = list2;
        this.bbHighAchievedThreshold = num4;
        this.bbHighAchievedThresholdDayCount = num5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getAvgDailyBbCharged() {
        return this.avgDailyBbCharged;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getAvgDailyBbDrained() {
        return this.avgDailyBbDrained;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getAvgDailyBbHigh() {
        return this.avgDailyBbHigh;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getBbHighAchievedThreshold() {
        return this.bbHighAchievedThreshold;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getBbHighAchievedThresholdDayCount() {
        return this.bbHighAchievedThresholdDayCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return s.g(this.avgDailyBbHigh, lVar.avgDailyBbHigh) && s.g(this.avgDailyBbCharged, lVar.avgDailyBbCharged) && s.g(this.avgDailyBbDrained, lVar.avgDailyBbDrained) && s.g(this.monthlyBbHigh, lVar.monthlyBbHigh) && s.g(this.monthlyBbLow, lVar.monthlyBbLow) && s.g(this.bbHighAchievedThreshold, lVar.bbHighAchievedThreshold) && s.g(this.bbHighAchievedThresholdDayCount, lVar.bbHighAchievedThresholdDayCount);
    }

    public final List<Integer> f() {
        return this.monthlyBbHigh;
    }

    public final List<Integer> g() {
        return this.monthlyBbLow;
    }

    public final int hashCode() {
        Integer num = this.avgDailyBbHigh;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.avgDailyBbCharged;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.avgDailyBbDrained;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<Integer> list = this.monthlyBbHigh;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.monthlyBbLow;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num4 = this.bbHighAchievedThreshold;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.bbHighAchievedThresholdDayCount;
        return iHashCode6 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.avgDailyBbHigh;
        Integer num2 = this.avgDailyBbCharged;
        Integer num3 = this.avgDailyBbDrained;
        List<Integer> list = this.monthlyBbHigh;
        List<Integer> list2 = this.monthlyBbLow;
        Integer num4 = this.bbHighAchievedThreshold;
        Integer num5 = this.bbHighAchievedThresholdDayCount;
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(num, "BodyBatteryData(avgDailyBbHigh=", ", avgDailyBbCharged=", ", avgDailyBbDrained=", num2);
        sbL.append(num3);
        sbL.append(", monthlyBbHigh=");
        sbL.append(list);
        sbL.append(", monthlyBbLow=");
        sbL.append(list2);
        sbL.append(", bbHighAchievedThreshold=");
        sbL.append(num4);
        sbL.append(", bbHighAchievedThresholdDayCount=");
        return f3.i(sbL, num5, ")");
    }
}
