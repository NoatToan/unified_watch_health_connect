package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lps/d2;", "Landroid/os/Parcelable;", "", "description", "image", "", "weatherTypePk", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "getImage", "c", "Ljava/lang/Long;", "getWeatherTypePk", "()Ljava/lang/Long;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d2 implements Parcelable {
    public static final Parcelable.Creator<d2> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("desc")
    private final String description;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("image")
    private final String image;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weatherTypePk")
    private final Long weatherTypePk;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d2> {
        @Override // android.os.Parcelable.Creator
        public final d2 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d2(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final d2[] newArray(int i14) {
            return new d2[i14];
        }
    }

    public d2(String str, String str2, Long l14) {
        this.description = str;
        this.image = str2;
        this.weatherTypePk = l14;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return p005kotlin.jvm.internal.s.g(this.description, d2Var.description) && p005kotlin.jvm.internal.s.g(this.image, d2Var.image) && p005kotlin.jvm.internal.s.g(this.weatherTypePk, d2Var.weatherTypePk);
    }

    public final int hashCode() {
        String str = this.description;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.image;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l14 = this.weatherTypePk;
        return iHashCode2 + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        String str = this.description;
        String str2 = this.image;
        return p6.b.g(p6.b.i("WeatherTypeDTO(description=", str, ", image=", str2, ", weatherTypePk="), this.weatherTypePk, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.description);
        parcel.writeString(this.image);
        Long l14 = this.weatherTypePk;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
    }
}
