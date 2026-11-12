package ls;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\t\u0010\u0011¨\u0006\u0012"}, d2 = {"Lls/f;", "", "", "isUsingMetric", "", "percentage", "distance", "<init>", "(ZDLjava/lang/Double;)V", "a", "Z", "c", "()Z", "b", "D", "()D", "Ljava/lang/Double;", "()Ljava/lang/Double;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isUsingMetric")
    private final boolean isUsingMetric;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("percentage")
    private final double percentage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distance")
    private final Double distance;

    public f(boolean z14, double d14, Double d15) {
        this.isUsingMetric = z14;
        this.percentage = d14;
        this.distance = d15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getPercentage() {
        return this.percentage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsUsingMetric() {
        return this.isUsingMetric;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.isUsingMetric == fVar.isUsingMetric && Double.compare(this.percentage, fVar.percentage) == 0 && s.g(this.distance, fVar.distance);
    }

    public final int hashCode() {
        int iB = org.apache.commons.lang3.e.b(Boolean.hashCode(this.isUsingMetric) * 31, 31, this.percentage);
        Double d14 = this.distance;
        return iB + (d14 == null ? 0 : d14.hashCode());
    }

    public final String toString() {
        return "SurfaceTypeData(isUsingMetric=" + this.isUsingMetric + ", percentage=" + this.percentage + ", distance=" + this.distance + ")";
    }
}
