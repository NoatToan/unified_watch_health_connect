package ga;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.w;
import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import com.google.common.base.Ascii;
import com.google.common.base.Joiner;
import com.google.common.primitives.Ints;
import fa.r;
import fa.z;
import i3.e5;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements w.b {
    public static final Parcelable.Creator<a> CREATOR = new C1536a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f76501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f76502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f76503d;

    /* JADX INFO: renamed from: ga.a$a, reason: collision with other inner class name */
    public class C1536a implements Parcelable.Creator<a> {
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
        String string = parcel.readString();
        int i14 = z.f70071a;
        this.f76500a = string;
        byte[] bArrCreateByteArray = parcel.createByteArray();
        this.f76501b = bArrCreateByteArray;
        this.f76502c = parcel.readInt();
        int i15 = parcel.readInt();
        this.f76503d = i15;
        d(string, bArrCreateByteArray, i15);
    }

    public static void d(String str, byte[] bArr, int i14) {
        byte b14;
        str.getClass();
        boolean z14 = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i14 == 23 && bArr.length == 4) {
                    z14 = true;
                }
                fa.a.a(z14);
                break;
            case "editable.tracks.samples.location":
                if (i14 == 75 && bArr.length == 1 && ((b14 = bArr[0]) == 0 || b14 == 1)) {
                    z14 = true;
                }
                fa.a.a(z14);
                break;
            case "editable.tracks.length":
            case "editable.tracks.offset":
                if (i14 == 78 && bArr.length == 8) {
                    z14 = true;
                }
                fa.a.a(z14);
                break;
            case "editable.tracks.map":
                fa.a.a(i14 == 0);
                break;
        }
    }

    public final ArrayList b() {
        fa.a.e(this.f76500a.equals("editable.tracks.map"), "Metadata is not an editable tracks map");
        byte[] bArr = this.f76501b;
        byte b14 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int iD = 0; iD < b14; iD = e5.d(bArr[iD + 2], iD, arrayList, 1)) {
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f76500a.equals(aVar.f76500a) && Arrays.equals(this.f76501b, aVar.f76501b) && this.f76502c == aVar.f76502c && this.f76503d == aVar.f76503d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f76501b) + wr.g.j(527, 31, this.f76500a)) * 31) + this.f76502c) * 31) + this.f76503d;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0072  */
    /* JADX WARN: Code duplicated, block: B:26:0x007f A[LOOP:0: B:24:0x007c->B:26:0x007f, LOOP_END] */
    public final String toString() {
        String string;
        StringBuilder sb3;
        String str = this.f76500a;
        byte[] bArr = this.f76501b;
        int i14 = this.f76503d;
        if (i14 != 0) {
            if (i14 == 1) {
                string = z.n(bArr);
            } else if (i14 == 23) {
                string = String.valueOf(Float.intBitsToFloat(Ints.fromByteArray(bArr)));
            } else if (i14 == 67) {
                string = String.valueOf(Ints.fromByteArray(bArr));
            } else if (i14 == 75) {
                string = String.valueOf(Byte.toUnsignedInt(bArr[0]));
            } else if (i14 != 78) {
                int i15 = z.f70071a;
                sb3 = new StringBuilder(bArr.length * 2);
                for (int i16 = 0; i16 < bArr.length; i16++) {
                    sb3.append(Character.forDigit((bArr[i16] >> 4) & 15, 16));
                    sb3.append(Character.forDigit(bArr[i16] & Ascii.SI, 16));
                }
                string = sb3.toString();
            } else {
                string = String.valueOf(new r(bArr).z());
            }
        } else if (str.equals("editable.tracks.map")) {
            ArrayList arrayListB = b();
            StringBuilder sbK = e5.k("track types = ");
            Joiner.on(CoreConstants.COMMA_CHAR).appendTo(sbK, (Iterable<? extends Object>) arrayListB);
            string = sbK.toString();
        } else {
            int i17 = z.f70071a;
            sb3 = new StringBuilder(bArr.length * 2);
            while (i16 < bArr.length) {
                sb3.append(Character.forDigit((bArr[i16] >> 4) & 15, 16));
                sb3.append(Character.forDigit(bArr[i16] & Ascii.SI, 16));
            }
            string = sb3.toString();
        }
        return a0.j("mdta: key=", str, ", value=", string);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f76500a);
        parcel.writeByteArray(this.f76501b);
        parcel.writeInt(this.f76502c);
        parcel.writeInt(this.f76503d);
    }

    public a(String str, byte[] bArr, int i14) {
        this(str, bArr, 0, i14);
    }

    public a(String str, byte[] bArr, int i14, int i15) {
        d(str, bArr, i15);
        this.f76500a = str;
        this.f76501b = bArr;
        this.f76502c = i14;
        this.f76503d = i15;
    }

    public /* synthetic */ a(Parcel parcel, C1536a c1536a) {
        this(parcel);
    }
}
