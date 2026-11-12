package com.huawei.hms.kit.awareness.barrier.internal.d;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes34.dex */
final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new Parcelable.Creator<m>() { // from class: com.huawei.hms.kit.awareness.barrier.internal.d.m.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i) {
            return new m[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f14003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f14004b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14003a);
        parcel.writeString(this.f14004b);
    }

    String b() {
        return this.f14004b;
    }

    String a() {
        return this.f14003a;
    }

    m(String str, String str2) {
        this.f14003a = str;
        this.f14004b = str2;
    }

    private m(Parcel parcel) {
        this.f14003a = parcel.readString();
        this.f14004b = parcel.readString();
    }
}
