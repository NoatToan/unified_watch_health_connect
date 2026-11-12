package com.huawei.hms.kit.awareness.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.kit.awareness.status.WeatherStatus;

/* JADX INFO: loaded from: classes34.dex */
public class j extends f {
    public static final Parcelable.Creator<j> CREATOR = new Parcelable.Creator<j>() { // from class: com.huawei.hms.kit.awareness.a.a.j.1
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

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.huawei.hms.kit.awareness.b.h f13837b;

    @Override // com.huawei.hms.kit.awareness.a.a.f, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.huawei.hms.kit.awareness.a.a.f, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f13837b, i);
        parcel.writeInt(c());
    }

    public WeatherStatus a() {
        return this.f13837b;
    }

    public j(com.huawei.hms.kit.awareness.barrier.internal.b.i iVar) {
        this.f13837b = new com.huawei.hms.kit.awareness.b.h(iVar);
        a(0);
    }

    private j(Parcel parcel) {
        super(parcel);
        this.f13837b = (com.huawei.hms.kit.awareness.b.h) parcel.readParcelable(com.huawei.hms.kit.awareness.b.h.class.getClassLoader());
        a(parcel.readInt());
    }

    public j() {
        this.f13837b = null;
    }
}
