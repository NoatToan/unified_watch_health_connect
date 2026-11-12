package iy0;

import am.x0;
import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Liy0/h;", "Landroid/os/Parcelable;", "", "colorArgb", "Lam/x0;", "activityType", "colorResId", "<init>", "(ILam/x0;I)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f95801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f95802c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new h(parcel.readInt(), (x0) parcel.readParcelable(h.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    public h(int i14, x0 x0Var, int i15) {
        this.f95800a = i14;
        this.f95801b = x0Var;
        this.f95802c = i15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f95800a == hVar.f95800a && this.f95801b == hVar.f95801b && this.f95802c == hVar.f95802c;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f95800a) * 31;
        x0 x0Var = this.f95801b;
        return Integer.hashCode(this.f95802c) + ((iHashCode + (x0Var == null ? 0 : x0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivityTypeColorEntry(colorArgb=");
        sb3.append(this.f95800a);
        sb3.append(", activityType=");
        sb3.append(this.f95801b);
        sb3.append(", colorResId=");
        return am.j.q(sb3, this.f95802c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f95800a);
        parcel.writeParcelable(this.f95801b, i14);
        parcel.writeInt(this.f95802c);
    }
}
