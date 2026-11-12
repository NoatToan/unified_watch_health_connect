package nb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.v;
import androidx.media3.common.w;
import androidx.media3.common.x;
import fa.r;
import fa.z;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import wr.g;

/* JADX INFO: loaded from: classes.dex */
public final class a implements w.b {
    public static final Parcelable.Creator<a> CREATOR = new C2414a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f125237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f125239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f125240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f125241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f125242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f125243g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f125244h;

    /* JADX INFO: renamed from: nb.a$a, reason: collision with other inner class name */
    public class C2414a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(Parcel parcel) {
        this.f125237a = parcel.readInt();
        String string = parcel.readString();
        int i14 = z.f70071a;
        this.f125238b = string;
        this.f125239c = parcel.readString();
        this.f125240d = parcel.readInt();
        this.f125241e = parcel.readInt();
        this.f125242f = parcel.readInt();
        this.f125243g = parcel.readInt();
        this.f125244h = parcel.createByteArray();
    }

    public static a b(r rVar) {
        int iG = rVar.g();
        String strN = x.n(rVar.s(rVar.g(), StandardCharsets.US_ASCII));
        String strS = rVar.s(rVar.g(), StandardCharsets.UTF_8);
        int iG2 = rVar.g();
        int iG3 = rVar.g();
        int iG4 = rVar.g();
        int iG5 = rVar.g();
        int iG6 = rVar.g();
        byte[] bArr = new byte[iG6];
        rVar.e(bArr, 0, iG6);
        return new a(iG, strN, strS, iG2, iG3, iG4, iG5, bArr);
    }

    @Override // androidx.media3.common.w.b
    public final void R3(v.b bVar) {
        bVar.a(this.f125237a, this.f125244h);
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
            if (this.f125237a == aVar.f125237a && this.f125238b.equals(aVar.f125238b) && this.f125239c.equals(aVar.f125239c) && this.f125240d == aVar.f125240d && this.f125241e == aVar.f125241e && this.f125242f == aVar.f125242f && this.f125243g == aVar.f125243g && Arrays.equals(this.f125244h, aVar.f125244h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f125244h) + ((((((((g.j(g.j((527 + this.f125237a) * 31, 31, this.f125238b), 31, this.f125239c) + this.f125240d) * 31) + this.f125241e) * 31) + this.f125242f) * 31) + this.f125243g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f125238b + ", description=" + this.f125239c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f125237a);
        parcel.writeString(this.f125238b);
        parcel.writeString(this.f125239c);
        parcel.writeInt(this.f125240d);
        parcel.writeInt(this.f125241e);
        parcel.writeInt(this.f125242f);
        parcel.writeInt(this.f125243g);
        parcel.writeByteArray(this.f125244h);
    }

    public a(int i14, String str, String str2, int i15, int i16, int i17, int i18, byte[] bArr) {
        this.f125237a = i14;
        this.f125238b = str;
        this.f125239c = str2;
        this.f125240d = i15;
        this.f125241e = i16;
        this.f125242f = i17;
        this.f125243g = i18;
        this.f125244h = bArr;
    }
}
