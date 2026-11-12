package com.huawei.hms.kit.awareness.barrier.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.kit.awareness.barrier.BarrierStatus;
import com.huawei.hms.kit.awareness.barrier.BarrierStatusMap;

/* JADX INFO: loaded from: classes34.dex */
public class b extends com.huawei.hms.kit.awareness.a.a.f {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.huawei.hms.kit.awareness.barrier.internal.b.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i) {
            return new b[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f13944b;

    @Override // com.huawei.hms.kit.awareness.a.a.f, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.huawei.hms.kit.awareness.a.a.f, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f13944b, i);
        parcel.writeInt(c());
    }

    public BarrierStatusMap b() {
        return this.f13944b;
    }

    public void a(String str, BarrierStatus barrierStatus) {
        if (barrierStatus instanceof d) {
            this.f13944b.a(str, (d) barrierStatus);
        }
    }

    public static b a() {
        return new b();
    }

    private b(Parcel parcel) {
        super(parcel);
        this.f13944b = (e) parcel.readParcelable(e.class.getClassLoader());
        a(parcel.readInt());
    }

    private b() {
        this.f13944b = e.a();
    }
}
