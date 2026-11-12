package com.xiaomi.mi_connect_service;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public class DpsCallbackData implements Parcelable {
    public static final Parcelable.Creator<DpsCallbackData> CREATOR = new Parcelable.Creator<DpsCallbackData>() { // from class: com.xiaomi.mi_connect_service.DpsCallbackData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DpsCallbackData createFromParcel(Parcel parcel) {
            return new DpsCallbackData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DpsCallbackData[] newArray(int i) {
            return new DpsCallbackData[i];
        }
    };
    public static final int INVALID_MESSAGE = 1;
    public static final String TAG = "DpsCallbackData";
    public static final int VALID_MESSAGE = 0;
    private int mCode;
    private byte[] mMessage;
    private String mPartition;
    private String mTopicName;

    public DpsCallbackData(int i, String str, String str2, byte[] bArr) {
        this.mCode = i;
        this.mTopicName = str;
        this.mPartition = str2;
        this.mMessage = bArr;
    }

    private void readFromParcel(Parcel parcel) {
        this.mCode = parcel.readInt();
        this.mTopicName = parcel.readString();
        this.mPartition = parcel.readString();
        if (parcel.readInt() == 0) {
            byte[] bArr = new byte[parcel.readInt()];
            this.mMessage = bArr;
            parcel.readByteArray(bArr);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCode() {
        return this.mCode;
    }

    public byte[] getMessage() {
        return this.mMessage;
    }

    public String getPartition() {
        return this.mPartition;
    }

    public String getTopicName() {
        return this.mTopicName;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeInt(this.mCode);
            parcel.writeString(this.mTopicName);
            parcel.writeString(this.mPartition);
            if (this.mMessage == null) {
                parcel.writeInt(1);
                return;
            }
            parcel.writeInt(0);
            parcel.writeInt(this.mMessage.length);
            parcel.writeByteArray(this.mMessage);
        }
    }

    public DpsCallbackData(Parcel parcel) {
        readFromParcel(parcel);
    }
}
