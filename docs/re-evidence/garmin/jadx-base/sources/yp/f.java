package yp;

import android.os.Parcel;
import android.os.Parcelable;
import mp.k;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lyp/f;", "Landroid/os/Parcelable;", "", "totalValue", "Lmp/k;", "totalValueMetric", "dailyAvgValue", "dailyAvgValueMetric", "weeklyAvgValue", "weeklyAvgValueMetric", "monthlyAvgValue", "monthlyAvgValueMetric", "<init>", "(Ljava/lang/Double;Lmp/k;Ljava/lang/Double;Lmp/k;Ljava/lang/Double;Lmp/k;Ljava/lang/Double;Lmp/k;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f198618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f198619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f198620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f198621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f198622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f198623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f198624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k f198625h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : k.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : k.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : k.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? k.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public /* synthetic */ f(Double d14, k kVar, Double d15, k kVar2, Double d16, k kVar3, Double d17, k kVar4, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : kVar, (i14 & 4) != 0 ? null : d15, (i14 & 8) != 0 ? null : kVar2, (i14 & 16) != 0 ? null : d16, (i14 & 32) != 0 ? null : kVar3, (i14 & 64) != 0 ? null : d17, (i14 & 128) != 0 ? null : kVar4);
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
        return s.g(this.f198618a, fVar.f198618a) && this.f198619b == fVar.f198619b && s.g(this.f198620c, fVar.f198620c) && this.f198621d == fVar.f198621d && s.g(this.f198622e, fVar.f198622e) && this.f198623f == fVar.f198623f && s.g(this.f198624g, fVar.f198624g) && this.f198625h == fVar.f198625h;
    }

    public final int hashCode() {
        Double d14 = this.f198618a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        k kVar = this.f198619b;
        int iHashCode2 = (iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
        Double d15 = this.f198620c;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        k kVar2 = this.f198621d;
        int iHashCode4 = (iHashCode3 + (kVar2 == null ? 0 : kVar2.hashCode())) * 31;
        Double d16 = this.f198622e;
        int iHashCode5 = (iHashCode4 + (d16 == null ? 0 : d16.hashCode())) * 31;
        k kVar3 = this.f198623f;
        int iHashCode6 = (iHashCode5 + (kVar3 == null ? 0 : kVar3.hashCode())) * 31;
        Double d17 = this.f198624g;
        int iHashCode7 = (iHashCode6 + (d17 == null ? 0 : d17.hashCode())) * 31;
        k kVar4 = this.f198625h;
        return iHashCode7 + (kVar4 != null ? kVar4.hashCode() : 0);
    }

    public final String toString() {
        return "ReportsTotals(totalValue=" + this.f198618a + ", totalValueMetric=" + this.f198619b + ", dailyAvgValue=" + this.f198620c + ", dailyAvgValueMetric=" + this.f198621d + ", weeklyAvgValue=" + this.f198622e + ", weeklyAvgValueMetric=" + this.f198623f + ", monthlyAvgValue=" + this.f198624g + ", monthlyAvgValueMetric=" + this.f198625h + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Double d14 = this.f198618a;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        k kVar = this.f198619b;
        if (kVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(kVar.name());
        }
        Double d15 = this.f198620c;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        k kVar2 = this.f198621d;
        if (kVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(kVar2.name());
        }
        Double d16 = this.f198622e;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        k kVar3 = this.f198623f;
        if (kVar3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(kVar3.name());
        }
        Double d17 = this.f198624g;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        k kVar4 = this.f198625h;
        if (kVar4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(kVar4.name());
        }
    }

    public f(Double d14, k kVar, Double d15, k kVar2, Double d16, k kVar3, Double d17, k kVar4) {
        this.f198618a = d14;
        this.f198619b = kVar;
        this.f198620c = d15;
        this.f198621d = kVar2;
        this.f198622e = d16;
        this.f198623f = kVar3;
        this.f198624g = d17;
        this.f198625h = kVar4;
    }

    public f() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
