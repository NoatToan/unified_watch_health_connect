package km1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0014¨\u0006\u001a"}, d2 = {"Lkm1/m;", "Landroid/os/Parcelable;", "", "epochEndTimestampGmt", "", "respirationAverageValue", "respirationHighValue", "respirationLowValue", "<init>", "(JLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "a", "J", "b", "()J", "setEpochEndTimestampGmt", "(J)V", "Ljava/lang/Double;", "d", "()Ljava/lang/Double;", "setRespirationAverageValue", "(Ljava/lang/Double;)V", "c", "f", "setRespirationHighValue", "g", "setRespirationLowValue", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("epochEndTimestampGmt")
    private long epochEndTimestampGmt;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("respirationAverageValue")
    private Double respirationAverageValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("respirationHighValue")
    private Double respirationHighValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("respirationLowValue")
    private Double respirationLowValue;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new m(parcel.readLong(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i14) {
            return new m[i14];
        }
    }

    public /* synthetic */ m(long j8, Double d14, Double d15, Double d16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? 0L : j8, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : d15, (i14 & 8) != 0 ? null : d16);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getEpochEndTimestampGmt() {
        return this.epochEndTimestampGmt;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getRespirationAverageValue() {
        return this.respirationAverageValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.epochEndTimestampGmt == mVar.epochEndTimestampGmt && p005kotlin.jvm.internal.s.g(this.respirationAverageValue, mVar.respirationAverageValue) && p005kotlin.jvm.internal.s.g(this.respirationHighValue, mVar.respirationHighValue) && p005kotlin.jvm.internal.s.g(this.respirationLowValue, mVar.respirationLowValue);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getRespirationHighValue() {
        return this.respirationHighValue;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getRespirationLowValue() {
        return this.respirationLowValue;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.epochEndTimestampGmt) * 31;
        Double d14 = this.respirationAverageValue;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.respirationHighValue;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.respirationLowValue;
        return iHashCode3 + (d16 != null ? d16.hashCode() : 0);
    }

    public final String toString() {
        long j8 = this.epochEndTimestampGmt;
        Double d14 = this.respirationAverageValue;
        Double d15 = this.respirationHighValue;
        Double d16 = this.respirationLowValue;
        StringBuilder sb3 = new StringBuilder("RespirationAveragesEventDTO(epochEndTimestampGmt=");
        sb3.append(j8);
        sb3.append(", respirationAverageValue=");
        sb3.append(d14);
        sn.a.p(d15, d16, ", respirationHighValue=", ", respirationLowValue=", sb3);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.epochEndTimestampGmt);
        Double d14 = this.respirationAverageValue;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.respirationHighValue;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.respirationLowValue;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
    }

    public m(long j8, Double d14, Double d15, Double d16) {
        this.epochEndTimestampGmt = j8;
        this.respirationAverageValue = d14;
        this.respirationHighValue = d15;
        this.respirationLowValue = d16;
    }

    public m() {
        this(0L, null, null, null, 15, null);
    }
}
