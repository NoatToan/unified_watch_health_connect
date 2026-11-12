package fy1;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.j;
import ds.e0;
import i3.e5;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lfy1/d;", "Landroid/os/Parcelable;", "", "goalTypeScreen", "overallGoalScreen", "swimmingLegScreen", "cyclingLegScreen", "runningLegScreen", "legReviewScreen", "<init>", "(IIIIII)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f73890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f73891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f73892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f73893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f73894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f73895f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public d(int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f73890a = i14;
        this.f73891b = i15;
        this.f73892c = i16;
        this.f73893d = i17;
        this.f73894e = i18;
        this.f73895f = i19;
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
        return this.f73890a == dVar.f73890a && this.f73891b == dVar.f73891b && this.f73892c == dVar.f73892c && this.f73893d == dVar.f73893d && this.f73894e == dVar.f73894e && this.f73895f == dVar.f73895f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f73895f) + q2.d(this.f73894e, q2.d(this.f73893d, q2.d(this.f73892c, q2.d(this.f73891b, Integer.hashCode(this.f73890a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbJ = e5.j(this.f73890a, this.f73891b, "FBTTriathlonGoalSteps(goalTypeScreen=", ", overallGoalScreen=", ", swimmingLegScreen=");
        e0.m(this.f73892c, this.f73893d, ", cyclingLegScreen=", ", runningLegScreen=", sbJ);
        return j.e(this.f73894e, this.f73895f, ", legReviewScreen=", ")", sbJ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f73890a);
        parcel.writeInt(this.f73891b);
        parcel.writeInt(this.f73892c);
        parcel.writeInt(this.f73893d);
        parcel.writeInt(this.f73894e);
        parcel.writeInt(this.f73895f);
    }
}
