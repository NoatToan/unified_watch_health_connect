package pb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import fa.z;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f extends h {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f136804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f136805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f136806e;

    public class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public f(Parcel parcel) {
        super(GeobFrame.ID);
        String string = parcel.readString();
        int i14 = z.f70071a;
        this.f136803b = string;
        this.f136804c = parcel.readString();
        this.f136805d = parcel.readString();
        this.f136806e = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            String str = fVar.f136803b;
            int i14 = z.f70071a;
            if (Objects.equals(this.f136803b, str) && Objects.equals(this.f136804c, fVar.f136804c) && Objects.equals(this.f136805d, fVar.f136805d) && Arrays.equals(this.f136806e, fVar.f136806e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f136803b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f136804c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f136805d;
        return Arrays.hashCode(this.f136806e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // pb.h
    public final String toString() {
        return this.f136812a + ": mimeType=" + this.f136803b + ", filename=" + this.f136804c + ", description=" + this.f136805d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f136803b);
        parcel.writeString(this.f136804c);
        parcel.writeString(this.f136805d);
        parcel.writeByteArray(this.f136806e);
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super(GeobFrame.ID);
        this.f136803b = str;
        this.f136804c = str2;
        this.f136805d = str3;
        this.f136806e = bArr;
    }
}
