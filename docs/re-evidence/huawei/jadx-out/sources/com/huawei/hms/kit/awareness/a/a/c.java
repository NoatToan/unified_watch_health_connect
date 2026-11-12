package com.huawei.hms.kit.awareness.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.kit.awareness.status.BeaconStatus;

/* JADX INFO: loaded from: classes34.dex */
public class c extends f {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() { // from class: com.huawei.hms.kit.awareness.a.a.c.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i) {
            return new c[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.huawei.hms.kit.awareness.b.d f13830b;

    @Override // com.huawei.hms.kit.awareness.a.a.f, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.huawei.hms.kit.awareness.a.a.f, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f13830b, i);
        parcel.writeInt(c());
    }

    public BeaconStatus a() {
        return this.f13830b;
    }

    public c(com.huawei.hms.kit.awareness.b.d dVar) {
        this.f13830b = dVar;
    }

    private c(Parcel parcel) {
        super(parcel);
        this.f13830b = (com.huawei.hms.kit.awareness.b.d) parcel.readParcelable(com.huawei.hms.kit.awareness.b.d.class.getClassLoader());
        a(parcel.readInt());
    }
}
