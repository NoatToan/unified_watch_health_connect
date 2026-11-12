package wb2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public class x extends w implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f184207c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f184208d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f184209e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f184210f = null;

    public class a implements Parcelable.Creator<x> {
        @Override // android.os.Parcelable.Creator
        public final x createFromParcel(Parcel parcel) {
            x xVar = new x();
            xVar.f184205a = parcel.readLong();
            xVar.f184206b = parcel.readString();
            xVar.f184207c = parcel.readByte() == 1;
            xVar.f184208d = parcel.readLong();
            try {
                xVar.f184209e = h.valueOf(parcel.readString());
            } catch (Exception unused) {
                xVar.f184209e = null;
            }
            xVar.f184210f = parcel.readString();
            parcel.readString();
            return xVar;
        }

        @Override // android.os.Parcelable.Creator
        public final x[] newArray(int i14) {
            return new x[i14];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeLong(this.f184205a);
        parcel.writeString(this.f184206b);
        parcel.writeByte(this.f184207c ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f184208d);
        h hVar = this.f184209e;
        parcel.writeString(hVar != null ? hVar.name() : null);
        parcel.writeString(this.f184210f);
        h hVar2 = this.f184209e;
        parcel.writeInt(hVar2 != null ? hVar2.f184019b : -1);
    }
}
