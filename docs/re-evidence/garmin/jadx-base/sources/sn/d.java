package sn;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsn/d;", "Landroid/os/Parcelable;", "", "timestamp", "", "value", "<init>", "(JLjava/lang/Float;)V", "model_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f160371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Float f160372b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.readLong(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public d(long j8, Float f14) {
        this.f160371a = j8;
        this.f160372b = f14;
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
        return this.f160371a == dVar.f160371a && s.g(this.f160372b, dVar.f160372b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f160371a) * 31;
        Float f14 = this.f160372b;
        return iHashCode + (f14 == null ? 0 : f14.hashCode());
    }

    public final String toString() {
        return "ChartData(timestamp=" + this.f160371a + ", value=" + this.f160372b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f160371a);
        Float f14 = this.f160372b;
        if (f14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f14.floatValue());
        }
    }
}
