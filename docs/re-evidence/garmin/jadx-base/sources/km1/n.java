package km1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lkm1/n;", "Landroid/os/Parcelable;", "", "startTimeGMT", "", "respirationValue", "<init>", "(JLjava/lang/Double;)V", "a", "J", "d", "()J", "setStartTimeGMT", "(J)V", "b", "Ljava/lang/Double;", "()Ljava/lang/Double;", "setRespirationValue", "(Ljava/lang/Double;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimeGMT")
    private long startTimeGMT;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("respirationValue")
    private Double respirationValue;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new n(parcel.readLong(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i14) {
            return new n[i14];
        }
    }

    public /* synthetic */ n(long j8, Double d14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? 0L : j8, (i14 & 2) != 0 ? null : d14);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getRespirationValue() {
        return this.respirationValue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getStartTimeGMT() {
        return this.startTimeGMT;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.startTimeGMT == nVar.startTimeGMT && p005kotlin.jvm.internal.s.g(this.respirationValue, nVar.respirationValue);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.startTimeGMT) * 31;
        Double d14 = this.respirationValue;
        return iHashCode + (d14 == null ? 0 : d14.hashCode());
    }

    public final String toString() {
        return "RespirationEventDTO(startTimeGMT=" + this.startTimeGMT + ", respirationValue=" + this.respirationValue + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.startTimeGMT);
        Double d14 = this.respirationValue;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
    }

    public n(long j8, Double d14) {
        this.startTimeGMT = j8;
        this.respirationValue = d14;
    }

    public n() {
        this(0L, null, 3, null);
    }
}
