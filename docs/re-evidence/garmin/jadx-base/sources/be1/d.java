package be1;

import android.os.Parcel;
import android.os.Parcelable;
import c22.t;
import ds.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbe1/d;", "Landroid/os/Parcelable;", "", "timestamp", "", "respiration", "<init>", "(JD)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f17747b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.readLong(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public d(long j8, double d14) {
        this.f17746a = j8;
        this.f17747b = d14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f17746a == dVar.f17746a && Double.compare(this.f17747b, dVar.f17747b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f17747b) + (Long.hashCode(this.f17746a) * 31);
    }

    public final String toString() {
        return t.d(this.f17747b, ")", e0.k(this.f17746a, "RespirationValue(timestamp=", ", respiration="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f17746a);
        parcel.writeDouble(this.f17747b);
    }
}
