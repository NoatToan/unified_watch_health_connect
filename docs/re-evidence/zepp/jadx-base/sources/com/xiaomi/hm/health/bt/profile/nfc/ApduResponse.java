package com.xiaomi.hm.health.bt.profile.nfc;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes18.dex */
public class ApduResponse implements Parcelable {
    public static final Parcelable.Creator<ApduResponse> CREATOR = new a();
    public byte[] data;
    public int len;

    public class a implements Parcelable.Creator<ApduResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ApduResponse createFromParcel(Parcel source) {
            return new ApduResponse(source);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ApduResponse[] newArray(int size) {
            return new ApduResponse[size];
        }
    }

    public ApduResponse(byte[] data, int len) {
        this.data = data;
        this.len = len;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getData() {
        return this.data;
    }

    public int getLen() {
        return this.len;
    }

    public boolean isValid() {
        byte[] bArr = this.data;
        return bArr != null && bArr.length > 0 && this.len > 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByteArray(this.data);
        dest.writeInt(this.len);
    }

    public ApduResponse(Parcel in) {
        this.data = in.createByteArray();
        this.len = in.readInt();
    }
}
