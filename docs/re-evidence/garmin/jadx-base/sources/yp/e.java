package yp;

import android.os.Parcel;
import android.os.Parcelable;
import com.roomorama.caldroid.CaldroidFragment;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lyp/e;", "Landroid/os/Parcelable;", "Lyp/a;", "", CaldroidFragment.MONTH, CaldroidFragment.YEAR, "", "metricValue", "", "activityTimeMillis", "<init>", "(IILjava/lang/Double;J)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e extends yp.a implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f198614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f198615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f198616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f198617d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new e(parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public e(int i14, int i15, Double d14, long j8) {
        super(null);
        this.f198614a = i14;
        this.f198615b = i15;
        this.f198616c = d14;
        this.f198617d = j8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f198614a == eVar.f198614a && this.f198615b == eVar.f198615b && s.g(this.f198616c, eVar.f198616c) && this.f198617d == eVar.f198617d;
    }

    public final int hashCode() {
        int iD = q2.d(this.f198615b, Integer.hashCode(this.f198614a) * 31, 31);
        Double d14 = this.f198616c;
        return Long.hashCode(this.f198617d) + ((iD + (d14 == null ? 0 : d14.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbJ = e5.j(this.f198614a, this.f198615b, "ReportsListMonthItem(month=", ", year=", ", metricValue=");
        sbJ.append(this.f198616c);
        sbJ.append(", activityTimeMillis=");
        sbJ.append(this.f198617d);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f198614a);
        parcel.writeInt(this.f198615b);
        Double d14 = this.f198616c;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        parcel.writeLong(this.f198617d);
    }
}
