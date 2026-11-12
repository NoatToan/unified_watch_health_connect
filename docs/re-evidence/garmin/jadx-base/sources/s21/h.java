package s21;

import android.os.Parcel;
import android.os.Parcelable;
import lc.u0;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ls21/h;", "Landroid/os/Parcelable;", "", "proteinGrams", "", "proteinPercentage", "fatGrams", "fatPercentage", "carbsGrams", "carbsPercentage", "<init>", "(DIDIDI)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f156119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f156120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f156121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f156122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f156123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f156124f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new h(parcel.readDouble(), parcel.readInt(), parcel.readDouble(), parcel.readInt(), parcel.readDouble(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    public h(double d14, int i14, double d15, int i15, double d16, int i16) {
        this.f156119a = d14;
        this.f156120b = i14;
        this.f156121c = d15;
        this.f156122d = i15;
        this.f156123e = d16;
        this.f156124f = i16;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Double.compare(this.f156119a, hVar.f156119a) == 0 && this.f156120b == hVar.f156120b && Double.compare(this.f156121c, hVar.f156121c) == 0 && this.f156122d == hVar.f156122d && Double.compare(this.f156123e, hVar.f156123e) == 0 && this.f156124f == hVar.f156124f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f156124f) + org.apache.commons.lang3.e.b(q2.d(this.f156122d, org.apache.commons.lang3.e.b(q2.d(this.f156120b, Double.hashCode(this.f156119a) * 31, 31), 31, this.f156121c), 31), 31, this.f156123e);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MacronutrientsGoalsResult(proteinGrams=");
        sb3.append(this.f156119a);
        sb3.append(", proteinPercentage=");
        sb3.append(this.f156120b);
        am.j.x(sb3, ", fatGrams=", this.f156121c, ", fatPercentage=");
        sb3.append(this.f156122d);
        sb3.append(", carbsGrams=");
        sb3.append(this.f156123e);
        return u0.k(sb3, ", carbsPercentage=", this.f156124f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeDouble(this.f156119a);
        parcel.writeInt(this.f156120b);
        parcel.writeDouble(this.f156121c);
        parcel.writeInt(this.f156122d);
        parcel.writeDouble(this.f156123e);
        parcel.writeInt(this.f156124f);
    }
}
