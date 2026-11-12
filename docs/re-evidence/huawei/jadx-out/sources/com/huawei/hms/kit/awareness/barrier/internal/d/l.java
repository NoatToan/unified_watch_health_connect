package com.huawei.hms.kit.awareness.barrier.internal.d;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes34.dex */
public class l extends f {
    public static final Parcelable.Creator<l> CREATOR = new Parcelable.Creator<l>() { // from class: com.huawei.hms.kit.awareness.barrier.internal.d.l.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i) {
            return new l[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f14002c;

    public static boolean a(int i) {
        return i == 1 || i == 2 || i == 4 || i == 3 || i == -1;
    }

    private static boolean b(int i) {
        return i == 3 || i == 4 || i == 0 || i == 1 || i == 2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14000a);
        parcel.writeInt(this.f14001b);
        parcel.writeParcelable(this.f14002c, i);
    }

    public int hashCode() {
        return ((this.f14001b * 100) + this.f14000a) << 2;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.d.f
    public boolean g() {
        return a(this.f14000a) && b(this.f14001b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.f14000a == this.f14000a && lVar.f14001b == this.f14001b;
    }

    public String b() {
        return this.f14002c.b();
    }

    public String a() {
        return this.f14002c.a();
    }

    private l(Parcel parcel) {
        this.f14000a = parcel.readInt();
        this.f14001b = parcel.readInt();
        this.f14002c = (m) parcel.readParcelable(m.class.getClassLoader());
    }

    public l(int i, int i2, String str, String str2) {
        this.f14000a = i;
        this.f14001b = i2;
        this.f14002c = new m(str, str2);
    }
}
