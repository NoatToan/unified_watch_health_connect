package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lps/i0;", "Landroid/os/Parcelable;", "Lps/u;", "apnea", "Lps/l0;", "performance", "", "elevation", "<init>", "(Lps/u;Lps/l0;Ljava/lang/Double;)V", "a", "Lps/u;", "b", "()Lps/u;", "Lps/l0;", "f", "()Lps/l0;", "c", "Ljava/lang/Double;", "d", "()Ljava/lang/Double;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i0 implements Parcelable {
    public static final Parcelable.Creator<i0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("apnea")
    private final u apnea;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("performance")
    private final l0 performance;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevation")
    private final Double elevation;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i0> {
        @Override // android.os.Parcelable.Creator
        public final i0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new i0(parcel.readInt() == 0 ? null : u.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : l0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final i0[] newArray(int i14) {
            return new i0[i14];
        }
    }

    public /* synthetic */ i0(u uVar, l0 l0Var, Double d14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : uVar, (i14 & 2) != 0 ? null : l0Var, (i14 & 4) != 0 ? null : d14);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final u getApnea() {
        return this.apnea;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getElevation() {
        return this.elevation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return p005kotlin.jvm.internal.s.g(this.apnea, i0Var.apnea) && p005kotlin.jvm.internal.s.g(this.performance, i0Var.performance) && p005kotlin.jvm.internal.s.g(this.elevation, i0Var.elevation);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final l0 getPerformance() {
        return this.performance;
    }

    public final int hashCode() {
        u uVar = this.apnea;
        int iHashCode = (uVar == null ? 0 : uVar.hashCode()) * 31;
        l0 l0Var = this.performance;
        int iHashCode2 = (iHashCode + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        Double d14 = this.elevation;
        return iHashCode2 + (d14 != null ? d14.hashCode() : 0);
    }

    public final String toString() {
        u uVar = this.apnea;
        l0 l0Var = this.performance;
        Double d14 = this.elevation;
        StringBuilder sb3 = new StringBuilder("DiveActivityDTO(apnea=");
        sb3.append(uVar);
        sb3.append(", performance=");
        sb3.append(l0Var);
        sb3.append(", elevation=");
        return b71.i.g(sb3, d14, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        u uVar = this.apnea;
        if (uVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uVar.writeToParcel(parcel, i14);
        }
        l0 l0Var = this.performance;
        if (l0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            l0Var.writeToParcel(parcel, i14);
        }
        Double d14 = this.elevation;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
    }

    public i0(u uVar, l0 l0Var, Double d14) {
        this.apnea = uVar;
        this.performance = l0Var;
        this.elevation = d14;
    }

    public i0() {
        this(null, null, null, 7, null);
    }
}
