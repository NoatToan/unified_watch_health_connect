package iy0;

import am.x0;
import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Liy0/i;", "Landroid/os/Parcelable;", "Lam/x0;", "activityType", "Lb63/o;", "date", "", "time", "<init>", "(Lam/x0;Lb63/o;J)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f95803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b63.o f95804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f95805c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new i((x0) parcel.readParcelable(i.class.getClassLoader()), (b63.o) parcel.readSerializable(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public i(x0 x0Var, b63.o oVar, long j8) {
        x0Var.getClass();
        oVar.getClass();
        this.f95803a = x0Var;
        this.f95804b = oVar;
        this.f95805c = j8;
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
        return this.f95803a == iVar.f95803a && this.f95804b.equals(iVar.f95804b) && this.f95805c == iVar.f95805c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f95805c) + n23.j.a(this.f95804b.f16206a, this.f95803a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivityTypeTimeEntry(activityType=");
        sb3.append(this.f95803a);
        sb3.append(", date=");
        sb3.append(this.f95804b);
        sb3.append(", time=");
        return am.j.i(this.f95805c, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f95803a, i14);
        parcel.writeSerializable(this.f95804b);
        parcel.writeLong(this.f95805c);
    }
}
