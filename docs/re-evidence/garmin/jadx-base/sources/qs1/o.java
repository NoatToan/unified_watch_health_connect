package qs1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001c"}, d2 = {"Lqs1/o;", "Landroid/os/Parcelable;", "", "searchString", "locale", "", "mapNorthLatitude", "mapSouthLatitude", "mapEastLongitude", "mapWestLongitude", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "a", "Ljava/lang/String;", "getSearchString", "()Ljava/lang/String;", "b", "getLocale", "c", "Ljava/lang/Double;", "getMapNorthLatitude", "()Ljava/lang/Double;", "d", "getMapSouthLatitude", JWKParameterNames.RSA_EXPONENT, "getMapEastLongitude", "f", "getMapWestLongitude", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("searchString")
    private final String searchString;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("locale")
    private final String locale;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mapNorthLatitude")
    private final Double mapNorthLatitude;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mapSouthLatitude")
    private final Double mapSouthLatitude;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mapEastLongitude")
    private final Double mapEastLongitude;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mapWestLongitude")
    private final Double mapWestLongitude;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public final o createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new o(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final o[] newArray(int i14) {
            return new o[i14];
        }
    }

    public /* synthetic */ o(String str, String str2, Double d14, Double d15, Double d16, Double d17, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, (i14 & 4) != 0 ? null : d14, (i14 & 8) != 0 ? null : d15, (i14 & 16) != 0 ? null : d16, (i14 & 32) != 0 ? null : d17);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return p005kotlin.jvm.internal.s.g(this.searchString, oVar.searchString) && p005kotlin.jvm.internal.s.g(this.locale, oVar.locale) && p005kotlin.jvm.internal.s.g(this.mapNorthLatitude, oVar.mapNorthLatitude) && p005kotlin.jvm.internal.s.g(this.mapSouthLatitude, oVar.mapSouthLatitude) && p005kotlin.jvm.internal.s.g(this.mapEastLongitude, oVar.mapEastLongitude) && p005kotlin.jvm.internal.s.g(this.mapWestLongitude, oVar.mapWestLongitude);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.searchString.hashCode() * 31, 31, this.locale);
        Double d14 = this.mapNorthLatitude;
        int iHashCode = (iJ + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.mapSouthLatitude;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.mapEastLongitude;
        int iHashCode3 = (iHashCode2 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.mapWestLongitude;
        return iHashCode3 + (d17 != null ? d17.hashCode() : 0);
    }

    public final String toString() {
        String str = this.searchString;
        String str2 = this.locale;
        Double d14 = this.mapNorthLatitude;
        Double d15 = this.mapSouthLatitude;
        Double d16 = this.mapEastLongitude;
        Double d17 = this.mapWestLongitude;
        StringBuilder sbI = p6.b.i("SearchRequestDTO(searchString=", str, ", locale=", str2, ", mapNorthLatitude=");
        b71.i.p(d14, d15, ", mapSouthLatitude=", ", mapEastLongitude=", sbI);
        return sn.a.f(d16, d17, ", mapWestLongitude=", ")", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.searchString);
        parcel.writeString(this.locale);
        Double d14 = this.mapNorthLatitude;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.mapSouthLatitude;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.mapEastLongitude;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.mapWestLongitude;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
    }

    public o(String str, String str2, Double d14, Double d15, Double d16, Double d17) {
        str.getClass();
        str2.getClass();
        this.searchString = str;
        this.locale = str2;
        this.mapNorthLatitude = d14;
        this.mapSouthLatitude = d15;
        this.mapEastLongitude = d16;
        this.mapWestLongitude = d17;
    }
}
