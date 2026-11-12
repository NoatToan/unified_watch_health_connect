package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0013\u0010\u000fR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lps/h;", "Landroid/os/Parcelable;", "", "lowerLeftLat", "lowerLeftLon", "upperRightLat", "upperRightLon", "", "Lps/i;", "points", "<init>", "(DDDDLjava/util/List;)V", "a", "D", "b", "()D", "d", "c", "g", "h", JWKParameterNames.RSA_EXPONENT, "Ljava/util/List;", "f", "()Ljava/util/List;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lowerLeftLat")
    private final double lowerLeftLat;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lowerLeftLon")
    private final double lowerLeftLon;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("upperRightLat")
    private final double upperRightLat;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("upperRightLon")
    private final double upperRightLon;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("points")
    private final List<i> points;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            parcel.getClass();
            double d14 = parcel.readDouble();
            double d15 = parcel.readDouble();
            double d16 = parcel.readDouble();
            double d17 = parcel.readDouble();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(i.CREATOR, parcel, arrayList, iA, 1);
            }
            return new h(d14, d15, d16, d17, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    public h(double d14, double d15, double d16, double d17, List<i> list) {
        list.getClass();
        this.lowerLeftLat = d14;
        this.lowerLeftLon = d15;
        this.upperRightLat = d16;
        this.upperRightLon = d17;
        this.points = list;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getLowerLeftLat() {
        return this.lowerLeftLat;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getLowerLeftLon() {
        return this.lowerLeftLon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Double.compare(this.lowerLeftLat, hVar.lowerLeftLat) == 0 && Double.compare(this.lowerLeftLon, hVar.lowerLeftLon) == 0 && Double.compare(this.upperRightLat, hVar.upperRightLat) == 0 && Double.compare(this.upperRightLon, hVar.upperRightLon) == 0 && p005kotlin.jvm.internal.s.g(this.points, hVar.points);
    }

    public final List<i> f() {
        return this.points;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final double getUpperRightLat() {
        return this.upperRightLat;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final double getUpperRightLon() {
        return this.upperRightLon;
    }

    public final int hashCode() {
        return this.points.hashCode() + org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(Double.hashCode(this.lowerLeftLat) * 31, 31, this.lowerLeftLon), 31, this.upperRightLat), 31, this.upperRightLon);
    }

    public final String toString() {
        double d14 = this.lowerLeftLat;
        double d15 = this.lowerLeftLon;
        double d16 = this.upperRightLat;
        double d17 = this.upperRightLon;
        List<i> list = this.points;
        StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("ActivityHeatmapDTO(lowerLeftLat=", d14, ", lowerLeftLon=");
        sbA.append(d15);
        am.j.x(sbA, ", upperRightLat=", d16, ", upperRightLon=");
        sbA.append(d17);
        sbA.append(", points=");
        sbA.append(list);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeDouble(this.lowerLeftLat);
        parcel.writeDouble(this.lowerLeftLon);
        parcel.writeDouble(this.upperRightLat);
        parcel.writeDouble(this.upperRightLon);
        Iterator itE = kg.f.e(this.points, parcel);
        while (itE.hasNext()) {
            ((i) itE.next()).writeToParcel(parcel, i14);
        }
    }
}
