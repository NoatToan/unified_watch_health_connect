package hs1;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b(\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b#\u00102R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00100\u001a\u0004\b5\u00102R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b7\u00102R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u00100\u001a\u0004\b\u001d\u00102R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b!\u00102R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b\u001b\u00102¨\u0006;"}, d2 = {"Lhs1/m;", "", "", "avgLevel", "maxLevel", "", "restProportion", "activityProportion", "uncategorizedProportion", "lowStressProportion", "mediumStressProportion", "highStressProportion", "", "qualifier", "", "totalDurationInMillis", "restDurationInMillis", "activityDurationInMillis", "uncategorizedDurationInMillis", "lowStressDurationInMillis", "mediumStressDurationInMillis", "highStressDurationInMillis", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "getMaxLevel", "c", "Ljava/lang/Double;", "getRestProportion", "()Ljava/lang/Double;", "d", "getActivityProportion", JWKParameterNames.RSA_EXPONENT, "getUncategorizedProportion", "f", "getLowStressProportion", "g", "getMediumStressProportion", "h", "getHighStressProportion", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getQualifier", "()Ljava/lang/String;", "j", "Ljava/lang/Long;", "getTotalDurationInMillis", "()Ljava/lang/Long;", JWKParameterNames.OCT_KEY_VALUE, "l", "getActivityDurationInMillis", "m", "getUncategorizedDurationInMillis", JWKParameterNames.RSA_MODULUS, "o", "p", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgLevel")
    private final Integer avgLevel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxLevel")
    private final Integer maxLevel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("restProportion")
    private final Double restProportion;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityProportion")
    private final Double activityProportion;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("uncategorizedProportion")
    private final Double uncategorizedProportion;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lowStressProportion")
    private final Double lowStressProportion;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mediumStressProportion")
    private final Double mediumStressProportion;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("highStressProportion")
    private final Double highStressProportion;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("qualifier")
    private final String qualifier;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalDurationInMillis")
    private final Long totalDurationInMillis;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("restDurationInMillis")
    private final Long restDurationInMillis;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityDurationInMillis")
    private final Long activityDurationInMillis;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("uncategorizedDurationInMillis")
    private final Long uncategorizedDurationInMillis;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lowStressDurationInMillis")
    private final Long lowStressDurationInMillis;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mediumStressDurationInMillis")
    private final Long mediumStressDurationInMillis;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("highStressDurationInMillis")
    private final Long highStressDurationInMillis;

    public /* synthetic */ m(Integer num, Integer num2, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, String str, Long l14, Long l15, Long l16, Long l17, Long l18, Long l19, Long l24, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : d14, (i14 & 8) != 0 ? null : d15, (i14 & 16) != 0 ? null : d16, (i14 & 32) != 0 ? null : d17, (i14 & 64) != 0 ? null : d18, (i14 & 128) != 0 ? null : d19, (i14 & 256) != 0 ? null : str, (i14 & 512) != 0 ? null : l14, (i14 & 1024) != 0 ? null : l15, (i14 & 2048) != 0 ? null : l16, (i14 & 4096) != 0 ? null : l17, (i14 & 8192) != 0 ? null : l18, (i14 & 16384) != 0 ? null : l19, (i14 & 32768) != 0 ? null : l24);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getAvgLevel() {
        return this.avgLevel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getHighStressDurationInMillis() {
        return this.highStressDurationInMillis;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getLowStressDurationInMillis() {
        return this.lowStressDurationInMillis;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getMediumStressDurationInMillis() {
        return this.mediumStressDurationInMillis;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getRestDurationInMillis() {
        return this.restDurationInMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return s.g(this.avgLevel, mVar.avgLevel) && s.g(this.maxLevel, mVar.maxLevel) && s.g(this.restProportion, mVar.restProportion) && s.g(this.activityProportion, mVar.activityProportion) && s.g(this.uncategorizedProportion, mVar.uncategorizedProportion) && s.g(this.lowStressProportion, mVar.lowStressProportion) && s.g(this.mediumStressProportion, mVar.mediumStressProportion) && s.g(this.highStressProportion, mVar.highStressProportion) && s.g(this.qualifier, mVar.qualifier) && s.g(this.totalDurationInMillis, mVar.totalDurationInMillis) && s.g(this.restDurationInMillis, mVar.restDurationInMillis) && s.g(this.activityDurationInMillis, mVar.activityDurationInMillis) && s.g(this.uncategorizedDurationInMillis, mVar.uncategorizedDurationInMillis) && s.g(this.lowStressDurationInMillis, mVar.lowStressDurationInMillis) && s.g(this.mediumStressDurationInMillis, mVar.mediumStressDurationInMillis) && s.g(this.highStressDurationInMillis, mVar.highStressDurationInMillis);
    }

    public final int hashCode() {
        Integer num = this.avgLevel;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.maxLevel;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d14 = this.restProportion;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.activityProportion;
        int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.uncategorizedProportion;
        int iHashCode5 = (iHashCode4 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.lowStressProportion;
        int iHashCode6 = (iHashCode5 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.mediumStressProportion;
        int iHashCode7 = (iHashCode6 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.highStressProportion;
        int iHashCode8 = (iHashCode7 + (d19 == null ? 0 : d19.hashCode())) * 31;
        String str = this.qualifier;
        int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        Long l14 = this.totalDurationInMillis;
        int iHashCode10 = (iHashCode9 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.restDurationInMillis;
        int iHashCode11 = (iHashCode10 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.activityDurationInMillis;
        int iHashCode12 = (iHashCode11 + (l16 == null ? 0 : l16.hashCode())) * 31;
        Long l17 = this.uncategorizedDurationInMillis;
        int iHashCode13 = (iHashCode12 + (l17 == null ? 0 : l17.hashCode())) * 31;
        Long l18 = this.lowStressDurationInMillis;
        int iHashCode14 = (iHashCode13 + (l18 == null ? 0 : l18.hashCode())) * 31;
        Long l19 = this.mediumStressDurationInMillis;
        int iHashCode15 = (iHashCode14 + (l19 == null ? 0 : l19.hashCode())) * 31;
        Long l24 = this.highStressDurationInMillis;
        return iHashCode15 + (l24 != null ? l24.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.avgLevel;
        Integer num2 = this.maxLevel;
        Double d14 = this.restProportion;
        Double d15 = this.activityProportion;
        Double d16 = this.uncategorizedProportion;
        Double d17 = this.lowStressProportion;
        Double d18 = this.mediumStressProportion;
        Double d19 = this.highStressProportion;
        String str = this.qualifier;
        Long l14 = this.totalDurationInMillis;
        Long l15 = this.restDurationInMillis;
        Long l16 = this.activityDurationInMillis;
        Long l17 = this.uncategorizedDurationInMillis;
        Long l18 = this.lowStressDurationInMillis;
        Long l19 = this.mediumStressDurationInMillis;
        Long l24 = this.highStressDurationInMillis;
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(num, "Stress(avgLevel=", ", maxLevel=", ", restProportion=", num2);
        b71.i.p(d14, d15, ", activityProportion=", ", uncategorizedProportion=", sbL);
        b71.i.p(d16, d17, ", lowStressProportion=", ", mediumStressProportion=", sbL);
        b71.i.p(d18, d19, ", highStressProportion=", ", qualifier=", sbL);
        n23.j.q(l14, str, ", totalDurationInMillis=", ", restDurationInMillis=", sbL);
        kg.f.s(sbL, l15, ", activityDurationInMillis=", l16, ", uncategorizedDurationInMillis=");
        kg.f.s(sbL, l17, ", lowStressDurationInMillis=", l18, ", mediumStressDurationInMillis=");
        sbL.append(l19);
        sbL.append(", highStressDurationInMillis=");
        sbL.append(l24);
        sbL.append(")");
        return sbL.toString();
    }

    public m(Integer num, Integer num2, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, String str, Long l14, Long l15, Long l16, Long l17, Long l18, Long l19, Long l24) {
        this.avgLevel = num;
        this.maxLevel = num2;
        this.restProportion = d14;
        this.activityProportion = d15;
        this.uncategorizedProportion = d16;
        this.lowStressProportion = d17;
        this.mediumStressProportion = d18;
        this.highStressProportion = d19;
        this.qualifier = str;
        this.totalDurationInMillis = l14;
        this.restDurationInMillis = l15;
        this.activityDurationInMillis = l16;
        this.uncategorizedDurationInMillis = l17;
        this.lowStressDurationInMillis = l18;
        this.mediumStressDurationInMillis = l19;
        this.highStressDurationInMillis = l24;
    }

    public m() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }
}
