package g81;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg81/u;", "Landroid/os/Parcelable;", "Lg81/a0;", "trendUiState", "Lg81/y;", "topContributorsUiState", "<init>", "(Lg81/a0;Lg81/y;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f76407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f76408b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        public final u createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new u(parcel.readInt() == 0 ? null : a0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? y.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final u[] newArray(int i14) {
            return new u[i14];
        }
    }

    public u(a0 a0Var, y yVar) {
        this.f76407a = a0Var;
        this.f76408b = yVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return p005kotlin.jvm.internal.s.g(this.f76407a, uVar.f76407a) && p005kotlin.jvm.internal.s.g(this.f76408b, uVar.f76408b);
    }

    public final int hashCode() {
        a0 a0Var = this.f76407a;
        int iHashCode = (a0Var == null ? 0 : a0Var.hashCode()) * 31;
        y yVar = this.f76408b;
        return iHashCode + (yVar != null ? yVar.hashCode() : 0);
    }

    public final String toString() {
        return "EnduranceScoreIntervalUiState(trendUiState=" + this.f76407a + ", topContributorsUiState=" + this.f76408b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        a0 a0Var = this.f76407a;
        if (a0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            a0Var.writeToParcel(parcel, i14);
        }
        y yVar = this.f76408b;
        if (yVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yVar.writeToParcel(parcel, i14);
        }
    }
}
