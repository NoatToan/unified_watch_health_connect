package g81;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg81/f;", "Landroid/os/Parcelable;", "Lg81/n0;", "staminaZonesByTime", "staminaZonesByDistance", "<init>", "(Lg81/n0;Lg81/n0;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f76320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f76321b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f(parcel.readInt() == 0 ? null : n0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? n0.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public f(n0 n0Var, n0 n0Var2) {
        this.f76320a = n0Var;
        this.f76321b = n0Var2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p005kotlin.jvm.internal.s.g(this.f76320a, fVar.f76320a) && p005kotlin.jvm.internal.s.g(this.f76321b, fVar.f76321b);
    }

    public final int hashCode() {
        n0 n0Var = this.f76320a;
        int iHashCode = (n0Var == null ? 0 : n0Var.hashCode()) * 31;
        n0 n0Var2 = this.f76321b;
        return iHashCode + (n0Var2 != null ? n0Var2.hashCode() : 0);
    }

    public final String toString() {
        return "DailyStaminaUiState(staminaZonesByTime=" + this.f76320a + ", staminaZonesByDistance=" + this.f76321b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        n0 n0Var = this.f76320a;
        if (n0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            n0Var.writeToParcel(parcel, i14);
        }
        n0 n0Var2 = this.f76321b;
        if (n0Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            n0Var2.writeToParcel(parcel, i14);
        }
    }
}
