package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Comparable<b0>, Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8172c;

    public class a implements Parcelable.Creator<b0> {
        @Override // android.os.Parcelable.Creator
        public final b0 createFromParcel(Parcel parcel) {
            return new b0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b0[] newArray(int i14) {
            return new b0[i14];
        }
    }

    static {
        fa.z.H(0);
        fa.z.H(1);
        fa.z.H(2);
    }

    public b0(Parcel parcel) {
        this.f8170a = parcel.readInt();
        this.f8171b = parcel.readInt();
        this.f8172c = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final int compareTo(b0 b0Var) {
        b0 b0Var2 = b0Var;
        int i14 = this.f8170a - b0Var2.f8170a;
        if (i14 != 0) {
            return i14;
        }
        int i15 = this.f8171b - b0Var2.f8171b;
        return i15 == 0 ? this.f8172c - b0Var2.f8172c : i15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b0.class == obj.getClass()) {
            b0 b0Var = (b0) obj;
            if (this.f8170a == b0Var.f8170a && this.f8171b == b0Var.f8171b && this.f8172c == b0Var.f8172c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f8170a * 31) + this.f8171b) * 31) + this.f8172c;
    }

    public final String toString() {
        return this.f8170a + "." + this.f8171b + "." + this.f8172c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f8170a);
        parcel.writeInt(this.f8171b);
        parcel.writeInt(this.f8172c);
    }

    public b0(int i14, int i15, int i16) {
        this.f8170a = i14;
        this.f8171b = i15;
        this.f8172c = i16;
    }

    public b0(int i14, int i15) {
        this(0, i14, i15);
    }
}
