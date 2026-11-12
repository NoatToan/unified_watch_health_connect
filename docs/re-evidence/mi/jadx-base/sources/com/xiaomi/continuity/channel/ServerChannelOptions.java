package com.xiaomi.continuity.channel;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class ServerChannelOptions implements Parcelable {
    public static final Parcelable.Creator<ServerChannelOptions> CREATOR = new a();
    private final int mTrustLevel;

    public class a implements Parcelable.Creator<ServerChannelOptions> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ServerChannelOptions createFromParcel(Parcel parcel) {
            return new ServerChannelOptions(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ServerChannelOptions[] newArray(int i) {
            return new ServerChannelOptions[i];
        }
    }

    public ServerChannelOptions(int i) {
        this.mTrustLevel = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getTrustLevel() {
        return this.mTrustLevel;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mTrustLevel);
    }
}
