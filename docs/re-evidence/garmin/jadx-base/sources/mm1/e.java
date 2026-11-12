package mm1;

import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0015\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0016\u0010\u000f¨\u0006\u0018"}, d2 = {"Lmm1/e;", "", "", "averageHighSleepScore", "averageLowSleepScore", "", "averageLocalSleepEndTime", "averageLocalSleepStartTime", "averageSleepNeed", "averageSleepSeconds", "averageSleepScore", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "d", "c", "Ljava/lang/Long;", "()Ljava/lang/Long;", JWKParameterNames.RSA_EXPONENT, "f", "g", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageHighSleepScore")
    private final Integer averageHighSleepScore;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageLowSleepScore")
    private final Integer averageLowSleepScore;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageLocalSleepEndTime")
    private final Long averageLocalSleepEndTime;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageLocalSleepStartTime")
    private final Long averageLocalSleepStartTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageSleepNeed")
    private final Integer averageSleepNeed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageSleepSeconds")
    private final Integer averageSleepSeconds;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("averageSleepScore")
    private final Integer averageSleepScore;

    public /* synthetic */ e(Integer num, Integer num2, Long l14, Long l15, Integer num3, Integer num4, Integer num5, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : l14, (i14 & 8) != 0 ? null : l15, (i14 & 16) != 0 ? null : num3, (i14 & 32) != 0 ? null : num4, (i14 & 64) != 0 ? null : num5);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getAverageHighSleepScore() {
        return this.averageHighSleepScore;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getAverageLocalSleepEndTime() {
        return this.averageLocalSleepEndTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getAverageLocalSleepStartTime() {
        return this.averageLocalSleepStartTime;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getAverageLowSleepScore() {
        return this.averageLowSleepScore;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Integer getAverageSleepNeed() {
        return this.averageSleepNeed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.averageHighSleepScore, eVar.averageHighSleepScore) && s.g(this.averageLowSleepScore, eVar.averageLowSleepScore) && s.g(this.averageLocalSleepEndTime, eVar.averageLocalSleepEndTime) && s.g(this.averageLocalSleepStartTime, eVar.averageLocalSleepStartTime) && s.g(this.averageSleepNeed, eVar.averageSleepNeed) && s.g(this.averageSleepSeconds, eVar.averageSleepSeconds) && s.g(this.averageSleepScore, eVar.averageSleepScore);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getAverageSleepScore() {
        return this.averageSleepScore;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getAverageSleepSeconds() {
        return this.averageSleepSeconds;
    }

    public final int hashCode() {
        Integer num = this.averageHighSleepScore;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.averageLowSleepScore;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l14 = this.averageLocalSleepEndTime;
        int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.averageLocalSleepStartTime;
        int iHashCode4 = (iHashCode3 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Integer num3 = this.averageSleepNeed;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.averageSleepSeconds;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.averageSleepScore;
        return iHashCode6 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.averageHighSleepScore;
        Integer num2 = this.averageLowSleepScore;
        Long l14 = this.averageLocalSleepEndTime;
        Long l15 = this.averageLocalSleepStartTime;
        Integer num3 = this.averageSleepNeed;
        Integer num4 = this.averageSleepSeconds;
        Integer num5 = this.averageSleepScore;
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(num, "WeeklyOverallStats(averageHighSleepScore=", ", averageLowSleepScore=", ", averageLocalSleepEndTime=", num2);
        kg.f.s(sbL, l14, ", averageLocalSleepStartTime=", l15, ", averageSleepNeed=");
        x.m(sbL, num3, ", averageSleepSeconds=", num4, ", averageSleepScore=");
        return f3.i(sbL, num5, ")");
    }

    public e(Integer num, Integer num2, Long l14, Long l15, Integer num3, Integer num4, Integer num5) {
        this.averageHighSleepScore = num;
        this.averageLowSleepScore = num2;
        this.averageLocalSleepEndTime = l14;
        this.averageLocalSleepStartTime = l15;
        this.averageSleepNeed = num3;
        this.averageSleepSeconds = num4;
        this.averageSleepScore = num5;
    }

    public e() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
