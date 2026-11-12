package g81;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lg81/a;", "Landroid/os/Parcelable;", "", "x", "", "xAxisValue", "Lg81/e0;", "earliestMarkerState", "latestMarkerState", "Lg81/d0;", "markerChangeState", "<init>", "(FLjava/lang/String;Lg81/e0;Lg81/e0;Lg81/d0;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1531a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f76259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f76261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e0 f76262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d0 f76263e;

    /* JADX INFO: renamed from: g81.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1531a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            float f14 = parcel.readFloat();
            String string = parcel.readString();
            Parcelable.Creator<e0> creator = e0.CREATOR;
            return new a(f14, string, creator.createFromParcel(parcel), creator.createFromParcel(parcel), d0.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(float f14, String str, e0 e0Var, e0 e0Var2, d0 d0Var) {
        str.getClass();
        e0Var.getClass();
        e0Var2.getClass();
        d0Var.getClass();
        this.f76259a = f14;
        this.f76260b = str;
        this.f76261c = e0Var;
        this.f76262d = e0Var2;
        this.f76263e = d0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f76259a, aVar.f76259a) == 0 && this.f76260b.equals(aVar.f76260b) && this.f76261c.equals(aVar.f76261c) && this.f76262d.equals(aVar.f76262d) && this.f76263e.equals(aVar.f76263e);
    }

    public final int hashCode() {
        return this.f76263e.hashCode() + ((this.f76262d.hashCode() + ((this.f76261c.hashCode() + wr.g.j(Float.hashCode(this.f76259a) * 31, 31, this.f76260b)) * 31)) * 31);
    }

    public final String toString() {
        return "ComparisonStaminaChartMarkerState(x=" + this.f76259a + ", xAxisValue=" + this.f76260b + ", earliestMarkerState=" + this.f76261c + ", latestMarkerState=" + this.f76262d + ", markerChangeState=" + this.f76263e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeFloat(this.f76259a);
        parcel.writeString(this.f76260b);
        this.f76261c.writeToParcel(parcel, i14);
        this.f76262d.writeToParcel(parcel, i14);
        this.f76263e.writeToParcel(parcel, i14);
    }
}
