package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"Lps/r1;", "Landroid/os/Parcelable;", "", "secsInZone", "zoneLowBoundary", "", "zoneNumber", "zoneLowBoundaryWithPrecision", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;)V", "a", "Ljava/lang/Double;", "d", "()Ljava/lang/Double;", "b", "f", "c", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "g", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r1 implements Parcelable {
    public static final Parcelable.Creator<r1> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("secsInZone")
    private final Double secsInZone;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("zoneLowBoundary")
    private final Double zoneLowBoundary;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("zoneNumber")
    private final Integer zoneNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("zoneLowBoundaryWithPrecision")
    private final Double zoneLowBoundaryWithPrecision;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<r1> {
        @Override // android.os.Parcelable.Creator
        public final r1 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new r1(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final r1[] newArray(int i14) {
            return new r1[i14];
        }
    }

    public r1(Double d14, Double d15, Integer num, Double d16) {
        this.secsInZone = d14;
        this.zoneLowBoundary = d15;
        this.zoneNumber = num;
        this.zoneLowBoundaryWithPrecision = d16;
    }

    public static r1 b(r1 r1Var, Double d14) {
        return new r1(d14, r1Var.zoneLowBoundary, r1Var.zoneNumber, r1Var.zoneLowBoundaryWithPrecision);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getSecsInZone() {
        return this.secsInZone;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return p005kotlin.jvm.internal.s.g(this.secsInZone, r1Var.secsInZone) && p005kotlin.jvm.internal.s.g(this.zoneLowBoundary, r1Var.zoneLowBoundary) && p005kotlin.jvm.internal.s.g(this.zoneNumber, r1Var.zoneNumber) && p005kotlin.jvm.internal.s.g(this.zoneLowBoundaryWithPrecision, r1Var.zoneLowBoundaryWithPrecision);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getZoneLowBoundary() {
        return this.zoneLowBoundary;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getZoneLowBoundaryWithPrecision() {
        return this.zoneLowBoundaryWithPrecision;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getZoneNumber() {
        return this.zoneNumber;
    }

    public final int hashCode() {
        Double d14 = this.secsInZone;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Double d15 = this.zoneLowBoundary;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        Integer num = this.zoneNumber;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Double d16 = this.zoneLowBoundaryWithPrecision;
        return iHashCode3 + (d16 != null ? d16.hashCode() : 0);
    }

    public final String toString() {
        Double d14 = this.secsInZone;
        Double d15 = this.zoneLowBoundary;
        Integer num = this.zoneNumber;
        Double d16 = this.zoneLowBoundaryWithPrecision;
        StringBuilder sbI = tn.k.i("TimeInZoneDTO(secsInZone=", d14, d15, ", zoneLowBoundary=", ", zoneNumber=");
        sbI.append(num);
        sbI.append(", zoneLowBoundaryWithPrecision=");
        sbI.append(d16);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Double d14 = this.secsInZone;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.zoneLowBoundary;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Integer num = this.zoneNumber;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Double d16 = this.zoneLowBoundaryWithPrecision;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
    }

    public /* synthetic */ r1(Double d14, Double d15, Integer num, Double d16, int i14, p005kotlin.jvm.internal.j jVar) {
        this(d14, d15, num, (i14 & 8) != 0 ? null : d16);
    }
}
