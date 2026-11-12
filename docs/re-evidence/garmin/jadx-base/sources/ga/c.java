package ga;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.w;
import com.google.common.primitives.Floats;

/* JADX INFO: loaded from: classes.dex */
public final class c implements w.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f76509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f76510b;

    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public c(float f14, float f15) {
        fa.a.b(f14 >= -90.0f && f14 <= 90.0f && f15 >= -180.0f && f15 <= 180.0f, "Invalid latitude or longitude");
        this.f76509a = f14;
        this.f76510b = f15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f76509a == cVar.f76509a && this.f76510b == cVar.f76510b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Floats.hashCode(this.f76510b) + ((Floats.hashCode(this.f76509a) + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f76509a + ", longitude=" + this.f76510b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeFloat(this.f76509a);
        parcel.writeFloat(this.f76510b);
    }

    public /* synthetic */ c(Parcel parcel, a aVar) {
        this(parcel);
    }

    private c(Parcel parcel) {
        this.f76509a = parcel.readFloat();
        this.f76510b = parcel.readFloat();
    }
}
