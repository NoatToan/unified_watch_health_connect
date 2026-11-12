package j61;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Lj61/f;", "Landroid/os/Parcelable;", "", "elevationGainMeter", "", "elevationProfileType", "hillType", "<init>", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/Double;", "d", "()Ljava/lang/Double;", "b", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "c", "g", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevationGainMeter")
    private final Double elevationGainMeter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevationProfileType")
    private final String elevationProfileType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hillType")
    private final String hillType;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public /* synthetic */ f(Double d14, String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2);
    }

    public static f b(f fVar, Double d14, String str, String str2, int i14) {
        if ((i14 & 1) != 0) {
            d14 = fVar.elevationGainMeter;
        }
        if ((i14 & 2) != 0) {
            str = fVar.elevationProfileType;
        }
        if ((i14 & 4) != 0) {
            str2 = fVar.hillType;
        }
        return new f(d14, str, str2);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getElevationGainMeter() {
        return this.elevationGainMeter;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.elevationGainMeter, fVar.elevationGainMeter) && s.g(this.elevationProfileType, fVar.elevationProfileType) && s.g(this.hillType, fVar.hillType);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getElevationProfileType() {
        return this.elevationProfileType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getHillType() {
        return this.hillType;
    }

    public final int hashCode() {
        Double d14 = this.elevationGainMeter;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        String str = this.elevationProfileType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.hillType;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        Double d14 = this.elevationGainMeter;
        String str = this.elevationProfileType;
        String str2 = this.hillType;
        StringBuilder sb3 = new StringBuilder("CourseProfileDTO(elevationGainMeter=");
        sb3.append(d14);
        sb3.append(", elevationProfileType=");
        sb3.append(str);
        sb3.append(", hillType=");
        return am.j.o(str2, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Double d14 = this.elevationGainMeter;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        parcel.writeString(this.elevationProfileType);
        parcel.writeString(this.hillType);
    }

    public f(Double d14, String str, String str2) {
        this.elevationGainMeter = d14;
        this.elevationProfileType = str;
        this.hillType = str2;
    }

    public f() {
        this(null, null, null, 7, null);
    }
}
