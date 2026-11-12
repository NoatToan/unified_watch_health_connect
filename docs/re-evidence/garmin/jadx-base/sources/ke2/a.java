package ke2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import tn.k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lke2/a;", "Landroid/os/Parcelable;", "", "northLatitude", "southLatitude", "eastLongitude", "westLongitude", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "a", "Ljava/lang/Double;", "f", "()Ljava/lang/Double;", "b", "g", "c", "d", "h", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2001a();

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

    /* JADX INFO: renamed from: ke2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C2001a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(Double d14, Double d15, Double d16, Double d17, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : d15, (i14 & 4) != 0 ? null : d16, (i14 & 8) != 0 ? null : d17);
    }

    public static a b(a aVar, Double d14) {
        return new a(aVar.northLatitude, d14, aVar.eastLongitude, aVar.westLongitude);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getEastLongitude() {
        return this.eastLongitude;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.northLatitude, aVar.northLatitude) && s.g(this.southLatitude, aVar.southLatitude) && s.g(this.eastLongitude, aVar.eastLongitude) && s.g(this.westLongitude, aVar.westLongitude);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getNorthLatitude() {
        return this.northLatitude;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getSouthLatitude() {
        return this.southLatitude;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Double getWestLongitude() {
        return this.westLongitude;
    }

    public final int hashCode() {
        Double d14 = this.northLatitude;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.southLatitude;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.eastLongitude;
        int iHashCode3 = (iHashCode2 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.westLongitude;
        return iHashCode3 + (d17 != null ? d17.hashCode() : 0);
    }

    public final String toString() {
        return sn.a.f(this.eastLongitude, this.westLongitude, ", westLongitude=", ")", k.i("BoundingBoxDTO(northLatitude=", this.northLatitude, this.southLatitude, ", southLatitude=", ", eastLongitude="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Double d14 = this.northLatitude;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.southLatitude;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.eastLongitude;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.westLongitude;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
    }

    public a(Double d14, Double d15, Double d16, Double d17) {
        this.northLatitude = d14;
        this.southLatitude = d15;
        this.eastLongitude = d16;
        this.westLongitude = d17;
    }

    public a() {
        this(null, null, null, null, 15, null);
    }
}
