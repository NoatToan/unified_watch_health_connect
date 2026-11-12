package com.xiaomi.hm.health.bt.profile.nfc;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public class ApduResponse implements Parcelable {
    public static final Parcelable.Creator<ApduResponse> CREATOR = new a();
    public byte[] data;
    public int len;

    public class a implements Parcelable.Creator<ApduResponse> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ApduResponse createFromParcel(Parcel parcel) {
            return new ApduResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ApduResponse[] newArray(int i) {
            return new ApduResponse[i];
        }
    }

    public ApduResponse(byte[] bArr, int i) {
        this.data = bArr;
        this.len = i;
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
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.data);
        parcel.writeInt(this.len);
    }

    public ApduResponse(Parcel parcel) {
        this.data = parcel.createByteArray();
        this.len = parcel.readInt();
    }
}
