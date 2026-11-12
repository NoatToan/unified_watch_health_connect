package g81;

import android.os.Parcel;
import android.os.Parcelable;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg81/g0;", "Landroid/os/Parcelable;", "", "x", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "<init>", "(FF)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g0 implements Parcelable {
    public static final Parcelable.Creator<g0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f76332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f76333b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g0> {
        @Override // android.os.Parcelable.Creator
        public final g0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new g0(parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final g0[] newArray(int i14) {
            return new g0[i14];
        }
    }

    public g0(float f14, float f15) {
        this.f76332a = f14;
        this.f76333b = f15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Float.compare(this.f76332a, g0Var.f76332a) == 0 && Float.compare(this.f76333b, g0Var.f76333b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f76333b) + (Float.hashCode(this.f76332a) * 31);
    }

    public final String toString() {
        return am.j.l("ParcelableChartPoint(x=", this.f76332a, ", y=", this.f76333b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeFloat(this.f76332a);
        parcel.writeFloat(this.f76333b);
    }
}
