package wb2;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 extends w implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f183922c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f183923d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f183924e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f183925f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f183926g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f183927h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f183928i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f183929j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f183930k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f183931l = 0.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f183932m = j.ALWAYS_SHOW_PROGRESS.name();

    public class a implements Parcelable.Creator<a0> {
        @Override // android.os.Parcelable.Creator
        public final a0 createFromParcel(Parcel parcel) {
            a0 a0Var = new a0();
            a0Var.f184205a = parcel.readLong();
            a0Var.f184206b = parcel.readString();
            a0Var.f183922c = parcel.readLong();
            a0Var.f183923d = parcel.readLong();
            a0Var.f183924e = parcel.readInt();
            a0Var.f183925f = parcel.readInt();
            a0Var.f183926g = parcel.readLong();
            a0Var.f183927h = parcel.readLong();
            a0Var.f183928i = parcel.readInt();
            a0Var.f183929j = parcel.readInt();
            a0Var.f183930k = parcel.readByte() == 1;
            a0Var.f183931l = parcel.readFloat();
            a0Var.f183932m = parcel.readString();
            return a0Var;
        }

        @Override // android.os.Parcelable.Creator
        public final a0[] newArray(int i14) {
            return new a0[i14];
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
        parcel.writeLong(this.f183922c);
        parcel.writeLong(this.f183923d);
        parcel.writeInt(this.f183924e);
        parcel.writeInt(this.f183925f);
        parcel.writeLong(this.f183926g);
        parcel.writeLong(this.f183927h);
        parcel.writeInt(this.f183928i);
        parcel.writeInt(this.f183929j);
        parcel.writeByte(this.f183930k ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.f183931l);
        parcel.writeString(this.f183932m);
    }
}
