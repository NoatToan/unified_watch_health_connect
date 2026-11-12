package im;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lim/d0;", "Landroid/os/Parcelable;", "", "trainingEffect", "", "trainingEffectMessage", "<init>", "(DLjava/lang/String;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d0 implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f94139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f94138c = new a(null);
    public static final Parcelable.Creator<d0> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<d0> {
        @Override // android.os.Parcelable.Creator
        public final d0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d0(parcel.readDouble(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final d0[] newArray(int i14) {
            return new d0[i14];
        }
    }

    public /* synthetic */ d0(double d14, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? Double.NaN : d14, (i14 & 2) != 0 ? null : str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Double.compare(this.f94139a, d0Var.f94139a) == 0 && p005kotlin.jvm.internal.s.g(this.f94140b, d0Var.f94140b);
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.f94139a) * 31;
        String str = this.f94140b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "TrainingEffectChartData(trainingEffect=" + this.f94139a + ", trainingEffectMessage=" + this.f94140b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeDouble(this.f94139a);
        parcel.writeString(this.f94140b);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lim/d0$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public d0(double d14, String str) {
        this.f94139a = d14;
        this.f94140b = str;
    }

    public d0() {
        this(0.0d, null, 3, null);
    }
}
