package ep;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import ps.i1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lep/g;", "Landroid/os/Parcelable;", "Lps/o;", "activityPowerCurve", "Lps/i1;", "peakPowerCurve", "<init>", "(Lps/o;Lps/i1;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ps.o f64817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f64818b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new g((ps.o) parcel.readParcelable(g.class.getClassLoader()), (i1) parcel.readParcelable(g.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    static {
        Parcelable.Creator<i1> creator = i1.CREATOR;
        Parcelable.Creator<ps.o> creator2 = ps.o.CREATOR;
    }

    public /* synthetic */ g(ps.o oVar, i1 i1Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : oVar, (i14 & 2) != 0 ? null : i1Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f64817a, gVar.f64817a) && s.g(this.f64818b, gVar.f64818b);
    }

    public final int hashCode() {
        ps.o oVar = this.f64817a;
        int iHashCode = (oVar == null ? 0 : oVar.hashCode()) * 31;
        i1 i1Var = this.f64818b;
        return iHashCode + (i1Var != null ? i1Var.hashCode() : 0);
    }

    public final String toString() {
        return "PowerCurveDetails(activityPowerCurve=" + this.f64817a + ", peakPowerCurve=" + this.f64818b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f64817a, i14);
        parcel.writeParcelable(this.f64818b, i14);
    }

    public g(ps.o oVar, i1 i1Var) {
        this.f64817a = oVar;
        this.f64818b = i1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
