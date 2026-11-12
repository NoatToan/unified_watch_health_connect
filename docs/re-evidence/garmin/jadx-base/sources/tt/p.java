package tt;

import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u000b\u0010\u000e¨\u0006\u0014"}, d2 = {"Ltt/p;", "", "", "avgSleepSeconds", "eightHoursSleepCount", "", "monthlySleepSeconds", "avgLocalSleepStartTime", "avgLocalSleepEndTime", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "b", "d", "Ljava/util/List;", JWKParameterNames.RSA_EXPONENT, "()Ljava/util/List;", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgSleepSeconds")
    private final Integer avgSleepSeconds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eightHoursSleepCount")
    private final Integer eightHoursSleepCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("monthlySleepSeconds")
    private final List<Integer> monthlySleepSeconds;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgLocalSleepStartTime")
    private final Integer avgLocalSleepStartTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgLocalSleepEndTime")
    private final Integer avgLocalSleepEndTime;

    public p(Integer num, Integer num2, List<Integer> list, Integer num3, Integer num4) {
        this.avgSleepSeconds = num;
        this.eightHoursSleepCount = num2;
        this.monthlySleepSeconds = list;
        this.avgLocalSleepStartTime = num3;
        this.avgLocalSleepEndTime = num4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getAvgLocalSleepEndTime() {
        return this.avgLocalSleepEndTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getAvgLocalSleepStartTime() {
        return this.avgLocalSleepStartTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getAvgSleepSeconds() {
        return this.avgSleepSeconds;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getEightHoursSleepCount() {
        return this.eightHoursSleepCount;
    }

    public final List<Integer> e() {
        return this.monthlySleepSeconds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return s.g(this.avgSleepSeconds, pVar.avgSleepSeconds) && s.g(this.eightHoursSleepCount, pVar.eightHoursSleepCount) && s.g(this.monthlySleepSeconds, pVar.monthlySleepSeconds) && s.g(this.avgLocalSleepStartTime, pVar.avgLocalSleepStartTime) && s.g(this.avgLocalSleepEndTime, pVar.avgLocalSleepEndTime);
    }

    public final int hashCode() {
        Integer num = this.avgSleepSeconds;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.eightHoursSleepCount;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<Integer> list = this.monthlySleepSeconds;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num3 = this.avgLocalSleepStartTime;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.avgLocalSleepEndTime;
        return iHashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.avgSleepSeconds;
        Integer num2 = this.eightHoursSleepCount;
        List<Integer> list = this.monthlySleepSeconds;
        Integer num3 = this.avgLocalSleepStartTime;
        Integer num4 = this.avgLocalSleepEndTime;
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(num, "SleepData(avgSleepSeconds=", ", eightHoursSleepCount=", ", monthlySleepSeconds=", num2);
        sbL.append(list);
        sbL.append(", avgLocalSleepStartTime=");
        sbL.append(num3);
        sbL.append(", avgLocalSleepEndTime=");
        return f3.i(sbL, num4, ")");
    }
}
