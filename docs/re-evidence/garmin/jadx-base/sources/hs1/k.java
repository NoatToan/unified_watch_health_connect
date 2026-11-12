package hs1;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\r\u0010\u001b¨\u0006\u001c"}, d2 = {"Lhs1/k;", "", "", "avgValue", "minValue", "latestValue", "", "latestTimestampGmt", "latestTimestampLocal", "", "avgAltitudeInMeters", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V", "a", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "getMinValue", "c", "d", "Ljava/lang/String;", "getLatestTimestampGmt", "()Ljava/lang/String;", JWKParameterNames.RSA_EXPONENT, "getLatestTimestampLocal", "f", "Ljava/lang/Double;", "()Ljava/lang/Double;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgValue")
    private final Integer avgValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("minValue")
    private final Integer minValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("latestValue")
    private final Integer latestValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("latestTimestampGmt")
    private final String latestTimestampGmt;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("latestTimestampLocal")
    private final String latestTimestampLocal;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgAltitudeInMeters")
    private final Double avgAltitudeInMeters;

    public /* synthetic */ k(Integer num, Integer num2, Integer num3, String str, String str2, Double d14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : num3, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? null : d14);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getAvgAltitudeInMeters() {
        return this.avgAltitudeInMeters;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getAvgValue() {
        return this.avgValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getLatestValue() {
        return this.latestValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return s.g(this.avgValue, kVar.avgValue) && s.g(this.minValue, kVar.minValue) && s.g(this.latestValue, kVar.latestValue) && s.g(this.latestTimestampGmt, kVar.latestTimestampGmt) && s.g(this.latestTimestampLocal, kVar.latestTimestampLocal) && s.g(this.avgAltitudeInMeters, kVar.avgAltitudeInMeters);
    }

    public final int hashCode() {
        Integer num = this.avgValue;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.minValue;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.latestValue;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.latestTimestampGmt;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.latestTimestampLocal;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d14 = this.avgAltitudeInMeters;
        return iHashCode5 + (d14 != null ? d14.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.avgValue;
        Integer num2 = this.minValue;
        Integer num3 = this.latestValue;
        String str = this.latestTimestampGmt;
        String str2 = this.latestTimestampLocal;
        Double d14 = this.avgAltitudeInMeters;
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(num, "PulseOx(avgValue=", ", minValue=", ", latestValue=", num2);
        p6.b.l(num3, ", latestTimestampGmt=", str, ", latestTimestampLocal=", sbL);
        sbL.append(str2);
        sbL.append(", avgAltitudeInMeters=");
        sbL.append(d14);
        sbL.append(")");
        return sbL.toString();
    }

    public k(Integer num, Integer num2, Integer num3, String str, String str2, Double d14) {
        this.avgValue = num;
        this.minValue = num2;
        this.latestValue = num3;
        this.latestTimestampGmt = str;
        this.latestTimestampLocal = str2;
        this.avgAltitudeInMeters = d14;
    }

    public k() {
        this(null, null, null, null, null, null, 63, null);
    }
}
