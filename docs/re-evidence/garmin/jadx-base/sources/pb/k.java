package pb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import fa.z;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k extends h {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f136817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f136818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f136819d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f136820e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f136821f;

    public class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    public k(Parcel parcel) {
        super(MlltFrame.ID);
        this.f136817b = parcel.readInt();
        this.f136818c = parcel.readInt();
        this.f136819d = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i14 = z.f70071a;
        this.f136820e = iArrCreateIntArray;
        this.f136821f = parcel.createIntArray();
    }

    @Override // pb.h, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f136817b == kVar.f136817b && this.f136818c == kVar.f136818c && this.f136819d == kVar.f136819d && Arrays.equals(this.f136820e, kVar.f136820e) && Arrays.equals(this.f136821f, kVar.f136821f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f136821f) + ((Arrays.hashCode(this.f136820e) + ((((((527 + this.f136817b) * 31) + this.f136818c) * 31) + this.f136819d) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f136817b);
        parcel.writeInt(this.f136818c);
        parcel.writeInt(this.f136819d);
        parcel.writeIntArray(this.f136820e);
        parcel.writeIntArray(this.f136821f);
    }

    public k(int i14, int i15, int i16, int[] iArr, int[] iArr2) {
        super(MlltFrame.ID);
        this.f136817b = i14;
        this.f136818c = i15;
        this.f136819d = i16;
        this.f136820e = iArr;
        this.f136821f = iArr2;
    }
}
