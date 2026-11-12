package com.huawei.hms.kit.awareness.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.kit.awareness.status.AmbientLightStatus;

/* JADX INFO: loaded from: classes34.dex */
public class a implements Parcelable, AmbientLightStatus {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.huawei.hms.kit.awareness.b.a.1
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

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f13877a;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f13877a);
    }

    @Override // com.huawei.hms.kit.awareness.status.AmbientLightStatus
    public float getLightIntensity() {
        return this.f13877a;
    }

    private a(Parcel parcel) {
        this.f13877a = parcel.readFloat();
    }

    public a(float f) {
        this.f13877a = f;
    }
}
