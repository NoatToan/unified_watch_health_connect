package km1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lkm1/o;", "Landroid/os/Parcelable;", "", "value", "", "startGMT", "deviationCelsius", "deviationFahrenheit", "<init>", "(Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;)V", "a", "Ljava/lang/Double;", "g", "()Ljava/lang/Double;", "b", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "c", "d", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("value")
    private final Double value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startGMT")
    private final Long startGMT;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviationCelsius")
    private final Double deviationCelsius;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviationFahrenheit")
    private final Double deviationFahrenheit;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public final o createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new o(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final o[] newArray(int i14) {
            return new o[i14];
        }
    }

    public /* synthetic */ o(Double d14, Long l14, Double d15, Double d16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : l14, (i14 & 4) != 0 ? null : d15, (i14 & 8) != 0 ? null : d16);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getDeviationCelsius() {
        return this.deviationCelsius;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getDeviationFahrenheit() {
        return this.deviationFahrenheit;
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
        return p005kotlin.jvm.internal.s.g(this.value, oVar.value) && p005kotlin.jvm.internal.s.g(this.startGMT, oVar.startGMT) && p005kotlin.jvm.internal.s.g(this.deviationCelsius, oVar.deviationCelsius) && p005kotlin.jvm.internal.s.g(this.deviationFahrenheit, oVar.deviationFahrenheit);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getStartGMT() {
        return this.startGMT;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getValue() {
        return this.value;
    }

    public final int hashCode() {
        Double d14 = this.value;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Long l14 = this.startGMT;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        Double d15 = this.deviationCelsius;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.deviationFahrenheit;
        return iHashCode3 + (d16 != null ? d16.hashCode() : 0);
    }

    public final String toString() {
        Double d14 = this.value;
        Long l14 = this.startGMT;
        Double d15 = this.deviationCelsius;
        Double d16 = this.deviationFahrenheit;
        StringBuilder sb3 = new StringBuilder("SkinTempEpochDTO(value=");
        sb3.append(d14);
        sb3.append(", startGMT=");
        sb3.append(l14);
        sb3.append(", deviationCelsius=");
        return sn.a.f(d15, d16, ", deviationFahrenheit=", ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Double d14 = this.value;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Long l14 = this.startGMT;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Double d15 = this.deviationCelsius;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.deviationFahrenheit;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
    }

    public o(Double d14, Long l14, Double d15, Double d16) {
        this.value = d14;
        this.startGMT = l14;
        this.deviationCelsius = d15;
        this.deviationFahrenheit = d16;
    }

    public o() {
        this(null, null, null, null, 15, null);
    }
}
