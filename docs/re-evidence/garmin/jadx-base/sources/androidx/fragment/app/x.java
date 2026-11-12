package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<String> f7422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<String> f7423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b[] f7424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f7426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<String> f7427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList<c> f7428g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<v.n> f7429h;

    public class a implements Parcelable.Creator<x> {
        @Override // android.os.Parcelable.Creator
        public final x createFromParcel(Parcel parcel) {
            return new x(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final x[] newArray(int i14) {
            return new x[i14];
        }
    }

    public x(Parcel parcel) {
        this.f7426e = null;
        this.f7427f = new ArrayList<>();
        this.f7428g = new ArrayList<>();
        this.f7422a = parcel.createStringArrayList();
        this.f7423b = parcel.createStringArrayList();
        this.f7424c = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f7425d = parcel.readInt();
        this.f7426e = parcel.readString();
        this.f7427f = parcel.createStringArrayList();
        this.f7428g = parcel.createTypedArrayList(c.CREATOR);
        this.f7429h = parcel.createTypedArrayList(v.n.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeStringList(this.f7422a);
        parcel.writeStringList(this.f7423b);
        parcel.writeTypedArray(this.f7424c, i14);
        parcel.writeInt(this.f7425d);
        parcel.writeString(this.f7426e);
        parcel.writeStringList(this.f7427f);
        parcel.writeTypedList(this.f7428g);
        parcel.writeTypedList(this.f7429h);
    }

    public x() {
        this.f7426e = null;
        this.f7427f = new ArrayList<>();
        this.f7428g = new ArrayList<>();
    }
}
