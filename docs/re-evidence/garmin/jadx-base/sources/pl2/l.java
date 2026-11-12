package pl2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f138588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f138589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f138590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f138591d;

    public class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    public l(Parcel parcel) {
        this.f138588a = parcel.readInt();
        this.f138589b = parcel.readByte() == 1;
        this.f138590c = parcel.readInt();
    }

    public final void b(int i14, boolean z14) {
        this.f138588a = i14 | this.f138588a;
        this.f138589b = z14;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f138588a);
        parcel.writeByte(Boolean.valueOf(this.f138589b).equals(Boolean.TRUE) ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f138590c);
    }

    public l(int i14, boolean z14) {
        this.f138588a = i14 | this.f138588a;
        this.f138589b = z14;
    }

    public l() {
        this.f138588a = 0;
        this.f138589b = false;
        this.f138590c = -1;
        this.f138591d = -1;
    }
}
