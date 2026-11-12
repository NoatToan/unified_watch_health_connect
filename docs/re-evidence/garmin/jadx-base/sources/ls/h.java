package ls;

import com.google.gson.annotations.SerializedName;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u000e\u0010\u0012¨\u0006\u0013"}, d2 = {"Lls/h;", "", "", "isUsingMetric", "", "pace", "", "perValue", "<init>", "(ZDI)V", "a", "Z", "c", "()Z", "b", "D", "()D", "I", "()I", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("isUsingMetric")
    private final boolean isUsingMetric;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pace")
    private final double pace;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("perValue")
    private final int perValue;

    public h(boolean z14, double d14, int i14) {
        this.isUsingMetric = z14;
        this.pace = d14;
        this.perValue = i14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getPace() {
        return this.pace;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getPerValue() {
        return this.perValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsUsingMetric() {
        return this.isUsingMetric;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.isUsingMetric == hVar.isUsingMetric && Double.compare(this.pace, hVar.pace) == 0 && this.perValue == hVar.perValue;
    }

    public final int hashCode() {
        return Integer.hashCode(this.perValue) + org.apache.commons.lang3.e.b(Boolean.hashCode(this.isUsingMetric) * 31, 31, this.pace);
    }

    public final String toString() {
        boolean z14 = this.isUsingMetric;
        double d14 = this.pace;
        int i14 = this.perValue;
        StringBuilder sb3 = new StringBuilder("VariablePaceData(isUsingMetric=");
        sb3.append(z14);
        sb3.append(", pace=");
        sb3.append(d14);
        return u0.k(sb3, ", perValue=", i14, ")");
    }
}
