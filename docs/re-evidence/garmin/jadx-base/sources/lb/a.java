package lb;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.w;

/* JADX INFO: loaded from: classes.dex */
public final class a implements w.b {
    public static final Parcelable.Creator<a> CREATOR = new C2140a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f111703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111704b;

    /* JADX INFO: renamed from: lb.a$a, reason: collision with other inner class name */
    public class C2140a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            string.getClass();
            return new a(parcel.readInt(), string);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(int i14, String str) {
        this.f111703a = i14;
        this.f111704b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Ait(controlCode=");
        sb3.append(this.f111703a);
        sb3.append(",url=");
        return j.o(this.f111704b, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f111704b);
        parcel.writeInt(this.f111703a);
    }
}
