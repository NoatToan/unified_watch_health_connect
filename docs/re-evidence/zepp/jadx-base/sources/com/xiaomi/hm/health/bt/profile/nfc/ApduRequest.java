package com.xiaomi.hm.health.bt.profile.nfc;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes18.dex */
public class ApduRequest implements Parcelable {
    public static final Parcelable.Creator<ApduRequest> CREATOR = new a();
    public byte[] a;
    public int b;
    public boolean c;
    private HMNFCCardType d = HMNFCCardType.UNKNOWN;

    public class a implements Parcelable.Creator<ApduRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ApduRequest createFromParcel(Parcel source) {
            return new ApduRequest(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ApduRequest[] newArray(int size) {
            return new ApduRequest[size];
        }
    }

    public ApduRequest(byte[] data, int dataLen, boolean encrypt) {
        this.a = data;
        this.b = dataLen;
        this.c = encrypt;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getData() {
        return this.a;
    }

    public int getDataLen() {
        return this.b;
    }

    public HMNFCCardType getType() {
        return this.d;
    }

    public boolean isEncrypt() {
        return this.c;
    }

    public void setData(byte[] data) {
        this.a = data;
    }

    public void setDataLen(int dataLen) {
        this.b = dataLen;
    }

    public void setEncrypt(boolean encrypt) {
        this.c = encrypt;
    }

    public void setType(HMNFCCardType type) {
        this.d = type;
    }

    public String toString() {
        return "ApduRequest{data=" + Arrays.toString(this.a) + ", dataLen=" + this.b + ", encrypt=" + this.c + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a);
        parcel.writeInt(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
    }

    public ApduRequest(byte[] data) {
        if (data != null) {
            this.a = data;
            this.b = data.length;
        }
        this.c = false;
    }

    public ApduRequest(Parcel in) {
        this.a = in.createByteArray();
        this.b = in.readInt();
        this.c = in.readByte() != 0;
    }
}
