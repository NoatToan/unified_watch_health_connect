package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import com.google.common.primitives.Longs;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b[] f8574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8575b;

    public class a implements Parcelable.Creator<w> {
        @Override // android.os.Parcelable.Creator
        public final w createFromParcel(Parcel parcel) {
            return new w(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final w[] newArray(int i14) {
            return new w[i14];
        }
    }

    public interface b extends Parcelable {
        default void R3(v.b bVar) {
        }

        default byte[] getWrappedMetadataBytes() {
            return null;
        }

        default q getWrappedMetadataFormat() {
            return null;
        }
    }

    public w(Parcel parcel) {
        this.f8574a = new b[parcel.readInt()];
        int i14 = 0;
        while (true) {
            b[] bVarArr = this.f8574a;
            if (i14 >= bVarArr.length) {
                this.f8575b = parcel.readLong();
                return;
            } else {
                bVarArr[i14] = (b) parcel.readParcelable(b.class.getClassLoader());
                i14++;
            }
        }
    }

    public final w b(b... bVarArr) {
        if (bVarArr.length == 0) {
            return this;
        }
        int i14 = fa.z.f70071a;
        b[] bVarArr2 = this.f8574a;
        Object[] objArrCopyOf = Arrays.copyOf(bVarArr2, bVarArr2.length + bVarArr.length);
        System.arraycopy(bVarArr, 0, objArrCopyOf, bVarArr2.length, bVarArr.length);
        return new w(this.f8575b, (b[]) objArrCopyOf);
    }

    public final w d(w wVar) {
        return wVar == null ? this : b(wVar.f8574a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (Arrays.equals(this.f8574a, wVar.f8574a) && this.f8575b == wVar.f8575b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Longs.hashCode(this.f8575b) + (Arrays.hashCode(this.f8574a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder("entries=");
        sb3.append(Arrays.toString(this.f8574a));
        long j8 = this.f8575b;
        if (j8 == C.TIME_UNSET) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j8;
        }
        sb3.append(str);
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        b[] bVarArr = this.f8574a;
        parcel.writeInt(bVarArr.length);
        for (b bVar : bVarArr) {
            parcel.writeParcelable(bVar, 0);
        }
        parcel.writeLong(this.f8575b);
    }

    public w(long j8, b... bVarArr) {
        this.f8575b = j8;
        this.f8574a = bVarArr;
    }

    public w(List<? extends b> list) {
        this((b[]) list.toArray(new b[0]));
    }

    public w(long j8, List<? extends b> list) {
        this(j8, (b[]) list.toArray(new b[0]));
    }

    public w(b... bVarArr) {
        this(C.TIME_UNSET, bVarArr);
    }
}
