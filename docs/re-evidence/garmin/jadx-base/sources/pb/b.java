package pb;

import android.os.Parcel;
import android.os.Parcelable;
import fa.z;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f136788b;

    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Parcel parcel) {
        String string = parcel.readString();
        int i14 = z.f70071a;
        super(string);
        this.f136788b = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f136812a.equals(bVar.f136812a) && Arrays.equals(this.f136788b, bVar.f136788b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f136788b) + wr.g.j(527, 31, this.f136812a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f136812a);
        parcel.writeByteArray(this.f136788b);
    }

    public b(String str, byte[] bArr) {
        super(str);
        this.f136788b = bArr;
    }
}
