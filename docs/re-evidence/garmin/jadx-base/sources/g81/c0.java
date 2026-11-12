package g81;

import android.os.Parcel;
import android.os.Parcelable;
import c22.c3;
import java.util.ArrayList;
import java.util.Iterator;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lg81/c0;", "Landroid/os/Parcelable;", "Lg81/u;", "trendUiState", "Lg81/l0;", "runningStaminaComparisonUiState", "cyclingStaminaComparisonUiState", "Li53/c;", "Lc22/c3;", "tabTitles", "<init>", "(Lg81/u;Lg81/l0;Lg81/l0;Li53/c;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c0 implements Parcelable {
    public static final Parcelable.Creator<c0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f76287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f76288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f76289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<c3> f76290d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c0> {
        @Override // android.os.Parcelable.Creator
        public final c0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            u uVarCreateFromParcel = parcel.readInt() == 0 ? null : u.CREATOR.createFromParcel(parcel);
            l0 l0VarCreateFromParcel = parcel.readInt() == 0 ? null : l0.CREATOR.createFromParcel(parcel);
            l0 l0VarCreateFromParcel2 = parcel.readInt() != 0 ? l0.CREATOR.createFromParcel(parcel) : null;
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iD = 0;
            while (iD != i14) {
                iD = u0.d(c0.class, parcel, arrayList, iD, 1);
            }
            return new c0(uVarCreateFromParcel, l0VarCreateFromParcel, l0VarCreateFromParcel2, i53.a.j(arrayList));
        }

        @Override // android.os.Parcelable.Creator
        public final c0[] newArray(int i14) {
            return new c0[i14];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c0(u uVar, l0 l0Var, l0 l0Var2, i53.c<? extends c3> cVar) {
        cVar.getClass();
        this.f76287a = uVar;
        this.f76288b = l0Var;
        this.f76289c = l0Var2;
        this.f76290d = cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return p005kotlin.jvm.internal.s.g(this.f76287a, c0Var.f76287a) && p005kotlin.jvm.internal.s.g(this.f76288b, c0Var.f76288b) && p005kotlin.jvm.internal.s.g(this.f76289c, c0Var.f76289c) && this.f76290d.equals(c0Var.f76290d);
    }

    public final int hashCode() {
        u uVar = this.f76287a;
        int iHashCode = (uVar == null ? 0 : uVar.hashCode()) * 31;
        l0 l0Var = this.f76288b;
        int iHashCode2 = (iHashCode + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        l0 l0Var2 = this.f76289c;
        return this.f76290d.hashCode() + ((iHashCode2 + (l0Var2 != null ? l0Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "EnduranceStaminaTrendUiState(trendUiState=" + this.f76287a + ", runningStaminaComparisonUiState=" + this.f76288b + ", cyclingStaminaComparisonUiState=" + this.f76289c + ", tabTitles=" + this.f76290d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        u uVar = this.f76287a;
        if (uVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uVar.writeToParcel(parcel, i14);
        }
        l0 l0Var = this.f76288b;
        if (l0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            l0Var.writeToParcel(parcel, i14);
        }
        l0 l0Var2 = this.f76289c;
        if (l0Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            l0Var2.writeToParcel(parcel, i14);
        }
        Iterator itG = j20.x.g(this.f76290d, parcel);
        while (itG.hasNext()) {
            parcel.writeParcelable((Parcelable) itG.next(), i14);
        }
    }
}
