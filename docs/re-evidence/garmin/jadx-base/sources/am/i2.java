package am;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012¨\u0006\u0017"}, d2 = {"Lam/i2;", "Landroid/os/Parcelable;", "", "count", "", "min", "max", "avg", "sum", "<init>", "(IDDDD)V", "a", "I", "d", "()I", "b", "D", "getMin", "()D", "c", "f", JWKParameterNames.RSA_EXPONENT, "g", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i2 implements Parcelable {
    public static final Parcelable.Creator<i2> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("count")
    private final int count;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("min")
    private final double min;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("max")
    private final double max;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avg")
    private final double avg;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sum")
    private final double sum;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i2> {
        @Override // android.os.Parcelable.Creator
        public final i2 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new i2(parcel.readInt(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final i2[] newArray(int i14) {
            return new i2[i14];
        }
    }

    public i2(int i14, double d14, double d15, double d16, double d17) {
        this.count = i14;
        this.min = d14;
        this.max = d15;
        this.avg = d16;
        this.sum = d17;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getAvg() {
        return this.avg;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return this.count == i2Var.count && Double.compare(this.min, i2Var.min) == 0 && Double.compare(this.max, i2Var.max) == 0 && Double.compare(this.avg, i2Var.avg) == 0 && Double.compare(this.sum, i2Var.sum) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final double getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final double getSum() {
        return this.sum;
    }

    public final int hashCode() {
        return Double.hashCode(this.sum) + org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(Integer.hashCode(this.count) * 31, 31, this.min), 31, this.max), 31, this.avg);
    }

    public final String toString() {
        int i14 = this.count;
        double d14 = this.min;
        double d15 = this.max;
        double d16 = this.avg;
        double d17 = this.sum;
        StringBuilder sb3 = new StringBuilder("StatsDTO(count=");
        sb3.append(i14);
        sb3.append(", min=");
        sb3.append(d14);
        j.x(sb3, ", max=", d15, ", avg=");
        sb3.append(d16);
        return j.r(sb3, ", sum=", d17, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.count);
        parcel.writeDouble(this.min);
        parcel.writeDouble(this.max);
        parcel.writeDouble(this.avg);
        parcel.writeDouble(this.sum);
    }
}
