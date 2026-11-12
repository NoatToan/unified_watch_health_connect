package ja2;

import android.os.Parcel;
import android.os.Parcelable;
import bs2.bk;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes7.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1876a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f98074a;

    /* JADX INFO: renamed from: ja2.a$a, reason: collision with other inner class name */
    public class C1876a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            byte[] bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
            return new a(bArr);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f98074a = byteArrayOutputStream;
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        byte[] byteArray = this.f98074a.toByteArray();
        parcel.writeInt(byteArray.length);
        parcel.writeByteArray(byteArray);
    }

    public a(bk bkVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f98074a = byteArrayOutputStream;
        bkVar.q(byteArrayOutputStream, null);
    }

    public a() {
        this.f98074a = new ByteArrayOutputStream();
    }
}
