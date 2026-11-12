package to;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f165762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f165763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f165764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f165765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f165766e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f165767f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f165768g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f165769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f165770i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f165771j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f165772k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f165773l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f165774m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f165775n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f165776o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f165777p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f165778q;

    public class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public d(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.f165762a = parcel.readInt();
        this.f165763b = parcel.readInt();
        this.f165764c = parcel.readString();
        this.f165765d = parcel.readInt();
        this.f165766e = parcel.readString();
        this.f165767f = parcel.readString();
        this.f165768g = parcel.readLong();
        this.f165769h = parcel.readInt();
        this.f165770i = parcel.readInt() == 1;
        this.f165771j = parcel.readInt() == 1;
        this.f165772k = parcel.readLong();
        this.f165773l = parcel.readLong();
        this.f165774m = parcel.readInt() == 1;
        ArrayList arrayList = new ArrayList();
        this.f165775n = arrayList;
        parcel.readList(arrayList, classLoader);
        ArrayList arrayList2 = new ArrayList();
        this.f165776o = arrayList2;
        parcel.readList(arrayList2, classLoader);
        this.f165777p = parcel.readInt();
        this.f165778q = parcel.readInt() == 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f165762a);
        parcel.writeInt(this.f165763b);
        parcel.writeString(this.f165764c);
        parcel.writeInt(this.f165765d);
        parcel.writeString(this.f165766e);
        parcel.writeString(this.f165767f);
        parcel.writeLong(this.f165768g);
        parcel.writeInt(this.f165769h);
        parcel.writeInt(this.f165770i ? 1 : 0);
        parcel.writeInt(this.f165771j ? 1 : 0);
        parcel.writeLong(this.f165772k);
        parcel.writeLong(this.f165773l);
        parcel.writeInt(this.f165774m ? 1 : 0);
        parcel.writeList(this.f165775n);
        parcel.writeList(this.f165776o);
        parcel.writeInt(this.f165777p);
        parcel.writeInt(this.f165778q ? 1 : 0);
    }

    public d() {
    }
}
