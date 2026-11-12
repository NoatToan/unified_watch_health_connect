package pl2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f138585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f138586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f138587d;

    public class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    public k(Parcel parcel) {
        this.f138584a = parcel.readString();
        this.f138585b = parcel.readString();
        this.f138586c = parcel.readInt();
        this.f138587d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f138584a);
        parcel.writeString(this.f138585b);
        parcel.writeInt(this.f138586c);
        parcel.writeInt(this.f138587d);
    }

    public k(String str, String str2, int i14, int i15) {
        this.f138584a = str;
        this.f138585b = str2;
        this.f138586c = i14;
        this.f138587d = i15;
    }
}
