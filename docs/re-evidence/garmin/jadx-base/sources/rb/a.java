package rb;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import fa.r;
import fa.z;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C2851a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f151498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f151499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f151500c;

    /* JADX INFO: renamed from: rb.a$a, reason: collision with other inner class name */
    public class C2851a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    private a(Parcel parcel) {
        this.f151498a = parcel.readLong();
        this.f151499b = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i14 = z.f70071a;
        this.f151500c = bArrCreateByteArray;
    }

    public static a b(r rVar, int i14, long j8) {
        long jW = rVar.w();
        int i15 = i14 - 4;
        byte[] bArr = new byte[i15];
        rVar.e(bArr, 0, i15);
        return new a(jW, bArr, j8);
    }

    @Override // rb.b
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb3.append(this.f151498a);
        sb3.append(", identifier= ");
        return j.i(this.f151499b, " }", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeLong(this.f151498a);
        parcel.writeLong(this.f151499b);
        parcel.writeByteArray(this.f151500c);
    }

    private a(long j8, byte[] bArr, long j14) {
        this.f151498a = j14;
        this.f151499b = j8;
        this.f151500c = bArr;
    }

    public /* synthetic */ a(Parcel parcel, C2851a c2851a) {
        this(parcel);
    }
}
