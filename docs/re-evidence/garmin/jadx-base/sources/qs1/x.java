package qs1;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lqs1/x;", "", "", "northLatitude", "southLatitude", "eastLongitude", "westLongitude", "", "decreaseLineDensity", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Z)V", "a", "Ljava/lang/Double;", "getNorthLatitude", "()Ljava/lang/Double;", "b", "getSouthLatitude", "c", "getEastLongitude", "d", "getWestLongitude", JWKParameterNames.RSA_EXPONENT, "Z", "getDecreaseLineDensity", "()Z", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("northLatitude")
    private final Double northLatitude;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("southLatitude")
    private final Double southLatitude;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eastLongitude")
    private final Double eastLongitude;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("westLongitude")
    private final Double westLongitude;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("decreaseLineDensity")
    private final boolean decreaseLineDensity;

    public /* synthetic */ x(Double d14, Double d15, Double d16, Double d17, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : d15, (i14 & 4) != 0 ? null : d16, (i14 & 8) != 0 ? null : d17, (i14 & 16) != 0 ? false : z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return p005kotlin.jvm.internal.s.g(this.northLatitude, xVar.northLatitude) && p005kotlin.jvm.internal.s.g(this.southLatitude, xVar.southLatitude) && p005kotlin.jvm.internal.s.g(this.eastLongitude, xVar.eastLongitude) && p005kotlin.jvm.internal.s.g(this.westLongitude, xVar.westLongitude) && this.decreaseLineDensity == xVar.decreaseLineDensity;
    }

    public final int hashCode() {
        Double d14 = this.northLatitude;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.southLatitude;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.eastLongitude;
        int iHashCode3 = (iHashCode2 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.westLongitude;
        return Boolean.hashCode(this.decreaseLineDensity) + ((iHashCode3 + (d17 != null ? d17.hashCode() : 0)) * 31);
    }

    public final String toString() {
        Double d14 = this.northLatitude;
        Double d15 = this.southLatitude;
        Double d16 = this.eastLongitude;
        Double d17 = this.westLongitude;
        boolean z14 = this.decreaseLineDensity;
        StringBuilder sbI = tn.k.i("TrailsFetchRequestDTO(northLatitude=", d14, d15, ", southLatitude=", ", eastLongitude=");
        b71.i.p(d16, d17, ", westLongitude=", ", decreaseLineDensity=", sbI);
        return hb.a.k(sbI, z14, ")");
    }

    public x(Double d14, Double d15, Double d16, Double d17, boolean z14) {
        this.northLatitude = d14;
        this.southLatitude = d15;
        this.eastLongitude = d16;
        this.westLongitude = d17;
        this.decreaseLineDensity = z14;
    }

    public x() {
        this(null, null, null, null, false, 31, null);
    }
}
