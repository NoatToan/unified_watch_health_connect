package dk;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class a extends ak.a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1279a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f60155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f60156b;

    /* JADX INFO: renamed from: dk.a$a, reason: collision with other inner class name */
    public static class C1279a implements Parcelable.Creator<a> {
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
        if (parcel != null) {
            parcel.readInt();
            int i14 = parcel.readInt();
            this.f60155a = parcel.readInt();
            byte[] bArr = new byte[i14];
            this.f60156b = bArr;
            parcel.readByteArray(bArr);
        }
    }

    @Override // ak.a
    public final byte[] b() {
        return this.f60156b;
    }

    @Override // ak.a
    public final int d() {
        return this.f60155a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(1);
        parcel.writeInt(this.f60156b.length);
        parcel.writeInt(this.f60155a);
        parcel.writeByteArray(this.f60156b);
    }

    public a(int i14, byte[] bArr) {
        this.f60155a = i14;
        this.f60156b = bArr;
    }

    public a(ak.a aVar) {
        this(aVar.d(), aVar.b());
    }

    public a() {
        this.f60155a = 0;
        this.f60156b = new byte[]{0};
    }
}
