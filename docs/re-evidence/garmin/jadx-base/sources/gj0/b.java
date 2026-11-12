package gj0;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lgj0/b;", "Landroid/os/Parcelable;", "Lyi0/c;", "ftpSport", "", "powerToWeightRatio", "functionalThresholdPower", "weightInKilograms", "<init>", "(Lyi0/c;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-functional-threshold-power_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yi0.c f77488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f77489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f77490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f77491d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(yi0.c.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(yi0.c cVar, Double d14, Double d15, Double d16, int i14, j jVar) {
        this(cVar, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : d15, (i14 & 8) != 0 ? null : d16);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f77488a == bVar.f77488a && s.g(this.f77489b, bVar.f77489b) && s.g(this.f77490c, bVar.f77490c) && s.g(this.f77491d, bVar.f77491d);
    }

    public final int hashCode() {
        int iHashCode = this.f77488a.hashCode() * 31;
        Double d14 = this.f77489b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f77490c;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.f77491d;
        return iHashCode3 + (d16 != null ? d16.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FtpHelpState(ftpSport=");
        sb3.append(this.f77488a);
        sb3.append(", powerToWeightRatio=");
        sb3.append(this.f77489b);
        sb3.append(", functionalThresholdPower=");
        return sn.a.f(this.f77490c, this.f77491d, ", weightInKilograms=", ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.f77488a.writeToParcel(parcel, i14);
        Double d14 = this.f77489b;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.f77490c;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.f77491d;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
    }

    public b(yi0.c cVar, Double d14, Double d15, Double d16) {
        cVar.getClass();
        this.f77488a = cVar;
        this.f77489b = d14;
        this.f77490c = d15;
        this.f77491d = d16;
    }
}
