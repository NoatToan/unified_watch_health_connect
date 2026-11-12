package com.huawei.hms.kit.awareness.barrier.internal.d;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes34.dex */
public class j extends f {
    public static final Parcelable.Creator<j> CREATOR = new Parcelable.Creator<j>() { // from class: com.huawei.hms.kit.awareness.barrier.internal.d.j.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j[] newArray(int i) {
            return new j[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f13997c;

    public static boolean a(int i) {
        return i == 1 || i == 0 || i == -1;
    }

    private static boolean b(int i) {
        return i == 0 || i == 1 || i == 2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13995a);
        parcel.writeInt(this.f13996b);
        parcel.writeString(this.f13997c);
    }

    public int hashCode() {
        return (this.f13996b + this.f13995a) << 2;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.d.f
    public boolean g() {
        return a(this.f13995a) && b(this.f13996b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jVar.f13995a == this.f13995a && jVar.f13996b == this.f13996b && jVar.f13997c.equals(this.f13997c);
    }

    public String c() {
        return this.f13997c;
    }

    public int b() {
        return this.f13996b;
    }

    public int a() {
        return this.f13995a;
    }

    private j(Parcel parcel) {
        this.f13995a = parcel.readInt();
        this.f13996b = parcel.readInt();
        this.f13997c = parcel.readString();
    }

    public j(int i, int i2, String str) {
        this.f13995a = i;
        this.f13996b = i2;
        this.f13997c = str;
    }
}
