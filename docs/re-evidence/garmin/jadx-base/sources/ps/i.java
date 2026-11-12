package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lps/i;", "Landroid/os/Parcelable;", "", "lat", "lon", "weight", "<init>", "(DDD)V", "a", "D", "b", "()D", "d", "c", "f", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lat")
    private final double lat;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lon")
    private final double lon;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weight")
    private final double weight;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new i(parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public i(double d14, double d15, double d16) {
        this.lat = d14;
        this.lon = d15;
        this.weight = d16;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getLat() {
        return this.lat;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getLon() {
        return this.lon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Double.compare(this.lat, iVar.lat) == 0 && Double.compare(this.lon, iVar.lon) == 0 && Double.compare(this.weight, iVar.weight) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final double getWeight() {
        return this.weight;
    }

    public final int hashCode() {
        return Double.hashCode(this.weight) + org.apache.commons.lang3.e.b(Double.hashCode(this.lat) * 31, 31, this.lon);
    }

    public final String toString() {
        double d14 = this.lat;
        double d15 = this.lon;
        double d16 = this.weight;
        StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("ActivityHeatmapPointDTO(lat=", d14, ", lon=");
        sbA.append(d15);
        return am.j.r(sbA, ", weight=", d16, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeDouble(this.lat);
        parcel.writeDouble(this.lon);
        parcel.writeDouble(this.weight);
    }
}
