package im;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.garmin.android.apps.connectmobile.activities.newmodel.q0;

/* JADX INFO: loaded from: classes7.dex */
public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f94141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray<q0> f94143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f94144d;

    public class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public e(Parcel parcel) {
        this.f94142b = -1;
        this.f94141a = parcel.readInt();
        this.f94142b = parcel.readInt();
        this.f94143c = parcel.readSparseArray(q0.class.getClassLoader());
        int i14 = parcel.readInt();
        if (i14 > 0) {
            int[] iArr = new int[i14];
            this.f94144d = iArr;
            parcel.readIntArray(iArr);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f94141a);
        parcel.writeInt(this.f94142b);
        parcel.writeSparseArray(this.f94143c);
        int[] iArr = this.f94144d;
        if (iArr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f94144d);
        }
    }

    public e(int i14) {
        this.f94141a = i14;
        this.f94142b = -1;
    }

    public e(int i14, int i15) {
        this.f94141a = i14;
        this.f94142b = i15;
    }

    public e(int i14, int i15, SparseArray<q0> sparseArray) {
        this.f94141a = i14;
        this.f94142b = i15;
        this.f94143c = sparseArray;
    }

    private e() {
        this.f94142b = -1;
    }
}
