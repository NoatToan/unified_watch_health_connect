package ja2;

import android.os.Parcel;
import android.os.Parcelable;
import bs2.fk;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes7.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f98075a;

    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            byte[] bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
            return new b(bArr);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f98075a = byteArrayOutputStream;
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        ByteArrayOutputStream byteArrayOutputStream = this.f98075a;
        parcel.writeInt(byteArrayOutputStream.toByteArray().length);
        parcel.writeByteArray(byteArrayOutputStream.toByteArray());
    }

    public b(fk fkVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f98075a = byteArrayOutputStream;
        fkVar.b(byteArrayOutputStream);
    }
}
