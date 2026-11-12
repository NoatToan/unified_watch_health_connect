package com.huawei.hms.kit.awareness.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.kit.awareness.status.AmbientLightStatus;

/* JADX INFO: loaded from: classes34.dex */
public class a extends f {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.huawei.hms.kit.awareness.a.a.a.1
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

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.huawei.hms.kit.awareness.b.a f13820c;

    @Override // com.huawei.hms.kit.awareness.a.a.f, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.huawei.hms.kit.awareness.a.a.f, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f13820c, i);
        parcel.writeInt(c());
    }

    public AmbientLightStatus a() {
        return this.f13820c;
    }

    private a(Parcel parcel) {
        super(parcel);
        this.f13820c = (com.huawei.hms.kit.awareness.b.a) parcel.readParcelable(com.huawei.hms.kit.awareness.b.a.class.getClassLoader());
        a(parcel.readInt());
    }

    public a(float f) {
        this.f13820c = new com.huawei.hms.kit.awareness.b.a(f);
    }
}
