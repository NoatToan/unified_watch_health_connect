package k30;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lk30/e;", "", "", "startLat", "startLon", "endLat", "endLon", "", "deviceType", "", "Lk30/c;", "cleanCourseViaPoints", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/Double;", "getStartLat", "()Ljava/lang/Double;", "b", "getStartLon", "c", "getEndLat", "d", "getEndLon", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/String;", "getDeviceType", "()Ljava/lang/String;", "f", "Ljava/util/List;", "getCleanCourseViaPoints", "()Ljava/util/List;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startLat")
    private final Double startLat;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startLon")
    private final Double startLon;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endLat")
    private final Double endLat;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endLon")
    private final Double endLon;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceType")
    private final String deviceType;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cleanCourseViaPoints")
    private final List<c> cleanCourseViaPoints;

    public e(Double d14, Double d15, Double d16, Double d17, String str, List<c> list) {
        this.startLat = d14;
        this.startLon = d15;
        this.endLat = d16;
        this.endLon = d17;
        this.deviceType = str;
        this.cleanCourseViaPoints = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p005kotlin.jvm.internal.s.g(this.startLat, eVar.startLat) && p005kotlin.jvm.internal.s.g(this.startLon, eVar.startLon) && p005kotlin.jvm.internal.s.g(this.endLat, eVar.endLat) && p005kotlin.jvm.internal.s.g(this.endLon, eVar.endLon) && p005kotlin.jvm.internal.s.g(this.deviceType, eVar.deviceType) && p005kotlin.jvm.internal.s.g(this.cleanCourseViaPoints, eVar.cleanCourseViaPoints);
    }

    public final int hashCode() {
        Double d14 = this.startLat;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.startLon;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.endLat;
        int iHashCode3 = (iHashCode2 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.endLon;
        int iHashCode4 = (iHashCode3 + (d17 == null ? 0 : d17.hashCode())) * 31;
        String str = this.deviceType;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        List<c> list = this.cleanCourseViaPoints;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        Double d14 = this.startLat;
        Double d15 = this.startLon;
        Double d16 = this.endLat;
        Double d17 = this.endLon;
        String str = this.deviceType;
        List<c> list = this.cleanCourseViaPoints;
        StringBuilder sbI = tn.k.i("CleanCourseRouteDTO(startLat=", d14, d15, ", startLon=", ", endLat=");
        b71.i.p(d16, d17, ", endLon=", ", deviceType=", sbI);
        sbI.append(str);
        sbI.append(", cleanCourseViaPoints=");
        sbI.append(list);
        sbI.append(")");
        return sbI.toString();
    }
}
