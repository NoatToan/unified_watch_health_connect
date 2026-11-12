package t00;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes7.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("count")
    private int f161654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("badge-id")
    private int f161655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("badge-uuid")
    private String f161656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("badge-name")
    private String f161657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("level")
    private int f161658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("notification-title")
    private String f161659f;

    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(Parcel parcel) {
        this.f161654a = parcel.readInt();
        this.f161655b = parcel.readInt();
        this.f161657d = parcel.readString();
        this.f161658e = parcel.readInt();
        this.f161659f = parcel.readString();
    }

    public final int b() {
        return this.f161654a;
    }

    public final int d() {
        return this.f161655b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String f() {
        return this.f161657d;
    }

    public final String g() {
        return this.f161659f;
    }

    public final String h() {
        return this.f161656c;
    }

    public final int i() {
        return this.f161658e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f161654a);
        parcel.writeInt(this.f161655b);
        parcel.writeString(this.f161657d);
        parcel.writeInt(this.f161658e);
        parcel.writeString(this.f161659f);
    }

    public b() {
    }
}
