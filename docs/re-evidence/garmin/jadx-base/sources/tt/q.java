package tt;

import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R$\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u001b"}, d2 = {"Ltt/q;", "", "", "avgSleepScore", "", "avgSleepQualityType", "sleepQualityType", "sleepQualityTypeCount", "", "monthlySleepScore", "highestSleepScore", "avgSleepSeconds", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "f", "d", "g", JWKParameterNames.RSA_EXPONENT, "Ljava/util/List;", "()Ljava/util/List;", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgSleepScore")
    private final Integer avgSleepScore;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgSleepQualityType")
    private final String avgSleepQualityType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepQualityType")
    private final String sleepQualityType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sleepQualityTypeCount")
    private final Integer sleepQualityTypeCount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("monthlySleepScore")
    private final List<Integer> monthlySleepScore;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("highestSleepScore")
    private final Integer highestSleepScore;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgSleepSeconds")
    private final Integer avgSleepSeconds;

    public q(Integer num, String str, String str2, Integer num2, List<Integer> list, Integer num3, Integer num4) {
        this.avgSleepScore = num;
        this.avgSleepQualityType = str;
        this.sleepQualityType = str2;
        this.sleepQualityTypeCount = num2;
        this.monthlySleepScore = list;
        this.highestSleepScore = num3;
        this.avgSleepSeconds = num4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAvgSleepQualityType() {
        return this.avgSleepQualityType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getAvgSleepScore() {
        return this.avgSleepScore;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getAvgSleepSeconds() {
        return this.avgSleepSeconds;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getHighestSleepScore() {
        return this.highestSleepScore;
    }

    public final List<Integer> e() {
        return this.monthlySleepScore;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return s.g(this.avgSleepScore, qVar.avgSleepScore) && s.g(this.avgSleepQualityType, qVar.avgSleepQualityType) && s.g(this.sleepQualityType, qVar.sleepQualityType) && s.g(this.sleepQualityTypeCount, qVar.sleepQualityTypeCount) && s.g(this.monthlySleepScore, qVar.monthlySleepScore) && s.g(this.highestSleepScore, qVar.highestSleepScore) && s.g(this.avgSleepSeconds, qVar.avgSleepSeconds);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSleepQualityType() {
        return this.sleepQualityType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getSleepQualityTypeCount() {
        return this.sleepQualityTypeCount;
    }

    public final int hashCode() {
        Integer num = this.avgSleepScore;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.avgSleepQualityType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sleepQualityType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.sleepQualityTypeCount;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<Integer> list = this.monthlySleepScore;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num3 = this.highestSleepScore;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.avgSleepSeconds;
        return iHashCode6 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.avgSleepScore;
        String str = this.avgSleepQualityType;
        String str2 = this.sleepQualityType;
        Integer num2 = this.sleepQualityTypeCount;
        List<Integer> list = this.monthlySleepScore;
        Integer num3 = this.highestSleepScore;
        Integer num4 = this.avgSleepSeconds;
        StringBuilder sbF = l2.f("SleepScoreData(avgSleepScore=", num, ", avgSleepQualityType=", str, ", sleepQualityType=");
        fb1.c.u(num2, str2, ", sleepQualityTypeCount=", ", monthlySleepScore=", sbF);
        sbF.append(list);
        sbF.append(", highestSleepScore=");
        sbF.append(num3);
        sbF.append(", avgSleepSeconds=");
        return f3.i(sbF, num4, ")");
    }
}
