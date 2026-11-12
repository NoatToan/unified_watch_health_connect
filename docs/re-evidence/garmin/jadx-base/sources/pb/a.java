package pb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.v;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import fa.z;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h {
    public static final Parcelable.Creator<a> CREATOR = new C2593a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f136785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f136786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f136787e;

    /* JADX INFO: renamed from: pb.a$a, reason: collision with other inner class name */
    public class C2593a implements Parcelable.Creator<a> {
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
        super(ApicFrame.ID);
        String string = parcel.readString();
        int i14 = z.f70071a;
        this.f136784b = string;
        this.f136785c = parcel.readString();
        this.f136786d = parcel.readInt();
        this.f136787e = parcel.createByteArray();
    }

    @Override // androidx.media3.common.w.b
    public final void R3(v.b bVar) {
        bVar.a(this.f136786d, this.f136787e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f136786d == aVar.f136786d) {
                String str = aVar.f136784b;
                int i14 = z.f70071a;
                if (Objects.equals(this.f136784b, str) && Objects.equals(this.f136785c, aVar.f136785c) && Arrays.equals(this.f136787e, aVar.f136787e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i14 = (527 + this.f136786d) * 31;
        String str = this.f136784b;
        int iHashCode = (i14 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f136785c;
        return Arrays.hashCode(this.f136787e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // pb.h
    public final String toString() {
        return this.f136812a + ": mimeType=" + this.f136784b + ", description=" + this.f136785c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f136784b);
        parcel.writeString(this.f136785c);
        parcel.writeInt(this.f136786d);
        parcel.writeByteArray(this.f136787e);
    }

    public a(String str, String str2, int i14, byte[] bArr) {
        super(ApicFrame.ID);
        this.f136784b = str;
        this.f136785c = str2;
        this.f136786d = i14;
        this.f136787e = bArr;
    }
}
