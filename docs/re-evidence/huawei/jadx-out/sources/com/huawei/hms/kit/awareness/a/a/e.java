package com.huawei.hms.kit.awareness.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.kit.awareness.status.HeadsetStatus;

/* JADX INFO: loaded from: classes34.dex */
public class e extends f {
    public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>() { // from class: com.huawei.hms.kit.awareness.a.a.e.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i) {
            return new e[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.huawei.hms.kit.awareness.b.f f13832b;

    @Override // com.huawei.hms.kit.awareness.a.a.f, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.huawei.hms.kit.awareness.a.a.f, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f13832b, i);
        parcel.writeInt(c());
    }

    public HeadsetStatus a() {
        return this.f13832b;
    }

    private e(Parcel parcel) {
        super(parcel);
        this.f13832b = (com.huawei.hms.kit.awareness.b.f) parcel.readParcelable(com.huawei.hms.kit.awareness.b.f.class.getClassLoader());
        a(parcel.readInt());
    }

    public e(int i) {
        this.f13832b = new com.huawei.hms.kit.awareness.b.f(i);
    }
}
