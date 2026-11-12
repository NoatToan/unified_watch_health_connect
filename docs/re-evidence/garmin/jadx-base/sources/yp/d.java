package yp;

import am.x0;
import android.os.Parcel;
import android.os.Parcelable;
import j20.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lyp/d;", "Landroid/os/Parcelable;", "Lyp/a;", "", "activityName", "", "activityId", "activityTimeMillis", "", "metricValue", "Lam/x0;", "activityType", "", "isPersonalRecord", "<init>", "(Ljava/lang/String;JJLjava/lang/Double;Lam/x0;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d extends yp.a implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f198608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f198609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f198610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f198611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0 f198612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f198613f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), (x0) parcel.readParcelable(d.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, long j8, long j14, Double d14, x0 x0Var, boolean z14) {
        super(null);
        x0Var.getClass();
        this.f198608a = str;
        this.f198609b = j8;
        this.f198610c = j14;
        this.f198611d = d14;
        this.f198612e = x0Var;
        this.f198613f = z14;
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
        return s.g(this.f198608a, dVar.f198608a) && this.f198609b == dVar.f198609b && this.f198610c == dVar.f198610c && s.g(this.f198611d, dVar.f198611d) && this.f198612e == dVar.f198612e && this.f198613f == dVar.f198613f;
    }

    public final int hashCode() {
        String str = this.f198608a;
        int iE = q6.f.e(q6.f.e((str == null ? 0 : str.hashCode()) * 31, 31, this.f198609b), 31, this.f198610c);
        Double d14 = this.f198611d;
        return Boolean.hashCode(this.f198613f) + ((this.f198612e.hashCode() + ((iE + (d14 != null ? d14.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(this.f198609b, "ReportsListActivityItem(activityName=", this.f198608a, ", activityId=");
        x.j(this.f198610c, ", activityTimeMillis=", ", metricValue=", sbJ);
        sbJ.append(this.f198611d);
        sbJ.append(", activityType=");
        sbJ.append(this.f198612e);
        sbJ.append(", isPersonalRecord=");
        return hb.a.k(sbJ, this.f198613f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f198608a);
        parcel.writeLong(this.f198609b);
        parcel.writeLong(this.f198610c);
        Double d14 = this.f198611d;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        parcel.writeParcelable(this.f198612e, i14);
        parcel.writeInt(this.f198613f ? 1 : 0);
    }
}
