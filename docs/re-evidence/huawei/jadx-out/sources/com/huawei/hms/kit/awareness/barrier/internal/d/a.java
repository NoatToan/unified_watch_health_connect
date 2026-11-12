package com.huawei.hms.kit.awareness.barrier.internal.d;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes34.dex */
public class a extends f {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.huawei.hms.kit.awareness.barrier.internal.d.a.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i) {
            return new a[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }
    };
    private static final float d = 0.1f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f13977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f13978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f13979c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f13977a);
        parcel.writeFloat(this.f13978b);
        parcel.writeInt(this.f13979c);
    }

    public int hashCode() {
        return Math.round(this.f13977a + this.f13978b);
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.d.f
    public boolean g() {
        float f = this.f13977a;
        return 0.0d <= ((double) f) && f < this.f13978b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return Math.abs(aVar.f13977a - this.f13977a) < 0.1f && Math.abs(aVar.f13978b - this.f13978b) < 0.1f;
    }

    public int c() {
        return this.f13979c;
    }

    public float b() {
        return this.f13978b;
    }

    public float a() {
        return this.f13977a;
    }

    private a(Parcel parcel) {
        this.f13977a = parcel.readFloat();
        this.f13978b = parcel.readFloat();
        this.f13979c = parcel.readInt();
    }

    public a(float f, float f2, int i) {
        this.f13977a = f;
        this.f13978b = f2;
        this.f13979c = i;
    }
}
