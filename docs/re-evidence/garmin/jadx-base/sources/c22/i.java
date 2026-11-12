package c22;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@d23.a
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lc22/i;", "Lc22/c3;", "strRes", "", "gcm-common-strings_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements c3 {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23085a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            return i.b(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    private /* synthetic */ i(int i14) {
        this.f23085a = i14;
    }

    public static final /* synthetic */ i b(int i14) {
        return new i(i14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f23085a == ((i) obj).f23085a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23085a);
    }

    public final String toString() {
        return v.e0.f(this.f23085a, "AndroidStringHandle(strRes=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f23085a);
    }
}
