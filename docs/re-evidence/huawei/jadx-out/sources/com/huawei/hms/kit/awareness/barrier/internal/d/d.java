package com.huawei.hms.kit.awareness.barrier.internal.d;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes34.dex */
public class d extends f {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() { // from class: com.huawei.hms.kit.awareness.barrier.internal.d.d.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i) {
            return new d[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13986b;

    public static boolean a(int i) {
        return i == 1 || i == 0 || i == -1;
    }

    private boolean b(int i) {
        return i == 2 || i == 1 || i == 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13985a);
        parcel.writeInt(this.f13986b);
    }

    public int hashCode() {
        return (this.f13986b + this.f13985a) << 2;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.d.f
    public boolean g() {
        return a(this.f13985a) && b(this.f13986b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f13985a == this.f13985a && dVar.f13986b == this.f13986b;
    }

    public int b() {
        return this.f13986b;
    }

    public int a() {
        return this.f13985a;
    }

    private d(Parcel parcel) {
        this.f13985a = parcel.readInt();
        this.f13986b = parcel.readInt();
    }

    public d(int i, int i2) {
        this.f13985a = i;
        this.f13986b = i2;
    }
}
