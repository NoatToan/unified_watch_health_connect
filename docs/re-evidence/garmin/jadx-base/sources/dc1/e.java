package dc1;

import android.os.Parcel;
import android.os.Parcelable;
import ds.e0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ldc1/e;", "Landroid/os/Parcelable;", "", "timestamp", "", "spo2Level", "monitoringEnvironmentLevel", "<init>", "(JDLjava/lang/Double;)V", "gcm-pulseox_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f59144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f59145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f59146c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new e(parcel.readLong(), parcel.readDouble(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public /* synthetic */ e(long j8, double d14, Double d15, int i14, j jVar) {
        this(j8, d14, (i14 & 4) != 0 ? null : d15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f59144a == eVar.f59144a && Double.compare(this.f59145b, eVar.f59145b) == 0 && s.g(this.f59146c, eVar.f59146c);
    }

    public final int hashCode() {
        int iB = org.apache.commons.lang3.e.b(Long.hashCode(this.f59144a) * 31, 31, this.f59145b);
        Double d14 = this.f59146c;
        return iB + (d14 == null ? 0 : d14.hashCode());
    }

    public final String toString() {
        StringBuilder sbK = e0.k(this.f59144a, "SpO2HourlyAverageDTO(timestamp=", ", spo2Level=");
        sbK.append(this.f59145b);
        sbK.append(", monitoringEnvironmentLevel=");
        sbK.append(this.f59146c);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f59144a);
        parcel.writeDouble(this.f59145b);
        Double d14 = this.f59146c;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
    }

    public e(long j8, double d14, Double d15) {
        this.f59144a = j8;
        this.f59145b = d14;
        this.f59146c = d15;
    }
}
