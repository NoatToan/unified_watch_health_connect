package fg0;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfg0/v;", "Landroid/os/Parcelable;", "", "completionTargetDurationType", "", "completionTargetMaxValue", "completionTargetMinValue", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f71360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f71361c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<v> {
        @Override // android.os.Parcelable.Creator
        public final v createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new v(parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final v[] newArray(int i14) {
            return new v[i14];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ v(String str, Double d14, Double d15, int i14, p005kotlin.jvm.internal.j jVar) {
        Double dValueOf = Double.valueOf(0.0d);
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? dValueOf : d14, (i14 & 4) != 0 ? dValueOf : d15);
    }

    public final boolean b(double d14) {
        Double d15;
        Double d16 = this.f71361c;
        if (d16 != null && (d15 = this.f71360b) != null) {
            double dDoubleValue = d16.doubleValue();
            if (d14 <= d15.doubleValue() && dDoubleValue <= d14) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return p005kotlin.jvm.internal.s.g(this.f71359a, vVar.f71359a) && p005kotlin.jvm.internal.s.g(this.f71360b, vVar.f71360b) && p005kotlin.jvm.internal.s.g(this.f71361c, vVar.f71361c);
    }

    public final int hashCode() {
        String str = this.f71359a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d14 = this.f71360b;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f71361c;
        return iHashCode2 + (d15 != null ? d15.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FilterCompletionTargetDTO(completionTargetDurationType=");
        sb3.append(this.f71359a);
        sb3.append(", completionTargetMaxValue=");
        sb3.append(this.f71360b);
        sb3.append(", completionTargetMinValue=");
        return b71.i.g(sb3, this.f71361c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f71359a);
        Double d14 = this.f71360b;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.f71361c;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
    }

    public v(String str, Double d14, Double d15) {
        this.f71359a = str;
        this.f71360b = d14;
        this.f71361c = d15;
    }

    public v() {
        this(null, null, null, 7, null);
    }
}
