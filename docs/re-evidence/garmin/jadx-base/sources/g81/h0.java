package g81;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg81/h0;", "Landroid/os/Parcelable;", "", "x", "y1", "y2", "<init>", "(FFF)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h0 implements Parcelable {
    public static final Parcelable.Creator<h0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f76334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f76335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f76336c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<h0> {
        @Override // android.os.Parcelable.Creator
        public final h0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new h0(parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final h0[] newArray(int i14) {
            return new h0[i14];
        }
    }

    public h0(float f14, float f15, float f16) {
        this.f76334a = f14;
        this.f76335b = f15;
        this.f76336c = f16;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Float.compare(this.f76334a, h0Var.f76334a) == 0 && Float.compare(this.f76335b, h0Var.f76335b) == 0 && Float.compare(this.f76336c, h0Var.f76336c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f76336c) + q6.f.d(this.f76335b, Float.hashCode(this.f76334a) * 31, 31);
    }

    public final String toString() {
        return v.e0.e(this.f76336c, ")", v.e0.i("ParcelableChartRangePoint(x=", this.f76334a, ", y1=", this.f76335b, ", y2="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeFloat(this.f76334a);
        parcel.writeFloat(this.f76335b);
        parcel.writeFloat(this.f76336c);
    }
}
