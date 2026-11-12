package to;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012:\u0010\t\u001a6\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00020\u0007j\b\u0012\u0004\u0012\u00020\u0002`\b\u0018\u00010\u0007j\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00020\u0007j\b\u0012\u0004\u0012\u00020\u0002`\b\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fRN\u0010\t\u001a6\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00020\u0007j\b\u0012\u0004\u0012\u00020\u0002`\b\u0018\u00010\u0007j\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00020\u0007j\b\u0012\u0004\u0012\u00020\u0002`\b\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\f\u0010\u0018¨\u0006\u0019"}, d2 = {"Lto/f;", "", "", "maxLat", "maxLon", "minLat", "minLon", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "polyline", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/ArrayList;)V", "a", "Ljava/lang/Double;", "getMaxLat", "()Ljava/lang/Double;", "b", "getMaxLon", "c", "getMinLat", "d", "getMinLon", JWKParameterNames.RSA_EXPONENT, "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxLat")
    private final Double maxLat;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxLon")
    private final Double maxLon;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("minLat")
    private final Double minLat;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("minLon")
    private final Double minLon;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("polyline")
    private final ArrayList<ArrayList<Double>> polyline;

    public f(Double d14, Double d15, Double d16, Double d17, ArrayList<ArrayList<Double>> arrayList) {
        this.maxLat = d14;
        this.maxLon = d15;
        this.minLat = d16;
        this.minLon = d17;
        this.polyline = arrayList;
    }

    public final ArrayList<ArrayList<Double>> a() {
        return this.polyline;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.maxLat, fVar.maxLat) && s.g(this.maxLon, fVar.maxLon) && s.g(this.minLat, fVar.minLat) && s.g(this.minLon, fVar.minLon) && s.g(this.polyline, fVar.polyline);
    }

    public final int hashCode() {
        Double d14 = this.maxLat;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.maxLon;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.minLat;
        int iHashCode3 = (iHashCode2 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.minLon;
        int iHashCode4 = (iHashCode3 + (d17 == null ? 0 : d17.hashCode())) * 31;
        ArrayList<ArrayList<Double>> arrayList = this.polyline;
        return iHashCode4 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        Double d14 = this.maxLat;
        Double d15 = this.maxLon;
        Double d16 = this.minLat;
        Double d17 = this.minLon;
        ArrayList<ArrayList<Double>> arrayList = this.polyline;
        StringBuilder sbI = tn.k.i("FullResolutionPolylineDTO(maxLat=", d14, d15, ", maxLon=", ", minLat=");
        b71.i.p(d16, d17, ", minLon=", ", polyline=", sbI);
        sbI.append(arrayList);
        sbI.append(")");
        return sbI.toString();
    }
}
