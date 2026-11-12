package fg0;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfg0/t;", "Landroid/os/Parcelable;", "", "temp", "", "icon", "<init>", "(Ljava/lang/Double;Ljava/lang/Integer;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f71346c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f71347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f71348b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<t> {
        @Override // android.os.Parcelable.Creator
        public final t createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new t(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final t[] newArray(int i14) {
            return new t[i14];
        }
    }

    public /* synthetic */ t(Double d14, Integer num, int i14, p005kotlin.jvm.internal.j jVar) {
        this(d14, (i14 & 2) != 0 ? null : num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p005kotlin.jvm.internal.s.g(this.f71347a, tVar.f71347a) && p005kotlin.jvm.internal.s.g(this.f71348b, tVar.f71348b);
    }

    public final int hashCode() {
        Double d14 = this.f71347a;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Integer num = this.f71348b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "EventWeatherData(temp=" + this.f71347a + ", icon=" + this.f71348b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Double d14 = this.f71347a;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Integer num = this.f71348b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
    }

    public t(Double d14, Integer num) {
        this.f71347a = d14;
        this.f71348b = num;
    }
}
