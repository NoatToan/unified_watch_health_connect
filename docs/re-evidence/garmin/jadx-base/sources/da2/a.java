package da2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class a implements Parcelable, Cloneable {
    public static final Parcelable.Creator<a> CREATOR = new C1252a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f58870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f58871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f58872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f58873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f58874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ma2.l[] f58875f;

    /* JADX INFO: renamed from: da2.a$a, reason: collision with other inner class name */
    public class C1252a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            byte[] bArr;
            byte[] bArr2;
            String string = parcel.readString();
            byte[] bArr3 = null;
            if (parcel.readInt() == 1) {
                bArr = new byte[16];
                parcel.readByteArray(bArr);
            } else {
                bArr = null;
            }
            if (parcel.readInt() == 1) {
                bArr2 = new byte[2];
                parcel.readByteArray(bArr2);
            } else {
                bArr2 = null;
            }
            if (parcel.readInt() == 1) {
                bArr3 = new byte[8];
                parcel.readByteArray(bArr3);
            }
            return new a(string, bArr, bArr2, bArr3, parcel.readInt() != 0, (ma2.l[]) parcel.readParcelableArray(ma2.l.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    @Deprecated
    public a(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z14, ma2.l[] lVarArr) {
        this.f58870a = str;
        this.f58871b = bArr;
        this.f58872c = bArr2;
        this.f58873d = bArr3;
        this.f58874e = z14;
        if (lVarArr != null) {
            this.f58875f = (ma2.l[]) Arrays.copyOf(lVarArr, lVarArr.length);
        } else {
            this.f58875f = null;
        }
    }

    public final boolean b() {
        return (this.f58871b != null) || (this.f58872c != null) || (this.f58873d != null);
    }

    public final Object clone() {
        return new a(this.f58870a, this.f58871b, this.f58872c, this.f58873d, this.f58874e, this.f58875f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder(this.f58870a);
        sb3.append("\n   ltk ");
        String str = "[No]";
        byte[] bArr = this.f58871b;
        sb3.append((bArr == null || bArr.length <= 0) ? "[No]" : "[Yes]");
        sb3.append(", ediv");
        byte[] bArr2 = this.f58872c;
        sb3.append((bArr2 == null || bArr2.length <= 0) ? "[No]" : "[Yes]");
        sb3.append(", rand");
        byte[] bArr3 = this.f58873d;
        if (bArr3 != null && bArr3.length > 0) {
            str = "[Yes]";
        }
        sb3.append(str);
        sb3.append("\n   isPaired: ");
        sb3.append(this.f58874e);
        ma2.l[] lVarArr = this.f58875f;
        if (lVarArr != null) {
            sb3.append("\n   serviceTypes: ");
            int i14 = 0;
            while (i14 < lVarArr.length) {
                sb3.append(lVarArr[i14].name());
                i14++;
                if (i14 != lVarArr.length) {
                    sb3.append(",");
                }
            }
            if (lVarArr.length == 0) {
                sb3.append("none");
            }
        }
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f58870a);
        byte[] bArr = this.f58871b;
        parcel.writeInt(bArr == null ? 0 : 1);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        byte[] bArr2 = this.f58872c;
        parcel.writeInt(bArr2 == null ? 0 : 1);
        if (bArr2 != null) {
            parcel.writeByteArray(bArr2);
        }
        byte[] bArr3 = this.f58873d;
        parcel.writeInt(bArr3 == null ? 0 : 1);
        if (bArr3 != null) {
            parcel.writeByteArray(bArr3);
        }
        parcel.writeInt(this.f58874e ? 1 : 0);
        parcel.writeParcelableArray(this.f58875f, i14);
    }

    public a(String str) {
        this(str, null, null, null, true, null);
    }

    public a(String str, boolean z14, ma2.l[] lVarArr) {
        this(str, null, null, null, z14, lVarArr);
    }

    public a(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z14) {
        this(str, bArr, bArr2, bArr3, z14, null);
    }

    public a(String str, boolean z14) {
        this(str, null, null, null, z14, null);
    }
}
