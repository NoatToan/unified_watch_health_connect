package sn;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u0019"}, d2 = {"Lsn/i;", "Landroid/os/Parcelable;", "", "timestampGmt", "", "heartRate", "stress", "spo2", "respiration", "<init>", "(JLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "a", "J", "getTimestampGmt", "()J", "b", "Ljava/lang/Double;", "getHeartRate", "()Ljava/lang/Double;", "c", "getStress", "d", "getSpo2", JWKParameterNames.RSA_EXPONENT, "getRespiration", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timestampGmt")
    private final long timestampGmt;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("heartRate")
    private final Double heartRate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stress")
    private final Double stress;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("spo2")
    private final Double spo2;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("respiration")
    private final Double respiration;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new i(parcel.readLong(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public /* synthetic */ i(long j8, Double d14, Double d15, Double d16, Double d17, int i14, j jVar) {
        this(j8, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : d15, (i14 & 8) != 0 ? null : d16, (i14 & 16) != 0 ? null : d17);
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
        return this.timestampGmt == iVar.timestampGmt && s.g(this.heartRate, iVar.heartRate) && s.g(this.stress, iVar.stress) && s.g(this.spo2, iVar.spo2) && s.g(this.respiration, iVar.respiration);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.timestampGmt) * 31;
        Double d14 = this.heartRate;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.stress;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.spo2;
        int iHashCode4 = (iHashCode3 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.respiration;
        return iHashCode4 + (d17 != null ? d17.hashCode() : 0);
    }

    public final String toString() {
        long j8 = this.timestampGmt;
        Double d14 = this.heartRate;
        Double d15 = this.stress;
        Double d16 = this.spo2;
        Double d17 = this.respiration;
        StringBuilder sb3 = new StringBuilder("WellnessContentDTO(timestampGmt=");
        sb3.append(j8);
        sb3.append(", heartRate=");
        sb3.append(d14);
        sn.a.p(d15, d16, ", stress=", ", spo2=", sb3);
        sb3.append(", respiration=");
        sb3.append(d17);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.timestampGmt);
        Double d14 = this.heartRate;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.stress;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.spo2;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.respiration;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
    }

    public i(long j8, Double d14, Double d15, Double d16, Double d17) {
        this.timestampGmt = j8;
        this.heartRate = d14;
        this.stress = d15;
        this.spo2 = d16;
        this.respiration = d17;
    }
}
