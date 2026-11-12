package com.huawei.hms.kit.awareness.barrier.internal.d;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes34.dex */
public class k extends f {
    public static final Parcelable.Creator<k> CREATOR = new Parcelable.Creator<k>() { // from class: com.huawei.hms.kit.awareness.barrier.internal.d.k.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i) {
            return new k[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13999b;

    public static boolean a(int i) {
        return i == 2 || i == 0 || i == 1 || i == -1;
    }

    private boolean b(int i) {
        return i == 0 || i == 2 || i == 1 || i == 3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13998a);
        parcel.writeInt(this.f13999b);
    }

    public int hashCode() {
        return this.f13999b + this.f13998a;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.d.f
    public boolean g() {
        return a(this.f13998a) && b(this.f13999b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f13998a == kVar.f13998a && this.f13999b == kVar.f13999b;
    }

    public int b() {
        return this.f13999b;
    }

    public int a() {
        return this.f13998a;
    }

    private k(Parcel parcel) {
        this.f13998a = parcel.readInt();
        this.f13999b = parcel.readInt();
    }

    public k(int i, int i2) {
        this.f13998a = i;
        this.f13999b = i2;
    }
}
