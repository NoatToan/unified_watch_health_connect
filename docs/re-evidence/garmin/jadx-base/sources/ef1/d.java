package ef1;

import b71.i;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0016\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"Lef1/d;", "", "", "userProfilePK", "", "startOfWeek", "endOfWeek", "weekIndex", "", "totalImpactLoad", "totalDistance", "tolerance", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "a", "Ljava/lang/Integer;", "getUserProfilePK", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "d", "f", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Double;", "()Ljava/lang/Double;", "g", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePK")
    private final Integer userProfilePK;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startOfWeek")
    private final String startOfWeek;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endOfWeek")
    private final String endOfWeek;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weekIndex")
    private final Integer weekIndex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalImpactLoad")
    private final Double totalImpactLoad;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalDistance")
    private final Double totalDistance;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("tolerance")
    private final Double tolerance;

    public d(Integer num, String str, String str2, Integer num2, Double d14, Double d15, Double d16) {
        this.userProfilePK = num;
        this.startOfWeek = str;
        this.endOfWeek = str2;
        this.weekIndex = num2;
        this.totalImpactLoad = d14;
        this.totalDistance = d15;
        this.tolerance = d16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEndOfWeek() {
        return this.endOfWeek;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getStartOfWeek() {
        return this.startOfWeek;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Double getTolerance() {
        return this.tolerance;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getTotalDistance() {
        return this.totalDistance;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Double getTotalImpactLoad() {
        return this.totalImpactLoad;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.userProfilePK, dVar.userProfilePK) && s.g(this.startOfWeek, dVar.startOfWeek) && s.g(this.endOfWeek, dVar.endOfWeek) && s.g(this.weekIndex, dVar.weekIndex) && s.g(this.totalImpactLoad, dVar.totalImpactLoad) && s.g(this.totalDistance, dVar.totalDistance) && s.g(this.tolerance, dVar.tolerance);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getWeekIndex() {
        return this.weekIndex;
    }

    public final int hashCode() {
        Integer num = this.userProfilePK;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.startOfWeek;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.endOfWeek;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.weekIndex;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d14 = this.totalImpactLoad;
        int iHashCode5 = (iHashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.totalDistance;
        int iHashCode6 = (iHashCode5 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.tolerance;
        return iHashCode6 + (d16 != null ? d16.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.userProfilePK;
        String str = this.startOfWeek;
        String str2 = this.endOfWeek;
        Integer num2 = this.weekIndex;
        Double d14 = this.totalImpactLoad;
        Double d15 = this.totalDistance;
        Double d16 = this.tolerance;
        StringBuilder sbF = l2.f("RunningToleranceWeeklyMetricsDTO(userProfilePK=", num, ", startOfWeek=", str, ", endOfWeek=");
        fb1.c.u(num2, str2, ", weekIndex=", ", totalImpactLoad=", sbF);
        i.p(d14, d15, ", totalDistance=", ", tolerance=", sbF);
        return i.g(sbF, d16, ")");
    }
}
