package g81;

import android.os.Parcel;
import android.os.Parcelable;
import c22.c3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lg81/n0;", "Landroid/os/Parcelable;", "Lc22/c3;", "tabTitle", "tabDisclaimerText", "Lg81/o0;", "tableState", "Lg81/e;", "chartState", "<init>", "(Lc22/c3;Lc22/c3;Lg81/o0;Lg81/e;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n0 implements Parcelable {
    public static final Parcelable.Creator<n0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f76377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c3 f76378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f76379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f76380d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<n0> {
        @Override // android.os.Parcelable.Creator
        public final n0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new n0((c3) parcel.readParcelable(n0.class.getClassLoader()), (c3) parcel.readParcelable(n0.class.getClassLoader()), parcel.readInt() == 0 ? null : o0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? e.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final n0[] newArray(int i14) {
            return new n0[i14];
        }
    }

    public n0(c3 c3Var, c3 c3Var2, o0 o0Var, e eVar) {
        c3Var.getClass();
        this.f76377a = c3Var;
        this.f76378b = c3Var2;
        this.f76379c = o0Var;
        this.f76380d = eVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return p005kotlin.jvm.internal.s.g(this.f76377a, n0Var.f76377a) && p005kotlin.jvm.internal.s.g(this.f76378b, n0Var.f76378b) && p005kotlin.jvm.internal.s.g(this.f76379c, n0Var.f76379c) && p005kotlin.jvm.internal.s.g(this.f76380d, n0Var.f76380d);
    }

    public final int hashCode() {
        int iHashCode = this.f76377a.hashCode() * 31;
        c3 c3Var = this.f76378b;
        int iHashCode2 = (iHashCode + (c3Var == null ? 0 : c3Var.hashCode())) * 31;
        o0 o0Var = this.f76379c;
        int iHashCode3 = (iHashCode2 + (o0Var == null ? 0 : o0Var.hashCode())) * 31;
        e eVar = this.f76380d;
        return iHashCode3 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        return "StaminaZoneTabState(tabTitle=" + this.f76377a + ", tabDisclaimerText=" + this.f76378b + ", tableState=" + this.f76379c + ", chartState=" + this.f76380d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f76377a, i14);
        parcel.writeParcelable(this.f76378b, i14);
        o0 o0Var = this.f76379c;
        if (o0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            o0Var.writeToParcel(parcel, i14);
        }
        e eVar = this.f76380d;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar.writeToParcel(parcel, i14);
        }
    }

    public /* synthetic */ n0(c3 c3Var, c3 c3Var2, o0 o0Var, e eVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(c3Var, (i14 & 2) != 0 ? null : c3Var2, o0Var, eVar);
    }
}
