package com.xiaomi.smarthome.core.entity.net;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public class NetResult implements Parcelable {
    public static final Parcelable.Creator<NetResult> CREATOR = new Parcelable.Creator<NetResult>() { // from class: com.xiaomi.smarthome.core.entity.net.NetResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NetResult createFromParcel(Parcel parcel) {
            return new NetResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public NetResult[] newArray(int i) {
            return new NetResult[i];
        }
    };
    public int mCode;
    public boolean mIsCache;
    public String mResponse;

    public NetResult() {
        this.mIsCache = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.format("net Result: isCache = %s,code = %d, response = %s", String.valueOf(this.mIsCache), Integer.valueOf(this.mCode), this.mResponse);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mCode);
        parcel.writeByte(this.mIsCache ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mResponse);
    }

    public NetResult(Parcel parcel) {
        this.mIsCache = false;
        this.mCode = parcel.readInt();
        this.mIsCache = parcel.readByte() != 0;
        this.mResponse = parcel.readString();
    }
}
