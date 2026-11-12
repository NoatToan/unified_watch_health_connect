package g81;

import android.os.Parcel;
import android.os.Parcelable;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lg81/f0;", "Landroid/os/Parcelable;", "", "x", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "", "colorId", "<init>", "(FFI)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f0 implements Parcelable {
    public static final Parcelable.Creator<f0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f76322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f76323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f76324c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f0> {
        @Override // android.os.Parcelable.Creator
        public final f0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f0(parcel.readFloat(), parcel.readFloat(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final f0[] newArray(int i14) {
            return new f0[i14];
        }
    }

    public f0(float f14, float f15, int i14) {
        this.f76322a = f14;
        this.f76323b = f15;
        this.f76324c = i14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Float.compare(this.f76322a, f0Var.f76322a) == 0 && Float.compare(this.f76323b, f0Var.f76323b) == 0 && this.f76324c == f0Var.f76324c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f76324c) + q6.f.d(this.f76323b, Float.hashCode(this.f76322a) * 31, 31);
    }

    public final String toString() {
        return am.j.q(v.e0.i("ParcelableChartColorPoint(x=", this.f76322a, ", y=", this.f76323b, ", colorId="), this.f76324c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeFloat(this.f76322a);
        parcel.writeFloat(this.f76323b);
        parcel.writeInt(this.f76324c);
    }
}
