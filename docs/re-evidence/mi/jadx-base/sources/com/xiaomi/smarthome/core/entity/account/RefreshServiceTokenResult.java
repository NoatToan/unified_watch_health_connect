package com.xiaomi.smarthome.core.entity.account;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public class RefreshServiceTokenResult implements Parcelable {
    public static final Parcelable.Creator<RefreshServiceTokenResult> CREATOR = new Parcelable.Creator<RefreshServiceTokenResult>() { // from class: com.xiaomi.smarthome.core.entity.account.RefreshServiceTokenResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RefreshServiceTokenResult createFromParcel(Parcel parcel) {
            return new RefreshServiceTokenResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RefreshServiceTokenResult[] newArray(int i) {
            return new RefreshServiceTokenResult[i];
        }
    };
    public String cUserId;
    public String passToken;
    public String serviceToken;
    public String ssecurity;
    public long timeDiff;
    public String userId;

    public RefreshServiceTokenResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.userId);
        parcel.writeString(this.cUserId);
        parcel.writeString(this.passToken);
        parcel.writeString(this.serviceToken);
        parcel.writeString(this.ssecurity);
        parcel.writeLong(this.timeDiff);
    }

    public RefreshServiceTokenResult(Parcel parcel) {
        this.userId = parcel.readString();
        this.cUserId = parcel.readString();
        this.passToken = parcel.readString();
        this.serviceToken = parcel.readString();
        this.ssecurity = parcel.readString();
        this.timeDiff = parcel.readLong();
    }
}
