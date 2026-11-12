package ns;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lns/a;", "", "Lto/i;", "climbMode", "", "elevationGain", "", "maxDiffKey", "<init>", "(Lto/i;Ljava/lang/Double;Ljava/lang/String;)V", "a", "Lto/i;", "()Lto/i;", "b", "Ljava/lang/Double;", "()Ljava/lang/Double;", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("climbMode")
    private final to.i climbMode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevationGain")
    private final Double elevationGain;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxDiffKey")
    private final String maxDiffKey;

    public a(to.i iVar, Double d14, String str) {
        iVar.getClass();
        this.climbMode = iVar;
        this.elevationGain = d14;
        this.maxDiffKey = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final to.i getClimbMode() {
        return this.climbMode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getElevationGain() {
        return this.elevationGain;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMaxDiffKey() {
        return this.maxDiffKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.climbMode == aVar.climbMode && p005kotlin.jvm.internal.s.g(this.elevationGain, aVar.elevationGain) && p005kotlin.jvm.internal.s.g(this.maxDiffKey, aVar.maxDiffKey);
    }

    public final int hashCode() {
        int iHashCode = this.climbMode.hashCode() * 31;
        Double d14 = this.elevationGain;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str = this.maxDiffKey;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        to.i iVar = this.climbMode;
        Double d14 = this.elevationGain;
        String str = this.maxDiffKey;
        StringBuilder sb3 = new StringBuilder("ActiveSplitModeData(climbMode=");
        sb3.append(iVar);
        sb3.append(", elevationGain=");
        sb3.append(d14);
        sb3.append(", maxDiffKey=");
        return am.j.o(str, ")", sb3);
    }
}
