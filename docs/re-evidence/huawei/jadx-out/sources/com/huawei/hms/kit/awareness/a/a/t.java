package com.huawei.hms.kit.awareness.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.kit.awareness.status.WifiStatus;

/* JADX INFO: loaded from: classes34.dex */
public class t extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.huawei.hms.kit.awareness.b.p f13853b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.huawei.hms.kit.awareness.b.p f13852a = new com.huawei.hms.kit.awareness.b.p();
    public static final Parcelable.Creator<t> CREATOR = new Parcelable.Creator<t>() { // from class: com.huawei.hms.kit.awareness.a.a.t.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public t[] newArray(int i) {
            return new t[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public t createFromParcel(Parcel parcel) {
            return new t(parcel);
        }
    };

    @Override // com.huawei.hms.kit.awareness.a.a.f, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.huawei.hms.kit.awareness.a.a.f, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f13853b, i);
        parcel.writeInt(c());
    }

    public WifiStatus a() {
        return this.f13853b;
    }

    public t(com.huawei.hms.kit.awareness.b.p pVar) {
        this.f13853b = pVar;
    }

    private t(Parcel parcel) {
        super(parcel);
        com.huawei.hms.kit.awareness.b.p pVar = (com.huawei.hms.kit.awareness.b.p) parcel.readParcelable(com.huawei.hms.kit.awareness.b.p.class.getClassLoader());
        this.f13853b = pVar == null ? f13852a : pVar;
        a(parcel.readInt());
    }
}
