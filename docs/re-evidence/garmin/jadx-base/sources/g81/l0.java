package g81;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg81/l0;", "Landroid/os/Parcelable;", "Lg81/k0;", "staminaTimeTableState", "staminaDistanceTableState", "<init>", "(Lg81/k0;Lg81/k0;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l0 implements Parcelable {
    public static final Parcelable.Creator<l0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f76364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f76365b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l0> {
        @Override // android.os.Parcelable.Creator
        public final l0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new l0(parcel.readInt() == 0 ? null : k0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? k0.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final l0[] newArray(int i14) {
            return new l0[i14];
        }
    }

    public l0(k0 k0Var, k0 k0Var2) {
        this.f76364a = k0Var;
        this.f76365b = k0Var2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return p005kotlin.jvm.internal.s.g(this.f76364a, l0Var.f76364a) && p005kotlin.jvm.internal.s.g(this.f76365b, l0Var.f76365b);
    }

    public final int hashCode() {
        k0 k0Var = this.f76364a;
        int iHashCode = (k0Var == null ? 0 : k0Var.hashCode()) * 31;
        k0 k0Var2 = this.f76365b;
        return iHashCode + (k0Var2 != null ? k0Var2.hashCode() : 0);
    }

    public final String toString() {
        return "StaminaComparisonUiState(staminaTimeTableState=" + this.f76364a + ", staminaDistanceTableState=" + this.f76365b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        k0 k0Var = this.f76364a;
        if (k0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            k0Var.writeToParcel(parcel, i14);
        }
        k0 k0Var2 = this.f76365b;
        if (k0Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            k0Var2.writeToParcel(parcel, i14);
        }
    }
}
