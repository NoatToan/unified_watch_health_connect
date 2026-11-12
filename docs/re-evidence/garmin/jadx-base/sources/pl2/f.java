package pl2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f138577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f138578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte f138579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f138580d;

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
        this.f138577a = parcel.readByte();
        this.f138578b = parcel.readByte();
        byte[] bArr = new byte[parcel.readInt()];
        this.f138580d = bArr;
        parcel.readByteArray(bArr);
        this.f138579c = parcel.readByte();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeByte(this.f138577a);
        parcel.writeByte(this.f138578b);
        byte[] bArr = this.f138580d;
        parcel.writeInt(bArr.length);
        parcel.writeByteArray(bArr);
        parcel.writeByte(this.f138579c);
    }

    public f(byte[] bArr) {
        this.f138577a = bArr[0];
        this.f138578b = bArr[1];
        this.f138579c = bArr[6];
        this.f138580d = bArr;
    }
}
