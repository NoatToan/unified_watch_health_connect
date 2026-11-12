package com.huawei.hms.kit.awareness.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.kit.awareness.status.WifiStatus;

/* JADX INFO: loaded from: classes34.dex */
public class p implements Parcelable, WifiStatus {
    public static final Parcelable.Creator<p> CREATOR = new Parcelable.Creator<p>() { // from class: com.huawei.hms.kit.awareness.b.p.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p[] newArray(int i) {
            return new p[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f13918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f13919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f13920c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13918a);
        parcel.writeString(this.f13919b);
        parcel.writeString(this.f13920c);
    }

    @Override // com.huawei.hms.kit.awareness.status.WifiStatus
    public int getStatus() {
        return this.f13918a;
    }

    @Override // com.huawei.hms.kit.awareness.status.WifiStatus
    public String getSsid() {
        return this.f13920c;
    }

    @Override // com.huawei.hms.kit.awareness.status.WifiStatus
    public String getBssid() {
        return this.f13919b;
    }

    private p(Parcel parcel) {
        this.f13918a = parcel.readInt();
        this.f13919b = parcel.readString();
        this.f13920c = parcel.readString();
    }

    public p(int i, String str, String str2) {
        this.f13918a = i;
        this.f13919b = str;
        this.f13920c = str2;
    }

    public p() {
        this.f13918a = -1;
    }
}
