package com.xiaomi.hm.health.bt.profile.nfc;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class ApduRequest implements Parcelable {
    public static final Parcelable.Creator<ApduRequest> CREATOR = new a();
    public byte[] data;
    public int dataLen;
    public boolean encrypt;
    private HMNFCCardType type = HMNFCCardType.UNKNOWN;

    public class a implements Parcelable.Creator<ApduRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ApduRequest createFromParcel(Parcel parcel) {
            return new ApduRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ApduRequest[] newArray(int i) {
            return new ApduRequest[i];
        }
    }

    public ApduRequest(byte[] bArr, int i, boolean z) {
        this.data = bArr;
        this.dataLen = i;
        this.encrypt = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getData() {
        return this.data;
    }

    public int getDataLen() {
        return this.dataLen;
    }

    public HMNFCCardType getType() {
        return this.type;
    }

    public boolean isEncrypt() {
        return this.encrypt;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public void setDataLen(int i) {
        this.dataLen = i;
    }

    public void setEncrypt(boolean z) {
        this.encrypt = z;
    }

    public void setType(HMNFCCardType hMNFCCardType) {
        this.type = hMNFCCardType;
    }

    public String toString() {
        return "ApduRequest{data=" + Arrays.toString(this.data) + ", dataLen=" + this.dataLen + ", encrypt=" + this.encrypt + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.data);
        parcel.writeInt(this.dataLen);
        parcel.writeByte(this.encrypt ? (byte) 1 : (byte) 0);
    }

    public ApduRequest(byte[] bArr) {
        if (bArr != null) {
            this.data = bArr;
            this.dataLen = bArr.length;
        }
        this.encrypt = false;
    }

    public ApduRequest(Parcel parcel) {
        this.data = parcel.createByteArray();
        this.dataLen = parcel.readInt();
        this.encrypt = parcel.readByte() != 0;
    }
}
