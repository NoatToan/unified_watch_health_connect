package ls;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000e"}, d2 = {"Lls/g;", "", "", "isUsingMetric", "", "data", "<init>", "(ZD)V", "a", "Z", "b", "()Z", "D", "()D", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isUsingMetric")
    private final boolean isUsingMetric;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distance")
    private final double data;

    public g(boolean z14, double d14) {
        this.isUsingMetric = z14;
        this.data = d14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsUsingMetric() {
        return this.isUsingMetric;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.isUsingMetric == gVar.isUsingMetric && Double.compare(this.data, gVar.data) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.data) + (Boolean.hashCode(this.isUsingMetric) * 31);
    }

    public final String toString() {
        return "SwimmingData(isUsingMetric=" + this.isUsingMetric + ", data=" + this.data + ")";
    }
}
