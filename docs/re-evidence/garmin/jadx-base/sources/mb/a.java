package mb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.q;
import androidx.media3.common.w;
import androidx.media3.common.x;
import com.google.android.exoplayer2.util.MimeTypes;
import fa.z;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a implements w.b {
    public static final Parcelable.Creator<a> CREATOR;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final q f117700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q f117701h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f117704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f117705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f117706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f117707f;

    /* JADX INFO: renamed from: mb.a$a, reason: collision with other inner class name */
    public class C2233a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    static {
        q.b bVar = new q.b();
        bVar.f8411m = x.n(MimeTypes.APPLICATION_ID3);
        f117700g = bVar.a();
        q.b bVar2 = new q.b();
        bVar2.f8411m = x.n(MimeTypes.APPLICATION_SCTE35);
        f117701h = bVar2.a();
        CREATOR = new C2233a();
    }

    public a(Parcel parcel) {
        String string = parcel.readString();
        int i14 = z.f70071a;
        this.f117702a = string;
        this.f117703b = parcel.readString();
        this.f117704c = parcel.readLong();
        this.f117705d = parcel.readLong();
        this.f117706e = parcel.createByteArray();
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
            if (this.f117704c == aVar.f117704c && this.f117705d == aVar.f117705d) {
                String str = aVar.f117702a;
                int i14 = z.f70071a;
                if (Objects.equals(this.f117702a, str) && Objects.equals(this.f117703b, aVar.f117703b) && Arrays.equals(this.f117706e, aVar.f117706e)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.common.w.b
    public final byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.f117706e;
        }
        return null;
    }

    @Override // androidx.media3.common.w.b
    public final q getWrappedMetadataFormat() {
        String str = this.f117702a;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f117701h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f117700g;
            default:
                return null;
        }
    }

    public final int hashCode() {
        if (this.f117707f == 0) {
            String str = this.f117702a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f117703b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j8 = this.f117704c;
            int i14 = (iHashCode2 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
            long j14 = this.f117705d;
            this.f117707f = Arrays.hashCode(this.f117706e) + ((i14 + ((int) (j14 ^ (j14 >>> 32)))) * 31);
        }
        return this.f117707f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f117702a + ", id=" + this.f117705d + ", durationMs=" + this.f117704c + ", value=" + this.f117703b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f117702a);
        parcel.writeString(this.f117703b);
        parcel.writeLong(this.f117704c);
        parcel.writeLong(this.f117705d);
        parcel.writeByteArray(this.f117706e);
    }

    public a(String str, String str2, long j8, long j14, byte[] bArr) {
        this.f117702a = str;
        this.f117703b = str2;
        this.f117704c = j8;
        this.f117705d = j14;
        this.f117706e = bArr;
    }
}
